package i0.e.b.g3.l.a3;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubNominationUser;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ ClubNominationsFragment c;
    public final /* synthetic */ ClubNominationUser d;

    public /* synthetic */ c(ClubNominationsFragment clubNominationsFragment, ClubNominationUser clubNominationUser) {
        this.c = clubNominationsFragment;
        this.d = clubNominationUser;
    }

    public final void onClick(View view) {
        ClubNominationsFragment clubNominationsFragment = this.c;
        ClubNominationUser clubNominationUser = this.d;
        i.e(clubNominationsFragment, "this$0");
        i.e(clubNominationUser, "$it");
        SourceLocation sourceLocation = SourceLocation.CLUB;
        i.e(clubNominationUser, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(clubNominationUser.getId(), (String) null, new BasicUser(clubNominationUser.getId().intValue(), clubNominationUser.getName(), clubNominationUser.C(), clubNominationUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        i.e(profileArgs, "mavericksArg");
        v.a1(clubNominationsFragment, new o(profileArgs, (String) null), (q) null, 2);
    }
}
