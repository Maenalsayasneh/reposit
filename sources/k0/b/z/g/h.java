package k0.b.z.g;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.q;

/* compiled from: SingleScheduler */
public final class h extends q {
    public static final RxThreadFactory b = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    public static final ScheduledExecutorService c;
    public final AtomicReference<ScheduledExecutorService> d;

    /* compiled from: SingleScheduler */
    public static final class a extends q.c {
        public final ScheduledExecutorService c;
        public final CompositeDisposable d = new CompositeDisposable();
        public volatile boolean q;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.c = scheduledExecutorService;
        }

        public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.q) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), this.d);
            this.d.add(scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.c.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.c.schedule(scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.a(future);
            return scheduledRunnable;
        }

        public void dispose() {
            if (!this.q) {
                this.q = true;
                this.d.dispose();
            }
        }

        public boolean isDisposed() {
            return this.q;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public h() {
        RxThreadFactory rxThreadFactory = b;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.d = atomicReference;
        atomicReference.lazySet(g.a(rxThreadFactory));
    }

    public q.c a() {
        return new a(this.d.get());
    }

    public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        if (j <= 0) {
            try {
                future = this.d.get().submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.d.get().schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.a(future);
        return scheduledDirectTask;
    }

    public k0.b.w.a d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.d.get();
            b bVar = new b(onSchedule, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(bVar);
                } catch (RejectedExecutionException e) {
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(bVar, j, timeUnit);
            }
            bVar.a(future);
            return bVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.a(this.d.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public h(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.d = atomicReference;
        atomicReference.lazySet(g.a(threadFactory));
    }
}
