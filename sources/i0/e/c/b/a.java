package i0.e.c.b;

import android.view.View;
import com.clubhouse.backchannel.archive.BackchannelArchiveFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ BackchannelArchiveFragment c;

    public /* synthetic */ a(BackchannelArchiveFragment backchannelArchiveFragment) {
        this.c = backchannelArchiveFragment;
    }

    public final void onClick(View view) {
        BackchannelArchiveFragment backchannelArchiveFragment = this.c;
        k<Object>[] kVarArr = BackchannelArchiveFragment.Z1;
        i.e(backchannelArchiveFragment, "this$0");
        h0.o.a.k activity = backchannelArchiveFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
