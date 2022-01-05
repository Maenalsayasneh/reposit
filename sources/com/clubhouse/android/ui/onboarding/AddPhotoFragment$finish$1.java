package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import h0.b0.v;
import i0.e.b.g3.r.i0;
import i0.j.f.p.h;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: AddPhotoFragment.kt */
public final class AddPhotoFragment$finish$1 extends Lambda implements l<i0, h0.t.l> {
    public final /* synthetic */ AddPhotoFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhotoFragment$finish$1(AddPhotoFragment addPhotoFragment) {
        super(1);
        this.c = addPhotoFragment;
    }

    public Object invoke(Object obj) {
        i0 i0Var = (i0) obj;
        i.e(i0Var, "state");
        ((AmplitudeAnalytics) v.l(this.c)).b("Onboarding-Photo-Done", h.S2(new Pair("WithPhoto", Boolean.valueOf(i0Var.d))));
        return i0Var.a;
    }
}
