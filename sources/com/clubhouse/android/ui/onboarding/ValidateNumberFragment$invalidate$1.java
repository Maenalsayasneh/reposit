package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import android.widget.ProgressBar;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.g0;
import i0.e.b.g3.r.p2;
import i0.e.b.g3.r.t1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment$invalidate$1 extends Lambda implements l<t1, i> {
    public final /* synthetic */ ValidateNumberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberFragment$invalidate$1(ValidateNumberFragment validateNumberFragment) {
        super(1);
        this.c = validateNumberFragment;
    }

    public Object invoke(Object obj) {
        t1 t1Var = (t1) obj;
        m0.n.b.i.e(t1Var, "state");
        ValidateNumberFragment validateNumberFragment = this.c;
        k<Object>[] kVarArr = ValidateNumberFragment.Z1;
        Button button = validateNumberFragment.N0().e;
        m0.n.b.i.d(button, "binding.resendButton");
        boolean z = true;
        int i = 0;
        boolean z2 = button.getVisibility() == 0;
        b<p2> bVar = t1Var.b;
        if (z2 != (bVar instanceof g0)) {
            boolean z3 = bVar instanceof c;
        }
        ProgressBar progressBar = this.c.N0().c;
        m0.n.b.i.d(progressBar, "binding.loading");
        if (!(t1Var.b instanceof f) && !(t1Var.c instanceof f) && !(t1Var.d instanceof f)) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
        if (t1Var.g) {
            this.c.N0().e.setText(this.c.getString(R.string.phone_call));
        }
        return i.a;
    }
}
