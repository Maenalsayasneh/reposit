package i0.e.b.g3.l;

import android.content.Context;
import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForStranger$2$1$1;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForStranger$2$1$2;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForStranger$2$1$3;
import com.clubhouse.app.R;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ GetClubResponse c;
    public final /* synthetic */ ClubFragment d;
    public final /* synthetic */ ClubWithAdmin q;

    public /* synthetic */ b(GetClubResponse getClubResponse, ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = getClubResponse;
        this.d = clubFragment;
        this.q = clubWithAdmin;
    }

    public final void onClick(View view) {
        GetClubResponse getClubResponse = this.c;
        ClubFragment clubFragment = this.d;
        ClubWithAdmin clubWithAdmin = this.q;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(getClubResponse, "$clubInfo");
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        if (getClubResponse.Y1) {
            v.e(clubFragment, new ClubFragment$buildHeaderModelForStranger$2$1$1(clubFragment, clubWithAdmin));
            return;
        }
        Context requireContext = clubFragment.requireContext();
        i.d(requireContext, "requireContext()");
        String string = clubFragment.getString(R.string.you);
        i.d(string, "getString(R.string.you)");
        v.g2(clubFragment, requireContext, string, clubWithAdmin.y, new ClubFragment$buildHeaderModelForStranger$2$1$2(clubFragment, getClubResponse), new ClubFragment$buildHeaderModelForStranger$2$1$3(clubFragment, getClubResponse));
    }
}
