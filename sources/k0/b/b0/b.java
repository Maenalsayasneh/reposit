package k0.b.b0;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.p;
import k0.b.w.a;

/* compiled from: DisposableObserver */
public abstract class b<T> implements p<T>, a {
    public final AtomicReference<a> c = new AtomicReference<>();

    public final void a(a aVar) {
        if (h.O3(this.c, aVar, getClass())) {
            c();
        }
    }

    public void c() {
    }

    public final void dispose() {
        DisposableHelper.dispose(this.c);
    }

    public final boolean isDisposed() {
        return this.c.get() == DisposableHelper.DISPOSED;
    }
}
