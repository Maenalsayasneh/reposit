package com.airbnb.mvrx;

import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.f2.n;

@c(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$4", f = "MavericksLifecycleAwareFlow.kt", l = {54}, m = "invokeSuspend")
/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3 extends SuspendLambda implements p<T, m0.l.c<? super i>, Object> {
    public final /* synthetic */ q Y1;
    public final /* synthetic */ n Z1;
    public final /* synthetic */ Ref$BooleanRef a2;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ Ref$ObjectRef q;
    public final /* synthetic */ Ref$ObjectRef x;
    public final /* synthetic */ Ref$ObjectRef y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3(m0.l.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, q qVar, n nVar, Ref$BooleanRef ref$BooleanRef) {
        super(2, cVar);
        this.q = ref$ObjectRef;
        this.x = ref$ObjectRef2;
        this.y = ref$ObjectRef3;
        this.Y1 = qVar;
        this.Z1 = nVar;
        this.a2 = ref$BooleanRef;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3(cVar, this.q, this.x, this.y, this.Y1, this.Z1, this.a2);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            T t = this.c;
            this.y.c = t;
            T t2 = this.x.c;
            if (((Boolean) t2) != null) {
                q qVar = this.Y1;
                Boolean bool = (Boolean) t2;
                Objects.requireNonNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
                this.d = 1;
                if (qVar.invoke(bool, t, this) == coroutineSingletons) {
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
