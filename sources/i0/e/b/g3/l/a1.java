package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.clubs.HalfWelcomeNewClubArgs;
import com.clubhouse.android.ui.clubs.HalfWelcomeNewClubFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import h0.b0.v;
import h0.t.q;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a1 implements View.OnClickListener {
    public final /* synthetic */ HalfWelcomeNewClubFragment c;

    public /* synthetic */ a1(HalfWelcomeNewClubFragment halfWelcomeNewClubFragment) {
        this.c = halfWelcomeNewClubFragment;
    }

    public final void onClick(View view) {
        HalfWelcomeNewClubFragment halfWelcomeNewClubFragment = this.c;
        k<Object>[] kVarArr = HalfWelcomeNewClubFragment.p2;
        i.e(halfWelcomeNewClubFragment, "this$0");
        EventInClub eventInClub = r3;
        EventInClub eventInClub2 = new EventInClub(((HalfWelcomeNewClubArgs) halfWelcomeNewClubFragment.r2.getValue(halfWelcomeNewClubFragment, HalfWelcomeNewClubFragment.p2[1])).c, false, false, (Boolean) null, (String) null, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, (Map) null, (String) null, 65534);
        AddEditEventArgs addEditEventArgs = new AddEditEventArgs(eventInClub);
        i.e(addEditEventArgs, "mavericksArg");
        v.a1(halfWelcomeNewClubFragment, new b2(addEditEventArgs), (q) null, 2);
        ((AmplitudeAnalytics) v.l(halfWelcomeNewClubFragment)).a("CreateClub-TappedScheduleFirstEvent");
    }
}
