package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import h0.a.b;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment$onCreate$10 extends Lambda implements l<b, i> {
    public final /* synthetic */ ValidateNumberFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberFragment$onCreate$10(ValidateNumberFragment validateNumberFragment) {
        super(1);
        this.c = validateNumberFragment;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((b) obj, "$this$addCallback");
        ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-PhoneVerify-GoBack");
        v.c1(this.c);
        return i.a;
    }
}
