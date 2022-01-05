package com.stripe.android.networking;

import com.stripe.android.networking.RequestHeadersFactory;
import com.stripe.android.networking.StripeRequest;
import i0.d.a.a.a;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u0019\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0007\u001a\u00020\u00002\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\u00038\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR&\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0005R\u001c\u0010\u0019\u001a\u00020\u00188\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u00020\"8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequest;", "Lcom/stripe/android/networking/StripeRequest;", "", "", "component1", "()Ljava/util/Map;", "params", "copy", "(Ljava/util/Map;)Lcom/stripe/android/networking/AnalyticsRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "Ljava/util/Map;", "getParams", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/networking/StripeRequest$MimeType;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory;", "getHeadersFactory", "()Lcom/stripe/android/networking/RequestHeadersFactory;", "Lcom/stripe/android/networking/StripeRequest$Method;", "method", "Lcom/stripe/android/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/networking/StripeRequest$Method;", "<init>", "(Ljava/util/Map;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AnalyticsRequest.kt */
public final class AnalyticsRequest extends StripeRequest {
    public static final Companion Companion = new Companion((f) null);
    public static final String HOST = "https://q.stripe.com";
    private final String baseUrl = HOST;
    private final RequestHeadersFactory headersFactory = RequestHeadersFactory.Analytics.INSTANCE;
    private final StripeRequest.Method method = StripeRequest.Method.GET;
    private final StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
    private final Map<String, ?> params;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequest$Companion;", "", "", "HOST", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AnalyticsRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public AnalyticsRequest(Map<String, ?> map) {
        i.e(map, "params");
        this.params = map;
    }

    public static /* synthetic */ AnalyticsRequest copy$default(AnalyticsRequest analyticsRequest, Map<String, ?> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = analyticsRequest.getParams();
        }
        return analyticsRequest.copy(map);
    }

    public final Map<String, ?> component1() {
        return getParams();
    }

    public final AnalyticsRequest copy(Map<String, ?> map) {
        i.e(map, "params");
        return new AnalyticsRequest(map);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnalyticsRequest) && i.a(getParams(), ((AnalyticsRequest) obj).getParams());
        }
        return true;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public RequestHeadersFactory getHeadersFactory() {
        return this.headersFactory;
    }

    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public Map<String, ?> getParams() {
        return this.params;
    }

    public int hashCode() {
        Map<String, ?> params2 = getParams();
        if (params2 != null) {
            return params2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AnalyticsRequest(params=");
        P0.append(getParams());
        P0.append(")");
        return P0.toString();
    }
}
