package com.pubnub.api.managers;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.vendor.AppEngineFactory;
import com.pubnub.api.enums.PNLogVerbosity;
import com.pubnub.api.interceptors.SignatureInterceptor;
import com.pubnub.api.services.AccessManagerService;
import com.pubnub.api.services.ChannelGroupService;
import com.pubnub.api.services.ChannelMetadataService;
import com.pubnub.api.services.FilesService;
import com.pubnub.api.services.HistoryService;
import com.pubnub.api.services.MessageActionService;
import com.pubnub.api.services.PresenceService;
import com.pubnub.api.services.PublishService;
import com.pubnub.api.services.PushService;
import com.pubnub.api.services.S3Service;
import com.pubnub.api.services.SignalService;
import com.pubnub.api.services.SubscribeService;
import com.pubnub.api.services.TimeService;
import com.pubnub.api.services.UUIDMetadataService;
import i0.d.a.a.a;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import m0.n.b.i;
import okhttp3.logging.HttpLoggingInterceptor;
import q0.a0;
import q0.h0.c;
import q0.h0.g.e;
import q0.h0.g.g;
import q0.h0.g.h;
import q0.h0.l.h;
import q0.q;
import t0.w;

public class RetrofitManager {
    private AccessManagerService accessManagerService;
    private ChannelGroupService channelGroupService;
    private ChannelMetadataService channelMetadataService;
    private final FilesService filesService;
    private HistoryService historyService;
    private MessageActionService messageActionService;
    private a0 noSignatureClientInstance;
    private final w noSignatureInstance;
    private PresenceService presenceService;
    private PublishService publishService;
    private PubNub pubnub;
    private PushService pushService;
    private final S3Service s3Service;
    private SignalService signalService;
    private SignatureInterceptor signatureInterceptor;
    private SubscribeService subscribeService;
    private a0 subscriptionClientInstance;
    private final w subscriptionInstance;
    private TimeService timeService;
    private a0 transactionClientInstance;
    private final w transactionInstance;
    private UUIDMetadataService uuidMetadataService;

    public RetrofitManager(PubNub pubNub) {
        this.pubnub = pubNub;
        this.signatureInterceptor = new SignatureInterceptor(pubNub);
        if (!pubNub.getConfiguration().isGoogleAppEngineNetworking()) {
            a0.a prepareOkHttpClient = prepareOkHttpClient(this.pubnub.getConfiguration().getNonSubscribeRequestTimeout(), this.pubnub.getConfiguration().getConnectTimeout());
            prepareOkHttpClient.a(this.signatureInterceptor);
            prepareOkHttpClient.f = false;
            this.transactionClientInstance = createOkHttpClient(prepareOkHttpClient);
            a0.a prepareOkHttpClient2 = prepareOkHttpClient(this.pubnub.getConfiguration().getSubscribeTimeout(), this.pubnub.getConfiguration().getConnectTimeout());
            prepareOkHttpClient2.a(this.signatureInterceptor);
            prepareOkHttpClient2.f = false;
            this.subscriptionClientInstance = createOkHttpClient(prepareOkHttpClient2);
            a0.a prepareOkHttpClient3 = prepareOkHttpClient(this.pubnub.getConfiguration().getSubscribeTimeout(), this.pubnub.getConfiguration().getConnectTimeout());
            prepareOkHttpClient3.f = false;
            this.noSignatureClientInstance = createOkHttpClient(prepareOkHttpClient3);
        }
        w createRetrofit = createRetrofit(this.transactionClientInstance);
        this.transactionInstance = createRetrofit;
        w createRetrofit2 = createRetrofit(this.subscriptionClientInstance);
        this.subscriptionInstance = createRetrofit2;
        w createRetrofit3 = createRetrofit(this.noSignatureClientInstance);
        this.noSignatureInstance = createRetrofit3;
        this.presenceService = (PresenceService) createRetrofit.b(PresenceService.class);
        this.historyService = (HistoryService) createRetrofit.b(HistoryService.class);
        this.pushService = (PushService) createRetrofit.b(PushService.class);
        this.accessManagerService = (AccessManagerService) createRetrofit.b(AccessManagerService.class);
        this.channelGroupService = (ChannelGroupService) createRetrofit.b(ChannelGroupService.class);
        this.publishService = (PublishService) createRetrofit.b(PublishService.class);
        this.subscribeService = (SubscribeService) createRetrofit2.b(SubscribeService.class);
        this.timeService = (TimeService) createRetrofit2.b(TimeService.class);
        this.signalService = (SignalService) createRetrofit.b(SignalService.class);
        this.uuidMetadataService = (UUIDMetadataService) createRetrofit.b(UUIDMetadataService.class);
        this.channelMetadataService = (ChannelMetadataService) createRetrofit.b(ChannelMetadataService.class);
        this.messageActionService = (MessageActionService) createRetrofit.b(MessageActionService.class);
        this.filesService = (FilesService) createRetrofit.b(FilesService.class);
        this.s3Service = (S3Service) createRetrofit3.b(S3Service.class);
    }

