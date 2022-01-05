package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.Logger;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 4*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0004 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u00014B3\b\u0002\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010%\u001a\u00020\u000f\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u00101\u001a\u00020\u0007\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b2\u00103J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H¤@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000fH¤@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH$¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\u00020*8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0001\u000256\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/StripeIntent;", "T", "Lcom/stripe/android/StripeIntentResult;", "S", "", "stripeIntent", "", "shouldCancelSource", "shouldCancelIntent", "(Lcom/stripe/android/model/StripeIntent;Z)Z", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "unvalidatedResult", "processResult", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lm0/l/c;)Ljava/lang/Object;", "", "clientSecret", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "", "expandFields", "retrieveStripeIntent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "sourceId", "cancelStripeIntent", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "", "outcomeFromFlow", "failureMessage", "createStripeIntentResult", "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "publishableKey", "Ljava/lang/String;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "getStripeRepository", "()Lcom/stripe/android/networking/StripeRepository;", "Landroid/content/Context;", "context", "enableLogging", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;ZLm0/l/e;)V", "Companion", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowResultProcessor.kt */
public abstract class PaymentFlowResultProcessor<T extends StripeIntent, S extends StripeIntentResult<? extends T>> {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final List<String> EXPAND_PAYMENT_METHOD = h.L2("payment_method");
    /* access modifiers changed from: private */
    public final PaymentFlowFailureMessageFactory failureMessageFactory;
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final String publishableKey;
    private final StripeRepository stripeRepository;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;", "", "", "", "EXPAND_PAYMENT_METHOD", "Ljava/util/List;", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowResultProcessor.kt */
    public static final class Companion {
        private Companion() {
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private PaymentFlowResultProcessor(Context context, String str, StripeRepository stripeRepository2, boolean z, e eVar) {
        this.publishableKey = str;
        this.stripeRepository = stripeRepository2;
        this.workContext = eVar;
        this.logger = Logger.Companion.getInstance$payments_core_release(z);
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
    }

    /* access modifiers changed from: private */
    public final boolean shouldCancelIntent(StripeIntent stripeIntent, boolean z) {
        return z && stripeIntent.requiresAction();
    }

    public abstract Object cancelStripeIntent(T t, ApiRequest.Options options, String str, c<? super T> cVar);

    public abstract S createStripeIntentResult(T t, int i, String str);

    public final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    public final Object processResult(PaymentFlowResult.Unvalidated unvalidated, c<? super S> cVar) {
        return a.k4(this.workContext, new PaymentFlowResultProcessor$processResult$2(this, unvalidated, (c) null), cVar);
    }

    public abstract Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, c<? super T> cVar);

    public /* synthetic */ PaymentFlowResultProcessor(Context context, String str, StripeRepository stripeRepository2, boolean z, e eVar, f fVar) {
        this(context, str, stripeRepository2, z, eVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentFlowResultProcessor(Context context, String str, StripeRepository stripeRepository2, boolean z, e eVar, int i, f fVar) {
        this(context, str, stripeRepository2, z, (i & 16) != 0 ? m0.c : eVar);
    }
}
