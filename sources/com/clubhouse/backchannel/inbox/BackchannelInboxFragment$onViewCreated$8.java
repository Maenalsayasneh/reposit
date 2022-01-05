package com.clubhouse.backchannel.inbox;

import com.clubhouse.backchannel.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.google.android.material.tabs.TabLayout;
import h0.i.b.a;
import i0.e.c.h.m;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.backchannel.inbox.BackchannelInboxFragment$onViewCreated$8", f = "BackchannelInboxFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$onViewCreated$8 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public final /* synthetic */ BackchannelInboxFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$onViewCreated$8(BackchannelInboxFragment backchannelInboxFragment, m0.l.c<? super BackchannelInboxFragment$onViewCreated$8> cVar) {
        super(2, cVar);
        this.d = backchannelInboxFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelInboxFragment$onViewCreated$8 backchannelInboxFragment$onViewCreated$8 = new BackchannelInboxFragment$onViewCreated$8(this.d, cVar);
        backchannelInboxFragment$onViewCreated$8.c = ((Boolean) obj).booleanValue();
        return backchannelInboxFragment$onViewCreated$8;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        BackchannelInboxFragment$onViewCreated$8 backchannelInboxFragment$onViewCreated$8 = new BackchannelInboxFragment$onViewCreated$8(this.d, (m0.l.c) obj2);
        backchannelInboxFragment$onViewCreated$8.c = valueOf.booleanValue();
        i iVar = i.a;
        backchannelInboxFragment$onViewCreated$8.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        boolean z = this.c;
        BackchannelInboxFragment backchannelInboxFragment = this.d;
        k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        TabLayout tabLayout = backchannelInboxFragment.O0().g;
        m0.n.b.i.d(tabLayout, "binding.tabs");
        i0.e.b.d3.k.L(tabLayout, Boolean.valueOf(z));
        this.d.O0().g.k();
        TabLayout.g i = this.d.O0().g.i();
        i.a(R.string.chats);
        TabLayout tabLayout2 = this.d.O0().g;
        tabLayout2.b(i, ChatDestination.CHATS.getIndex(), tabLayout2.q.isEmpty());
        TabLayout.g i2 = this.d.O0().g.i();
        i2.a(R.string.requests);
        BackchannelInboxFragment backchannelInboxFragment2 = this.d;
        i2.g.getOrCreateBadge().j(a.getColor(backchannelInboxFragment2.requireContext(), R.color.clubhouse_yellow));
        TabLayout tabLayout3 = backchannelInboxFragment2.O0().g;
        tabLayout3.b(i2, ChatDestination.REQUESTS.getIndex(), tabLayout3.q.isEmpty());
        TabLayout tabLayout4 = this.d.O0().g;
        m0.n.b.i.d(tabLayout4, "binding.tabs");
        final BackchannelInboxFragment backchannelInboxFragment3 = this.d;
        i0.e.b.d3.k.C(tabLayout4, new l<TabLayout.g, i>() {
            public Object invoke(Object obj) {
                TabLayout.g gVar = (TabLayout.g) obj;
                boolean z = true;
                if (gVar != null && gVar.d == ChatDestination.CHATS.getIndex()) {
                    BackchannelInboxFragment backchannelInboxFragment = backchannelInboxFragment3;
                    k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
                    backchannelInboxFragment.P0().p(new m(ChatDestination.CHATS));
                } else {
                    if (gVar == null || gVar.d != ChatDestination.REQUESTS.getIndex()) {
                        z = false;
                    }
                    if (z) {
                        BackchannelInboxFragment backchannelInboxFragment2 = backchannelInboxFragment3;
                        k<Object>[] kVarArr2 = BackchannelInboxFragment.Z1;
                        backchannelInboxFragment2.P0().p(new m(ChatDestination.REQUESTS));
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
