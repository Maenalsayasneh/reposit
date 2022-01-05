package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.f0;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {51}, m = "invokeSuspend")
/* compiled from: FlowCoroutine.kt */
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ q<f0, e<? super R>, m0.l.c<? super i>, Object> q;
    public final /* synthetic */ e<R> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(q<? super f0, ? super e<? super R>, ? super m0.l.c<? super i>, ? extends Object> qVar, e<? super R> eVar, m0.l.c<? super FlowCoroutineKt$scopedFlow$1$1> cVar) {
        super(2, cVar);
        this.q = qVar;
        this.x = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.q, this.x, cVar);
        flowCoroutineKt$scopedFlow$1$1.d = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.q, this.x, (m0.l.c) obj2);
        flowCoroutineKt$scopedFlow$1$1.d = (f0) obj;
        return flowCoroutineKt$scopedFlow$1$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            q<f0, e<? super R>, m0.l.c<? super i>, Object> qVar = this.q;
            e<R> eVar = this.x;
            this.c = 1;
            if (qVar.invoke((f0) this.d, eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
