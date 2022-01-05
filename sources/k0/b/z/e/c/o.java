package k0.b.z.e.c;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.l;
import k0.b.p;
import k0.b.y.e;

/* compiled from: ObservableScalarXMap */
public final class o<T, R> extends l<R> {
    public final T c;
    public final e<? super T, ? extends k0.b.o<? extends R>> d;

    public o(T t, e<? super T, ? extends k0.b.o<? extends R>> eVar) {
        this.c = t;
        this.d = eVar;
    }

    public void u(p<? super R> pVar) {
        try {
            Object apply = this.d.apply(this.c);
            Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
            k0.b.o oVar = (k0.b.o) apply;
            if (oVar instanceof Callable) {
                try {
                    Object call = ((Callable) oVar).call();
                    if (call == null) {
                        EmptyDisposable.complete((p<?>) pVar);
                        return;
                    }
                    ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(pVar, call);
                    pVar.a(observableScalarXMap$ScalarDisposable);
                    observableScalarXMap$ScalarDisposable.run();
                } catch (Throwable th) {
                    h.c4(th);
                    EmptyDisposable.error(th, (p<?>) pVar);
                }
            } else {
                oVar.c(pVar);
            }
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, (p<?>) pVar);
        }
    }
}
