package com.clubhouse.backchannel.members;

import com.airbnb.epoxy.EpoxyRecyclerView;
import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelAddMemberFragment.kt */
public final class BackchannelAddMemberFragment$onViewCreated$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ BackchannelAddMemberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelAddMemberFragment$onViewCreated$1(BackchannelAddMemberFragment backchannelAddMemberFragment) {
        super(1);
        this.c = backchannelAddMemberFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeBuildModelsWith");
        BackchannelAddMemberFragment backchannelAddMemberFragment = this.c;
        k<Object>[] kVarArr = BackchannelAddMemberFragment.p2;
        EpoxyRecyclerView epoxyRecyclerView = backchannelAddMemberFragment.U0().c;
        m0.n.b.i.d(epoxyRecyclerView, "binding.results");
        v.T1(oVar, epoxyRecyclerView);
        BackchannelAddMemberFragment backchannelAddMemberFragment2 = this.c;
        v.v2(backchannelAddMemberFragment2.V0(), new BackchannelAddMemberFragment$buildModels$1(oVar, backchannelAddMemberFragment2));
        return i.a;
    }
}
