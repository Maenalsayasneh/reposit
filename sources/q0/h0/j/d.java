package q0.h0.j;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import q0.h0.j.l;
import q0.h0.j.m;
import q0.h0.l.h;
import r0.h;
import r0.i;

/* compiled from: Http2Connection.kt */
public final class d implements Closeable {
    public static final r c;
    public static final d d = null;
    public final String Y1;
    public int Z1;
    public int a2;
    public boolean b2;
    public final q0.h0.f.d c2;
    public final q0.h0.f.c d2;
    public final q0.h0.f.c e2;
    public final q0.h0.f.c f2;
    public final q g2;
    public long h2;
    public long i2;
    public long j2;
    public long k2;
    public long l2;
    public long m2;
    public final r n2;
    public r o2;
    public long p2;
    public final boolean q;
    public long q2;
    public long r2;
    public long s2;
    public final Socket t2;
    public final n u2;
    public final C0290d v2;
    public final Set<Integer> w2;
    public final c x;
    public final Map<Integer, m> y = new LinkedHashMap();

    /* compiled from: TaskQueue.kt */
    public static final class a extends q0.h0.f.a {
        public final /* synthetic */ d e;
        public final /* synthetic */ long f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, d dVar, long j) {
            super(str2, true);
            this.e = dVar;
            this.f = j;
        }

