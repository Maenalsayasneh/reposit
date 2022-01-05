package com.sinch.metadata.collector.sim;

import android.content.Context;
import android.telephony.SubscriptionManager;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: ReflectionSafeSimCardInfoCollector.kt */
public final class ReflectionSafeSimCardInfoCollector$subscriptionManager$2 extends Lambda implements a<SubscriptionManager> {
    public final /* synthetic */ Context c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionSafeSimCardInfoCollector$subscriptionManager$2(Context context) {
        super(0);
        this.c = context;
    }

    public Object invoke() {
        Object systemService = this.c.getSystemService("telephony_subscription_service");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
        return (SubscriptionManager) systemService;
    }
}
