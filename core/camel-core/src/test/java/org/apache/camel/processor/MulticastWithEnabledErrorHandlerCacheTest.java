/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.support.DefaultExchange;
import org.apache.camel.util.ReflectionHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MulticastWithEnabledErrorHandlerCacheTest extends ContextTestSupport {
    protected Endpoint startEndpoint;
    protected MockEndpoint x;
    protected MockEndpoint y;
    protected MockEndpoint z;

    @Test
    public void testSendMessageToMulticastWithEnabledErrorHandlerCache() throws Exception {
        x.expectedBodiesReceived("input+output");
        y.expectedBodiesReceived("input+output");
        z.expectedBodiesReceived("input+output");

        Exchange testExchange = new DefaultExchange(context);
        testExchange.getIn().setBody("input");
        template.send("direct:a", testExchange);

        assertMockEndpointsSatisfied();

        // Grab the MulticastProcessor from the route
        List<Processor> list = this.getProcessors("test-target-processor");
        MulticastProcessor multicastProcessor = (MulticastProcessor) list.get(0);

        // Extract the errorHandlers field
        Map errorHandlerCache =
                (Map) ReflectionHelper.getField(multicastProcessor.getClass().getDeclaredField("errorHandlers"), multicastProcessor);

        // Verify there are no entries in it.
        Assertions.assertFalse(multicastProcessor.isDisableErrorHandlerCache());
        Assertions.assertEquals(3, errorHandlerCache.size());
    }

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();

        x = getMockEndpoint("mock:x");
        y = getMockEndpoint("mock:y");
        z = getMockEndpoint("mock:z");
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        final Processor processor = new AppendingProcessor();

        return new RouteBuilder() {
            public void configure() {
                // START SNIPPET: example
                from("direct:a").multicast().id("test-target-processor").disableErrorHandlerCache(false).to("direct:x", "direct:y", "direct:z");
                // END SNIPPET: example

                from("direct:x").process(processor).to("mock:x");
                from("direct:y").process(processor).to("mock:y");
                from("direct:z").process(processor).to("mock:z");
            }
        };

    }

    protected List<Processor> getProcessors(String pattern) {
        return context.getRoutes().stream()
                .flatMap(r -> r.filter(pattern).stream()).collect(Collectors.toList());
    }

}
