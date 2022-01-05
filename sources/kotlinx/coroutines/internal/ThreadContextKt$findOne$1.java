package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.p;
import n0.a.x1;

/* compiled from: ThreadContext.kt */
public final class ThreadContextKt$findOne$1 extends Lambda implements p<x1<?>, e.a, x1<?>> {
    public static final ThreadContextKt$findOne$1 c = new ThreadContextKt$findOne$1();

    public ThreadContextKt$findOne$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        x1 x1Var = (x1) obj;
        e.a aVar = (e.a) obj2;
        if (x1Var != null) {
            return x1Var;
        }
        if (aVar instanceof x1) {
            return (x1) aVar;
        }
        return null;
    }
}
