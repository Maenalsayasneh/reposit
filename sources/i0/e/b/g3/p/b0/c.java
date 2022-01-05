package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.p.j;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ ClubInStatus d;

    public /* synthetic */ c(BuddyListFragment buddyListFragment, ClubInStatus clubInStatus) {
        this.c = buddyListFragment;
        this.d = clubInStatus;
    }

    public final void onClick(View view) {
        BuddyListFragment buddyListFragment = this.c;
        ClubInStatus clubInStatus = this.d;
        i.e(buddyListFragment, "this$0");
        i.e(clubInStatus, "$club");
        ClubArgs clubArgs = new ClubArgs(Integer.valueOf(clubInStatus.q), (String) null, (String) null, false, false, SourceLocation.BUDDY_LIST, (Map) null, 94);
        i.e(clubArgs, "mavericksArg");
        v.a1(buddyListFragment, new j(clubArgs), (q) null, 2);
    }
}
