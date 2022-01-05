package i0.e.b.g3.l.a3;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubNominationUser;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ ClubNominationsFragment c;
    public final /* synthetic */ ClubNominationUser d;

    public /* synthetic */ d(ClubNominationsFragment clubNominationsFragment, ClubNominationUser clubNominationUser) {
        this.c = clubNominationsFragment;
        this.d = clubNominationUser;
    }

    public final void onClick(View view) {
        ClubNominationsFragment clubNominationsFragment = this.c;
        ClubNominationUser clubNominationUser = this.d;
        i.e(clubNominationsFragment, "this$0");
        i.e(clubNominationUser, "$it");
        k<Object>[] kVarArr = ClubNominationsFragment.Z1;
        clubNominationsFragment.O0().p(new u(clubNominationUser.getId().intValue(), clubNominationUser.y));
    }
}
