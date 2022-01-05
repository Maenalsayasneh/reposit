package com.clubhouse.android.ui.onboarding;

import android.widget.ProgressBar;
import i0.e.b.g3.r.p0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: CollectPhoneNumberFragment.kt */
public final class CollectPhoneNumberFragment$invalidate$1 extends Lambda implements l<p0, i> {
    public final /* synthetic */ CollectPhoneNumberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberFragment$invalidate$1(CollectPhoneNumberFragment collectPhoneNumberFragment) {
        super(1);
        this.c = collectPhoneNumberFragment;
    }

    public Object invoke(Object obj) {
        p0 p0Var = (p0) obj;
        m0.n.b.i.e(p0Var, "state");
        CollectPhoneNumberFragment collectPhoneNumberFragment = this.c;
        k<Object>[] kVarArr = CollectPhoneNumberFragment.Z1;
        ProgressBar progressBar = collectPhoneNumberFragment.N0().b;
        m0.n.b.i.d(progressBar, "binding.loading");
        progressBar.setVisibility(p0Var.a ? 0 : 8);
        return i.a;
    }
}
