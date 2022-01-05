package q0.h0.g;

import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import q0.a;
import q0.a0;
import q0.b0;
import q0.d0;
import q0.e0;
import q0.f;
import q0.g0;
import q0.h0.c;
import q0.h0.i.b;
import q0.h0.j.d;
import q0.h0.j.m;
import q0.h0.j.n;
import q0.h0.j.r;
import q0.h0.l.h;
import q0.k;
import q0.t;
import q0.v;
import q0.w;
import r0.h;
import r0.i;
import r0.y;

/* compiled from: RealConnection.kt */
public final class g extends d.c implements k {
    public Socket b;
    public Socket c;
    public Handshake d;
    public Protocol e;
    public d f;
    public i g;
    public h h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n = 1;
    public final List<Reference<e>> o = new ArrayList();
    public long p = RecyclerView.FOREVER_NS;
    public final g0 q;

    public g(h hVar, g0 g0Var) {
        m0.n.b.i.e(hVar, "connectionPool");
        m0.n.b.i.e(g0Var, "route");
        this.q = g0Var;
    }

    public synchronized void a(d dVar, r rVar) {
        m0.n.b.i.e(dVar, "connection");
        m0.n.b.i.e(rVar, "settings");
        this.n = (rVar.a & 16) != 0 ? rVar.b[4] : Integer.MAX_VALUE;
    }

