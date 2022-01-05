package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.p;
import n0.a.h2.x;
import n0.a.x1;

/* compiled from: ThreadContext.kt */
public final class ThreadContextKt$updateState$1 extends Lambda implements p<x, e.a, x> {
    public static final ThreadContextKt$updateState$1 c = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        e.a aVar = (e.a) obj2;
        if (aVar instanceof x1) {
            x1<Object> x1Var = (x1) aVar;
            Object M = x1Var.M(xVar.a);
            Object[] objArr = xVar.b;
            int i = xVar.d;
            objArr[i] = M;
            x1<Object>[] x1VarArr = xVar.c;
            xVar.d = i + 1;
            x1VarArr[i] = x1Var;
        }
        return xVar;
    }
}
