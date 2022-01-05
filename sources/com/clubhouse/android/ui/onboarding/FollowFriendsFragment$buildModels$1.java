package com.clubhouse.android.ui.onboarding;

import h0.b0.v;
import i0.b.a.o;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.k.w0.b.j;
import i0.e.b.g3.r.e1;
import i0.e.b.g3.r.q;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: FollowFriendsFragment.kt */
public final class FollowFriendsFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ FollowFriendsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsFragment$buildModels$1(FollowFriendsFragment followFriendsFragment) {
        super(1);
        this.c = followFriendsFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        FollowFriendsFragment followFriendsFragment = this.c;
        k<Object>[] kVarArr = FollowFriendsFragment.Z1;
        FollowFriendsViewModel O0 = followFriendsFragment.O0();
        final FollowFriendsFragment followFriendsFragment2 = this.c;
        v.v2(O0, new l<e1, i>() {
            public Object invoke(Object obj) {
                e1 e1Var = (e1) obj;
                m0.n.b.i.e(e1Var, "state");
                List<a<m>> list = e1Var.e;
                o oVar = o.this;
                FollowFriendsFragment followFriendsFragment = followFriendsFragment2;
                for (a aVar : list) {
                    j jVar = new j();
                    jVar.N(new Number[]{((m) aVar.a).g.getId()});
                    jVar.O(new FollowFriendsFragment$buildModels$1$1$1$1$1(followFriendsFragment, aVar));
                    jVar.Q(((m) aVar.a).g);
                    jVar.P(aVar.b);
                    jVar.M(true);
                    jVar.L(new q(followFriendsFragment, aVar));
                    oVar.add(jVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
