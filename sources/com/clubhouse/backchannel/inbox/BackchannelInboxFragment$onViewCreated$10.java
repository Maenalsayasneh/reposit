package com.clubhouse.backchannel.inbox;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import i0.b.a.o;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.backchannel.inbox.BackchannelInboxFragment$onViewCreated$10", f = "BackchannelInboxFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$onViewCreated$10 extends SuspendLambda implements p<ChatDestination, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelInboxFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$onViewCreated$10(BackchannelInboxFragment backchannelInboxFragment, m0.l.c<? super BackchannelInboxFragment$onViewCreated$10> cVar) {
        super(2, cVar);
        this.d = backchannelInboxFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelInboxFragment$onViewCreated$10 backchannelInboxFragment$onViewCreated$10 = new BackchannelInboxFragment$onViewCreated$10(this.d, cVar);
        backchannelInboxFragment$onViewCreated$10.c = obj;
        return backchannelInboxFragment$onViewCreated$10;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelInboxFragment$onViewCreated$10 backchannelInboxFragment$onViewCreated$10 = new BackchannelInboxFragment$onViewCreated$10(this.d, (m0.l.c) obj2);
        backchannelInboxFragment$onViewCreated$10.c = (ChatDestination) obj;
        i iVar = i.a;
        backchannelInboxFragment$onViewCreated$10.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        int ordinal = ((ChatDestination) this.c).ordinal();
        if (ordinal == 0) {
            BackchannelInboxFragment backchannelInboxFragment = this.d;
            k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
            EpoxyRecyclerView epoxyRecyclerView = backchannelInboxFragment.O0().d;
            o oVar = this.d.c2;
            if (oVar != null) {
                epoxyRecyclerView.setController(oVar);
            } else {
                m0.n.b.i.m("chatsController");
                throw null;
            }
        } else if (ordinal == 1) {
            BackchannelInboxFragment backchannelInboxFragment2 = this.d;
            k<Object>[] kVarArr2 = BackchannelInboxFragment.Z1;
            EpoxyRecyclerView epoxyRecyclerView2 = backchannelInboxFragment2.O0().d;
            o oVar2 = this.d.d2;
            if (oVar2 != null) {
                epoxyRecyclerView2.setController(oVar2);
            } else {
                m0.n.b.i.m("requestsController");
                throw null;
            }
        }
        return i.a;
    }
}
