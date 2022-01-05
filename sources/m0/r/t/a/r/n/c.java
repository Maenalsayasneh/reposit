package m0.r.t.a.r.n;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: modifierChecks.kt */
public abstract class c {
    public final boolean a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends c {
        public static final a b = new a();

        public a() {
            super(false, (f) null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, (f) null);
            i.e(str, "error");
        }
    }

    /* renamed from: m0.r.t.a.r.n.c$c  reason: collision with other inner class name */
    /* compiled from: modifierChecks.kt */
    public static final class C0276c extends c {
        public static final C0276c b = new C0276c();

        public C0276c() {
            super(true, (f) null);
        }
    }

    public c(boolean z, f fVar) {
        this.a = z;
    }
}
