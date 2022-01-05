package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PaymentsRepo.kt */
public final class PaymentsRepo$registerForDirectPayment$2 extends Lambda implements l<GetPaymentRegistrationResponse, i> {
    public final /* synthetic */ PaymentsRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRepo$registerForDirectPayment$2(PaymentsRepo paymentsRepo) {
        super(1);
        this.c = paymentsRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((GetPaymentRegistrationResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-GetPaymentRegistration-Success");
        return i.a;
    }
}
