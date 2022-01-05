package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import m0.i;
import m0.j.l;
import m0.l.c;

/* compiled from: Collect.kt */
public final class n implements e<T> {
    public final /* synthetic */ e c;
    public final /* synthetic */ Ref$IntRef d;

    public n(e eVar, Ref$IntRef ref$IntRef) {
        this.c = eVar;
        this.d = ref$IntRef;
    }

    public Object emit(T t, c<? super i> cVar) {
        e eVar = this.c;
        Ref$IntRef ref$IntRef = this.d;
        int i = ref$IntRef.c;
        ref$IntRef.c = i + 1;
        if (i >= 0) {
            Object emit = eVar.emit(new l(i, t), cVar);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
            return i.a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
