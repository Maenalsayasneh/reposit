package q0.h0.j;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import m0.n.b.i;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import q0.v;
import r0.f;
import r0.w;
import r0.y;
import r0.z;

/* compiled from: Http2Stream.kt */
public final class m {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque<v> e;
    public boolean f;
    public final b g;
    public final a h;
    public final c i = new c();
    public final c j = new c();
    public ErrorCode k;
    public IOException l;
    public final int m;
    public final d n;

    /* compiled from: Http2Stream.kt */
    public final class a implements w {
        public final f c = new f();
        public boolean d;
        public boolean q;

        public a(boolean z) {
            this.q = z;
        }

        public void S(f fVar, long j) throws IOException {
            i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            byte[] bArr = q0.h0.c.a;
            this.c.S(fVar, j);
            while (this.c.d >= 16384) {
                a(false);
            }
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r12.x.j.l();
            r12.x.b();
            r1 = r12.x;
            r10 = java.lang.Math.min(r1.d - r1.c, r12.c.d);
            r1 = r12.x;
            r1.c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r13 == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            if (r10 != r12.c.d) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            if (r1.f() != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            r8 = r13;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r13) throws java.io.IOException {
            /*
                r12 = this;
                q0.h0.j.m r0 = q0.h0.j.m.this
                monitor-enter(r0)
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x008b }
                q0.h0.j.m$c r1 = r1.j     // Catch:{ all -> 0x008b }
                r1.h()     // Catch:{ all -> 0x008b }
            L_0x000a:
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x0082 }
                long r2 = r1.c     // Catch:{ all -> 0x0082 }
                long r4 = r1.d     // Catch:{ all -> 0x0082 }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0028
                boolean r2 = r12.q     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                boolean r2 = r12.d     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                okhttp3.internal.http2.ErrorCode r1 = r1.f()     // Catch:{ all -> 0x0082 }
                if (r1 != 0) goto L_0x0028
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x0082 }
                r1.l()     // Catch:{ all -> 0x0082 }
                goto L_0x000a
            L_0x0028:
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x008b }
                q0.h0.j.m$c r1 = r1.j     // Catch:{ all -> 0x008b }
                r1.l()     // Catch:{ all -> 0x008b }
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x008b }
                r1.b()     // Catch:{ all -> 0x008b }
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x008b }
                long r2 = r1.d     // Catch:{ all -> 0x008b }
                long r4 = r1.c     // Catch:{ all -> 0x008b }
                long r2 = r2 - r4
                r0.f r1 = r12.c     // Catch:{ all -> 0x008b }
                long r4 = r1.d     // Catch:{ all -> 0x008b }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x008b }
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x008b }
                long r2 = r1.c     // Catch:{ all -> 0x008b }
                long r2 = r2 + r10
                r1.c = r2     // Catch:{ all -> 0x008b }
                if (r13 == 0) goto L_0x005c
                r0.f r13 = r12.c     // Catch:{ all -> 0x008b }
                long r2 = r13.d     // Catch:{ all -> 0x008b }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x005c
                okhttp3.internal.http2.ErrorCode r13 = r1.f()     // Catch:{ all -> 0x008b }
                if (r13 != 0) goto L_0x005c
                r13 = 1
                goto L_0x005d
            L_0x005c:
                r13 = 0
            L_0x005d:
                r8 = r13
                monitor-exit(r0)
                q0.h0.j.m r13 = q0.h0.j.m.this
                q0.h0.j.m$c r13 = r13.j
                r13.h()
                q0.h0.j.m r13 = q0.h0.j.m.this     // Catch:{ all -> 0x0079 }
                q0.h0.j.d r6 = r13.n     // Catch:{ all -> 0x0079 }
                int r7 = r13.m     // Catch:{ all -> 0x0079 }
                r0.f r9 = r12.c     // Catch:{ all -> 0x0079 }
                r6.n(r7, r8, r9, r10)     // Catch:{ all -> 0x0079 }
                q0.h0.j.m r13 = q0.h0.j.m.this
                q0.h0.j.m$c r13 = r13.j
                r13.l()
                return
            L_0x0079:
                r13 = move-exception
                q0.h0.j.m r0 = q0.h0.j.m.this
                q0.h0.j.m$c r0 = r0.j
                r0.l()
                throw r13
            L_0x0082:
                r13 = move-exception
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x008b }
                q0.h0.j.m$c r1 = r1.j     // Catch:{ all -> 0x008b }
                r1.l()     // Catch:{ all -> 0x008b }
                throw r13     // Catch:{ all -> 0x008b }
            L_0x008b:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.m.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            r0 = r14.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            if (r0.h.q != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r14.c.d <= 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
            if (r2 == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            if (r14.c.d <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
            r0.n.n(r0.m, true, (r0.f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            r0 = r14.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r14.d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r14.x.n.u2.flush();
            r14.x.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r14 = this;
                q0.h0.j.m r0 = q0.h0.j.m.this
                byte[] r1 = q0.h0.c.a
                monitor-enter(r0)
                boolean r1 = r14.d     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                q0.h0.j.m r1 = q0.h0.j.m.this     // Catch:{ all -> 0x005f }
                okhttp3.internal.http2.ErrorCode r1 = r1.f()     // Catch:{ all -> 0x005f }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0017
                r1 = r3
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                monitor-exit(r0)
                q0.h0.j.m r0 = q0.h0.j.m.this
                q0.h0.j.m$a r4 = r0.h
                boolean r4 = r4.q
                if (r4 != 0) goto L_0x0047
                r0.f r4 = r14.c
                long r4 = r4.d
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                r0.f r0 = r14.c
                long r0 = r0.d
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.a(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                q0.h0.j.d r8 = r0.n
                int r9 = r0.m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.n(r9, r10, r11, r12)
            L_0x0047:
                q0.h0.j.m r0 = q0.h0.j.m.this
                monitor-enter(r0)
                r14.d = r3     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                q0.h0.j.m r0 = q0.h0.j.m.this
                q0.h0.j.d r0 = r0.n
                q0.h0.j.n r0 = r0.u2
                r0.flush()
                q0.h0.j.m r0 = q0.h0.j.m.this
                r0.a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.m.a.close():void");
        }

        public z d() {
            return m.this.j;
        }

        public void flush() throws IOException {
            m mVar = m.this;
            byte[] bArr = q0.h0.c.a;
            synchronized (mVar) {
                m.this.b();
            }
            while (this.c.d > 0) {
                a(false);
                m.this.n.u2.flush();
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class b implements y {
        public final f c = new f();
        public final f d = new f();
        public boolean q;
        public final long x;
        public boolean y;

        public b(long j, boolean z) {
            this.x = j;
            this.y = z;
        }

        public final void a(long j) {
            m mVar = m.this;
            byte[] bArr = q0.h0.c.a;
            mVar.n.l(j);
        }

        public void close() throws IOException {
            long j;
            synchronized (m.this) {
                this.q = true;
                f fVar = this.d;
                j = fVar.d;
                fVar.skip(j);
                m mVar = m.this;
                if (mVar != null) {
                    mVar.notifyAll();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                a(j);
            }
            m.this.a();
        }

        public z d() {
            return m.this.i;
        }

        public long q0(f fVar, long j) throws IOException {
            long j2;
            boolean z;
            long j3;
            f fVar2 = fVar;
            long j4 = j;
            i.e(fVar2, "sink");
            long j5 = 0;
            if (j4 >= 0) {
                while (true) {
                    Throwable th = null;
                    synchronized (m.this) {
                        m.this.i.h();
                        try {
                            if (m.this.f() != null) {
                                th = m.this.l;
                                if (th == null) {
                                    ErrorCode f = m.this.f();
                                    i.c(f);
                                    th = new StreamResetException(f);
                                }
                            }
                            if (!this.q) {
                                f fVar3 = this.d;
                                long j6 = fVar3.d;
                                if (j6 > j5) {
                                    j3 = fVar3.q0(fVar2, Math.min(j4, j6));
                                    m mVar = m.this;
                                    long j7 = mVar.a + j3;
                                    mVar.a = j7;
                                    long j8 = j7 - mVar.b;
                                    if (th == null && j8 >= ((long) (mVar.n.n2.a() / 2))) {
                                        m mVar2 = m.this;
                                        mVar2.n.w(mVar2.m, j8);
                                        m mVar3 = m.this;
                                        mVar3.b = mVar3.a;
                                    }
                                } else if (this.y || th != null) {
                                    j3 = -1;
                                } else {
                                    m.this.l();
                                    z = true;
                                    j2 = -1;
                                }
                                long j9 = j3;
                                z = false;
                                j2 = j9;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            m.this.i.l();
                        }
                    }
                    if (z) {
                        j5 = 0;
                    } else if (j2 != -1) {
                        a(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        i.c(th);
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j4).toString());
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class c extends r0.b {
        public c() {
        }

        public IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void k() {
            m.this.e(ErrorCode.CANCEL);
            d dVar = m.this.n;
            synchronized (dVar) {
                long j = dVar.k2;
                long j2 = dVar.j2;
                if (j >= j2) {
                    dVar.j2 = j2 + 1;
                    dVar.m2 = System.nanoTime() + ((long) 1000000000);
                    q0.h0.f.c cVar = dVar.d2;
                    String y0 = i0.d.a.a.a.y0(new StringBuilder(), dVar.Y1, " ping");
                    cVar.c(new j(y0, true, y0, true, dVar), 0);
                }
            }
        }

        public final void l() throws IOException {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public m(int i2, d dVar, boolean z, boolean z2, v vVar) {
        i.e(dVar, "connection");
        this.m = i2;
        this.n = dVar;
        this.d = (long) dVar.o2.a();
        ArrayDeque<v> arrayDeque = new ArrayDeque<>();
        this.e = arrayDeque;
        this.g = new b((long) dVar.n2.a(), z2);
        this.h = new a(z);
        if (vVar != null) {
            if (!h()) {
                arrayDeque.add(vVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() throws IOException {
        boolean z;
        boolean i2;
        byte[] bArr = q0.h0.c.a;
        synchronized (this) {
            b bVar = this.g;
            if (!bVar.y && bVar.q) {
                a aVar = this.h;
                if (aVar.q || aVar.d) {
                    z = true;
                    i2 = i();
                }
            }
            z = false;
            i2 = i();
        }
        if (z) {
            c(ErrorCode.CANCEL, (IOException) null);
        } else if (!i2) {
            this.n.i(this.m);
        }
    }

    public final void b() throws IOException {
        a aVar = this.h;
        if (aVar.d) {
            throw new IOException("stream closed");
        } else if (aVar.q) {
            throw new IOException("stream finished");
        } else if (this.k != null) {
            Throwable th = this.l;
            if (th == null) {
                ErrorCode errorCode = this.k;
                i.c(errorCode);
                th = new StreamResetException(errorCode);
            }
            throw th;
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) throws IOException {
        i.e(errorCode, "rstStatusCode");
        if (d(errorCode, iOException)) {
            d dVar = this.n;
            int i2 = this.m;
            Objects.requireNonNull(dVar);
            i.e(errorCode, "statusCode");
            dVar.u2.l(i2, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = q0.h0.c.a;
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.y && this.h.q) {
                return false;
            }
            this.k = errorCode;
            this.l = iOException;
            notifyAll();
            this.n.i(this.m);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        i.e(errorCode, "errorCode");
        if (d(errorCode, (IOException) null)) {
            this.n.v(this.m, errorCode);
        }
    }

    public final synchronized ErrorCode f() {
        return this.k;
    }

    public final w g() {
        synchronized (this) {
            if (!(this.f || h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.h;
    }

    public final boolean h() {
        if (this.n.q == ((this.m & 1) == 1)) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.k != null) {
            return false;
        }
        b bVar = this.g;
        if (bVar.y || bVar.q) {
            a aVar = this.h;
            if ((aVar.q || aVar.d) && this.f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(q0.v r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            m0.n.b.i.e(r3, r0)
            byte[] r0 = q0.h0.c.a
            monitor-enter(r2)
            boolean r0 = r2.f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            q0.h0.j.m$b r3 = r2.g     // Catch:{ all -> 0x0035 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<q0.v> r0 = r2.e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            q0.h0.j.m$b r3 = r2.g     // Catch:{ all -> 0x0035 }
            r3.y = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            q0.h0.j.d r3 = r2.n
            int r4 = r2.m
            r3.i(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.m.j(q0.v, boolean):void");
    }

    public final synchronized void k(ErrorCode errorCode) {
        i.e(errorCode, "errorCode");
        if (this.k == null) {
            this.k = errorCode;
            notifyAll();
        }
    }

    public final void l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
