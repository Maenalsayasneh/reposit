package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import m0.i;
import m0.l.c;

/* compiled from: SafeCollector.common.kt */
public final class g implements d<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ int d;

    public g(d dVar, int i) {
        this.c = dVar;
        this.d = i;
    }

    public Object collect(e<? super T> eVar, c<? super i> cVar) {
        Object collect = this.c.collect(new h(new Ref$IntRef(), this.d, eVar), cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
