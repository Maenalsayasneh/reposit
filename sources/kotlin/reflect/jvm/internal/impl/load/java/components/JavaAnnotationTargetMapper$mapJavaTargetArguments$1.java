package kotlin.reflect.jvm.internal.impl.load.java.components;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.e.a.s.b;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements l<u, v> {
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 c = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();

    public JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        v vVar;
        u uVar = (u) obj;
        i.e(uVar, "module");
        b bVar = b.a;
        o0 O0 = h.O0(b.c, uVar.m().j(g.a.A));
        if (O0 == null) {
            vVar = null;
        } else {
            vVar = O0.getType();
        }
        if (vVar != null) {
            return vVar;
        }
        a0 d = p.d("Error: AnnotationTarget[]");
        i.d(d, "createErrorType(\"Error: AnnotationTarget[]\")");
        return d;
    }
}
