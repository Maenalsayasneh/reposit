package com.pubnub.api;

import com.pubnub.api.enums.PNHeartbeatNotificationOptions;
import com.pubnub.api.enums.PNLogVerbosity;
import com.pubnub.api.enums.PNReconnectionPolicy;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Objects;
import java.util.UUID;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import okhttp3.logging.HttpLoggingInterceptor;
import q0.c;
import q0.h;
import q0.m;

public class PNConfiguration {
    private static final int CONNECT_TIMEOUT = 5;
    private static final int DEFAULT_DEDUPE_SIZE = 100;
    private static final int FILE_MESSAGE_PUBLISH_RETRY_LIMIT = 5;
    private static final int MINIMUM_PRESENCE_TIMEOUT = 20;
    private static final int NON_SUBSCRIBE_REQUEST_TIMEOUT = 10;
    private static final int PRESENCE_TIMEOUT = 300;
    private static final int SUBSCRIBE_TIMEOUT = 310;
    private static final Logger log = Logger.getLogger(PNConfiguration.class.getName());
    private String authKey;
    @Deprecated
    private boolean cacheBusting;
    private h certificatePinner;
    private String cipherKey;
    private int connectTimeout = 5;
    private m connectionSpec;
    private boolean dedupOnSubscribe = false;
    private int fileMessagePublishRetryLimit = 5;
    private String filterExpression;
    private boolean googleAppEngineNetworking;
    private int heartbeatInterval;
    private PNHeartbeatNotificationOptions heartbeatNotificationOptions = PNHeartbeatNotificationOptions.FAILURES;
    private HostnameVerifier hostnameVerifier;
    private HttpLoggingInterceptor httpLoggingInterceptor;
    private boolean includeInstanceIdentifier = false;
    private boolean includeRequestIdentifier = true;
    private PNLogVerbosity logVerbosity = PNLogVerbosity.NONE;
    @Deprecated
    private boolean managePresenceListManually = false;
    private Integer maximumConnections;
    private Integer maximumMessagesCacheSize = 100;
    private int maximumReconnectionRetries = -1;
    private int nonSubscribeRequestTimeout = 10;
    private String origin;
    private int presenceTimeout;
    private Proxy proxy;
    private c proxyAuthenticator;
    private ProxySelector proxySelector;
    private String publishKey;
    private PNReconnectionPolicy reconnectionPolicy = PNReconnectionPolicy.NONE;
    private Integer requestMessageCountThreshold;
    private String secretKey;
    private boolean secure = true;
    private SSLSocketFactory sslSocketFactory;
    private boolean startSubscriberThread = true;
    private String subscribeKey;
    private int subscribeTimeout = SUBSCRIBE_TIMEOUT;
    private boolean suppressLeaveEvents = false;
    private boolean useRandomInitializationVector = true;
    private String uuid = ("pn-" + UUID.randomUUID().toString());
    private X509ExtendedTrustManager x509ExtendedTrustManager;

    public PNConfiguration() {
        setPresenceTimeoutWithCustomInterval(PRESENCE_TIMEOUT, 0);
    }

