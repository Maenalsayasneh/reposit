package com.clubhouse.android.ui.profile;

import i0.e.b.a3.b.b;
import i0.e.b.g3.u.s5;
import i0.e.b.g3.u.z3;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileFragment$onViewCreated$3", f = "HalfProfileFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$onViewCreated$3 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfProfileFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$onViewCreated$3(HalfProfileFragment halfProfileFragment, m0.l.c<? super HalfProfileFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.d = halfProfileFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfProfileFragment$onViewCreated$3 halfProfileFragment$onViewCreated$3 = new HalfProfileFragment$onViewCreated$3(this.d, cVar);
        halfProfileFragment$onViewCreated$3.c = obj;
        return halfProfileFragment$onViewCreated$3;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfProfileFragment$onViewCreated$3 halfProfileFragment$onViewCreated$3 = new HalfProfileFragment$onViewCreated$3(this.d, (m0.l.c) obj2);
        halfProfileFragment$onViewCreated$3.c = (b) obj;
        i iVar = i.a;
        halfProfileFragment$onViewCreated$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof z3) {
            this.d.U0().p(new s5(((z3) bVar).a));
        }
        return i.a;
    }
}
