package n0.a;

import m0.l.e;

/* compiled from: Unconfined.kt */
public final class a2 extends d0 {
    public static final a2 d = new a2();

    public void I(e eVar, Runnable runnable) {
        d2 d2Var = (d2) eVar.get(d2.c);
        if (d2Var != null) {
            d2Var.d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
