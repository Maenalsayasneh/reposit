package com.clubhouse.android.data.repos;

import androidx.core.app.NotificationCompat;
import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.e.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo$validatePhoneNumberWithCode$response$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ OnboardingRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingRepo$validatePhoneNumberWithCode$response$2(OnboardingRepo onboardingRepo) {
        super(1);
        this.c = onboardingRepo;
    }

    public Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        m0.n.b.i.e(exc, NotificationCompat.CATEGORY_ERROR);
        a aVar = this.c.c;
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        ((AmplitudeAnalytics) aVar).b("Server-PhoneVerify-Error", i0.d.a.a.a.n1("exception", message));
        return i.a;
    }
}
