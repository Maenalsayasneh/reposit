package com.clubhouse.android.ui.profile;

import i0.e.b.g3.u.n4;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$expand$1 extends Lambda implements l<n4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$expand$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        n4 n4Var = (n4) obj;
        m0.n.b.i.e(n4Var, "state");
        if (!n4Var.b) {
            HalfProfileFragment.N0(this.c, true);
            HalfProfileContainerViewModel R0 = this.c.R0();
            Objects.requireNonNull(R0);
            R0.m(new HalfProfileContainerViewModel$setExpanded$1(true));
        }
        return i.a;
    }
}
