package k0.b.z.g;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.w.a;

/* compiled from: InstantPeriodicTask */
public final class b implements Callable<Void>, a {
    public static final FutureTask<Void> c = new FutureTask<>(k0.b.z.b.a.b, (Object) null);
    public Thread Y1;
    public final Runnable d;
    public final AtomicReference<Future<?>> q = new AtomicReference<>();
    public final AtomicReference<Future<?>> x = new AtomicReference<>();
    public final ExecutorService y;

    public b(Runnable runnable, ExecutorService executorService) {
        this.d = runnable;
        this.y = executorService;
    }

    public void a(Future<?> future) {
        Future future2;
        do {
            future2 = this.x.get();
            if (future2 == c) {
                future.cancel(this.Y1 != Thread.currentThread());
                return;
            }
        } while (!this.x.compareAndSet(future2, future));
    }

    public Object call() throws Exception {
        this.Y1 = Thread.currentThread();
        try {
            this.d.run();
            Future submit = this.y.submit(this);
            while (true) {
                Future future = this.q.get();
                if (future != c) {
                    if (this.q.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.Y1 != Thread.currentThread());
                }
            }
            this.Y1 = null;
        } catch (Throwable th) {
            this.Y1 = null;
            RxJavaPlugins.onError(th);
        }
        return null;
    }

    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.x;
        Future future = c;
        Future andSet = atomicReference.getAndSet(future);
        boolean z = true;
        if (!(andSet == null || andSet == future)) {
            andSet.cancel(this.Y1 != Thread.currentThread());
        }
        Future andSet2 = this.q.getAndSet(future);
        if (andSet2 != null && andSet2 != future) {
            if (this.Y1 == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.x.get() == c;
    }
}
