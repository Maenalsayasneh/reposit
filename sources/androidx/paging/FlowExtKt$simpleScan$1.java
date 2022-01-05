package androidx.paging;

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

@c(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {42, 102}, m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleScan$1 extends SuspendLambda implements p<e<? super R>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ q Y1;
    public /* synthetic */ Object c;
    public Object d;
    public int q;
    public final /* synthetic */ d x;
    public final /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1(d dVar, Object obj, q qVar, m0.l.c cVar) {
        super(2, cVar);
        this.x = dVar;
        this.y = obj;
        this.Y1 = qVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.x, this.y, this.Y1, cVar);
        flowExtKt$simpleScan$1.c = obj;
        return flowExtKt$simpleScan$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.x, this.y, this.Y1, cVar);
        flowExtKt$simpleScan$1.c = obj;
        return flowExtKt$simpleScan$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        e eVar;
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.q;
        if (i == 0) {
            h.d4(obj);
            e eVar2 = (e) this.c;
            ref$ObjectRef = new Ref$ObjectRef();
            T t = this.y;
            ref$ObjectRef.c = t;
            this.c = eVar2;
            this.d = ref$ObjectRef;
            this.q = 1;
            if (eVar2.emit(t, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar2;
        } else if (i == 1) {
            ref$ObjectRef = (Ref$ObjectRef) this.d;
            eVar = (e) this.c;
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d dVar = this.x;
        FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1(this, eVar, ref$ObjectRef);
        this.c = null;
        this.d = null;
        this.q = 2;
        if (dVar.collect(flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return i.a;
    }
}
