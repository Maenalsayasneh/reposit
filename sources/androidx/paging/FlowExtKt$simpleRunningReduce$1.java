package androidx.paging;

import h0.u.g;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {102}, m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleRunningReduce$1 extends SuspendLambda implements p<e<? super T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ d q;
    public final /* synthetic */ q x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleRunningReduce$1(d dVar, q qVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = dVar;
        this.x = qVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.q, this.x, cVar);
        flowExtKt$simpleRunningReduce$1.c = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.q, this.x, cVar);
        flowExtKt$simpleRunningReduce$1.c = obj;
        return flowExtKt$simpleRunningReduce$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object obj2 = g.a;
            ref$ObjectRef.c = g.a;
            d dVar = this.q;
            FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(this, (e) this.c, ref$ObjectRef);
            this.d = 1;
            if (dVar.collect(flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
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
