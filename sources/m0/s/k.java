package m0.s;

import i0.j.f.p.h;
import java.util.Iterator;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: Sequences.kt */
public final class k implements h<T> {
    public final /* synthetic */ p a;

    public k(p pVar) {
        this.a = pVar;
    }

    public Iterator<T> iterator() {
        p pVar = this.a;
        i.e(pVar, "block");
        i iVar = new i();
        iVar.q = h.f0(pVar, iVar, iVar);
        return iVar;
    }
}