    private void closeExecutor(a0 a0Var, boolean z) {
        Socket socket;
        q qVar = a0Var.x;
        synchronized (qVar) {
            Iterator<e.a> it = qVar.c.iterator();
            while (it.hasNext()) {
                it.next().q.cancel();
            }
            Iterator<e.a> it2 = qVar.d.iterator();
            while (it2.hasNext()) {
                it2.next().q.cancel();
            }
            Iterator<e> it3 = qVar.e.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        }
        if (z) {
            h hVar = a0Var.y.a;
            Iterator<g> it4 = hVar.d.iterator();
            i.d(it4, "connections.iterator()");
            while (it4.hasNext()) {
                g next = it4.next();
                i.d(next, "connection");
                synchronized (next) {
                    if (next.o.isEmpty()) {
                        it4.remove();
                        next.i = true;
                        socket = next.c;
                        i.c(socket);
                    } else {
                        socket = null;
                    }
                }
                if (socket != null) {
                    c.e(socket);
                }
            }
            if (hVar.d.isEmpty()) {
                hVar.b.a();
            }
            a0Var.x.a().shutdown();
        }
    }

    private a0 createOkHttpClient(a0.a aVar) {
        Objects.requireNonNull(aVar);
        a0 a0Var = new a0(aVar);
        if (this.pubnub.getConfiguration().getMaximumConnections() != null) {
            q qVar = a0Var.x;
            int intValue = this.pubnub.getConfiguration().getMaximumConnections().intValue();
            Objects.requireNonNull(qVar);
            boolean z = true;
            if (intValue < 1) {
                z = false;
            }
            if (z) {
                synchronized (qVar) {
                    qVar.a = intValue;
                }
                qVar.d();
            } else {
                throw new IllegalArgumentException(a.e0("max < 1: ", intValue).toString());
            }
        }
        return a0Var;
    }

    private w createRetrofit(a0 a0Var) {
        return createRetrofit(a0Var, this.pubnub.getBaseUrl());
    }

