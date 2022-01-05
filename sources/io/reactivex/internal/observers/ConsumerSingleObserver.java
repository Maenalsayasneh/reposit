package io.reactivex.internal.observers;

import i0.j.f.p.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.t;
import k0.b.w.a;
import k0.b.y.d;

public final class ConsumerSingleObserver<T> extends AtomicReference<a> implements t<T>, a {
    public final d<? super T> c;
    public final d<? super Throwable> d;

    public ConsumerSingleObserver(d<? super T> dVar, d<? super Throwable> dVar2) {
        this.c = dVar;
        this.d = dVar2;
    }

    public void a(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.d.b(th);
        } catch (Throwable th2) {
            h.c4(th2);
            RxJavaPlugins.onError(new CompositeException(th, th2));
        }
    }

    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.c.b(t);
        } catch (Throwable th) {
            h.c4(th);
            RxJavaPlugins.onError(th);
        }
    }
}
