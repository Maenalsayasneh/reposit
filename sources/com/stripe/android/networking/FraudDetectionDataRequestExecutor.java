package com.stripe.android.networking;

import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestExecutor;", "", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "request", "Lcom/stripe/android/networking/FraudDetectionData;", "execute", "(Lcom/stripe/android/networking/FraudDetectionDataRequest;Lm0/l/c;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequestExecutor.kt */
public interface FraudDetectionDataRequestExecutor {
    Object execute(FraudDetectionDataRequest fraudDetectionDataRequest, c<? super FraudDetectionData> cVar);
}
