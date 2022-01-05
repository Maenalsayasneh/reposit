package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.b0.c;
import k0.b.o;
import k0.b.p;
import k0.b.q;

public final class ObservableDebounceTimed<T> extends k0.b.z.e.c.a<T, T> {
    public final long d;
    public final TimeUnit q;
    public final q x;

    public static final class DebounceEmitter<T> extends AtomicReference<k0.b.w.a> implements Runnable, k0.b.w.a {
        public final T c;
        public final long d;
        public final a<T> q;
        public final AtomicBoolean x = new AtomicBoolean();

        public DebounceEmitter(T t, long j, a<T> aVar) {
            this.c = t;
            this.d = j;
            this.q = aVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (this.x.compareAndSet(false, true)) {
                a<T> aVar = this.q;
                long j = this.d;
                T t = this.c;
                if (j == aVar.Z1) {
                    aVar.c.b(t);
                    DisposableHelper.dispose(this);
                }
            }
        }
    }

    public static final class a<T> implements p<T>, k0.b.w.a {
        public k0.b.w.a Y1;
        public volatile long Z1;
        public boolean a2;
        public final p<? super T> c;
        public final long d;
        public final TimeUnit q;
        public final q.c x;
        public k0.b.w.a y;

        public a(p<? super T> pVar, long j, TimeUnit timeUnit, q.c cVar) {
            this.c = pVar;
            this.d = j;
            this.q = timeUnit;
            this.x = cVar;
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.y, aVar)) {
                this.y = aVar;
                this.c.a(this);
            }
        }

        public void b(T t) {
            if (!this.a2) {
                long j = this.Z1 + 1;
                this.Z1 = j;
                k0.b.w.a aVar = this.Y1;
                if (aVar != null) {
                    aVar.dispose();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.Y1 = debounceEmitter;
                DisposableHelper.replace(debounceEmitter, this.x.c(debounceEmitter, this.d, this.q));
            }
        }

        public void dispose() {
            this.y.dispose();
            this.x.dispose();
        }

        public boolean isDisposed() {
            return this.x.isDisposed();
        }

        public void onComplete() {
            if (!this.a2) {
                this.a2 = true;
                k0.b.w.a aVar = this.Y1;
                if (aVar != null) {
                    aVar.dispose();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) aVar;
                if (debounceEmitter != null) {
                    debounceEmitter.run();
                }
                this.c.onComplete();
                this.x.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.a2) {
                RxJavaPlugins.onError(th);
                return;
            }
            k0.b.w.a aVar = this.Y1;
            if (aVar != null) {
                aVar.dispose();
            }
            this.a2 = true;
            this.c.onError(th);
            this.x.dispose();
        }
    }

    public ObservableDebounceTimed(o<T> oVar, long j, TimeUnit timeUnit, q qVar) {
        super(oVar);
        this.d = j;
        this.q = timeUnit;
        this.x = qVar;
    }

    public void u(p<? super T> pVar) {
        this.c.c(new a(new c(pVar), this.d, this.q, this.x.a()));
    }
}
