package n0.a.f2;

import kotlinx.coroutines.internal.UndeliveredElementException;
import m0.i;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.m;

/* compiled from: AbstractChannel.kt */
public final class t<E> extends s<E> {
    public final l<E, i> Y1;

    public t(E e, m<? super i> mVar, l<? super E, i> lVar) {
        super(e, mVar);
        this.Y1 = lVar;
    }

    public boolean E() {
        if (!super.E()) {
            return false;
        }
        M();
        return true;
    }

    public void M() {
        l<E, i> lVar = this.Y1;
        E e = this.x;
        e context = this.y.getContext();
        UndeliveredElementException i02 = a.i0(lVar, e, (UndeliveredElementException) null);
        if (i02 != null) {
            a.b2(context, i02);
        }
    }
}
