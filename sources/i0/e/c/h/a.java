package i0.e.c.h;

import android.view.View;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$showSettings$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ BackchannelInboxFragment c;

    public /* synthetic */ a(BackchannelInboxFragment backchannelInboxFragment) {
        this.c = backchannelInboxFragment;
    }

    public final void onClick(View view) {
        BackchannelInboxFragment backchannelInboxFragment = this.c;
        k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        i.e(backchannelInboxFragment, "this$0");
        v.v2(backchannelInboxFragment.P0(), new BackchannelInboxFragment$showSettings$1(backchannelInboxFragment));
    }
}
