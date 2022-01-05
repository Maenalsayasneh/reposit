package i0.e.b.g3.u;

import android.content.DialogInterface;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import i0.e.b.z2.g.e;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ q4 d;

    public /* synthetic */ a2(HalfProfileFragment halfProfileFragment, q4 q4Var) {
        this.c = halfProfileFragment;
        this.d = q4Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HalfProfileFragment halfProfileFragment = this.c;
        q4 q4Var = this.d;
        i.e(halfProfileFragment, "$this_showReportConfirmationDialog");
        i.e(q4Var, "$state");
        ChannelViewModel channelViewModel = halfProfileFragment.j2;
        if (channelViewModel != null) {
            channelViewModel.p(new e(q4Var.a, false));
        }
        dialogInterface.dismiss();
    }
}
