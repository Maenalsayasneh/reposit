package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.o;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: ReflectionObjectRenderer.kt */
public final class ReflectionObjectRenderer {
    public static final DescriptorRenderer a = DescriptorRenderer.a;
    public static final ReflectionObjectRenderer b = null;

    public static final void a(StringBuilder sb, f0 f0Var) {
        if (f0Var != null) {
            v type = f0Var.getType();
            i.d(type, "receiver.type");
            sb.append(e(type));
            sb.append(".");
        }
    }

    public static final void b(StringBuilder sb, a aVar) {
        f0 e = o.e(aVar);
        f0 l02 = aVar.l0();
        a(sb, e);
        boolean z = (e == null || l02 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        a(sb, l02);
        if (z) {
            sb.append(")");
        }
    }

    public static final String c(r rVar) {
        i.e(rVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        b(sb, rVar);
        DescriptorRenderer descriptorRenderer = a;
        d name = rVar.getName();
        i.d(name, "descriptor.name");
        sb.append(descriptorRenderer.v(name, true));
        List<o0> h = rVar.h();
        i.d(h, "descriptor.valueParameters");
        g.C(h, sb, ", ", "(", ")", 0, (CharSequence) null, ReflectionObjectRenderer$renderFunction$1$1.c, 48);
        sb.append(": ");
        v returnType = rVar.getReturnType();
        i.c(returnType);
        i.d(returnType, "descriptor.returnType!!");
        sb.append(e(returnType));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String d(c0 c0Var) {
        i.e(c0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(c0Var.i0() ? "var " : "val ");
        b(sb, c0Var);
        DescriptorRenderer descriptorRenderer = a;
        d name = c0Var.getName();
        i.d(name, "descriptor.name");
        sb.append(descriptorRenderer.v(name, true));
        sb.append(": ");
        v type = c0Var.getType();
        i.d(type, "descriptor.type");
        sb.append(e(type));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String e(v vVar) {
        i.e(vVar, "type");
        return a.w(vVar);
    }
}
