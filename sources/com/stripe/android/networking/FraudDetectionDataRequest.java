package com.stripe.android.networking;

import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.networking.RequestHeadersFactory;
import com.stripe.android.networking.StripeRequest;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00168\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006¨\u0006\""}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequest;", "Lcom/stripe/android/networking/StripeRequest;", "", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "Lcom/stripe/android/networking/StripeRequest$Method;", "method", "Lcom/stripe/android/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/networking/StripeRequest$Method;", "Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "getHeadersFactory", "()Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/networking/StripeRequest$MimeType;", "", "", "params", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getBody", "body", "guid", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequest.kt */
public final class FraudDetectionDataRequest extends StripeRequest {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String URL = "https://m.stripe.com/6";
    private final String baseUrl = URL;
    private final RequestHeadersFactory.FraudDetection headersFactory;
    private final StripeRequest.Method method = StripeRequest.Method.POST;
    private final StripeRequest.MimeType mimeType = StripeRequest.MimeType.Json;
    private final Map<String, Object> params;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;", "", "", "URL", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FraudDetectionDataRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public FraudDetectionDataRequest(Map<String, ? extends Object> map, String str) {
        i.e(map, "params");
        i.e(str, "guid");
        this.params = map;
        this.headersFactory = new RequestHeadersFactory.FraudDetection(str);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getBody() {
        return String.valueOf(StripeJsonUtils.INSTANCE.mapToJsonObject$payments_core_release(getParams()));
    }

    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public RequestHeadersFactory.FraudDetection getHeadersFactory() {
        return this.headersFactory;
    }
}
