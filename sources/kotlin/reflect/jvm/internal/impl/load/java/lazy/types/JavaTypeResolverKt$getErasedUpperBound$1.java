package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolverKt$getErasedUpperBound$1 extends Lambda implements a<a0> {
    public final /* synthetic */ m0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTypeResolverKt$getErasedUpperBound$1(m0 m0Var) {
        super(0);
        this.c = m0Var;
    }

    public Object invoke() {
        StringBuilder P0 = i0.d.a.a.a.P0("Can't compute erased upper bound of type parameter `");
        P0.append(this.c);
        P0.append('`');
        a0 d = p.d(P0.toString());
        i.d(d, "createErrorType(\"Can't compute erased upper bound of type parameter `$this`\")");
        return d;
    }
}
