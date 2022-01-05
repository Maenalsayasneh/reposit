package n0.a.i2;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m0.l.e;
import n0.a.g0;
import n0.a.w0;

/* compiled from: Dispatcher.kt */
public final class d extends w0 implements i, Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(d.class, "inFlightTasks");
    public final int Y1;
    public final ConcurrentLinkedQueue<Runnable> Z1 = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;
    public final b q;
    public final int x;
    public final String y;

    public d(b bVar, int i, String str, int i2) {
        this.q = bVar;
        this.x = i;
        this.y = str;
        this.Y1 = i2;
    }

    public void I(e eVar, Runnable runnable) {
        T(runnable, false);
    }

    public void O(e eVar, Runnable runnable) {
        T(runnable, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v6 java.lang.Runnable) binds: [B:0:0x0000, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = d
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.x
            if (r1 > r2) goto L_0x0021
            n0.a.i2.b r0 = r3.q
            java.util.Objects.requireNonNull(r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.Y1     // Catch:{ RejectedExecutionException -> 0x0015 }
            r1.f(r4, r3, r5)     // Catch:{ RejectedExecutionException -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            n0.a.g0 r5 = n0.a.g0.a2
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r0.Y1
            n0.a.i2.h r4 = r0.b(r4, r3)
            r5.g0(r4)
        L_0x0020:
            return
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.Z1
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.x
            if (r4 < r0) goto L_0x002f
            return
        L_0x002f:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.Z1
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.i2.d.T(java.lang.Runnable, boolean):void");
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        T(runnable, false);
    }

    public void n() {
        Runnable poll = this.Z1.poll();
        if (poll != null) {
            b bVar = this.q;
            Objects.requireNonNull(bVar);
            try {
                bVar.Y1.f(poll, this, true);
            } catch (RejectedExecutionException unused) {
                g0.a2.g0(bVar.Y1.b(poll, this));
            }
        } else {
            d.decrementAndGet(this);
            Runnable poll2 = this.Z1.poll();
            if (poll2 != null) {
                T(poll2, true);
            }
        }
    }

    public String toString() {
        String str = this.y;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.q + ']';
    }

    public int z() {
        return this.Y1;
    }
}
