package q0.h0.g;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m0.n.b.i;
import q0.a0;
import q0.b0;
import q0.e0;
import q0.f;
import q0.g;
import q0.h0.l.h;
import q0.q;
import q0.t;

/* compiled from: RealCall.kt */
public final class e implements f {
    public d Y1;
    public g Z1;
    public boolean a2;
    public c b2;
    public final h c;
    public boolean c2;
    public final t d;
    public boolean d2;
    public boolean e2 = true;
    public volatile boolean f2;
    public volatile c g2;
    public volatile g h2;
    public final a0 i2;
    public final b0 j2;
    public final boolean k2;
    public final c q;
    public final AtomicBoolean x = new AtomicBoolean();
    public Object y;

    /* compiled from: RealCall.kt */
    public final class a implements Runnable {
        public volatile AtomicInteger c = new AtomicInteger(0);
        public final g d;
        public final /* synthetic */ e q;

        public a(e eVar, g gVar) {
            i.e(gVar, "responseCallback");
            this.q = eVar;
            this.d = gVar;
        }

        public final String a() {
            return this.q.j2.b.g;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[Catch:{ all -> 0x007a, all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[Catch:{ all -> 0x007a, all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[Catch:{ all -> 0x007a, all -> 0x00be }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
                q0.h0.g.e r1 = r7.q
                q0.b0 r1 = r1.j2
                q0.w r1 = r1.b
                java.lang.String r1 = r1.i()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                m0.n.b.i.d(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                q0.h0.g.e r0 = r7.q     // Catch:{ all -> 0x00be }
                q0.h0.g.e$c r0 = r0.q     // Catch:{ all -> 0x00be }
                r0.h()     // Catch:{ all -> 0x00be }
                r0 = 0
                q0.h0.g.e r3 = r7.q     // Catch:{ IOException -> 0x007c, all -> 0x004f }
                q0.e0 r0 = r3.g()     // Catch:{ IOException -> 0x007c, all -> 0x004f }
                r3 = 1
                q0.g r4 = r7.d     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                q0.h0.g.e r5 = r7.q     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                t0.n$a r4 = (t0.n.a) r4     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                r4.b(r5, r0)     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                q0.h0.g.e r0 = r7.q     // Catch:{ all -> 0x00be }
            L_0x0041:
                q0.a0 r0 = r0.i2     // Catch:{ all -> 0x00be }
                goto L_0x00ab
            L_0x0045:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x0050
            L_0x004a:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x007d
            L_0x004f:
                r3 = move-exception
            L_0x0050:
                q0.h0.g.e r4 = r7.q     // Catch:{ all -> 0x007a }
                r4.cancel()     // Catch:{ all -> 0x007a }
                if (r0 != 0) goto L_0x0079
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x007a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
                r4.<init>()     // Catch:{ all -> 0x007a }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007a }
                r4.append(r3)     // Catch:{ all -> 0x007a }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007a }
                r0.<init>(r4)     // Catch:{ all -> 0x007a }
                i0.j.f.p.h.m(r0, r3)     // Catch:{ all -> 0x007a }
                q0.g r4 = r7.d     // Catch:{ all -> 0x007a }
                q0.h0.g.e r5 = r7.q     // Catch:{ all -> 0x007a }
                t0.n$a r4 = (t0.n.a) r4     // Catch:{ all -> 0x007a }
                r4.a(r5, r0)     // Catch:{ all -> 0x007a }
            L_0x0079:
                throw r3     // Catch:{ all -> 0x007a }
            L_0x007a:
                r0 = move-exception
                goto L_0x00b4
            L_0x007c:
                r3 = move-exception
            L_0x007d:
                if (r0 == 0) goto L_0x009f
                q0.h0.l.h$a r0 = q0.h0.l.h.c     // Catch:{ all -> 0x007a }
                q0.h0.l.h r0 = q0.h0.l.h.a     // Catch:{ all -> 0x007a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
                r4.<init>()     // Catch:{ all -> 0x007a }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007a }
                q0.h0.g.e r5 = r7.q     // Catch:{ all -> 0x007a }
                java.lang.String r5 = q0.h0.g.e.b(r5)     // Catch:{ all -> 0x007a }
                r4.append(r5)     // Catch:{ all -> 0x007a }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007a }
                r5 = 4
                r0.i(r4, r5, r3)     // Catch:{ all -> 0x007a }
                goto L_0x00a8
            L_0x009f:
                q0.g r0 = r7.d     // Catch:{ all -> 0x007a }
                q0.h0.g.e r4 = r7.q     // Catch:{ all -> 0x007a }
                t0.n$a r0 = (t0.n.a) r0     // Catch:{ all -> 0x007a }
                r0.a(r4, r3)     // Catch:{ all -> 0x007a }
            L_0x00a8:
                q0.h0.g.e r0 = r7.q     // Catch:{ all -> 0x00be }
                goto L_0x0041
            L_0x00ab:
                q0.q r0 = r0.x     // Catch:{ all -> 0x00be }
                r0.c(r7)     // Catch:{ all -> 0x00be }
                r1.setName(r2)
                return
            L_0x00b4:
                q0.h0.g.e r3 = r7.q     // Catch:{ all -> 0x00be }
                q0.a0 r3 = r3.i2     // Catch:{ all -> 0x00be }
                q0.q r3 = r3.x     // Catch:{ all -> 0x00be }
                r3.c(r7)     // Catch:{ all -> 0x00be }
                throw r0     // Catch:{ all -> 0x00be }
            L_0x00be:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.e.a.run():void");
        }
    }

    /* compiled from: RealCall.kt */
    public static final class b extends WeakReference<e> {
        public final Object a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            i.e(eVar, "referent");
            this.a = obj;
        }
    }

    /* compiled from: RealCall.kt */
    public static final class c extends r0.b {
        public final /* synthetic */ e l;

        public c(e eVar) {
            this.l = eVar;
        }

        public void k() {
            this.l.cancel();
        }
    }

    public e(a0 a0Var, b0 b0Var, boolean z) {
        i.e(a0Var, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        i.e(b0Var, "originalRequest");
        this.i2 = a0Var;
        this.j2 = b0Var;
        this.k2 = z;
        this.c = a0Var.y.a;
        this.d = a0Var.a2.a(this);
        c cVar = new c(this);
        cVar.g((long) a0Var.t2, TimeUnit.MILLISECONDS);
        this.q = cVar;
    }

    public static final String b(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f2 ? "canceled " : "");
        sb.append(eVar.k2 ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(eVar.j2.b.i());
        return sb.toString();
    }

    public final void c(g gVar) {
        i.e(gVar, "connection");
        byte[] bArr = q0.h0.c.a;
        if (this.Z1 == null) {
            this.Z1 = gVar;
            gVar.o.add(new b(this, this.y));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void cancel() {
        Socket socket;
        if (!this.f2) {
            this.f2 = true;
            c cVar = this.g2;
            if (cVar != null) {
                cVar.f.cancel();
            }
            g gVar = this.h2;
            if (!(gVar == null || (socket = gVar.b) == null)) {
                q0.h0.c.e(socket);
            }
            Objects.requireNonNull(this.d);
            i.e(this, NotificationCompat.CATEGORY_CALL);
        }
    }

    public Object clone() {
        return new e(this.i2, this.j2, this.k2);
    }

    public final <E extends IOException> E d(E e) {
        E e3;
        Socket j;
        byte[] bArr = q0.h0.c.a;
        g gVar = this.Z1;
        if (gVar != null) {
            synchronized (gVar) {
                j = j();
            }
            if (this.Z1 == null) {
                if (j != null) {
                    q0.h0.c.e(j);
                }
                Objects.requireNonNull(this.d);
                i.e(this, NotificationCompat.CATEGORY_CALL);
                i.e(gVar, "connection");
            } else {
                if (!(j == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.a2 && this.q.i()) {
            e3 = new InterruptedIOException("timeout");
            if (e != null) {
                e3.initCause(e);
            }
        } else {
            e3 = e;
        }
        if (e != null) {
            t tVar = this.d;
            i.c(e3);
            Objects.requireNonNull(tVar);
            i.e(this, NotificationCompat.CATEGORY_CALL);
            i.e(e3, "ioe");
        } else {
            Objects.requireNonNull(this.d);
            i.e(this, NotificationCompat.CATEGORY_CALL);
        }
        return e3;
    }

    public final void e() {
        h.a aVar = h.c;
        this.y = h.a.g("response.body().close()");
        Objects.requireNonNull(this.d);
        i.e(this, NotificationCompat.CATEGORY_CALL);
    }

    public void enqueue(g gVar) {
        a aVar;
        i.e(gVar, "responseCallback");
        if (this.x.compareAndSet(false, true)) {
            e();
            q qVar = this.i2.x;
            a aVar2 = new a(this, gVar);
            Objects.requireNonNull(qVar);
            i.e(aVar2, NotificationCompat.CATEGORY_CALL);
            synchronized (qVar) {
                qVar.c.add(aVar2);
                if (!aVar2.q.k2) {
                    String a3 = aVar2.a();
                    Iterator<a> it = qVar.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = qVar.c.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (i.a(aVar.a(), a3)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (i.a(aVar.a(), a3)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        i.e(aVar, RecaptchaActionType.OTHER);
                        aVar2.c = aVar.c;
                    }
                }
            }
            qVar.d();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public e0 execute() {
        if (this.x.compareAndSet(false, true)) {
            this.q.h();
            e();
            try {
                q qVar = this.i2.x;
                synchronized (qVar) {
                    i.e(this, NotificationCompat.CATEGORY_CALL);
                    qVar.e.add(this);
                }
                e0 g = g();
                q qVar2 = this.i2.x;
                Objects.requireNonNull(qVar2);
                i.e(this, NotificationCompat.CATEGORY_CALL);
                qVar2.b(qVar2.e, this);
                return g;
            } catch (Throwable th) {
                q qVar3 = this.i2.x;
                Objects.requireNonNull(qVar3);
                i.e(this, NotificationCompat.CATEGORY_CALL);
                qVar3.b(qVar3.e, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void f(boolean z) {
        c cVar;
        synchronized (this) {
            if (!this.e2) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.g2) != null) {
            cVar.f.cancel();
            cVar.c.h(cVar, true, true, (IOException) null);
        }
        this.b2 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q0.e0 g() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            q0.a0 r0 = r11.i2
            java.util.List<q0.x> r0 = r0.Y1
            m0.j.g.b(r2, r0)
            q0.h0.h.i r0 = new q0.h0.h.i
            q0.a0 r1 = r11.i2
            r0.<init>(r1)
            r2.add(r0)
            q0.h0.h.a r0 = new q0.h0.h.a
            q0.a0 r1 = r11.i2
            q0.p r1 = r1.f2
            r0.<init>(r1)
            r2.add(r0)
            q0.h0.e.a r0 = new q0.h0.e.a
            q0.a0 r1 = r11.i2
            q0.d r1 = r1.g2
            r0.<init>(r1)
            r2.add(r0)
            q0.h0.g.a r0 = q0.h0.g.a.a
            r2.add(r0)
            boolean r0 = r11.k2
            if (r0 != 0) goto L_0x003e
            q0.a0 r0 = r11.i2
            java.util.List<q0.x> r0 = r0.Z1
            m0.j.g.b(r2, r0)
        L_0x003e:
            q0.h0.h.b r0 = new q0.h0.h.b
            boolean r1 = r11.k2
            r0.<init>(r1)
            r2.add(r0)
            q0.h0.h.g r9 = new q0.h0.h.g
            r3 = 0
            r4 = 0
            q0.b0 r5 = r11.j2
            q0.a0 r0 = r11.i2
            int r6 = r0.u2
            int r7 = r0.v2
            int r8 = r0.w2
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            q0.b0 r2 = r11.j2     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            q0.e0 r2 = r9.a(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            boolean r3 = r11.f2     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            if (r3 != 0) goto L_0x006b
            r11.i(r1)
            return r2
        L_0x006b:
            q0.h0.c.d(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            throw r2     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            goto L_0x008d
        L_0x0078:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.i(r0)     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0088
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x008d:
            if (r0 != 0) goto L_0x0092
            r11.i(r1)
        L_0x0092:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.e.g():q0.e0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E h(q0.h0.g.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            m0.n.b.i.e(r3, r0)
            q0.h0.g.c r0 = r2.g2
            boolean r3 = m0.n.b.i.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.c2     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0042
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.d2     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.c2 = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.d2 = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.c2     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.d2     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.d2     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.e2     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0045
        L_0x0042:
            monitor-exit(r2)
            throw r3
        L_0x0044:
            r4 = r3
        L_0x0045:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.g2 = r3
            q0.h0.g.g r3 = r2.Z1
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.d(r6)
            return r3
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.e.h(q0.h0.g.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.e2) {
                this.e2 = false;
                if (!this.c2 && !this.d2) {
                    z = true;
                }
            }
        }
        return z ? d(iOException) : iOException;
    }

    public boolean isCanceled() {
        return this.f2;
    }

    public final Socket j() {
        g gVar = this.Z1;
        i.c(gVar);
        byte[] bArr = q0.h0.c.a;
        List<Reference<e>> list = gVar.o;
        Iterator<Reference<e>> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (i.a((e) it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            list.remove(i);
            this.Z1 = null;
            if (list.isEmpty()) {
                gVar.p = System.nanoTime();
                h hVar = this.c;
                Objects.requireNonNull(hVar);
                i.e(gVar, "connection");
                byte[] bArr2 = q0.h0.c.a;
                if (gVar.i || hVar.e == 0) {
                    gVar.i = true;
                    hVar.d.remove(gVar);
                    if (hVar.d.isEmpty()) {
                        hVar.b.a();
                    }
                    z = true;
                } else {
                    q0.h0.f.c.d(hVar.b, hVar.c, 0, 2);
                }
                if (z) {
                    Socket socket = gVar.c;
                    i.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public b0 request() {
        return this.j2;
    }
}
