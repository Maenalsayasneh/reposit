package com.clubhouse.backchannel.members;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.backchannel.members.BackchannelAddMemberFragment$onViewCreated$3", f = "BackchannelAddMemberFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelAddMemberFragment.kt */
public final class BackchannelAddMemberFragment$onViewCreated$3 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelAddMemberFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelAddMemberFragment$onViewCreated$3(BackchannelAddMemberFragment backchannelAddMemberFragment, m0.l.c<? super BackchannelAddMemberFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.d = backchannelAddMemberFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelAddMemberFragment$onViewCreated$3 backchannelAddMemberFragment$onViewCreated$3 = new BackchannelAddMemberFragment$onViewCreated$3(this.d, cVar);
        backchannelAddMemberFragment$onViewCreated$3.c = obj;
        return backchannelAddMemberFragment$onViewCreated$3;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelAddMemberFragment$onViewCreated$3 backchannelAddMemberFragment$onViewCreated$3 = new BackchannelAddMemberFragment$onViewCreated$3(this.d, (m0.l.c) obj2);
        backchannelAddMemberFragment$onViewCreated$3.c = (String) obj;
        i iVar = i.a;
        backchannelAddMemberFragment$onViewCreated$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        BackchannelAddMemberFragment backchannelAddMemberFragment = this.d;
        k<Object>[] kVarArr = BackchannelAddMemberFragment.p2;
        backchannelAddMemberFragment.V0().p(new b((String) this.c));
        return i.a;
    }
}
