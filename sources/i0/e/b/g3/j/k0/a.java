package i0.e.b.g3.j.k0;

import android.view.View;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowFragment;
import com.clubhouse.android.ui.activity.overflow.ActivityOverflowViewModel;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ActivityOverflowFragment c;
    public final /* synthetic */ BasicUser d;
    public final /* synthetic */ ActionableNotification q;

    public /* synthetic */ a(ActivityOverflowFragment activityOverflowFragment, BasicUser basicUser, ActionableNotification actionableNotification) {
        this.c = activityOverflowFragment;
        this.d = basicUser;
        this.q = actionableNotification;
    }

    public final void onClick(View view) {
        ActivityOverflowFragment activityOverflowFragment = this.c;
        BasicUser basicUser = this.d;
        ActionableNotification actionableNotification = this.q;
        i.e(activityOverflowFragment, "this$0");
        i.e(actionableNotification, "$notification");
        k<Object>[] kVarArr = ActivityOverflowFragment.Z1;
        ActivityOverflowViewModel O0 = activityOverflowFragment.O0();
        Integer id = basicUser == null ? null : basicUser.getId();
        if (id != null) {
            O0.p(new h(id.intValue(), actionableNotification));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
