package com.stripe.android.networking;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.NetworkLog;
import com.instabug.library.networkv2.request.RequestMethod;
import com.stripe.android.StripeError;
import com.stripe.android.exception.InvalidRequestException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.t.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000 42\u00020\u0001:\u0003456B\u0007¢\u0006\u0004\b2\u00103J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\t8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR\u0016\u0010#\u001a\u00020 8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u001e\u0010&\u001a\u0004\u0018\u00010\t8\u0014@\u0014X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001cR\u0016\u0010*\u001a\u00020\t8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\t8P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0016\u00101\u001a\u00020\t8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001c¨\u00067"}, d2 = {"Lcom/stripe/android/networking/StripeRequest;", "", "Ljava/io/OutputStream;", "outputStream", "Lm0/i;", "writeBody$payments_core_release", "(Ljava/io/OutputStream;)V", "writeBody", "", "", "getHeaders$payments_core_release", "()Ljava/util/Map;", "headers", "", "getBodyBytes", "()[B", "bodyBytes", "getCompactParams$payments_core_release", "compactParams", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/networking/StripeRequest$Method;", "method", "getUrlWithQuery", "()Ljava/lang/String;", "urlWithQuery", "getParams", "params", "Lcom/stripe/android/networking/RequestHeadersFactory;", "getHeadersFactory", "()Lcom/stripe/android/networking/RequestHeadersFactory;", "headersFactory", "getBaseUrl", "baseUrl", "body", "Ljava/lang/String;", "getBody", "getUrl$payments_core_release", "url", "Lcom/stripe/android/networking/QueryStringFactory;", "queryStringFactory", "Lcom/stripe/android/networking/QueryStringFactory;", "getContentType$payments_core_release", "contentType", "getQuery", "query", "<init>", "()V", "Companion", "Method", "MimeType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeRequest.kt */
public abstract class StripeRequest {
    private static final String CHARSET = a.a.name();
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final l<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = StripeRequest$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1.INSTANCE;
    private final String body;
    private final QueryStringFactory queryStringFactory = new QueryStringFactory();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n \f*\u0004\u0018\u00010\u00030\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/StripeRequest$Companion;", "", "", "", "params", "compactParams", "(Ljava/util/Map;)Ljava/util/Map;", "Lkotlin/Function1;", "DEFAULT_SYSTEM_PROPERTY_SUPPLIER", "Lm0/n/a/l;", "getDEFAULT_SYSTEM_PROPERTY_SUPPLIER$payments_core_release", "()Lm0/n/a/l;", "kotlin.jvm.PlatformType", "CHARSET", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Map<String, Object> compactParams(Map<String, ?> map) {
            HashMap hashMap = new HashMap(map);
            Iterator it = new HashSet(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Object obj = hashMap.get(str);
                if (obj instanceof CharSequence) {
                    if (((CharSequence) obj).length() == 0) {
                        hashMap.remove(str);
                    }
                } else if (obj instanceof Map) {
                    i.d(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                    hashMap.put(str, compactParams((Map) obj));
                } else if (obj == null) {
                    hashMap.remove(str);
                }
            }
            return hashMap;
        }

        public final l<String, String> getDEFAULT_SYSTEM_PROPERTY_SUPPLIER$payments_core_release() {
            return StripeRequest.DEFAULT_SYSTEM_PROPERTY_SUPPLIER;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/networking/StripeRequest$Method;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "GET", "POST", "DELETE", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeRequest.kt */
    public enum Method {
        GET(RequestMethod.GET),
        POST(RequestMethod.POST),
        DELETE(RequestMethod.DELETE);
        
        private final String code;

        private Method(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/networking/StripeRequest$MimeType;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Form", "MultipartForm", "Json", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeRequest.kt */
    public enum MimeType {
        Form("application/x-www-form-urlencoded"),
        MultipartForm("multipart/form-data"),
        Json(NetworkLog.JSON);
        
        private final String code;

        private MimeType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    private final byte[] getBodyBytes() {
        try {
            String body2 = getBody();
            if (body2 == null) {
                return null;
            }
            byte[] bytes = body2.getBytes(a.a);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Unable to encode parameters to ");
            P0.append(a.a.name());
            P0.append(". ");
            P0.append("Please contact support@stripe.com for assistance.");
            throw new InvalidRequestException((StripeError) null, (String) null, 0, P0.toString(), e, 7, (f) null);
        }
    }

    private final String getUrlWithQuery() {
        String[] strArr = new String[2];
        strArr[0] = getBaseUrl();
        String query = getQuery();
        if (!(query.length() > 0)) {
            query = null;
        }
        strArr[1] = query;
        return g.E(g.M(strArr), StringsKt__IndentKt.d(getBaseUrl(), "?", false, 2) ? "&" : "?", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public abstract String getBaseUrl();

    public String getBody() {
        return this.body;
    }

    public final Map<String, ?> getCompactParams$payments_core_release() {
        Map<String, ?> params = getParams();
        if (params != null) {
            return Companion.compactParams(params);
        }
        return null;
    }

    public String getContentType$payments_core_release() {
        return getMimeType() + "; charset=" + CHARSET;
    }

    public final Map<String, String> getHeaders$payments_core_release() {
        return getHeadersFactory().create();
    }

    public abstract RequestHeadersFactory getHeadersFactory();

    public abstract Method getMethod();

    public abstract MimeType getMimeType();

    public abstract Map<String, ?> getParams();

    public final String getQuery() {
        return this.queryStringFactory.create(getCompactParams$payments_core_release());
    }

    public final String getUrl$payments_core_release() throws UnsupportedEncodingException, InvalidRequestException {
        if (Method.GET == getMethod()) {
            return getUrlWithQuery();
        }
        return getBaseUrl();
    }

    public void writeBody$payments_core_release(OutputStream outputStream) {
        i.e(outputStream, "outputStream");
        byte[] bodyBytes = getBodyBytes();
        if (bodyBytes != null) {
            outputStream.write(bodyBytes);
            outputStream.flush();
        }
    }
}
