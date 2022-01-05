package k0.b.z.e.c;

import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import k0.b.p;
import k0.b.z.c.c;

/* compiled from: ObservableJust */
public final class l<T> extends k0.b.l<T> implements c<T> {
    public final T c;

    public l(T t) {
        this.c = t;
    }

    public T call() {
        return this.c;
    }

    public void u(p<? super T> pVar) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(pVar, this.c);
        pVar.a(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }
}
