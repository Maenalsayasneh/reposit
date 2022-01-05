package com.airbnb.mvrx;

import i0.b.b.o;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;

@c(c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$2", f = "MavericksViewModelExtensions.kt", l = {41}, m = "invokeSuspend")
/* compiled from: MavericksViewModelExtensions.kt */
public final class MavericksViewModelExtensionsKt$_internal2$2 extends SuspendLambda implements p<o<A, B>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ q q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModelExtensionsKt$_internal2$2(q qVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = qVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModelExtensionsKt$_internal2$2 mavericksViewModelExtensionsKt$_internal2$2 = new MavericksViewModelExtensionsKt$_internal2$2(this.q, cVar);
        mavericksViewModelExtensionsKt$_internal2$2.c = obj;
        return mavericksViewModelExtensionsKt$_internal2$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModelExtensionsKt$_internal2$2 mavericksViewModelExtensionsKt$_internal2$2 = new MavericksViewModelExtensionsKt$_internal2$2(this.q, cVar);
        mavericksViewModelExtensionsKt$_internal2$2.c = obj;
        return mavericksViewModelExtensionsKt$_internal2$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            o oVar = (o) this.c;
            A a = oVar.a;
            B b = oVar.b;
            q qVar = this.q;
            this.d = 1;
            if (qVar.invoke(a, b, this) == coroutineSingletons) {
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
