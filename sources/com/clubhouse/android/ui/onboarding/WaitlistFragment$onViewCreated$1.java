package com.clubhouse.android.ui.onboarding;

import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.g3.r.p1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.WaitlistFragment$onViewCreated$1", f = "WaitlistFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: WaitlistFragment.kt */
public final class WaitlistFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ WaitlistFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitlistFragment$onViewCreated$1(WaitlistFragment waitlistFragment, m0.l.c<? super WaitlistFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = waitlistFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        WaitlistFragment$onViewCreated$1 waitlistFragment$onViewCreated$1 = new WaitlistFragment$onViewCreated$1(this.d, cVar);
        waitlistFragment$onViewCreated$1.c = obj;
        return waitlistFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        WaitlistFragment$onViewCreated$1 waitlistFragment$onViewCreated$1 = new WaitlistFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        waitlistFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        waitlistFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof p1) {
            v.a1(this.d, ((p1) bVar).a, (q) null, 2);
        }
        return i.a;
    }
}
