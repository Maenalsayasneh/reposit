package i0.e.b.g3.j.k0;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ ActionableNotification c;
    public final /* synthetic */ ActivityOverflowFragment d;

    public /* synthetic */ b(ActionableNotification actionableNotification, ActivityOverflowFragment activityOverflowFragment) {
        this.c = actionableNotification;
        this.d = activityOverflowFragment;
    }

    public final void onClick(View view) {
        ActionableNotification actionableNotification = this.c;
        ActivityOverflowFragment activityOverflowFragment = this.d;
        i.e(actionableNotification, "$notification");
        i.e(activityOverflowFragment, "this$0");
        BasicUser basicUser = actionableNotification.Y1;
        if (basicUser != null) {
            SourceLocation sourceLocation = SourceLocation.ACTIVITY;
            i.e(basicUser, "<this>");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            ProfileArgs profileArgs = new ProfileArgs(basicUser.getId(), (String) null, new BasicUser(basicUser.getId().intValue(), basicUser.getName(), basicUser.C(), basicUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
            i.e(profileArgs, "mavericksArg");
            v.a1(activityOverflowFragment, new e(profileArgs, (String) null), (q) null, 2);
        }
    }
}
