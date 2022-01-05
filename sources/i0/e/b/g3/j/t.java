package i0.e.b.g3.j;

import android.view.View;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.ui.activity.ActivityFragment;
import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ ActivityFragment c;
    public final /* synthetic */ ActionableNotification d;

    public /* synthetic */ t(ActivityFragment activityFragment, ActionableNotification actionableNotification) {
        this.c = activityFragment;
        this.d = actionableNotification;
    }

    public final void onClick(View view) {
        ActivityFragment activityFragment = this.c;
        ActionableNotification actionableNotification = this.d;
        i.e(activityFragment, "this$0");
        i.e(actionableNotification, "$notification");
        k<Object>[] kVarArr = ActivityFragment.Z1;
        a.l(actionableNotification, activityFragment.O0());
    }
}
