package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.Handshake;
import okhttp3.Handshake$Companion$get$1;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.cache.DiskLruCache;
import okio.ByteString;
import q0.b0;
import q0.e0;
import q0.h0.l.h;
import q0.v;
import q0.y;
import r0.f;
import r0.i;
import r0.j;
import r0.k;
import r0.s;
import r0.t;
import r0.w;
import r0.y;

/* compiled from: Cache.kt */
public final class d implements Closeable, Flushable {
    public int Y1;
    public final DiskLruCache c;
    public int d;
    public int q;
    public int x;
    public int y;

    /* compiled from: Cache.kt */
    public static final class a extends f0 {
        public final i c;
        public final DiskLruCache.b d;
        public final String q;
        public final String x;

        /* renamed from: q0.d$a$a  reason: collision with other inner class name */
        /* compiled from: Cache.kt */
        public static final class C0284a extends k {
            public final /* synthetic */ a d;
            public final /* synthetic */ y q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0284a(a aVar, y yVar, y yVar2) {
                super(yVar2);
                this.d = aVar;
                this.q = yVar;
            }

            public void close() throws IOException {
                this.d.d.close();
                this.c.close();
            }
        }

        public a(DiskLruCache.b bVar, String str, String str2) {
            m0.n.b.i.e(bVar, "snapshot");
            this.d = bVar;
            this.q = str;
            this.x = str2;
            y yVar = bVar.q.get(1);
            this.c = m0.r.t.a.r.m.a1.a.c0(new C0284a(this, yVar, yVar));
        }

        public long contentLength() {
            String str = this.x;
            if (str != null) {
                byte[] bArr = q0.h0.c.a;
                m0.n.b.i.e(str, "$this$toLongOrDefault");
                try {
                    return Long.parseLong(str);
                } catch (NumberFormatException unused) {
                }
            }
            return -1;
        }

        public y contentType() {
            String str = this.q;
            if (str == null) {
                return null;
            }
            y.a aVar = y.c;
            return y.a.b(str);
        }

        public i source() {
            return this.c;
        }
    }

    /* compiled from: Cache.kt */
    public final class c implements q0.h0.e.c {
        public final w a;
        public final w b;
        public boolean c;
        public final DiskLruCache.Editor d;
        public final /* synthetic */ d e;

        /* compiled from: Cache.kt */
        public static final class a extends j {
            public final /* synthetic */ c d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, w wVar) {
                super(wVar);
                this.d = cVar;
            }

            public void close() throws IOException {
                synchronized (this.d.e) {
                    c cVar = this.d;
                    if (!cVar.c) {
                        cVar.c = true;
                        cVar.e.d++;
                        this.c.close();
                        this.d.d.b();
                    }
                }
            }
        }

        public c(d dVar, DiskLruCache.Editor editor) {
            m0.n.b.i.e(editor, "editor");
            this.e = dVar;
            this.d = editor;
            w d2 = editor.d(1);
            this.a = d2;
            this.b = new a(this, d2);
        }

