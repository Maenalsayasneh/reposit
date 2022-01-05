package com.stripe.android.stripe3ds2.observability;

import android.content.Context;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.State;
import com.stripe.android.stripe3ds2.transaction.Logger;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineStart;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 <2\u00020\u0001:\u0003<=>BU\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u00102\u001a\u00020\u000f\u0012\b\b\u0002\u00109\u001a\u00020\u000f\u0012\b\b\u0002\u00107\u001a\u00020\t¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0001¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010%\u001a\u00020\u000fH\u0001¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00103¨\u0006?"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lorg/json/JSONObject;", "requestBody", "Lm0/i;", "send", "(Lorg/json/JSONObject;)V", "Ljavax/net/ssl/HttpsURLConnection;", "connection", "", "responseCode", "logResponse", "(Ljavax/net/ssl/HttpsURLConnection;I)V", "Ljava/io/InputStream;", "responseStream", "", "getResponseBody", "(Ljava/io/InputStream;)Ljava/lang/String;", "createPostConnection", "()Ljavax/net/ssl/HttpsURLConnection;", "openConnection", "", "exception", "onFailure", "(Ljava/lang/Throwable;)V", "t", "reportError", "createRequestBody$3ds2sdk_release", "(Ljava/lang/Throwable;)Lorg/json/JSONObject;", "createRequestBody", "createRequestContexts$3ds2sdk_release", "()Lorg/json/JSONObject;", "createRequestContexts", "createRequestStacktrace$3ds2sdk_release", "createRequestStacktrace", "createSentryAuthHeader$3ds2sdk_release", "()Ljava/lang/String;", "createSentryAuthHeader", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "sentryConfig", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "config", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "environment", "Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "osVersion", "I", "localeCountry", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;Lm0/l/e;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/SentryConfig;Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "Config", "EmptyConfig", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultErrorReporter.kt */
public final class DefaultErrorReporter implements ErrorReporter {
    @Deprecated
    private static final String CHARSET = StandardCharsets.UTF_8.name();
    @Deprecated
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    @Deprecated
    private static final String HEADER_SENTRY_AUTH = "X-Sentry-Auth";
    @Deprecated
    private static final String HEADER_USER_AGENT = "User-Agent";
    @Deprecated
    private static final String HOST = "https://errors.stripe.com";
    @Deprecated
    private static final String HTTP_METHOD = "POST";
    @Deprecated
    private static final String USER_AGENT = "Android3ds2Sdk 5.3.1";
    private final Config config;
    private final Context context;
    private final String environment;
    private final String localeCountry;
    private final Logger logger;
    private final int osVersion;
    private final SentryConfig sentryConfig;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Companion;", "", "", "kotlin.jvm.PlatformType", "CHARSET", "Ljava/lang/String;", "CONTENT_TYPE", "HEADER_CONTENT_TYPE", "HEADER_SENTRY_AUTH", "HEADER_USER_AGENT", "HOST", "HTTP_METHOD", "USER_AGENT", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultErrorReporter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "", "", "", "getCustomTags", "()Ljava/util/Map;", "customTags", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultErrorReporter.kt */
    public interface Config {
        Map<String, String> getCustomTags();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$EmptyConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "", "", "customTags", "Ljava/util/Map;", "getCustomTags", "()Ljava/util/Map;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultErrorReporter.kt */
    public static final class EmptyConfig implements Config {
        public static final EmptyConfig INSTANCE = new EmptyConfig();
        private static final Map<String, String> customTags = g.o();

        private EmptyConfig() {
        }

        public Map<String, String> getCustomTags() {
            return customTags;
        }
    }

