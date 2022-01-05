package i0.e.b.g3.j;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.activity.ActivityFragment$buildActionableNotifications$1$1$1$1$1;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.android.ui.clubs.HalfClubRulesFragment;
import h0.b0.v;
import h0.t.q;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ActivityFragment d;
    public final /* synthetic */ ActionableNotification q;

    public /* synthetic */ f(ClubWithAdmin clubWithAdmin, ActivityFragment activityFragment, ActionableNotification actionableNotification) {
        this.c = clubWithAdmin;
        this.d = activityFragment;
        this.q = actionableNotification;
    }

    public final void onClick(View view) {
        ClubWithAdmin clubWithAdmin = this.c;
        ActivityFragment activityFragment = this.d;
        ActionableNotification actionableNotification = this.q;
        i.e(activityFragment, "this$0");
        i.e(actionableNotification, "$notification");
        if (clubWithAdmin != null) {
            List<ClubRule> list = clubWithAdmin.a2;
            if (list == null || list.isEmpty()) {
                k<Object>[] kVarArr = ActivityFragment.Z1;
                activityFragment.O0().p(new g0(clubWithAdmin.x, actionableNotification));
                return;
            }
            Objects.requireNonNull(HalfClubRulesFragment.p2);
            v.p0(activityFragment, HalfClubRulesFragment.r2, new ActivityFragment$buildActionableNotifications$1$1$1$1$1(activityFragment, actionableNotification));
            Boolean bool = Boolean.TRUE;
            i.e(activityFragment, "<this>");
            i.e(clubWithAdmin, "club");
            HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(clubWithAdmin, bool, (String) null, SourceLocation.ACTIVITY, (Map) null, 20);
            i.e(halfClubRulesArgs, "mavericksArg");
            v.a1(activityFragment, new y(halfClubRulesArgs), (q) null, 2);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
