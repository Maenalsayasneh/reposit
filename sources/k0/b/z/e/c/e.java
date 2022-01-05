package k0.b.z.e.c;

import io.reactivex.internal.disposables.EmptyDisposable;
import k0.b.l;
import k0.b.p;
import k0.b.z.c.c;

/* compiled from: ObservableEmpty */
public final class e extends l<Object> implements c<Object> {
    public static final l<Object> c = new e();

    public Object call() {
        return null;
    }

    public void u(p<? super Object> pVar) {
        EmptyDisposable.complete((p<?>) pVar);
    }
}
