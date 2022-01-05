package com.airbnb.mvrx;

import i0.b.b.b;
import i0.b.b.f0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internalSF$1", f = "MavericksViewModelExtensions.kt", l = {138, 140}, m = "invokeSuspend")
/* compiled from: MavericksViewModelExtensions.kt */
public final class MavericksViewModelExtensionsKt$_internalSF$1 extends SuspendLambda implements p<b<? extends T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ p q;
    public final /* synthetic */ p x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModelExtensionsKt$_internalSF$1(p pVar, p pVar2, m0.l.c cVar) {
        super(2, cVar);
        this.q = pVar;
        this.x = pVar2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModelExtensionsKt$_internalSF$1 mavericksViewModelExtensionsKt$_internalSF$1 = new MavericksViewModelExtensionsKt$_internalSF$1(this.q, this.x, cVar);
        mavericksViewModelExtensionsKt$_internalSF$1.c = obj;
        return mavericksViewModelExtensionsKt$_internalSF$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModelExtensionsKt$_internalSF$1 mavericksViewModelExtensionsKt$_internalSF$1 = new MavericksViewModelExtensionsKt$_internalSF$1(this.q, this.x, cVar);
        mavericksViewModelExtensionsKt$_internalSF$1.c = obj;
        return mavericksViewModelExtensionsKt$_internalSF$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            b bVar = (b) this.c;
            p pVar = this.q;
            if (pVar == null || !(bVar instanceof f0)) {
                p pVar2 = this.x;
                if (pVar2 != null && (bVar instanceof i0.b.b.c)) {
                    Throwable th = ((i0.b.b.c) bVar).b;
                    this.d = 2;
                    if (pVar2.invoke(th, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                T t = ((f0) bVar).b;
                this.d = 1;
                if (pVar.invoke(t, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
