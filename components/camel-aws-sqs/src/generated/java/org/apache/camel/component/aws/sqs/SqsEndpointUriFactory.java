/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.sqs;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SqsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":queueNameOrArn";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(60);
        set.add("queueNameOrArn");
        set.add("amazonAWSHost");
        set.add("amazonSQSClient");
        set.add("autoCreateQueue");
        set.add("autoDiscoverClient");
        set.add("headerFilterStrategy");
        set.add("protocol");
        set.add("proxyProtocol");
        set.add("queueOwnerAWSAccountId");
        set.add("region");
        set.add("attributeNames");
        set.add("bridgeErrorHandler");
        set.add("concurrentConsumers");
        set.add("defaultVisibilityTimeout");
        set.add("deleteAfterRead");
        set.add("deleteIfFiltered");
        set.add("extendMessageVisibility");
        set.add("kmsDataKeyReusePeriodSeconds");
        set.add("kmsMasterKeyId");
        set.add("maxMessagesPerPoll");
        set.add("messageAttributeNames");
        set.add("sendEmptyMessageWhenIdle");
        set.add("serverSideEncryptionEnabled");
        set.add("visibilityTimeout");
        set.add("waitTimeSeconds");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("delaySeconds");
        set.add("lazyStartProducer");
        set.add("messageDeduplicationIdStrategy");
        set.add("messageGroupIdStrategy");
        set.add("operation");
        set.add("basicPropertyBinding");
        set.add("delayQueue");
        set.add("queueUrl");
        set.add("synchronous");
        set.add("proxyHost");
        set.add("proxyPort");
        set.add("maximumMessageSize");
        set.add("messageRetentionPeriod");
        set.add("policy");
        set.add("receiveMessageWaitTimeSeconds");
        set.add("redrivePolicy");
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
        return "aws-sqs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "queueNameOrArn", null, true, copy);
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

