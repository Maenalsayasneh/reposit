package n0.a.g2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import m0.i;
import m0.l.c;
import m0.n.a.q;
import m0.r.t.a.r.m.a1.a;

/* compiled from: SafeCollector.common.kt */
public final class o implements d<R> {
    public final /* synthetic */ d c;
    public final /* synthetic */ d d;
    public final /* synthetic */ q q;

    public o(d dVar, d dVar2, q qVar) {
        this.c = dVar;
        this.d = dVar2;
        this.q = qVar;
    }

    public Object collect(e<? super R> eVar, c<? super i> cVar) {
        Object F0 = a.F0(eVar, new d[]{this.c, this.d}, FlowKt__ZipKt$nullArrayFactory$1.c, new FlowKt__ZipKt$combine$1$1(this.q, (c<? super FlowKt__ZipKt$combine$1$1>) null), cVar);
        if (F0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return F0;
        }
        return i.a;
    }
}
