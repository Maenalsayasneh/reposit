package com.clubhouse.android.ui.profile;

import android.view.MenuItem;
import android.view.View;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.d3.k;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$showMenu$1 extends Lambda implements p<q4, l, i> {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$showMenu$1(HalfProfileFragment halfProfileFragment, View view) {
        super(2);
        this.c = halfProfileFragment;
        this.d = view;
    }

    public Object invoke(Object obj, Object obj2) {
        final q4 q4Var = (q4) obj;
        final l lVar = (l) obj2;
        m0.n.b.i.e(q4Var, "state");
        m0.n.b.i.e(lVar, "channelState");
        final HalfProfileFragment halfProfileFragment = this.c;
        View view = this.d;
        AnonymousClass1 r2 = new m0.n.a.l<m0, i>() {
            public Object invoke(Object obj) {
                m0 m0Var = (m0) obj;
                m0.n.b.i.e(m0Var, "$this$popUpMenu");
                m0Var.a(R.menu.menu_profile_in_channel);
                m0Var.b.findItem(R.id.block).setVisible(!q4.this.q);
                m0Var.b.findItem(R.id.unblock).setVisible(q4.this.q);
                if (!q4.this.o) {
                    if (lVar.q) {
                        MenuItem findItem = m0Var.b.findItem(R.id.remove);
                        m0.n.b.i.d(findItem, "menu.findItem(R.id.remove)");
                        k.J(findItem);
                        MenuItem findItem2 = m0Var.b.findItem(R.id.remove_and_report);
                        m0.n.b.i.d(findItem2, "menu.findItem(R.id.remove_and_report)");
                        k.J(findItem2);
                    } else {
                        MenuItem findItem3 = m0Var.b.findItem(R.id.report_incident);
                        m0.n.b.i.d(findItem3, "menu.findItem(R.id.report_incident)");
                        k.J(findItem3);
                    }
                }
                m0Var.e = halfProfileFragment.o2;
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
