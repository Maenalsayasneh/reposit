package n0.a;

import java.util.concurrent.TimeUnit;
import m0.l.e;
import n0.a.t0;

/* compiled from: DefaultExecutor.kt */
public final class g0 extends t0 implements Runnable {
    private static volatile Thread _thread;
    public static final g0 a2;
    public static final long b2;
    private static volatile int debugStatus;

    static {
        Long l;
        g0 g0Var = new g0();
        a2 = g0Var;
        g0Var.Z(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        b2 = timeUnit.toNanos(l.longValue());
    }

    public o0 C(long j, Runnable runnable, e eVar) {
        long a = v0.a(j);
        if (a >= 4611686018427387903L) {
            return n1.c;
        }
        long nanoTime = System.nanoTime();
        t0.b bVar = new t0.b(a + nanoTime, runnable);
        p0(nanoTime, bVar);
        return bVar;
    }

    public Thread f0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final synchronized void r0() {
        if (u0()) {
            debugStatus = 3;
            n0();
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0084, code lost:
        _thread = null;
        r0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008d, code lost:
        if (m0() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
        f0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0092, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            n0.a.y1 r0 = n0.a.y1.a
            java.lang.ThreadLocal<n0.a.s0> r0 = n0.a.y1.b
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0083 }
            boolean r1 = r12.u0()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0012
            r1 = 0
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            goto L_0x0019
        L_0x0012:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0080 }
            r12.notifyAll()     // Catch:{ all -> 0x0080 }
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
        L_0x0019:
            if (r1 != 0) goto L_0x002a
            _thread = r0
            r12.r0()
            boolean r0 = r12.m0()
            if (r0 != 0) goto L_0x0029
            r12.f0()
        L_0x0029:
            return
        L_0x002a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x0030:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0083 }
            long r5 = r12.c0()     // Catch:{ all -> 0x0083 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0062
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0083 }
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0048
            long r3 = b2     // Catch:{ all -> 0x0083 }
            long r3 = r3 + r10
        L_0x0048:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005d
            _thread = r0
            r12.r0()
            boolean r0 = r12.m0()
            if (r0 != 0) goto L_0x005c
            r12.f0()
        L_0x005c:
            return
        L_0x005d:
            long r5 = m0.q.i.a(r5, r10)     // Catch:{ all -> 0x0083 }
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0030
            boolean r7 = r12.u0()     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x007c
            _thread = r0
            r12.r0()
            boolean r0 = r12.m0()
            if (r0 != 0) goto L_0x007b
            r12.f0()
        L_0x007b:
            return
        L_0x007c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0083 }
            goto L_0x0030
        L_0x0080:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            _thread = r0
            r12.r0()
            boolean r0 = r12.m0()
            if (r0 != 0) goto L_0x0092
            r12.f0()
        L_0x0092:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.g0.run():void");
    }

    public final boolean u0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }
}
