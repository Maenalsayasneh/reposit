package k0.b.z.d;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.p;
import k0.b.w.a;

/* compiled from: DisposableLambdaObserver */
public final class d<T> implements p<T>, a {
    public final p<? super T> c;
    public final k0.b.y.d<? super a> d;
    public final k0.b.y.a q;
    public a x;

    public d(p<? super T> pVar, k0.b.y.d<? super a> dVar, k0.b.y.a aVar) {
        this.c = pVar;
        this.d = dVar;
        this.q = aVar;
    }

    public void a(a aVar) {
        try {
            this.d.b(aVar);
            if (DisposableHelper.validate(this.x, aVar)) {
                this.x = aVar;
                this.c.a(this);
            }
        } catch (Throwable th) {
            h.c4(th);
            aVar.dispose();
            this.x = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, (p<?>) this.c);
        }
    }

    public void b(T t) {
        this.c.b(t);
    }

    public void dispose() {
        a aVar = this.x;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            this.x = disposableHelper;
            try {
                this.q.run();
            } catch (Throwable th) {
                h.c4(th);
                RxJavaPlugins.onError(th);
            }
            aVar.dispose();
        }
    }

    public boolean isDisposed() {
        return this.x.isDisposed();
    }

    public void onComplete() {
        a aVar = this.x;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            this.x = disposableHelper;
            this.c.onComplete();
        }
    }

    public void onError(Throwable th) {
        a aVar = this.x;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            this.x = disposableHelper;
            this.c.onError(th);
            return;
        }
        RxJavaPlugins.onError(th);
    }
}
