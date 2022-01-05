package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.y4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$26$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$26$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        boolean z;
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "it");
        UserProfile userProfile = c5Var.l;
        String str2 = null;
        if (userProfile == null) {
            str = null;
        } else {
            str = v.g0(userProfile);
        }
        UserProfile userProfile2 = c5Var.l;
        if (userProfile2 != null) {
            str2 = v.O0(userProfile2);
        }
        EditNameArgs editNameArgs = new EditNameArgs(str, str2);
        m0.n.b.i.e(editNameArgs, "mavericksArg");
        y4.c cVar = new y4.c(editNameArgs);
        ProfileFragment profileFragment = this.c;
        UserProfile userProfile3 = c5Var.l;
        m0.n.b.i.e(profileFragment, "<this>");
        m0.n.b.i.e(cVar, "navigateTo");
        if (userProfile3 == null) {
            z = false;
        } else {
            z = m0.n.b.i.a(userProfile3.o2, Boolean.TRUE);
        }
        if (z) {
            HalfProfileUtil$showEditNameWarningDialog$1 halfProfileUtil$showEditNameWarningDialog$1 = new HalfProfileUtil$showEditNameWarningDialog$1(profileFragment, cVar);
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showEditNameWarningDialog$1, "f");
            d.a aVar = new d.a(profileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showEditNameWarningDialog$1.invoke(aVar);
            aVar.g();
        } else {
            HalfProfileUtil$showEditNameWarningDialog$2 halfProfileUtil$showEditNameWarningDialog$2 = HalfProfileUtil$showEditNameWarningDialog$2.c;
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showEditNameWarningDialog$2, "f");
            d.a aVar2 = new d.a(profileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showEditNameWarningDialog$2.invoke(aVar2);
            aVar2.g();
        }
        return i.a;
    }
}
