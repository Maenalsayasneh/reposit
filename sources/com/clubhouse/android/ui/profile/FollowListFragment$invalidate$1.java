package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.u.l4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: FollowListFragment.kt */
public final class FollowListFragment$invalidate$1 extends Lambda implements l<l4, i> {
    public final /* synthetic */ FollowListFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowListFragment$invalidate$1(FollowListFragment followListFragment) {
        super(1);
        this.c = followListFragment;
    }

    public Object invoke(Object obj) {
        l4 l4Var = (l4) obj;
        m0.n.b.i.e(l4Var, "state");
        w<j> wVar = l4Var.d;
        if (wVar != null) {
            FollowListFragment followListFragment = this.c;
            p viewLifecycleOwner = followListFragment.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
            a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new FollowListFragment$invalidate$1$1$1(followListFragment, wVar, (c<? super FollowListFragment$invalidate$1$1$1>) null), 3, (Object) null);
        }
        int ordinal = l4Var.a.ordinal();
        if (ordinal == 0) {
            this.c.N0().e.setText(this.c.getString(R.string.followers));
            this.c.N0().b.setText(this.c.getString(R.string.no_followers));
        } else if (ordinal == 1) {
            this.c.N0().e.setText(this.c.getString(R.string.following));
            this.c.N0().b.setText(this.c.getString(R.string.no_following));
        } else if (ordinal == 2) {
            this.c.N0().e.setText(this.c.getString(R.string.mutual_follows));
            this.c.N0().b.setText(this.c.getString(R.string.no_mutual_follows));
        } else if (ordinal == 3) {
            this.c.N0().e.setText(this.c.getString(R.string.followed_you));
            this.c.N0().b.setText(this.c.getString(R.string.no_followers));
        }
        return i.a;
    }
}
