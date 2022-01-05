package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1;
import m0.l.c;
import m0.n.a.p;

/* compiled from: SafeCollector.common.kt */
public final class i implements d<T> {
    public final /* synthetic */ d c;
    public final /* synthetic */ p d;

    public i(d dVar, p pVar) {
        this.c = dVar;
        this.d = pVar;
    }

    public Object collect(e<? super T> eVar, c<? super m0.i> cVar) {
        Object collect = this.c.collect(new FlowKt__LimitKt$dropWhile$lambda4$$inlined$collect$1(new Ref$BooleanRef(), eVar, this.d), cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return m0.i.a;
    }
}
