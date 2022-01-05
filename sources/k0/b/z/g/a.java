package k0.b.z.g;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.q;

/* compiled from: ComputationScheduler */
public final class a extends q {
    public static final b b;
    public static final RxThreadFactory c;
    public static final int d;
    public static final c e;
    public final ThreadFactory f;
    public final AtomicReference<b> g;

    /* renamed from: k0.b.z.g.a$a  reason: collision with other inner class name */
    /* compiled from: ComputationScheduler */
    public static final class C0233a extends q.c {
        public final k0.b.z.a.b c;
        public final CompositeDisposable d;
        public final k0.b.z.a.b q;
        public final c x;
        public volatile boolean y;

        public C0233a(c cVar) {
            this.x = cVar;
            k0.b.z.a.b bVar = new k0.b.z.a.b();
            this.c = bVar;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.d = compositeDisposable;
            k0.b.z.a.b bVar2 = new k0.b.z.a.b();
            this.q = bVar2;
            bVar2.add(bVar);
            bVar2.add(compositeDisposable);
        }

        public k0.b.w.a b(Runnable runnable) {
            if (this.y) {
                return EmptyDisposable.INSTANCE;
            }
            return this.x.e(runnable, 0, TimeUnit.MILLISECONDS, this.c);
        }

        public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.y) {
                return EmptyDisposable.INSTANCE;
            }
            return this.x.e(runnable, j, timeUnit, this.d);
        }

        public void dispose() {
            if (!this.y) {
                this.y = true;
                this.q.dispose();
            }
        }

        public boolean isDisposed() {
            return this.y;
        }
    }

    /* compiled from: ComputationScheduler */
    public static final class b {
        public final int a;
        public final c[] b;
        public long c;

        public b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return a.e;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }
    }

    /* compiled from: ComputationScheduler */
    public static final class c extends e {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        e = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        b = bVar;
        for (c dispose : bVar.b) {
            dispose.dispose();
        }
    }

    public a(ThreadFactory threadFactory) {
        this.f = threadFactory;
        b bVar = b;
        AtomicReference<b> atomicReference = new AtomicReference<>(bVar);
        this.g = atomicReference;
        b bVar2 = new b(d, threadFactory);
        if (!atomicReference.compareAndSet(bVar, bVar2)) {
            for (c dispose : bVar2.b) {
                dispose.dispose();
            }
        }
    }

    public q.c a() {
        return new C0233a(this.g.get().a());
    }

    public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        c a = this.g.get().a();
        Objects.requireNonNull(a);
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        if (j <= 0) {
            try {
                future = a.c.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.onError(e2);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = a.c.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.a(future);
        return scheduledDirectTask;
    }

    public k0.b.w.a d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        c a = this.g.get().a();
        Objects.requireNonNull(a);
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            b bVar = new b(onSchedule, a.c);
            if (j <= 0) {
                try {
                    future = a.c.submit(bVar);
                } catch (RejectedExecutionException e2) {
                    RxJavaPlugins.onError(e2);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = a.c.schedule(bVar, j, timeUnit);
            }
            bVar.a(future);
            return bVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.a(a.c.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            RxJavaPlugins.onError(e3);
            return EmptyDisposable.INSTANCE;
        }
    }
}
