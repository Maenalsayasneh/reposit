package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.ui.clubs.ClubFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ GetClubResponse d;

    public /* synthetic */ e0(ClubFragment clubFragment, GetClubResponse getClubResponse) {
        this.c = clubFragment;
        this.d = getClubResponse;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        GetClubResponse getClubResponse = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(getClubResponse, "$clubInfo");
        clubFragment.U0(getClubResponse, "");
    }
}
