package k0.b;

import i0.j.f.p.h;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* compiled from: Single */
public abstract class r<T> {
    public final void a(t<? super T> tVar) {
        t<? super Object> onSubscribe = RxJavaPlugins.onSubscribe(this, tVar);
        Objects.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            h.c4(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(t<? super T> tVar);
}
