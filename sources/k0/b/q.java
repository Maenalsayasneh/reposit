package k0.b;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.z.g.e;

/* compiled from: Scheduler */
public abstract class q {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler */
    public static final class a implements k0.b.w.a, Runnable {
        public final Runnable c;
        public final c d;
        public Thread q;

        public a(Runnable runnable, c cVar) {
            this.c = runnable;
            this.d = cVar;
        }

        public void dispose() {
            if (this.q == Thread.currentThread()) {
                c cVar = this.d;
                if (cVar instanceof e) {
                    e eVar = (e) cVar;
                    if (!eVar.d) {
                        eVar.d = true;
                        eVar.c.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public void run() {
            this.q = Thread.currentThread();
            try {
                this.c.run();
            } finally {
                dispose();
                this.q = null;
            }
        }
    }

    /* compiled from: Scheduler */
    public static final class b implements k0.b.w.a, Runnable {
        public final Runnable c;
        public final c d;
        public volatile boolean q;

        public b(Runnable runnable, c cVar) {
            this.c = runnable;
            this.d = cVar;
        }

        public void dispose() {
            this.q = true;
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.q;
        }

        public void run() {
            if (!this.q) {
                try {
                    this.c.run();
                } catch (Throwable th) {
                    h.c4(th);
                    this.d.dispose();
                    throw ExceptionHelper.a(th);
                }
            }
        }
    }

    /* compiled from: Scheduler */
    public static abstract class c implements k0.b.w.a {

        /* compiled from: Scheduler */
        public final class a implements Runnable {
            public long Y1;
            public final Runnable c;
            public final SequentialDisposable d;
            public final long q;
            public long x;
            public long y;

            public a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.c = runnable;
                this.d = sequentialDisposable;
                this.q = j3;
                this.y = j2;
                this.Y1 = j;
            }

            public void run() {
                long j;
                this.c.run();
                if (!this.d.isDisposed()) {
                    c cVar = c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a = cVar.a(timeUnit);
                    long j2 = q.a;
                    long j3 = this.y;
                    if (a + j2 >= j3) {
                        long j4 = this.q;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.Y1;
                            long j6 = this.x + 1;
                            this.x = j6;
                            j = (j6 * j4) + j5;
                            this.y = a;
                            SequentialDisposable sequentialDisposable = this.d;
                            k0.b.w.a c2 = c.this.c(this, j - a, timeUnit);
                            Objects.requireNonNull(sequentialDisposable);
                            DisposableHelper.replace(sequentialDisposable, c2);
                        }
                    }
                    long j7 = this.q;
                    j = a + j7;
                    long j8 = this.x + 1;
                    this.x = j8;
                    this.Y1 = j - (j7 * j8);
                    this.y = a;
                    SequentialDisposable sequentialDisposable2 = this.d;
                    k0.b.w.a c22 = c.this.c(this, j - a, timeUnit);
                    Objects.requireNonNull(sequentialDisposable2);
                    DisposableHelper.replace(sequentialDisposable2, c22);
                }
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public k0.b.w.a b(Runnable runnable) {
            return c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public abstract k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit);

        public k0.b.w.a d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            SequentialDisposable sequentialDisposable3 = sequentialDisposable;
            a aVar = r0;
            a aVar2 = new a(timeUnit2.toNanos(j3) + a2, onSchedule, a2, sequentialDisposable2, nanos);
            k0.b.w.a c = c(aVar, j3, timeUnit2);
            if (c == EmptyDisposable.INSTANCE) {
                return c;
            }
            DisposableHelper.replace(sequentialDisposable3, c);
            return sequentialDisposable2;
        }
    }

    public abstract c a();

    public k0.b.w.a b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
        c a2 = a();
        a aVar = new a(RxJavaPlugins.onSchedule(runnable), a2);
        a2.c(aVar, j, timeUnit);
        return aVar;
    }

    public k0.b.w.a d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c a2 = a();
        b bVar = new b(RxJavaPlugins.onSchedule(runnable), a2);
        k0.b.w.a d = a2.d(bVar, j, j2, timeUnit);
        return d == EmptyDisposable.INSTANCE ? d : bVar;
    }
}
