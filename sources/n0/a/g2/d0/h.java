package n0.a.g2.d0;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import m0.l.c;
import m0.l.e;
import n0.a.h2.r;

/* compiled from: FlowCoroutine.kt */
public final class h<T> extends r<T> {
    public h(e eVar, c<? super T> cVar) {
        super(eVar, cVar);
    }

    public boolean R(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return K(th);
    }
}
