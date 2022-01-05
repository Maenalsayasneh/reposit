package com.clubhouse.android.ui.onboarding;

import i0.e.b.g3.r.e1;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: FollowFriendsViewModel.kt */
public final class FollowFriendsViewModel$toggleSuggestions$1 extends Lambda implements l<e1, i> {
    public final /* synthetic */ FollowFriendsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsViewModel$toggleSuggestions$1(FollowFriendsViewModel followFriendsViewModel) {
        super(1);
        this.c = followFriendsViewModel;
    }

    public Object invoke(Object obj) {
        final e1 e1Var = (e1) obj;
        m0.n.b.i.e(e1Var, "state");
        this.c.m(new l<e1, e1>() {
            public Object invoke(Object obj) {
                e1 e1Var = (e1) obj;
                m0.n.b.i.e(e1Var, "$this$setState");
                if (e1.this.c.size() == e1.this.b.size()) {
                    return e1.copy$default(e1Var, (List) null, (Set) null, g.S(e1Var.c, e1.this.b), false, 11, (Object) null);
                }
                return e1.copy$default(e1Var, (List) null, (Set) null, g.d0(e1Var.c, e1.this.b), false, 11, (Object) null);
            }
        });
        return i.a;
    }
}
