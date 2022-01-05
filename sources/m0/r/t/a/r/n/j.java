package m0.r.t.a.r.n;

import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.r;

/* compiled from: modifierChecks.kt */
public abstract class j implements b {
    public final String a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends j {
        public final int b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = i0.d.a.a.a.Q0(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L_0x000e
                java.lang.String r1 = "s"
                goto L_0x0010
            L_0x000e:
                java.lang.String r1 = ""
            L_0x0010:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.n.j.a.<init>(int):void");
        }

        public boolean b(r rVar) {
            i.e(rVar, "functionDescriptor");
            return rVar.h().size() >= this.b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends j {
        public final int b;

        public b(int i) {
            super(i0.d.a.a.a.g0("must have exactly ", i, " value parameters"), (f) null);
            this.b = i;
        }

        public boolean b(r rVar) {
            i.e(rVar, "functionDescriptor");
            return rVar.h().size() == this.b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends j {
        public static final c b = new c();

        public c() {
            super("must have no value parameters", (f) null);
        }

        public boolean b(r rVar) {
            i.e(rVar, "functionDescriptor");
            return rVar.h().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class d extends j {
        public static final d b = new d();

        public d() {
            super("must have a single value parameter", (f) null);
        }

        public boolean b(r rVar) {
            i.e(rVar, "functionDescriptor");
            return rVar.h().size() == 1;
        }
    }

    public j(String str, f fVar) {
        this.a = str;
    }

    public String a(r rVar) {
        return m0.r.t.a.r.m.a1.a.o2(this, rVar);
    }

    public String getDescription() {
        return this.a;
    }
}
