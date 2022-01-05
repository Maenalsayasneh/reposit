package com.clubhouse.android.core.ui;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder$onVisibilityStateChanged$1", f = "BaseEpoxyModelWithHolder.kt", l = {29}, m = "invokeSuspend")
/* compiled from: BaseEpoxyModelWithHolder.kt */
public final class BaseEpoxyModelWithHolder$onVisibilityStateChanged$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BaseEpoxyModelWithHolder<T> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseEpoxyModelWithHolder$onVisibilityStateChanged$1(BaseEpoxyModelWithHolder<T> baseEpoxyModelWithHolder, m0.l.c<? super BaseEpoxyModelWithHolder$onVisibilityStateChanged$1> cVar) {
        super(2, cVar);
        this.d = baseEpoxyModelWithHolder;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new BaseEpoxyModelWithHolder$onVisibilityStateChanged$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new BaseEpoxyModelWithHolder$onVisibilityStateChanged$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            this.c = 1;
            if (a.d1(250, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m0.n.a.a<i> aVar = this.d.i;
        if (aVar != null) {
            aVar.invoke();
        }
        return i.a;
    }
}
