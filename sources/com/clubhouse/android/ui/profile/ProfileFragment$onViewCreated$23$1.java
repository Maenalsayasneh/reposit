package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import h0.b0.v;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$23$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$23$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        Integer num = c5Var.a;
        if (num != null) {
            ProfileFragment profileFragment = this.c;
            num.intValue();
            int intValue = c5Var.a.intValue();
            m0.n.b.i.e(profileFragment, "<this>");
            v.a2(profileFragment, new CreateChatArgs(SourceLocation.PROFILE, Integer.valueOf(intValue)));
        }
        return i.a;
    }
}
