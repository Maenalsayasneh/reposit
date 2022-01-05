package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PaymentsRepo.kt */
public final class PaymentsRepo$sendDirectPayment$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ PaymentsRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRepo$sendDirectPayment$3(PaymentsRepo paymentsRepo) {
        super(1);
        this.c = paymentsRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.c).a("Server-SendDirectPayment-Error");
        return i.a;
    }
}
