package h0.q;

import java.util.Objects;
import m0.l.e;
import m0.n.b.i;
import n0.a.d0;
import n0.a.h2.o;
import n0.a.l1;
import n0.a.m0;

/* compiled from: PausingDispatcher.kt */
public final class b0 extends d0 {
    public final h d = new h();

    public void I(e eVar, Runnable runnable) {
        i.e(eVar, "context");
        i.e(runnable, "block");
        h hVar = this.d;
        Objects.requireNonNull(hVar);
        i.e(eVar, "context");
        i.e(runnable, "runnable");
        d0 d0Var = m0.a;
        l1 T = o.c.T();
        if (T.Q(eVar) || hVar.a()) {
            T.I(eVar, new g(hVar, eVar, runnable));
        } else {
            hVar.c(runnable);
        }
    }

    public boolean Q(e eVar) {
        i.e(eVar, "context");
        d0 d0Var = m0.a;
        if (o.c.T().Q(eVar)) {
            return true;
        }
        return !this.d.a();
    }
}
