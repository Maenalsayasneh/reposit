package n0.a;

import m0.r.t.a.r.m.a1.a;
import n0.a.h2.o;

/* compiled from: MainCoroutineDispatcher.kt */
public abstract class l1 extends d0 {
    public abstract l1 T();

    public final String U() {
        l1 l1Var;
        d0 d0Var = m0.a;
        l1 l1Var2 = o.c;
        if (this == l1Var2) {
            return "Dispatchers.Main";
        }
        try {
            l1Var = l1Var2.T();
        } catch (UnsupportedOperationException unused) {
            l1Var = null;
        }
        if (this == l1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String U = U();
        if (U != null) {
            return U;
        }
        return getClass().getSimpleName() + '@' + a.M1(this);
    }
}
