package k0.b.z.e.c;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.l;
import k0.b.p;

/* compiled from: ObservableError */
public final class f<T> extends l<T> {
    public final Callable<? extends Throwable> c;

    public f(Callable<? extends Throwable> callable) {
        this.c = callable;
    }

    public void u(p<? super T> pVar) {
        try {
            Object call = this.c.call();
            Objects.requireNonNull(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            h.c4(th);
        }
        EmptyDisposable.error(th, (p<?>) pVar);
    }
}
