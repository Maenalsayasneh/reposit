package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel;
import i0.e.b.a3.b.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ q d;
    public final /* synthetic */ UserInStatus q;

    public /* synthetic */ g(BuddyListFragment buddyListFragment, q qVar, UserInStatus userInStatus) {
        this.c = buddyListFragment;
        this.d = qVar;
        this.q = userInStatus;
    }

    public final void onClick(View view) {
        c cVar;
        BuddyListFragment buddyListFragment = this.c;
        q qVar = this.d;
        UserInStatus userInStatus = this.q;
        i.e(buddyListFragment, "this$0");
        i.e(qVar, "$state");
        i.e(userInStatus, "$user");
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        BuddyListViewModel O0 = buddyListFragment.O0();
        if (qVar.a(userInStatus)) {
            cVar = new r(userInStatus.getId().intValue());
        } else {
            i.d(view, "view");
            i.e(view, "<this>");
            view.performHapticFeedback(1);
            cVar = new t(userInStatus.getId().intValue(), userInStatus.Y1);
        }
        O0.p(cVar);
    }
}
