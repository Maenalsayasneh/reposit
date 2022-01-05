package m0.r.t.a.r.m;

import m0.n.b.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.c;

/* compiled from: TypeAliasExpansionReportStrategy.kt */
public interface i0 {

    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    public static final class a implements i0 {
        public static final a a = new a();

        public void a(v vVar, v vVar2, v vVar3, m0 m0Var) {
            i.e(vVar, "bound");
            i.e(vVar2, "unsubstitutedArgument");
            i.e(vVar3, "argument");
            i.e(m0Var, "typeParameter");
        }

        public void b(c cVar) {
            i.e(cVar, "annotation");
        }

        public void c(l0 l0Var, m0 m0Var, v vVar) {
            i.e(l0Var, "typeAlias");
            i.e(vVar, "substitutedArgument");
        }

        public void d(l0 l0Var) {
            i.e(l0Var, "typeAlias");
        }
    }

    void a(v vVar, v vVar2, v vVar3, m0 m0Var);

    void b(c cVar);

    void c(l0 l0Var, m0 m0Var, v vVar);

    void d(l0 l0Var);
}
