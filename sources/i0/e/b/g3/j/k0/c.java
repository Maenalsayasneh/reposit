package i0.e.b.g3.j.k0;

import android.view.View;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ ActivityOverflowFragment c;
    public final /* synthetic */ ActionableNotification d;

    public /* synthetic */ c(ActivityOverflowFragment activityOverflowFragment, ActionableNotification actionableNotification) {
        this.c = activityOverflowFragment;
        this.d = actionableNotification;
    }

    public final void onClick(View view) {
        ActivityOverflowFragment activityOverflowFragment = this.c;
        ActionableNotification actionableNotification = this.d;
        i.e(activityOverflowFragment, "this$0");
        i.e(actionableNotification, "$notification");
        k<Object>[] kVarArr = ActivityOverflowFragment.Z1;
        activityOverflowFragment.O0().p(new i(actionableNotification));
    }
}
