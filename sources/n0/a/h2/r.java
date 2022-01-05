package n0.a.h2;

import i0.j.f.p.h;
import m0.l.c;
import m0.l.e;
import m0.l.f.a.b;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.d;

/* compiled from: Scopes.kt */
public class r<T> extends d<T> implements b {
    public final c<T> q;

    public r(e eVar, c<? super T> cVar) {
        super(eVar, true, true);
        this.q = cVar;
    }

    public void D(Object obj) {
        h.b(h.b2(this.q), a.d3(obj, this.q), (l) null, 2);
    }

    public final boolean e0() {
        return true;
    }

    public final b getCallerFrame() {
        c<T> cVar = this.q;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public void t0(Object obj) {
        c<T> cVar = this.q;
        cVar.resumeWith(a.d3(obj, cVar));
    }
}
