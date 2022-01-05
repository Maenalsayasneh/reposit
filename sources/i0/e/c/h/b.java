package i0.e.c.h;

import android.view.View;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ BackchannelInboxFragment c;

    public /* synthetic */ b(BackchannelInboxFragment backchannelInboxFragment) {
        this.c = backchannelInboxFragment;
    }

    public final void onClick(View view) {
        BackchannelInboxFragment backchannelInboxFragment = this.c;
        k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        i.e(backchannelInboxFragment, "this$0");
        h0.o.a.k activity = backchannelInboxFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