    private a0.a prepareOkHttpClient(int i, int i2) {
        PNConfiguration configuration = this.pubnub.getConfiguration();
        a0.a aVar = new a0.a();
        long j = (long) i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.e(timeUnit, "unit");
        aVar.z = c.b("timeout", j, timeUnit);
        i.e(timeUnit, "unit");
        aVar.y = c.b("timeout", (long) i2, timeUnit);
        if (this.pubnub.getConfiguration().getLogVerbosity() == PNLogVerbosity.BODY) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
            i.e(level, "level");
            httpLoggingInterceptor.b = level;
            aVar.a(httpLoggingInterceptor);
        }
        if (this.pubnub.getConfiguration().getHttpLoggingInterceptor() != null) {
            aVar.a(this.pubnub.getConfiguration().getHttpLoggingInterceptor());
        }
        if (!(configuration.getSslSocketFactory() == null || configuration.getX509ExtendedTrustManager() == null)) {
            SSLSocketFactory sslSocketFactory = configuration.getSslSocketFactory();
            X509ExtendedTrustManager x509ExtendedTrustManager = configuration.getX509ExtendedTrustManager();
            i.e(sslSocketFactory, "sslSocketFactory");
            i.e(x509ExtendedTrustManager, "trustManager");
            if ((!i.a(sslSocketFactory, aVar.q)) || (!i.a(x509ExtendedTrustManager, aVar.r))) {
                aVar.D = null;
            }
            aVar.q = sslSocketFactory;
            i.e(x509ExtendedTrustManager, "trustManager");
            h.a aVar2 = q0.h0.l.h.c;
            aVar.w = q0.h0.l.h.a.b(x509ExtendedTrustManager);
            aVar.r = x509ExtendedTrustManager;
        }
        if (configuration.getConnectionSpec() != null) {
            List singletonList = Collections.singletonList(configuration.getConnectionSpec());
            i.e(singletonList, "connectionSpecs");
            if (!i.a(singletonList, aVar.s)) {
                aVar.D = null;
            }
            aVar.s = c.x(singletonList);
        }
        if (configuration.getHostnameVerifier() != null) {
            HostnameVerifier hostnameVerifier = configuration.getHostnameVerifier();
            i.e(hostnameVerifier, "hostnameVerifier");
            if (!i.a(hostnameVerifier, aVar.u)) {
                aVar.D = null;
            }
            aVar.u = hostnameVerifier;
        }
        if (this.pubnub.getConfiguration().getProxy() != null) {
            Proxy proxy = this.pubnub.getConfiguration().getProxy();
            if (!i.a(proxy, aVar.m)) {
                aVar.D = null;
            }
            aVar.m = proxy;
        }
        if (this.pubnub.getConfiguration().getProxySelector() != null) {
            ProxySelector proxySelector = this.pubnub.getConfiguration().getProxySelector();
            i.e(proxySelector, "proxySelector");
            if (!i.a(proxySelector, aVar.n)) {
                aVar.D = null;
            }
            aVar.n = proxySelector;
        }
        if (this.pubnub.getConfiguration().getProxyAuthenticator() != null) {
            q0.c proxyAuthenticator = this.pubnub.getConfiguration().getProxyAuthenticator();
            i.e(proxyAuthenticator, "proxyAuthenticator");
            if (!i.a(proxyAuthenticator, aVar.o)) {
                aVar.D = null;
            }
            aVar.o = proxyAuthenticator;
        }
        if (this.pubnub.getConfiguration().getCertificatePinner() != null) {
            q0.h certificatePinner = this.pubnub.getConfiguration().getCertificatePinner();
            i.e(certificatePinner, "certificatePinner");
            if (!i.a(certificatePinner, aVar.v)) {
                aVar.D = null;
            }
            aVar.v = certificatePinner;
        }
        return aVar;
    }

    public void destroy(boolean z) {
        a0 a0Var = this.transactionClientInstance;
        if (a0Var != null) {
            closeExecutor(a0Var, z);
        }
        a0 a0Var2 = this.subscriptionClientInstance;
        if (a0Var2 != null) {
            closeExecutor(a0Var2, z);
        }
        a0 a0Var3 = this.noSignatureClientInstance;
        if (a0Var3 != null) {
            closeExecutor(a0Var3, z);
        }
    }

    public AccessManagerService getAccessManagerService() {
        return this.accessManagerService;
    }

    public ChannelGroupService getChannelGroupService() {
        return this.channelGroupService;
    }

    public ChannelMetadataService getChannelMetadataService() {
        return this.channelMetadataService;
    }

    public FilesService getFilesService() {
        return this.filesService;
    }

    public HistoryService getHistoryService() {
        return this.historyService;
    }

    public MessageActionService getMessageActionService() {
        return this.messageActionService;
    }

    public w getNoSignatureInstance() {
        return this.noSignatureInstance;
    }

    public PresenceService getPresenceService() {
        return this.presenceService;
    }

    public PublishService getPublishService() {
        return this.publishService;
    }

    public PushService getPushService() {
        return this.pushService;
    }

    public S3Service getS3Service() {
        return this.s3Service;
    }

    public SignalService getSignalService() {
        return this.signalService;
    }

    public SubscribeService getSubscribeService() {
        return this.subscribeService;
    }

    public w getSubscriptionInstance() {
        return this.subscriptionInstance;
    }

    public TimeService getTimeService() {
        return this.timeService;
    }

    public ExecutorService getTransactionClientExecutorService() {
        return this.transactionClientInstance.x.a();
    }

    public w getTransactionInstance() {
        return this.transactionInstance;
    }

    public UUIDMetadataService getUuidMetadataService() {
        return this.uuidMetadataService;
    }

    private w createRetrofit(a0 a0Var, String str) {
        w.b bVar = new w.b();
        if (this.pubnub.getConfiguration().isGoogleAppEngineNetworking()) {
            bVar.b = new AppEngineFactory.Factory(this.pubnub);
        }
        bVar.b(str);
        bVar.a(this.pubnub.getMapper().getConverterFactory());
        if (!this.pubnub.getConfiguration().isGoogleAppEngineNetworking()) {
            bVar.d(a0Var);
        }
        return bVar.c();
    }
}
