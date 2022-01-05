package com.clubhouse.android.ui.profile;

import android.view.View;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$showMenu$2 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$showMenu$2(HalfProfileFragment halfProfileFragment, View view) {
        super(1);
        this.c = halfProfileFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        final HalfProfileFragment halfProfileFragment = this.c;
        View view = this.d;
        AnonymousClass1 r2 = new l<m0, i>() {
            public Object invoke(Object obj) {
                m0 m0Var = (m0) obj;
                m0.n.b.i.e(m0Var, "$this$popUpMenu");
                m0Var.a(R.menu.menu_profile);
                m0Var.b.findItem(R.id.block).setVisible(!q4.this.q);
                m0Var.b.findItem(R.id.unblock).setVisible(q4.this.q);
                m0Var.e = halfProfileFragment.n2;
                return i.a;
            }
        };
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(view, "anchor");
        m0.n.b.i.e(r2, "f");
        m0 m0Var = new m0(halfProfileFragment.requireContext(), view);
        r2.invoke(m0Var);
        if (m0Var.d.f()) {
            return i.a;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
}
