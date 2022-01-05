package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import i0.e.b.g3.r.e1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FollowFriendsViewModel.kt */
public final class FollowFriendsViewModel$toggleFollow$1 extends Lambda implements l<e1, i> {
    public final /* synthetic */ UserInList c;
    public final /* synthetic */ FollowFriendsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsViewModel$toggleFollow$1(UserInList userInList, FollowFriendsViewModel followFriendsViewModel) {
        super(1);
        this.c = userInList;
        this.d = followFriendsViewModel;
    }

    public Object invoke(Object obj) {
        e1 e1Var = (e1) obj;
        m0.n.b.i.e(e1Var, "state");
        if (e1Var.c.contains(this.c.getId())) {
            this.d.m(new z(0, this.c));
        } else {
            this.d.p.a(SourceLocation.ONBOARDING_FRIENDS, this.c.b2);
            this.d.m(new z(1, this.c));
        }
        return i.a;
    }
}
