package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import h0.b0.v;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$showNotifyOptions$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$showNotifyOptions$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile == null) {
            return null;
        }
        ProfileFragment profileFragment = this.c;
        v.e(profileFragment, new ProfileFragment$showNotifyOptions$1$1$1(profileFragment, userProfile, c5Var));
        return i.a;
    }
}
