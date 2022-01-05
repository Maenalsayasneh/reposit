package n0.a.i2;

import java.util.concurrent.TimeUnit;
import m0.q.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.h2.u;

/* compiled from: Tasks.kt */
public final class k {
    public static final long a = a.R3("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    public static final int b;
    public static final int c;
    public static final long d = TimeUnit.SECONDS.toNanos(a.R3("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));
    public static g e = e.a;

    static {
        a.Q3("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i = u.a;
        int Q3 = a.Q3("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, (Object) null);
        b = Q3;
        c = a.Q3("kotlinx.coroutines.scheduler.max.pool.size", i.b(i * 128, Q3, 2097150), 0, 2097150, 4, (Object) null);
    }
}
