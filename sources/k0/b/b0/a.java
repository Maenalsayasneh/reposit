package k0.b.b0;

import i0.j.f.p.h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.c;

/* compiled from: DisposableCompletableObserver */
public abstract class a implements c, k0.b.w.a {
    public final AtomicReference<k0.b.w.a> c = new AtomicReference<>();

    public final void a(k0.b.w.a aVar) {
        boolean O3 = h.O3(this.c, aVar, getClass());
    }

    public final void dispose() {
        DisposableHelper.dispose(this.c);
    }

    public final boolean isDisposed() {
        return this.c.get() == DisposableHelper.DISPOSED;
    }
}
