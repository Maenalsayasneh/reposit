package n0.a.g2.d0;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.f2.r;
import n0.a.g2.e;

/* compiled from: SendingCollector.kt */
public final class o<T> implements e<T> {
    public final r<T> c;

    public o(r<? super T> rVar) {
        this.c = rVar;
    }

    public Object emit(T t, c<? super i> cVar) {
        Object t2 = this.c.t(t, cVar);
        if (t2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return t2;
        }
        return i.a;
    }
}
