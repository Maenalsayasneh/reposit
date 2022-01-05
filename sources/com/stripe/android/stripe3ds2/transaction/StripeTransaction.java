package com.stripe.android.stripe3ds2.transaction;

import android.app.Activity;
import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.l.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.h2.o;
import n0.a.m0;
import org.json.JSONException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 s2\u00020\u0001:\u0001sB\u0001\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010d\u001a\u00020c\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010_\u001a\u00020\u0010\u0012\u0006\u0010n\u001a\u00020m\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010Y\u001a\u00020\u0010\u0012\u0006\u0010O\u001a\u00020N\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010a\u001a\u00020`\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bq\u0010rJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"H@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J3\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J3\u0010)\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b)\u0010-JC\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b2\u00103J;\u00107\u001a\u00020\b2\u0006\u00104\u001a\u00020\u001f2\u0006\u00106\u001a\u0002052\u0006\u0010,\u001a\u00020+2\u0006\u00101\u001a\u0002002\u0006\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010:JC\u0010=\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0006\u00104\u001a\u00020\u001f2\u0006\u00106\u001a\u0002052\u0006\u0010<\u001a\u00020;2\u0006\u00101\u001a\u0002002\u0006\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010@R\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010@R\u001c\u0010[\u001a\u00020Z8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010@R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010p\u0002\u0004\n\u0002\b\u0019¨\u0006t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeTransaction;", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "data", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lm0/i;", "onProtocolErrorResult", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;)V", "onTimeoutResult", "", "throwable", "onRuntimeErrorResult", "(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;)V", "", "acsSignedContent", "", "isLiveMode", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "getAcsData", "(Ljava/lang/String;ZLjava/util/List;)Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "errorData", "sendErrorData", "(Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "createCreqData", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "createAuthenticationRequestParameters", "(Lm0/l/c;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "", "timeoutMins", "doChallenge", "(Landroid/app/Activity;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;ILm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "host", "(Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;ILm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "result", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "creqExecutorConfig", "onResult", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;ILm0/l/c;)Ljava/lang/Object;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cresData", "onResultSuccess", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;ILm0/l/c;)Ljava/lang/Object;", "close", "()V", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "handleChallengeResponse", "(Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;ILm0/l/c;)Ljava/lang/Object;", "initialChallengeUiType", "Ljava/lang/String;", "getInitialChallengeUiType", "()Ljava/lang/String;", "setInitialChallengeUiType", "(Ljava/lang/String;)V", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Ljava/security/KeyPair;", "sdkKeyPair", "Ljava/security/KeyPair;", "Ljava/security/PublicKey;", "directoryServerPublicKey", "Ljava/security/PublicKey;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "directoryServerKeyId", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "areqParamsFactory", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "directoryServerId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkReferenceNumber", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "challengeStatusReceiverProvider", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;", "protocolErrorEventFactory", "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;", "Z", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "acsDataParser", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "jwsValidator", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "Ljava/util/List;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/KeyPair;ZLjava/util/List;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeTransaction.kt */
public final class StripeTransaction implements Transaction {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int MIN_TIMEOUT = 5;
    private final AcsDataParser acsDataParser;
    private final AuthenticationRequestParametersFactory areqParamsFactory;
    private final ChallengeStatusReceiverProvider challengeStatusReceiverProvider;
    private final String directoryServerId;
    private final String directoryServerKeyId;
    private final PublicKey directoryServerPublicKey;
    private final ErrorReporter errorReporter;
    private String initialChallengeUiType;
    private final boolean isLiveMode;
    private final JwsValidator jwsValidator;
    private final Logger logger;
    private final MessageTransformer messageTransformer;
    private final MessageVersionRegistry messageVersionRegistry;
    private final ProtocolErrorEventFactory protocolErrorEventFactory;
    private final List<X509Certificate> rootCerts;
    private final KeyPair sdkKeyPair;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;
    private final StripeUiCustomization uiCustomization;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeTransaction$Companion;", "", "", "MIN_TIMEOUT", "I", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeTransaction.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeTransaction(AuthenticationRequestParametersFactory authenticationRequestParametersFactory, ChallengeStatusReceiverProvider challengeStatusReceiverProvider2, MessageVersionRegistry messageVersionRegistry2, String str, JwsValidator jwsValidator2, ProtocolErrorEventFactory protocolErrorEventFactory2, String str2, PublicKey publicKey, String str3, SdkTransactionId sdkTransactionId2, KeyPair keyPair, boolean z, List<? extends X509Certificate> list, MessageTransformer messageTransformer2, StripeUiCustomization stripeUiCustomization, Logger logger2, ErrorReporter errorReporter2) {
        AuthenticationRequestParametersFactory authenticationRequestParametersFactory2 = authenticationRequestParametersFactory;
        ChallengeStatusReceiverProvider challengeStatusReceiverProvider3 = challengeStatusReceiverProvider2;
        MessageVersionRegistry messageVersionRegistry3 = messageVersionRegistry2;
        String str4 = str;
        JwsValidator jwsValidator3 = jwsValidator2;
        ProtocolErrorEventFactory protocolErrorEventFactory3 = protocolErrorEventFactory2;
        String str5 = str2;
        PublicKey publicKey2 = publicKey;
        SdkTransactionId sdkTransactionId3 = sdkTransactionId2;
        KeyPair keyPair2 = keyPair;
        List<? extends X509Certificate> list2 = list;
        MessageTransformer messageTransformer3 = messageTransformer2;
        Logger logger3 = logger2;
        ErrorReporter errorReporter3 = errorReporter2;
        i.e(authenticationRequestParametersFactory2, "areqParamsFactory");
        i.e(challengeStatusReceiverProvider3, "challengeStatusReceiverProvider");
        i.e(messageVersionRegistry3, "messageVersionRegistry");
        i.e(str4, "sdkReferenceNumber");
        i.e(jwsValidator3, "jwsValidator");
        i.e(protocolErrorEventFactory3, "protocolErrorEventFactory");
        i.e(str5, "directoryServerId");
        i.e(publicKey2, "directoryServerPublicKey");
        i.e(sdkTransactionId3, "sdkTransactionId");
        i.e(keyPair2, "sdkKeyPair");
        i.e(list2, "rootCerts");
        i.e(messageTransformer3, "messageTransformer");
        i.e(logger3, "logger");
        i.e(errorReporter3, "errorReporter");
        this.areqParamsFactory = authenticationRequestParametersFactory2;
        this.challengeStatusReceiverProvider = challengeStatusReceiverProvider3;
        this.messageVersionRegistry = messageVersionRegistry3;
        this.sdkReferenceNumber = str4;
        this.jwsValidator = jwsValidator3;
        this.protocolErrorEventFactory = protocolErrorEventFactory3;
        this.directoryServerId = str5;
        this.directoryServerPublicKey = publicKey2;
        this.directoryServerKeyId = str3;
        this.sdkTransactionId = sdkTransactionId3;
        this.sdkKeyPair = keyPair2;
        this.isLiveMode = z;
        this.rootCerts = list2;
        this.messageTransformer = messageTransformer3;
        this.uiCustomization = stripeUiCustomization;
        this.logger = logger3;
        this.errorReporter = errorReporter3;
        this.acsDataParser = new AcsDataParser(errorReporter3);
    }

    private final ChallengeRequestData createCreqData(ChallengeParameters challengeParameters) {
        String acsTransactionId = challengeParameters.getAcsTransactionId();
        if (acsTransactionId != null) {
            String threeDsServerTransactionId = challengeParameters.getThreeDsServerTransactionId();
            if (threeDsServerTransactionId != null) {
                return new ChallengeRequestData(this.messageVersionRegistry.getCurrent(), threeDsServerTransactionId, acsTransactionId, getSdkTransactionId(), (String) null, (ChallengeRequestData.CancelReason) null, (String) null, (List) null, (Boolean) null, (Boolean) null, 1008, (f) null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final AcsData getAcsData(String str, boolean z, List<? extends X509Certificate> list) throws ParseException, JOSEException, JSONException, CertificateException {
        return this.acsDataParser.parse(this.jwsValidator.getPayload(str, z, list));
    }

    private final void onProtocolErrorResult(ErrorData errorData, ChallengeStatusReceiver challengeStatusReceiver, ErrorRequestExecutor errorRequestExecutor) {
        sendErrorData(errorRequestExecutor, errorData);
        challengeStatusReceiver.protocolError(this.protocolErrorEventFactory.create(errorData));
    }

    private final void onRuntimeErrorResult(Throwable th, ChallengeStatusReceiver challengeStatusReceiver) {
        challengeStatusReceiver.runtimeError(new RuntimeErrorEvent(th));
    }

    private final void onTimeoutResult(ErrorData errorData, ChallengeStatusReceiver challengeStatusReceiver, ErrorRequestExecutor errorRequestExecutor) {
        sendErrorData(errorRequestExecutor, errorData);
        challengeStatusReceiver.runtimeError(new RuntimeErrorEvent(errorData));
    }

    private final void sendErrorData(ErrorRequestExecutor errorRequestExecutor, ErrorData errorData) {
        errorRequestExecutor.executeAsync(errorData);
    }

    public void close() {
    }

    public Object createAuthenticationRequestParameters(c<? super AuthenticationRequestParameters> cVar) {
        AuthenticationRequestParametersFactory authenticationRequestParametersFactory = this.areqParamsFactory;
        String str = this.directoryServerId;
        PublicKey publicKey = this.directoryServerPublicKey;
        String str2 = this.directoryServerKeyId;
        SdkTransactionId sdkTransactionId2 = getSdkTransactionId();
        PublicKey publicKey2 = this.sdkKeyPair.getPublic();
        i.d(publicKey2, "sdkKeyPair.public");
        return authenticationRequestParametersFactory.create(str, publicKey, str2, sdkTransactionId2, publicKey2, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: com.stripe.android.stripe3ds2.transaction.StripeTransaction} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doChallenge(com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost r21, com.stripe.android.stripe3ds2.transaction.ChallengeParameters r22, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver r23, int r24, m0.l.c<? super m0.i> r25) {
        /*
            r20 = this;
            r1 = r20
            r2 = r23
            r0 = r24
            r3 = r25
            boolean r4 = r3 instanceof com.stripe.android.stripe3ds2.transaction.StripeTransaction$doChallenge$2
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.stripe.android.stripe3ds2.transaction.StripeTransaction$doChallenge$2 r4 = (com.stripe.android.stripe3ds2.transaction.StripeTransaction$doChallenge$2) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.stripe.android.stripe3ds2.transaction.StripeTransaction$doChallenge$2 r4 = new com.stripe.android.stripe3ds2.transaction.StripeTransaction$doChallenge$2
            r4.<init>(r1, r3)
        L_0x0020:
            r12 = r4
            java.lang.Object r3 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r12.label
            r6 = 1
            r7 = 2
            r8 = 0
            if (r5 == 0) goto L_0x0074
            if (r5 == r6) goto L_0x004a
            if (r5 != r7) goto L_0x0042
            java.lang.Object r0 = r12.L$1
            r2 = r0
            com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver r2 = (com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver) r2
            java.lang.Object r0 = r12.L$0
            r4 = r0
            com.stripe.android.stripe3ds2.transaction.StripeTransaction r4 = (com.stripe.android.stripe3ds2.transaction.StripeTransaction) r4
            i0.j.f.p.h.d4(r3)     // Catch:{ all -> 0x003f }
            goto L_0x0124
        L_0x003f:
            r0 = move-exception
            goto L_0x0142
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r0 = r12.I$0
            java.lang.Object r2 = r12.L$5
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config r2 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Config) r2
            java.lang.Object r5 = r12.L$4
            com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor r5 = (com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor) r5
            java.lang.Object r6 = r12.L$3
            com.stripe.android.stripe3ds2.transaction.StripeTransaction r6 = (com.stripe.android.stripe3ds2.transaction.StripeTransaction) r6
            java.lang.Object r9 = r12.L$2
            com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver) r9
            java.lang.Object r10 = r12.L$1
            com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost r10 = (com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost) r10
            java.lang.Object r11 = r12.L$0
            com.stripe.android.stripe3ds2.transaction.StripeTransaction r11 = (com.stripe.android.stripe3ds2.transaction.StripeTransaction) r11
            i0.j.f.p.h.d4(r3)     // Catch:{ all -> 0x006f }
            r7 = r10
            r13 = r11
            r11 = r2
            r10 = r5
            r5 = r6
            r2 = r9
            goto L_0x0107
        L_0x006f:
            r0 = move-exception
            r2 = r9
            r4 = r11
            goto L_0x0142
        L_0x0074:
            i0.j.f.p.h.d4(r3)
            com.stripe.android.stripe3ds2.transaction.Logger r3 = r1.logger
            java.lang.String r5 = "Starting challenge flow."
            r3.info(r5)
            r3 = 5
            if (r0 < r3) goto L_0x0139
            com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider r3 = r1.challengeStatusReceiverProvider     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.SdkTransactionId r5 = r20.getSdkTransactionId()     // Catch:{ all -> 0x0136 }
            r3.put(r5, r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r3 = r22.getAcsSignedContent()     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x012a
            boolean r5 = r1.isLiveMode     // Catch:{ all -> 0x0136 }
            java.util.List<java.security.cert.X509Certificate> r9 = r1.rootCerts     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.AcsData r3 = r1.getAcsData(r3, r5, r9)     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = r3.component1()     // Catch:{ all -> 0x0136 }
            java.security.interfaces.ECPublicKey r3 = r3.component2()     // Catch:{ all -> 0x0136 }
            r9 = r22
            com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r9 = r1.createCreqData(r9)     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$Factory r10 = new com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$Factory     // Catch:{ all -> 0x0136 }
            r10.<init>()     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.observability.ErrorReporter r11 = r1.errorReporter     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor r10 = r10.create(r5, r11)     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config r11 = new com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.security.MessageTransformer r14 = r1.messageTransformer     // Catch:{ all -> 0x0136 }
            java.lang.String r15 = r1.sdkReferenceNumber     // Catch:{ all -> 0x0136 }
            java.security.KeyPair r13 = r1.sdkKeyPair     // Catch:{ all -> 0x0136 }
            java.security.PrivateKey r13 = r13.getPrivate()     // Catch:{ all -> 0x0136 }
            java.lang.String r7 = "sdkKeyPair.private"
            m0.n.b.i.d(r13, r7)     // Catch:{ all -> 0x0136 }
            byte[] r7 = r13.getEncoded()     // Catch:{ all -> 0x0136 }
            java.lang.String r13 = "sdkKeyPair.private.encoded"
            m0.n.b.i.d(r7, r13)     // Catch:{ all -> 0x0136 }
            byte[] r3 = r3.getEncoded()     // Catch:{ all -> 0x0136 }
            java.lang.String r13 = "acsEphemPubKey.encoded"
            m0.n.b.i.d(r3, r13)     // Catch:{ all -> 0x0136 }
            r13 = r11
            r16 = r7
            r17 = r3
            r18 = r5
            r19 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Factory r3 = new com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Factory     // Catch:{ all -> 0x0136 }
            r3.<init>()     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.observability.ErrorReporter r5 = r1.errorReporter     // Catch:{ all -> 0x0136 }
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor r3 = r3.create(r11, r5)     // Catch:{ all -> 0x0136 }
            r12.L$0 = r1     // Catch:{ all -> 0x0136 }
            r5 = r21
            r12.L$1 = r5     // Catch:{ all -> 0x0136 }
            r12.L$2 = r2     // Catch:{ all -> 0x0136 }
            r12.L$3 = r1     // Catch:{ all -> 0x0136 }
            r12.L$4 = r10     // Catch:{ all -> 0x0136 }
            r12.L$5 = r11     // Catch:{ all -> 0x0136 }
            r12.I$0 = r0     // Catch:{ all -> 0x0136 }
            r12.label = r6     // Catch:{ all -> 0x0136 }
            java.lang.Object r3 = r3.execute(r9, r12)     // Catch:{ all -> 0x0136 }
            if (r3 != r4) goto L_0x0104
            return r4
        L_0x0104:
            r13 = r1
            r7 = r5
            r5 = r13
        L_0x0107:
            r6 = r3
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult r6 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult) r6     // Catch:{ all -> 0x0127 }
            r12.L$0 = r13     // Catch:{ all -> 0x0127 }
            r12.L$1 = r2     // Catch:{ all -> 0x0127 }
            r12.L$2 = r8     // Catch:{ all -> 0x0127 }
            r12.L$3 = r8     // Catch:{ all -> 0x0127 }
            r12.L$4 = r8     // Catch:{ all -> 0x0127 }
            r12.L$5 = r8     // Catch:{ all -> 0x0127 }
            r3 = 2
            r12.label = r3     // Catch:{ all -> 0x0127 }
            r8 = r11
            r9 = r2
            r11 = r0
            java.lang.Object r0 = r5.onResult(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0127 }
            if (r0 != r4) goto L_0x0123
            return r4
        L_0x0123:
            r4 = r13
        L_0x0124:
            m0.i r0 = m0.i.a     // Catch:{ all -> 0x003f }
            goto L_0x0146
        L_0x0127:
            r0 = move-exception
            r4 = r13
            goto L_0x0142
        L_0x012a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0136 }
            r3.<init>(r0)     // Catch:{ all -> 0x0136 }
            throw r3     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            r4 = r1
            goto L_0x0142
        L_0x0139:
            com.stripe.android.stripe3ds2.exceptions.InvalidInputException r0 = new com.stripe.android.stripe3ds2.exceptions.InvalidInputException     // Catch:{ all -> 0x0136 }
            java.lang.String r3 = "Timeout must be at least 5 minutes"
            r4 = 2
            r0.<init>(r3, r8, r4, r8)     // Catch:{ all -> 0x0136 }
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0142:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x0146:
            java.lang.Throwable r0 = kotlin.Result.a(r0)
            if (r0 == 0) goto L_0x0160
            com.stripe.android.stripe3ds2.observability.ErrorReporter r3 = r4.errorReporter
            r3.reportError(r0)
            com.stripe.android.stripe3ds2.transaction.Logger r3 = r4.logger
            java.lang.String r4 = "Exception during challenge flow."
            r3.error(r4, r0)
            com.stripe.android.stripe3ds2.transaction.RuntimeErrorEvent r3 = new com.stripe.android.stripe3ds2.transaction.RuntimeErrorEvent
            r3.<init>((java.lang.Throwable) r0)
            r2.runtimeError(r3)
        L_0x0160:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeTransaction.doChallenge(com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost, com.stripe.android.stripe3ds2.transaction.ChallengeParameters, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver, int, m0.l.c):java.lang.Object");
    }

    public String getInitialChallengeUiType() {
        return this.initialChallengeUiType;
    }

    public SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final Object handleChallengeResponse(Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost, ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, int i, c<? super m0.i> cVar) {
        d0 d0Var = m0.a;
        Object k4 = a.k4(o.c, new StripeTransaction$handleChallengeResponse$2(this, challengeResponseData, stripe3ds2ActivityStarterHost, challengeRequestData, stripeUiCustomization, config, i, (c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onResult(com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult r9, com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost r10, com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Config r11, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver r12, com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor r13, int r14, m0.l.c<? super m0.i> r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof com.stripe.android.stripe3ds2.transaction.StripeTransaction$onResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.stripe.android.stripe3ds2.transaction.StripeTransaction$onResult$1 r0 = (com.stripe.android.stripe3ds2.transaction.StripeTransaction$onResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.stripe3ds2.transaction.StripeTransaction$onResult$1 r0 = new com.stripe.android.stripe3ds2.transaction.StripeTransaction$onResult$1
            r0.<init>(r8, r15)
        L_0x0018:
            r7 = r0
            java.lang.Object r15 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            i0.j.f.p.h.d4(r15)
            goto L_0x0078
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0030:
            i0.j.f.p.h.d4(r15)
            boolean r15 = r9 instanceof com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.Success
            if (r15 == 0) goto L_0x004f
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$Success r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.Success) r9
            com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r12 = r9.getCreqData()
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r3 = r9.getCresData()
            r7.label = r2
            r1 = r8
            r2 = r12
            r4 = r10
            r5 = r11
            r6 = r14
            java.lang.Object r9 = r1.onResultSuccess(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L_0x0078
            return r0
        L_0x004f:
            boolean r10 = r9 instanceof com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.ProtocolError
            if (r10 == 0) goto L_0x005d
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$ProtocolError r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.ProtocolError) r9
            com.stripe.android.stripe3ds2.transactions.ErrorData r9 = r9.getData()
            r8.onProtocolErrorResult(r9, r12, r13)
            goto L_0x0078
        L_0x005d:
            boolean r10 = r9 instanceof com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.RuntimeError
            if (r10 == 0) goto L_0x006b
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$RuntimeError r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.RuntimeError) r9
            java.lang.Throwable r9 = r9.getThrowable()
            r8.onRuntimeErrorResult(r9, r12)
            goto L_0x0078
        L_0x006b:
            boolean r10 = r9 instanceof com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.Timeout
            if (r10 == 0) goto L_0x0078
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$Timeout r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult.Timeout) r9
            com.stripe.android.stripe3ds2.transactions.ErrorData r9 = r9.getData()
            r8.onTimeoutResult(r9, r12, r13)
        L_0x0078:
            m0.i r9 = m0.i.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeTransaction.onResult(com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult, com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost, com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver, com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor, int, m0.l.c):java.lang.Object");
    }

    public final Object onResultSuccess(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost, ChallengeRequestExecutor.Config config, int i, c<? super m0.i> cVar) {
        StripeUiCustomization stripeUiCustomization = this.uiCustomization;
        i.c(stripeUiCustomization);
        Object handleChallengeResponse = handleChallengeResponse(stripe3ds2ActivityStarterHost, challengeRequestData, challengeResponseData, stripeUiCustomization, config, i, cVar);
        if (handleChallengeResponse == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return handleChallengeResponse;
        }
        return m0.i.a;
    }

    public void setInitialChallengeUiType(String str) {
        this.initialChallengeUiType = str;
    }

    public Object doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i, c<? super m0.i> cVar) {
        Object doChallenge = doChallenge(new Stripe3ds2ActivityStarterHost(activity), challengeParameters, challengeStatusReceiver, i, cVar);
        if (doChallenge == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return doChallenge;
        }
        return m0.i.a;
    }
}
