package m0.r.t.a.r.n;

import m0.n.b.i;
import m0.r.t.a.r.c.r;

/* compiled from: modifierChecks.kt */
public abstract class f implements b {
    public final String a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends f {
        public static final a b = new a();

        public a() {
            super("must be a member function", (m0.n.b.f) null);
        }

        public boolean b(r rVar) {
            i.e(rVar, "functionDescriptor");
            return rVar.e0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends f {
        public static final b b = new b();

        public b() {
            super("must be a member or an extension function", (m0.n.b.f) null);
        }

        public boolean b(r rVar) {
            i.e(rVar, "functionDescriptor");
            return (rVar.e0() == null && rVar.l0() == null) ? false : true;
        }
    }

    public f(String str, m0.n.b.f fVar) {
        this.a = str;
    }

    public String a(r rVar) {
        return m0.r.t.a.r.m.a1.a.o2(this, rVar);
    }

    public String getDescription() {
        return this.a;
    }
}
