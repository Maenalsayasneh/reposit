package com.sinch.verification.flashcall.verification.interceptor;

import android.telephony.TelephonyManager;
import com.stripe.android.model.PaymentMethod;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: FlashCallInterceptor.kt */
public final class FlashCallInterceptor$telephonyManager$2 extends Lambda implements a<TelephonyManager> {
    public final /* synthetic */ FlashCallInterceptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashCallInterceptor$telephonyManager$2(FlashCallInterceptor flashCallInterceptor) {
        super(0);
        this.c = flashCallInterceptor;
    }

    public Object invoke() {
        Object systemService = this.c.n.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }
}
