package io.reactivex.internal.operators.observable;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.e0.b;
import k0.b.e0.c;
import k0.b.l;
import k0.b.o;
import k0.b.p;
import k0.b.y.e;
import k0.b.z.e.c.a;

public final class ObservableRetryWhen<T> extends a<T, T> {
    public final e<? super l<Throwable>, ? extends o<?>> d;

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements p<T>, k0.b.w.a {
        public final AtomicReference<k0.b.w.a> Y1 = new AtomicReference<>();
        public final o<T> Z1;
        public volatile boolean a2;
        public final p<? super T> c;
        public final AtomicInteger d = new AtomicInteger();
        public final AtomicThrowable q = new AtomicThrowable();
        public final c<Throwable> x;
        public final RepeatWhenObserver<T>.InnerRepeatObserver y = new InnerRepeatObserver();

        public final class InnerRepeatObserver extends AtomicReference<k0.b.w.a> implements p<Object> {
            public InnerRepeatObserver() {
            }

            public void a(k0.b.w.a aVar) {
                DisposableHelper.setOnce(this, aVar);
            }

            public void b(Object obj) {
                RepeatWhenObserver.this.c();
            }

            public void onComplete() {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.dispose(repeatWhenObserver.Y1);
                p<? super T> pVar = repeatWhenObserver.c;
                AtomicThrowable atomicThrowable = repeatWhenObserver.q;
                if (repeatWhenObserver.getAndIncrement() == 0) {
                    Throwable b = atomicThrowable.b();
                    if (b != null) {
                        pVar.onError(b);
                    } else {
                        pVar.onComplete();
                    }
                }
            }

            public void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.dispose(repeatWhenObserver.Y1);
                p<? super T> pVar = repeatWhenObserver.c;
                AtomicThrowable atomicThrowable = repeatWhenObserver.q;
                if (!atomicThrowable.a(th)) {
                    RxJavaPlugins.onError(th);
                } else if (repeatWhenObserver.getAndIncrement() == 0) {
                    pVar.onError(atomicThrowable.b());
                }
            }
        }

        public RepeatWhenObserver(p<? super T> pVar, c<Throwable> cVar, o<T> oVar) {
            this.c = pVar;
            this.x = cVar;
            this.Z1 = oVar;
        }

        public void a(k0.b.w.a aVar) {
            DisposableHelper.replace(this.Y1, aVar);
        }

        public void b(T t) {
            p<? super T> pVar = this.c;
            AtomicThrowable atomicThrowable = this.q;
            if (get() == 0 && compareAndSet(0, 1)) {
                pVar.b(t);
                if (decrementAndGet() != 0) {
                    Throwable b = atomicThrowable.b();
                    if (b != null) {
                        pVar.onError(b);
                    } else {
                        pVar.onComplete();
                    }
                }
            }
        }

        public void c() {
            if (this.d.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.a2) {
                        this.a2 = true;
                        this.Z1.c(this);
                    }
                    if (this.d.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this.Y1);
            DisposableHelper.dispose(this.y);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.Y1.get());
        }

        public void onComplete() {
            DisposableHelper.dispose(this.y);
            p<? super T> pVar = this.c;
            AtomicThrowable atomicThrowable = this.q;
            if (getAndIncrement() == 0) {
                Throwable b = atomicThrowable.b();
                if (b != null) {
                    pVar.onError(b);
                } else {
                    pVar.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            DisposableHelper.replace(this.Y1, (k0.b.w.a) null);
            this.a2 = false;
            this.x.b(th);
        }
    }

    public ObservableRetryWhen(o<T> oVar, e<? super l<Throwable>, ? extends o<?>> eVar) {
        super(oVar);
        this.d = eVar;
    }

    public void u(p<? super T> pVar) {
        c publishSubject = new PublishSubject();
        if (!(publishSubject instanceof b)) {
            publishSubject = new b(publishSubject);
        }
        try {
            Object apply = this.d.apply(publishSubject);
            Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
            o oVar = (o) apply;
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(pVar, publishSubject, this.c);
            pVar.a(repeatWhenObserver);
            oVar.c(repeatWhenObserver.y);
            repeatWhenObserver.c();
        } catch (Throwable th) {
            h.c4(th);
            EmptyDisposable.error(th, (p<?>) pVar);
        }
    }
}
