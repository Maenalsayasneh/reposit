package i0.e.b.g3.o.w0;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.events.creation.EventHostClubFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ EventHostClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ q(EventHostClubFragment eventHostClubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = eventHostClubFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        EventHostClubFragment eventHostClubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        i.e(eventHostClubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        k<Object>[] kVarArr = EventHostClubFragment.p2;
        eventHostClubFragment.V0().p(new h0(clubWithAdmin));
    }
}
