package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.FollowFriendsFragment;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ FollowFriendsFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ q(FollowFriendsFragment followFriendsFragment, a aVar) {
        this.c = followFriendsFragment;
        this.d = aVar;
    }

    public final void onClick(View view) {
        FollowFriendsFragment followFriendsFragment = this.c;
        a aVar = this.d;
        i.e(followFriendsFragment, "this$0");
        i.e(aVar, "$item");
        k<Object>[] kVarArr = FollowFriendsFragment.Z1;
        followFriendsFragment.O0().p(new z1(((m) aVar.a).g));
    }
}
