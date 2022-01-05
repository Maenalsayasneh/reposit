package com.clubhouse.android.ui.profile;

import i0.e.b.a3.b.b;
import i0.e.b.g3.u.y3;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileContainerFragment$onViewCreated$1", f = "HalfProfileContainerFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfProfileContainerFragment.kt */
public final class HalfProfileContainerFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfProfileContainerFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileContainerFragment$onViewCreated$1(HalfProfileContainerFragment halfProfileContainerFragment, m0.l.c<? super HalfProfileContainerFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = halfProfileContainerFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfProfileContainerFragment$onViewCreated$1 halfProfileContainerFragment$onViewCreated$1 = new HalfProfileContainerFragment$onViewCreated$1(this.d, cVar);
        halfProfileContainerFragment$onViewCreated$1.c = obj;
        return halfProfileContainerFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfProfileContainerFragment$onViewCreated$1 halfProfileContainerFragment$onViewCreated$1 = new HalfProfileContainerFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        halfProfileContainerFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        halfProfileContainerFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (m0.n.b.i.a((b) this.c, y3.a)) {
            this.d.dismiss();
        }
        return i.a;
    }
}
