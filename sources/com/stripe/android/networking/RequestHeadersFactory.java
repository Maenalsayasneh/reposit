package com.stripe.android.networking;

import com.instabug.library.model.NetworkLog;
import com.instabug.library.model.State;
import com.instabug.library.networkv2.request.Header;
import com.stripe.android.AppInfo;
import com.stripe.android.Stripe;
import com.stripe.android.networking.ApiRequest;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.t.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \r2\u00020\u0001:\u0004\u000e\u000f\r\u0010B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00038$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory;", "", "", "", "create", "()Ljava/util/Map;", "getExtraHeaders", "extraHeaders", "getUserAgent", "()Ljava/lang/String;", "userAgent", "<init>", "()V", "Companion", "Analytics", "Api", "FraudDetection", "Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/networking/RequestHeadersFactory$Analytics;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: RequestHeadersFactory.kt */
public abstract class RequestHeadersFactory {
    private static final String CHARSET = a.a.name();
    public static final Companion Companion = new Companion((f) null);
    private static final String HEADER_ACCEPT_CHARSET = "Accept-Charset";
    private static final String HEADER_USER_AGENT = "User-Agent";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0014@\u0014X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0014@\u0014X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "", "userAgent", "Ljava/lang/String;", "getUserAgent", "()Ljava/lang/String;", "", "extraHeaders", "Ljava/util/Map;", "getExtraHeaders", "()Ljava/util/Map;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: RequestHeadersFactory.kt */
    public static final class Analytics extends RequestHeadersFactory {
        public static final Analytics INSTANCE = new Analytics();
        private static final Map<String, String> extraHeaders = g.o();
        private static final String userAgent = RequestHeadersFactory.Companion.getUserAgent$payments_core_release(Stripe.VERSION);

        private Analytics() {
            super((f) null);
        }

        public Map<String, String> getExtraHeaders() {
            return extraHeaders;
        }

        public String getUserAgent() {
            return userAgent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Companion;", "", "", "sdkVersion", "getUserAgent$payments_core_release", "(Ljava/lang/String;)Ljava/lang/String;", "getUserAgent", "kotlin.jvm.PlatformType", "CHARSET", "Ljava/lang/String;", "HEADER_ACCEPT_CHARSET", "HEADER_USER_AGENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: RequestHeadersFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String getUserAgent$payments_core_release$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = Stripe.VERSION;
            }
            return companion.getUserAgent$payments_core_release(str);
        }

