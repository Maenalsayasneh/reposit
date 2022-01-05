package i0.e.b.g3.l;

import android.content.DialogInterface;
import com.clubhouse.android.ui.clubs.ClubFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class w0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ w0(ClubFragment clubFragment, boolean z) {
        this.c = clubFragment;
        this.d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClubFragment clubFragment = this.c;
        boolean z = this.d;
        i.e(clubFragment, "$this_showUpdateMembershipSetting");
        clubFragment.T0().p(new o2(z));
        dialogInterface.dismiss();
    }
}
