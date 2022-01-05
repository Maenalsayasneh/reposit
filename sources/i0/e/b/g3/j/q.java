package i0.e.b.g3.j;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.clubs.ClubArgs;
import h0.b0.v;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ ActivityFragment c;
    public final /* synthetic */ ClubWithAdmin d;
    public final /* synthetic */ ActionableNotification q;

    public /* synthetic */ q(ActivityFragment activityFragment, ClubWithAdmin clubWithAdmin, ActionableNotification actionableNotification) {
        this.c = activityFragment;
        this.d = clubWithAdmin;
        this.q = actionableNotification;
    }

    public final void onClick(View view) {
        ActivityFragment activityFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        ActionableNotification actionableNotification = this.q;
        i.e(activityFragment, "this$0");
        i.e(actionableNotification, "$notification");
        int i = clubWithAdmin.x;
        i.e(activityFragment, "<this>");
        ClubArgs clubArgs = new ClubArgs(Integer.valueOf(i), (String) null, (String) null, false, true, SourceLocation.CLUB, (Map) null, 78);
        i.e(clubArgs, "mavericksArg");
        v.a1(activityFragment, new v(clubArgs), (h0.t.q) null, 2);
        k<Object>[] kVarArr = ActivityFragment.Z1;
        a.l(actionableNotification, activityFragment.O0());
    }
}
