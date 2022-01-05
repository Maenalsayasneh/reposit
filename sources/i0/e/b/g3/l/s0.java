package i0.e.b.g3.l;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.b3.b.e.f;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ ClubMemberSearchFragment c;
    public final /* synthetic */ f d;

    public /* synthetic */ s0(ClubMemberSearchFragment clubMemberSearchFragment, f fVar) {
        this.c = clubMemberSearchFragment;
        this.d = fVar;
    }

    public final void onClick(View view) {
        ClubMemberSearchFragment clubMemberSearchFragment = this.c;
        f fVar = this.d;
        i.e(clubMemberSearchFragment, "this$0");
        UserInClub userInClub = fVar.g;
        i.e(userInClub, "user");
        SourceLocation sourceLocation = SourceLocation.CLUB;
        i.e(userInClub, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(userInClub.getId(), (String) null, new BasicUser(userInClub.getId().intValue(), userInClub.getName(), userInClub.C(), userInClub.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        i.e(profileArgs, "mavericksArg");
        v.a1(clubMemberSearchFragment, new q1(profileArgs, (String) null), (q) null, 2);
    }
}
