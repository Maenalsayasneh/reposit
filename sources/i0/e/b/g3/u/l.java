package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.FollowListFragment;
import i0.e.b.b3.b.e.j;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ FollowListFragment c;
    public final /* synthetic */ j d;

    public /* synthetic */ l(FollowListFragment followListFragment, j jVar) {
        this.c = followListFragment;
        this.d = jVar;
    }

    public final void onClick(View view) {
        FollowListFragment.FollowItemController.m36buildItemModel$lambda2(this.c, this.d, view);
    }
}
