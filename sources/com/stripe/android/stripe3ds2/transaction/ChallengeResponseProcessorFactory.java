package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "", "Ljavax/crypto/SecretKey;", "secretKey", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "create", "(Ljavax/crypto/SecretKey;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeResponseProcessorFactory.kt */
public interface ChallengeResponseProcessorFactory {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "Ljavax/crypto/SecretKey;", "secretKey", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "create", "(Ljavax/crypto/SecretKey;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseProcessorFactory.kt */
    public static final class Default implements ChallengeResponseProcessorFactory {
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;

        public Default(MessageTransformer messageTransformer2, ErrorReporter errorReporter2) {
            i.e(messageTransformer2, "messageTransformer");
            i.e(errorReporter2, "errorReporter");
            this.messageTransformer = messageTransformer2;
            this.errorReporter = errorReporter2;
        }

        public ChallengeResponseProcessor.Default create(SecretKey secretKey) {
            i.e(secretKey, "secretKey");
            return new ChallengeResponseProcessor.Default(this.messageTransformer, secretKey, this.errorReporter);
        }
    }

    ChallengeResponseProcessor create(SecretKey secretKey);
}
