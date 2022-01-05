package m0.r.t.a.r.c.v0.a;

import m0.n.b.i;
import m0.r.t.a.r.c.i0;
import m0.r.t.a.r.c.v0.b.l;
import m0.r.t.a.r.e.a.v.b;

/* compiled from: RuntimeSourceElementFactory.kt */
public final class j implements b {
    public static final j a = new j();

    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class a implements m0.r.t.a.r.e.a.v.a {
        public final l b;

        public a(l lVar) {
            i.e(lVar, "javaElement");
            this.b = lVar;
        }

        public i0 a() {
            i0 i0Var = i0.a;
            i.d(i0Var, "NO_SOURCE_FILE");
            return i0Var;
        }

        public m0.r.t.a.r.e.a.w.l b() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            i0.d.a.a.a.p(a.class, sb, ": ");
            sb.append(this.b);
            return sb.toString();
        }
    }

    public m0.r.t.a.r.e.a.v.a a(m0.r.t.a.r.e.a.w.l lVar) {
        i.e(lVar, "javaElement");
        return new a((l) lVar);
    }
}
