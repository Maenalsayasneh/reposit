package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$44$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$44$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        boolean z;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "it");
        UserProfile userProfile = q4Var.k;
        if (userProfile == null) {
            str = null;
        } else {
            str = userProfile.v2;
        }
        EditUsernameArgs editUsernameArgs = new EditUsernameArgs(str);
        m0.n.b.i.e(editUsernameArgs, "mavericksArg");
        o4.e eVar = new o4.e(editUsernameArgs);
        HalfProfileFragment halfProfileFragment = this.c;
        UserProfile userProfile2 = q4Var.k;
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(eVar, "navigateTo");
        if (userProfile2 == null) {
            z = false;
        } else {
            z = m0.n.b.i.a(userProfile2.n2, Boolean.TRUE);
        }
        if (z) {
            v.a1(halfProfileFragment, eVar, (q) null, 2);
        } else {
            HalfProfileUtil$showEditUsernameWarningDialog$1 halfProfileUtil$showEditUsernameWarningDialog$1 = HalfProfileUtil$showEditUsernameWarningDialog$1.c;
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showEditUsernameWarningDialog$1, "f");
            d.a aVar = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showEditUsernameWarningDialog$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
