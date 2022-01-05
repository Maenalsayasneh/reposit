package com.airbnb.mvrx;

import com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.g2.e;

@c(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1", f = "MavericksLifecycleAwareFlow.kt", l = {35}, m = "invokeSuspend")
/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1 extends SuspendLambda implements q<Boolean, T, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public int q;
    public final /* synthetic */ MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1(MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1 r1, m0.l.c cVar) {
        super(3, cVar);
        this.x = r1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m0.l.c cVar = (m0.l.c) obj3;
        m0.n.b.i.e(obj2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        m0.n.b.i.e(cVar, "continuation");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1(this.x, cVar);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1.c = booleanValue;
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1.d = obj2;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.q;
        if (i == 0) {
            h.d4(obj);
            boolean z = this.c;
            Object obj2 = this.d;
            if (z) {
                e eVar = eVar;
                this.q = 1;
                if (eVar.emit(obj2, this) == coroutineSingletons) {
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
