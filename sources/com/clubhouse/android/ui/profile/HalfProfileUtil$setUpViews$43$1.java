package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$43$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$43$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        boolean z;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "it");
        UserProfile userProfile = q4Var.k;
        String str2 = null;
        if (userProfile == null) {
            str = null;
        } else {
            str = v.g0(userProfile);
        }
        UserProfile userProfile2 = q4Var.k;
        if (userProfile2 != null) {
            str2 = v.O0(userProfile2);
        }
        EditNameArgs editNameArgs = new EditNameArgs(str, str2);
        m0.n.b.i.e(editNameArgs, "mavericksArg");
        o4.c cVar = new o4.c(editNameArgs);
        HalfProfileFragment halfProfileFragment = this.c;
        UserProfile userProfile3 = q4Var.k;
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(cVar, "navigateTo");
        if (userProfile3 == null) {
            z = false;
        } else {
            z = m0.n.b.i.a(userProfile3.o2, Boolean.TRUE);
        }
        if (z) {
            HalfProfileUtil$showEditNameWarningDialog$1 halfProfileUtil$showEditNameWarningDialog$1 = new HalfProfileUtil$showEditNameWarningDialog$1(halfProfileFragment, cVar);
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showEditNameWarningDialog$1, "f");
            d.a aVar = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showEditNameWarningDialog$1.invoke(aVar);
            aVar.g();
        } else {
            HalfProfileUtil$showEditNameWarningDialog$2 halfProfileUtil$showEditNameWarningDialog$2 = HalfProfileUtil$showEditNameWarningDialog$2.c;
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showEditNameWarningDialog$2, "f");
            d.a aVar2 = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showEditNameWarningDialog$2.invoke(aVar2);
            aVar2.g();
        }
        return i.a;
    }
}
