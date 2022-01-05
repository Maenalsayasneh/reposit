package n0.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements ThreadFactory {
    public final /* synthetic */ AtomicInteger c;

    public /* synthetic */ b(AtomicInteger atomicInteger) {
        this.c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, i.k("CommonPool-worker-", Integer.valueOf(this.c.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }
}
