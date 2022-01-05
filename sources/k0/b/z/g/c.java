package k0.b.z.g;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.q;

/* compiled from: IoScheduler */
public final class c extends q {
    public static final RxThreadFactory b;
    public static final RxThreadFactory c;
    public static final long d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final TimeUnit e = TimeUnit.SECONDS;
    public static final C0234c f;
    public static final a g;
    public final ThreadFactory h;
    public final AtomicReference<a> i;

    /* compiled from: IoScheduler */
    public static final class a implements Runnable {
        public final ThreadFactory Y1;
        public final long c;
        public final ConcurrentLinkedQueue<C0234c> d;
        public final CompositeDisposable q;
        public final ScheduledExecutorService x;
        public final Future<?> y;

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.c = nanos;
            this.d = new ConcurrentLinkedQueue<>();
            this.q = new CompositeDisposable();
            this.Y1 = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, c.c);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.x = scheduledExecutorService;
            this.y = scheduledFuture;
        }

        public void run() {
            if (!this.d.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<C0234c> it = this.d.iterator();
                while (it.hasNext()) {
                    C0234c next = it.next();
                    if (next.q > nanoTime) {
                        return;
                    }
                    if (this.d.remove(next)) {
                        this.q.remove(next);
                    }
                }
            }
        }
    }

    /* compiled from: IoScheduler */
    public static final class b extends q.c {
        public final CompositeDisposable c;
        public final a d;
        public final C0234c q;
        public final AtomicBoolean x = new AtomicBoolean();

        public b(a aVar) {
            C0234c cVar;
            C0234c cVar2;
            this.d = aVar;
            this.c = new CompositeDisposable();
            if (aVar.q.isDisposed()) {
                cVar = c.f;
            } else {
                while (true) {
                    if (aVar.d.isEmpty()) {
                        cVar2 = new C0234c(aVar.Y1);
                        aVar.q.add(cVar2);
                        break;
                    }
                    cVar2 = aVar.d.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.q = cVar;
        }

        public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.c.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.q.e(runnable, j, timeUnit, this.c);
        }

        public void dispose() {
            if (this.x.compareAndSet(false, true)) {
                this.c.dispose();
                a aVar = this.d;
                C0234c cVar = this.q;
                Objects.requireNonNull(aVar);
                cVar.q = System.nanoTime() + aVar.c;
                aVar.d.offer(cVar);
            }
        }

        public boolean isDisposed() {
            return this.x.get();
        }
    }

    /* renamed from: k0.b.z.g.c$c  reason: collision with other inner class name */
    /* compiled from: IoScheduler */
    public static final class C0234c extends e {
        public long q = 0;

        public C0234c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C0234c cVar = new C0234c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        b = rxThreadFactory;
        c = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0, (TimeUnit) null, rxThreadFactory);
        g = aVar;
        aVar.q.dispose();
        Future<?> future = aVar.y;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.x;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public c(ThreadFactory threadFactory) {
        this.h = threadFactory;
        a aVar = g;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.i = atomicReference;
        a aVar2 = new a(d, e, threadFactory);
        if (!atomicReference.compareAndSet(aVar, aVar2)) {
            aVar2.q.dispose();
            Future<?> future = aVar2.y;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = aVar2.x;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public q.c a() {
        return new b(this.i.get());
    }
}
