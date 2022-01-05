package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.EcKeyFactory;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 -2\u00020\u0001:\u0002-.BU\b\u0000\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "Lorg/json/JSONObject;", "payload", "", "getRequestBody", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Ljavax/crypto/SecretKey;", "generateSecretKey", "()Ljavax/crypto/SecretKey;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "execute", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "dhKeyGenerator", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "responseProcessor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "sdkReferenceId", "Ljava/lang/String;", "Ljava/security/PrivateKey;", "sdkPrivateKey", "Ljava/security/PrivateKey;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "secretKey", "Ljavax/crypto/SecretKey;", "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "acsUrl", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "responseProcessorFactory", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Ljava/security/PrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;)V", "Companion", "Factory", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeChallengeRequestExecutor.kt */
public final class StripeChallengeRequestExecutor implements ChallengeRequestExecutor {
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final long TIMEOUT = TimeUnit.SECONDS.toMillis(10);
    private final ECPublicKey acsPublicKey;
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    /* access modifiers changed from: private */
    public final ErrorReporter errorReporter;
    /* access modifiers changed from: private */
    public final HttpClient httpClient;
    private final MessageTransformer messageTransformer;
    /* access modifiers changed from: private */
    public final ChallengeResponseProcessor responseProcessor;
    private final PrivateKey sdkPrivateKey;
    private final String sdkReferenceId;
    private final SecretKey secretKey;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Companion;", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "createTimeoutResult", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "", "TIMEOUT", "J", "getTIMEOUT", "()J", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeChallengeRequestExecutor.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final ChallengeRequestResult.Timeout createTimeoutResult(ChallengeRequestData challengeRequestData) {
            SdkTransactionId sdkTransId = challengeRequestData.getSdkTransId();
            String messageVersion = challengeRequestData.getMessageVersion();
            String acsTransId = challengeRequestData.getAcsTransId();
            String threeDsServerTransId = challengeRequestData.getThreeDsServerTransId();
            ProtocolError protocolError = ProtocolError.TransactionTimedout;
            return new ChallengeRequestResult.Timeout(new ErrorData(threeDsServerTransId, acsTransId, (String) null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Challenge request timed-out", ChallengeRequestData.MESSAGE_TYPE, messageVersion, sdkTransId, 4, (f) null));
        }

        public final long getTIMEOUT() {
            return StripeChallengeRequestExecutor.TIMEOUT;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "config", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "create", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeChallengeRequestExecutor.kt */
    public static final class Factory implements ChallengeRequestExecutor.Factory {
        public ChallengeRequestExecutor create(ChallengeRequestExecutor.Config config, ErrorReporter errorReporter) {
            ErrorReporter errorReporter2 = errorReporter;
            ChallengeRequestExecutor.Config config2 = config;
            i.e(config, "config");
            i.e(errorReporter2, "errorReporter");
            EcKeyFactory ecKeyFactory = new EcKeyFactory(errorReporter2);
            return new StripeChallengeRequestExecutor(config.getMessageTransformer$3ds2sdk_release(), config.getSdkReferenceId$3ds2sdk_release(), ecKeyFactory.createPrivate(config.getSdkPrivateKeyEncoded$3ds2sdk_release()), ecKeyFactory.createPublic(config.getAcsPublicKeyEncoded$3ds2sdk_release()), config.getAcsUrl$3ds2sdk_release(), errorReporter2, new StripeDiffieHellmanKeyGenerator(errorReporter2), (HttpClient) null, (ChallengeResponseProcessorFactory) null, 384, (f) null);
        }
    }

    public StripeChallengeRequestExecutor(MessageTransformer messageTransformer2, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, ErrorReporter errorReporter2, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator, HttpClient httpClient2, ChallengeResponseProcessorFactory challengeResponseProcessorFactory) {
        i.e(messageTransformer2, "messageTransformer");
        i.e(str, "sdkReferenceId");
        i.e(privateKey, "sdkPrivateKey");
        i.e(eCPublicKey, "acsPublicKey");
        i.e(str2, "acsUrl");
        i.e(errorReporter2, "errorReporter");
        i.e(diffieHellmanKeyGenerator, "dhKeyGenerator");
        i.e(httpClient2, "httpClient");
        i.e(challengeResponseProcessorFactory, "responseProcessorFactory");
        this.messageTransformer = messageTransformer2;
        this.sdkReferenceId = str;
        this.sdkPrivateKey = privateKey;
        this.acsPublicKey = eCPublicKey;
        this.errorReporter = errorReporter2;
        this.dhKeyGenerator = diffieHellmanKeyGenerator;
        this.httpClient = httpClient2;
        SecretKey generateSecretKey = generateSecretKey();
        this.secretKey = generateSecretKey;
        this.responseProcessor = challengeResponseProcessorFactory.create(generateSecretKey);
    }

    private final SecretKey generateSecretKey() {
        DiffieHellmanKeyGenerator diffieHellmanKeyGenerator = this.dhKeyGenerator;
        ECPublicKey eCPublicKey = this.acsPublicKey;
        PrivateKey privateKey = this.sdkPrivateKey;
        Objects.requireNonNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return diffieHellmanKeyGenerator.generate(eCPublicKey, (ECPrivateKey) privateKey, this.sdkReferenceId);
    }

    /* access modifiers changed from: private */
    public final String getRequestBody(JSONObject jSONObject) throws JSONException, JOSEException {
        return this.messageTransformer.encrypt(jSONObject, this.secretKey);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execute(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r7, m0.l.c<? super com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1 r0 = (com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1 r0 = new com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.L$0
            com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r7 = (com.stripe.android.stripe3ds2.transactions.ChallengeRequestData) r7
            i0.j.f.p.h.d4(r8)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            i0.j.f.p.h.d4(r8)
            long r4 = TIMEOUT
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2 r8 = new com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2
            r2 = 0
            r8.<init>(r6, r7, r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = n0.a.i.b(r4, r8, r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult r8 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult) r8
            if (r8 == 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Companion r8 = Companion
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$Timeout r8 = r8.createTimeoutResult(r7)
        L_0x0054:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor.execute(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StripeChallengeRequestExecutor(com.stripe.android.stripe3ds2.security.MessageTransformer r20, java.lang.String r21, java.security.PrivateKey r22, java.security.interfaces.ECPublicKey r23, java.lang.String r24, com.stripe.android.stripe3ds2.observability.ErrorReporter r25, com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator r26, com.stripe.android.stripe3ds2.transaction.HttpClient r27, com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory r28, int r29, m0.n.b.f r30) {
        /*
            r19 = this;
            r0 = r29
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0018
            com.stripe.android.stripe3ds2.transaction.StripeHttpClient r1 = new com.stripe.android.stripe3ds2.transaction.StripeHttpClient
            r4 = 0
            r6 = 0
            r7 = 10
            r8 = 0
            r2 = r1
            r3 = r24
            r5 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r17 = r1
            goto L_0x001a
        L_0x0018:
            r17 = r27
        L_0x001a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002a
            com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory$Default r0 = new com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory$Default
            r1 = r20
            r2 = r25
            r0.<init>(r1, r2)
            r18 = r0
            goto L_0x0030
        L_0x002a:
            r1 = r20
            r2 = r25
            r18 = r28
        L_0x0030:
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r15 = r25
            r16 = r26
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor.<init>(com.stripe.android.stripe3ds2.security.MessageTransformer, java.lang.String, java.security.PrivateKey, java.security.interfaces.ECPublicKey, java.lang.String, com.stripe.android.stripe3ds2.observability.ErrorReporter, com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator, com.stripe.android.stripe3ds2.transaction.HttpClient, com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory, int, m0.n.b.f):void");
    }
}
