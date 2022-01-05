package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "VerificationSuccessful", "VerificationDenied", "VerificationNotPerformed", "VerificationAttempted", "ChallengeAdditionalAuth", "ChallengeDecoupledAuth", "VerificationRejected", "InformationOnly", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TransactionStatus.kt */
public enum TransactionStatus {
    VerificationSuccessful("Y"),
    VerificationDenied("N"),
    VerificationNotPerformed("U"),
    VerificationAttempted("A"),
    ChallengeAdditionalAuth(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE),
    ChallengeDecoupledAuth("D"),
    VerificationRejected("R"),
    InformationOnly("I");
    
    public static final Companion Companion = null;
    private final String code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;", "", "", "code", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TransactionStatus.kt */
    public static final class Companion {
        private Companion() {
        }

        public final TransactionStatus fromCode(String str) {
            if (str == null) {
                return null;
            }
            TransactionStatus[] values = TransactionStatus.values();
            for (int i = 0; i < 8; i++) {
                TransactionStatus transactionStatus = values[i];
                if (i.a(transactionStatus.getCode(), str)) {
                    return transactionStatus;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private TransactionStatus(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
