package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.d0.m;

@c(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
/* compiled from: Collect.kt */
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ d<T> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(d<? extends T> dVar, m0.l.c<? super FlowKt__CollectKt$launchIn$1> cVar) {
        super(2, cVar);
        this.d = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new FlowKt__CollectKt$launchIn$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<T> dVar = this.d;
            this.c = 1;
            Object collect = dVar.collect(m.c, this);
            if (collect != coroutineSingletons) {
                collect = i.a;
            }
            if (collect == coroutineSingletons) {
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
