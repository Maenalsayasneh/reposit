package com.airbnb.mvrx;

import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.f2.n;

@c(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$$special$$inlined$onReceive$1", f = "MavericksLifecycleAwareFlow.kt", l = {92}, m = "invokeSuspend")
/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public final /* synthetic */ Ref$ObjectRef Y1;
    public final /* synthetic */ q Z1;
    public final /* synthetic */ n a2;
    public final /* synthetic */ Ref$BooleanRef b2;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ p q;
    public final /* synthetic */ Ref$ObjectRef x;
    public final /* synthetic */ Ref$ObjectRef y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2(p pVar, m0.l.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, q qVar, n nVar, Ref$BooleanRef ref$BooleanRef) {
        super(2, cVar);
        this.q = pVar;
        this.x = ref$ObjectRef;
        this.y = ref$ObjectRef2;
        this.Y1 = ref$ObjectRef3;
        this.Z1 = qVar;
        this.a2 = nVar;
        this.b2 = ref$BooleanRef;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2(this.q, cVar, this.x, this.y, this.Y1, this.Z1, this.a2, this.b2);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            Object obj2 = this.c;
            if (obj2 == null) {
                this.a2.b((CancellationException) null);
                this.b2.c = true;
            } else {
                p pVar = this.q;
                this.d = 1;
                if (pVar.invoke(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
