package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import m0.i;
import m0.l.c;
import m0.r.t.a.r.m.a1.a;

/* compiled from: Collect.kt */
public final class j implements e<T> {
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ int d;
    public final /* synthetic */ e q;

    public j(Ref$IntRef ref$IntRef, int i, e eVar) {
        this.c = ref$IntRef;
        this.d = i;
        this.q = eVar;
    }

    public Object emit(T t, c<? super i> cVar) {
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.c + 1;
        ref$IntRef.c = i;
        if (i < this.d) {
            Object emit = this.q.emit(t, cVar);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
        } else {
            Object D = a.D(this.q, t, cVar);
            if (D == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return D;
            }
        }
        return i.a;
    }
}
