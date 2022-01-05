package i0.e.b.g3.l;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.b3.b.e.f;
import java.util.Map;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ f d;

    public /* synthetic */ i(ClubFragment clubFragment, f fVar) {
        this.c = clubFragment;
        this.d = fVar;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        f fVar = this.d;
        m0.n.b.i.e(clubFragment, "this$0");
        UserInClub userInClub = fVar.g;
        m0.n.b.i.e(clubFragment, "<this>");
        m0.n.b.i.e(userInClub, "user");
        SourceLocation sourceLocation = SourceLocation.CLUB;
        m0.n.b.i.e(userInClub, "<this>");
        m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(userInClub.getId(), (String) null, new BasicUser(userInClub.getId().intValue(), userInClub.getName(), userInClub.C(), userInClub.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        m0.n.b.i.e(profileArgs, "mavericksArg");
        v.a1(clubFragment, new n1(profileArgs, (String) null), (q) null, 2);
    }
}
