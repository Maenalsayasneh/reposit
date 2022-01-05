package k0.b;

import i0.j.f.p.h;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.y.e;
import k0.b.z.e.b.d;

/* compiled from: Maybe */
public abstract class g<T> implements k<T> {
    public final void a(i<? super T> iVar) {
        i<? super Object> onSubscribe = RxJavaPlugins.onSubscribe(this, iVar);
        Objects.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            c(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            h.c4(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <R> g<R> b(e<? super T, ? extends R> eVar) {
        return RxJavaPlugins.onAssembly(new d(this, eVar));
    }

    public abstract void c(i<? super T> iVar);
}
