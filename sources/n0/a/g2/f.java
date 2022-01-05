package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;

/* compiled from: SafeCollector.common.kt */
public final class f implements d<T> {
    public final /* synthetic */ Object c;

    public f(Object obj) {
        this.c = obj;
    }

    public Object collect(e<? super T> eVar, c<? super i> cVar) {
        Object emit = eVar.emit(this.c, cVar);
        if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return emit;
        }
        return i.a;
    }
}
