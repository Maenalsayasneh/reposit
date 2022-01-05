package com.stripe.android.stripe3ds2.transaction;

import com.instabug.library.networkv2.request.Header;
import com.instabug.library.networkv2.request.RequestMethod;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002,-B+\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\rH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient;", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "", "requestBody", "contentType", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "doPostRequestInternal", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "", "responseCode", "", "isSuccessfulResponse", "(I)Z", "Ljava/io/InputStream;", "inputStream", "getResponseBody", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "createPostConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;", "createGetConnection", "()Ljava/net/HttpURLConnection;", "createConnection", "doGetRequest", "(Lm0/l/c;)Ljava/lang/Object;", "doPostRequest", "(Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "conn", "handlePostResponse$3ds2sdk_release", "(Ljava/net/HttpURLConnection;)Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "handlePostResponse", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "connectionFactory", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "url", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lm0/l/e;)V", "ConnectionFactory", "DefaultConnectionFactory", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeHttpClient.kt */
public final class StripeHttpClient implements HttpClient {
    private final ConnectionFactory connectionFactory;
    /* access modifiers changed from: private */
    public final ErrorReporter errorReporter;
    private final String url;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "", "", "url", "Ljava/net/HttpURLConnection;", "create", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeHttpClient.kt */
    public interface ConnectionFactory {
        HttpURLConnection create(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$DefaultConnectionFactory;", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "", "url", "Ljava/net/HttpURLConnection;", "create", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeHttpClient.kt */
    public static final class DefaultConnectionFactory implements ConnectionFactory {
        public HttpURLConnection create(String str) {
            i.e(str, "url");
            URLConnection openConnection = new URL(str).openConnection();
            Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) openConnection;
        }
    }

    public StripeHttpClient(String str, ConnectionFactory connectionFactory2, ErrorReporter errorReporter2, e eVar) {
        i.e(str, "url");
        i.e(connectionFactory2, "connectionFactory");
        i.e(errorReporter2, "errorReporter");
        i.e(eVar, "workContext");
        this.url = str;
        this.connectionFactory = connectionFactory2;
        this.errorReporter = errorReporter2;
        this.workContext = eVar;
    }

    private final HttpURLConnection createConnection() {
        return this.connectionFactory.create(this.url);
    }

    /* access modifiers changed from: private */
    public final HttpURLConnection createGetConnection() {
        HttpURLConnection createConnection = createConnection();
        createConnection.setDoInput(true);
        return createConnection;
    }

    private final HttpURLConnection createPostConnection(String str, String str2) {
        HttpURLConnection createConnection = createConnection();
        createConnection.setRequestMethod(RequestMethod.POST);
        createConnection.setDoOutput(true);
        createConnection.setRequestProperty(Header.CONTENT_TYPE, str2);
        createConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
        return createConnection;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        i0.j.f.p.h.H(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        i0.j.f.p.h.H(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.stripe.android.stripe3ds2.transaction.HttpResponse doPostRequestInternal(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.net.HttpURLConnection r5 = r3.createPostConnection(r4, r5)
            java.io.OutputStream r0 = r5.getOutputStream()
            java.lang.String r1 = "os"
            m0.n.b.i.d(r0, r1)     // Catch:{ all -> 0x0035 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "StandardCharsets.UTF_8"
            m0.n.b.i.d(r1, r2)     // Catch:{ all -> 0x0035 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0035 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0035 }
            r2.write(r4)     // Catch:{ all -> 0x002e }
            r2.flush()     // Catch:{ all -> 0x002e }
            r4 = 0
            i0.j.f.p.h.H(r2, r4)     // Catch:{ all -> 0x0035 }
            i0.j.f.p.h.H(r0, r4)
            r5.connect()
            com.stripe.android.stripe3ds2.transaction.HttpResponse r4 = r3.handlePostResponse$3ds2sdk_release(r5)
            return r4
        L_0x002e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r5 = move-exception
            i0.j.f.p.h.H(r2, r4)     // Catch:{ all -> 0x0035 }
            throw r5     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r5 = move-exception
            i0.j.f.p.h.H(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeHttpClient.doPostRequestInternal(java.lang.String, java.lang.String):com.stripe.android.stripe3ds2.transaction.HttpResponse");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        i0.j.f.p.h.H(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getResponseBody(java.io.InputStream r4) {
        /*
            r3 = this;
            r0 = 0
            java.nio.charset.Charset r1 = m0.t.a.a     // Catch:{ all -> 0x0026 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0026 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0026 }
            r4 = 8192(0x2000, float:1.14794E-41)
            boolean r1 = r2 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0011
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ all -> 0x0026 }
            goto L_0x0017
        L_0x0011:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0026 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0026 }
            r2 = r1
        L_0x0017:
            java.lang.String r4 = i0.j.f.p.h.n3(r2)     // Catch:{ all -> 0x001f }
            i0.j.f.p.h.H(r2, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x002b
        L_0x001f:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r1 = move-exception
            i0.j.f.p.h.H(r2, r4)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r4 = move-exception
            java.lang.Object r4 = i0.j.f.p.h.l0(r4)
        L_0x002b:
            boolean r1 = r4 instanceof kotlin.Result.Failure
            if (r1 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r4
        L_0x0031:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            java.lang.String r0 = ""
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeHttpClient.getResponseBody(java.io.InputStream):java.lang.String");
    }

    private final boolean isSuccessfulResponse(int i) {
        return 200 <= i && 299 >= i;
    }

    public Object doGetRequest(c<? super InputStream> cVar) {
        return a.k4(this.workContext, new StripeHttpClient$doGetRequest$2(this, (c) null), cVar);
    }

    public Object doPostRequest(String str, String str2, c<? super HttpResponse> cVar) {
        return a.k4(this.workContext, new StripeHttpClient$doPostRequest$2(this, str, str2, (c) null), cVar);
    }

    public final HttpResponse handlePostResponse$3ds2sdk_release(HttpURLConnection httpURLConnection) {
        i.e(httpURLConnection, "conn");
        int responseCode = httpURLConnection.getResponseCode();
        if (isSuccessfulResponse(responseCode)) {
            InputStream inputStream = httpURLConnection.getInputStream();
            i.d(inputStream, "conn.inputStream");
            return new HttpResponse(getResponseBody(inputStream), httpURLConnection.getContentType());
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unsuccessful response code from ");
        P0.append(this.url);
        P0.append(": ");
        P0.append(responseCode);
        throw new SDKRuntimeException(P0.toString(), (Throwable) null, 2, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StripeHttpClient(String str, ConnectionFactory connectionFactory2, ErrorReporter errorReporter2, e eVar, int i, f fVar) {
        this(str, (i & 2) != 0 ? new DefaultConnectionFactory() : connectionFactory2, errorReporter2, (i & 8) != 0 ? m0.c : eVar);
    }
}
