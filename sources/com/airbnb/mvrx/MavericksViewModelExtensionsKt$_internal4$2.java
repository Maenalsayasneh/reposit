package com.airbnb.mvrx;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.s;

@c(c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal4$2", f = "MavericksViewModelExtensions.kt", l = {72}, m = "invokeSuspend")
/* compiled from: MavericksViewModelExtensions.kt */
public final class MavericksViewModelExtensionsKt$_internal4$2 extends SuspendLambda implements p<i0.b.b.p<A, B, C, D>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ s q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModelExtensionsKt$_internal4$2(s sVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = sVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModelExtensionsKt$_internal4$2 mavericksViewModelExtensionsKt$_internal4$2 = new MavericksViewModelExtensionsKt$_internal4$2(this.q, cVar);
        mavericksViewModelExtensionsKt$_internal4$2.c = obj;
        return mavericksViewModelExtensionsKt$_internal4$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModelExtensionsKt$_internal4$2 mavericksViewModelExtensionsKt$_internal4$2 = new MavericksViewModelExtensionsKt$_internal4$2(this.q, cVar);
        mavericksViewModelExtensionsKt$_internal4$2.c = obj;
        return mavericksViewModelExtensionsKt$_internal4$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            i0.b.b.p pVar = (i0.b.b.p) this.c;
            A a = pVar.a;
            B b = pVar.b;
            C c2 = pVar.c;
            D d2 = pVar.d;
            s sVar = this.q;
            this.d = 1;
            if (sVar.l(a, b, c2, d2, this) == coroutineSingletons) {
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
