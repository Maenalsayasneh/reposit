package i0.e.b.g3.j;

import android.view.View;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.activity.ActivityViewModel;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ ActivityFragment c;
    public final /* synthetic */ BasicUser d;
    public final /* synthetic */ ActionableNotification q;

    public /* synthetic */ s(ActivityFragment activityFragment, BasicUser basicUser, ActionableNotification actionableNotification) {
        this.c = activityFragment;
        this.d = basicUser;
        this.q = actionableNotification;
    }

    public final void onClick(View view) {
        ActivityFragment activityFragment = this.c;
        BasicUser basicUser = this.d;
        ActionableNotification actionableNotification = this.q;
        i.e(activityFragment, "this$0");
        i.e(actionableNotification, "$notification");
        k<Object>[] kVarArr = ActivityFragment.Z1;
        ActivityViewModel O0 = activityFragment.O0();
        Integer id = basicUser == null ? null : basicUser.getId();
        if (id != null) {
            O0.p(new e0(id.intValue(), actionableNotification));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
