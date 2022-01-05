package i0.e.b.g3.l.a3;

import android.view.View;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment$showApproveAllConfirmation$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ ClubNominationsFragment c;

    public /* synthetic */ e(ClubNominationsFragment clubNominationsFragment) {
        this.c = clubNominationsFragment;
    }

    public final void onClick(View view) {
        ClubNominationsFragment clubNominationsFragment = this.c;
        k<Object>[] kVarArr = ClubNominationsFragment.Z1;
        i.e(clubNominationsFragment, "this$0");
        ClubNominationsFragment$showApproveAllConfirmation$1 clubNominationsFragment$showApproveAllConfirmation$1 = new ClubNominationsFragment$showApproveAllConfirmation$1(clubNominationsFragment);
        i.e(clubNominationsFragment, "<this>");
        i.e(clubNominationsFragment$showApproveAllConfirmation$1, "f");
        d.a aVar = new d.a(clubNominationsFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        clubNominationsFragment$showApproveAllConfirmation$1.invoke(aVar);
        aVar.g();
    }
}
