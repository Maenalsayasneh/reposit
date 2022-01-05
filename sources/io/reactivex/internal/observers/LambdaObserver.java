package io.reactivex.internal.observers;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.p;
import k0.b.w.a;
import k0.b.y.d;

public final class LambdaObserver<T> extends AtomicReference<a> implements p<T>, a {
    public final d<? super T> c;
    public final d<? super Throwable> d;
    public final k0.b.y.a q;
    public final d<? super a> x;

    public LambdaObserver(d<? super T> dVar, d<? super Throwable> dVar2, k0.b.y.a aVar, d<? super a> dVar3) {
        this.c = dVar;
        this.d = dVar2;
        this.q = aVar;
        this.x = dVar3;
    }

    public void a(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            try {
                this.x.b(this);
            } catch (Throwable th) {
                h.c4(th);
                aVar.dispose();
                onError(th);
            }
        }
    }

    public void b(T t) {
        if (!isDisposed()) {
            try {
                this.c.b(t);
            } catch (Throwable th) {
                h.c4(th);
                ((a) get()).dispose();
                onError(th);
            }
        }
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.q.run();
            } catch (Throwable th) {
                h.c4(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.d.b(th);
            } catch (Throwable th2) {
                h.c4(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.onError(th);
        }
    }
}
