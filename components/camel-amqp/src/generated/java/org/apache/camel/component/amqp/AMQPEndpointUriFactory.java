/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.amqp;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class AMQPEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationType:destinationName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(97);
        set.add("destinationType");
        set.add("destinationName");
        set.add("clientId");
        set.add("connectionFactory");
        set.add("disableReplyTo");
        set.add("durableSubscriptionName");
        set.add("jmsMessageType");
        set.add("replyTo");
        set.add("testConnectionOnStartup");
        set.add("acknowledgementModeName");
        set.add("asyncConsumer");
        set.add("autoStartup");
        set.add("cacheLevel");
        set.add("cacheLevelName");
        set.add("concurrentConsumers");
        set.add("maxConcurrentConsumers");
        set.add("replyToDeliveryPersistent");
        set.add("selector");
        set.add("subscriptionDurable");
        set.add("subscriptionName");
        set.add("subscriptionShared");
        set.add("acceptMessagesWhileStopping");
        set.add("allowReplyManagerQuickStop");
        set.add("consumerType");
        set.add("defaultTaskExecutorType");
        set.add("eagerLoadingOfProperties");
        set.add("eagerPoisonBody");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("exposeListenerSession");
        set.add("replyToSameDestinationAllowed");
        set.add("taskExecutor");
        set.add("deliveryDelay");
        set.add("deliveryMode");
        set.add("deliveryPersistent");
        set.add("explicitQosEnabled");
        set.add("formatDateHeadersToIso8601");
        set.add("lazyStartProducer");
        set.add("preserveMessageQos");
        set.add("priority");
        set.add("replyToConcurrentConsumers");
        set.add("replyToMaxConcurrentConsumers");
        set.add("replyToOnTimeoutMaxConcurrentConsumers");
        set.add("replyToOverride");
        set.add("replyToType");
        set.add("requestTimeout");
        set.add("timeToLive");
        set.add("allowAdditionalHeaders");
        set.add("allowNullBody");
        set.add("alwaysCopyMessage");
        set.add("correlationProperty");
        set.add("disableTimeToLive");
        set.add("forceSendOriginalMessage");
        set.add("includeSentJMSMessageID");
        set.add("replyToCacheLevelName");
        set.add("replyToDestinationSelectorName");
        set.add("streamMessageTypeEnabled");
        set.add("allowSerializedHeaders");
        set.add("artemisStreamingEnabled");
        set.add("asyncStartListener");
        set.add("asyncStopListener");
        set.add("basicPropertyBinding");
        set.add("destinationResolver");
        set.add("errorHandler");
        set.add("exceptionListener");
        set.add("headerFilterStrategy");
        set.add("idleConsumerLimit");
        set.add("idleTaskExecutionLimit");
        set.add("includeAllJMSXProperties");
        set.add("jmsKeyFormatStrategy");
        set.add("mapJmsMessage");
        set.add("maxMessagesPerTask");
        set.add("messageConverter");
        set.add("messageCreatedStrategy");
        set.add("messageIdEnabled");
        set.add("messageListenerContainerFactory");
        set.add("messageTimestampEnabled");
        set.add("pubSubNoLocal");
        set.add("receiveTimeout");
        set.add("recoveryInterval");
        set.add("requestTimeoutCheckerInterval");
        set.add("synchronous");
        set.add("transferException");
        set.add("transferExchange");
        set.add("useMessageIDAsCorrelationID");
        set.add("waitForProvisionCorrelationToBeUpdatedCounter");
        set.add("waitForProvisionCorrelationToBeUpdatedThreadSleepingTime");
        set.add("errorHandlerLoggingLevel");
        set.add("errorHandlerLogStackTrace");
        set.add("password");
        set.add("username");
        set.add("transacted");
        set.add("transactedInOut");
        set.add("lazyCreateTransactionManager");
        set.add("transactionManager");
        set.add("transactionName");
        set.add("transactionTimeout");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "amqp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationType", "queue", false, copy);
        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
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

