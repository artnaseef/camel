/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.as2;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class AS2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(52);
        set.add("apiName");
        set.add("methodName");
        set.add("as2From");
        set.add("as2MessageStructure");
        set.add("as2To");
        set.add("as2Version");
        set.add("clientFqdn");
        set.add("compressionAlgorithm");
        set.add("decryptingPrivateKey");
        set.add("dispositionNotificationTo");
        set.add("ediMessageTransferEncoding");
        set.add("ediMessageType");
        set.add("encryptingAlgorithm");
        set.add("encryptingCertificateChain");
        set.add("from");
        set.add("inBody");
        set.add("mdnMessageTemplate");
        set.add("requestUri");
        set.add("server");
        set.add("serverFqdn");
        set.add("serverPortNumber");
        set.add("signedReceiptMicAlgorithms");
        set.add("signingAlgorithm");
        set.add("signingCertificateChain");
        set.add("signingPrivateKey");
        set.add("subject");
        set.add("targetHostname");
        set.add("targetPortNumber");
        set.add("userAgent");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("as2From");
        set.add("as2MessageStructure");
        set.add("as2To");
        set.add("compressionAlgorithm");
        set.add("dispositionNotificationTo");
        set.add("ediMessage");
        set.add("ediMessageContentType");
        set.add("ediMessageTransferEncoding");
        set.add("encryptingAlgorithm");
        set.add("encryptingCertificateChain");
        set.add("from");
        set.add("requestUri");
        set.add("requestUriPattern");
        set.add("signedReceiptMicAlgorithms");
        set.add("signingAlgorithm");
        set.add("signingCertificateChain");
        set.add("signingPrivateKey");
        set.add("subject");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "as2".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
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

