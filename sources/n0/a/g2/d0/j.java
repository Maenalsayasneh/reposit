package n0.a.g2.d0;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import m0.l.e;
import n0.a.f2.d;
import n0.a.f2.k;

/* compiled from: FlowCoroutine.kt */
public final class j<T> extends k<T> {
    public j(e eVar, d<T> dVar) {
        super(eVar, dVar);
    }

    public boolean R(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return K(th);
    }
}
