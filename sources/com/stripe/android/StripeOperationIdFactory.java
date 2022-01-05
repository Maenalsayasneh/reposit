package com.stripe.android;

import java.util.UUID;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/StripeOperationIdFactory;", "Lcom/stripe/android/OperationIdFactory;", "", "create", "()Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeOperationIdFactory.kt */
public final class StripeOperationIdFactory implements OperationIdFactory {
    public String create() {
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}
