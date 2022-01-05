package k0.b.z.e.d;

import i0.j.f.p.h;
import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.r;
import k0.b.t;

/* compiled from: SingleFromCallable */
public final class a<T> extends r<T> {
    public final Callable<? extends T> a;

    public a(Callable<? extends T> callable) {
        this.a = callable;
    }

    public void b(t<? super T> tVar) {
        RunnableDisposable runnableDisposable = new RunnableDisposable(k0.b.z.b.a.b);
        tVar.a(runnableDisposable);
        if (!runnableDisposable.isDisposed()) {
            try {
                Object call = this.a.call();
                Objects.requireNonNull(call, "The callable returned a null value");
                if (!runnableDisposable.isDisposed()) {
                    tVar.onSuccess(call);
                }
            } catch (Throwable th) {
                h.c4(th);
                if (!runnableDisposable.isDisposed()) {
                    tVar.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
