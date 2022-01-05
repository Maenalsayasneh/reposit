package n0.a.f2;

import i0.j.f.p.h;
import m0.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.h2.k;
import n0.a.h2.t;
import n0.a.m;
import n0.a.o;

/* compiled from: AbstractChannel.kt */
public class s<E> extends q {
    public final E x;
    public final m<i> y;

    public s(E e, m<? super i> mVar) {
        this.x = e;
        this.y = mVar;
    }

    public void H() {
        this.y.O(o.a);
    }

    public E J() {
        return this.x;
    }

    public void K(h<?> hVar) {
        this.y.resumeWith(h.l0(hVar.P()));
    }

    public t L(k.c cVar) {
        if (this.y.c(i.a, cVar == null ? null : cVar.c) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.c.e(cVar);
        }
        return o.a;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a.M1(this) + '(' + this.x + ')';
    }
}
