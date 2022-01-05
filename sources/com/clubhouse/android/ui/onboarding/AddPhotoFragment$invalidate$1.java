package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import android.widget.ProgressBar;
import i0.b.b.f;
import i0.e.b.g3.r.i0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: AddPhotoFragment.kt */
public final class AddPhotoFragment$invalidate$1 extends Lambda implements l<i0, i> {
    public final /* synthetic */ AddPhotoFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhotoFragment$invalidate$1(AddPhotoFragment addPhotoFragment) {
        super(1);
        this.c = addPhotoFragment;
    }

    public Object invoke(Object obj) {
        i0 i0Var = (i0) obj;
        m0.n.b.i.e(i0Var, "state");
        AddPhotoFragment addPhotoFragment = this.c;
        k<Object>[] kVarArr = AddPhotoFragment.e2;
        ProgressBar progressBar = addPhotoFragment.R0().b;
        m0.n.b.i.d(progressBar, "binding.loading");
        boolean z = false;
        progressBar.setVisibility(i0Var.b instanceof f ? 0 : 8);
        Button button = this.c.R0().c;
        m0.n.b.i.d(button, "binding.nextButton");
        if (i0Var.c != null) {
            z = true;
        }
        i0.e.b.d3.k.k(button, Boolean.valueOf(z));
        return i.a;
    }
}
