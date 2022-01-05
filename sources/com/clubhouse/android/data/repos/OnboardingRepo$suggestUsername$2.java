package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.request.SuggestUsernameResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$suggestUsername$2 extends Lambda implements l<SuggestUsernameResponse, i> {
    public final /* synthetic */ OnboardingRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$suggestUsername$2(OnboardingRepo onboardingRepo) {
        super(1);
        this.c = onboardingRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((SuggestUsernameResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-SuggestUsername-Success");
        return i.a;
    }
}
