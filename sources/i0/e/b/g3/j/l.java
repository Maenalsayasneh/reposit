package i0.e.b.g3.j;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ BasicUser c;
    public final /* synthetic */ ActivityFragment d;

    public /* synthetic */ l(BasicUser basicUser, ActivityFragment activityFragment) {
        this.c = basicUser;
        this.d = activityFragment;
    }

    public final void onClick(View view) {
        BasicUser basicUser = this.c;
        ActivityFragment activityFragment = this.d;
        i.e(activityFragment, "this$0");
        if (basicUser != null) {
            SourceLocation sourceLocation = SourceLocation.ACTIONABLE_NOTIFICATION;
            i.e(activityFragment, "<this>");
            i.e(basicUser, "user");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            i.e(basicUser, "<this>");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            ProfileArgs profileArgs = new ProfileArgs(basicUser.getId(), (String) null, new BasicUser(basicUser.getId().intValue(), basicUser.getName(), basicUser.C(), basicUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
            i.e(profileArgs, "mavericksArg");
            v.a1(activityFragment, new b0(profileArgs, (String) null), (q) null, 2);
        }
    }
}
