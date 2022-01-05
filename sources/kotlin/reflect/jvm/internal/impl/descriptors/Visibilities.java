package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import m0.n.b.i;
import m0.r.t.a.r.c.q0;

/* compiled from: Visibilities.kt */
public final class Visibilities {
    public static final Visibilities a = new Visibilities();
    public static final Map<q0, Integer> b;

    /* compiled from: Visibilities.kt */
    public static final class Internal extends q0 {
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class a extends q0 {
        public static final a a = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class b extends q0 {
        public static final b a = new b();

        public b() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class c extends q0 {
        public static final c a = new c();

        public c() {
            super("local", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class d extends q0 {
        public static final d a = new d();

        public d() {
            super("private", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class e extends q0 {
        public static final e a = new e();

        public e() {
            super("private_to_this", false);
        }

        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class f extends q0 {
        public static final f a = new f();

        public f() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class g extends q0 {
        public static final g a = new g();

        public g() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class h extends q0 {
        public static final h a = new h();

        public h() {
            super("unknown", false);
        }
    }

    static {
        m0.j.s.a aVar = new m0.j.s.a();
        aVar.put(e.a, 0);
        aVar.put(d.a, 0);
        aVar.put(Internal.INSTANCE, 1);
        aVar.put(f.a, 1);
        aVar.put(g.a, 2);
        i.e(aVar, "builder");
        aVar.c();
        aVar.Z1 = true;
        b = aVar;
    }

    public final boolean a(q0 q0Var) {
        i.e(q0Var, "visibility");
        return q0Var == d.a || q0Var == e.a;
    }
}
