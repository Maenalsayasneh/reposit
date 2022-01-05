package com.clubhouse.backchannel.chat;

import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$onViewCreated$2 extends Lambda implements l<o, i> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$onViewCreated$2(BackchannelChatFragment backchannelChatFragment) {
        super(1);
        this.c = backchannelChatFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeBuildModelsWith");
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = backchannelChatFragment.O0().e;
        m0.n.b.i.d(impressionTrackingEpoxyRecyclerView, "binding.chatList");
        v.T1(oVar, impressionTrackingEpoxyRecyclerView);
        BackchannelChatFragment backchannelChatFragment2 = this.c;
        v.v2(backchannelChatFragment2.P0(), new BackchannelChatFragment$buildModels$1(backchannelChatFragment2, oVar));
        return i.a;
    }
}
