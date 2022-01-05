package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.p5;
import i0.e.b.g3.u.s4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$16$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$16$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        if (c5Var.i || c5Var.r) {
            ProfileFragment profileFragment = this.c;
            k<Object>[] kVarArr = ProfileFragment.Z1;
            profileFragment.P0().p(s4.a);
        } else {
            ProfileFragment profileFragment2 = this.c;
            k<Object>[] kVarArr2 = ProfileFragment.Z1;
            profileFragment2.Q0();
        }
        if (!c5Var.r) {
            Integer num = c5Var.a;
            if (num != null) {
                this.c.P0().p(new p5(num.intValue()));
            }
        } else {
            UserProfile userProfile = c5Var.l;
            if (userProfile != null) {
                ProfileFragment profileFragment3 = this.c;
                ProfileViewModel P0 = profileFragment3.P0();
                m0.n.b.i.e(profileFragment3, "<this>");
                m0.n.b.i.e(userProfile, "user");
                m0.n.b.i.e(P0, "viewModel");
                HalfProfileUtil$showUnblockConfirmationDialog$1 halfProfileUtil$showUnblockConfirmationDialog$1 = new HalfProfileUtil$showUnblockConfirmationDialog$1(profileFragment3, userProfile, P0);
                m0.n.b.i.e(profileFragment3, "<this>");
                m0.n.b.i.e(halfProfileUtil$showUnblockConfirmationDialog$1, "f");
                d.a aVar = new d.a(profileFragment3.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
                halfProfileUtil$showUnblockConfirmationDialog$1.invoke(aVar);
                aVar.g();
            }
        }
        return i.a;
    }
}
