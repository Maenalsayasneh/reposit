package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import m0.i;
import m0.l.c;

/* compiled from: Collect.kt */
public final class h implements e<T> {
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ int d;
    public final /* synthetic */ e q;

    public h(Ref$IntRef ref$IntRef, int i, e eVar) {
        this.c = ref$IntRef;
        this.d = i;
        this.q = eVar;
    }

    public Object emit(T t, c<? super i> cVar) {
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.c;
        if (i >= this.d) {
            Object emit = this.q.emit(t, cVar);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
        } else {
            ref$IntRef.c = i + 1;
        }
        return i.a;
    }
}
