package com.stripe.android;

import android.content.Context;
import android.util.Log;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.d0;
import n0.a.h2.o;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u0001:\u00057689:B9\b\u0001\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b4\u00105J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/stripe/android/IssuingCardPinService;", "", "Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "operation", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "listener", "Lm0/i;", "fireRetrievePinRequest", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;)V", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "fireUpdatePinRequest", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;)V", "logMissingListener", "()V", "", "cardId", "verificationId", "userOneTimeCode", "retrievePin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;)V", "newPin", "updatePin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;)V", "", "throwable", "onRetrievePinError", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;Lm0/l/c;)Ljava/lang/Object;", "onUpdatePinError", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lm0/l/c;)Ljava/lang/Object;", "", "retrievalListeners", "Ljava/util/Map;", "stripeAccountId", "Ljava/lang/String;", "updateListeners", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/EphemeralKeyManager;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "Lcom/stripe/android/OperationIdFactory;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "Lcom/stripe/android/EphemeralKeyProvider;", "keyProvider", "<init>", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/OperationIdFactory;Ljava/lang/String;Lm0/l/e;)V", "Companion", "CardPinActionError", "IssuingCardPinRetrievalListener", "IssuingCardPinUpdateListener", "Listener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IssuingCardPinService.kt */
public final class IssuingCardPinService {
    public static final Companion Companion = new Companion((f) null);
    private static final String TAG = IssuingCardPinService.class.getName();
    private final EphemeralKeyManager ephemeralKeyManager;
    private final OperationIdFactory operationIdFactory;
    /* access modifiers changed from: private */
    public final Map<String, IssuingCardPinRetrievalListener> retrievalListeners;
    /* access modifiers changed from: private */
    public final String stripeAccountId;
    /* access modifiers changed from: private */
    public final StripeRepository stripeRepository;
    /* access modifiers changed from: private */
    public final Map<String, IssuingCardPinUpdateListener> updateListeners;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN_ERROR", "EPHEMERAL_KEY_ERROR", "ONE_TIME_CODE_INCORRECT", "ONE_TIME_CODE_EXPIRED", "ONE_TIME_CODE_TOO_MANY_ATTEMPTS", "ONE_TIME_CODE_ALREADY_REDEEMED", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: IssuingCardPinService.kt */
    public enum CardPinActionError {
        UNKNOWN_ERROR,
        EPHEMERAL_KEY_ERROR,
        ONE_TIME_CODE_INCORRECT,
        ONE_TIME_CODE_EXPIRED,
        ONE_TIME_CODE_TOO_MANY_ATTEMPTS,
        ONE_TIME_CODE_ALREADY_REDEEMED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\fR\u001e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$Companion;", "", "Landroid/content/Context;", "context", "Lcom/stripe/android/EphemeralKeyProvider;", "keyProvider", "Lcom/stripe/android/IssuingCardPinService;", "create", "(Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;", "", "publishableKey", "stripeAccountId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: IssuingCardPinService.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ IssuingCardPinService create$default(Companion companion, Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(context, str, str2, ephemeralKeyProvider);
        }

        public final IssuingCardPinService create(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
            i.e(context, "context");
            i.e(ephemeralKeyProvider, "keyProvider");
            PaymentConfiguration instance = PaymentConfiguration.Companion.getInstance(context);
            return create(context, instance.getPublishableKey(), instance.getStripeAccountId(), ephemeralKeyProvider);
        }

        public final IssuingCardPinService create(Context context, String str, EphemeralKeyProvider ephemeralKeyProvider) {
            return create$default(this, context, str, (String) null, ephemeralKeyProvider, 4, (Object) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final IssuingCardPinService create(Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider) {
            Context context2 = context;
            i.e(context2, "context");
            String str3 = str;
            i.e(str3, "publishableKey");
            i.e(ephemeralKeyProvider, "keyProvider");
            StripeApiRepository stripeApiRepository = new StripeApiRepository(context2, str3, Stripe.Companion.getAppInfo(), (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8184, (f) null);
            return new IssuingCardPinService(ephemeralKeyProvider, stripeApiRepository, new StripeOperationIdFactory(), str2, (e) null, 16, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "", "pin", "Lm0/i;", "onIssuingCardPinRetrieved", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: IssuingCardPinService.kt */
    public interface IssuingCardPinRetrievalListener extends Listener {
        void onIssuingCardPinRetrieved(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "Lm0/i;", "onIssuingCardPinUpdated", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: IssuingCardPinService.kt */
    public interface IssuingCardPinUpdateListener extends Listener {
        void onIssuingCardPinUpdated();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$Listener;", "", "Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "errorCode", "", "errorMessage", "", "exception", "Lm0/i;", "onError", "(Lcom/stripe/android/IssuingCardPinService$CardPinActionError;Ljava/lang/String;Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: IssuingCardPinService.kt */
    public interface Listener {
        void onError(CardPinActionError cardPinActionError, String str, Throwable th);
    }

    public IssuingCardPinService(EphemeralKeyProvider ephemeralKeyProvider, StripeRepository stripeRepository2, OperationIdFactory operationIdFactory2, String str, e eVar) {
        i.e(ephemeralKeyProvider, "keyProvider");
        i.e(stripeRepository2, "stripeRepository");
        i.e(operationIdFactory2, "operationIdFactory");
        i.e(eVar, "workContext");
        this.stripeRepository = stripeRepository2;
        this.operationIdFactory = operationIdFactory2;
        this.stripeAccountId = str;
        this.workContext = eVar;
        this.retrievalListeners = new LinkedHashMap();
        this.updateListeners = new LinkedHashMap();
        this.ephemeralKeyManager = new EphemeralKeyManager(ephemeralKeyProvider, new IssuingCardPinService$ephemeralKeyManager$1(this), operationIdFactory2, true, (a) null, 0, 48, (f) null);
    }

    public static final IssuingCardPinService create(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, ephemeralKeyProvider);
    }

    public static final IssuingCardPinService create(Context context, String str, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create$default(Companion, context, str, (String) null, ephemeralKeyProvider, 4, (Object) null);
    }

    public static final IssuingCardPinService create(Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, str, str2, ephemeralKeyProvider);
    }

    /* access modifiers changed from: private */
    public final void fireRetrievePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.RetrievePin retrievePin, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener) {
        m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new IssuingCardPinService$fireRetrievePinRequest$1(this, retrievePin, ephemeralKey, issuingCardPinRetrievalListener, (c) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void fireUpdatePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.UpdatePin updatePin, IssuingCardPinUpdateListener issuingCardPinUpdateListener) {
        m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new IssuingCardPinService$fireUpdatePinRequest$1(this, updatePin, ephemeralKey, issuingCardPinUpdateListener, (c) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void logMissingListener() {
        String str = TAG;
        Log.e(str, IssuingCardPinService.class.getName() + " was called without a listener");
    }

    public final Object onRetrievePinError(Throwable th, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, c<? super m0.i> cVar) {
        d0 d0Var = m0.a;
        Object k4 = m0.r.t.a.r.m.a1.a.k4(o.c, new IssuingCardPinService$onRetrievePinError$2(th, issuingCardPinRetrievalListener, (c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final Object onUpdatePinError(Throwable th, IssuingCardPinUpdateListener issuingCardPinUpdateListener, c<? super m0.i> cVar) {
        d0 d0Var = m0.a;
        Object k4 = m0.r.t.a.r.m.a1.a.k4(o.c, new IssuingCardPinService$onUpdatePinError$2(th, issuingCardPinUpdateListener, (c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final void retrievePin(String str, String str2, String str3, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener) {
        i.e(str, "cardId");
        i.e(str2, "verificationId");
        i.e(str3, "userOneTimeCode");
        i.e(issuingCardPinRetrievalListener, "listener");
        String create = this.operationIdFactory.create();
        this.retrievalListeners.put(create, issuingCardPinRetrievalListener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.RetrievePin(str, str2, str3, create));
    }

    public final void updatePin(String str, String str2, String str3, String str4, IssuingCardPinUpdateListener issuingCardPinUpdateListener) {
        i.e(str, "cardId");
        i.e(str2, "newPin");
        i.e(str3, "verificationId");
        i.e(str4, "userOneTimeCode");
        i.e(issuingCardPinUpdateListener, "listener");
        String create = this.operationIdFactory.create();
        this.updateListeners.put(create, issuingCardPinUpdateListener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.UpdatePin(str, str2, str3, str4, create));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IssuingCardPinService(EphemeralKeyProvider ephemeralKeyProvider, StripeRepository stripeRepository2, OperationIdFactory operationIdFactory2, String str, e eVar, int i, f fVar) {
        this(ephemeralKeyProvider, stripeRepository2, (i & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? m0.c : eVar);
    }
}
