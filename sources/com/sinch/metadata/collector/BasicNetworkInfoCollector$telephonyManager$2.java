package com.sinch.metadata.collector;

import android.telephony.TelephonyManager;
import com.stripe.android.model.PaymentMethod;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: BasicNetworkInfoCollector.kt */
public final class BasicNetworkInfoCollector$telephonyManager$2 extends Lambda implements a<TelephonyManager> {
    public final /* synthetic */ BasicNetworkInfoCollector c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicNetworkInfoCollector$telephonyManager$2(BasicNetworkInfoCollector basicNetworkInfoCollector) {
        super(0);
        this.c = basicNetworkInfoCollector;
    }

    public Object invoke() {
        Object systemService = this.c.d.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }
}
