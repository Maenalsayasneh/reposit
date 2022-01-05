package io.sentry;

import com.instabug.library.model.State;
import i0.d.a.a.a;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.config.PropertiesProvider;
import io.sentry.protocol.SdkVersion;
import io.sentry.transport.ITransportGate;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;

public class SentryOptions {
    public static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String PROXY_PORT_DEFAULT = "80";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private BeforeBreadcrumbCallback beforeBreadcrumb;
    private BeforeSendCallback beforeSend;
    private String cacheDirPath;
    private int cacheDirSize;
    private int connectionTimeoutMillis;
    private Boolean debug;
    private SentryLevel diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private Boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableSessionTracking;
    private Boolean enableUncaughtExceptionHandler;
    private IEnvelopeCache envelopeDiskCache;
    private IEnvelopeReader envelopeReader;
    private String environment;
    private final List<EventProcessor> eventProcessors;
    private ISentryExecutorService executorService;
    private long flushTimeoutMillis;
    private HostnameVerifier hostnameVerifier;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final List<Integration> integrations;
    private ILogger logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxQueueSize;
    private final List<IScopeObserver> observers;
    private Proxy proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private SdkVersion sdkVersion;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private ISerializer serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeout;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private Double tracesSampleRate;
    private TracesSamplerCallback tracesSampler;
    private ITransportFactory transportFactory;
    private ITransportGate transportGate;

    public interface BeforeBreadcrumbCallback {
        Breadcrumb execute(Breadcrumb breadcrumb, Object obj);
    }

    public interface BeforeSendCallback {
        SentryEvent execute(SentryEvent sentryEvent, Object obj);
    }

    public interface TracesSamplerCallback {
        Double sample(SamplingContext samplingContext);
    }

