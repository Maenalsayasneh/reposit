package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lm0/i;", "put", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;)V", "get", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "clear", "()V", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeStatusReceiverProvider.kt */
public interface ChallengeStatusReceiverProvider {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lm0/i;", "put", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;)V", "get", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "clear", "()V", "", "receivers", "Ljava/util/Map;", "<init>", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeStatusReceiverProvider.kt */
    public static final class Default implements ChallengeStatusReceiverProvider {
        public static final Default INSTANCE = new Default();
        private static final Map<SdkTransactionId, ChallengeStatusReceiver> receivers = new LinkedHashMap();

        private Default() {
        }

        public void clear() {
            receivers.clear();
        }

        public ChallengeStatusReceiver get(SdkTransactionId sdkTransactionId) {
            i.e(sdkTransactionId, "sdkTransactionId");
            ChallengeStatusReceiver challengeStatusReceiver = receivers.get(sdkTransactionId);
            if (challengeStatusReceiver != null) {
                return challengeStatusReceiver;
            }
            throw new SDKRuntimeException("No ChallengeStatusReceiver for transaction id " + sdkTransactionId, (Throwable) null, 2, (f) null);
        }

        public void put(SdkTransactionId sdkTransactionId, ChallengeStatusReceiver challengeStatusReceiver) {
            i.e(sdkTransactionId, "sdkTransactionId");
            i.e(challengeStatusReceiver, "challengeStatusReceiver");
            receivers.put(sdkTransactionId, challengeStatusReceiver);
        }
    }

    void clear();

    ChallengeStatusReceiver get(SdkTransactionId sdkTransactionId);

    void put(SdkTransactionId sdkTransactionId, ChallengeStatusReceiver challengeStatusReceiver);
}