    private int validatePresenceTimeout(int i) {
        if (i >= 20) {
            return i;
        }
        log.warning("Presence timeout is too low. Defaulting to: 20");
        return 20;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public h getCertificatePinner() {
        return this.certificatePinner;
    }

    public String getCipherKey() {
        return this.cipherKey;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public m getConnectionSpec() {
        return this.connectionSpec;
    }

    public int getFileMessagePublishRetryLimit() {
        return this.fileMessagePublishRetryLimit;
    }

    public String getFilterExpression() {
        return this.filterExpression;
    }

    public int getHeartbeatInterval() {
        return this.heartbeatInterval;
    }

    public PNHeartbeatNotificationOptions getHeartbeatNotificationOptions() {
        return this.heartbeatNotificationOptions;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public HttpLoggingInterceptor getHttpLoggingInterceptor() {
        return this.httpLoggingInterceptor;
    }

    public PNLogVerbosity getLogVerbosity() {
        return this.logVerbosity;
    }

    public Integer getMaximumConnections() {
        return this.maximumConnections;
    }

    public Integer getMaximumMessagesCacheSize() {
        return this.maximumMessagesCacheSize;
    }

    public int getMaximumReconnectionRetries() {
        return this.maximumReconnectionRetries;
    }

    public int getNonSubscribeRequestTimeout() {
        return this.nonSubscribeRequestTimeout;
    }

    public String getOrigin() {
        return this.origin;
    }

    public int getPresenceTimeout() {
        return this.presenceTimeout;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public c getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public String getPublishKey() {
        return this.publishKey;
    }

    public PNReconnectionPolicy getReconnectionPolicy() {
        return this.reconnectionPolicy;
    }

    public Integer getRequestMessageCountThreshold() {
        return this.requestMessageCountThreshold;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String getSubscribeKey() {
        return this.subscribeKey;
    }

    public int getSubscribeTimeout() {
        return this.subscribeTimeout;
    }

    public String getUuid() {
        return this.uuid;
    }

    public X509ExtendedTrustManager getX509ExtendedTrustManager() {
        return this.x509ExtendedTrustManager;
    }

    @Deprecated
    public boolean isCacheBusting() {
        return this.cacheBusting;
    }

    public boolean isDedupOnSubscribe() {
        return this.dedupOnSubscribe;
    }

    public boolean isGoogleAppEngineNetworking() {
        return this.googleAppEngineNetworking;
    }

    public boolean isIncludeInstanceIdentifier() {
        return this.includeInstanceIdentifier;
    }

    public boolean isIncludeRequestIdentifier() {
        return this.includeRequestIdentifier;
    }

    @Deprecated
    public boolean isManagePresenceListManually() {
        return this.managePresenceListManually;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public boolean isStartSubscriberThread() {
        return this.startSubscriberThread;
    }

    public boolean isSuppressLeaveEvents() {
        return this.suppressLeaveEvents;
    }

    public boolean isUseRandomInitializationVector() {
        return this.useRandomInitializationVector;
    }

    public PNConfiguration setAuthKey(String str) {
        this.authKey = str;
        return this;
    }

    @Deprecated
    public PNConfiguration setCacheBusting(boolean z) {
        this.cacheBusting = z;
        return this;
    }

    public PNConfiguration setCertificatePinner(h hVar) {
        this.certificatePinner = hVar;
        return this;
    }

    public PNConfiguration setCipherKey(String str) {
        this.cipherKey = str;
        return this;
    }

    public PNConfiguration setConnectTimeout(int i) {
        this.connectTimeout = i;
        return this;
    }

    public PNConfiguration setConnectionSpec(m mVar) {
        this.connectionSpec = mVar;
        return this;
    }

    public PNConfiguration setDedupOnSubscribe(boolean z) {
        this.dedupOnSubscribe = z;
        return this;
    }

    public PNConfiguration setFileMessagePublishRetryLimit(int i) {
        this.fileMessagePublishRetryLimit = i;
        return this;
    }

    public PNConfiguration setFilterExpression(String str) {
        this.filterExpression = str;
        return this;
    }

    public PNConfiguration setGoogleAppEngineNetworking(boolean z) {
        this.googleAppEngineNetworking = z;
        return this;
    }

    public PNConfiguration setHeartbeatNotificationOptions(PNHeartbeatNotificationOptions pNHeartbeatNotificationOptions) {
        this.heartbeatNotificationOptions = pNHeartbeatNotificationOptions;
        return this;
    }

    public PNConfiguration setHostnameVerifier(HostnameVerifier hostnameVerifier2) {
        this.hostnameVerifier = hostnameVerifier2;
        return this;
    }

    public PNConfiguration setHttpLoggingInterceptor(HttpLoggingInterceptor httpLoggingInterceptor2) {
        this.httpLoggingInterceptor = httpLoggingInterceptor2;
        return this;
    }

    public PNConfiguration setIncludeInstanceIdentifier(boolean z) {
        this.includeInstanceIdentifier = z;
        return this;
    }

    public PNConfiguration setIncludeRequestIdentifier(boolean z) {
        this.includeRequestIdentifier = z;
        return this;
    }

    public PNConfiguration setLogVerbosity(PNLogVerbosity pNLogVerbosity) {
        Objects.requireNonNull(pNLogVerbosity, "logVerbosity is marked @NonNull but is null");
        this.logVerbosity = pNLogVerbosity;
        return this;
    }

    @Deprecated
    public PNConfiguration setManagePresenceListManually(boolean z) {
        this.managePresenceListManually = z;
        return this;
    }

    public PNConfiguration setMaximumConnections(Integer num) {
        this.maximumConnections = num;
        return this;
    }

    public PNConfiguration setMaximumMessagesCacheSize(Integer num) {
        this.maximumMessagesCacheSize = num;
        return this;
    }

    public PNConfiguration setMaximumReconnectionRetries(int i) {
        this.maximumReconnectionRetries = i;
        return this;
    }

    public PNConfiguration setNonSubscribeRequestTimeout(int i) {
        this.nonSubscribeRequestTimeout = i;
        return this;
    }

    public PNConfiguration setOrigin(String str) {
        this.origin = str;
        return this;
    }

    public PNConfiguration setPresenceTimeout(int i) {
        int validatePresenceTimeout = validatePresenceTimeout(i);
        return setPresenceTimeoutWithCustomInterval(validatePresenceTimeout, (validatePresenceTimeout / 2) - 1);
    }

    public PNConfiguration setPresenceTimeoutWithCustomInterval(int i, int i2) {
        this.presenceTimeout = validatePresenceTimeout(i);
        this.heartbeatInterval = i2;
        return this;
    }

    public PNConfiguration setProxy(Proxy proxy2) {
        this.proxy = proxy2;
        return this;
    }

    public PNConfiguration setProxyAuthenticator(c cVar) {
        this.proxyAuthenticator = cVar;
        return this;
    }

    public PNConfiguration setProxySelector(ProxySelector proxySelector2) {
        this.proxySelector = proxySelector2;
        return this;
    }

    public PNConfiguration setPublishKey(String str) {
        this.publishKey = str;
        return this;
    }

    public PNConfiguration setReconnectionPolicy(PNReconnectionPolicy pNReconnectionPolicy) {
        this.reconnectionPolicy = pNReconnectionPolicy;
        return this;
    }

    public PNConfiguration setRequestMessageCountThreshold(Integer num) {
        this.requestMessageCountThreshold = num;
        return this;
    }

    public PNConfiguration setSecretKey(String str) {
        this.secretKey = str;
        return this;
    }

    public PNConfiguration setSecure(boolean z) {
        this.secure = z;
        return this;
    }

    public PNConfiguration setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
        return this;
    }

    public PNConfiguration setStartSubscriberThread(boolean z) {
        this.startSubscriberThread = z;
        return this;
    }

    public PNConfiguration setSubscribeKey(String str) {
        this.subscribeKey = str;
        return this;
    }

    public PNConfiguration setSubscribeTimeout(int i) {
        this.subscribeTimeout = i;
        return this;
    }

    public PNConfiguration setSuppressLeaveEvents(boolean z) {
        this.suppressLeaveEvents = z;
        return this;
    }

    public PNConfiguration setUseRandomInitializationVector(boolean z) {
        this.useRandomInitializationVector = z;
        return this;
    }

    public PNConfiguration setUuid(String str) {
        this.uuid = str;
        return this;
    }

    public PNConfiguration setX509ExtendedTrustManager(X509ExtendedTrustManager x509ExtendedTrustManager2) {
        this.x509ExtendedTrustManager = x509ExtendedTrustManager2;
        return this;
    }
}
