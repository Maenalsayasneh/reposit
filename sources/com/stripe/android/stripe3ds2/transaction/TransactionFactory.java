package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.security.MessageTransformerFactory;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0001\u0018\u00002\u00020\u0001:\u0001\u0015JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "", "", "directoryServerId", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "", "isLiveMode", "Lcom/stripe/android/stripe3ds2/views/Brand;", "brand", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "create", "(Ljava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;ZLcom/stripe/android/stripe3ds2/views/Brand;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TransactionFactory.kt */
public interface TransactionFactory {
    Transaction create(String str, List<? extends X509Certificate> list, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, StripeUiCustomization stripeUiCustomization, boolean z, Brand brand);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BO\b\u0000\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b2\u00103JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory$Default;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "", "directoryServerId", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "", "isLiveMode", "Lcom/stripe/android/stripe3ds2/views/Brand;", "brand", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "create", "(Ljava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;ZLcom/stripe/android/stripe3ds2/views/Brand;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "challengeStatusReceiverProvider", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;", "messageTransformerFactory", "Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;", "protocolErrorEventFactory", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "areqParamsFactory", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "sdkReferenceNumber", "Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "jwsValidator", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TransactionFactory.kt */
    public static final class Default implements TransactionFactory {
        private final AuthenticationRequestParametersFactory areqParamsFactory;
        private final ChallengeStatusReceiverProvider challengeStatusReceiverProvider;
        private final EphemeralKeyPairGenerator ephemeralKeyPairGenerator;
        private final ErrorReporter errorReporter;
        private final JwsValidator jwsValidator;
        private final Logger logger;
        private final MessageTransformerFactory messageTransformerFactory;
        private final MessageVersionRegistry messageVersionRegistry;
        private final ProtocolErrorEventFactory protocolErrorEventFactory;
        private final String sdkReferenceNumber;

        public Default(AuthenticationRequestParametersFactory authenticationRequestParametersFactory, EphemeralKeyPairGenerator ephemeralKeyPairGenerator2, MessageVersionRegistry messageVersionRegistry2, String str, ErrorReporter errorReporter2, Logger logger2, JwsValidator jwsValidator2, ChallengeStatusReceiverProvider challengeStatusReceiverProvider2) {
            i.e(authenticationRequestParametersFactory, "areqParamsFactory");
            i.e(ephemeralKeyPairGenerator2, "ephemeralKeyPairGenerator");
            i.e(messageVersionRegistry2, "messageVersionRegistry");
            i.e(str, "sdkReferenceNumber");
            i.e(errorReporter2, "errorReporter");
            i.e(logger2, "logger");
            i.e(jwsValidator2, "jwsValidator");
            i.e(challengeStatusReceiverProvider2, "challengeStatusReceiverProvider");
            this.areqParamsFactory = authenticationRequestParametersFactory;
            this.ephemeralKeyPairGenerator = ephemeralKeyPairGenerator2;
            this.messageVersionRegistry = messageVersionRegistry2;
            this.sdkReferenceNumber = str;
            this.errorReporter = errorReporter2;
            this.logger = logger2;
            this.jwsValidator = jwsValidator2;
            this.challengeStatusReceiverProvider = challengeStatusReceiverProvider2;
            this.protocolErrorEventFactory = new ProtocolErrorEventFactory();
            this.messageTransformerFactory = new MessageTransformerFactory(errorReporter2);
        }

        public Transaction create(String str, List<? extends X509Certificate> list, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, StripeUiCustomization stripeUiCustomization, boolean z, Brand brand) {
            PublicKey publicKey2 = publicKey;
            String str3 = str2;
            SdkTransactionId sdkTransactionId2 = sdkTransactionId;
            boolean z2 = z;
            i.e(str, "directoryServerId");
            i.e(list, "rootCerts");
            i.e(publicKey, "directoryServerPublicKey");
            i.e(sdkTransactionId, "sdkTransactionId");
            i.e(brand, AccountRangeJsonParser.FIELD_BRAND);
            KeyPair generate = this.ephemeralKeyPairGenerator.generate();
            return new StripeTransaction(this.areqParamsFactory, this.challengeStatusReceiverProvider, this.messageVersionRegistry, this.sdkReferenceNumber, this.jwsValidator, this.protocolErrorEventFactory, str, publicKey2, str3, sdkTransactionId2, generate, z2, list, this.messageTransformerFactory.create(z), stripeUiCustomization, this.logger, this.errorReporter);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Default(com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParametersFactory r12, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator r13, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r14, java.lang.String r15, com.stripe.android.stripe3ds2.observability.ErrorReporter r16, com.stripe.android.stripe3ds2.transaction.Logger r17, com.stripe.android.stripe3ds2.transaction.JwsValidator r18, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider r19, int r20, m0.n.b.f r21) {
            /*
                r11 = this;
                r0 = r20
                r1 = r0 & 32
                if (r1 == 0) goto L_0x000e
                com.stripe.android.stripe3ds2.transaction.Logger$Companion r1 = com.stripe.android.stripe3ds2.transaction.Logger.Companion
                com.stripe.android.stripe3ds2.transaction.Logger r1 = r1.noop$3ds2sdk_release()
                r8 = r1
                goto L_0x0010
            L_0x000e:
                r8 = r17
            L_0x0010:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x001d
                com.stripe.android.stripe3ds2.transaction.JwsValidator$Default r1 = new com.stripe.android.stripe3ds2.transaction.JwsValidator$Default
                r7 = r16
                r1.<init>(r7)
                r9 = r1
                goto L_0x0021
            L_0x001d:
                r7 = r16
                r9 = r18
            L_0x0021:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0029
                com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider$Default r0 = com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider.Default.INSTANCE
                r10 = r0
                goto L_0x002b
            L_0x0029:
                r10 = r19
            L_0x002b:
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.TransactionFactory.Default.<init>(com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParametersFactory, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry, java.lang.String, com.stripe.android.stripe3ds2.observability.ErrorReporter, com.stripe.android.stripe3ds2.transaction.Logger, com.stripe.android.stripe3ds2.transaction.JwsValidator, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider, int, m0.n.b.f):void");
        }
    }
}
