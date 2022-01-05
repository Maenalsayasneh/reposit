package n0.a.h2;

import m0.r.t.a.r.m.a1.a;

/* compiled from: Atomic.kt */
public abstract class p {
    public abstract d<?> a();

    public final boolean b(p pVar) {
        d<?> a;
        d<?> a2 = a();
        if (a2 == null || (a = pVar.a()) == null || a2.g() >= a.g()) {
            return false;
        }
        return true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return getClass().getSimpleName() + '@' + a.M1(this);
    }
}
