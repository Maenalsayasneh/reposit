package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.g;
import n0.a.f2.n;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements p<g<? extends Object>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref$ObjectRef<Object> d;
    public final /* synthetic */ n<i> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, n<i> nVar, m0.l.c<? super FlowKt__DelayKt$sample$2$1$1> cVar) {
        super(2, cVar);
        this.d = ref$ObjectRef;
        this.q = nVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.d, this.q, cVar);
        flowKt__DelayKt$sample$2$1$1.c = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        g gVar = new g(((g) obj).c);
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.d, this.q, (m0.l.c) obj2);
        flowKt__DelayKt$sample$2$1$1.c = gVar;
        i iVar = i.a;
        flowKt__DelayKt$sample$2$1$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        T t = ((g) this.c).c;
        Ref$ObjectRef<Object> ref$ObjectRef = this.d;
        boolean z = t instanceof g.c;
        if (!z) {
            ref$ObjectRef.c = t;
        }
        n<i> nVar = this.q;
        if (z) {
            Throwable a = g.a(t);
            if (a == null) {
                nVar.b(new ChildCancelledException());
                ref$ObjectRef.c = n0.a.g2.d0.n.c;
            } else {
                throw a;
            }
        }
        return i.a;
    }
}
