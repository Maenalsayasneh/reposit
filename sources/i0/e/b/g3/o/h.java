package i0.e.b.g3.o;

import android.net.Uri;
import android.view.View;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.events.EventsFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.o.e0;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ EventsFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ h(EventsFragment eventsFragment, UserInList userInList) {
        this.c = eventsFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        EventsFragment eventsFragment = this.c;
        UserInList userInList = this.d;
        i.e(eventsFragment, "this$0");
        i.e(userInList, "$user");
        ((AmplitudeAnalytics) v.l(eventsFragment)).a("Bulletin-Tapped-Host-Profile");
        i.e(eventsFragment, "<this>");
        i.e(userInList, "user");
        SourceLocation sourceLocation = SourceLocation.BULLETIN;
        i.e(userInList, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, new BasicUser(userInList.getId().intValue(), userInList.getName(), userInList.C(), userInList.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        i.e(profileArgs, "mavericksArg");
        v.a1(eventsFragment, new e0.d(profileArgs, (String) null), (q) null, 2);
    }
}
