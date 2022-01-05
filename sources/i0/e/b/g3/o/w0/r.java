package i0.e.b.g3.o.w0;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.events.creation.EventHostClubFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ EventHostClubFragment c;

    public /* synthetic */ r(EventHostClubFragment eventHostClubFragment) {
        this.c = eventHostClubFragment;
    }

    public final void onClick(View view) {
        EventHostClubFragment eventHostClubFragment = this.c;
        i.e(eventHostClubFragment, "this$0");
        k<Object>[] kVarArr = EventHostClubFragment.p2;
        eventHostClubFragment.V0().p(new h0((ClubWithAdmin) null, 1));
    }
}
