package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.w.a;

public abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements a {
    public static final FutureTask<Void> c;
    public static final FutureTask<Void> d;
    public final Runnable q;
    public Thread x;

    static {
        Runnable runnable = k0.b.z.b.a.b;
        c = new FutureTask<>(runnable, (Object) null);
        d = new FutureTask<>(runnable, (Object) null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.q = runnable;
    }

    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != c) {
                if (future2 == d) {
                    future.cancel(this.x != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != c && future != (futureTask = d) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.x != Thread.currentThread());
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == c || future == d;
    }
}