    public DefaultErrorReporter(Context context2, Config config2, e eVar, Logger logger2, SentryConfig sentryConfig2, String str, String str2, int i) {
        i.e(context2, "context");
        i.e(config2, "config");
        i.e(eVar, "workContext");
        i.e(logger2, "logger");
        i.e(sentryConfig2, "sentryConfig");
        i.e(str, "environment");
        i.e(str2, "localeCountry");
        this.context = context2;
        this.config = config2;
        this.workContext = eVar;
        this.logger = logger2;
        this.sentryConfig = sentryConfig2;
        this.environment = str;
        this.localeCountry = str2;
        this.osVersion = i;
    }

    private final HttpsURLConnection createPostConnection() {
        HttpsURLConnection openConnection = openConnection();
        openConnection.setRequestMethod("POST");
        openConnection.setDoOutput(true);
        for (Map.Entry entry : g.N(new Pair("Content-Type", CONTENT_TYPE), new Pair(HEADER_USER_AGENT, USER_AGENT), new Pair(HEADER_SENTRY_AUTH, createSentryAuthHeader$3ds2sdk_release())).entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return openConnection;
    }

    private final String getResponseBody(InputStream inputStream) {
        Object obj;
        Object obj2 = null;
        try {
            Scanner useDelimiter = new Scanner(inputStream, CHARSET).useDelimiter("\\A");
            obj = useDelimiter.hasNext() ? useDelimiter.next() : null;
            inputStream.close();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (!(obj instanceof Result.Failure)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    private final void logResponse(HttpsURLConnection httpsURLConnection, int i) {
    }

    /* access modifiers changed from: private */
    public final void onFailure(Throwable th) {
        this.logger.error("Failed to send error report.", th);
    }

    private final HttpsURLConnection openConnection() {
        StringBuilder P0 = a.P0("https://errors.stripe.com/api/");
        P0.append(this.sentryConfig.getProjectId());
        P0.append("/store/");
        URLConnection openConnection = new URL(P0.toString()).openConnection();
        Objects.requireNonNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) openConnection;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        i0.j.f.p.h.H(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        i0.j.f.p.h.H(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void send(org.json.JSONObject r5) {
        /*
            r4 = this;
            javax.net.ssl.HttpsURLConnection r0 = r4.createPostConnection()
            java.io.OutputStream r1 = r0.getOutputStream()
            java.lang.String r2 = "os"
            m0.n.b.i.d(r1, r2)     // Catch:{ all -> 0x003f }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "StandardCharsets.UTF_8"
            m0.n.b.i.d(r2, r3)     // Catch:{ all -> 0x003f }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x003f }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0038 }
            r3.write(r5)     // Catch:{ all -> 0x0038 }
            r3.flush()     // Catch:{ all -> 0x0038 }
            r5 = 0
            i0.j.f.p.h.H(r3, r5)     // Catch:{ all -> 0x003f }
            i0.j.f.p.h.H(r1, r5)
            r0.connect()
            int r5 = r0.getResponseCode()
            r4.logResponse(r0, r5)
            r0.disconnect()
            return
        L_0x0038:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            i0.j.f.p.h.H(r3, r5)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            i0.j.f.p.h.H(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.send(org.json.JSONObject):void");
    }

    public final /* synthetic */ JSONObject createRequestBody$3ds2sdk_release(Throwable th) {
        i.e(th, "t");
        JSONObject put = new JSONObject().put("release", (Object) "com.stripe.android.stripe3ds2@5.3.1+13");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", (Object) th.getClass().getCanonicalName());
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put.put("exception", (Object) jSONObject.put("values", (Object) jSONArray.put((Object) put2.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (Object) message).put("stacktrace", (Object) createRequestStacktrace$3ds2sdk_release(th)))));
        JSONObject put4 = new JSONObject().put(State.KEY_LOCALE, (Object) this.localeCountry).put("environment", (Object) this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry next : this.config.getCustomTags().entrySet()) {
            put4.put((String) next.getKey(), (Object) (String) next.getValue());
        }
        JSONObject put5 = put3.put(State.KEY_TAGS, (Object) put4).put("contexts", (Object) createRequestContexts$3ds2sdk_release());
        i.d(put5, "JSONObject()\n           … createRequestContexts())");
        return put5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = r1.applicationInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject createRequestContexts$3ds2sdk_release() {
        /*
            r8 = this;
            r0 = 0
            android.content.Context r1 = r8.context     // Catch:{ all -> 0x0012 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0012 }
            android.content.Context r2 = r8.context     // Catch:{ all -> 0x0012 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x0012 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r1 = move-exception
            java.lang.Object r1 = i0.j.f.p.h.l0(r1)
        L_0x0017:
            boolean r2 = r1 instanceof kotlin.Result.Failure
            r3 = 0
            if (r2 == 0) goto L_0x001d
            r1 = r3
        L_0x001d:
            android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1
            if (r1 == 0) goto L_0x0030
            android.content.pm.ApplicationInfo r2 = r1.applicationInfo
            if (r2 == 0) goto L_0x0030
            android.content.Context r4 = r8.context
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.CharSequence r2 = r2.loadLabel(r4)
            goto L_0x0031
        L_0x0030:
            r2 = r3
        L_0x0031:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            android.content.Context r6 = r8.context
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "app_identifier"
            org.json.JSONObject r5 = r5.put((java.lang.String) r7, (java.lang.Object) r6)
            java.lang.String r6 = "app_name"
            org.json.JSONObject r2 = r5.put((java.lang.String) r6, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0051
            java.lang.String r3 = r1.versionName
        L_0x0051:
            if (r3 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            java.lang.String r1 = "app_version"
            org.json.JSONObject r1 = r2.put((java.lang.String) r1, (java.lang.Object) r3)
            java.lang.String r2 = "app"
            org.json.JSONObject r1 = r4.put((java.lang.String) r2, (java.lang.Object) r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "name"
            java.lang.String r4 = "Android"
            org.json.JSONObject r2 = r2.put((java.lang.String) r3, (java.lang.Object) r4)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r4 = "version"
            org.json.JSONObject r2 = r2.put((java.lang.String) r4, (java.lang.Object) r3)
            java.lang.String r3 = android.os.Build.TYPE
            java.lang.String r4 = "type"
            org.json.JSONObject r2 = r2.put((java.lang.String) r4, (java.lang.Object) r3)
            java.lang.String r5 = android.os.Build.DISPLAY
            java.lang.String r6 = "build"
            org.json.JSONObject r2 = r2.put((java.lang.String) r6, (java.lang.Object) r5)
            java.lang.String r5 = "os"
            org.json.JSONObject r1 = r1.put((java.lang.String) r5, (java.lang.Object) r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r5 = android.os.Build.ID
            java.lang.String r6 = "model_id"
            org.json.JSONObject r2 = r2.put((java.lang.String) r6, (java.lang.Object) r5)
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r6 = "model"
            org.json.JSONObject r2 = r2.put((java.lang.String) r6, (java.lang.Object) r5)
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r6 = "manufacturer"
            org.json.JSONObject r2 = r2.put((java.lang.String) r6, (java.lang.Object) r5)
            org.json.JSONObject r2 = r2.put((java.lang.String) r4, (java.lang.Object) r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String[] r4 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r5 = "Build.SUPPORTED_ABIS"
            m0.n.b.i.d(r4, r5)
            int r5 = r4.length
        L_0x00bb:
            if (r0 >= r5) goto L_0x00c5
            r6 = r4[r0]
            r3.put((java.lang.Object) r6)
            int r0 = r0 + 1
            goto L_0x00bb
        L_0x00c5:
            java.lang.String r0 = "archs"
            org.json.JSONObject r0 = r2.put((java.lang.String) r0, (java.lang.Object) r3)
            java.lang.String r2 = "device"
            org.json.JSONObject r0 = r1.put((java.lang.String) r2, (java.lang.Object) r0)
            java.lang.String r1 = "JSONObject()\n           …          )\n            )"
            m0.n.b.i.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.createRequestContexts$3ds2sdk_release():org.json.JSONObject");
    }

    public final JSONObject createRequestStacktrace$3ds2sdk_release(Throwable th) {
        List<StackTraceElement> list;
        i.e(th, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = th.getStackTrace();
        i.d(stackTrace, "t.stackTrace");
        i.e(stackTrace, "$this$reversed");
        if (stackTrace.length == 0) {
            list = EmptyList.c;
        } else {
            list = h.m4(stackTrace);
            i.e(list, "$this$reverse");
            Collections.reverse(list);
        }
        for (StackTraceElement stackTraceElement : list) {
            JSONObject jSONObject2 = new JSONObject();
            i.d(stackTraceElement, "el");
            jSONArray.put((Object) jSONObject2.put("lineno", stackTraceElement.getLineNumber()).put("filename", (Object) stackTraceElement.getClassName()).put("function", (Object) stackTraceElement.getMethodName()));
        }
        JSONObject put = jSONObject.put("frames", (Object) jSONArray);
        i.d(put, "JSONObject()\n           …          }\n            )");
        return put;
    }

    public final String createSentryAuthHeader$3ds2sdk_release() {
        return g.E(g.K("Sentry", g.E(g.K(new Pair("sentry_key", this.sentryConfig.getKey()), new Pair("sentry_version", this.sentryConfig.getVersion()), new Pair("sentry_timestamp", this.sentryConfig.getTimestamp()), new Pair("sentry_client", USER_AGENT), new Pair("sentry_secret", this.sentryConfig.getSecret())), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, DefaultErrorReporter$createSentryAuthHeader$1.INSTANCE, 30)), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public void reportError(Throwable th) {
        i.e(th, "t");
        m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new DefaultErrorReporter$reportError$1(this, th, (c) null), 3, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultErrorReporter(android.content.Context r9, com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config r10, m0.l.e r11, com.stripe.android.stripe3ds2.transaction.Logger r12, com.stripe.android.stripe3ds2.observability.SentryConfig r13, java.lang.String r14, java.lang.String r15, int r16, int r17, m0.n.b.f r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$EmptyConfig r1 = com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.EmptyConfig.INSTANCE
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0011
            n0.a.d0 r2 = n0.a.m0.c
            goto L_0x0012
        L_0x0011:
            r2 = r11
        L_0x0012:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x001d
            com.stripe.android.stripe3ds2.transaction.Logger$Companion r3 = com.stripe.android.stripe3ds2.transaction.Logger.Companion
            com.stripe.android.stripe3ds2.transaction.Logger r3 = r3.noop$3ds2sdk_release()
            goto L_0x001e
        L_0x001d:
            r3 = r12
        L_0x001e:
            r4 = r0 & 16
            if (r4 == 0) goto L_0x0025
            com.stripe.android.stripe3ds2.observability.DefaultSentryConfig r4 = com.stripe.android.stripe3ds2.observability.DefaultSentryConfig.INSTANCE
            goto L_0x0026
        L_0x0025:
            r4 = r13
        L_0x0026:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x002d
            java.lang.String r5 = "release"
            goto L_0x002e
        L_0x002d:
            r5 = r14
        L_0x002e:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0045
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = "Locale.getDefault()"
            m0.n.b.i.d(r6, r7)
            java.lang.String r6 = r6.getCountry()
            java.lang.String r7 = "Locale.getDefault().country"
            m0.n.b.i.d(r6, r7)
            goto L_0x0046
        L_0x0045:
            r6 = r15
        L_0x0046:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004d
            int r0 = android.os.Build.VERSION.SDK_INT
            goto L_0x004f
        L_0x004d:
            r0 = r16
        L_0x004f:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.<init>(android.content.Context, com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$Config, m0.l.e, com.stripe.android.stripe3ds2.transaction.Logger, com.stripe.android.stripe3ds2.observability.SentryConfig, java.lang.String, java.lang.String, int, int, m0.n.b.f):void");
    }
}
