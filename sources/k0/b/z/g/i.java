package k0.b.z.g;

import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k0.b.q;

/* compiled from: TrampolineScheduler */
public final class i extends q {
    public static final i b = new i();

    /* compiled from: TrampolineScheduler */
    public static final class a implements Runnable {
        public final Runnable c;
        public final c d;
        public final long q;

        public a(Runnable runnable, c cVar, long j) {
            this.c = runnable;
            this.d = cVar;
            this.q = j;
        }

        public void run() {
            if (!this.d.x) {
                long a = this.d.a(TimeUnit.MILLISECONDS);
                long j = this.q;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        RxJavaPlugins.onError(e);
                        return;
                    }
                }
                if (!this.d.x) {
                    this.c.run();
                }
            }
        }
    }

    /* compiled from: TrampolineScheduler */
    public static final class b implements Comparable<b> {
        public final Runnable c;
        public final long d;
        public final int q;
        public volatile boolean x;

        public b(Runnable runnable, Long l, int i) {
            this.c = runnable;
            this.d = l.longValue();
            this.q = i;
        }

        public int compareTo(Object obj) {
            b bVar = (b) obj;
            int i = (this.d > bVar.d ? 1 : (this.d == bVar.d ? 0 : -1));
            int i2 = 1;
            int i3 = i < 0 ? -1 : i > 0 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            int i4 = this.q;
            int i5 = bVar.q;
            if (i4 < i5) {
                i2 = -1;
            } else if (i4 <= i5) {
                i2 = 0;
            }
            return i2;
        }
    }

    /* compiled from: TrampolineScheduler */
    public static final class c extends q.c implements k0.b.w.a {
        public final PriorityBlockingQueue<b> c = new PriorityBlockingQueue<>();
        public final AtomicInteger d = new AtomicInteger();
        public final AtomicInteger q = new AtomicInteger();
        public volatile boolean x;

        /* compiled from: TrampolineScheduler */
        public final class a implements Runnable {
            public final b c;

            public a(b bVar) {
                this.c = bVar;
            }

            public void run() {
                this.c.x = true;
                c.this.c.remove(this.c);
            }
        }

        public k0.b.w.a b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + a(TimeUnit.MILLISECONDS);
            return e(new a(runnable, this, millis), millis);
        }

        public void dispose() {
            this.x = true;
        }

        public k0.b.w.a e(Runnable runnable, long j) {
            if (this.x) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.q.incrementAndGet());
            this.c.add(bVar);
            if (this.d.getAndIncrement() != 0) {
                return new RunnableDisposable(new a(bVar));
            }
            int i = 1;
            while (!this.x) {
                b poll = this.c.poll();
                if (poll == null) {
                    i = this.d.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.x) {
                    poll.c.run();
                }
            }
            this.c.clear();
            return EmptyDisposable.INSTANCE;
        }

        public boolean isDisposed() {
            return this.x;
        }
    }

    public q.c a() {
        return new c();
    }

    public k0.b.w.a b(Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            RxJavaPlugins.onSchedule(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
