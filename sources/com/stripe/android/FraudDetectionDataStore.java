package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/stripe/android/FraudDetectionDataStore;", "", "Lcom/stripe/android/networking/FraudDetectionData;", "get", "(Lm0/l/c;)Ljava/lang/Object;", "fraudDetectionData", "Lm0/i;", "save", "(Lcom/stripe/android/networking/FraudDetectionData;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataStore.kt */
public interface FraudDetectionDataStore {
    Object get(c<? super FraudDetectionData> cVar);

    void save(FraudDetectionData fraudDetectionData);
}
