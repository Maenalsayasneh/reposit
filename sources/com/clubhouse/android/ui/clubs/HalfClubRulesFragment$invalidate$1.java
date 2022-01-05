package com.clubhouse.android.ui.clubs;

import i0.e.b.g3.l.a2;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfClubRulesFragment.kt */
public final class HalfClubRulesFragment$invalidate$1 extends Lambda implements l<a2, i> {
    public final /* synthetic */ HalfClubRulesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfClubRulesFragment$invalidate$1(HalfClubRulesFragment halfClubRulesFragment) {
        super(1);
        this.c = halfClubRulesFragment;
    }

    public Object invoke(Object obj) {
        a2 a2Var = (a2) obj;
        m0.n.b.i.e(a2Var, "state");
        this.c.V0().c.setText(a2Var.c);
        this.c.V0().b.g();
        return i.a;
    }
}
