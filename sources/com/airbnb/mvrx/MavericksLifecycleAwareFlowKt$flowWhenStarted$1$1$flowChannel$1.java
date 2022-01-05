package com.airbnb.mvrx;

import com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.l;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1", f = "MavericksLifecycleAwareFlow.kt", l = {96}, m = "invokeSuspend")
/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 extends SuspendLambda implements p<l<? super T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1 q;

    /* compiled from: Collect.kt */
    public static final class a implements e<T> {
        public final /* synthetic */ l c;

        public a(l lVar) {
            this.c = lVar;
        }

        public Object emit(Object obj, m0.l.c cVar) {
            Object t = this.c.t(obj, cVar);
            if (t == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return t;
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1(MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1 r1, m0.l.c cVar) {
        super(2, cVar);
        this.q = r1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1(this.q, cVar);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1(this.q, cVar);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            d dVar = this.q.b2.q;
            a aVar = new a((l) this.c);
            this.d = 1;
            if (dVar.collect(aVar, this) == coroutineSingletons) {
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
