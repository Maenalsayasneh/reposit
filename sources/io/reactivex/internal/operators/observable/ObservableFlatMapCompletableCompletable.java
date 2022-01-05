package io.reactivex.internal.operators.observable;

import i0.j.f.p.h;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.a;
import k0.b.c;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;

public final class ObservableFlatMapCompletableCompletable<T> extends a {
    public final o<T> a;
    public final e<? super T, ? extends k0.b.e> b;
    public final boolean c;

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements k0.b.w.a, p<T> {
        public k0.b.w.a Y1;
        public volatile boolean Z1;
        public final c c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final e<? super T, ? extends k0.b.e> q;
        public final boolean x;
        public final CompositeDisposable y = new CompositeDisposable();

        public final class InnerObserver extends AtomicReference<k0.b.w.a> implements c, k0.b.w.a {
            public InnerObserver() {
            }

            public void a(k0.b.w.a aVar) {
                DisposableHelper.setOnce(this, aVar);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((k0.b.w.a) get());
            }

            public void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.y.delete(this);
                flatMapCompletableMainObserver.onComplete();
            }

            public void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.y.delete(this);
                flatMapCompletableMainObserver.onError(th);
            }
        }

        public FlatMapCompletableMainObserver(c cVar, e<? super T, ? extends k0.b.e> eVar, boolean z) {
            this.c = cVar;
            this.q = eVar;
            this.x = z;
            lazySet(1);
        }

        public void a(k0.b.w.a aVar) {
            if (DisposableHelper.validate(this.Y1, aVar)) {
                this.Y1 = aVar;
                this.c.a(this);
            }
        }

        public void b(T t) {
            try {
                Object apply = this.q.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                k0.b.e eVar = (k0.b.e) apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.Z1 && this.y.add(innerObserver)) {
                    eVar.a(innerObserver);
                }
            } catch (Throwable th) {
                h.c4(th);
                this.Y1.dispose();
                onError(th);
            }
        }

        public void dispose() {
            this.Z1 = true;
            this.Y1.dispose();
            this.y.dispose();
        }

        public boolean isDisposed() {
            return this.Y1.isDisposed();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = this.d.b();
                if (b != null) {
                    this.c.onError(b);
                } else {
                    this.c.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.d.a(th)) {
                RxJavaPlugins.onError(th);
            } else if (!this.x) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.c.onError(this.d.b());
                }
            } else if (decrementAndGet() == 0) {
                this.c.onError(this.d.b());
            }
        }
    }

    public ObservableFlatMapCompletableCompletable(o<T> oVar, e<? super T, ? extends k0.b.e> eVar, boolean z) {
        this.a = oVar;
        this.b = eVar;
        this.c = z;
    }

    public void e(c cVar) {
        this.a.c(new FlatMapCompletableMainObserver(cVar, this.b, this.c));
    }
}
