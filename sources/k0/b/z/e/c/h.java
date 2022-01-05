package k0.b.z.e.c;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.l;
import k0.b.p;

/* compiled from: ObservableFromCallable */
public final class h<T> extends l<T> implements Callable<T> {
    public final Callable<? extends T> c;

    public h(Callable<? extends T> callable) {
        this.c = callable;
    }

    public T call() throws Exception {
        T call = this.c.call();
        Objects.requireNonNull(call, "The callable returned a null value");
        return call;
    }

    public void u(p<? super T> pVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(pVar);
        pVar.a(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                T call = this.c.call();
                Objects.requireNonNull(call, "Callable returned null");
                int i = deferredScalarDisposable.get();
                if ((i & 54) == 0) {
                    p<? super T> pVar2 = deferredScalarDisposable.c;
                    if (i == 8) {
                        deferredScalarDisposable.d = call;
                        deferredScalarDisposable.lazySet(16);
                        pVar2.b(null);
                    } else {
                        deferredScalarDisposable.lazySet(2);
                        pVar2.b(call);
                    }
                    if (deferredScalarDisposable.get() != 4) {
                        pVar2.onComplete();
                    }
                }
            } catch (Throwable th) {
                i0.j.f.p.h.c4(th);
                if (!deferredScalarDisposable.isDisposed()) {
                    pVar.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