        public final String getUserAgent$payments_core_release(String str) {
            i.e(str, "sdkVersion");
            return "Stripe/v1 " + str;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0014@\u0014X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00038\u0014@\u0014X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "", "", "extraHeaders", "Ljava/util/Map;", "getExtraHeaders", "()Ljava/util/Map;", "userAgent", "Ljava/lang/String;", "getUserAgent", "()Ljava/lang/String;", "guid", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: RequestHeadersFactory.kt */
    public static final class FraudDetection extends RequestHeadersFactory {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String HEADER_COOKIE = "Cookie";
        private final Map<String, String> extraHeaders;
        private final String userAgent = RequestHeadersFactory.Companion.getUserAgent$payments_core_release(Stripe.VERSION);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection$Companion;", "", "", "HEADER_COOKIE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: RequestHeadersFactory.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FraudDetection(String str) {
            super((f) null);
            i.e(str, "guid");
            this.extraHeaders = i0.d.a.a.a.n1(HEADER_COOKIE, i0.d.a.a.a.n0("m=", str));
        }

        public Map<String, String> getExtraHeaders() {
            return this.extraHeaders;
        }

        public String getUserAgent() {
            return this.userAgent;
        }
    }

    private RequestHeadersFactory() {
    }

    public final Map<String, String> create() {
        return g.b0(getExtraHeaders(), g.N(new Pair(HEADER_USER_AGENT, getUserAgent()), new Pair("Accept-Charset", CHARSET)));
    }

    public abstract Map<String, String> getExtraHeaders();

    public abstract String getUserAgent();

    public /* synthetic */ RequestHeadersFactory(f fVar) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBO\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "", "sdkVersion", "Ljava/lang/String;", "getUserAgent", "()Ljava/lang/String;", "userAgent", "apiVersion", "Lcom/stripe/android/AppInfo;", "appInfo", "Lcom/stripe/android/AppInfo;", "Lcom/stripe/android/networking/ApiRequest$Options;", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "getLanguageTag", "languageTag", "Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory;", "stripeClientUserAgentHeaderFactory", "Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory;", "Lkotlin/Function1;", "systemPropertySupplier", "<init>", "(Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Ljava/util/Locale;Lm0/n/a/l;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: RequestHeadersFactory.kt */
    public static final class Api extends RequestHeadersFactory {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final l<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = RequestHeadersFactory$Api$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1.INSTANCE;
        private final String apiVersion;
        private final AppInfo appInfo;
        private final Locale locale;
        private final ApiRequest.Options options;
        private final String sdkVersion;
        private final StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Api$Companion;", "", "Lkotlin/Function1;", "", "DEFAULT_SYSTEM_PROPERTY_SUPPLIER", "Lm0/n/a/l;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: RequestHeadersFactory.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Api(com.stripe.android.networking.ApiRequest.Options r8, com.stripe.android.AppInfo r9, java.util.Locale r10, m0.n.a.l<java.lang.String, java.lang.String> r11, java.lang.String r12, java.lang.String r13, int r14, m0.n.b.f r15) {
            /*
                r7 = this;
                r15 = r14 & 2
                if (r15 == 0) goto L_0x0005
                r9 = 0
            L_0x0005:
                r2 = r9
                r9 = r14 & 4
                if (r9 == 0) goto L_0x0013
                java.util.Locale r10 = java.util.Locale.getDefault()
                java.lang.String r9 = "Locale.getDefault()"
                m0.n.b.i.d(r10, r9)
            L_0x0013:
                r3 = r10
                r9 = r14 & 8
                if (r9 == 0) goto L_0x001a
                m0.n.a.l<java.lang.String, java.lang.String> r11 = DEFAULT_SYSTEM_PROPERTY_SUPPLIER
            L_0x001a:
                r4 = r11
                r9 = r14 & 16
                if (r9 == 0) goto L_0x0029
                com.stripe.android.ApiVersion$Companion r9 = com.stripe.android.ApiVersion.Companion
                com.stripe.android.ApiVersion r9 = r9.get$payments_core_release()
                java.lang.String r12 = r9.getCode()
            L_0x0029:
                r5 = r12
                r9 = r14 & 32
                if (r9 == 0) goto L_0x0030
                java.lang.String r13 = "AndroidBindings/16.10.0"
            L_0x0030:
                r6 = r13
                r0 = r7
                r1 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.RequestHeadersFactory.Api.<init>(com.stripe.android.networking.ApiRequest$Options, com.stripe.android.AppInfo, java.util.Locale, m0.n.a.l, java.lang.String, java.lang.String, int, m0.n.b.f):void");
        }

        private final String getLanguageTag() {
            String locale2 = this.locale.toString();
            i.d(locale2, "locale.toString()");
            String B = StringsKt__IndentKt.B(locale2, "_", "-", false, 4);
            if (!StringsKt__IndentKt.o(B)) {
                return B;
            }
            return null;
        }

        public Map<String, String> getExtraHeaders() {
            StringBuilder P0 = i0.d.a.a.a.P0("Bearer ");
            P0.append(this.options.getApiKey());
            Map<String, String> b0 = g.b0(g.N(new Pair("Accept", NetworkLog.JSON), new Pair("Stripe-Version", this.apiVersion), new Pair(Header.AUTHORIZATION, P0.toString())), this.stripeClientUserAgentHeaderFactory.create(this.appInfo));
            String stripeAccount$payments_core_release = this.options.getStripeAccount$payments_core_release();
            Map map = null;
            Map n1 = stripeAccount$payments_core_release != null ? i0.d.a.a.a.n1("Stripe-Account", stripeAccount$payments_core_release) : null;
            if (n1 == null) {
                n1 = g.o();
            }
            Map<String, String> b02 = g.b0(b0, n1);
            String idempotencyKey$payments_core_release = this.options.getIdempotencyKey$payments_core_release();
            Map n12 = idempotencyKey$payments_core_release != null ? i0.d.a.a.a.n1("Idempotency-Key", idempotencyKey$payments_core_release) : null;
            if (n12 == null) {
                n12 = g.o();
            }
            Map<String, String> b03 = g.b0(b02, n12);
            String languageTag = getLanguageTag();
            if (languageTag != null) {
                map = i0.d.a.a.a.n1("Accept-Language", languageTag);
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b03, map);
        }

        public String getUserAgent() {
            String[] strArr = new String[2];
            strArr[0] = RequestHeadersFactory.Companion.getUserAgent$payments_core_release(this.sdkVersion);
            AppInfo appInfo2 = this.appInfo;
            strArr[1] = appInfo2 != null ? appInfo2.toUserAgent$payments_core_release() : null;
            return g.E(g.M(strArr), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Api(ApiRequest.Options options2, AppInfo appInfo2, Locale locale2, l<? super String, String> lVar, String str, String str2) {
            super((f) null);
            i.e(options2, "options");
            i.e(locale2, State.KEY_LOCALE);
            i.e(lVar, "systemPropertySupplier");
            i.e(str, "apiVersion");
            i.e(str2, "sdkVersion");
            this.options = options2;
            this.appInfo = appInfo2;
            this.locale = locale2;
            this.apiVersion = str;
            this.sdkVersion = str2;
            this.stripeClientUserAgentHeaderFactory = new StripeClientUserAgentHeaderFactory(lVar);
        }
    }
}
