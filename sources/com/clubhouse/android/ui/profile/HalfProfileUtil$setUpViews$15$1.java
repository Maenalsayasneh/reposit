package com.clubhouse.android.ui.profile;

import com.clubhouse.android.user.model.User;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.b.g3.u.p5;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$15$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$15$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (q4Var.m || q4Var.q) {
            this.c.V0();
        } else {
            this.c.W0();
        }
        if (!q4Var.q) {
            this.c.U0().p(new p5(q4Var.a.getId().intValue()));
        } else {
            HalfProfileFragment halfProfileFragment = this.c;
            User user = q4Var.a;
            HalfProfileViewModel U0 = halfProfileFragment.U0();
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(user, "user");
            m0.n.b.i.e(U0, "viewModel");
            HalfProfileUtil$showUnblockConfirmationDialog$1 halfProfileUtil$showUnblockConfirmationDialog$1 = new HalfProfileUtil$showUnblockConfirmationDialog$1(halfProfileFragment, user, U0);
            m0.n.b.i.e(halfProfileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showUnblockConfirmationDialog$1, "f");
            d.a aVar = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showUnblockConfirmationDialog$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
