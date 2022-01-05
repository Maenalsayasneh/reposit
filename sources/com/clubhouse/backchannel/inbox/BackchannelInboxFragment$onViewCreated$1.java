package com.clubhouse.backchannel.inbox;

import com.airbnb.epoxy.EpoxyRecyclerView;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.d3.k;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/clubhouse/backchannel/inbox/BackchannelInboxFragment$onViewCreated$1", "Li0/b/a/o;", "Lm0/i;", "buildModels", "()V", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$onViewCreated$1 extends o {
    public final /* synthetic */ BackchannelInboxFragment this$0;

    public BackchannelInboxFragment$onViewCreated$1(BackchannelInboxFragment backchannelInboxFragment) {
        this.this$0 = backchannelInboxFragment;
    }

    public void buildModels() {
        if (k.s(this.this$0)) {
            BackchannelInboxFragment backchannelInboxFragment = this.this$0;
            m0.r.k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
            EpoxyRecyclerView epoxyRecyclerView = backchannelInboxFragment.O0().d;
            i.d(epoxyRecyclerView, "binding.inboxList");
            v.S1(this, epoxyRecyclerView);
            v.v2(this.this$0.P0(), new BackchannelInboxFragment$onViewCreated$1$buildModels$1(this.this$0, this));
        }
    }
}
