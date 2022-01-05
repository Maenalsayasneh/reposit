package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.y4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$27$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$27$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        boolean z;
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "it");
        UserProfile userProfile = c5Var.l;
        if (userProfile == null) {
            str = null;
        } else {
            str = userProfile.v2;
        }
        EditUsernameArgs editUsernameArgs = new EditUsernameArgs(str);
        m0.n.b.i.e(editUsernameArgs, "mavericksArg");
        y4.e eVar = new y4.e(editUsernameArgs);
        ProfileFragment profileFragment = this.c;
        UserProfile userProfile2 = c5Var.l;
        m0.n.b.i.e(profileFragment, "<this>");
        m0.n.b.i.e(eVar, "navigateTo");
        if (userProfile2 == null) {
            z = false;
        } else {
            z = m0.n.b.i.a(userProfile2.n2, Boolean.TRUE);
        }
        if (z) {
            v.a1(profileFragment, eVar, (q) null, 2);
        } else {
            HalfProfileUtil$showEditUsernameWarningDialog$1 halfProfileUtil$showEditUsernameWarningDialog$1 = HalfProfileUtil$showEditUsernameWarningDialog$1.c;
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showEditUsernameWarningDialog$1, "f");
            d.a aVar = new d.a(profileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showEditUsernameWarningDialog$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