    public SentryOptions() {
        this(false);
    }

    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersion2 = new SdkVersion(BuildConfig.SENTRY_JAVA_SDK_NAME, "4.3.0");
        sdkVersion2.setVersion("4.3.0");
        sdkVersion2.addPackage("maven:io.sentry:sentry", "4.3.0");
        return sdkVersion2;
    }

    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    public static SentryOptions from(PropertiesProvider propertiesProvider) {
        SentryOptions sentryOptions = new SentryOptions();
        sentryOptions.setDsn(propertiesProvider.getProperty("dsn"));
        sentryOptions.setEnvironment(propertiesProvider.getProperty("environment"));
        sentryOptions.setRelease(propertiesProvider.getProperty("release"));
        sentryOptions.setDist(propertiesProvider.getProperty("dist"));
        sentryOptions.setServerName(propertiesProvider.getProperty("servername"));
        sentryOptions.setEnableUncaughtExceptionHandler(propertiesProvider.getBooleanProperty("uncaught.handler.enabled"));
        sentryOptions.setTracesSampleRate(propertiesProvider.getDoubleProperty("traces-sample-rate"));
        sentryOptions.setDebug(propertiesProvider.getBooleanProperty("debug"));
        sentryOptions.setEnableDeduplication(propertiesProvider.getBooleanProperty("enable-deduplication"));
        for (Map.Entry next : propertiesProvider.getMap(State.KEY_TAGS).entrySet()) {
            sentryOptions.setTag((String) next.getKey(), (String) next.getValue());
        }
        String property = propertiesProvider.getProperty("proxy.host");
        String property2 = propertiesProvider.getProperty("proxy.user");
        String property3 = propertiesProvider.getProperty("proxy.pass");
        String property4 = propertiesProvider.getProperty("proxy.port", PROXY_PORT_DEFAULT);
        if (property != null) {
            sentryOptions.setProxy(new Proxy(property, property4, property2, property3));
        }
        for (String addInAppInclude : propertiesProvider.getList("in-app-includes")) {
            sentryOptions.addInAppInclude(addInAppInclude);
        }
        for (String addInAppExclude : propertiesProvider.getList("in-app-excludes")) {
            sentryOptions.addInAppExclude(addInAppExclude);
        }
        return sentryOptions;
    }

    private Boolean getDebug() {
        return this.debug;
    }

    private Boolean getEnableDeduplication() {
        return this.enableDeduplication;
    }

    private void validateRate(Double d) {
        if (d == null) {
            return;
        }
        if (d.doubleValue() > 1.0d || d.doubleValue() <= 0.0d) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.01 (inclusive) and 1.0 (exclusive).");
        }
    }

    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public void addScopeObserver(IScopeObserver iScopeObserver) {
        this.observers.add(iScopeObserver);
    }

    public BeforeBreadcrumbCallback getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public BeforeSendCallback getBeforeSend() {
        return this.beforeSend;
    }

    public String getCacheDirPath() {
        return this.cacheDirPath;
    }

    public int getCacheDirSize() {
        return this.cacheDirSize;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    @ApiStatus.Internal
    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public IEnvelopeCache getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public IEnvelopeReader getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public ISentryExecutorService getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public String getOutboxPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.cacheDirPath);
        return a.y0(sb, File.separator, "outbox");
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<IScopeObserver> getScopeObservers() {
        return this.observers;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public ISerializer getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeout() {
        return this.shutdownTimeout;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public TracesSamplerCallback getTracesSampler() {
        return this.tracesSampler;
    }

    public ITransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    public ITransportGate getTransportGate() {
        return this.transportGate;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return Boolean.TRUE.equals(this.debug);
    }

    public boolean isEnableDeduplication() {
        return Boolean.TRUE.equals(this.enableDeduplication);
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSessionTracking() {
        return this.enableSessionTracking;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return Boolean.TRUE.equals(this.enableUncaughtExceptionHandler);
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public void merge(SentryOptions sentryOptions) {
        if (sentryOptions.getDsn() != null) {
            setDsn(sentryOptions.getDsn());
        }
        if (sentryOptions.getEnvironment() != null) {
            setEnvironment(sentryOptions.getEnvironment());
        }
        if (sentryOptions.getRelease() != null) {
            setRelease(sentryOptions.getRelease());
        }
        if (sentryOptions.getDist() != null) {
            setDist(sentryOptions.getDist());
        }
        if (sentryOptions.getServerName() != null) {
            setServerName(sentryOptions.getServerName());
        }
        if (sentryOptions.getProxy() != null) {
            setProxy(sentryOptions.getProxy());
        }
        if (sentryOptions.getEnableUncaughtExceptionHandler() != null) {
            setEnableUncaughtExceptionHandler(sentryOptions.getEnableUncaughtExceptionHandler());
        }
        if (sentryOptions.getTracesSampleRate() != null) {
            setTracesSampleRate(sentryOptions.getTracesSampleRate());
        }
        if (sentryOptions.getDebug() != null) {
            setDebug(sentryOptions.getDebug());
        }
        if (sentryOptions.getEnableDeduplication() != null) {
            setEnableDeduplication(sentryOptions.getEnableDeduplication());
        }
        for (Map.Entry entry : new HashMap(sentryOptions.getTags()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(sentryOptions.getInAppIncludes()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(sentryOptions.getInAppExcludes()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBeforeBreadcrumb(BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
        this.beforeBreadcrumb = beforeBreadcrumbCallback;
    }

    public void setBeforeSend(BeforeSendCallback beforeSendCallback) {
        this.beforeSend = beforeSendCallback;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCacheDirSize(int i) {
        this.cacheDirSize = i;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setDebug(Boolean bool) {
        this.debug = bool;
    }

    public void setDiagnosticLevel(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    @ApiStatus.Internal
    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
    }

    public void setEnableDeduplication(Boolean bool) {
        this.enableDeduplication = bool;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableSessionTracking(boolean z) {
        this.enableSessionTracking = z;
    }

    public void setEnableUncaughtExceptionHandler(Boolean bool) {
        this.enableUncaughtExceptionHandler = bool;
    }

    public void setEnvelopeDiskCache(IEnvelopeCache iEnvelopeCache) {
        if (iEnvelopeCache == null) {
            iEnvelopeCache = NoOpEnvelopeCache.getInstance();
        }
        this.envelopeDiskCache = iEnvelopeCache;
    }

    public void setEnvelopeReader(IEnvelopeReader iEnvelopeReader) {
        if (iEnvelopeReader == null) {
            iEnvelopeReader = NoOpEnvelopeReader.getInstance();
        }
        this.envelopeReader = iEnvelopeReader;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(ISentryExecutorService iSentryExecutorService) {
        if (iSentryExecutorService != null) {
            this.executorService = iSentryExecutorService;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier2) {
        this.hostnameVerifier = hostnameVerifier2;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? NoOpLogger.getInstance() : new DiagnosticLogger(this, iLogger);
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setProxy(Proxy proxy2) {
        this.proxy = proxy2;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d) {
        validateRate(d);
        this.sampleRate = d;
    }

    @ApiStatus.Internal
    public void setSdkVersion(SdkVersion sdkVersion2) {
        this.sdkVersion = sdkVersion2;
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(ISerializer iSerializer) {
        if (iSerializer == null) {
            iSerializer = NoOpSerializer.getInstance();
        }
        this.serializer = iSerializer;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeout(long j) {
        this.shutdownTimeout = j;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTracesSampleRate(Double d) {
        validateRate(d);
        this.tracesSampleRate = d;
    }

    public void setTracesSampler(TracesSamplerCallback tracesSamplerCallback) {
        this.tracesSampler = tracesSamplerCallback;
    }

    public void setTransportFactory(ITransportFactory iTransportFactory) {
        if (iTransportFactory == null) {
            iTransportFactory = NoOpTransportFactory.getInstance();
        }
        this.transportFactory = iTransportFactory;
    }

    public void setTransportGate(ITransportGate iTransportGate) {
        if (iTransportGate == null) {
            iTransportGate = NoOpTransportGate.getInstance();
        }
        this.transportGate = iTransportGate;
    }

    private SentryOptions(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.shutdownTimeout = 2000;
        this.flushTimeoutMillis = 15000;
        this.enableNdk = true;
        this.logger = NoOpLogger.getInstance();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new EnvelopeReader();
        this.serializer = new GsonSerializer(this.logger, this.envelopeReader);
        this.cacheDirSize = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = NoOpTransportFactory.getInstance();
        this.transportGate = NoOpTransportGate.getInstance();
        this.attachStacktrace = true;
        this.enableSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000;
        this.attachServerName = true;
        Boolean bool = Boolean.TRUE;
        this.enableUncaughtExceptionHandler = bool;
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = NoOpEnvelopeCache.getInstance();
        this.sendDefaultPii = false;
        this.observers = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520;
        this.enableDeduplication = bool;
        if (!z) {
            this.executorService = new SentryExecutorService();
            copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
            copyOnWriteArrayList2.add(new ShutdownHookIntegration());
            copyOnWriteArrayList.add(new MainEventProcessor(this));
            copyOnWriteArrayList.add(new DuplicateEventDetectionEventProcessor(this));
            setSentryClientName("sentry.java/4.3.0");
            setSdkVersion(createSdkVersion());
        }
    }

    public static final class Proxy {
        private String host;
        private String pass;
        private String port;
        private String user;

        public Proxy(String str, String str2, String str3, String str4) {
            this.host = str;
            this.port = str2;
            this.user = str3;
            this.pass = str4;
        }

        public String getHost() {
            return this.host;
        }

        public String getPass() {
            return this.pass;
        }

        public String getPort() {
            return this.port;
        }

        public String getUser() {
            return this.user;
        }

        public void setHost(String str) {
            this.host = str;
        }

        public void setPass(String str) {
            this.pass = str;
        }

        public void setPort(String str) {
            this.port = str;
        }

        public void setUser(String str) {
            this.user = str;
        }

        public Proxy() {
            this((String) null, (String) null, (String) null, (String) null);
        }

        public Proxy(String str, String str2) {
            this(str, str2, (String) null, (String) null);
        }
    }
}
