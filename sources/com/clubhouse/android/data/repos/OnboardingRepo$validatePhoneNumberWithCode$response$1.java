package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$validatePhoneNumberWithCode$response$1 extends Lambda implements l<CompletePhoneNumberAuthResponse, i> {
    public final /* synthetic */ OnboardingRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$validatePhoneNumberWithCode$response$1(OnboardingRepo onboardingRepo) {
        super(1);
        this.c = onboardingRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((CompletePhoneNumberAuthResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-PhoneVerify-Success");
        return i.a;
    }
}
