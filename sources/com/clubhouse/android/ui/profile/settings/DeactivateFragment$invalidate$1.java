package com.clubhouse.android.ui.profile.settings;

import android.widget.ProgressBar;
import i0.e.b.d3.k;
import i0.e.b.g3.u.z5.q0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: DeactivateFragment.kt */
public final class DeactivateFragment$invalidate$1 extends Lambda implements l<q0, i> {
    public final /* synthetic */ DeactivateFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateFragment$invalidate$1(DeactivateFragment deactivateFragment) {
        super(1);
        this.c = deactivateFragment;
    }

    public Object invoke(Object obj) {
        q0 q0Var = (q0) obj;
        m0.n.b.i.e(q0Var, "state");
        ProgressBar progressBar = this.c.N0().c;
        m0.n.b.i.d(progressBar, "binding.loading");
        k.L(progressBar, Boolean.valueOf(q0Var.a));
        return i.a;
    }
}
