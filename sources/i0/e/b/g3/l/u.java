package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import h0.b0.v;
import h0.t.q;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ GetClubResponse d;

    public /* synthetic */ u(ClubFragment clubFragment, GetClubResponse getClubResponse) {
        this.c = clubFragment;
        this.d = getClubResponse;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        GetClubResponse getClubResponse = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(getClubResponse, "$clubInfo");
        i.e(clubFragment, "<this>");
        EventInClub eventInClub = r4;
        EventInClub eventInClub2 = new EventInClub(ClubWithAdmin.d(getClubResponse.c, getClubResponse.d, false, false, 0, (String) null, (String) null, (String) null, (List) null, 0, 0, (String) null, false, false, false, false, false, (Map) null, (String) null, 262142), false, false, (Boolean) null, (String) null, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, (Map) null, (String) null, 65534);
        AddEditEventArgs addEditEventArgs = new AddEditEventArgs(eventInClub);
        i.e(addEditEventArgs, "mavericksArg");
        v.a1(clubFragment, new e1(addEditEventArgs), (q) null, 2);
    }
}
