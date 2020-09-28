/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file;

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
public class FileEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("directoryName", java.io.File.class);
        map.put("charset", java.lang.String.class);
        map.put("doneFileName", java.lang.String.class);
        map.put("fileName", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("delete", boolean.class);
        map.put("moveFailed", java.lang.String.class);
        map.put("noop", boolean.class);
        map.put("preMove", java.lang.String.class);
        map.put("preSort", boolean.class);
        map.put("recursive", boolean.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("directoryMustExist", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("extendedAttributes", java.lang.String.class);
        map.put("inProgressRepository", org.apache.camel.spi.IdempotentRepository.class);
        map.put("localWorkDirectory", java.lang.String.class);
        map.put("onCompletionExceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("probeContentType", boolean.class);
        map.put("processStrategy", org.apache.camel.component.file.GenericFileProcessStrategy.class);
        map.put("startingDirectoryMustExist", boolean.class);
        map.put("startingDirectoryMustHaveAccess", boolean.class);
        map.put("appendChars", java.lang.String.class);
        map.put("fileExist", org.apache.camel.component.file.GenericFileExist.class);
        map.put("flatten", boolean.class);
        map.put("jailStartingDirectory", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("moveExisting", java.lang.String.class);
        map.put("tempFileName", java.lang.String.class);
        map.put("tempPrefix", java.lang.String.class);
        map.put("allowNullBody", boolean.class);
        map.put("chmod", java.lang.String.class);
        map.put("chmodDirectory", java.lang.String.class);
        map.put("eagerDeleteTargetFile", boolean.class);
        map.put("forceWrites", boolean.class);
        map.put("keepLastModified", boolean.class);
        map.put("moveExistingFileStrategy", org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class);
        map.put("autoCreate", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("bufferSize", int.class);
        map.put("copyAndDeleteOnRenameFail", boolean.class);
        map.put("renameUsingCopy", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("antExclude", java.lang.String.class);
        map.put("antFilterCaseSensitive", boolean.class);
        map.put("antInclude", java.lang.String.class);
        map.put("eagerMaxMessagesPerPoll", boolean.class);
        map.put("exclude", java.lang.String.class);
        map.put("filter", org.apache.camel.component.file.GenericFileFilter.class);
        map.put("filterDirectory", java.lang.String.class);
        map.put("filterFile", java.lang.String.class);
        map.put("idempotent", java.lang.Boolean.class);
        map.put("idempotentKey", java.lang.String.class);
        map.put("idempotentRepository", org.apache.camel.spi.IdempotentRepository.class);
        map.put("include", java.lang.String.class);
        map.put("maxDepth", int.class);
        map.put("maxMessagesPerPoll", int.class);
        map.put("minDepth", int.class);
        map.put("move", java.lang.String.class);
        map.put("exclusiveReadLockStrategy", org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class);
        map.put("readLock", java.lang.String.class);
        map.put("readLockCheckInterval", long.class);
        map.put("readLockDeleteOrphanLockFiles", boolean.class);
        map.put("readLockIdempotentReleaseAsync", boolean.class);
        map.put("readLockIdempotentReleaseAsyncPoolSize", int.class);
        map.put("readLockIdempotentReleaseDelay", int.class);
        map.put("readLockIdempotentReleaseExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("readLockLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("readLockMarkerFile", boolean.class);
        map.put("readLockMinAge", long.class);
        map.put("readLockMinLength", long.class);
        map.put("readLockRemoveOnCommit", boolean.class);
        map.put("readLockRemoveOnRollback", boolean.class);
        map.put("readLockTimeout", long.class);
        map.put("backoffErrorThreshold", int.class);
        map.put("backoffIdleThreshold", int.class);
        map.put("backoffMultiplier", int.class);
        map.put("delay", long.class);
        map.put("greedy", boolean.class);
        map.put("initialDelay", long.class);
        map.put("repeatCount", long.class);
        map.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("scheduler", java.lang.Object.class);
        map.put("schedulerProperties", java.util.Map.class);
        map.put("startScheduler", boolean.class);
        map.put("timeUnit", java.util.concurrent.TimeUnit.class);
        map.put("useFixedDelay", boolean.class);
        map.put("shuffle", boolean.class);
        map.put("sortBy", java.lang.String.class);
        map.put("sorter", java.util.Comparator.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FileEndpoint target = (FileEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "antexclude":
        case "antExclude": target.setAntExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "antfiltercasesensitive":
        case "antFilterCaseSensitive": target.setAntFilterCaseSensitive(property(camelContext, boolean.class, value)); return true;
        case "antinclude":
        case "antInclude": target.setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "appendchars":
        case "appendChars": target.setAppendChars(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreate":
        case "autoCreate": target.setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffersize":
        case "bufferSize": target.setBufferSize(property(camelContext, int.class, value)); return true;
        case "charset": target.setCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "chmod": target.setChmod(property(camelContext, java.lang.String.class, value)); return true;
        case "chmoddirectory":
        case "chmodDirectory": target.setChmodDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "copyanddeleteonrenamefail":
        case "copyAndDeleteOnRenameFail": target.setCopyAndDeleteOnRenameFail(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "delete": target.setDelete(property(camelContext, boolean.class, value)); return true;
        case "directorymustexist":
        case "directoryMustExist": target.setDirectoryMustExist(property(camelContext, boolean.class, value)); return true;
        case "donefilename":
        case "doneFileName": target.setDoneFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerdeletetargetfile":
        case "eagerDeleteTargetFile": target.setEagerDeleteTargetFile(property(camelContext, boolean.class, value)); return true;
        case "eagermaxmessagesperpoll":
        case "eagerMaxMessagesPerPoll": target.setEagerMaxMessagesPerPoll(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exclude": target.setExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusivereadlockstrategy":
        case "exclusiveReadLockStrategy": target.setExclusiveReadLockStrategy(property(camelContext, org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class, value)); return true;
        case "extendedattributes":
        case "extendedAttributes": target.setExtendedAttributes(property(camelContext, java.lang.String.class, value)); return true;
        case "fileexist":
        case "fileExist": target.setFileExist(property(camelContext, org.apache.camel.component.file.GenericFileExist.class, value)); return true;
        case "filename":
        case "fileName": target.setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filter": target.setFilter(property(camelContext, org.apache.camel.component.file.GenericFileFilter.class, value)); return true;
        case "filterdirectory":
        case "filterDirectory": target.setFilterDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "filterfile":
        case "filterFile": target.setFilterFile(property(camelContext, java.lang.String.class, value)); return true;
        case "flatten": target.setFlatten(property(camelContext, boolean.class, value)); return true;
        case "forcewrites":
        case "forceWrites": target.setForceWrites(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "idempotent": target.setIdempotent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "idempotentkey":
        case "idempotentKey": target.setIdempotentKey(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotentrepository":
        case "idempotentRepository": target.setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "inprogressrepository":
        case "inProgressRepository": target.setInProgressRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "include": target.setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "jailstartingdirectory":
        case "jailStartingDirectory": target.setJailStartingDirectory(property(camelContext, boolean.class, value)); return true;
        case "keeplastmodified":
        case "keepLastModified": target.setKeepLastModified(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "localworkdirectory":
        case "localWorkDirectory": target.setLocalWorkDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "maxdepth":
        case "maxDepth": target.setMaxDepth(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "mindepth":
        case "minDepth": target.setMinDepth(property(camelContext, int.class, value)); return true;
        case "move": target.setMove(property(camelContext, java.lang.String.class, value)); return true;
        case "moveexisting":
        case "moveExisting": target.setMoveExisting(property(camelContext, java.lang.String.class, value)); return true;
        case "moveexistingfilestrategy":
        case "moveExistingFileStrategy": target.setMoveExistingFileStrategy(property(camelContext, org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class, value)); return true;
        case "movefailed":
        case "moveFailed": target.setMoveFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "oncompletionexceptionhandler":
        case "onCompletionExceptionHandler": target.setOnCompletionExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "premove":
        case "preMove": target.setPreMove(property(camelContext, java.lang.String.class, value)); return true;
        case "presort":
        case "preSort": target.setPreSort(property(camelContext, boolean.class, value)); return true;
        case "probecontenttype":
        case "probeContentType": target.setProbeContentType(property(camelContext, boolean.class, value)); return true;
        case "processstrategy":
        case "processStrategy": target.setProcessStrategy(property(camelContext, org.apache.camel.component.file.GenericFileProcessStrategy.class, value)); return true;
        case "readlock":
        case "readLock": target.setReadLock(property(camelContext, java.lang.String.class, value)); return true;
        case "readlockcheckinterval":
        case "readLockCheckInterval": target.setReadLockCheckInterval(property(camelContext, long.class, value)); return true;
        case "readlockdeleteorphanlockfiles":
        case "readLockDeleteOrphanLockFiles": target.setReadLockDeleteOrphanLockFiles(property(camelContext, boolean.class, value)); return true;
        case "readlockidempotentreleaseasync":
        case "readLockIdempotentReleaseAsync": target.setReadLockIdempotentReleaseAsync(property(camelContext, boolean.class, value)); return true;
        case "readlockidempotentreleaseasyncpoolsize":
        case "readLockIdempotentReleaseAsyncPoolSize": target.setReadLockIdempotentReleaseAsyncPoolSize(property(camelContext, int.class, value)); return true;
        case "readlockidempotentreleasedelay":
        case "readLockIdempotentReleaseDelay": target.setReadLockIdempotentReleaseDelay(property(camelContext, int.class, value)); return true;
        case "readlockidempotentreleaseexecutorservice":
        case "readLockIdempotentReleaseExecutorService": target.setReadLockIdempotentReleaseExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "readlocklogginglevel":
        case "readLockLoggingLevel": target.setReadLockLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "readlockmarkerfile":
        case "readLockMarkerFile": target.setReadLockMarkerFile(property(camelContext, boolean.class, value)); return true;
        case "readlockminage":
        case "readLockMinAge": target.setReadLockMinAge(property(camelContext, long.class, value)); return true;
        case "readlockminlength":
        case "readLockMinLength": target.setReadLockMinLength(property(camelContext, long.class, value)); return true;
        case "readlockremoveoncommit":
        case "readLockRemoveOnCommit": target.setReadLockRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "readlockremoveonrollback":
        case "readLockRemoveOnRollback": target.setReadLockRemoveOnRollback(property(camelContext, boolean.class, value)); return true;
        case "readlocktimeout":
        case "readLockTimeout": target.setReadLockTimeout(property(camelContext, long.class, value)); return true;
        case "recursive": target.setRecursive(property(camelContext, boolean.class, value)); return true;
        case "renameusingcopy":
        case "renameUsingCopy": target.setRenameUsingCopy(property(camelContext, boolean.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "shuffle": target.setShuffle(property(camelContext, boolean.class, value)); return true;
        case "sortby":
        case "sortBy": target.setSortBy(property(camelContext, java.lang.String.class, value)); return true;
        case "sorter": target.setSorter(property(camelContext, java.util.Comparator.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "startingdirectorymustexist":
        case "startingDirectoryMustExist": target.setStartingDirectoryMustExist(property(camelContext, boolean.class, value)); return true;
        case "startingdirectorymusthaveaccess":
        case "startingDirectoryMustHaveAccess": target.setStartingDirectoryMustHaveAccess(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tempfilename":
        case "tempFileName": target.setTempFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "tempprefix":
        case "tempPrefix": target.setTempPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        FileEndpoint target = (FileEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "antexclude":
        case "antExclude": return target.getAntExclude();
        case "antfiltercasesensitive":
        case "antFilterCaseSensitive": return target.isAntFilterCaseSensitive();
        case "antinclude":
        case "antInclude": return target.getAntInclude();
        case "appendchars":
        case "appendChars": return target.getAppendChars();
        case "autocreate":
        case "autoCreate": return target.isAutoCreate();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buffersize":
        case "bufferSize": return target.getBufferSize();
        case "charset": return target.getCharset();
        case "chmod": return target.getChmod();
        case "chmoddirectory":
        case "chmodDirectory": return target.getChmodDirectory();
        case "copyanddeleteonrenamefail":
        case "copyAndDeleteOnRenameFail": return target.isCopyAndDeleteOnRenameFail();
        case "delay": return target.getDelay();
        case "delete": return target.isDelete();
        case "directorymustexist":
        case "directoryMustExist": return target.isDirectoryMustExist();
        case "donefilename":
        case "doneFileName": return target.getDoneFileName();
        case "eagerdeletetargetfile":
        case "eagerDeleteTargetFile": return target.isEagerDeleteTargetFile();
        case "eagermaxmessagesperpoll":
        case "eagerMaxMessagesPerPoll": return target.isEagerMaxMessagesPerPoll();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exclude": return target.getExclude();
        case "exclusivereadlockstrategy":
        case "exclusiveReadLockStrategy": return target.getExclusiveReadLockStrategy();
        case "extendedattributes":
        case "extendedAttributes": return target.getExtendedAttributes();
        case "fileexist":
        case "fileExist": return target.getFileExist();
        case "filename":
        case "fileName": return target.getFileName();
        case "filter": return target.getFilter();
        case "filterdirectory":
        case "filterDirectory": return target.getFilterDirectory();
        case "filterfile":
        case "filterFile": return target.getFilterFile();
        case "flatten": return target.isFlatten();
        case "forcewrites":
        case "forceWrites": return target.isForceWrites();
        case "greedy": return target.isGreedy();
        case "idempotent": return target.getIdempotent();
        case "idempotentkey":
        case "idempotentKey": return target.getIdempotentKey();
        case "idempotentrepository":
        case "idempotentRepository": return target.getIdempotentRepository();
        case "inprogressrepository":
        case "inProgressRepository": return target.getInProgressRepository();
        case "include": return target.getInclude();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "jailstartingdirectory":
        case "jailStartingDirectory": return target.isJailStartingDirectory();
        case "keeplastmodified":
        case "keepLastModified": return target.isKeepLastModified();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "localworkdirectory":
        case "localWorkDirectory": return target.getLocalWorkDirectory();
        case "maxdepth":
        case "maxDepth": return target.getMaxDepth();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "mindepth":
        case "minDepth": return target.getMinDepth();
        case "move": return target.getMove();
        case "moveexisting":
        case "moveExisting": return target.getMoveExisting();
        case "moveexistingfilestrategy":
        case "moveExistingFileStrategy": return target.getMoveExistingFileStrategy();
        case "movefailed":
        case "moveFailed": return target.getMoveFailed();
        case "noop": return target.isNoop();
        case "oncompletionexceptionhandler":
        case "onCompletionExceptionHandler": return target.getOnCompletionExceptionHandler();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "premove":
        case "preMove": return target.getPreMove();
        case "presort":
        case "preSort": return target.isPreSort();
        case "probecontenttype":
        case "probeContentType": return target.isProbeContentType();
        case "processstrategy":
        case "processStrategy": return target.getProcessStrategy();
        case "readlock":
        case "readLock": return target.getReadLock();
        case "readlockcheckinterval":
        case "readLockCheckInterval": return target.getReadLockCheckInterval();
        case "readlockdeleteorphanlockfiles":
        case "readLockDeleteOrphanLockFiles": return target.isReadLockDeleteOrphanLockFiles();
        case "readlockidempotentreleaseasync":
        case "readLockIdempotentReleaseAsync": return target.isReadLockIdempotentReleaseAsync();
        case "readlockidempotentreleaseasyncpoolsize":
        case "readLockIdempotentReleaseAsyncPoolSize": return target.getReadLockIdempotentReleaseAsyncPoolSize();
        case "readlockidempotentreleasedelay":
        case "readLockIdempotentReleaseDelay": return target.getReadLockIdempotentReleaseDelay();
        case "readlockidempotentreleaseexecutorservice":
        case "readLockIdempotentReleaseExecutorService": return target.getReadLockIdempotentReleaseExecutorService();
        case "readlocklogginglevel":
        case "readLockLoggingLevel": return target.getReadLockLoggingLevel();
        case "readlockmarkerfile":
        case "readLockMarkerFile": return target.isReadLockMarkerFile();
        case "readlockminage":
        case "readLockMinAge": return target.getReadLockMinAge();
        case "readlockminlength":
        case "readLockMinLength": return target.getReadLockMinLength();
        case "readlockremoveoncommit":
        case "readLockRemoveOnCommit": return target.isReadLockRemoveOnCommit();
        case "readlockremoveonrollback":
        case "readLockRemoveOnRollback": return target.isReadLockRemoveOnRollback();
        case "readlocktimeout":
        case "readLockTimeout": return target.getReadLockTimeout();
        case "recursive": return target.isRecursive();
        case "renameusingcopy":
        case "renameUsingCopy": return target.isRenameUsingCopy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "shuffle": return target.isShuffle();
        case "sortby":
        case "sortBy": return target.getSortBy();
        case "sorter": return target.getSorter();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "startingdirectorymustexist":
        case "startingDirectoryMustExist": return target.isStartingDirectoryMustExist();
        case "startingdirectorymusthaveaccess":
        case "startingDirectoryMustHaveAccess": return target.isStartingDirectoryMustHaveAccess();
        case "synchronous": return target.isSynchronous();
        case "tempfilename":
        case "tempFileName": return target.getTempFileName();
        case "tempprefix":
        case "tempPrefix": return target.getTempPrefix();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }
}

