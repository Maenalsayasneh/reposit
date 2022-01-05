package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$resendValidationCode$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ OnboardingRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$resendValidationCode$3(OnboardingRepo onboardingRepo) {
        super(1);
        this.c = onboardingRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-ResendPhoneNumber-Error");
        return i.a;
    }
}
