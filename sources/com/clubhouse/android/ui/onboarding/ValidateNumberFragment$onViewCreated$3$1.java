package com.clubhouse.android.ui.onboarding;

import h0.b0.v;
import i0.e.b.g3.r.t1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment$onViewCreated$3$1 extends Lambda implements l<t1, i> {
    public final /* synthetic */ ValidateNumberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberFragment$onViewCreated$3$1(ValidateNumberFragment validateNumberFragment) {
        super(1);
        this.c = validateNumberFragment;
    }

    public Object invoke(Object obj) {
        t1 t1Var = (t1) obj;
        m0.n.b.i.e(t1Var, "state");
        if (t1Var.e) {
            v.f2(this.c, o.c);
        }
        if (t1Var.f) {
            v.f2(this.c, o.d);
        }
        return i.a;
    }
}
