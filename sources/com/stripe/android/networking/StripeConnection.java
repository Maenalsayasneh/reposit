package com.stripe.android.networking;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\nR\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/networking/StripeConnection;", "Ljava/io/Closeable;", "Lcom/stripe/android/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/networking/StripeResponse;", "response", "", "getResponseCode", "()I", "responseCode", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeConnection.kt */
public interface StripeConnection extends Closeable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/networking/StripeConnection$Default;", "Lcom/stripe/android/networking/StripeConnection;", "Ljava/io/InputStream;", "responseStream", "", "getResponseBody", "(Ljava/io/InputStream;)Ljava/lang/String;", "Lm0/i;", "close", "()V", "()Ljava/lang/String;", "responseBody", "Lcom/stripe/android/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/networking/StripeResponse;", "response", "", "getResponseCode", "()I", "responseCode", "Ljavax/net/ssl/HttpsURLConnection;", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "getResponseStream", "()Ljava/io/InputStream;", "<init>", "(Ljavax/net/ssl/HttpsURLConnection;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeConnection.kt */
    public static final class Default implements StripeConnection {
        @Deprecated
        private static final String CHARSET = StandardCharsets.UTF_8.name();
        private static final Companion Companion = new Companion((f) null);
        private final HttpsURLConnection conn;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/StripeConnection$Default$Companion;", "", "", "kotlin.jvm.PlatformType", "CHARSET", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeConnection.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Default(HttpsURLConnection httpsURLConnection) {
            i.e(httpsURLConnection, "conn");
            this.conn = httpsURLConnection;
        }

        private final String getResponseBody() throws IOException {
            return getResponseBody(getResponseStream());
        }

        private final InputStream getResponseStream() throws IOException {
            int responseCode = getResponseCode();
            if (200 <= responseCode && 299 >= responseCode) {
                return this.conn.getInputStream();
            }
            return this.conn.getErrorStream();
        }

        public void close() {
            InputStream responseStream = getResponseStream();
            if (responseStream != null) {
                responseStream.close();
            }
            this.conn.disconnect();
        }

        public /* synthetic */ StripeResponse getResponse() throws IOException {
            int responseCode = getResponseCode();
            String responseBody = getResponseBody();
            Map headerFields = this.conn.getHeaderFields();
            i.d(headerFields, "conn.headerFields");
            return new StripeResponse(responseCode, responseBody, headerFields);
        }

        public /* synthetic */ int getResponseCode() {
            return this.conn.getResponseCode();
        }

        private final String getResponseBody(InputStream inputStream) throws IOException {
            String str = null;
            if (inputStream == null) {
                return null;
            }
            Scanner useDelimiter = new Scanner(inputStream, CHARSET).useDelimiter("\\A");
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            }
            inputStream.close();
            return str;
        }
    }

    StripeResponse getResponse();

    int getResponseCode();
}
