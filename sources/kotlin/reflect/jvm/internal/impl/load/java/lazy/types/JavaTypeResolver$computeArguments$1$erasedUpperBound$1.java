package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.a.u.h.c;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolver$computeArguments$1$erasedUpperBound$1 extends Lambda implements a<v> {
    public final /* synthetic */ m0 c;
    public final /* synthetic */ m0.r.t.a.r.e.a.u.h.a d;
    public final /* synthetic */ j0 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTypeResolver$computeArguments$1$erasedUpperBound$1(m0 m0Var, m0.r.t.a.r.e.a.u.h.a aVar, j0 j0Var) {
        super(0);
        this.c = m0Var;
        this.d = aVar;
        this.q = j0Var;
    }

    public Object invoke() {
        m0 m0Var = this.c;
        i.d(m0Var, "parameter");
        m0 m0Var2 = this.d.d;
        final j0 j0Var = this.q;
        return c.a(m0Var, m0Var2, new a<v>() {
            public Object invoke() {
                f c2 = j0.this.c();
                i.c(c2);
                a0 q = c2.q();
                i.d(q, "constructor.declarationDescriptor!!.defaultType");
                return m0.r.t.a.r.m.a1.a.h3(q);
            }
        });
    }
}
