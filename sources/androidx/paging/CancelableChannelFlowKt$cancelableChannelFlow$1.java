package androidx.paging;

import h0.u.c0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

@c(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {30}, m = "invokeSuspend")
/* compiled from: CancelableChannelFlow.kt */
public final class CancelableChannelFlowKt$cancelableChannelFlow$1 extends SuspendLambda implements p<c0<T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ f1 q;
    public final /* synthetic */ p x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CancelableChannelFlowKt$cancelableChannelFlow$1(f1 f1Var, p pVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = f1Var;
        this.x = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.q, this.x, cVar);
        cancelableChannelFlowKt$cancelableChannelFlow$1.c = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.q, this.x, cVar);
        cancelableChannelFlowKt$cancelableChannelFlow$1.c = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            final c0 c0Var = (c0) this.c;
            this.q.E(new l<Throwable, i>() {
                public Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    a.D0(c0Var, (Throwable) null, 1, (Object) null);
                    return i.a;
                }
            });
            p pVar = this.x;
            this.d = 1;
            if (pVar.invoke(c0Var, this) == coroutineSingletons) {
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
