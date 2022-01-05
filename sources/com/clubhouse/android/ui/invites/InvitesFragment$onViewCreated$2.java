package com.clubhouse.android.ui.invites;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.invites.InvitesFragment$onViewCreated$2", f = "InvitesFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: InvitesFragment.kt */
public final class InvitesFragment$onViewCreated$2 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ InvitesFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesFragment$onViewCreated$2(InvitesFragment invitesFragment, m0.l.c<? super InvitesFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = invitesFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        InvitesFragment$onViewCreated$2 invitesFragment$onViewCreated$2 = new InvitesFragment$onViewCreated$2(this.d, cVar);
        invitesFragment$onViewCreated$2.c = obj;
        return invitesFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        InvitesFragment$onViewCreated$2 invitesFragment$onViewCreated$2 = new InvitesFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        invitesFragment$onViewCreated$2.c = (String) obj;
        i iVar = i.a;
        invitesFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        InvitesFragment invitesFragment = this.d;
        k<Object>[] kVarArr = InvitesFragment.Z1;
        invitesFragment.O0().p(new b((String) this.c));
        return i.a;
    }
}
