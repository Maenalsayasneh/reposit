package k0.b;

import i0.j.f.p.h;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.y.d;
import k0.b.z.e.a.e;

/* compiled from: Completable */
public abstract class a implements e {
    public static a c() {
        return RxJavaPlugins.onAssembly(k0.b.z.e.a.a.a);
    }

    public final void a(c cVar) {
        Objects.requireNonNull(cVar, "observer is null");
        try {
            c onSubscribe = RxJavaPlugins.onSubscribe(this, cVar);
            Objects.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            e(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            h.c4(th);
            RxJavaPlugins.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final a b(e eVar) {
        Objects.requireNonNull(eVar, "next is null");
        return RxJavaPlugins.onAssembly((a) new CompletableAndThenCompletable(this, eVar));
    }

    public final a d(k0.b.y.a aVar) {
        d<Object> dVar = k0.b.z.b.a.d;
        k0.b.y.a aVar2 = k0.b.z.b.a.c;
        return RxJavaPlugins.onAssembly((a) new e(this, dVar, dVar, aVar, aVar2, aVar2, aVar2));
    }

    public abstract void e(c cVar);

    public final a f(q qVar) {
        Objects.requireNonNull(qVar, "scheduler is null");
        return RxJavaPlugins.onAssembly((a) new CompletableSubscribeOn(this, qVar));
    }
}
