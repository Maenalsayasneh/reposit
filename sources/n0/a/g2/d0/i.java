package n0.a.g2.d0;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1;
import m0.l.c;
import m0.n.a.q;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class i implements d<R> {
    public final /* synthetic */ q c;

    public i(q qVar) {
        this.c = qVar;
    }

    public Object collect(e<? super R> eVar, c<? super m0.i> cVar) {
        Object z1 = a.z1(new FlowCoroutineKt$scopedFlow$1$1(this.c, eVar, (c<? super FlowCoroutineKt$scopedFlow$1$1>) null), cVar);
        if (z1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return z1;
        }
        return m0.i.a;
    }
}
