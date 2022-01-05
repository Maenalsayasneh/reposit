package n0.a.i2;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import m0.l.e;
import n0.a.g0;
import n0.a.w0;

/* compiled from: Dispatcher.kt */
public class b extends w0 {
    public CoroutineScheduler Y1;
    public final int d;
    public final int q;
    public final long x;
    public final String y;

    public b(int i, int i2, String str, int i3) {
        int i4 = (i3 & 1) != 0 ? k.b : i;
        int i5 = (i3 & 2) != 0 ? k.c : i2;
        String str2 = (i3 & 4) != 0 ? "DefaultDispatcher" : null;
        long j = k.d;
        this.d = i4;
        this.q = i5;
        this.x = j;
        this.y = str2;
        this.Y1 = new CoroutineScheduler(i4, i5, j, str2);
    }

    public void I(e eVar, Runnable runnable) {
        try {
            CoroutineScheduler.i(this.Y1, runnable, (i) null, false, 6);
        } catch (RejectedExecutionException unused) {
            g0.a2.g0(runnable);
        }
    }

    public void O(e eVar, Runnable runnable) {
        try {
            CoroutineScheduler.i(this.Y1, runnable, (i) null, true, 2);
        } catch (RejectedExecutionException unused) {
            g0.a2.g0(runnable);
        }
    }
}
