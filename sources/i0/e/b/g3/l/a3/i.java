package i0.e.b.g3.l.a3;

import android.content.DialogInterface;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment;
import i0.e.b.g3.l.o2;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {
    public final /* synthetic */ ClubNominationsFragment c;

    public /* synthetic */ i(ClubNominationsFragment clubNominationsFragment) {
        this.c = clubNominationsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClubNominationsFragment clubNominationsFragment = this.c;
        m0.n.b.i.e(clubNominationsFragment, "this$0");
        k<Object>[] kVarArr = ClubNominationsFragment.Z1;
        clubNominationsFragment.O0().p(new o2(true));
        dialogInterface.dismiss();
    }
}
