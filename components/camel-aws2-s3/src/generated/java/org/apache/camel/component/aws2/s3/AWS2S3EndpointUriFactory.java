/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class AWS2S3EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = "://bucketNameOrArn";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(63);
        set.add("bucketNameOrArn");
        set.add("amazonS3Client");
        set.add("autoCreateBucket");
        set.add("autoDiscoverClient");
        set.add("overrideEndpoint");
        set.add("pojoRequest");
        set.add("policy");
        set.add("proxyHost");
        set.add("proxyPort");
        set.add("proxyProtocol");
        set.add("region");
        set.add("trustAllCertificates");
        set.add("uriEndpointOverride");
        set.add("useIAMCredentials");
        set.add("customerAlgorithm");
        set.add("customerKeyId");
        set.add("customerKeyMD5");
        set.add("bridgeErrorHandler");
        set.add("deleteAfterRead");
        set.add("delimiter");
        set.add("destinationBucket");
        set.add("destinationBucketPrefix");
        set.add("destinationBucketSuffix");
        set.add("fileName");
        set.add("includeBody");
        set.add("includeFolders");
        set.add("maxConnections");
        set.add("maxMessagesPerPoll");
        set.add("moveAfterRead");
        set.add("prefix");
        set.add("sendEmptyMessageWhenIdle");
        set.add("autocloseBody");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("deleteAfterWrite");
        set.add("keyName");
        set.add("lazyStartProducer");
        set.add("multiPartUpload");
        set.add("operation");
        set.add("partSize");
        set.add("storageClass");
        set.add("awsKMSKeyId");
        set.add("useAwsKMS");
        set.add("useCustomerKey");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        set.add("accessKey");
        set.add("secretKey");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-s3".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "bucketNameOrArn", null, true, copy);
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

