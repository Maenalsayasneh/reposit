package k0.b.z.g;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import k0.b.q;
import k0.b.w.a;

/* compiled from: NewThreadWorker */
public class e extends q.c implements a {
    public final ScheduledExecutorService c;
    public volatile boolean d;

    public e(ThreadFactory threadFactory) {
        this.c = g.a(threadFactory);
    }

    public a b(Runnable runnable) {
        return c(runnable, 0, (TimeUnit) null);
    }

    public a c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.d) {
            return EmptyDisposable.INSTANCE;
        }
        return e(runnable, j, timeUnit, (k0.b.z.a.a) null);
    }

    public void dispose() {
        if (!this.d) {
            this.d = true;
            this.c.shutdownNow();
        }
    }

    public ScheduledRunnable e(Runnable runnable, long j, TimeUnit timeUnit, k0.b.z.a.a aVar) {
        Future future;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), aVar);
        if (aVar != null && !aVar.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.c.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.remove(scheduledRunnable);
                }
                RxJavaPlugins.onError(e);
            }
        } else {
            future = this.c.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.a(future);
        return scheduledRunnable;
    }

    public boolean isDisposed() {
        return this.d;
    }
}
