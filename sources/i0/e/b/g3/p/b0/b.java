package i0.e.b.g3.p.b0;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ BuddyListFragment c;
    public final /* synthetic */ UserInStatus d;

    public /* synthetic */ b(BuddyListFragment buddyListFragment, UserInStatus userInStatus) {
        this.c = buddyListFragment;
        this.d = userInStatus;
    }

    public final void onClick(View view) {
        BuddyListFragment buddyListFragment = this.c;
        UserInStatus userInStatus = this.d;
        i.e(buddyListFragment, "this$0");
        i.e(userInStatus, "$user");
        SourceLocation sourceLocation = SourceLocation.BUDDY_LIST;
        i.e(buddyListFragment, "<this>");
        i.e(userInStatus, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(buddyListFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(userInStatus, sourceLocation, false, false, false, 16));
    }
}
