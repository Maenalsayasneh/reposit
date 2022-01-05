package com.sinch.metadata.collector.sim;

import android.telephony.TelephonyManager;
import com.stripe.android.model.PaymentMethod;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: BasicSimStateCollector.kt */
public final class BasicSimStateCollector$telephonyManager$2 extends Lambda implements a<TelephonyManager> {
    public final /* synthetic */ BasicSimStateCollector c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicSimStateCollector$telephonyManager$2(BasicSimStateCollector basicSimStateCollector) {
        super(0);
        this.c = basicSimStateCollector;
    }

    public Object invoke() {
        Object systemService = this.c.b.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }
}
