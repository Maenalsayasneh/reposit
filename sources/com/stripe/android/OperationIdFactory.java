package com.stripe.android;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bà\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/OperationIdFactory;", "", "", "create", "()Ljava/lang/String;", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OperationIdFactory.kt */
public interface OperationIdFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/OperationIdFactory$Companion;", "", "Lcom/stripe/android/OperationIdFactory;", "get$payments_core_release", "()Lcom/stripe/android/OperationIdFactory;", "get", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: OperationIdFactory.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final /* synthetic */ OperationIdFactory get$payments_core_release() {
            return new StripeOperationIdFactory();
        }
    }

    String create();
}
