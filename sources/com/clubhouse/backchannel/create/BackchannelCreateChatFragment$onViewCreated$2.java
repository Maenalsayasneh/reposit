package com.clubhouse.backchannel.create;

import com.airbnb.epoxy.EpoxyRecyclerView;
import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$onViewCreated$2 extends Lambda implements l<o, i> {
    public final /* synthetic */ BackchannelCreateChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$onViewCreated$2(BackchannelCreateChatFragment backchannelCreateChatFragment) {
        super(1);
        this.c = backchannelCreateChatFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeBuildModelsWith");
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        EpoxyRecyclerView epoxyRecyclerView = backchannelCreateChatFragment.N0().f;
        m0.n.b.i.d(epoxyRecyclerView, "binding.results");
        v.T1(oVar, epoxyRecyclerView);
        BackchannelCreateChatFragment backchannelCreateChatFragment2 = this.c;
        v.v2(backchannelCreateChatFragment2.O0(), new BackchannelCreateChatFragment$buildModels$1(oVar, backchannelCreateChatFragment2));
        return i.a;
    }
}