        public void a() {
            synchronized (this.e) {
                if (!this.c) {
                    this.c = true;
                    this.e.q++;
                    q0.h0.c.d(this.a);
                    try {
                        this.d.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public d(File file, long j) {
        m0.n.b.i.e(file, "directory");
        q0.h0.k.b bVar = q0.h0.k.b.a;
        m0.n.b.i.e(file, "directory");
        m0.n.b.i.e(bVar, "fileSystem");
        this.c = new DiskLruCache(bVar, file, 201105, 2, j, q0.h0.f.d.a);
    }

    public static final String b(w wVar) {
        m0.n.b.i.e(wVar, "url");
        return ByteString.d.c(wVar.l).b("MD5").f();
    }

    public static final int e(i iVar) throws IOException {
        m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        try {
            long B = iVar.B();
            String e0 = iVar.e0();
            if (B >= 0 && B <= ((long) Integer.MAX_VALUE)) {
                if (!(e0.length() > 0)) {
                    return (int) B;
                }
            }
            throw new IOException("expected an int but was \"" + B + e0 + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static final Set<String> i(v vVar) {
        int size = vVar.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt__IndentKt.f("Vary", vVar.c(i), true)) {
                String k = vVar.k(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    m0.n.b.i.d(comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                for (String str : StringsKt__IndentKt.D(k, new char[]{','}, false, 0, 6)) {
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    treeSet.add(StringsKt__IndentKt.X(str).toString());
                }
            }
        }
        return treeSet != null ? treeSet : EmptySet.c;
    }

    public final e0 a(b0 b0Var) {
        boolean z;
        m0.n.b.i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        try {
            DiskLruCache.b f = this.c.f(b(b0Var.b));
            if (f != null) {
                try {
                    boolean z2 = false;
                    b bVar = new b(f.q.get(0));
                    m0.n.b.i.e(f, "snapshot");
                    String b2 = bVar.i.b(Header.CONTENT_TYPE);
                    String b3 = bVar.i.b("Content-Length");
                    b0.a aVar = new b0.a();
                    aVar.h(bVar.c);
                    aVar.e(bVar.e, (d0) null);
                    aVar.d(bVar.d);
                    b0 b4 = aVar.b();
                    e0.a aVar2 = new e0.a();
                    aVar2.g(b4);
                    aVar2.f(bVar.f);
                    aVar2.c = bVar.g;
                    aVar2.e(bVar.h);
                    aVar2.d(bVar.i);
                    aVar2.g = new a(f, b2, b3);
                    aVar2.e = bVar.j;
                    aVar2.k = bVar.k;
                    aVar2.l = bVar.l;
                    e0 a2 = aVar2.a();
                    m0.n.b.i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
                    m0.n.b.i.e(a2, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (m0.n.b.i.a(bVar.c, b0Var.b.l) && m0.n.b.i.a(bVar.e, b0Var.c)) {
                        v vVar = bVar.d;
                        m0.n.b.i.e(a2, "cachedResponse");
                        m0.n.b.i.e(vVar, "cachedRequest");
                        m0.n.b.i.e(b0Var, "newRequest");
                        Set<String> i = i(a2.Z1);
                        if (!(i instanceof Collection) || !i.isEmpty()) {
                            Iterator<T> it = i.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str = (String) it.next();
                                List<String> o = vVar.o(str);
                                m0.n.b.i.e(str, "name");
                                if (!m0.n.b.i.a(o, b0Var.d.o(str))) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        return a2;
                    }
                    f0 f0Var = a2.a2;
                    if (f0Var != null) {
                        q0.h0.c.d(f0Var);
                    }
                    return null;
                } catch (IOException unused) {
                    q0.h0.c.d(f);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public void close() throws IOException {
        this.c.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(q0.b0 r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "request"
            m0.n.b.i.e(r7, r0)
            okhttp3.internal.cache.DiskLruCache r0 = r6.c
            q0.w r7 = r7.b
            java.lang.String r7 = b(r7)
            monitor-enter(r0)
            java.lang.String r1 = "key"
            m0.n.b.i.e(r7, r1)     // Catch:{ all -> 0x003d }
            r0.i()     // Catch:{ all -> 0x003d }
            r0.a()     // Catch:{ all -> 0x003d }
            r0.C(r7)     // Catch:{ all -> 0x003d }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r1 = r0.e2     // Catch:{ all -> 0x003d }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x003d }
            okhttp3.internal.cache.DiskLruCache$a r7 = (okhttp3.internal.cache.DiskLruCache.a) r7     // Catch:{ all -> 0x003d }
            r1 = 0
            if (r7 == 0) goto L_0x003b
            java.lang.String r2 = "lruEntries[key] ?: return false"
            m0.n.b.i.d(r7, r2)     // Catch:{ all -> 0x003d }
            r0.y(r7)     // Catch:{ all -> 0x003d }
            long r2 = r0.c2     // Catch:{ all -> 0x003d }
            long r4 = r0.Y1     // Catch:{ all -> 0x003d }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0039
            r0.k2 = r1     // Catch:{ all -> 0x003d }
        L_0x0039:
            monitor-exit(r0)
            goto L_0x003c
        L_0x003b:
            monitor-exit(r0)
        L_0x003c:
            return
        L_0x003d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.d.f(q0.b0):void");
    }

    public void flush() throws IOException {
        this.c.flush();
    }

    /* compiled from: Cache.kt */
    public static final class b {
        public static final String a = "OkHttp-Sent-Millis";
        public static final String b = "OkHttp-Received-Millis";
        public final String c;
        public final v d;
        public final String e;
        public final Protocol f;
        public final int g;
        public final String h;
        public final v i;
        public final Handshake j;
        public final long k;
        public final long l;

        static {
            h.a aVar = h.c;
            Objects.requireNonNull(h.a);
            Objects.requireNonNull(h.a);
        }

        public b(r0.y yVar) throws IOException {
            TlsVersion tlsVersion;
            m0.n.b.i.e(yVar, "rawSource");
            try {
                i c0 = m0.r.t.a.r.m.a1.a.c0(yVar);
                t tVar = (t) c0;
                this.c = tVar.e0();
                this.e = tVar.e0();
                v.a aVar = new v.a();
                int e2 = d.e(c0);
                boolean z = false;
                for (int i2 = 0; i2 < e2; i2++) {
                    aVar.b(tVar.e0());
                }
                this.d = aVar.d();
                q0.h0.h.j a2 = q0.h0.h.j.a(tVar.e0());
                this.f = a2.a;
                this.g = a2.b;
                this.h = a2.c;
                v.a aVar2 = new v.a();
                int e3 = d.e(c0);
                for (int i3 = 0; i3 < e3; i3++) {
                    aVar2.b(tVar.e0());
                }
                String str = a;
                String e4 = aVar2.e(str);
                String str2 = b;
                String e5 = aVar2.e(str2);
                aVar2.f(str);
                aVar2.f(str2);
                long j2 = 0;
                this.k = e4 != null ? Long.parseLong(e4) : 0;
                this.l = e5 != null ? Long.parseLong(e5) : j2;
                this.i = aVar2.d();
                if (StringsKt__IndentKt.J(this.c, "https://", false, 2)) {
                    String e0 = tVar.e0();
                    if (!(e0.length() > 0 ? true : z)) {
                        j b2 = j.s.b(tVar.e0());
                        List<Certificate> a3 = a(c0);
                        List<Certificate> a4 = a(c0);
                        if (!tVar.t()) {
                            tlsVersion = TlsVersion.Companion.a(tVar.e0());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        m0.n.b.i.e(tlsVersion, "tlsVersion");
                        m0.n.b.i.e(b2, "cipherSuite");
                        m0.n.b.i.e(a3, "peerCertificates");
                        m0.n.b.i.e(a4, "localCertificates");
                        this.j = new Handshake(tlsVersion, b2, q0.h0.c.x(a4), new Handshake$Companion$get$1(q0.h0.c.x(a3)));
                    } else {
                        throw new IOException("expected \"\" but was \"" + e0 + '\"');
                    }
                } else {
                    this.j = null;
                }
            } finally {
                yVar.close();
            }
        }

        public final List<Certificate> a(i iVar) throws IOException {
            int e2 = d.e(iVar);
            if (e2 == -1) {
                return EmptyList.c;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(e2);
                for (int i2 = 0; i2 < e2; i2++) {
                    String e0 = ((t) iVar).e0();
                    f fVar = new f();
                    ByteString a2 = ByteString.d.a(e0);
                    m0.n.b.i.c(a2);
                    fVar.F(a2);
                    arrayList.add(instance.generateCertificate(new f.a(fVar)));
                }
                return arrayList;
            } catch (CertificateException e3) {
                throw new IOException(e3.getMessage());
            }
        }

        public final void b(r0.h hVar, List<? extends Certificate> list) throws IOException {
            try {
                s sVar = (s) hVar;
                sVar.B0((long) list.size());
                sVar.u(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] encoded = ((Certificate) list.get(i2)).getEncoded();
                    ByteString.a aVar = ByteString.d;
                    m0.n.b.i.d(encoded, "bytes");
                    sVar.K(ByteString.a.d(aVar, encoded, 0, 0, 3).a()).u(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0110, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0111, code lost:
            i0.j.f.p.h.H(r10, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0114, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(okhttp3.internal.cache.DiskLruCache.Editor r10) throws java.io.IOException {
            /*
                r9 = this;
                java.lang.String r0 = "editor"
                m0.n.b.i.e(r10, r0)
                r0 = 0
                r0.w r10 = r10.d(r0)
                r0.h r10 = m0.r.t.a.r.m.a1.a.b0(r10)
                java.lang.String r1 = r9.c     // Catch:{ all -> 0x010e }
                r2 = r10
                r0.s r2 = (r0.s) r2     // Catch:{ all -> 0x010e }
                r0.h r1 = r2.K(r1)     // Catch:{ all -> 0x010e }
                r3 = 10
                r1.u(r3)     // Catch:{ all -> 0x010e }
                java.lang.String r1 = r9.e     // Catch:{ all -> 0x010e }
                r0.h r1 = r2.K(r1)     // Catch:{ all -> 0x010e }
                r1.u(r3)     // Catch:{ all -> 0x010e }
                q0.v r1 = r9.d     // Catch:{ all -> 0x010e }
                int r1 = r1.size()     // Catch:{ all -> 0x010e }
                long r4 = (long) r1     // Catch:{ all -> 0x010e }
                r2.B0(r4)     // Catch:{ all -> 0x010e }
                r2.u(r3)     // Catch:{ all -> 0x010e }
                q0.v r1 = r9.d     // Catch:{ all -> 0x010e }
                int r1 = r1.size()     // Catch:{ all -> 0x010e }
                r4 = r0
            L_0x0039:
                java.lang.String r5 = ": "
                if (r4 >= r1) goto L_0x005b
                q0.v r6 = r9.d     // Catch:{ all -> 0x010e }
                java.lang.String r6 = r6.c(r4)     // Catch:{ all -> 0x010e }
                r0.h r6 = r2.K(r6)     // Catch:{ all -> 0x010e }
                r0.h r5 = r6.K(r5)     // Catch:{ all -> 0x010e }
                q0.v r6 = r9.d     // Catch:{ all -> 0x010e }
                java.lang.String r6 = r6.k(r4)     // Catch:{ all -> 0x010e }
                r0.h r5 = r5.K(r6)     // Catch:{ all -> 0x010e }
                r5.u(r3)     // Catch:{ all -> 0x010e }
                int r4 = r4 + 1
                goto L_0x0039
            L_0x005b:
                q0.h0.h.j r1 = new q0.h0.h.j     // Catch:{ all -> 0x010e }
                okhttp3.Protocol r4 = r9.f     // Catch:{ all -> 0x010e }
                int r6 = r9.g     // Catch:{ all -> 0x010e }
                java.lang.String r7 = r9.h     // Catch:{ all -> 0x010e }
                r1.<init>(r4, r6, r7)     // Catch:{ all -> 0x010e }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x010e }
                r0.h r1 = r2.K(r1)     // Catch:{ all -> 0x010e }
                r1.u(r3)     // Catch:{ all -> 0x010e }
                q0.v r1 = r9.i     // Catch:{ all -> 0x010e }
                int r1 = r1.size()     // Catch:{ all -> 0x010e }
                r4 = 2
                int r1 = r1 + r4
                long r6 = (long) r1     // Catch:{ all -> 0x010e }
                r2.B0(r6)     // Catch:{ all -> 0x010e }
                r2.u(r3)     // Catch:{ all -> 0x010e }
                q0.v r1 = r9.i     // Catch:{ all -> 0x010e }
                int r1 = r1.size()     // Catch:{ all -> 0x010e }
                r6 = r0
            L_0x0087:
                if (r6 >= r1) goto L_0x00a7
                q0.v r7 = r9.i     // Catch:{ all -> 0x010e }
                java.lang.String r7 = r7.c(r6)     // Catch:{ all -> 0x010e }
                r0.h r7 = r2.K(r7)     // Catch:{ all -> 0x010e }
                r0.h r7 = r7.K(r5)     // Catch:{ all -> 0x010e }
                q0.v r8 = r9.i     // Catch:{ all -> 0x010e }
                java.lang.String r8 = r8.k(r6)     // Catch:{ all -> 0x010e }
                r0.h r7 = r7.K(r8)     // Catch:{ all -> 0x010e }
                r7.u(r3)     // Catch:{ all -> 0x010e }
                int r6 = r6 + 1
                goto L_0x0087
            L_0x00a7:
                java.lang.String r1 = a     // Catch:{ all -> 0x010e }
                r0.h r1 = r2.K(r1)     // Catch:{ all -> 0x010e }
                r0.h r1 = r1.K(r5)     // Catch:{ all -> 0x010e }
                long r6 = r9.k     // Catch:{ all -> 0x010e }
                r0.h r1 = r1.B0(r6)     // Catch:{ all -> 0x010e }
                r1.u(r3)     // Catch:{ all -> 0x010e }
                java.lang.String r1 = b     // Catch:{ all -> 0x010e }
                r0.h r1 = r2.K(r1)     // Catch:{ all -> 0x010e }
                r0.h r1 = r1.K(r5)     // Catch:{ all -> 0x010e }
                long r5 = r9.l     // Catch:{ all -> 0x010e }
                r0.h r1 = r1.B0(r5)     // Catch:{ all -> 0x010e }
                r1.u(r3)     // Catch:{ all -> 0x010e }
                java.lang.String r1 = r9.c     // Catch:{ all -> 0x010e }
                java.lang.String r5 = "https://"
                boolean r0 = kotlin.text.StringsKt__IndentKt.J(r1, r5, r0, r4)     // Catch:{ all -> 0x010e }
                if (r0 == 0) goto L_0x0109
                r2.u(r3)     // Catch:{ all -> 0x010e }
                okhttp3.Handshake r0 = r9.j     // Catch:{ all -> 0x010e }
                m0.n.b.i.c(r0)     // Catch:{ all -> 0x010e }
                q0.j r0 = r0.c     // Catch:{ all -> 0x010e }
                java.lang.String r0 = r0.t     // Catch:{ all -> 0x010e }
                r0.h r0 = r2.K(r0)     // Catch:{ all -> 0x010e }
                r0.u(r3)     // Catch:{ all -> 0x010e }
                okhttp3.Handshake r0 = r9.j     // Catch:{ all -> 0x010e }
                java.util.List r0 = r0.c()     // Catch:{ all -> 0x010e }
                r9.b(r10, r0)     // Catch:{ all -> 0x010e }
                okhttp3.Handshake r0 = r9.j     // Catch:{ all -> 0x010e }
                java.util.List<java.security.cert.Certificate> r0 = r0.d     // Catch:{ all -> 0x010e }
                r9.b(r10, r0)     // Catch:{ all -> 0x010e }
                okhttp3.Handshake r0 = r9.j     // Catch:{ all -> 0x010e }
                okhttp3.TlsVersion r0 = r0.b     // Catch:{ all -> 0x010e }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x010e }
                r0.h r0 = r2.K(r0)     // Catch:{ all -> 0x010e }
                r0.u(r3)     // Catch:{ all -> 0x010e }
            L_0x0109:
                r0 = 0
                i0.j.f.p.h.H(r10, r0)
                return
            L_0x010e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0110 }
            L_0x0110:
                r1 = move-exception
                i0.j.f.p.h.H(r10, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.d.b.c(okhttp3.internal.cache.DiskLruCache$Editor):void");
        }

        public b(e0 e0Var) {
            v vVar;
            m0.n.b.i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
            this.c = e0Var.d.b.l;
            m0.n.b.i.e(e0Var, "$this$varyHeaders");
            e0 e0Var2 = e0Var.b2;
            m0.n.b.i.c(e0Var2);
            v vVar2 = e0Var2.d.d;
            Set<String> i2 = d.i(e0Var.Z1);
            if (i2.isEmpty()) {
                vVar = q0.h0.c.b;
            } else {
                v.a aVar = new v.a();
                int size = vVar2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String c2 = vVar2.c(i3);
                    if (i2.contains(c2)) {
                        aVar.a(c2, vVar2.k(i3));
                    }
                }
                vVar = aVar.d();
            }
            this.d = vVar;
            this.e = e0Var.d.c;
            this.f = e0Var.q;
            this.g = e0Var.y;
            this.h = e0Var.x;
            this.i = e0Var.Z1;
            this.j = e0Var.Y1;
            this.k = e0Var.e2;
            this.l = e0Var.f2;
        }
    }
}
