package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.payments.SendDirectPaymentArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.y4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$15$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$15$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile != null) {
            ProfileFragment profileFragment = this.c;
            SendDirectPaymentArgs sendDirectPaymentArgs = new SendDirectPaymentArgs(userProfile, (String) null);
            m0.n.b.i.e(sendDirectPaymentArgs, "mavericksArg");
            v.a1(profileFragment, new y4.l(sendDirectPaymentArgs), (q) null, 2);
        }
        return i.a;
    }
}
