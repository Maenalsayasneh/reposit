package n0.a;

import m0.i;
import n0.a.h2.g;

/* compiled from: JobSupport.kt */
public final class q extends g1 {
    public final n<?> y;

    public q(n<?> nVar) {
        this.y = nVar;
    }

    public void H(Throwable th) {
        boolean z;
        n<?> nVar = this.y;
        Throwable n = nVar.n(J());
        if (!nVar.s()) {
            z = false;
        } else {
            z = ((g) nVar.Y1).j(n);
        }
        if (!z) {
            nVar.I(n);
            nVar.l();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        H((Throwable) obj);
        return i.a;
    }
}
