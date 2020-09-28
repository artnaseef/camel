/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class RestEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":method:path:uriTemplate";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(21);
        set.add("method");
        set.add("path");
        set.add("uriTemplate");
        set.add("consumes");
        set.add("inType");
        set.add("outType");
        set.add("produces");
        set.add("routeId");
        set.add("bridgeErrorHandler");
        set.add("consumerComponentName");
        set.add("description");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("apiDoc");
        set.add("bindingMode");
        set.add("host");
        set.add("lazyStartProducer");
        set.add("producerComponentName");
        set.add("queryParameters");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "rest".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "method", null, true, copy);
        uri = buildPathParameter(syntax, uri, "path", null, true, copy);
        uri = buildPathParameter(syntax, uri, "uriTemplate", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return true;
    }
}

