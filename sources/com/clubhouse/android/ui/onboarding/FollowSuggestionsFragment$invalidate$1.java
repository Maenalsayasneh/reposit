package com.clubhouse.android.ui.onboarding;

import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.i;
import n0.a.f1;

/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$invalidate$1 extends Lambda implements l<FollowSuggestionsState, f1> {
    public final /* synthetic */ FollowSuggestionsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$invalidate$1(FollowSuggestionsFragment followSuggestionsFragment) {
        super(1);
        this.c = followSuggestionsFragment;
    }

    public Object invoke(Object obj) {
        FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
        i.e(followSuggestionsState, "state");
        w<a<m>> wVar = followSuggestionsState.e;
        if (wVar == null) {
            return null;
        }
        FollowSuggestionsFragment followSuggestionsFragment = this.c;
        p viewLifecycleOwner = followSuggestionsFragment.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        return m0.r.t.a.r.m.a1.a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new FollowSuggestionsFragment$invalidate$1$1$1(followSuggestionsFragment, wVar, (c<? super FollowSuggestionsFragment$invalidate$1$1$1>) null), 3, (Object) null);
    }
}
