package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment$showStartRoomConfirmationIfNecessary$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ ClubInStatus d;

    public /* synthetic */ e(BuddyListFragment buddyListFragment, ClubInStatus clubInStatus) {
        this.c = buddyListFragment;
        this.d = clubInStatus;
    }

    public final void onClick(View view) {
        BuddyListFragment buddyListFragment = this.c;
        ClubInStatus clubInStatus = this.d;
        i.e(buddyListFragment, "this$0");
        i.e(clubInStatus, "$club");
        w wVar = new w(clubInStatus.q);
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        v.v2(buddyListFragment.O0(), new BuddyListFragment$showStartRoomConfirmationIfNecessary$1(buddyListFragment, wVar));
    }
}
