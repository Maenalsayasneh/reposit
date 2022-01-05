package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.m.v;

/* compiled from: ReflectionObjectRenderer.kt */
public final class ReflectionObjectRenderer$renderFunction$1$1 extends Lambda implements l<o0, CharSequence> {
    public static final ReflectionObjectRenderer$renderFunction$1$1 c = new ReflectionObjectRenderer$renderFunction$1$1();

    public ReflectionObjectRenderer$renderFunction$1$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        o0 o0Var = (o0) obj;
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.b;
        i.d(o0Var, "it");
        v type = o0Var.getType();
        i.d(type, "it.type");
        return ReflectionObjectRenderer.e(type);
    }
}
