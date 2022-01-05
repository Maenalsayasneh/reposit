package i0.e.b.g3.l.a3;

import android.content.DialogInterface;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ ClubNominationsFragment c;

    public /* synthetic */ h(ClubNominationsFragment clubNominationsFragment) {
        this.c = clubNominationsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClubNominationsFragment clubNominationsFragment = this.c;
        i.e(clubNominationsFragment, "this$0");
        k<Object>[] kVarArr = ClubNominationsFragment.Z1;
        clubNominationsFragment.O0().p(m.a);
        dialogInterface.dismiss();
    }
}
