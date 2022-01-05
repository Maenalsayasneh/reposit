package io.reactivex.internal.observers;

import i0.j.f.p.h;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.c;
import k0.b.w.a;
import k0.b.y.d;

public final class CallbackCompletableObserver extends AtomicReference<a> implements c, a, d<Throwable> {
    public final d<? super Throwable> c;
    public final k0.b.y.a d;

    public CallbackCompletableObserver(d<? super Throwable> dVar, k0.b.y.a aVar) {
        this.c = dVar;
        this.d = aVar;
    }

    public void a(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    public void b(Object obj) throws Exception {
        RxJavaPlugins.onError(new OnErrorNotImplementedException((Throwable) obj));
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        try {
            this.d.run();
        } catch (Throwable th) {
            h.c4(th);
            RxJavaPlugins.onError(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.c.b(th);
        } catch (Throwable th2) {
            h.c4(th2);
            RxJavaPlugins.onError(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }
}
