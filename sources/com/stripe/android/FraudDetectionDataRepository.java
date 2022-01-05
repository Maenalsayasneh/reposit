package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/stripe/android/FraudDetectionDataRepository;", "", "Lm0/i;", "refresh", "()V", "Lcom/stripe/android/networking/FraudDetectionData;", "getCached", "()Lcom/stripe/android/networking/FraudDetectionData;", "getLatest", "(Lm0/l/c;)Ljava/lang/Object;", "fraudDetectionData", "save", "(Lcom/stripe/android/networking/FraudDetectionData;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRepository.kt */
public interface FraudDetectionDataRepository {
    FraudDetectionData getCached();

    Object getLatest(c<? super FraudDetectionData> cVar);

    void refresh();

    void save(FraudDetectionData fraudDetectionData);
}
