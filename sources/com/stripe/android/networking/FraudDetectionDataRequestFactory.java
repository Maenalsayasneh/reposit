package com.stripe.android.networking;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "", "Lcom/stripe/android/networking/FraudDetectionData;", "arg", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "create", "(Lcom/stripe/android/networking/FraudDetectionData;)Lcom/stripe/android/networking/FraudDetectionDataRequest;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequestFactory.kt */
public interface FraudDetectionDataRequestFactory {
    FraudDetectionDataRequest create(FraudDetectionData fraudDetectionData);
}
