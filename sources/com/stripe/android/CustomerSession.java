package com.stripe.android;

import android.content.Context;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 t2\u00020\u0001:\u0006tuvwxyB[\b\u0001\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u0010n\u001a\u00020\n\u0012\b\u0010o\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010X\u001a\u00020W\u0012\b\b\u0002\u0010`\u001a\u00020_\u0012\u0012\b\u0002\u0010d\u001a\f\u0012\u0004\u0012\u00020M0bj\u0002`c\u0012\u0006\u0010q\u001a\u00020p¢\u0006\u0004\br\u0010sJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u000f\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J%\u0010\u0015\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020\u0019H\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020#¢\u0006\u0004\b$\u0010%J-\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020#¢\u0006\u0004\b(\u0010%J-\u0010(\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020#H\u0000¢\u0006\u0004\b)\u0010'JC\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102JQ\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u001d\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u000200¢\u0006\u0004\b1\u00105J\u001d\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J-\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u0002062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020\u000eH\u0000¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b<\u0010=J5\u0010<\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0005\u001a\u00020\u000eH\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\u0006H\u0000¢\u0006\u0004\b@\u0010AR\u0015\u0010F\u001a\u0004\u0018\u00010C8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010ER$\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040G8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010Z\u001a\u0004\u0018\u00010C8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010E\"\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR \u0010d\u001a\f\u0012\u0004\u0012\u00020M0bj\u0002`c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020f8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006z"}, d2 = {"Lcom/stripe/android/CustomerSession;", "", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "listener", "Lm0/i;", "startOperation", "(Lcom/stripe/android/EphemeralOperation;Lcom/stripe/android/CustomerSession$RetrievalListener;)V", "L", "", "operationId", "getListener", "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;", "Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "retrieveCurrentCustomer", "(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V", "", "productUsage", "retrieveCurrentCustomer$payments_core_release", "(Ljava/util/Set;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V", "updateCurrentCustomer", "updateCurrentCustomer$payments_core_release", "sourceId", "sourceType", "Lcom/stripe/android/CustomerSession$SourceRetrievalListener;", "addCustomerSource", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V", "addCustomerSource$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V", "deleteCustomerSource", "(Ljava/lang/String;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V", "deleteCustomerSource$payments_core_release", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V", "paymentMethodId", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "attachPaymentMethod", "(Ljava/lang/String;Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;)V", "attachPaymentMethod$payments_core_release", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;)V", "detachPaymentMethod", "detachPaymentMethod$payments_core_release", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType", "", "limit", "endingBefore", "startingAfter", "Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "getPaymentMethods", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "getPaymentMethods$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "(Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "setCustomerShippingInformation", "(Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V", "setCustomerShippingInformation$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;Ljava/util/Set;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V", "setCustomerDefaultSource", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V", "setCustomerDefaultSource$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V", "cancel$payments_core_release", "()V", "cancel", "Lcom/stripe/android/model/Customer;", "getCachedCustomer", "()Lcom/stripe/android/model/Customer;", "cachedCustomer", "", "listeners", "Ljava/util/Map;", "Lcom/stripe/android/EphemeralKeyManager;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "", "customerCacheTime", "J", "getCustomerCacheTime$payments_core_release", "()J", "setCustomerCacheTime$payments_core_release", "(J)V", "Lcom/stripe/android/CustomerSessionOperationExecutor;", "operationExecutor", "Lcom/stripe/android/CustomerSessionOperationExecutor;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "customer", "Lcom/stripe/android/model/Customer;", "getCustomer$payments_core_release", "setCustomer$payments_core_release", "(Lcom/stripe/android/model/Customer;)V", "Lcom/stripe/android/OperationIdFactory;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "Lkotlin/Function0;", "Lcom/stripe/android/TimeSupplier;", "timeSupplier", "Lm0/n/a/a;", "", "getCanUseCachedCustomer", "()Z", "canUseCachedCustomer", "Landroid/content/Context;", "context", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "publishableKey", "stripeAccountId", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "ephemeralKeyManagerFactory", "<init>", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Lm0/l/e;Lcom/stripe/android/OperationIdFactory;Lm0/n/a/a;Lcom/stripe/android/EphemeralKeyManager$Factory;)V", "Companion", "CustomerRetrievalListener", "PaymentMethodRetrievalListener", "PaymentMethodsRetrievalListener", "RetrievalListener", "SourceRetrievalListener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomerSession.kt */
public final class CustomerSession {
    private static final long CUSTOMER_CACHE_DURATION_MILLISECONDS = TimeUnit.MINUTES.toMillis(1);
    public static final Companion Companion = new Companion((f) null);
    private static final int KEEP_ALIVE_TIME = 2;
    /* access modifiers changed from: private */
    public static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
    private static final int THREAD_POOL_SIZE = 3;
    /* access modifiers changed from: private */
    public static /* synthetic */ CustomerSession instance;
    private /* synthetic */ Customer customer;
    private /* synthetic */ long customerCacheTime;
    private final EphemeralKeyManager ephemeralKeyManager;
    /* access modifiers changed from: private */
    public final Map<String, RetrievalListener> listeners;
    /* access modifiers changed from: private */
    public final CustomerSessionOperationExecutor operationExecutor;
    private final OperationIdFactory operationIdFactory;
    /* access modifiers changed from: private */
    public final a<Long> timeSupplier;
    /* access modifiers changed from: private */
    public final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Lcom/stripe/android/CustomerSession$Companion;", "", "Lm0/l/e;", "createCoroutineDispatcher", "()Lm0/l/e;", "Landroid/content/Context;", "context", "Lcom/stripe/android/EphemeralKeyProvider;", "ephemeralKeyProvider", "", "shouldPrefetchEphemeralKey", "Lm0/i;", "initCustomerSession", "(Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;Z)V", "Lcom/stripe/android/CustomerSession;", "getInstance", "()Lcom/stripe/android/CustomerSession;", "endCustomerSession", "()V", "clearInstance$payments_core_release", "clearInstance", "cancelCallbacks", "instance", "Lcom/stripe/android/CustomerSession;", "getInstance$payments_core_release", "setInstance$payments_core_release", "(Lcom/stripe/android/CustomerSession;)V", "", "CUSTOMER_CACHE_DURATION_MILLISECONDS", "J", "", "KEEP_ALIVE_TIME", "I", "Ljava/util/concurrent/TimeUnit;", "KEEP_ALIVE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "THREAD_POOL_SIZE", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSession.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final e createCoroutineDispatcher() {
            return new x0(new ThreadPoolExecutor(3, 3, (long) 2, CustomerSession.KEEP_ALIVE_TIME_UNIT, new LinkedBlockingQueue()));
        }

        public static /* synthetic */ void initCustomerSession$default(Companion companion, Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            companion.initCustomerSession(context, ephemeralKeyProvider, z);
        }

        public final void cancelCallbacks() {
            CustomerSession instance$payments_core_release = getInstance$payments_core_release();
            if (instance$payments_core_release != null) {
                instance$payments_core_release.cancel$payments_core_release();
            }
        }

        public final /* synthetic */ void clearInstance$payments_core_release() {
            cancelCallbacks();
            setInstance$payments_core_release((CustomerSession) null);
        }

        public final void endCustomerSession() {
            clearInstance$payments_core_release();
        }

        public final CustomerSession getInstance() {
            CustomerSession instance$payments_core_release = getInstance$payments_core_release();
            if (instance$payments_core_release != null) {
                return instance$payments_core_release;
            }
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.".toString());
        }

        public final CustomerSession getInstance$payments_core_release() {
            return CustomerSession.instance;
        }

        public final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
            initCustomerSession$default(this, context, ephemeralKeyProvider, false, 4, (Object) null);
        }

        public final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z) {
            CustomerSession customerSession;
            Context context2 = context;
            EphemeralKeyProvider ephemeralKeyProvider2 = ephemeralKeyProvider;
            i.e(context2, "context");
            i.e(ephemeralKeyProvider2, "ephemeralKeyProvider");
            StripeOperationIdFactory stripeOperationIdFactory = new StripeOperationIdFactory();
            CustomerSession$Companion$initCustomerSession$timeSupplier$1 customerSession$Companion$initCustomerSession$timeSupplier$1 = CustomerSession$Companion$initCustomerSession$timeSupplier$1.INSTANCE;
            EphemeralKeyManager.Factory.Default defaultR = new EphemeralKeyManager.Factory.Default(ephemeralKeyProvider2, z, stripeOperationIdFactory, customerSession$Companion$initCustomerSession$timeSupplier$1);
            PaymentConfiguration instance = PaymentConfiguration.Companion.getInstance(context2);
            Context context3 = context;
            new CustomerSession(context3, new StripeApiRepository(context3, instance.getPublishableKey(), Stripe.Companion.getAppInfo(), (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8184, (f) null), instance.getPublishableKey(), instance.getStripeAccountId(), createCoroutineDispatcher(), stripeOperationIdFactory, customerSession$Companion$initCustomerSession$timeSupplier$1, defaultR);
            setInstance$payments_core_release(customerSession);
        }

        public final void setInstance$payments_core_release(CustomerSession customerSession) {
            CustomerSession.instance = customerSession;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "Lcom/stripe/android/model/Customer;", "customer", "Lm0/i;", "onCustomerRetrieved", "(Lcom/stripe/android/model/Customer;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSession.kt */
    public interface CustomerRetrievalListener extends RetrievalListener {
        void onCustomerRetrieved(Customer customer);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onPaymentMethodRetrieved", "(Lcom/stripe/android/model/PaymentMethod;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSession.kt */
    public interface PaymentMethodRetrievalListener extends RetrievalListener {
        void onPaymentMethodRetrieved(PaymentMethod paymentMethod);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "Lm0/i;", "onPaymentMethodsRetrieved", "(Ljava/util/List;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSession.kt */
    public interface PaymentMethodsRetrievalListener extends RetrievalListener {
        void onPaymentMethodsRetrieved(List<PaymentMethod> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/CustomerSession$RetrievalListener;", "", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "Lm0/i;", "onError", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSession.kt */
    public interface RetrievalListener {
        void onError(int i, String str, StripeError stripeError);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/CustomerSession$SourceRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "Lcom/stripe/android/model/Source;", "source", "Lm0/i;", "onSourceRetrieved", "(Lcom/stripe/android/model/Source;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSession.kt */
    public interface SourceRetrievalListener extends RetrievalListener {
        void onSourceRetrieved(Source source);
    }

    public CustomerSession(Context context, StripeRepository stripeRepository, String str, String str2, e eVar, OperationIdFactory operationIdFactory2, a<Long> aVar, EphemeralKeyManager.Factory factory) {
        i.e(context, "context");
        i.e(stripeRepository, "stripeRepository");
        i.e(str, "publishableKey");
        i.e(eVar, "workContext");
        i.e(operationIdFactory2, "operationIdFactory");
        i.e(aVar, "timeSupplier");
        i.e(factory, "ephemeralKeyManagerFactory");
        this.workContext = eVar;
        this.operationIdFactory = operationIdFactory2;
        this.timeSupplier = aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.listeners = linkedHashMap;
        this.operationExecutor = new CustomerSessionOperationExecutor(stripeRepository, str, str2, linkedHashMap, new CustomerSession$operationExecutor$1(this));
        this.ephemeralKeyManager = factory.create(new CustomerSession$ephemeralKeyManager$1(this));
    }

    public static final void cancelCallbacks() {
        Companion.cancelCallbacks();
    }

    public static final void endCustomerSession() {
        Companion.endCustomerSession();
    }

    private final boolean getCanUseCachedCustomer() {
        return this.customer != null && this.timeSupplier.invoke().longValue() - this.customerCacheTime < CUSTOMER_CACHE_DURATION_MILLISECONDS;
    }

    public static final CustomerSession getInstance() {
        return Companion.getInstance();
    }

    private final <L extends RetrievalListener> L getListener(String str) {
        return (RetrievalListener) this.listeners.remove(str);
    }

    public static /* synthetic */ void getPaymentMethods$default(CustomerSession customerSession, PaymentMethod.Type type, Integer num, String str, String str2, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener, int i, Object obj) {
        customerSession.getPaymentMethods(type, num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, paymentMethodsRetrievalListener);
    }

    public static /* synthetic */ void getPaymentMethods$payments_core_release$default(CustomerSession customerSession, PaymentMethod.Type type, Integer num, String str, String str2, Set set, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener, int i, Object obj) {
        customerSession.getPaymentMethods$payments_core_release(type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, set, paymentMethodsRetrievalListener);
    }

    public static final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        Companion.initCustomerSession$default(Companion, context, ephemeralKeyProvider, false, 4, (Object) null);
    }

    public static final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z) {
        Companion.initCustomerSession(context, ephemeralKeyProvider, z);
    }

    private final void startOperation(EphemeralOperation ephemeralOperation, RetrievalListener retrievalListener) {
        this.listeners.put(ephemeralOperation.getId$payments_core_release(), retrievalListener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(ephemeralOperation);
    }

    public final void addCustomerSource(String str, String str2, SourceRetrievalListener sourceRetrievalListener) {
        i.e(str, "sourceId");
        i.e(str2, "sourceType");
        i.e(sourceRetrievalListener, "listener");
        addCustomerSource$payments_core_release(str, str2, EmptySet.c, sourceRetrievalListener);
    }

    public final /* synthetic */ void addCustomerSource$payments_core_release(String str, String str2, Set<String> set, SourceRetrievalListener sourceRetrievalListener) {
        i.e(str, "sourceId");
        i.e(str2, "sourceType");
        i.e(set, "productUsage");
        i.e(sourceRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.AddSource(str, str2, this.operationIdFactory.create(), set), sourceRetrievalListener);
    }

    public final void attachPaymentMethod(String str, PaymentMethodRetrievalListener paymentMethodRetrievalListener) {
        i.e(str, "paymentMethodId");
        i.e(paymentMethodRetrievalListener, "listener");
        attachPaymentMethod$payments_core_release(str, EmptySet.c, paymentMethodRetrievalListener);
    }

    public final /* synthetic */ void attachPaymentMethod$payments_core_release(String str, Set<String> set, PaymentMethodRetrievalListener paymentMethodRetrievalListener) {
        i.e(str, "paymentMethodId");
        i.e(set, "productUsage");
        i.e(paymentMethodRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.AttachPaymentMethod(str, this.operationIdFactory.create(), set), paymentMethodRetrievalListener);
    }

    public final /* synthetic */ void cancel$payments_core_release() {
        this.listeners.clear();
        m0.r.t.a.r.m.a1.a.p0(this.workContext, (CancellationException) null, 1, (Object) null);
    }

    public final void deleteCustomerSource(String str, SourceRetrievalListener sourceRetrievalListener) {
        i.e(str, "sourceId");
        i.e(sourceRetrievalListener, "listener");
        deleteCustomerSource$payments_core_release(str, EmptySet.c, sourceRetrievalListener);
    }

    public final /* synthetic */ void deleteCustomerSource$payments_core_release(String str, Set<String> set, SourceRetrievalListener sourceRetrievalListener) {
        i.e(str, "sourceId");
        i.e(set, "productUsage");
        i.e(sourceRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.DeleteSource(str, this.operationIdFactory.create(), set), sourceRetrievalListener);
    }

    public final void detachPaymentMethod(String str, PaymentMethodRetrievalListener paymentMethodRetrievalListener) {
        i.e(str, "paymentMethodId");
        i.e(paymentMethodRetrievalListener, "listener");
        detachPaymentMethod$payments_core_release(str, EmptySet.c, paymentMethodRetrievalListener);
    }

    public final /* synthetic */ void detachPaymentMethod$payments_core_release(String str, Set<String> set, PaymentMethodRetrievalListener paymentMethodRetrievalListener) {
        i.e(str, "paymentMethodId");
        i.e(set, "productUsage");
        i.e(paymentMethodRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.DetachPaymentMethod(str, this.operationIdFactory.create(), set), paymentMethodRetrievalListener);
    }

    public final Customer getCachedCustomer() {
        Customer customer2 = this.customer;
        if (getCanUseCachedCustomer()) {
            return customer2;
        }
        return null;
    }

    public final Customer getCustomer$payments_core_release() {
        return this.customer;
    }

    public final long getCustomerCacheTime$payments_core_release() {
        return this.customerCacheTime;
    }

    public final void getPaymentMethods(PaymentMethod.Type type, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener) {
        i.e(type, "paymentMethodType");
        i.e(paymentMethodsRetrievalListener, "listener");
        getPaymentMethods$payments_core_release$default(this, type, (Integer) null, (String) null, (String) null, EmptySet.c, paymentMethodsRetrievalListener, 14, (Object) null);
    }

    public final void getPaymentMethods(PaymentMethod.Type type, Integer num, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener) {
        getPaymentMethods$default(this, type, num, (String) null, (String) null, paymentMethodsRetrievalListener, 12, (Object) null);
    }

    public final void getPaymentMethods(PaymentMethod.Type type, Integer num, String str, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener) {
        getPaymentMethods$default(this, type, num, str, (String) null, paymentMethodsRetrievalListener, 8, (Object) null);
    }

    public final /* synthetic */ void getPaymentMethods$payments_core_release(PaymentMethod.Type type, Integer num, String str, String str2, Set<String> set, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener) {
        i.e(type, "paymentMethodType");
        i.e(set, "productUsage");
        i.e(paymentMethodsRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.GetPaymentMethods(type, num, str, str2, this.operationIdFactory.create(), set), paymentMethodsRetrievalListener);
    }

    public final void retrieveCurrentCustomer(CustomerRetrievalListener customerRetrievalListener) {
        i.e(customerRetrievalListener, "listener");
        retrieveCurrentCustomer$payments_core_release(EmptySet.c, customerRetrievalListener);
    }

    public final /* synthetic */ void retrieveCurrentCustomer$payments_core_release(Set<String> set, CustomerRetrievalListener customerRetrievalListener) {
        i.e(set, "productUsage");
        i.e(customerRetrievalListener, "listener");
        Customer cachedCustomer = getCachedCustomer();
        if (cachedCustomer != null) {
            customerRetrievalListener.onCustomerRetrieved(cachedCustomer);
        } else {
            updateCurrentCustomer$payments_core_release(set, customerRetrievalListener);
        }
    }

    public final void setCustomer$payments_core_release(Customer customer2) {
        this.customer = customer2;
    }

    public final void setCustomerCacheTime$payments_core_release(long j) {
        this.customerCacheTime = j;
    }

    public final void setCustomerDefaultSource(String str, String str2, CustomerRetrievalListener customerRetrievalListener) {
        i.e(str, "sourceId");
        i.e(str2, "sourceType");
        i.e(customerRetrievalListener, "listener");
        setCustomerDefaultSource$payments_core_release(str, str2, EmptySet.c, customerRetrievalListener);
    }

    public final /* synthetic */ void setCustomerDefaultSource$payments_core_release(String str, String str2, Set<String> set, CustomerRetrievalListener customerRetrievalListener) {
        i.e(str, "sourceId");
        i.e(str2, "sourceType");
        i.e(set, "productUsage");
        i.e(customerRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.UpdateDefaultSource(str, str2, this.operationIdFactory.create(), set), customerRetrievalListener);
    }

    public final void setCustomerShippingInformation(ShippingInformation shippingInformation, CustomerRetrievalListener customerRetrievalListener) {
        i.e(shippingInformation, "shippingInformation");
        i.e(customerRetrievalListener, "listener");
        setCustomerShippingInformation$payments_core_release(shippingInformation, EmptySet.c, customerRetrievalListener);
    }

    public final /* synthetic */ void setCustomerShippingInformation$payments_core_release(ShippingInformation shippingInformation, Set<String> set, CustomerRetrievalListener customerRetrievalListener) {
        i.e(shippingInformation, "shippingInformation");
        i.e(set, "productUsage");
        i.e(customerRetrievalListener, "listener");
        startOperation(new EphemeralOperation.Customer.UpdateShipping(shippingInformation, this.operationIdFactory.create(), set), customerRetrievalListener);
    }

    public final void updateCurrentCustomer(CustomerRetrievalListener customerRetrievalListener) {
        i.e(customerRetrievalListener, "listener");
        updateCurrentCustomer$payments_core_release(EmptySet.c, customerRetrievalListener);
    }

    public final /* synthetic */ void updateCurrentCustomer$payments_core_release(Set<String> set, CustomerRetrievalListener customerRetrievalListener) {
        i.e(set, "productUsage");
        i.e(customerRetrievalListener, "listener");
        this.customer = null;
        startOperation(new EphemeralOperation.RetrieveKey(this.operationIdFactory.create(), set), customerRetrievalListener);
    }

    public final void getPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener) {
        i.e(type, "paymentMethodType");
        i.e(paymentMethodsRetrievalListener, "listener");
        getPaymentMethods$payments_core_release(type, num, str, str2, EmptySet.c, paymentMethodsRetrievalListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerSession(Context context, StripeRepository stripeRepository, String str, String str2, e eVar, OperationIdFactory operationIdFactory2, a aVar, EphemeralKeyManager.Factory factory, int i, f fVar) {
        this(context, stripeRepository, str, str2, (i & 16) != 0 ? Companion.createCoroutineDispatcher() : eVar, (i & 32) != 0 ? new StripeOperationIdFactory() : operationIdFactory2, (i & 64) != 0 ? AnonymousClass1.INSTANCE : aVar, factory);
    }
}
