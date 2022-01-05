package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment$showStartRoomConfirmationIfNecessary$1;
import h0.b0.v;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ UserInStatus d;

    public /* synthetic */ i(BuddyListFragment buddyListFragment, UserInStatus userInStatus) {
        this.c = buddyListFragment;
        this.d = userInStatus;
    }

    public final void onClick(View view) {
        BuddyListFragment buddyListFragment = this.c;
        UserInStatus userInStatus = this.d;
        m0.n.b.i.e(buddyListFragment, "this$0");
        m0.n.b.i.e(userInStatus, "$user");
        v vVar = new v(userInStatus.getId().intValue());
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        v.v2(buddyListFragment.O0(), new BuddyListFragment$showStartRoomConfirmationIfNecessary$1(buddyListFragment, vVar));
    }
}