    public void b(m mVar) throws IOException {
        m0.n.b.i.e(mVar, "stream");
        mVar.c(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b A[EDGE_INSN: B:78:0x015b->B:70:0x015b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, q0.f r22, q0.t r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r12 = "call"
            m0.n.b.i.e(r8, r12)
            java.lang.String r0 = "eventListener"
            m0.n.b.i.e(r9, r0)
            okhttp3.Protocol r0 = r7.e
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0169
            q0.g0 r0 = r7.q
            q0.a r0 = r0.a
            java.util.List<q0.m> r0 = r0.c
            q0.h0.g.b r13 = new q0.h0.g.b
            r13.<init>(r0)
            q0.g0 r1 = r7.q
            q0.a r1 = r1.a
            javax.net.ssl.SSLSocketFactory r2 = r1.f
            if (r2 != 0) goto L_0x006b
            q0.m r1 = q0.m.d
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005e
            q0.g0 r0 = r7.q
            q0.a r0 = r0.a
            q0.w r0 = r0.a
            java.lang.String r0 = r0.g
            q0.h0.l.h$a r1 = q0.h0.l.h.c
            q0.h0.l.h r1 = q0.h0.l.h.a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004b
            goto L_0x0075
        L_0x004b:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = i0.d.a.a.a.o0(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005e:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.util.List<okhttp3.Protocol> r0 = r1.b
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x015c
        L_0x0075:
            r14 = 0
            r15 = r14
        L_0x0077:
            q0.g0 r0 = r7.q     // Catch:{ IOException -> 0x00df }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x00df }
            if (r0 == 0) goto L_0x009d
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00df }
            java.net.Socket r0 = r7.b     // Catch:{ IOException -> 0x00df }
            if (r0 != 0) goto L_0x0093
            goto L_0x00b8
        L_0x0093:
            r1 = r17
            r2 = r18
            goto L_0x00a4
        L_0x0098:
            r1 = r17
            r2 = r18
            goto L_0x00dc
        L_0x009d:
            r1 = r17
            r2 = r18
            r7.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00a4:
            r3 = r20
            r7.g(r13, r3, r8, r9)     // Catch:{ IOException -> 0x00d9 }
            q0.g0 r0 = r7.q     // Catch:{ IOException -> 0x00d9 }
            java.net.InetSocketAddress r4 = r0.c     // Catch:{ IOException -> 0x00d9 }
            java.net.Proxy r0 = r0.b     // Catch:{ IOException -> 0x00d9 }
            m0.n.b.i.e(r8, r12)     // Catch:{ IOException -> 0x00d9 }
            m0.n.b.i.e(r4, r11)     // Catch:{ IOException -> 0x00d9 }
            m0.n.b.i.e(r0, r10)     // Catch:{ IOException -> 0x00d9 }
        L_0x00b8:
            q0.g0 r0 = r7.q
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00d2
            java.net.Socket r0 = r7.b
            if (r0 == 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            long r0 = java.lang.System.nanoTime()
            r7.p = r0
            return
        L_0x00d9:
            r0 = move-exception
            goto L_0x00e1
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            r3 = r20
            goto L_0x00e1
        L_0x00df:
            r0 = move-exception
            goto L_0x0098
        L_0x00e1:
            java.net.Socket r4 = r7.c
            if (r4 == 0) goto L_0x00e8
            q0.h0.c.e(r4)
        L_0x00e8:
            java.net.Socket r4 = r7.b
            if (r4 == 0) goto L_0x00ef
            q0.h0.c.e(r4)
        L_0x00ef:
            r7.c = r14
            r7.b = r14
            r7.g = r14
            r7.h = r14
            r7.d = r14
            r7.e = r14
            r7.f = r14
            r4 = 1
            r7.n = r4
            q0.g0 r4 = r7.q
            java.net.InetSocketAddress r5 = r4.c
            java.net.Proxy r4 = r4.b
            m0.n.b.i.e(r8, r12)
            m0.n.b.i.e(r5, r11)
            m0.n.b.i.e(r4, r10)
            java.lang.String r4 = "ioe"
            m0.n.b.i.e(r0, r4)
            java.lang.String r4 = "e"
            if (r15 != 0) goto L_0x011e
            okhttp3.internal.connection.RouteException r15 = new okhttp3.internal.connection.RouteException
            r15.<init>(r0)
            goto L_0x0128
        L_0x011e:
            m0.n.b.i.e(r0, r4)
            java.io.IOException r5 = r15.d
            i0.j.f.p.h.m(r5, r0)
            r15.c = r0
        L_0x0128:
            if (r21 == 0) goto L_0x015b
            m0.n.b.i.e(r0, r4)
            r4 = 1
            r13.c = r4
            boolean r5 = r13.b
            if (r5 != 0) goto L_0x0135
            goto L_0x0156
        L_0x0135:
            boolean r5 = r0 instanceof java.net.ProtocolException
            if (r5 == 0) goto L_0x013a
            goto L_0x0156
        L_0x013a:
            boolean r5 = r0 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L_0x013f
            goto L_0x0156
        L_0x013f:
            boolean r5 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x014c
            java.lang.Throwable r5 = r0.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x014c
            goto L_0x0156
        L_0x014c:
            boolean r5 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r4 = 0
        L_0x0157:
            if (r4 == 0) goto L_0x015b
            goto L_0x0077
        L_0x015b:
            throw r15
        L_0x015c:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.g.c(int, int, int, int, boolean, q0.f, q0.t):void");
    }

    public final void d(a0 a0Var, g0 g0Var, IOException iOException) {
        m0.n.b.i.e(a0Var, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        m0.n.b.i.e(g0Var, "failedRoute");
        m0.n.b.i.e(iOException, "failure");
        if (g0Var.b.type() != Proxy.Type.DIRECT) {
            a aVar = g0Var.a;
            aVar.k.connectFailed(aVar.a.j(), g0Var.b.address(), iOException);
        }
        i iVar = a0Var.z2;
        synchronized (iVar) {
            m0.n.b.i.e(g0Var, "failedRoute");
            iVar.a.add(g0Var);
        }
    }

    public final void e(int i2, int i3, f fVar, t tVar) throws IOException {
        Socket socket;
        int i4;
        g0 g0Var = this.q;
        Proxy proxy = g0Var.b;
        a aVar = g0Var.a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i4 = f.a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = aVar.e.createSocket();
            m0.n.b.i.c(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        InetSocketAddress inetSocketAddress = this.q.c;
        Objects.requireNonNull(tVar);
        m0.n.b.i.e(fVar, NotificationCompat.CATEGORY_CALL);
        m0.n.b.i.e(inetSocketAddress, "inetSocketAddress");
        m0.n.b.i.e(proxy, "proxy");
        socket.setSoTimeout(i3);
        try {
            h.a aVar2 = q0.h0.l.h.c;
            q0.h0.l.h.a.e(socket, this.q.c, i2);
            try {
                this.g = m0.r.t.a.r.m.a1.a.c0(m0.r.t.a.r.m.a1.a.E3(socket));
                this.h = m0.r.t.a.r.m.a1.a.b0(m0.r.t.a.r.m.a1.a.B3(socket));
            } catch (NullPointerException e2) {
                if (m0.n.b.i.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to connect to ");
            P0.append(this.q.c);
            ConnectException connectException = new ConnectException(P0.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i2, int i3, int i4, f fVar, t tVar) throws IOException {
        b0 b0Var;
        int i5 = i3;
        f fVar2 = fVar;
        b0.a aVar = new b0.a();
        aVar.i(this.q.a.a);
        a0 a0Var = null;
        aVar.e("CONNECT", (d0) null);
        boolean z = true;
        aVar.c("Host", c.w(this.q.a.a, true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", "okhttp/4.9.1");
        b0 b2 = aVar.b();
        e0.a aVar2 = new e0.a();
        aVar2.g(b2);
        aVar2.f(Protocol.HTTP_1_1);
        aVar2.c = 407;
        aVar2.e("Preemptive Authenticate");
        aVar2.g = c.c;
        aVar2.k = -1;
        aVar2.l = -1;
        m0.n.b.i.e("Proxy-Authenticate", "name");
        m0.n.b.i.e("OkHttp-Preemptive", InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        v.a aVar3 = aVar2.f;
        Objects.requireNonNull(aVar3);
        m0.n.b.i.e("Proxy-Authenticate", "name");
        m0.n.b.i.e("OkHttp-Preemptive", InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        v.b bVar = v.c;
        bVar.a("Proxy-Authenticate");
        bVar.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.f("Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate", "OkHttp-Preemptive");
        e0 a = aVar2.a();
        g0 g0Var = this.q;
        b0 a2 = g0Var.a.i.a(g0Var, a);
        if (a2 != null) {
            b2 = a2;
        }
        w wVar = b0Var.b;
        int i6 = 0;
        while (i6 < 21) {
            e(i2, i5, fVar2, tVar);
            String str = "CONNECT " + c.w(wVar, z) + " HTTP/1.1";
            while (true) {
                i iVar = this.g;
                m0.n.b.i.c(iVar);
                r0.h hVar = this.h;
                m0.n.b.i.c(hVar);
                b bVar2 = new b(a0Var, this, iVar, hVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.d().g((long) i5, timeUnit);
                hVar.d().g((long) i4, timeUnit);
                bVar2.k(b0Var.d, str);
                bVar2.g.flush();
                e0.a d2 = bVar2.d(false);
                m0.n.b.i.c(d2);
                d2.g(b0Var);
                e0 a3 = d2.a();
                m0.n.b.i.e(a3, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                long k2 = c.k(a3);
                if (k2 != -1) {
                    y j2 = bVar2.j(k2);
                    c.u(j2, Integer.MAX_VALUE, timeUnit);
                    ((b.d) j2).close();
                }
                int i7 = a3.y;
                if (i7 != 200) {
                    if (i7 == 407) {
                        g0 g0Var2 = this.q;
                        b0 a4 = g0Var2.a.i.a(g0Var2, a3);
                        if (a4 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (StringsKt__IndentKt.f("close", e0.b(a3, Header.CONNECTION, (String) null, 2), true)) {
                            b0Var = a4;
                            z = true;
                            break;
                        } else {
                            int i8 = i2;
                            t tVar2 = tVar;
                            b0 b0Var2 = a4;
                            a0Var = null;
                            b0Var = b0Var2;
                        }
                    } else {
                        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected response code for CONNECT: ");
                        P0.append(a3.y);
                        throw new IOException(P0.toString());
                    }
                } else if (!iVar.c().t() || !hVar.c().t()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    z = true;
                    b0Var = null;
                }
            }
            if (b0Var != null) {
                Socket socket = this.b;
                if (socket != null) {
                    c.e(socket);
                }
                a0Var = null;
                this.b = null;
                this.h = null;
                this.g = null;
                g0 g0Var3 = this.q;
                InetSocketAddress inetSocketAddress = g0Var3.c;
                Proxy proxy = g0Var3.b;
                m0.n.b.i.e(fVar2, NotificationCompat.CATEGORY_CALL);
                m0.n.b.i.e(inetSocketAddress, "inetSocketAddress");
                m0.n.b.i.e(proxy, "proxy");
                i6++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(q0.h0.g.b r11, int r12, q0.f r13, q0.t r14) throws java.io.IOException {
        /*
            r10 = this;
            q0.g0 r14 = r10.q
            q0.a r14 = r14.a
            javax.net.ssl.SSLSocketFactory r0 = r14.f
            if (r0 != 0) goto L_0x0025
            java.util.List<okhttp3.Protocol> r11 = r14.b
            okhttp3.Protocol r13 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x001c
            java.net.Socket r11 = r10.b
            r10.c = r11
            r10.e = r13
            r10.m(r12)
            return
        L_0x001c:
            java.net.Socket r11 = r10.b
            r10.c = r11
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1
            r10.e = r11
            return
        L_0x0025:
            java.lang.String r14 = "call"
            m0.n.b.i.e(r13, r14)
            q0.g0 r0 = r10.q
            q0.a r0 = r0.a
            javax.net.ssl.SSLSocketFactory r1 = r0.f
            r2 = 0
            m0.n.b.i.c(r1)     // Catch:{ all -> 0x018a }
            java.net.Socket r3 = r10.b     // Catch:{ all -> 0x018a }
            q0.w r4 = r0.a     // Catch:{ all -> 0x018a }
            java.lang.String r5 = r4.g     // Catch:{ all -> 0x018a }
            int r4 = r4.h     // Catch:{ all -> 0x018a }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r5, r4, r6)     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x0182
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x018a }
            q0.m r11 = r11.a(r1)     // Catch:{ all -> 0x017f }
            boolean r3 = r11.f     // Catch:{ all -> 0x017f }
            if (r3 == 0) goto L_0x005a
            q0.h0.l.h$a r3 = q0.h0.l.h.c     // Catch:{ all -> 0x017f }
            q0.h0.l.h r3 = q0.h0.l.h.a     // Catch:{ all -> 0x017f }
            q0.w r4 = r0.a     // Catch:{ all -> 0x017f }
            java.lang.String r4 = r4.g     // Catch:{ all -> 0x017f }
            java.util.List<okhttp3.Protocol> r5 = r0.b     // Catch:{ all -> 0x017f }
            r3.d(r1, r4, r5)     // Catch:{ all -> 0x017f }
        L_0x005a:
            r1.startHandshake()     // Catch:{ all -> 0x017f }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x017f }
            java.lang.String r4 = "sslSocketSession"
            m0.n.b.i.d(r3, r4)     // Catch:{ all -> 0x017f }
            okhttp3.Handshake r4 = okhttp3.Handshake.a(r3)     // Catch:{ all -> 0x017f }
            javax.net.ssl.HostnameVerifier r5 = r0.g     // Catch:{ all -> 0x017f }
            m0.n.b.i.c(r5)     // Catch:{ all -> 0x017f }
            q0.w r7 = r0.a     // Catch:{ all -> 0x017f }
            java.lang.String r7 = r7.g     // Catch:{ all -> 0x017f }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x017f }
            if (r3 != 0) goto L_0x0119
            java.util.List r11 = r4.c()     // Catch:{ all -> 0x017f }
            boolean r12 = r11.isEmpty()     // Catch:{ all -> 0x017f }
            r12 = r12 ^ r6
            if (r12 == 0) goto L_0x00f9
            r12 = 0
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x017f }
            if (r11 != 0) goto L_0x0093
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x017f }
            java.lang.String r12 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r12)     // Catch:{ all -> 0x017f }
            throw r11     // Catch:{ all -> 0x017f }
        L_0x0093:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x017f }
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r13.<init>()     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "\n              |Hostname "
            r13.append(r14)     // Catch:{ all -> 0x017f }
            q0.w r14 = r0.a     // Catch:{ all -> 0x017f }
            java.lang.String r14 = r14.g     // Catch:{ all -> 0x017f }
            r13.append(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = " not verified:\n              |    certificate: "
            r13.append(r14)     // Catch:{ all -> 0x017f }
            q0.h$a r14 = q0.h.b     // Catch:{ all -> 0x017f }
            java.lang.String r14 = r14.a(r11)     // Catch:{ all -> 0x017f }
            r13.append(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "\n              |    DN: "
            r13.append(r14)     // Catch:{ all -> 0x017f }
            java.security.Principal r14 = r11.getSubjectDN()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "cert.subjectDN"
            m0.n.b.i.d(r14, r0)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x017f }
            r13.append(r14)     // Catch:{ all -> 0x017f }
            java.lang.String r14 = "\n              |    subjectAltNames: "
            r13.append(r14)     // Catch:{ all -> 0x017f }
            q0.h0.n.d r14 = q0.h0.n.d.a     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "certificate"
            m0.n.b.i.e(r11, r0)     // Catch:{ all -> 0x017f }
            r0 = 7
            java.util.List r0 = r14.a(r11, r0)     // Catch:{ all -> 0x017f }
            r3 = 2
            java.util.List r11 = r14.a(r11, r3)     // Catch:{ all -> 0x017f }
            java.util.List r11 = m0.j.g.Z(r0, r11)     // Catch:{ all -> 0x017f }
            r13.append(r11)     // Catch:{ all -> 0x017f }
            java.lang.String r11 = "\n              "
            r13.append(r11)     // Catch:{ all -> 0x017f }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x017f }
            java.lang.String r11 = kotlin.text.StringsKt__IndentKt.Z(r11, r2, r6)     // Catch:{ all -> 0x017f }
            r12.<init>(r11)     // Catch:{ all -> 0x017f }
            throw r12     // Catch:{ all -> 0x017f }
        L_0x00f9:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r12.<init>()     // Catch:{ all -> 0x017f }
            java.lang.String r13 = "Hostname "
            r12.append(r13)     // Catch:{ all -> 0x017f }
            q0.w r13 = r0.a     // Catch:{ all -> 0x017f }
            java.lang.String r13 = r13.g     // Catch:{ all -> 0x017f }
            r12.append(r13)     // Catch:{ all -> 0x017f }
            java.lang.String r13 = " not verified (no certificates)"
            r12.append(r13)     // Catch:{ all -> 0x017f }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x017f }
            r11.<init>(r12)     // Catch:{ all -> 0x017f }
            throw r11     // Catch:{ all -> 0x017f }
        L_0x0119:
            q0.h r3 = r0.h     // Catch:{ all -> 0x017f }
            m0.n.b.i.c(r3)     // Catch:{ all -> 0x017f }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x017f }
            okhttp3.TlsVersion r6 = r4.b     // Catch:{ all -> 0x017f }
            q0.j r7 = r4.c     // Catch:{ all -> 0x017f }
            java.util.List<java.security.cert.Certificate> r8 = r4.d     // Catch:{ all -> 0x017f }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x017f }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x017f }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x017f }
            r10.d = r5     // Catch:{ all -> 0x017f }
            q0.w r0 = r0.a     // Catch:{ all -> 0x017f }
            java.lang.String r0 = r0.g     // Catch:{ all -> 0x017f }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x017f }
            r4.<init>(r10)     // Catch:{ all -> 0x017f }
            r3.a(r0, r4)     // Catch:{ all -> 0x017f }
            boolean r11 = r11.f     // Catch:{ all -> 0x017f }
            if (r11 == 0) goto L_0x0148
            q0.h0.l.h$a r11 = q0.h0.l.h.c     // Catch:{ all -> 0x017f }
            q0.h0.l.h r11 = q0.h0.l.h.a     // Catch:{ all -> 0x017f }
            java.lang.String r2 = r11.f(r1)     // Catch:{ all -> 0x017f }
        L_0x0148:
            r10.c = r1     // Catch:{ all -> 0x017f }
            r0.y r11 = m0.r.t.a.r.m.a1.a.E3(r1)     // Catch:{ all -> 0x017f }
            r0.i r11 = m0.r.t.a.r.m.a1.a.c0(r11)     // Catch:{ all -> 0x017f }
            r10.g = r11     // Catch:{ all -> 0x017f }
            r0.w r11 = m0.r.t.a.r.m.a1.a.B3(r1)     // Catch:{ all -> 0x017f }
            r0.h r11 = m0.r.t.a.r.m.a1.a.b0(r11)     // Catch:{ all -> 0x017f }
            r10.h = r11     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x0167
            okhttp3.Protocol$a r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x017f }
            okhttp3.Protocol r11 = r11.a(r2)     // Catch:{ all -> 0x017f }
            goto L_0x0169
        L_0x0167:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x017f }
        L_0x0169:
            r10.e = r11     // Catch:{ all -> 0x017f }
            q0.h0.l.h$a r11 = q0.h0.l.h.c
            q0.h0.l.h r11 = q0.h0.l.h.a
            r11.a(r1)
            m0.n.b.i.e(r13, r14)
            okhttp3.Protocol r11 = r10.e
            okhttp3.Protocol r13 = okhttp3.Protocol.HTTP_2
            if (r11 != r13) goto L_0x017e
            r10.m(r12)
        L_0x017e:
            return
        L_0x017f:
            r11 = move-exception
            r2 = r1
            goto L_0x018b
        L_0x0182:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x018a }
            java.lang.String r12 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r12)     // Catch:{ all -> 0x018a }
            throw r11     // Catch:{ all -> 0x018a }
        L_0x018a:
            r11 = move-exception
        L_0x018b:
            if (r2 == 0) goto L_0x0194
            q0.h0.l.h$a r12 = q0.h0.l.h.c
            q0.h0.l.h r12 = q0.h0.l.h.a
            r12.a(r2)
        L_0x0194:
            if (r2 == 0) goto L_0x0199
            q0.h0.c.e(r2)
        L_0x0199:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.g.g(q0.h0.g.b, int, q0.f, q0.t):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r8 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC, Splitter:B:53:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(q0.a r7, java.util.List<q0.g0> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "address"
            m0.n.b.i.e(r7, r0)
            byte[] r0 = q0.h0.c.a
            java.util.List<java.lang.ref.Reference<q0.h0.g.e>> r0 = r6.o
            int r0 = r0.size()
            int r1 = r6.n
            r2 = 0
            if (r0 >= r1) goto L_0x00ff
            boolean r0 = r6.i
            if (r0 == 0) goto L_0x0018
            goto L_0x00ff
        L_0x0018:
            q0.g0 r0 = r6.q
            q0.a r0 = r0.a
            boolean r0 = r0.a(r7)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            q0.w r0 = r7.a
            java.lang.String r0 = r0.g
            q0.g0 r1 = r6.q
            q0.a r1 = r1.a
            q0.w r1 = r1.a
            java.lang.String r1 = r1.g
            boolean r0 = m0.n.b.i.a(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0037
            return r1
        L_0x0037:
            q0.h0.j.d r0 = r6.f
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r8 == 0) goto L_0x00ff
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0045
            goto L_0x007e
        L_0x0045:
            java.util.Iterator r8 = r8.iterator()
        L_0x0049:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r8.next()
            q0.g0 r0 = (q0.g0) r0
            java.net.Proxy r3 = r0.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            q0.g0 r3 = r6.q
            java.net.Proxy r3 = r3.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            q0.g0 r3 = r6.q
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r0 = r0.c
            boolean r0 = m0.n.b.i.a(r3, r0)
            if (r0 == 0) goto L_0x0079
            r0 = r1
            goto L_0x007a
        L_0x0079:
            r0 = r2
        L_0x007a:
            if (r0 == 0) goto L_0x0049
            r8 = r1
            goto L_0x007f
        L_0x007e:
            r8 = r2
        L_0x007f:
            if (r8 != 0) goto L_0x0083
            goto L_0x00ff
        L_0x0083:
            javax.net.ssl.HostnameVerifier r8 = r7.g
            q0.h0.n.d r0 = q0.h0.n.d.a
            if (r8 == r0) goto L_0x008a
            return r2
        L_0x008a:
            q0.w r8 = r7.a
            byte[] r3 = q0.h0.c.a
            q0.g0 r3 = r6.q
            q0.a r3 = r3.a
            q0.w r3 = r3.a
            int r4 = r8.h
            int r5 = r3.h
            if (r4 == r5) goto L_0x009b
            goto L_0x00d6
        L_0x009b:
            java.lang.String r4 = r8.g
            java.lang.String r3 = r3.g
            boolean r3 = m0.n.b.i.a(r4, r3)
            if (r3 == 0) goto L_0x00a6
            goto L_0x00d4
        L_0x00a6:
            boolean r3 = r6.j
            if (r3 != 0) goto L_0x00d6
            okhttp3.Handshake r3 = r6.d
            if (r3 == 0) goto L_0x00d6
            m0.n.b.i.c(r3)
            java.util.List r3 = r3.c()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x00d1
            java.lang.String r8 = r8.g
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r8 = r0.b(r8, r3)
            if (r8 == 0) goto L_0x00d1
            r8 = r1
            goto L_0x00d2
        L_0x00d1:
            r8 = r2
        L_0x00d2:
            if (r8 == 0) goto L_0x00d6
        L_0x00d4:
            r8 = r1
            goto L_0x00d7
        L_0x00d6:
            r8 = r2
        L_0x00d7:
            if (r8 != 0) goto L_0x00da
            return r2
        L_0x00da:
            q0.h r8 = r7.h     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            m0.n.b.i.c(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            q0.w r7 = r7.a     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r7 = r7.g     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            okhttp3.Handshake r0 = r6.d     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            m0.n.b.i.c(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.util.List r0 = r0.c()     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r3 = "hostname"
            m0.n.b.i.e(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r3 = "peerCertificates"
            m0.n.b.i.e(r0, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            okhttp3.CertificatePinner$check$1 r3 = new okhttp3.CertificatePinner$check$1     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            r3.<init>(r8, r0, r7)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            r8.a(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            return r1
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.g.h(q0.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = q0.h0.c.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.b
            m0.n.b.i.c(r2)
            java.net.Socket r3 = r9.c
            m0.n.b.i.c(r3)
            r0.i r4 = r9.g
            m0.n.b.i.c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0087
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0087
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0087
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x0087
        L_0x002f:
            q0.h0.j.d r2 = r9.f
            r6 = 1
            if (r2 == 0) goto L_0x0051
            monitor-enter(r2)
            boolean r10 = r2.b2     // Catch:{ all -> 0x004e }
            if (r10 == 0) goto L_0x003b
            monitor-exit(r2)
            goto L_0x004d
        L_0x003b:
            long r3 = r2.k2     // Catch:{ all -> 0x004e }
            long r7 = r2.j2     // Catch:{ all -> 0x004e }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004b
            long r3 = r2.m2     // Catch:{ all -> 0x004e }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004b
            monitor-exit(r2)
            goto L_0x004d
        L_0x004b:
            monitor-exit(r2)
            r5 = r6
        L_0x004d:
            return r5
        L_0x004e:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0051:
            monitor-enter(r9)
            long r7 = r9.p     // Catch:{ all -> 0x0084 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            if (r10 == 0) goto L_0x0083
            java.lang.String r10 = "$this$isHealthy"
            m0.n.b.i.e(r3, r10)
            java.lang.String r10 = "source"
            m0.n.b.i.e(r4, r10)
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x007c }
            boolean r0 = r4.t()     // Catch:{ all -> 0x007c }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            r5 = r0
            goto L_0x0082
        L_0x007c:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
        L_0x0081:
            r5 = r6
        L_0x0082:
            return r5
        L_0x0083:
            return r6
        L_0x0084:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0087:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.g.i(boolean):boolean");
    }

    public final boolean j() {
        return this.f != null;
    }

    public final q0.h0.h.d k(a0 a0Var, q0.h0.h.g gVar) throws SocketException {
        m0.n.b.i.e(a0Var, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        m0.n.b.i.e(gVar, "chain");
        Socket socket = this.c;
        m0.n.b.i.c(socket);
        i iVar = this.g;
        m0.n.b.i.c(iVar);
        r0.h hVar = this.h;
        m0.n.b.i.c(hVar);
        d dVar = this.f;
        if (dVar != null) {
            return new q0.h0.j.k(a0Var, this, gVar, dVar);
        }
        socket.setSoTimeout(gVar.h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.d().g((long) gVar.h, timeUnit);
        hVar.d().g((long) gVar.i, timeUnit);
        return new b(a0Var, this, iVar, hVar);
    }

    public final synchronized void l() {
        this.i = true;
    }

    public final void m(int i2) throws IOException {
        String str;
        Socket socket = this.c;
        m0.n.b.i.c(socket);
        i iVar = this.g;
        m0.n.b.i.c(iVar);
        r0.h hVar = this.h;
        m0.n.b.i.c(hVar);
        socket.setSoTimeout(0);
        q0.h0.f.d dVar = q0.h0.f.d.a;
        d.b bVar = new d.b(true, dVar);
        String str2 = this.q.a.a.g;
        m0.n.b.i.e(socket, "socket");
        m0.n.b.i.e(str2, "peerName");
        m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        m0.n.b.i.e(hVar, "sink");
        bVar.a = socket;
        if (bVar.h) {
            str = c.g + ' ' + str2;
        } else {
            str = i0.d.a.a.a.n0("MockWebServer ", str2);
        }
        bVar.b = str;
        bVar.c = iVar;
        bVar.d = hVar;
        m0.n.b.i.e(this, "listener");
        bVar.e = this;
        bVar.g = i2;
        d dVar2 = new d(bVar);
        this.f = dVar2;
        d dVar3 = d.d;
        r rVar = d.c;
        this.n = (rVar.a & 16) != 0 ? rVar.b[4] : Integer.MAX_VALUE;
        m0.n.b.i.e(dVar, "taskRunner");
        n nVar = dVar2.u2;
        synchronized (nVar) {
            if (nVar.x) {
                throw new IOException("closed");
            } else if (nVar.Z1) {
                Logger logger = n.c;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.i(">> CONNECTION " + q0.h0.j.c.a.f(), new Object[0]));
                }
                nVar.Y1.l0(q0.h0.j.c.a);
                nVar.Y1.flush();
            }
        }
        n nVar2 = dVar2.u2;
        r rVar2 = dVar2.n2;
        synchronized (nVar2) {
            m0.n.b.i.e(rVar2, "settings");
            if (!nVar2.x) {
                nVar2.e(0, Integer.bitCount(rVar2.a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    if (((1 << i3) & rVar2.a) != 0) {
                        nVar2.Y1.m(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                        nVar2.Y1.o(rVar2.b[i3]);
                    }
                    i3++;
                }
                nVar2.Y1.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = dVar2.n2.a();
        if (a != 65535) {
            dVar2.u2.n(0, (long) (a - 65535));
        }
        q0.h0.f.c f2 = dVar.f();
        String str3 = dVar2.Y1;
        f2.c(new q0.h0.f.b(dVar2.v2, str3, true, str3, true), 0);
    }

    public String toString() {
        Object obj;
        StringBuilder P0 = i0.d.a.a.a.P0("Connection{");
        P0.append(this.q.a.a.g);
        P0.append(':');
        P0.append(this.q.a.a.h);
        P0.append(',');
        P0.append(" proxy=");
        P0.append(this.q.b);
        P0.append(" hostAddress=");
        P0.append(this.q.c);
        P0.append(" cipherSuite=");
        Handshake handshake = this.d;
        if (handshake == null || (obj = handshake.c) == null) {
            obj = "none";
        }
        P0.append(obj);
        P0.append(" protocol=");
        P0.append(this.e);
        P0.append('}');
        return P0.toString();
    }
}
