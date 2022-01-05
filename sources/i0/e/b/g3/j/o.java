package i0.e.b.g3.j;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubMethod;
import com.clubhouse.android.ui.clubs.invites.GrowClubSource;
import h0.b0.v;
import h0.t.q;
import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ActivityFragment d;
    public final /* synthetic */ ActionableNotification q;

    public /* synthetic */ o(ClubWithAdmin clubWithAdmin, ActivityFragment activityFragment, ActionableNotification actionableNotification) {
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
            int i = clubWithAdmin.x;
            i.e(activityFragment, "<this>");
            GrowClubArgs growClubArgs = new GrowClubArgs(i, GrowClubMethod.NOMINATION, GrowClubSource.CLUB);
            i.e(growClubArgs, "mavericksArg");
            v.a1(activityFragment, new w(growClubArgs), (q) null, 2);
            k<Object>[] kVarArr = ActivityFragment.Z1;
            a.l(actionableNotification, activityFragment.O0());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
