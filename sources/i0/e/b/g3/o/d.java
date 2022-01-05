package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.events.EventsFragment;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.o.e0;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ d(EventsFragment eventsFragment, EventInClub eventInClub) {
        this.c = eventsFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        EventInClub eventInClub = this.d;
        i.e(eventsFragment, "this$0");
        i.e(eventInClub, "$event");
        SourceLocation sourceLocation = SourceLocation.BULLETIN;
        i.e(eventsFragment, "<this>");
        i.e(eventInClub, "event");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ClubWithAdmin clubWithAdmin = eventInClub.c;
        i.c(clubWithAdmin);
        ClubArgs clubArgs = new ClubArgs(Integer.valueOf(clubWithAdmin.x), (String) null, (String) null, false, false, sourceLocation, (Map) null, 94);
        i.e(clubArgs, "mavericksArg");
        v.a1(eventsFragment, new e0.b(clubArgs), (q) null, 2);
    }
}
