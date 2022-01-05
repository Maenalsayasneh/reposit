package m0.r.t.a.r.n;

import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.v;

/* compiled from: modifierChecks.kt */
public final class e implements b {
    public static final e a = new e();

    public String a(r rVar) {
        return a.o2(this, rVar);
    }

    public boolean b(r rVar) {
        a0 a0Var;
        i.e(rVar, "functionDescriptor");
        o0 o0Var = rVar.h().get(1);
        ReflectionTypes.b bVar = ReflectionTypes.a;
        i.d(o0Var, "secondParameter");
        u k = DescriptorUtilsKt.k(o0Var);
        i.e(k, "module");
        d D0 = h.D0(k, g.a.Z);
        if (D0 == null) {
            a0Var = null;
        } else {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            Objects.requireNonNull(f.i);
            f fVar = f.a.b;
            List<m0> parameters = D0.i().getParameters();
            i.d(parameters, "kPropertyClass.typeConstructor.parameters");
            Object j02 = m0.j.g.j0(parameters);
            i.d(j02, "kPropertyClass.typeConstructor.parameters.single()");
            a0Var = KotlinTypeFactory.e(fVar, D0, h.L2(new StarProjectionImpl((m0) j02)));
        }
        if (a0Var == null) {
            return false;
        }
        v type = o0Var.getType();
        i.d(type, "secondParameter.type");
        v H2 = a.H2(type);
        i.e(a0Var, "<this>");
        i.e(H2, "superType");
        return m0.r.t.a.r.m.x0.d.a.d(a0Var, H2);
    }

    public String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
