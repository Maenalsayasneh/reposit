package q0.h0.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethod;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m0.n.b.f;
import m0.n.b.i;
import okhttp3.Protocol;
import q0.a0;
import q0.h0.n.b;
import q0.h0.n.c;
import q0.h0.n.e;

/* compiled from: Platform.kt */
public class h {
    public static volatile h a;
    public static final Logger b = Logger.getLogger(a0.class.getName());
    public static final a c;

    /* compiled from: Platform.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final List<String> a(List<? extends Protocol> list) {
            i.e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(i0.j.f.p.h.K(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] b(List<? extends Protocol> list) {
            i.e(list, "protocols");
            r0.f fVar = new r0.f();
            Iterator it = ((ArrayList) a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.I(str.length());
                fVar.U(str);
            }
            return fVar.r();
        }

        public final boolean c() {
            return i.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: q0.h0.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: q0.h0.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: q0.h0.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: q0.h0.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: q0.h0.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: q0.h0.l.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0183;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    static {
        /*
            q0.h0.l.h$a r0 = new q0.h0.l.h$a
            r1 = 0
            r0.<init>(r1)
            c = r0
            boolean r0 = r0.c()
            r2 = 0
            if (r0 == 0) goto L_0x0088
            q0.h0.l.i.c r0 = q0.h0.l.i.c.c
            java.util.Map<java.lang.String, java.lang.String> r0 = q0.h0.l.i.c.b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = q0.h0.l.i.c.a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "logger"
            m0.n.b.i.d(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0051
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005d
        L_0x0051:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x005b
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005d
        L_0x005b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005d:
            r4.setLevel(r3)
            q0.h0.l.i.d r3 = q0.h0.l.i.d.a
            r4.addHandler(r3)
            goto L_0x001b
        L_0x0066:
            q0.h0.l.a r0 = q0.h0.l.a.e
            boolean r0 = q0.h0.l.a.d
            if (r0 == 0) goto L_0x0072
            q0.h0.l.a r0 = new q0.h0.l.a
            r0.<init>()
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            goto L_0x018c
        L_0x0077:
            q0.h0.l.b$a r0 = q0.h0.l.b.e
            boolean r0 = q0.h0.l.b.d
            if (r0 == 0) goto L_0x0082
            q0.h0.l.b r1 = new q0.h0.l.b
            r1.<init>()
        L_0x0082:
            m0.n.b.i.c(r1)
        L_0x0085:
            r0 = r1
            goto L_0x018c
        L_0x0088:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            m0.n.b.i.d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = m0.n.b.i.a(r4, r0)
            if (r0 == 0) goto L_0x00b0
            q0.h0.l.d$a r0 = q0.h0.l.d.e
            boolean r0 = q0.h0.l.d.d
            if (r0 == 0) goto L_0x00ab
            q0.h0.l.d r0 = new q0.h0.l.d
            r0.<init>()
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x018c
        L_0x00b0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            m0.n.b.i.d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = m0.n.b.i.a(r4, r0)
            if (r0 == 0) goto L_0x00d6
            q0.h0.l.c$a r0 = q0.h0.l.c.e
            boolean r0 = q0.h0.l.c.d
            if (r0 == 0) goto L_0x00d1
            q0.h0.l.c r0 = new q0.h0.l.c
            r0.<init>()
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            goto L_0x018c
        L_0x00d6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            m0.n.b.i.d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = m0.n.b.i.a(r3, r0)
            if (r0 == 0) goto L_0x00fc
            q0.h0.l.g$a r0 = q0.h0.l.g.e
            boolean r0 = q0.h0.l.g.d
            if (r0 == 0) goto L_0x00f7
            q0.h0.l.g r0 = new q0.h0.l.g
            r0.<init>()
            goto L_0x00f8
        L_0x00f7:
            r0 = r1
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            goto L_0x018c
        L_0x00fc:
            q0.h0.l.f$a r0 = q0.h0.l.f.e
            boolean r0 = q0.h0.l.f.d
            if (r0 == 0) goto L_0x0108
            q0.h0.l.f r0 = new q0.h0.l.f
            r0.<init>()
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            if (r0 == 0) goto L_0x010d
            goto L_0x018c
        L_0x010d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            m0.n.b.i.d(r0, r3)     // Catch:{ NumberFormatException -> 0x0123 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0123 }
            r3 = 9
            if (r0 < r3) goto L_0x0123
            goto L_0x0183
        L_0x0123:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            q0.h0.l.e r0 = new q0.h0.l.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "putMethod"
            m0.n.b.i.d(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "getMethod"
            m0.n.b.i.d(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "removeMethod"
            m0.n.b.i.d(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "clientProviderClass"
            m0.n.b.i.d(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "serverProviderClass"
            m0.n.b.i.d(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r1 = r0
        L_0x0183:
            if (r1 == 0) goto L_0x0187
            goto L_0x0085
        L_0x0187:
            q0.h0.l.h r0 = new q0.h0.l.h
            r0.<init>()
        L_0x018c:
            a = r0
            java.lang.Class<q0.a0> r0 = q0.a0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.l.h.<clinit>():void");
    }

    public static /* synthetic */ void j(h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        int i3 = i2 & 4;
        hVar.i(str, i, (Throwable) null);
    }

    public void a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
    }

    public c b(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        return new q0.h0.n.a(c(x509TrustManager));
    }

    public e c(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        i.e(socket, "socket");
        i.e(inetSocketAddress, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return null;
    }

    public Object g(String str) {
        i.e(str, "closer");
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean h(String str) {
        i.e(str, "hostname");
        return true;
    }

    public void i(String str, int i, Throwable th) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void k(String str, Object obj) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        if (obj == null) {
            str = i0.d.a.a.a.n0(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        i.d(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        try {
            SSLContext l = l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l.getSocketFactory();
            i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        i.d(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        i.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        i.d(arrays, "java.util.Arrays.toString(this)");
        P0.append(arrays);
        throw new IllegalStateException(P0.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        i.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
