package com.stripe.android.stripe3ds2.service;

import android.content.Context;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.exceptions.SDKAlreadyInitializedException;
import com.stripe.android.stripe3ds2.exceptions.SDKNotInitializedException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.PublicKeyFactory;
import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.transaction.TransactionFactory;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import com.stripe.android.stripe3ds2.utils.ParcelUtils;
import com.stripe.android.stripe3ds2.views.Brand;
import i0.d.a.a.a;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 W2\u00020\u0001:\u0001WBI\b\u0001\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bF\u0010GB\u001b\b\u0017\u0012\u0006\u0010I\u001a\u00020H\u0012\b\b\u0002\u0010J\u001a\u00020\u0005¢\u0006\u0004\bF\u0010KB#\b\u0016\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\b\b\u0002\u0010J\u001a\u00020\u0005¢\u0006\u0004\bF\u0010MB1\b\u0012\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bF\u0010PB9\b\u0012\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\bF\u0010QBY\b\u0012\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bF\u0010VJY\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u001dJ1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u001eJQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u0015R*\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010!\u0012\u0004\b&\u0010\u0015\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\b8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006X"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "", "directoryServerID", "messageVersion", "", "isLiveMode", "directoryServerName", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "dsPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "createTransaction", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Lm0/i;", "requireInitialization", "()V", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "copyUiCustomization", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "initialize", "(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "cleanup", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getUiCustomization$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "setUiCustomization$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "getUiCustomization$3ds2sdk_release$annotations", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "getSdkVersion", "()Ljava/lang/String;", "sdkVersion", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecker", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "transactionFactory", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "publicKeyFactory", "Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "challengeStatusReceiverProvider", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;", "Lcom/stripe/android/stripe3ds2/init/Warning;", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;)V", "Landroid/content/Context;", "context", "enableLogging", "(Landroid/content/Context;Z)V", "sdkReferenceNumber", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "logger", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;", "hardwareIdSupplier", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiverProvider;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeThreeDs2ServiceImpl.kt */
public final class StripeThreeDs2ServiceImpl implements StripeThreeDs2Service {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String SDK_VERSION = "1.0.0";
    @Deprecated
    private static final String STRIPE_SDK_REFERENCE_NUMBER = "3DS_LOA_SDK_STIN_020100_00142";
    private final ChallengeStatusReceiverProvider challengeStatusReceiverProvider;
    private final ErrorReporter errorReporter;
    private final ImageCache imageCache;
    private final AtomicBoolean isInitialized;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PublicKeyFactory publicKeyFactory;
    private final SecurityChecker securityChecker;
    private final TransactionFactory transactionFactory;
    private StripeUiCustomization uiCustomization;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl$Companion;", "", "", "SDK_VERSION", "Ljava/lang/String;", "STRIPE_SDK_REFERENCE_NUMBER", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeThreeDs2ServiceImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeThreeDs2ServiceImpl(Context context) {
        this(context, false, 2, (f) null);
    }

    public StripeThreeDs2ServiceImpl(AtomicBoolean atomicBoolean, SecurityChecker securityChecker2, PublicKeyFactory publicKeyFactory2, MessageVersionRegistry messageVersionRegistry2, ImageCache imageCache2, ChallengeStatusReceiverProvider challengeStatusReceiverProvider2, ErrorReporter errorReporter2, TransactionFactory transactionFactory2) {
        i.e(atomicBoolean, "isInitialized");
        i.e(securityChecker2, "securityChecker");
        i.e(publicKeyFactory2, "publicKeyFactory");
        i.e(messageVersionRegistry2, "messageVersionRegistry");
        i.e(imageCache2, "imageCache");
        i.e(challengeStatusReceiverProvider2, "challengeStatusReceiverProvider");
        i.e(errorReporter2, "errorReporter");
        i.e(transactionFactory2, "transactionFactory");
        this.isInitialized = atomicBoolean;
        this.securityChecker = securityChecker2;
        this.publicKeyFactory = publicKeyFactory2;
        this.messageVersionRegistry = messageVersionRegistry2;
        this.imageCache = imageCache2;
        this.challengeStatusReceiverProvider = challengeStatusReceiverProvider2;
        this.errorReporter = errorReporter2;
        this.transactionFactory = transactionFactory2;
    }

    private final StripeUiCustomization copyUiCustomization(StripeUiCustomization stripeUiCustomization) {
        Parcelable.Creator<StripeUiCustomization> creator = StripeUiCustomization.CREATOR;
        i.d(creator, "StripeUiCustomization.CREATOR");
        Parcelable copy = ParcelUtils.copy(stripeUiCustomization, creator);
        i.d(copy, "ParcelUtils.copy(uiCusto…eUiCustomization.CREATOR)");
        return (StripeUiCustomization) copy;
    }

    public static /* synthetic */ void getUiCustomization$3ds2sdk_release$annotations() {
    }

    private final void requireInitialization() {
        if (!this.isInitialized.get()) {
            throw new SDKNotInitializedException();
        }
    }

    public void cleanup() throws SDKNotInitializedException {
        requireInitialization();
        this.imageCache.clear();
        this.challengeStatusReceiverProvider.clear();
    }

    public Transaction createTransaction(String str, String str2) {
        i.e(str, "directoryServerID");
        return createTransaction(str, str2, true, "visa");
    }

    public String getSdkVersion() throws SDKNotInitializedException, SDKRuntimeException {
        requireInitialization();
        return SDK_VERSION;
    }

    public final StripeUiCustomization getUiCustomization$3ds2sdk_release() {
        return this.uiCustomization;
    }

    public List<Warning> getWarnings() {
        return this.securityChecker.getWarnings();
    }

    public void initialize(UiCustomization uiCustomization2) throws InvalidInputException, SDKAlreadyInitializedException, SDKRuntimeException {
        StripeUiCustomization stripeUiCustomization;
        if (this.isInitialized.compareAndSet(false, true)) {
            if (uiCustomization2 instanceof StripeUiCustomization) {
                stripeUiCustomization = copyUiCustomization((StripeUiCustomization) uiCustomization2);
            } else if (uiCustomization2 == null) {
                stripeUiCustomization = null;
            } else {
                throw new InvalidInputException(new RuntimeException("UiCustomization must be an instance of StripeUiCustomization"));
            }
            this.uiCustomization = stripeUiCustomization;
            return;
        }
        throw new SDKAlreadyInitializedException();
    }

    public final void setUiCustomization$3ds2sdk_release(StripeUiCustomization stripeUiCustomization) {
        this.uiCustomization = stripeUiCustomization;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, boolean z, int i, f fVar) {
        this(context, (i & 2) != 0 ? false : z);
    }

    public Transaction createTransaction(String str, String str2, boolean z, String str3) throws InvalidInputException, SDKNotInitializedException, SDKRuntimeException {
        i.e(str, "directoryServerID");
        i.e(str3, "directoryServerName");
        return createTransaction(str, str2, z, str3, EmptyList.c, this.publicKeyFactory.create(str), (String) null, SdkTransactionId.Companion.create());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, boolean z) {
        this(context, STRIPE_SDK_REFERENCE_NUMBER, z);
        i.e(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, String str, boolean z, int i, f fVar) {
        this(context, str, (i & 4) != 0 ? false : z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StripeThreeDs2ServiceImpl(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "sdkReferenceNumber"
            m0.n.b.i.e(r9, r0)
            com.stripe.android.stripe3ds2.utils.ImageCache$Default r3 = com.stripe.android.stripe3ds2.utils.ImageCache.Default.INSTANCE
            com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider$Default r4 = com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider.Default.INSTANCE
            if (r10 == 0) goto L_0x0017
            com.stripe.android.stripe3ds2.transaction.Logger$Companion r10 = com.stripe.android.stripe3ds2.transaction.Logger.Companion
            com.stripe.android.stripe3ds2.transaction.Logger r10 = r10.real$3ds2sdk_release()
            goto L_0x001d
        L_0x0017:
            com.stripe.android.stripe3ds2.transaction.Logger$Companion r10 = com.stripe.android.stripe3ds2.transaction.Logger.Companion
            com.stripe.android.stripe3ds2.transaction.Logger r10 = r10.noop$3ds2sdk_release()
        L_0x001d:
            r6 = r10
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>((android.content.Context) r2, (com.stripe.android.stripe3ds2.utils.ImageCache) r3, (com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider) r4, (java.lang.String) r5, (com.stripe.android.stripe3ds2.transaction.Logger) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl.<init>(android.content.Context, java.lang.String, boolean):void");
    }

    public Transaction createTransaction(String str, String str2, boolean z, String str3, List<? extends X509Certificate> list, PublicKey publicKey, String str4) throws InvalidInputException, SDKNotInitializedException, SDKRuntimeException {
        i.e(str, "directoryServerID");
        i.e(str3, "directoryServerName");
        i.e(list, "rootCerts");
        PublicKey publicKey2 = publicKey;
        i.e(publicKey2, "dsPublicKey");
        return createTransaction(str, str2, z, str3, list, publicKey2, str4, SdkTransactionId.Companion.create());
    }

    private final Transaction createTransaction(String str, String str2, boolean z, String str3, List<? extends X509Certificate> list, PublicKey publicKey, String str4, SdkTransactionId sdkTransactionId) {
        String str5 = str2;
        requireInitialization();
        if (!this.messageVersionRegistry.isSupported(str5)) {
            StringBuilder P0 = a.P0("Message version is unsupported: ");
            if (str5 == null) {
                str5 = "";
            }
            P0.append(str5);
            throw new InvalidInputException(P0.toString(), (Throwable) null, 2, (f) null);
        }
        return this.transactionFactory.create(str, list, publicKey, str4, sdkTransactionId, this.uiCustomization, z, Brand.Companion.lookup$3ds2sdk_release(str3, this.errorReporter));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private StripeThreeDs2ServiceImpl(android.content.Context r13, com.stripe.android.stripe3ds2.utils.ImageCache r14, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider r15, java.lang.String r16, com.stripe.android.stripe3ds2.transaction.Logger r17) {
        /*
            r12 = this;
            com.stripe.android.stripe3ds2.observability.DefaultErrorReporter r11 = new com.stripe.android.stripe3ds2.observability.DefaultErrorReporter
            android.content.Context r1 = r13.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            m0.n.b.i.d(r1, r0)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 246(0xf6, float:3.45E-43)
            r10 = 0
            r0 = r11
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl.<init>(android.content.Context, com.stripe.android.stripe3ds2.utils.ImageCache, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider, java.lang.String, com.stripe.android.stripe3ds2.transaction.Logger):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private StripeThreeDs2ServiceImpl(android.content.Context r12, com.stripe.android.stripe3ds2.utils.ImageCache r13, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider r14, java.lang.String r15, com.stripe.android.stripe3ds2.transaction.Logger r16, com.stripe.android.stripe3ds2.observability.ErrorReporter r17) {
        /*
            r11 = this;
            com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator r7 = new com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator
            r6 = r17
            r7.<init>(r6)
            com.stripe.android.stripe3ds2.init.HardwareIdSupplier r8 = new com.stripe.android.stripe3ds2.init.HardwareIdSupplier
            r1 = r12
            r8.<init>(r12)
            com.stripe.android.stripe3ds2.init.SecurityChecker$Default r9 = new com.stripe.android.stripe3ds2.init.SecurityChecker$Default
            r0 = 0
            r2 = 1
            r9.<init>(r0, r2, r0)
            com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r10 = new com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry
            r10.<init>()
            r0 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl.<init>(android.content.Context, com.stripe.android.stripe3ds2.utils.ImageCache, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider, java.lang.String, com.stripe.android.stripe3ds2.transaction.Logger, com.stripe.android.stripe3ds2.observability.ErrorReporter):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private StripeThreeDs2ServiceImpl(android.content.Context r18, com.stripe.android.stripe3ds2.utils.ImageCache r19, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider r20, java.lang.String r21, com.stripe.android.stripe3ds2.transaction.Logger r22, com.stripe.android.stripe3ds2.observability.ErrorReporter r23, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator r24, com.stripe.android.stripe3ds2.init.HardwareIdSupplier r25, com.stripe.android.stripe3ds2.init.SecurityChecker r26, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r27) {
        /*
            r17 = this;
            r0 = r18
            r1 = r25
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            com.stripe.android.stripe3ds2.security.PublicKeyFactory r3 = new com.stripe.android.stripe3ds2.security.PublicKeyFactory
            r15 = r23
            r3.<init>(r0, r15)
            com.stripe.android.stripe3ds2.transaction.TransactionFactory$Default r16 = new com.stripe.android.stripe3ds2.transaction.TransactionFactory$Default
            com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory r13 = new com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory
            com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl r5 = new com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl
            android.content.Context r4 = r18.getApplicationContext()
            java.lang.String r6 = "context.applicationContext"
            m0.n.b.i.d(r4, r6)
            r5.<init>(r4, r1)
            com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl r6 = new com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl
            r6.<init>(r1)
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository r9 = new com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository
            r9.<init>(r0)
            r4 = r13
            r7 = r26
            r8 = r24
            r10 = r27
            r11 = r21
            r12 = r23
            r4.<init>((com.stripe.android.stripe3ds2.init.DeviceDataFactory) r5, (com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory) r6, (com.stripe.android.stripe3ds2.init.SecurityChecker) r7, (com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator) r8, (com.stripe.android.stripe3ds2.init.AppInfoRepository) r9, (com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry) r10, (java.lang.String) r11, (com.stripe.android.stripe3ds2.observability.ErrorReporter) r12)
            r11 = 0
            r12 = 0
            r0 = 192(0xc0, float:2.69E-43)
            r14 = 0
            r4 = r16
            r5 = r13
            r6 = r24
            r7 = r27
            r8 = r21
            r9 = r23
            r10 = r22
            r13 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r17
            r1 = r2
            r2 = r26
            r4 = r27
            r5 = r19
            r6 = r20
            r7 = r23
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl.<init>(android.content.Context, com.stripe.android.stripe3ds2.utils.ImageCache, com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider, java.lang.String, com.stripe.android.stripe3ds2.transaction.Logger, com.stripe.android.stripe3ds2.observability.ErrorReporter, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator, com.stripe.android.stripe3ds2.init.HardwareIdSupplier, com.stripe.android.stripe3ds2.init.SecurityChecker, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry):void");
    }
}
