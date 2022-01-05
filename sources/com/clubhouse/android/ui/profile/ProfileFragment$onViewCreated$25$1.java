package com.clubhouse.android.ui.profile;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserProfile;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.i5;
import i0.e.b.g3.u.v3;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$25$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$25$1(ProfileFragment profileFragment, View view) {
        super(1);
        this.c = profileFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        String str;
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        Integer num = c5Var.a;
        if (num != null) {
            ProfileFragment profileFragment = this.c;
            View view = this.d;
            num.intValue();
            if (c5Var.s) {
                profileFragment.P0().p(new v3(c5Var.a.intValue()));
            } else {
                m0.n.b.i.d(view, "view");
                m0.n.b.i.e(view, "<this>");
                view.performHapticFeedback(1);
                ProfileViewModel P0 = profileFragment.P0();
                int intValue = c5Var.a.intValue();
                UserProfile userProfile = c5Var.l;
                if (userProfile == null) {
                    str = null;
                } else {
                    str = userProfile.u2;
                }
                P0.p(new i5(intValue, str));
            }
        }
        return i.a;
    }
}
