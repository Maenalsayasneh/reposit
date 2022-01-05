package com.stripe.android.networking;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.StripeError;
import com.stripe.android.exception.APIException;
import i0.d.a.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000 82\u00020\u0001:\u00018B7\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0010¢\u0006\u0004\b6\u00107J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\"\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0010HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0010HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0014\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010\fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b/\u0010\u0004R\u001c\u00100\u001a\u00020\u001b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R.\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00108\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b3\u0010\u0012R\u001c\u00104\u001a\u00020\u001b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#¨\u00069"}, d2 = {"Lcom/stripe/android/networking/StripeResponse;", "", "", "toString", "()Ljava/lang/String;", "key", "", "getHeaderValue$payments_core_release", "(Ljava/lang/String;)Ljava/util/List;", "getHeaderValue", "", "component1$payments_core_release", "()I", "component1", "component2$payments_core_release", "component2", "", "component3$payments_core_release", "()Ljava/util/Map;", "component3", "code", "body", "headers", "copy", "(ILjava/lang/String;Ljava/util/Map;)Lcom/stripe/android/networking/StripeResponse;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "contentType", "Ljava/lang/String;", "isRateLimited", "Z", "isRateLimited$payments_core_release", "()Z", "Lorg/json/JSONObject;", "getResponseJson$payments_core_release", "()Lorg/json/JSONObject;", "responseJson", "Lcom/stripe/android/networking/RequestId;", "requestId", "Lcom/stripe/android/networking/RequestId;", "getRequestId$payments_core_release", "()Lcom/stripe/android/networking/RequestId;", "I", "getCode$payments_core_release", "getBody$payments_core_release", "isError", "isError$payments_core_release", "Ljava/util/Map;", "getHeaders$payments_core_release", "isOk", "isOk$payments_core_release", "<init>", "(ILjava/lang/String;Ljava/util/Map;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeResponse.kt */
public final class StripeResponse {
    @Deprecated
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String REQUEST_ID_HEADER = "Request-Id";
    private final String body;
    private final int code;
    private final String contentType;
    private final Map<String, List<String>> headers;
    private final boolean isError;
    private final boolean isOk;
    private final boolean isRateLimited;
    private final RequestId requestId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/StripeResponse$Companion;", "", "", "CONTENT_TYPE_HEADER", "Ljava/lang/String;", "REQUEST_ID_HEADER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StripeResponse(int r3, java.lang.String r4, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            m0.n.b.i.e(r5, r0)
            r2.<init>()
            r2.code = r3
            r2.body = r4
            r2.headers = r5
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 1
            r0 = 0
            if (r3 != r4) goto L_0x0016
            r1 = r5
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            r2.isOk = r1
            if (r3 < r4) goto L_0x0022
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r4 = r0
            goto L_0x0023
        L_0x0022:
            r4 = r5
        L_0x0023:
            r2.isError = r4
            r4 = 429(0x1ad, float:6.01E-43)
            if (r3 != r4) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r5 = r0
        L_0x002b:
            r2.isRateLimited = r5
            com.stripe.android.networking.RequestId$Companion r3 = com.stripe.android.networking.RequestId.Companion
            java.lang.String r4 = "Request-Id"
            java.util.List r4 = r2.getHeaderValue$payments_core_release(r4)
            r5 = 0
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = m0.j.g.w(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0040
        L_0x003f:
            r4 = r5
        L_0x0040:
            com.stripe.android.networking.RequestId r3 = r3.fromString(r4)
            r2.requestId = r3
            java.lang.String r3 = "Content-Type"
            java.util.List r3 = r2.getHeaderValue$payments_core_release(r3)
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = m0.j.g.w(r3)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
        L_0x0055:
            r2.contentType = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeResponse.<init>(int, java.lang.String, java.util.Map):void");
    }

    public static /* synthetic */ StripeResponse copy$default(StripeResponse stripeResponse, int i, String str, Map<String, List<String>> map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stripeResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = stripeResponse.body;
        }
        if ((i2 & 4) != 0) {
            map = stripeResponse.headers;
        }
        return stripeResponse.copy(i, str, map);
    }

    public final int component1$payments_core_release() {
        return this.code;
    }

    public final String component2$payments_core_release() {
        return this.body;
    }

    public final Map<String, List<String>> component3$payments_core_release() {
        return this.headers;
    }

    public final StripeResponse copy(int i, String str, Map<String, ? extends List<String>> map) {
        i.e(map, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
        return new StripeResponse(i, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeResponse)) {
            return false;
        }
        StripeResponse stripeResponse = (StripeResponse) obj;
        return this.code == stripeResponse.code && i.a(this.body, stripeResponse.body) && i.a(this.headers, stripeResponse.headers);
    }

    public final String getBody$payments_core_release() {
        return this.body;
    }

    public final int getCode$payments_core_release() {
        return this.code;
    }

    public final List<String> getHeaderValue$payments_core_release(String str) {
        T t;
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        Iterator<T> it = this.headers.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (StringsKt__IndentKt.f((String) ((Map.Entry) t).getKey(), str, true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t;
        if (entry != null) {
            return (List) entry.getValue();
        }
        return null;
    }

    public final Map<String, List<String>> getHeaders$payments_core_release() {
        return this.headers;
    }

    public final RequestId getRequestId$payments_core_release() {
        return this.requestId;
    }

    public final JSONObject getResponseJson$payments_core_release() throws APIException {
        String str = this.body;
        if (str == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            StringBuilder P0 = a.P0("\n                            Exception while parsing response body.\n                              Status code: ");
            P0.append(this.code);
            P0.append("\n                              Request-Id: ");
            P0.append(this.requestId);
            P0.append("\n                              Content-Type: ");
            P0.append(this.contentType);
            P0.append("\n                              Body: \"");
            P0.append(str);
            P0.append("\"\n                        ");
            throw new APIException((StripeError) null, (String) null, 0, StringsKt__IndentKt.Y(P0.toString()), e, 7, (f) null);
        }
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.body;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, List<String>> map = this.headers;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public final boolean isError$payments_core_release() {
        return this.isError;
    }

    public final boolean isOk$payments_core_release() {
        return this.isOk;
    }

    public final boolean isRateLimited$payments_core_release() {
        return this.isRateLimited;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Request-Id: ");
        P0.append(this.requestId);
        P0.append(", Status Code: ");
        P0.append(this.code);
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeResponse(int i, String str, Map map, int i2, f fVar) {
        this(i, str, (i2 & 4) != 0 ? g.o() : map);
    }
}
