package n0.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m0.i;
import m0.l.e;
import n0.a.h2.n;
import n0.a.h2.t;
import n0.a.h2.v;
import n0.a.h2.w;

/* compiled from: EventLoop.common.kt */
public abstract class t0 extends u0 implements j0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y1;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z1;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* compiled from: EventLoop.common.kt */
    public final class a extends c {
        public final m<i> x;

        public a(long j, m<? super i> mVar) {
            super(j);
            this.x = mVar;
        }

        public void run() {
            this.x.A(t0.this, i.a);
        }

        public String toString() {
            return m0.n.b.i.k(super.toString(), this.x);
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class b extends c {
        public final Runnable x;

        public b(long j, Runnable runnable) {
            super(j);
            this.x = runnable;
        }

        public void run() {
            this.x.run();
        }

        public String toString() {
            return m0.n.b.i.k(super.toString(), this.x);
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, o0, w {
        public long c;
        public Object d;
        public int q = -1;

        public c(long j) {
            this.c = j;
        }

        public void a(v<?> vVar) {
            if (this.d != v0.a) {
                this.d = vVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public v<?> b() {
            Object obj = this.d;
            if (obj instanceof v) {
                return (v) obj;
            }
            return null;
        }

        public int compareTo(Object obj) {
            int i = ((this.c - ((c) obj).c) > 0 ? 1 : ((this.c - ((c) obj).c) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        public final synchronized void dispose() {
            Object obj = this.d;
            t tVar = v0.a;
            if (obj != tVar) {
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    synchronized (dVar) {
                        if (b() != null) {
                            dVar.d(g());
                        }
                    }
                }
                this.d = tVar;
            }
        }

        public void e(int i) {
            this.q = i;
        }

        public int g() {
            return this.q;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Delayed[nanos=");
            P0.append(this.c);
            P0.append(']');
            return P0.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class d extends v<c> {
        public long b;

        public d(long j) {
            this.b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<t0> cls2 = t0.class;
        Y1 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        Z1 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    public o0 C(long j, Runnable runnable, e eVar) {
        return h0.a.C(j, runnable, eVar);
    }

    public final void I(e eVar, Runnable runnable) {
        g0(runnable);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [n0.a.h2.w] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0050 A[EDGE_INSN: B:85:0x0050->B:33:0x0050 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c0() {
        /*
            r11 = this;
            boolean r0 = r11.d0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            n0.a.t0$d r0 = (n0.a.t0.d) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x004c
            boolean r6 = r0.c()
            if (r6 != 0) goto L_0x004c
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            n0.a.h2.w r8 = r0.b()     // Catch:{ all -> 0x0049 }
            if (r8 != 0) goto L_0x0026
            monitor-exit(r0)
            r8 = r5
            goto L_0x0044
        L_0x0026:
            n0.a.t0$c r8 = (n0.a.t0.c) r8     // Catch:{ all -> 0x0049 }
            long r9 = r8.c     // Catch:{ all -> 0x0049 }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0032
            r9 = r3
            goto L_0x0033
        L_0x0032:
            r9 = r4
        L_0x0033:
            if (r9 == 0) goto L_0x003a
            boolean r8 = r11.i0(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x003b
        L_0x003a:
            r8 = r4
        L_0x003b:
            if (r8 == 0) goto L_0x0042
            n0.a.h2.w r8 = r0.d(r4)     // Catch:{ all -> 0x0049 }
            goto L_0x0043
        L_0x0042:
            r8 = r5
        L_0x0043:
            monitor-exit(r0)
        L_0x0044:
            n0.a.t0$c r8 = (n0.a.t0.c) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004c:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0052
        L_0x0050:
            r7 = r5
            goto L_0x007e
        L_0x0052:
            boolean r6 = r0 instanceof n0.a.h2.n
            if (r6 == 0) goto L_0x006e
            r6 = r0
            n0.a.h2.n r6 = (n0.a.h2.n) r6
            java.lang.Object r7 = r6.f()
            n0.a.h2.t r8 = n0.a.h2.n.d
            if (r7 == r8) goto L_0x0064
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x007e
        L_0x0064:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = Y1
            n0.a.h2.n r6 = r6.e()
            r7.compareAndSet(r11, r0, r6)
            goto L_0x004c
        L_0x006e:
            n0.a.h2.t r6 = n0.a.v0.b
            if (r0 != r6) goto L_0x0073
            goto L_0x0050
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = Y1
            boolean r6 = r6.compareAndSet(r11, r0, r5)
            if (r6 == 0) goto L_0x004c
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x007e:
            if (r7 == 0) goto L_0x0084
            r7.run()
            return r1
        L_0x0084:
            n0.a.h2.a<n0.a.l0<?>> r0 = r11.y
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            int r8 = r0.b
            int r0 = r0.c
            if (r8 != r0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r3 = r4
        L_0x0096:
            if (r3 == 0) goto L_0x009a
        L_0x0098:
            r3 = r6
            goto L_0x009b
        L_0x009a:
            r3 = r1
        L_0x009b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            goto L_0x00db
        L_0x00a0:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            boolean r3 = r0 instanceof n0.a.h2.n
            if (r3 == 0) goto L_0x00d6
            n0.a.h2.n r0 = (n0.a.h2.n) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00b2
            goto L_0x00db
        L_0x00b2:
            java.lang.Object r0 = r11._delayed
            n0.a.t0$d r0 = (n0.a.t0.d) r0
            if (r0 != 0) goto L_0x00b9
            goto L_0x00c2
        L_0x00b9:
            monitor-enter(r0)
            n0.a.h2.w r3 = r0.b()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            r5 = r3
            n0.a.t0$c r5 = (n0.a.t0.c) r5
        L_0x00c2:
            if (r5 != 0) goto L_0x00c5
            goto L_0x00da
        L_0x00c5:
            long r3 = r5.c
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            goto L_0x00db
        L_0x00d1:
            r1 = r3
            goto L_0x00db
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d6:
            n0.a.h2.t r3 = n0.a.v0.b
            if (r0 != r3) goto L_0x00db
        L_0x00da:
            r1 = r6
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.t0.c0():long");
    }

    public void e(long j, m<? super i> mVar) {
        long a2 = v0.a(j);
        if (a2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(a2 + nanoTime, mVar);
            mVar.p(new p0(aVar));
            p0(nanoTime, aVar);
        }
    }

    public final void g0(Runnable runnable) {
        if (i0(runnable)) {
            Thread f0 = f0();
            if (Thread.currentThread() != f0) {
                LockSupport.unpark(f0);
                return;
            }
            return;
        }
        g0.a2.g0(runnable);
    }

    public final boolean i0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (Y1.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof n) {
                n nVar = (n) obj;
                int a2 = nVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    Y1.compareAndSet(this, obj, nVar.e());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == v0.b) {
                return false;
            } else {
                n nVar2 = new n(8, true);
                nVar2.a((Runnable) obj);
                nVar2.a(runnable);
                if (Y1.compareAndSet(this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean m0() {
        n0.a.h2.a<l0<?>> aVar = this.y;
        if (!(aVar == null || aVar.b == aVar.c)) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof n) {
            return ((n) obj).d();
        }
        if (obj == v0.b) {
            return true;
        }
        return false;
    }

    public final void n0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [n0.a.h2.w] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(long r13, n0.a.t0.c r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0009
            goto L_0x0037
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            n0.a.t0$d r0 = (n0.a.t0.d) r0
            if (r0 != 0) goto L_0x0020
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Z1
            n0.a.t0$d r5 = new n0.a.t0$d
            r5.<init>(r13)
            r0.compareAndSet(r12, r3, r5)
            java.lang.Object r0 = r12._delayed
            m0.n.b.i.c(r0)
            n0.a.t0$d r0 = (n0.a.t0.d) r0
        L_0x0020:
            monitor-enter(r15)
            java.lang.Object r5 = r15.d     // Catch:{ all -> 0x00a6 }
            n0.a.h2.t r6 = n0.a.v0.a     // Catch:{ all -> 0x00a6 }
            if (r5 != r6) goto L_0x002a
            monitor-exit(r15)
            r0 = r2
            goto L_0x0064
        L_0x002a:
            monitor-enter(r0)     // Catch:{ all -> 0x00a6 }
            n0.a.h2.w r5 = r0.b()     // Catch:{ all -> 0x00a3 }
            n0.a.t0$c r5 = (n0.a.t0.c) r5     // Catch:{ all -> 0x00a3 }
            int r6 = r12._isCompleted     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0039
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r15)
        L_0x0037:
            r0 = r4
            goto L_0x0064
        L_0x0039:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            r0.b = r13     // Catch:{ all -> 0x00a3 }
            goto L_0x0053
        L_0x0040:
            long r8 = r5.c     // Catch:{ all -> 0x00a3 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0049
            r8 = r13
        L_0x0049:
            long r10 = r0.b     // Catch:{ all -> 0x00a3 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0053
            r0.b = r8     // Catch:{ all -> 0x00a3 }
        L_0x0053:
            long r8 = r15.c     // Catch:{ all -> 0x00a3 }
            long r10 = r0.b     // Catch:{ all -> 0x00a3 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x005e
            r15.c = r10     // Catch:{ all -> 0x00a3 }
        L_0x005e:
            r0.a(r15)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r15)
            r0 = r1
        L_0x0064:
            if (r0 == 0) goto L_0x007d
            if (r0 == r4) goto L_0x0077
            if (r0 != r2) goto L_0x006b
            goto L_0x009f
        L_0x006b:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0077:
            n0.a.g0 r0 = n0.a.g0.a2
            r0.p0(r13, r15)
            goto L_0x009f
        L_0x007d:
            java.lang.Object r13 = r12._delayed
            n0.a.t0$d r13 = (n0.a.t0.d) r13
            if (r13 != 0) goto L_0x0084
            goto L_0x008d
        L_0x0084:
            monitor-enter(r13)
            n0.a.h2.w r14 = r13.b()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r13)
            r3 = r14
            n0.a.t0$c r3 = (n0.a.t0.c) r3
        L_0x008d:
            if (r3 != r15) goto L_0x0090
            r1 = r4
        L_0x0090:
            if (r1 == 0) goto L_0x009f
            java.lang.Thread r13 = r12.f0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x009f
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x009f:
            return
        L_0x00a0:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00a3:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            throw r13     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.t0.p0(long, n0.a.t0$c):void");
    }

    public void shutdown() {
        y1 y1Var = y1.a;
        y1.b.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (Y1.compareAndSet(this, (Object) null, v0.b)) {
                    break;
                }
            } else if (obj instanceof n) {
                ((n) obj).b();
                break;
            } else if (obj == v0.b) {
                break;
            } else {
                n nVar = new n(8, true);
                nVar.a((Runnable) obj);
                if (Y1.compareAndSet(this, obj, nVar)) {
                    break;
                }
            }
        }
        do {
        } while (c0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            c cVar = dVar == null ? null : (c) dVar.e();
            if (cVar != null) {
                g0.a2.p0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }
}
