package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import q0.f;
import q0.h0.c;
import q0.h0.g.e;
import q0.h0.g.i;
import q0.h0.n.d;
import q0.t;

/* compiled from: OkHttpClient.kt */
public class a0 implements Cloneable, f.a {
    public static final List<Protocol> c = c.l(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<m> d = c.l(m.c, m.d);
    public static final b q = new b((m0.n.b.f) null);
    public final List<x> Y1;
    public final List<x> Z1;
    public final t.b a2;
    public final boolean b2;
    public final c c2;
    public final boolean d2;
    public final boolean e2;
    public final p f2;
    public final d g2;
    public final s h2;
    public final Proxy i2;
    public final ProxySelector j2;
    public final c k2;
    public final SocketFactory l2;
    public final SSLSocketFactory m2;
    public final X509TrustManager n2;
    public final List<m> o2;
    public final List<Protocol> p2;
    public final HostnameVerifier q2;
    public final h r2;
    public final q0.h0.n.c s2;
    public final int t2;
    public final int u2;
    public final int v2;
    public final int w2;
    public final q x;
    public final int x2;
    public final l y;
    public final long y2;
    public final i z2;

    /* compiled from: OkHttpClient.kt */
    public static final class a {
        public int A;
        public int B;
        public long C;
        public i D;
        public q a = new q();
        public l b = new l();
        public final List<x> c = new ArrayList();
        public final List<x> d = new ArrayList();
        public t.b e;
        public boolean f;
        public c g;
        public boolean h;
        public boolean i;
        public p j;
        public d k;
        public s l;
        public Proxy m;
        public ProxySelector n;
        public c o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List<m> s;
        public List<? extends Protocol> t;
        public HostnameVerifier u;
        public h v;
        public q0.h0.n.c w;
        public int x;
        public int y;
        public int z;

        public a() {
            t tVar = t.a;
            m0.n.b.i.e(tVar, "$this$asFactory");
            this.e = new q0.h0.a(tVar);
            this.f = true;
            c cVar = c.a;
            this.g = cVar;
            this.h = true;
            this.i = true;
            this.j = p.a;
            this.l = s.a;
            this.o = cVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            m0.n.b.i.d(socketFactory, "SocketFactory.getDefault()");
            this.p = socketFactory;
            b bVar = a0.q;
            this.s = a0.d;
            this.t = a0.c;
            this.u = d.a;
            this.v = h.a;
            this.y = InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT;
            this.z = InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT;
            this.A = InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT;
            this.C = 1024;
        }

        public final a a(x xVar) {
            m0.n.b.i.e(xVar, "interceptor");
            this.c.add(xVar);
            return this;
        }
    }

    /* compiled from: OkHttpClient.kt */
    public static final class b {
        public b(m0.n.b.f fVar) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(q0.a0.a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "builder"
            m0.n.b.i.e(r6, r0)
            r5.<init>()
            q0.q r0 = r6.a
            r5.x = r0
            q0.l r0 = r6.b
            r5.y = r0
            java.util.List<q0.x> r0 = r6.c
            java.util.List r0 = q0.h0.c.x(r0)
            r5.Y1 = r0
            java.util.List<q0.x> r0 = r6.d
            java.util.List r0 = q0.h0.c.x(r0)
            r5.Z1 = r0
            q0.t$b r0 = r6.e
            r5.a2 = r0
            boolean r0 = r6.f
            r5.b2 = r0
            q0.c r0 = r6.g
            r5.c2 = r0
            boolean r0 = r6.h
            r5.d2 = r0
            boolean r0 = r6.i
            r5.e2 = r0
            q0.p r0 = r6.j
            r5.f2 = r0
            q0.d r0 = r6.k
            r5.g2 = r0
            q0.s r0 = r6.l
            r5.h2 = r0
            java.net.Proxy r0 = r6.m
            r5.i2 = r0
            if (r0 == 0) goto L_0x0049
            q0.h0.m.a r0 = q0.h0.m.a.a
            goto L_0x0057
        L_0x0049:
            java.net.ProxySelector r0 = r6.n
            if (r0 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            q0.h0.m.a r0 = q0.h0.m.a.a
        L_0x0057:
            r5.j2 = r0
            q0.c r0 = r6.o
            r5.k2 = r0
            javax.net.SocketFactory r0 = r6.p
            r5.l2 = r0
            java.util.List<q0.m> r0 = r6.s
            r5.o2 = r0
            java.util.List<? extends okhttp3.Protocol> r1 = r6.t
            r5.p2 = r1
            javax.net.ssl.HostnameVerifier r1 = r6.u
            r5.q2 = r1
            int r1 = r6.x
            r5.t2 = r1
            int r1 = r6.y
            r5.u2 = r1
            int r1 = r6.z
            r5.v2 = r1
            int r1 = r6.A
            r5.w2 = r1
            int r1 = r6.B
            r5.x2 = r1
            long r1 = r6.C
            r5.y2 = r1
            q0.h0.g.i r1 = r6.D
            if (r1 == 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            q0.h0.g.i r1 = new q0.h0.g.i
            r1.<init>()
        L_0x008f:
            r5.z2 = r1
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x009e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x009e
            goto L_0x00b4
        L_0x009e:
            java.util.Iterator r0 = r0.iterator()
        L_0x00a2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r1 = r0.next()
            q0.m r1 = (q0.m) r1
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x00a2
            r0 = r2
            goto L_0x00b5
        L_0x00b4:
            r0 = r3
        L_0x00b5:
            r1 = 0
            if (r0 == 0) goto L_0x00c3
            r5.m2 = r1
            r5.s2 = r1
            r5.n2 = r1
            q0.h r6 = q0.h.a
            r5.r2 = r6
            goto L_0x0113
        L_0x00c3:
            javax.net.ssl.SSLSocketFactory r0 = r6.q
            if (r0 == 0) goto L_0x00e3
            r5.m2 = r0
            q0.h0.n.c r0 = r6.w
            m0.n.b.i.c(r0)
            r5.s2 = r0
            javax.net.ssl.X509TrustManager r4 = r6.r
            m0.n.b.i.c(r4)
            r5.n2 = r4
            q0.h r6 = r6.v
            m0.n.b.i.c(r0)
            q0.h r6 = r6.b(r0)
            r5.r2 = r6
            goto L_0x0113
        L_0x00e3:
            q0.h0.l.h$a r0 = q0.h0.l.h.c
            q0.h0.l.h r0 = q0.h0.l.h.a
            javax.net.ssl.X509TrustManager r0 = r0.n()
            r5.n2 = r0
            q0.h0.l.h r4 = q0.h0.l.h.a
            m0.n.b.i.c(r0)
            javax.net.ssl.SSLSocketFactory r4 = r4.m(r0)
            r5.m2 = r4
            m0.n.b.i.c(r0)
            java.lang.String r4 = "trustManager"
            m0.n.b.i.e(r0, r4)
            q0.h0.l.h r4 = q0.h0.l.h.a
            q0.h0.n.c r0 = r4.b(r0)
            r5.s2 = r0
            q0.h r6 = r6.v
            m0.n.b.i.c(r0)
            q0.h r6 = r6.b(r0)
            r5.r2 = r6
        L_0x0113:
            java.util.List<q0.x> r6 = r5.Y1
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r1)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01eb
            java.util.List<q0.x> r6 = r5.Z1
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r1)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01d2
            java.util.List<q0.m> r6 = r5.o2
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x013a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            java.util.Iterator r6 = r6.iterator()
        L_0x013e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r6.next()
            q0.m r0 = (q0.m) r0
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x013e
            r6 = r2
            goto L_0x0151
        L_0x0150:
            r6 = r3
        L_0x0151:
            if (r6 == 0) goto L_0x01a1
            javax.net.ssl.SSLSocketFactory r6 = r5.m2
            if (r6 != 0) goto L_0x0159
            r6 = r3
            goto L_0x015a
        L_0x0159:
            r6 = r2
        L_0x015a:
            java.lang.String r0 = "Check failed."
            if (r6 == 0) goto L_0x0197
            q0.h0.n.c r6 = r5.s2
            if (r6 != 0) goto L_0x0164
            r6 = r3
            goto L_0x0165
        L_0x0164:
            r6 = r2
        L_0x0165:
            if (r6 == 0) goto L_0x018d
            javax.net.ssl.X509TrustManager r6 = r5.n2
            if (r6 != 0) goto L_0x016c
            r2 = r3
        L_0x016c:
            if (r2 == 0) goto L_0x0183
            q0.h r6 = r5.r2
            q0.h r1 = q0.h.a
            boolean r6 = m0.n.b.i.a(r6, r1)
            if (r6 == 0) goto L_0x0179
            goto L_0x01ad
        L_0x0179:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0183:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x018d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0197:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01a1:
            javax.net.ssl.SSLSocketFactory r6 = r5.m2
            if (r6 == 0) goto L_0x01c6
            q0.h0.n.c r6 = r5.s2
            if (r6 == 0) goto L_0x01ba
            javax.net.ssl.X509TrustManager r6 = r5.n2
            if (r6 == 0) goto L_0x01ae
        L_0x01ad:
            return
        L_0x01ae:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01ba:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01c6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01d2:
            java.lang.String r6 = "Null network interceptor: "
            java.lang.StringBuilder r6 = i0.d.a.a.a.P0(r6)
            java.util.List<q0.x> r0 = r5.Z1
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x01eb:
            java.lang.String r6 = "Null interceptor: "
            java.lang.StringBuilder r6 = i0.d.a.a.a.P0(r6)
            java.util.List<q0.x> r0 = r5.Y1
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a0.<init>(q0.a0$a):void");
    }

    public Object clone() {
        return super.clone();
    }

    public f newCall(b0 b0Var) {
        m0.n.b.i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        return new e(this, b0Var, false);
    }

    public a0() {
        this(new a());
    }
}
