package com.clubhouse.android.ui.onboarding;

import android.widget.FrameLayout;
import com.clubhouse.app.R;
import i0.e.b.g3.r.e1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: FollowFriendsFragment.kt */
public final class FollowFriendsFragment$invalidate$1 extends Lambda implements l<e1, i> {
    public final /* synthetic */ FollowFriendsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsFragment$invalidate$1(FollowFriendsFragment followFriendsFragment) {
        super(1);
        this.c = followFriendsFragment;
    }

    public Object invoke(Object obj) {
        e1 e1Var = (e1) obj;
        m0.n.b.i.e(e1Var, "state");
        FollowFriendsFragment followFriendsFragment = this.c;
        k<Object>[] kVarArr = FollowFriendsFragment.Z1;
        FrameLayout frameLayout = followFriendsFragment.N0().d;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(e1Var.d));
        this.c.N0().e.setText(this.c.getString(e1Var.b.size() == e1Var.c.size() ? R.string.select_individually : R.string.use_suggestions));
        this.c.N0().c.g();
        return i.a;
    }
}
