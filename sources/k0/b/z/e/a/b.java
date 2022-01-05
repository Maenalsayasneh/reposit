package k0.b.z.e.a;

import io.reactivex.internal.disposables.EmptyDisposable;
import k0.b.a;
import k0.b.c;

/* compiled from: CompletableError */
public final class b extends a {
    public final Throwable a;

    public b(Throwable th) {
        this.a = th;
    }

    public void e(c cVar) {
        EmptyDisposable.error(this.a, cVar);
    }
}
