package com.stripe.android.networking;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.ApiKeyValidator;
import com.stripe.android.ApiVersion;
import com.stripe.android.AppInfo;
import com.stripe.android.Stripe;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.networking.RequestHeadersFactory;
import com.stripe.android.networking.StripeRequest;
import i0.d.a.a.a;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u0000 B2\u00020\u0001:\u0003BCDBm\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0014HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016Jz\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010+\u001a\u00020*8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00068T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\nR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u001c\u0010\u0018\u001a\u00020\r8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u0010\u000fR(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u00118\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b5\u0010\u0013R\u001c\u00107\u001a\u0002068\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010;R\u001c\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\b=\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\u00068\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b>\u0010\nR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010?R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101¨\u0006E"}, d2 = {"Lcom/stripe/android/networking/ApiRequest;", "Lcom/stripe/android/networking/StripeRequest;", "Lcom/stripe/android/AppInfo;", "component5", "()Lcom/stripe/android/AppInfo;", "Lkotlin/Function1;", "", "component6", "()Lm0/n/a/l;", "component7", "()Ljava/lang/String;", "component8", "toString", "Lcom/stripe/android/networking/StripeRequest$Method;", "component1", "()Lcom/stripe/android/networking/StripeRequest$Method;", "component2", "", "component3", "()Ljava/util/Map;", "Lcom/stripe/android/networking/ApiRequest$Options;", "component4$payments_core_release", "()Lcom/stripe/android/networking/ApiRequest$Options;", "component4", "method", "baseUrl", "params", "options", "appInfo", "systemPropertySupplier", "apiVersion", "sdkVersion", "copy", "(Lcom/stripe/android/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Lm0/n/a/l;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/networking/ApiRequest;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/networking/StripeRequest$MimeType;", "getBody", "body", "Ljava/lang/String;", "Lcom/stripe/android/networking/StripeRequest$Method;", "getMethod", "Ljava/util/Map;", "getParams", "Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "getHeadersFactory", "()Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "Lm0/n/a/l;", "Lcom/stripe/android/networking/ApiRequest$Options;", "getOptions$payments_core_release", "getBaseUrl", "Lcom/stripe/android/AppInfo;", "<init>", "(Lcom/stripe/android/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Lm0/n/a/l;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Factory", "Options", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiRequest.kt */
public final class ApiRequest extends StripeRequest {
    public static final String API_HOST = "https://api.stripe.com";
    public static final Companion Companion = new Companion((f) null);
    private final String apiVersion;
    private final AppInfo appInfo;
    private final String baseUrl;
    private final RequestHeadersFactory.Api headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Options options;
    private final Map<String, ?> params;
    private final String sdkVersion;
    private final l<String, String> systemPropertySupplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Companion;", "", "", "API_HOST", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ApiRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Factory;", "", "", "url", "Lcom/stripe/android/networking/ApiRequest$Options;", "options", "", "params", "Lcom/stripe/android/networking/ApiRequest;", "createGet", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/Map;)Lcom/stripe/android/networking/ApiRequest;", "createPost", "createDelete", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;)Lcom/stripe/android/networking/ApiRequest;", "Lcom/stripe/android/AppInfo;", "appInfo", "Lcom/stripe/android/AppInfo;", "apiVersion", "Ljava/lang/String;", "sdkVersion", "<init>", "(Lcom/stripe/android/AppInfo;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ApiRequest.kt */
    public static final class Factory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final String sdkVersion;

        public Factory() {
            this((AppInfo) null, (String) null, (String) null, 7, (f) null);
        }

        public Factory(AppInfo appInfo2, String str, String str2) {
            i.e(str, "apiVersion");
            i.e(str2, "sdkVersion");
            this.appInfo = appInfo2;
            this.apiVersion = str;
            this.sdkVersion = str2;
        }

        public static /* synthetic */ ApiRequest createGet$default(Factory factory, String str, Options options, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return factory.createGet(str, options, map);
        }

        public static /* synthetic */ ApiRequest createPost$default(Factory factory, String str, Options options, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return factory.createPost(str, options, map);
        }

        public final ApiRequest createDelete(String str, Options options) {
            i.e(str, "url");
            i.e(options, "options");
            return new ApiRequest(StripeRequest.Method.DELETE, str, (Map) null, options, this.appInfo, (l) null, this.apiVersion, this.sdkVersion, 36, (f) null);
        }

        public final ApiRequest createGet(String str, Options options, Map<String, ?> map) {
            i.e(str, "url");
            i.e(options, "options");
            return new ApiRequest(StripeRequest.Method.GET, str, map, options, this.appInfo, (l) null, this.apiVersion, this.sdkVersion, 32, (f) null);
        }

        public final ApiRequest createPost(String str, Options options, Map<String, ?> map) {
            i.e(str, "url");
            i.e(options, "options");
            return new ApiRequest(StripeRequest.Method.POST, str, map, options, this.appInfo, (l) null, this.apiVersion, this.sdkVersion, 32, (f) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Factory(AppInfo appInfo2, String str, String str2, int i, f fVar) {
            this((i & 1) != 0 ? null : appInfo2, (i & 2) != 0 ? ApiVersion.Companion.get$payments_core_release().getCode() : str, (i & 4) != 0 ? Stripe.VERSION : str2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApiRequest(com.stripe.android.networking.StripeRequest.Method r13, java.lang.String r14, java.util.Map r15, com.stripe.android.networking.ApiRequest.Options r16, com.stripe.android.AppInfo r17, m0.n.a.l r18, java.lang.String r19, java.lang.String r20, int r21, m0.n.b.f r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0010
            r8 = r2
            goto L_0x0012
        L_0x0010:
            r8 = r17
        L_0x0012:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001e
            com.stripe.android.networking.StripeRequest$Companion r1 = com.stripe.android.networking.StripeRequest.Companion
            m0.n.a.l r1 = r1.getDEFAULT_SYSTEM_PROPERTY_SUPPLIER$payments_core_release()
            r9 = r1
            goto L_0x0020
        L_0x001e:
            r9 = r18
        L_0x0020:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0030
            com.stripe.android.ApiVersion$Companion r1 = com.stripe.android.ApiVersion.Companion
            com.stripe.android.ApiVersion r1 = r1.get$payments_core_release()
            java.lang.String r1 = r1.getCode()
            r10 = r1
            goto L_0x0032
        L_0x0030:
            r10 = r19
        L_0x0032:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "AndroidBindings/16.10.0"
            r11 = r0
            goto L_0x003c
        L_0x003a:
            r11 = r20
        L_0x003c:
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.ApiRequest.<init>(com.stripe.android.networking.StripeRequest$Method, java.lang.String, java.util.Map, com.stripe.android.networking.ApiRequest$Options, com.stripe.android.AppInfo, m0.n.a.l, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }

    private final AppInfo component5() {
        return this.appInfo;
    }

    private final l<String, String> component6() {
        return this.systemPropertySupplier;
    }

    private final String component7() {
        return this.apiVersion;
    }

    private final String component8() {
        return this.sdkVersion;
    }

    public static /* synthetic */ ApiRequest copy$default(ApiRequest apiRequest, StripeRequest.Method method2, String str, Map map, Options options2, AppInfo appInfo2, l lVar, String str2, String str3, int i, Object obj) {
        ApiRequest apiRequest2 = apiRequest;
        int i2 = i;
        return apiRequest.copy((i2 & 1) != 0 ? apiRequest.getMethod() : method2, (i2 & 2) != 0 ? apiRequest.getBaseUrl() : str, (i2 & 4) != 0 ? apiRequest.getParams() : map, (i2 & 8) != 0 ? apiRequest2.options : options2, (i2 & 16) != 0 ? apiRequest2.appInfo : appInfo2, (i2 & 32) != 0 ? apiRequest2.systemPropertySupplier : lVar, (i2 & 64) != 0 ? apiRequest2.apiVersion : str2, (i2 & 128) != 0 ? apiRequest2.sdkVersion : str3);
    }

    public final StripeRequest.Method component1() {
        return getMethod();
    }

    public final String component2() {
        return getBaseUrl();
    }

    public final Map<String, ?> component3() {
        return getParams();
    }

    public final Options component4$payments_core_release() {
        return this.options;
    }

    public final ApiRequest copy(StripeRequest.Method method2, String str, Map<String, ?> map, Options options2, AppInfo appInfo2, l<? super String, String> lVar, String str2, String str3) {
        i.e(method2, "method");
        i.e(str, "baseUrl");
        i.e(options2, "options");
        l<? super String, String> lVar2 = lVar;
        i.e(lVar2, "systemPropertySupplier");
        String str4 = str2;
        i.e(str4, "apiVersion");
        String str5 = str3;
        i.e(str5, "sdkVersion");
        return new ApiRequest(method2, str, map, options2, appInfo2, lVar2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) obj;
        return i.a(getMethod(), apiRequest.getMethod()) && i.a(getBaseUrl(), apiRequest.getBaseUrl()) && i.a(getParams(), apiRequest.getParams()) && i.a(this.options, apiRequest.options) && i.a(this.appInfo, apiRequest.appInfo) && i.a(this.systemPropertySupplier, apiRequest.systemPropertySupplier) && i.a(this.apiVersion, apiRequest.apiVersion) && i.a(this.sdkVersion, apiRequest.sdkVersion);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getBody() throws UnsupportedEncodingException, InvalidRequestException {
        return getQuery();
    }

    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public final Options getOptions$payments_core_release() {
        return this.options;
    }

    public Map<String, ?> getParams() {
        return this.params;
    }

    public int hashCode() {
        StripeRequest.Method method2 = getMethod();
        int i = 0;
        int hashCode = (method2 != null ? method2.hashCode() : 0) * 31;
        String baseUrl2 = getBaseUrl();
        int hashCode2 = (hashCode + (baseUrl2 != null ? baseUrl2.hashCode() : 0)) * 31;
        Map<String, ?> params2 = getParams();
        int hashCode3 = (hashCode2 + (params2 != null ? params2.hashCode() : 0)) * 31;
        Options options2 = this.options;
        int hashCode4 = (hashCode3 + (options2 != null ? options2.hashCode() : 0)) * 31;
        AppInfo appInfo2 = this.appInfo;
        int hashCode5 = (hashCode4 + (appInfo2 != null ? appInfo2.hashCode() : 0)) * 31;
        l<String, String> lVar = this.systemPropertySupplier;
        int hashCode6 = (hashCode5 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.apiVersion;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.sdkVersion;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return getMethod().getCode() + ' ' + getBaseUrl();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 $2\u00020\u0001:\u0001$B)\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b \u0010\u0004R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010\u0004¨\u0006%"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Options;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2$payments_core_release", "component2", "component3$payments_core_release", "component3", "apiKey", "stripeAccount", "idempotencyKey", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/networking/ApiRequest$Options;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdempotencyKey$payments_core_release", "getStripeAccount$payments_core_release", "getApiKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ApiRequest.kt */
    public static final class Options implements Parcelable {
        public static final Parcelable.Creator<Options> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        public static final String UNDEFINED_PUBLISHABLE_KEY = "pk_undefined";
        private final String apiKey;
        private final String idempotencyKey;
        private final String stripeAccount;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Options$Companion;", "", "", "UNDEFINED_PUBLISHABLE_KEY", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ApiRequest.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Options> {
            public final Options createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Options[] newArray(int i) {
                return new Options[i];
            }
        }

        public Options(String str, String str2, String str3) {
            i.e(str, "apiKey");
            this.apiKey = str;
            this.stripeAccount = str2;
            this.idempotencyKey = str3;
            new ApiKeyValidator().requireValid(str);
        }

        public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = options.apiKey;
            }
            if ((i & 2) != 0) {
                str2 = options.stripeAccount;
            }
            if ((i & 4) != 0) {
                str3 = options.idempotencyKey;
            }
            return options.copy(str, str2, str3);
        }

        public final String component1() {
            return this.apiKey;
        }

        public final String component2$payments_core_release() {
            return this.stripeAccount;
        }

        public final String component3$payments_core_release() {
            return this.idempotencyKey;
        }

        public final Options copy(String str, String str2, String str3) {
            i.e(str, "apiKey");
            return new Options(str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return i.a(this.apiKey, options.apiKey) && i.a(this.stripeAccount, options.stripeAccount) && i.a(this.idempotencyKey, options.idempotencyKey);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getIdempotencyKey$payments_core_release() {
            return this.idempotencyKey;
        }

        public final String getStripeAccount$payments_core_release() {
            return this.stripeAccount;
        }

        public int hashCode() {
            String str = this.apiKey;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.stripeAccount;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.idempotencyKey;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Options(apiKey=");
            P0.append(this.apiKey);
            P0.append(", stripeAccount=");
            P0.append(this.stripeAccount);
            P0.append(", idempotencyKey=");
            return a.y0(P0, this.idempotencyKey, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.apiKey);
            parcel.writeString(this.stripeAccount);
            parcel.writeString(this.idempotencyKey);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Options(String str, String str2, String str3, int i, f fVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public RequestHeadersFactory.Api getHeadersFactory() {
        return this.headersFactory;
    }

    public ApiRequest(StripeRequest.Method method2, String str, Map<String, ?> map, Options options2, AppInfo appInfo2, l<? super String, String> lVar, String str2, String str3) {
        Options options3 = options2;
        l<? super String, String> lVar2 = lVar;
        String str4 = str2;
        String str5 = str3;
        i.e(method2, "method");
        i.e(str, "baseUrl");
        i.e(options3, "options");
        i.e(lVar2, "systemPropertySupplier");
        i.e(str4, "apiVersion");
        i.e(str5, "sdkVersion");
        this.method = method2;
        this.baseUrl = str;
        this.params = map;
        this.options = options3;
        this.appInfo = appInfo2;
        this.systemPropertySupplier = lVar2;
        this.apiVersion = str4;
        this.sdkVersion = str5;
        this.mimeType = StripeRequest.MimeType.Form;
        this.headersFactory = new RequestHeadersFactory.Api(options2, appInfo2, (Locale) null, lVar2, str4, str5, 4, (f) null);
    }
}
