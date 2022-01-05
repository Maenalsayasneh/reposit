package i0.e.b.g3.l.x2;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.b3.b.e.m;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ GrowClubFragment c;
    public final /* synthetic */ m d;

    public /* synthetic */ e(GrowClubFragment growClubFragment, m mVar) {
        this.c = growClubFragment;
        this.d = mVar;
    }

    public final void onClick(View view) {
        GrowClubFragment growClubFragment = this.c;
        m mVar = this.d;
        i.e(growClubFragment, "this$0");
        i.e(mVar, "$item");
        UserInList userInList = mVar.g;
        SourceLocation sourceLocation = SourceLocation.CLUB;
        i.e(userInList, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, new BasicUser(userInList.getId().intValue(), userInList.getName(), userInList.C(), userInList.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        i.e(profileArgs, "mavericksArg");
        v.a1(growClubFragment, new r(profileArgs, (String) null), (q) null, 2);
    }
}
