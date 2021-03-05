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
package org.apache.camel.oaipmh.component;

import org.apache.camel.Processor;
import org.apache.camel.oaipmh.handler.ConsumerResponseHandler;
import org.apache.camel.oaipmh.handler.Harvester;
import org.apache.camel.support.DefaultScheduledPollConsumer;

/**
 * The OAIPMH consumer.
 */
public class OAIPMHConsumer extends DefaultScheduledPollConsumer {

    private Harvester harvester;

    public OAIPMHConsumer(OAIPMHEndpoint endpoint, Processor processor) throws Exception {
        super(endpoint, processor);
    }

    @Override
    public OAIPMHEndpoint getEndpoint() {
        return (OAIPMHEndpoint) super.getEndpoint();
    }

    @Override
    protected void doInit() throws Exception {
        super.doInit();
        this.harvester = new Harvester(
                new ConsumerResponseHandler(this),
                getEndpoint().getUrl(),
                getEndpoint().getVerb(),
                getEndpoint().getMetadataPrefix(),
                getEndpoint().getUntil(),
                getEndpoint().getFrom(),
                getEndpoint().getSet(),
                getEndpoint().getIdentifier());
        if (getEndpoint().isIgnoreSSLWarnings()) {
            this.harvester.getHttpClient().setIgnoreSSLWarnings(true);
        }
    }

    @Override
    protected int poll() throws Exception {
        this.harvester.asynHarvest();
        return 0;
    }

}
