/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ecs;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ECS2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":label";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(15);
        set.add("label");
        set.add("autoDiscoverClient");
        set.add("ecsClient");
        set.add("lazyStartProducer");
        set.add("operation");
        set.add("pojoRequest");
        set.add("proxyHost");
        set.add("proxyPort");
        set.add("proxyProtocol");
        set.add("region");
        set.add("trustAllCertificates");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("accessKey");
        set.add("secretKey");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-ecs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "label", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

