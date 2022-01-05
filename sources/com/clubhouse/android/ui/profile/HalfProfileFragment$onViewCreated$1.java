package com.clubhouse.android.ui.profile;

import android.view.ViewGroup;
import android.view.ViewParent;
import i0.e.b.g3.u.n4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$onViewCreated$1 extends Lambda implements l<n4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$onViewCreated$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        n4 n4Var = (n4) obj;
        m0.n.b.i.e(n4Var, "state");
        if (n4Var.b) {
            ViewParent parent = this.c.S0().a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            HalfProfileFragment.N0(this.c, false);
        }
        return i.a;
    }
}
