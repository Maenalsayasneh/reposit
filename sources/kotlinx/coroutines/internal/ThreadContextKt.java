package kotlinx.coroutines.internal;

import java.util.Objects;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.h2.t;
import n0.a.h2.x;
import n0.a.x1;

/* compiled from: ThreadContext.kt */
public final class ThreadContextKt {
    public static final t a = new t("NO_THREAD_ELEMENTS");
    public static final p<Object, e.a, Object> b = ThreadContextKt$countAll$1.c;
    public static final p<x1<?>, e.a, x1<?>> c = ThreadContextKt$findOne$1.c;
    public static final p<x, e.a, x> d = ThreadContextKt$updateState$1.c;

    public static final void a(e eVar, Object obj) {
        if (obj != a) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                int length = xVar.c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        x1<Object> x1Var = xVar.c[length];
                        i.c(x1Var);
                        x1Var.F(eVar, xVar.b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = eVar.fold(null, c);
                Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((x1) fold).F(eVar, obj);
            }
        }
    }

    public static final Object b(e eVar) {
        Object fold = eVar.fold(0, b);
        i.c(fold);
        return fold;
    }

    public static final Object c(e eVar, Object obj) {
        if (obj == null) {
            obj = b(eVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return eVar.fold(new x(eVar, ((Number) obj).intValue()), d);
        }
        return ((x1) obj).M(eVar);
    }
}
