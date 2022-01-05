package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import h0.b0.v;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.r.e1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.k;

/* compiled from: FollowFriendsFragment.kt */
public final class FollowFriendsFragment$buildModels$1$1$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ FollowFriendsFragment c;
    public final /* synthetic */ i0.e.b.a3.d.a<m> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsFragment$buildModels$1$1$1$1$1(FollowFriendsFragment followFriendsFragment, i0.e.b.a3.d.a<m> aVar) {
        super(0);
        this.c = followFriendsFragment;
        this.d = aVar;
    }

    public Object invoke() {
        FollowFriendsFragment followFriendsFragment = this.c;
        k<Object>[] kVarArr = FollowFriendsFragment.Z1;
        FollowFriendsViewModel O0 = followFriendsFragment.O0();
        final FollowFriendsFragment followFriendsFragment2 = this.c;
        final i0.e.b.a3.d.a<m> aVar = this.d;
        v.v2(O0, new l<e1, i>() {
            public Object invoke(Object obj) {
                m0.n.b.i.e((e1) obj, "state");
                i0.e.a.b.a aVar = FollowFriendsFragment.this.a2;
                if (aVar != null) {
                    aVar.c(SourceLocation.ONBOARDING_FRIENDS, ((m) aVar.a).g.b2);
                    return i.a;
                }
                m0.n.b.i.m("actionTrailRecorder");
                throw null;
            }
        });
        return i.a;
    }
}
