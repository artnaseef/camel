/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.eventhubs;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EventHubsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("amqpRetryOptions", com.azure.core.amqp.AmqpRetryOptions.class);
        map.put("amqpTransportType", com.azure.core.amqp.AmqpTransportType.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("configuration", org.apache.camel.component.azure.eventhubs.EventHubsConfiguration.class);
        map.put("blobAccessKey", java.lang.String.class);
        map.put("blobAccountName", java.lang.String.class);
        map.put("blobContainerName", java.lang.String.class);
        map.put("blobStorageSharedKeyCredential", com.azure.storage.common.StorageSharedKeyCredential.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("checkpointStore", com.azure.messaging.eventhubs.CheckpointStore.class);
        map.put("consumerGroupName", java.lang.String.class);
        map.put("eventPosition", java.util.Map.class);
        map.put("prefetchCount", int.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("partitionId", java.lang.String.class);
        map.put("partitionKey", java.lang.String.class);
        map.put("producerAsyncClient", com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("connectionString", java.lang.String.class);
        map.put("sharedAccessKey", java.lang.String.class);
        map.put("sharedAccessName", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.azure.eventhubs.EventHubsConfiguration getOrCreateConfiguration(EventHubsComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.azure.eventhubs.EventHubsConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EventHubsComponent target = (EventHubsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": getOrCreateConfiguration(target).setAmqpRetryOptions(property(camelContext, com.azure.core.amqp.AmqpRetryOptions.class, value)); return true;
        case "amqptransporttype":
        case "amqpTransportType": getOrCreateConfiguration(target).setAmqpTransportType(property(camelContext, com.azure.core.amqp.AmqpTransportType.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blobaccesskey":
        case "blobAccessKey": getOrCreateConfiguration(target).setBlobAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "blobaccountname":
        case "blobAccountName": getOrCreateConfiguration(target).setBlobAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobcontainername":
        case "blobContainerName": getOrCreateConfiguration(target).setBlobContainerName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": getOrCreateConfiguration(target).setBlobStorageSharedKeyCredential(property(camelContext, com.azure.storage.common.StorageSharedKeyCredential.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "checkpointstore":
        case "checkpointStore": getOrCreateConfiguration(target).setCheckpointStore(property(camelContext, com.azure.messaging.eventhubs.CheckpointStore.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.azure.eventhubs.EventHubsConfiguration.class, value)); return true;
        case "connectionstring":
        case "connectionString": getOrCreateConfiguration(target).setConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "consumergroupname":
        case "consumerGroupName": getOrCreateConfiguration(target).setConsumerGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventposition":
        case "eventPosition": getOrCreateConfiguration(target).setEventPosition(property(camelContext, java.util.Map.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "partitionid":
        case "partitionId": getOrCreateConfiguration(target).setPartitionId(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionkey":
        case "partitionKey": getOrCreateConfiguration(target).setPartitionKey(property(camelContext, java.lang.String.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": getOrCreateConfiguration(target).setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "producerasyncclient":
        case "producerAsyncClient": getOrCreateConfiguration(target).setProducerAsyncClient(property(camelContext, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class, value)); return true;
        case "sharedaccesskey":
        case "sharedAccessKey": getOrCreateConfiguration(target).setSharedAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sharedaccessname":
        case "sharedAccessName": getOrCreateConfiguration(target).setSharedAccessName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EventHubsComponent target = (EventHubsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": return getOrCreateConfiguration(target).getAmqpRetryOptions();
        case "amqptransporttype":
        case "amqpTransportType": return getOrCreateConfiguration(target).getAmqpTransportType();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blobaccesskey":
        case "blobAccessKey": return getOrCreateConfiguration(target).getBlobAccessKey();
        case "blobaccountname":
        case "blobAccountName": return getOrCreateConfiguration(target).getBlobAccountName();
        case "blobcontainername":
        case "blobContainerName": return getOrCreateConfiguration(target).getBlobContainerName();
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": return getOrCreateConfiguration(target).getBlobStorageSharedKeyCredential();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "checkpointstore":
        case "checkpointStore": return getOrCreateConfiguration(target).getCheckpointStore();
        case "configuration": return target.getConfiguration();
        case "connectionstring":
        case "connectionString": return getOrCreateConfiguration(target).getConnectionString();
        case "consumergroupname":
        case "consumerGroupName": return getOrCreateConfiguration(target).getConsumerGroupName();
        case "eventposition":
        case "eventPosition": return getOrCreateConfiguration(target).getEventPosition();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "partitionid":
        case "partitionId": return getOrCreateConfiguration(target).getPartitionId();
        case "partitionkey":
        case "partitionKey": return getOrCreateConfiguration(target).getPartitionKey();
        case "prefetchcount":
        case "prefetchCount": return getOrCreateConfiguration(target).getPrefetchCount();
        case "producerasyncclient":
        case "producerAsyncClient": return getOrCreateConfiguration(target).getProducerAsyncClient();
        case "sharedaccesskey":
        case "sharedAccessKey": return getOrCreateConfiguration(target).getSharedAccessKey();
        case "sharedaccessname":
        case "sharedAccessName": return getOrCreateConfiguration(target).getSharedAccessName();
        default: return null;
        }
    }
}

