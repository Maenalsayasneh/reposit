package m0.r.t.a.r.c.s0;

import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.g0;

/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements c {
        public static final a a = new a();

        public boolean c(d dVar, g0 g0Var) {
            i.e(dVar, "classDescriptor");
            i.e(g0Var, "functionDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements c {
        public static final b a = new b();

        public boolean c(d dVar, g0 g0Var) {
            i.e(dVar, "classDescriptor");
            i.e(g0Var, "functionDescriptor");
            return !g0Var.getAnnotations().n(d.a);
        }
    }

    boolean c(d dVar, g0 g0Var);
}