        public long a() {
            d dVar;
            boolean z;
            synchronized (this.e) {
                dVar = this.e;
                long j = dVar.i2;
                long j2 = dVar.h2;
                if (j < j2) {
                    z = true;
                } else {
                    dVar.h2 = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                dVar.b(errorCode, errorCode, (IOException) null);
                return -1;
            }
            dVar.q(false, 1, 0);
            return this.f;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static final class b {
        public Socket a;
        public String b;
        public i c;
        public h d;
        public c e = c.a;
        public q f = q.a;
        public int g;
        public boolean h;
        public final q0.h0.f.d i;

        public b(boolean z, q0.h0.f.d dVar) {
            m0.n.b.i.e(dVar, "taskRunner");
            this.h = z;
            this.i = dVar;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static abstract class c {
        public static final c a = new a();

        /* compiled from: Http2Connection.kt */
        public static final class a extends c {
            public void b(m mVar) throws IOException {
                m0.n.b.i.e(mVar, "stream");
                mVar.c(ErrorCode.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(d dVar, r rVar) {
            m0.n.b.i.e(dVar, "connection");
            m0.n.b.i.e(rVar, "settings");
        }

        public abstract void b(m mVar) throws IOException;
    }

    /* renamed from: q0.h0.j.d$d  reason: collision with other inner class name */
    /* compiled from: Http2Connection.kt */
    public final class C0290d implements l.b, m0.n.a.a<m0.i> {
        public final l c;
        public final /* synthetic */ d d;

        /* renamed from: q0.h0.j.d$d$a */
        /* compiled from: TaskQueue.kt */
        public static final class a extends q0.h0.f.a {
            public final /* synthetic */ m e;
            public final /* synthetic */ C0290d f;
            public final /* synthetic */ List g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, m mVar, C0290d dVar, m mVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.e = mVar;
                this.f = dVar;
                this.g = list;
            }

            public long a() {
                try {
                    this.f.d.x.b(this.e);
                    return -1;
                } catch (IOException e2) {
                    h.a aVar = q0.h0.l.h.c;
                    q0.h0.l.h hVar = q0.h0.l.h.a;
                    StringBuilder P0 = i0.d.a.a.a.P0("Http2Connection.Listener failure for ");
                    P0.append(this.f.d.Y1);
                    hVar.i(P0.toString(), 4, e2);
                    try {
                        this.e.c(ErrorCode.PROTOCOL_ERROR, e2);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: q0.h0.j.d$d$b */
        /* compiled from: TaskQueue.kt */
        public static final class b extends q0.h0.f.a {
            public final /* synthetic */ C0290d e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, C0290d dVar, int i, int i2) {
                super(str2, z2);
                this.e = dVar;
                this.f = i;
                this.g = i2;
            }

            public long a() {
                this.e.d.q(true, this.f, this.g);
                return -1;
            }
        }

        /* renamed from: q0.h0.j.d$d$c */
        /* compiled from: TaskQueue.kt */
        public static final class c extends q0.h0.f.a {
            public final /* synthetic */ C0290d e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ r g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, C0290d dVar, boolean z3, r rVar) {
                super(str2, z2);
                this.e = dVar;
                this.f = z3;
                this.g = rVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
            /* JADX WARNING: Removed duplicated region for block: B:60:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public long a() {
                /*
                    r21 = this;
                    r1 = r21
                    q0.h0.j.d$d r13 = r1.e
                    boolean r9 = r1.f
                    q0.h0.j.r r10 = r1.g
                    java.util.Objects.requireNonNull(r13)
                    java.lang.String r0 = "settings"
                    m0.n.b.i.e(r10, r0)
                    kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
                    r14.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
                    r15.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                    r0.<init>()
                    q0.h0.j.d r2 = r13.d
                    q0.h0.j.n r12 = r2.u2
                    monitor-enter(r12)
                    q0.h0.j.d r11 = r13.d     // Catch:{ all -> 0x0111 }
                    monitor-enter(r11)     // Catch:{ all -> 0x0111 }
                    q0.h0.j.d r2 = r13.d     // Catch:{ all -> 0x0108 }
                    q0.h0.j.r r2 = r2.o2     // Catch:{ all -> 0x0108 }
                    if (r9 == 0) goto L_0x002f
                    r3 = r10
                    goto L_0x003a
                L_0x002f:
                    q0.h0.j.r r3 = new q0.h0.j.r     // Catch:{ all -> 0x0108 }
                    r3.<init>()     // Catch:{ all -> 0x0108 }
                    r3.b(r2)     // Catch:{ all -> 0x0108 }
                    r3.b(r10)     // Catch:{ all -> 0x0108 }
                L_0x003a:
                    r0.c = r3     // Catch:{ all -> 0x0108 }
                    int r3 = r3.a()     // Catch:{ all -> 0x0108 }
                    long r3 = (long) r3     // Catch:{ all -> 0x0108 }
                    int r2 = r2.a()     // Catch:{ all -> 0x0108 }
                    long r5 = (long) r2     // Catch:{ all -> 0x0108 }
                    long r3 = r3 - r5
                    r14.c = r3     // Catch:{ all -> 0x0108 }
                    r7 = 0
                    int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    r6 = 0
                    if (r2 == 0) goto L_0x0076
                    q0.h0.j.d r2 = r13.d     // Catch:{ all -> 0x0108 }
                    java.util.Map<java.lang.Integer, q0.h0.j.m> r2 = r2.y     // Catch:{ all -> 0x0108 }
                    boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0108 }
                    if (r2 == 0) goto L_0x005b
                    goto L_0x0076
                L_0x005b:
                    q0.h0.j.d r2 = r13.d     // Catch:{ all -> 0x0108 }
                    java.util.Map<java.lang.Integer, q0.h0.j.m> r2 = r2.y     // Catch:{ all -> 0x0108 }
                    java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0108 }
                    q0.h0.j.m[] r3 = new q0.h0.j.m[r6]     // Catch:{ all -> 0x0108 }
                    java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x0108 }
                    if (r2 == 0) goto L_0x006e
                    q0.h0.j.m[] r2 = (q0.h0.j.m[]) r2     // Catch:{ all -> 0x0108 }
                    goto L_0x0077
                L_0x006e:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0108 }
                    java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r0.<init>(r2)     // Catch:{ all -> 0x0108 }
                    throw r0     // Catch:{ all -> 0x0108 }
                L_0x0076:
                    r2 = 0
                L_0x0077:
                    r15.c = r2     // Catch:{ all -> 0x0108 }
                    q0.h0.j.d r2 = r13.d     // Catch:{ all -> 0x0108 }
                    T r3 = r0.c     // Catch:{ all -> 0x0108 }
                    q0.h0.j.r r3 = (q0.h0.j.r) r3     // Catch:{ all -> 0x0108 }
                    java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0108 }
                    java.lang.String r4 = "<set-?>"
                    m0.n.b.i.e(r3, r4)     // Catch:{ all -> 0x0108 }
                    r2.o2 = r3     // Catch:{ all -> 0x0108 }
                    q0.h0.j.d r2 = r13.d     // Catch:{ all -> 0x0108 }
                    q0.h0.f.c r5 = r2.f2     // Catch:{ all -> 0x0108 }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
                    r2.<init>()     // Catch:{ all -> 0x0108 }
                    q0.h0.j.d r3 = r13.d     // Catch:{ all -> 0x0108 }
                    java.lang.String r3 = r3.Y1     // Catch:{ all -> 0x0108 }
                    r2.append(r3)     // Catch:{ all -> 0x0108 }
                    java.lang.String r3 = " onSettings"
                    r2.append(r3)     // Catch:{ all -> 0x0108 }
                    java.lang.String r16 = r2.toString()     // Catch:{ all -> 0x0108 }
                    r17 = 1
                    q0.h0.j.e r4 = new q0.h0.j.e     // Catch:{ all -> 0x0108 }
                    r2 = r4
                    r3 = r16
                    r18 = r4
                    r4 = r17
                    r19 = r5
                    r5 = r16
                    r16 = r6
                    r6 = r17
                    r7 = r13
                    r8 = r0
                    r17 = r11
                    r11 = r14
                    r20 = r12
                    r12 = r15
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0106 }
                    r3 = r18
                    r2 = r19
                    r4 = 0
                    r2.c(r3, r4)     // Catch:{ all -> 0x0106 }
                    monitor-exit(r17)     // Catch:{ all -> 0x010f }
                    q0.h0.j.d r2 = r13.d     // Catch:{ IOException -> 0x00d6 }
                    q0.h0.j.n r2 = r2.u2     // Catch:{ IOException -> 0x00d6 }
                    T r0 = r0.c     // Catch:{ IOException -> 0x00d6 }
                    q0.h0.j.r r0 = (q0.h0.j.r) r0     // Catch:{ IOException -> 0x00d6 }
                    r2.a(r0)     // Catch:{ IOException -> 0x00d6 }
                    goto L_0x00dc
                L_0x00d6:
                    r0 = move-exception
                    q0.h0.j.d r2 = r13.d     // Catch:{ all -> 0x010f }
                    q0.h0.j.d.a(r2, r0)     // Catch:{ all -> 0x010f }
                L_0x00dc:
                    monitor-exit(r20)
                    T r0 = r15.c
                    q0.h0.j.m[] r0 = (q0.h0.j.m[]) r0
                    if (r0 == 0) goto L_0x0103
                    m0.n.b.i.c(r0)
                    int r2 = r0.length
                    r6 = r16
                L_0x00e9:
                    if (r6 >= r2) goto L_0x0103
                    r3 = r0[r6]
                    monitor-enter(r3)
                    long r7 = r14.c     // Catch:{ all -> 0x0100 }
                    long r9 = r3.d     // Catch:{ all -> 0x0100 }
                    long r9 = r9 + r7
                    r3.d = r9     // Catch:{ all -> 0x0100 }
                    int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00fc
                    r3.notifyAll()     // Catch:{ all -> 0x0100 }
                L_0x00fc:
                    monitor-exit(r3)
                    int r6 = r6 + 1
                    goto L_0x00e9
                L_0x0100:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L_0x0103:
                    r2 = -1
                    return r2
                L_0x0106:
                    r0 = move-exception
                    goto L_0x010d
                L_0x0108:
                    r0 = move-exception
                    r17 = r11
                    r20 = r12
                L_0x010d:
                    monitor-exit(r17)     // Catch:{ all -> 0x010f }
                    throw r0     // Catch:{ all -> 0x010f }
                L_0x010f:
                    r0 = move-exception
                    goto L_0x0114
                L_0x0111:
                    r0 = move-exception
                    r20 = r12
                L_0x0114:
                    monitor-exit(r20)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.d.C0290d.c.a():long");
            }
        }

        public C0290d(d dVar, l lVar) {
            m0.n.b.i.e(lVar, "reader");
            this.d = dVar;
            this.c = lVar;
        }

        public void a() {
        }

        public void b(boolean z, r rVar) {
            m0.n.b.i.e(rVar, "settings");
            q0.h0.f.c cVar = this.d.d2;
            String y0 = i0.d.a.a.a.y0(new StringBuilder(), this.d.Y1, " applyAndAckSettings");
            cVar.c(new c(y0, true, y0, true, this, z, rVar), 0);
        }

        public void c(boolean z, int i, int i2, List<a> list) {
            int i3 = i;
            List<a> list2 = list;
            m0.n.b.i.e(list2, "headerBlock");
            if (this.d.f(i3)) {
                d dVar = this.d;
                Objects.requireNonNull(dVar);
                m0.n.b.i.e(list2, "requestHeaders");
                String str = dVar.Y1 + '[' + i3 + "] onHeaders";
                dVar.e2.c(new g(str, true, str, true, dVar, i, list, z), 0);
                return;
            }
            synchronized (this.d) {
                m e = this.d.e(i3);
                if (e == null) {
                    d dVar2 = this.d;
                    if (!dVar2.b2) {
                        if (i3 > dVar2.Z1) {
                            if (i3 % 2 != dVar2.a2 % 2) {
                                m mVar = new m(i, this.d, false, z, q0.h0.c.v(list));
                                d dVar3 = this.d;
                                dVar3.Z1 = i3;
                                dVar3.y.put(Integer.valueOf(i), mVar);
                                q0.h0.f.c f = this.d.c2.f();
                                String str2 = this.d.Y1 + '[' + i3 + "] onStream";
                                a aVar = r1;
                                a aVar2 = new a(str2, true, str2, true, mVar, this, e, i, list, z);
                                f.c(aVar, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                e.j(q0.h0.c.v(list), z);
            }
        }

        public void d(int i, long j) {
            if (i == 0) {
                synchronized (this.d) {
                    d dVar = this.d;
                    dVar.s2 += j;
                    dVar.notifyAll();
                }
                return;
            }
            m e = this.d.e(i);
            if (e != null) {
                synchronized (e) {
                    e.d += j;
                    if (j > 0) {
                        e.notifyAll();
                    }
                }
            }
        }

        public void e(boolean z, int i, i iVar, int i2) throws IOException {
            boolean z2;
            boolean z3;
            long j;
            int i3 = i;
            i iVar2 = iVar;
            int i4 = i2;
            m0.n.b.i.e(iVar2, Stripe3ds2AuthParams.FIELD_SOURCE);
            if (this.d.f(i3)) {
                d dVar = this.d;
                Objects.requireNonNull(dVar);
                m0.n.b.i.e(iVar2, Stripe3ds2AuthParams.FIELD_SOURCE);
                r0.f fVar = new r0.f();
                long j2 = (long) i4;
                iVar2.z0(j2);
                iVar2.q0(fVar, j2);
                String str = dVar.Y1 + '[' + i3 + "] onData";
                dVar.e2.c(new f(str, true, str, true, dVar, i, fVar, i2, z), 0);
                return;
            }
            m e = this.d.e(i3);
            if (e == null) {
                this.d.v(i3, ErrorCode.PROTOCOL_ERROR);
                long j3 = (long) i4;
                this.d.l(j3);
                iVar2.skip(j3);
                return;
            }
            m0.n.b.i.e(iVar2, Stripe3ds2AuthParams.FIELD_SOURCE);
            byte[] bArr = q0.h0.c.a;
            m.b bVar = e.g;
            long j4 = (long) i4;
            Objects.requireNonNull(bVar);
            m0.n.b.i.e(iVar2, Stripe3ds2AuthParams.FIELD_SOURCE);
            while (true) {
                boolean z4 = true;
                if (j4 <= 0) {
                    break;
                }
                synchronized (m.this) {
                    z2 = bVar.y;
                    z3 = bVar.d.d + j4 > bVar.x;
                }
                if (z3) {
                    iVar2.skip(j4);
                    m.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    iVar2.skip(j4);
                    break;
                } else {
                    long q02 = iVar2.q0(bVar.c, j4);
                    if (q02 != -1) {
                        j4 -= q02;
                        synchronized (m.this) {
                            if (bVar.q) {
                                r0.f fVar2 = bVar.c;
                                j = fVar2.d;
                                fVar2.skip(j);
                            } else {
                                r0.f fVar3 = bVar.d;
                                if (fVar3.d != 0) {
                                    z4 = false;
                                }
                                fVar3.V(bVar.c);
                                if (z4) {
                                    m mVar = m.this;
                                    if (mVar != null) {
                                        mVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j = 0;
                            }
                        }
                        if (j > 0) {
                            bVar.a(j);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                e.j(q0.h0.c.b, true);
            }
        }

        public void f(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.d) {
                    if (i == 1) {
                        this.d.i2++;
                    } else if (i == 2) {
                        this.d.k2++;
                    } else if (i == 3) {
                        d dVar = this.d;
                        dVar.l2++;
                        dVar.notifyAll();
                    }
                }
                return;
            }
            q0.h0.f.c cVar = this.d.d2;
            String y0 = i0.d.a.a.a.y0(new StringBuilder(), this.d.Y1, " ping");
            cVar.c(new b(y0, true, y0, true, this, i, i2), 0);
        }

        public void g(int i, int i2, int i3, boolean z) {
        }

        public void i(int i, ErrorCode errorCode) {
            m0.n.b.i.e(errorCode, "errorCode");
            if (this.d.f(i)) {
                d dVar = this.d;
                Objects.requireNonNull(dVar);
                m0.n.b.i.e(errorCode, "errorCode");
                String str = dVar.Y1 + '[' + i + "] onReset";
                dVar.e2.c(new i(str, true, str, true, dVar, i, errorCode), 0);
                return;
            }
            m i2 = this.d.i(i);
            if (i2 != null) {
                i2.k(errorCode);
            }
        }

        public Object invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.c.e(this);
                while (this.c.b(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    this.d.b(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        this.d.b(errorCode3, errorCode3, e);
                        q0.h0.c.d(this.c);
                        return m0.i.a;
                    } catch (Throwable th) {
                        th = th;
                        this.d.b(errorCode, errorCode2, e);
                        q0.h0.c.d(this.c);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                this.d.b(errorCode32, errorCode32, e);
                q0.h0.c.d(this.c);
                return m0.i.a;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.d.b(errorCode, errorCode2, e);
                q0.h0.c.d(this.c);
                throw th;
            }
            q0.h0.c.d(this.c);
            return m0.i.a;
        }

        public void j(int i, int i2, List<a> list) {
            m0.n.b.i.e(list, "requestHeaders");
            d dVar = this.d;
            Objects.requireNonNull(dVar);
            m0.n.b.i.e(list, "requestHeaders");
            synchronized (dVar) {
                if (dVar.w2.contains(Integer.valueOf(i2))) {
                    dVar.v(i2, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                dVar.w2.add(Integer.valueOf(i2));
                String str = dVar.Y1 + '[' + i2 + "] onRequest";
                dVar.e2.c(new h(str, true, str, true, dVar, i2, list), 0);
            }
        }

        public void k(int i, ErrorCode errorCode, ByteString byteString) {
            int i2;
            m[] mVarArr;
            m0.n.b.i.e(errorCode, "errorCode");
            m0.n.b.i.e(byteString, "debugData");
            byteString.e();
            synchronized (this.d) {
                Object[] array = this.d.y.values().toArray(new m[0]);
                if (array != null) {
                    mVarArr = (m[]) array;
                    this.d.b2 = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (m mVar : mVarArr) {
                if (mVar.m > i && mVar.h()) {
                    mVar.k(ErrorCode.REFUSED_STREAM);
                    this.d.i(mVar.m);
                }
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class e extends q0.h0.f.a {
        public final /* synthetic */ d e;
        public final /* synthetic */ int f;
        public final /* synthetic */ ErrorCode g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z, String str2, boolean z2, d dVar, int i, ErrorCode errorCode) {
            super(str2, z2);
            this.e = dVar;
            this.f = i;
            this.g = errorCode;
        }

        public long a() {
            try {
                d dVar = this.e;
                int i = this.f;
                ErrorCode errorCode = this.g;
                Objects.requireNonNull(dVar);
                m0.n.b.i.e(errorCode, "statusCode");
                dVar.u2.l(i, errorCode);
                return -1;
            } catch (IOException e2) {
                d.a(this.e, e2);
                return -1;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class f extends q0.h0.f.a {
        public final /* synthetic */ d e;
        public final /* synthetic */ int f;
        public final /* synthetic */ long g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, d dVar, int i, long j) {
            super(str2, z2);
            this.e = dVar;
            this.f = i;
            this.g = j;
        }

        public long a() {
            try {
                this.e.u2.n(this.f, this.g);
                return -1;
            } catch (IOException e2) {
                d.a(this.e, e2);
                return -1;
            }
        }
    }

    static {
        r rVar = new r();
        rVar.c(7, 65535);
        rVar.c(5, 16384);
        c = rVar;
    }

    public d(b bVar) {
        m0.n.b.i.e(bVar, "builder");
        boolean z = bVar.h;
        this.q = z;
        this.x = bVar.e;
        String str = bVar.b;
        if (str != null) {
            this.Y1 = str;
            this.a2 = bVar.h ? 3 : 2;
            q0.h0.f.d dVar = bVar.i;
            this.c2 = dVar;
            q0.h0.f.c f3 = dVar.f();
            this.d2 = f3;
            this.e2 = dVar.f();
            this.f2 = dVar.f();
            this.g2 = bVar.f;
            r rVar = new r();
            if (bVar.h) {
                rVar.c(7, 16777216);
            }
            this.n2 = rVar;
            r rVar2 = c;
            this.o2 = rVar2;
            this.s2 = (long) rVar2.a();
            Socket socket = bVar.a;
            if (socket != null) {
                this.t2 = socket;
                r0.h hVar = bVar.d;
                if (hVar != null) {
                    this.u2 = new n(hVar, z);
                    i iVar = bVar.c;
                    if (iVar != null) {
                        this.v2 = new C0290d(this, new l(iVar, z));
                        this.w2 = new LinkedHashSet();
                        int i = bVar.g;
                        if (i != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                            String n02 = i0.d.a.a.a.n0(str, " ping");
                            f3.c(new a(n02, n02, this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    m0.n.b.i.m(Stripe3ds2AuthParams.FIELD_SOURCE);
                    throw null;
                }
                m0.n.b.i.m("sink");
                throw null;
            }
            m0.n.b.i.m("socket");
            throw null;
        }
        m0.n.b.i.m("connectionName");
        throw null;
    }

    public static final void a(d dVar, IOException iOException) {
        Objects.requireNonNull(dVar);
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        dVar.b(errorCode, errorCode, iOException);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|10|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            m0.n.b.i.e(r4, r0)
            java.lang.String r0 = "streamCode"
            m0.n.b.i.e(r5, r0)
            byte[] r0 = q0.h0.c.a
            r3.k(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, q0.h0.j.m> r0 = r3.y     // Catch:{ all -> 0x0062 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.Map<java.lang.Integer, q0.h0.j.m> r4 = r3.y     // Catch:{ all -> 0x0062 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0062 }
            q0.h0.j.m[] r0 = new q0.h0.j.m[r1]     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0032
            q0.h0.j.m[] r4 = (q0.h0.j.m[]) r4     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.Integer, q0.h0.j.m> r0 = r3.y     // Catch:{ all -> 0x0062 }
            r0.clear()     // Catch:{ all -> 0x0062 }
            goto L_0x003a
        L_0x0032:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0062 }
            throw r4     // Catch:{ all -> 0x0062 }
        L_0x003a:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0048
            int r0 = r4.length
        L_0x003e:
            if (r1 >= r0) goto L_0x0048
            r2 = r4[r1]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0048:
            q0.h0.j.n r4 = r3.u2     // Catch:{ IOException -> 0x004d }
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            java.net.Socket r4 = r3.t2     // Catch:{ IOException -> 0x0052 }
            r4.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            q0.h0.f.c r4 = r3.d2
            r4.f()
            q0.h0.f.c r4 = r3.e2
            r4.f()
            q0.h0.f.c r4 = r3.f2
            r4.f()
            return
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.d.b(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public void close() {
        b(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    public final synchronized m e(int i) {
        return this.y.get(Integer.valueOf(i));
    }

    public final boolean f(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized m i(int i) {
        m remove;
        remove = this.y.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void k(ErrorCode errorCode) throws IOException {
        m0.n.b.i.e(errorCode, "statusCode");
        synchronized (this.u2) {
            synchronized (this) {
                if (!this.b2) {
                    this.b2 = true;
                    int i = this.Z1;
                    this.u2.f(i, errorCode, q0.h0.c.a);
                }
            }
        }
    }

    public final synchronized void l(long j) {
        long j3 = this.p2 + j;
        this.p2 = j3;
        long j4 = j3 - this.q2;
        if (j4 >= ((long) (this.n2.a() / 2))) {
            w(0, j4);
            this.q2 += j4;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.u2.q);
        r6 = (long) r2;
        r8.r2 += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(int r9, boolean r10, r0.f r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            q0.h0.j.n r12 = r8.u2
            r12.b(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.r2     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.s2     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, q0.h0.j.m> r2 = r8.y     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0057 }
            int r2 = (int) r4     // Catch:{ all -> 0x0057 }
            q0.h0.j.n r4 = r8.u2     // Catch:{ all -> 0x0057 }
            int r4 = r4.q     // Catch:{ all -> 0x0057 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.r2     // Catch:{ all -> 0x0057 }
            long r6 = (long) r2     // Catch:{ all -> 0x0057 }
            long r4 = r4 + r6
            r8.r2 = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            long r12 = r12 - r6
            q0.h0.j.n r4 = r8.u2
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.b(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0057 }
            r9.interrupt()     // Catch:{ all -> 0x0057 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.d.n(int, boolean, r0.f, long):void");
    }

    public final void q(boolean z, int i, int i3) {
        try {
            this.u2.k(z, i, i3);
        } catch (IOException e3) {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            b(errorCode, errorCode, e3);
        }
    }

    public final void v(int i, ErrorCode errorCode) {
        m0.n.b.i.e(errorCode, "errorCode");
        String str = this.Y1 + '[' + i + "] writeSynReset";
        this.d2.c(new e(str, true, str, true, this, i, errorCode), 0);
    }

    public final void w(int i, long j) {
        String str = this.Y1 + '[' + i + "] windowUpdate";
        this.d2.c(new f(str, true, str, true, this, i, j), 0);
    }
}
