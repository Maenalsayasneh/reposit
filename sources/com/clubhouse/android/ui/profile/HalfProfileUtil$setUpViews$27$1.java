package com.clubhouse.android.ui.profile;

import android.view.View;
import i0.e.b.g3.u.i5;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.v3;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$27$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$27$1(HalfProfileFragment halfProfileFragment, View view) {
        super(1);
        this.c = halfProfileFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (q4Var.r) {
            this.c.U0().p(new v3(q4Var.a.getId().intValue()));
        } else {
            View view = this.d;
            m0.n.b.i.d(view, "view");
            m0.n.b.i.e(view, "<this>");
            view.performHapticFeedback(1);
            this.c.U0().p(new i5(q4Var.a.getId().intValue(), q4Var.a.getName()));
        }
        return i.a;
    }
}
