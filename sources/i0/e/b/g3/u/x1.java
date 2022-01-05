package i0.e.b.g3.u;

import android.content.DialogInterface;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import i0.e.b.z2.g.e;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class x1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ q4 d;
    public final /* synthetic */ boolean q;

    public /* synthetic */ x1(HalfProfileFragment halfProfileFragment, q4 q4Var, boolean z) {
        this.c = halfProfileFragment;
        this.d = q4Var;
        this.q = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HalfProfileFragment halfProfileFragment = this.c;
        q4 q4Var = this.d;
        boolean z = this.q;
        i.e(halfProfileFragment, "$this_showRemoveConfirmationDialog");
        i.e(q4Var, "$state");
        ChannelViewModel channelViewModel = halfProfileFragment.j2;
        if (channelViewModel != null) {
            channelViewModel.p(new e(q4Var.a, z));
        }
        dialogInterface.dismiss();
    }
}
