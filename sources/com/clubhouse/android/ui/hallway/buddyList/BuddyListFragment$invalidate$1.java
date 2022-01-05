package com.clubhouse.android.ui.hallway.buddyList;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import i0.e.b.g3.p.b0.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BuddyListFragment.kt */
public final class BuddyListFragment$invalidate$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ BuddyListFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListFragment$invalidate$1(BuddyListFragment buddyListFragment) {
        super(1);
        this.c = buddyListFragment;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        BuddyListFragment buddyListFragment = this.c;
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        buddyListFragment.N0().e.setRefreshing(qVar.f);
        FrameLayout frameLayout = this.c.N0().g;
        m0.n.b.i.d(frameLayout, "binding.roomLoading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(qVar.e));
        LinearLayout linearLayout = this.c.N0().c;
        m0.n.b.i.d(linearLayout, "binding.errorView");
        i0.e.b.d3.k.L(linearLayout, Boolean.valueOf(qVar.g));
        LinearLayout linearLayout2 = this.c.N0().b;
        m0.n.b.i.d(linearLayout2, "binding.emptyView");
        boolean z = true;
        i0.e.b.d3.k.L(linearLayout2, Boolean.valueOf(!qVar.g && !qVar.f && qVar.k));
        EpoxyRecyclerView epoxyRecyclerView = this.c.N0().a;
        m0.n.b.i.d(epoxyRecyclerView, "binding.buddyList");
        if (!qVar.g && !qVar.k) {
            z = false;
        }
        i0.e.b.d3.k.q(epoxyRecyclerView, Boolean.valueOf(z));
        return i.a;
    }
}
