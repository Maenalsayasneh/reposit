package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.n.b;

/* compiled from: modifierChecks.kt */
public abstract class ReturnsCheck implements b {
    public final String a;
    public final l<f, v> b;
    public final String c;

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean d = new ReturnsBoolean();

        public ReturnsBoolean() {
            super("Boolean", AnonymousClass1.c, (m0.n.b.f) null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt d = new ReturnsInt();

        public ReturnsInt() {
            super("Int", AnonymousClass1.c, (m0.n.b.f) null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit d = new ReturnsUnit();

        public ReturnsUnit() {
            super("Unit", AnonymousClass1.c, (m0.n.b.f) null);
        }
    }

    public ReturnsCheck(String str, l lVar, m0.n.b.f fVar) {
        this.a = str;
        this.b = lVar;
        this.c = i.k("must return ", str);
    }

    public String a(r rVar) {
        return a.o2(this, rVar);
    }

    public boolean b(r rVar) {
        i.e(rVar, "functionDescriptor");
        return i.a(rVar.getReturnType(), this.b.invoke(DescriptorUtilsKt.f(rVar)));
    }

    public String getDescription() {
        return this.c;
    }
}
