package com.stripe.android.networking;

import com.stripe.android.exception.InvalidRequestException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/ConnectionFactory;", "", "Lcom/stripe/android/networking/StripeRequest;", "request", "Lcom/stripe/android/networking/StripeConnection;", "create", "(Lcom/stripe/android/networking/StripeRequest;)Lcom/stripe/android/networking/StripeConnection;", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConnectionFactory.kt */
public interface ConnectionFactory {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/networking/ConnectionFactory$Default;", "Lcom/stripe/android/networking/ConnectionFactory;", "", "requestUrl", "Ljavax/net/ssl/HttpsURLConnection;", "openConnection", "(Ljava/lang/String;)Ljavax/net/ssl/HttpsURLConnection;", "Lcom/stripe/android/networking/StripeRequest;", "request", "Lcom/stripe/android/networking/StripeConnection;", "create", "(Lcom/stripe/android/networking/StripeRequest;)Lcom/stripe/android/networking/StripeConnection;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ConnectionFactory.kt */
    public static final class Default implements ConnectionFactory {
        @Deprecated
        private static final int CONNECT_TIMEOUT;
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String HEADER_CONTENT_TYPE = "Content-Type";
        @Deprecated
        private static final int READ_TIMEOUT;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/networking/ConnectionFactory$Default$Companion;", "", "", "CONNECT_TIMEOUT", "I", "", "HEADER_CONTENT_TYPE", "Ljava/lang/String;", "READ_TIMEOUT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ConnectionFactory.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CONNECT_TIMEOUT = (int) timeUnit.toMillis(30);
            READ_TIMEOUT = (int) timeUnit.toMillis(80);
        }

        private final HttpsURLConnection openConnection(String str) {
            URLConnection openConnection = new URL(str).openConnection();
            Objects.requireNonNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            return (HttpsURLConnection) openConnection;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0077, code lost:
            i0.j.f.p.h.H(r1, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ com.stripe.android.networking.StripeConnection create(com.stripe.android.networking.StripeRequest r5) throws java.io.IOException, com.stripe.android.exception.InvalidRequestException {
            /*
                r4 = this;
                java.lang.String r0 = "request"
                m0.n.b.i.e(r5, r0)
                java.lang.String r0 = r5.getUrl$payments_core_release()
                javax.net.ssl.HttpsURLConnection r0 = r4.openConnection(r0)
                int r1 = CONNECT_TIMEOUT
                r0.setConnectTimeout(r1)
                int r1 = READ_TIMEOUT
                r0.setReadTimeout(r1)
                r1 = 0
                r0.setUseCaches(r1)
                com.stripe.android.networking.StripeRequest$Method r1 = r5.getMethod()
                java.lang.String r1 = r1.getCode()
                r0.setRequestMethod(r1)
                java.util.Map r1 = r5.getHeaders$payments_core_release()
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x0032:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x004e
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.lang.String r2 = (java.lang.String) r2
                r0.setRequestProperty(r3, r2)
                goto L_0x0032
            L_0x004e:
                com.stripe.android.networking.StripeRequest$Method r1 = com.stripe.android.networking.StripeRequest.Method.POST
                com.stripe.android.networking.StripeRequest$Method r2 = r5.getMethod()
                if (r1 != r2) goto L_0x007b
                r1 = 1
                r0.setDoOutput(r1)
                java.lang.String r1 = r5.getContentType$payments_core_release()
                java.lang.String r2 = "Content-Type"
                r0.setRequestProperty(r2, r1)
                java.io.OutputStream r1 = r0.getOutputStream()
                r2 = 0
                java.lang.String r3 = "output"
                m0.n.b.i.d(r1, r3)     // Catch:{ all -> 0x0074 }
                r5.writeBody$payments_core_release(r1)     // Catch:{ all -> 0x0074 }
                i0.j.f.p.h.H(r1, r2)
                goto L_0x007b
            L_0x0074:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r0 = move-exception
                i0.j.f.p.h.H(r1, r5)
                throw r0
            L_0x007b:
                com.stripe.android.networking.StripeConnection$Default r5 = new com.stripe.android.networking.StripeConnection$Default
                r5.<init>(r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.ConnectionFactory.Default.create(com.stripe.android.networking.StripeRequest):com.stripe.android.networking.StripeConnection");
        }
    }

    StripeConnection create(StripeRequest stripeRequest) throws IOException, InvalidRequestException;
}
