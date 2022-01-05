package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.stripe.android.Logger;
import com.stripe.android.R;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.googlepay.StripeGooglePayContractKt;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h0.q.m0;
import h0.q.w;
import h0.q.y;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0001\u0001\u0001\u0001Bt\b\u0000\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010g\u001a\u00020f\u0012\u001a\u0010r\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180q\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010~\u001a\u00020}\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010M\u001a\u00020L\u0012\b\b\u0002\u00106\u001a\u000205\u0012\u0007\u0010\u0001\u001a\u00020\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\u0017\u0010-\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u0015\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010$R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R(\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09088\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:090?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010C\u001a\b\u0012\u0004\u0012\u00020B088\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R(\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0?8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bE\u0010A\u0012\u0004\bH\u0010$\u001a\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010M\u001a\u00020L8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR(\u0010Q\u001a\b\u0012\u0004\u0012\u00020B0?8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bQ\u0010A\u0012\u0004\bS\u0010$\u001a\u0004\bR\u0010GR(\u0010U\u001a\b\u0012\u0004\u0012\u00020T0?8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bU\u0010A\u0012\u0004\bW\u0010$\u001a\u0004\bV\u0010GR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020:0X8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010(R$\u0010`\u001a\u0004\u0018\u00010_8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010l\u001a\b\u0012\u0004\u0012\u00020T088\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bl\u0010<\u001a\u0004\bm\u0010>R\u0016\u0010o\u001a\u00020n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR*\u0010r\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180q8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010sR\"\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001f088\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bt\u0010<\u001a\u0004\bu\u0010>R\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010|\u001a\u00020y8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "", "throwable", "", "apiThrowableToString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lm0/i;", "onStripeIntentFetchResponse", "(Lcom/stripe/android/model/StripeIntent;)V", "onConfirmedStripeIntent", "", "stringResId", "resetViewState", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/Integer;)V", "userErrorMessage", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "confirmPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "Lcom/stripe/android/StripeIntentResult;", "stripeIntentResult", "onStripeIntentResult", "(Lcom/stripe/android/StripeIntentResult;)V", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "checkoutIdentifier", "Lh0/q/w;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "getButtonStateObservable$payments_core_release", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)Lh0/q/w;", "getButtonStateObservable", "fetchIsGooglePayReady", "()V", "updatePaymentMethods", "fetchStripeIntent", "checkout", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "googlePayResult", "onGooglePayResult$payments_core_release", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;)V", "onGooglePayResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "onPaymentFlowResult", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "onFatal", "(Ljava/lang/Throwable;)V", "onUserCancel", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "startConfirm", "Landroidx/lifecycle/LiveData;", "getStartConfirm$payments_core_release", "()Landroidx/lifecycle/LiveData;", "Lh0/q/y;", "_startConfirm", "Lh0/q/y;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;", "amount", "getAmount$payments_core_release", "_viewState", "get_viewState$payments_core_release", "()Lh0/q/y;", "get_viewState$payments_core_release$annotations", "Lcom/stripe/android/paymentsheet/GooglePayRepository;", "googlePayRepository", "Lcom/stripe/android/paymentsheet/GooglePayRepository;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "args", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "getArgs$payments_core_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "_amount", "get_amount$payments_core_release", "get_amount$payments_core_release$annotations", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "_paymentSheetResult", "get_paymentSheetResult$payments_core_release", "get_paymentSheetResult$payments_core_release$annotations", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "confirmParamsFactory", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "getCheckoutIdentifier$payments_core_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "setCheckoutIdentifier$payments_core_release", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "setNewCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)V", "Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "paymentMethodsRepository", "Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "paymentSheetResult", "getPaymentSheetResult$payments_core_release", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "paymentFlowResultProcessor", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "viewState", "getViewState$payments_core_release", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "stripeIntentValidator", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "", "isProcessingPaymentIntent$payments_core_release", "()Z", "isProcessingPaymentIntent", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "Lm0/l/e;", "workContext", "Landroid/app/Application;", "application", "<init>", "(Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/paymentsheet/GooglePayRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;Lcom/stripe/android/Logger;Lm0/l/e;Landroid/app/Application;)V", "Amount", "CheckoutIdentifier", "Factory", "TransitionTarget", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel extends BaseSheetViewModel<TransitionTarget> {
    private final y<Amount> _amount;
    private final y<PaymentSheetResult> _paymentSheetResult;
    private final y<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> _startConfirm;
    private final y<PaymentSheetViewState> _viewState;
    private final LiveData<Amount> amount;
    private final PaymentSheetContract.Args args;
    private CheckoutIdentifier checkoutIdentifier;
    private final ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> confirmParamsFactory;
    /* access modifiers changed from: private */
    public final EventReporter eventReporter;
    /* access modifiers changed from: private */
    public final GooglePayRepository googlePayRepository;
    private final Logger logger;
    private PaymentSelection.New.Card newCard;
    /* access modifiers changed from: private */
    public final PaymentFlowResultProcessor<? extends StripeIntent, StripeIntentResult<StripeIntent>> paymentFlowResultProcessor;
    /* access modifiers changed from: private */
    public final PaymentMethodsRepository paymentMethodsRepository;
    private final LiveData<PaymentSheetResult> paymentSheetResult;
    private final LiveData<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> startConfirm;
    /* access modifiers changed from: private */
    public final StripeIntentRepository stripeIntentRepository;
    private final StripeIntentValidator stripeIntentValidator;
    private final LiveData<PaymentSheetViewState> viewState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;", "", "", "component1", "()J", "", "component2", "()Ljava/lang/String;", "value", "currencyCode", "copy", "(JLjava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrencyCode", "J", "getValue", "<init>", "(JLjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewModel.kt */
    public static final class Amount {
        private final String currencyCode;
        private final long value;

        public Amount(long j, String str) {
            i.e(str, "currencyCode");
            this.value = j;
            this.currencyCode = str;
        }

        public static /* synthetic */ Amount copy$default(Amount amount, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = amount.value;
            }
            if ((i & 2) != 0) {
                str = amount.currencyCode;
            }
            return amount.copy(j, str);
        }

        public final long component1() {
            return this.value;
        }

        public final String component2() {
            return this.currencyCode;
        }

        public final Amount copy(long j, String str) {
            i.e(str, "currencyCode");
            return new Amount(j, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return this.value == amount.value && i.a(this.currencyCode, amount.currencyCode);
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.value) * 31;
            String str = this.currencyCode;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Amount(value=");
            P0.append(this.value);
            P0.append(", currencyCode=");
            return a.y0(P0, this.currencyCode, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "", "<init>", "(Ljava/lang/String;I)V", "AddFragmentTopGooglePay", "SheetBottomGooglePay", "SheetBottomBuy", "None", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewModel.kt */
    public enum CheckoutIdentifier {
        AddFragmentTopGooglePay,
        SheetBottomGooglePay,
        SheetBottomBuy,
        None
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "starterArgsSupplier", "Lm0/n/a/a;", "Landroid/app/Application;", "applicationSupplier", "<init>", "(Lm0/n/a/a;Lm0/n/a/a;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewModel.kt */
    public static final class Factory implements m0.b {
        private final m0.n.a.a<Application> applicationSupplier;
        private final m0.n.a.a<PaymentSheetContract.Args> starterArgsSupplier;

        public Factory(m0.n.a.a<? extends Application> aVar, m0.n.a.a<PaymentSheetContract.Args> aVar2) {
            i.e(aVar, "applicationSupplier");
            i.e(aVar2, "starterArgsSupplier");
            this.applicationSupplier = aVar;
            this.starterArgsSupplier = aVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.stripe.android.paymentsheet.GooglePayRepository$Disabled} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.stripe.android.paymentsheet.PrefsRepository$Noop} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.stripe.android.paymentsheet.DefaultPrefsRepository} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.stripe.android.paymentsheet.GooglePayRepository$Disabled} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.stripe.android.paymentsheet.DefaultGooglePayRepository} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.stripe.android.paymentsheet.GooglePayRepository$Disabled} */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v23, types: [com.stripe.android.payments.SetupIntentFlowResultProcessor] */
        /* JADX WARNING: type inference failed for: r2v24, types: [com.stripe.android.payments.PaymentIntentFlowResultProcessor] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T extends h0.q.k0> T create(java.lang.Class<T> r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.String r1 = "modelClass"
                r2 = r23
                m0.n.b.i.e(r2, r1)
                m0.n.a.a<android.app.Application> r1 = r0.applicationSupplier
                java.lang.Object r1 = r1.invoke()
                android.app.Application r1 = (android.app.Application) r1
                com.stripe.android.PaymentConfiguration$Companion r2 = com.stripe.android.PaymentConfiguration.Companion
                com.stripe.android.PaymentConfiguration r2 = r2.getInstance(r1)
                java.lang.String r18 = r2.getPublishableKey()
                java.lang.String r19 = r2.getStripeAccountId()
                com.stripe.android.networking.StripeApiRepository r15 = new com.stripe.android.networking.StripeApiRepository
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 8188(0x1ffc, float:1.1474E-41)
                r20 = 0
                r2 = r15
                r3 = r1
                r4 = r18
                r21 = r15
                r15 = r16
                r16 = r17
                r17 = r20
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                m0.n.a.a<com.stripe.android.paymentsheet.PaymentSheetContract$Args> r2 = r0.starterArgsSupplier
                java.lang.Object r2 = r2.invoke()
                r11 = r2
                com.stripe.android.paymentsheet.PaymentSheetContract$Args r11 = (com.stripe.android.paymentsheet.PaymentSheetContract.Args) r11
                com.stripe.android.paymentsheet.PaymentSheet$Configuration r2 = r11.getConfig()
                if (r2 == 0) goto L_0x0067
                com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r2 = r2.getGooglePay()
                if (r2 == 0) goto L_0x0067
                com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration$Environment r4 = r2.getEnvironment()
                if (r4 == 0) goto L_0x0067
                com.stripe.android.paymentsheet.DefaultGooglePayRepository r8 = new com.stripe.android.paymentsheet.DefaultGooglePayRepository
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r3 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                r12 = r8
                goto L_0x006a
            L_0x0067:
                com.stripe.android.paymentsheet.GooglePayRepository$Disabled r2 = com.stripe.android.paymentsheet.GooglePayRepository.Disabled.INSTANCE
                r12 = r2
            L_0x006a:
                com.stripe.android.paymentsheet.PaymentSheet$Configuration r2 = r11.getConfig()
                if (r2 == 0) goto L_0x0089
                com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r2 = r2.getCustomer()
                if (r2 == 0) goto L_0x0089
                java.lang.String r2 = r2.component1()
                com.stripe.android.paymentsheet.DefaultPrefsRepository r3 = new com.stripe.android.paymentsheet.DefaultPrefsRepository
                com.stripe.android.paymentsheet.PaymentSheetViewModel$Factory$create$$inlined$let$lambda$1 r4 = new com.stripe.android.paymentsheet.PaymentSheetViewModel$Factory$create$$inlined$let$lambda$1
                r5 = 0
                r4.<init>(r5, r1, r12)
                n0.a.d0 r5 = n0.a.m0.c
                r3.<init>(r1, r2, r4, r5)
                r13 = r3
                goto L_0x008f
            L_0x0089:
                com.stripe.android.paymentsheet.PrefsRepository$Noop r2 = new com.stripe.android.paymentsheet.PrefsRepository$Noop
                r2.<init>()
                r13 = r2
            L_0x008f:
                com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api r14 = new com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api
                com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r2
                r4 = r18
                r5 = r19
                r3.<init>(r4, r5, r6, r7, r8)
                n0.a.d0 r15 = n0.a.m0.c
                r10 = r21
                r14.<init>(r10, r2, r15)
                com.stripe.android.paymentsheet.repositories.PaymentMethodsApiRepository r16 = new com.stripe.android.paymentsheet.repositories.PaymentMethodsApiRepository
                r7 = 0
                r9 = 8
                r2 = 0
                r3 = r16
                r4 = r10
                r5 = r18
                r6 = r19
                r8 = r15
                r17 = r10
                r10 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                com.stripe.android.paymentsheet.model.ClientSecret r2 = r11.getClientSecret()
                boolean r3 = r2 instanceof com.stripe.android.paymentsheet.model.PaymentIntentClientSecret
                if (r3 == 0) goto L_0x00d0
                com.stripe.android.payments.PaymentIntentFlowResultProcessor r8 = new com.stripe.android.payments.PaymentIntentFlowResultProcessor
                r6 = 1
                r2 = r8
                r3 = r1
                r4 = r18
                r5 = r17
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x00ce:
                r9 = r8
                goto L_0x00e2
            L_0x00d0:
                boolean r2 = r2 instanceof com.stripe.android.paymentsheet.model.SetupIntentClientSecret
                if (r2 == 0) goto L_0x010d
                com.stripe.android.payments.SetupIntentFlowResultProcessor r8 = new com.stripe.android.payments.SetupIntentFlowResultProcessor
                r6 = 1
                r2 = r8
                r3 = r1
                r4 = r18
                r5 = r17
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x00ce
            L_0x00e2:
                com.stripe.android.paymentsheet.PaymentSheetViewModel r17 = new com.stripe.android.paymentsheet.PaymentSheetViewModel
                com.stripe.android.paymentsheet.analytics.DefaultEventReporter r10 = new com.stripe.android.paymentsheet.analytics.DefaultEventReporter
                com.stripe.android.paymentsheet.analytics.EventReporter$Mode r3 = com.stripe.android.paymentsheet.analytics.EventReporter.Mode.Complete
                com.stripe.android.paymentsheet.analytics.SessionId r4 = r11.getSessionId()
                r6 = 0
                r7 = 8
                r8 = 0
                r2 = r10
                r5 = r1
                r2.<init>((com.stripe.android.paymentsheet.analytics.EventReporter.Mode) r3, (com.stripe.android.paymentsheet.analytics.SessionId) r4, (android.content.Context) r5, (m0.l.e) r6, (int) r7, (m0.n.b.f) r8)
                com.stripe.android.Logger$Companion r2 = com.stripe.android.Logger.Companion
                com.stripe.android.Logger r18 = r2.noop$payments_core_release()
                r2 = r17
                r3 = r14
                r4 = r16
                r5 = r9
                r6 = r12
                r7 = r13
                r8 = r10
                r9 = r11
                r10 = r18
                r11 = r15
                r12 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r17
            L_0x010d:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create(java.lang.Class):h0.q.k0");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "<init>", "()V", "AddPaymentMethodFull", "AddPaymentMethodSheet", "SelectSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodSheet;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewModel.kt */
    public static abstract class TransitionTarget {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "copy", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodFull;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "<init>", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSheetViewModel.kt */
        public static final class AddPaymentMethodFull extends TransitionTarget {
            private final FragmentConfig fragmentConfig;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodFull(FragmentConfig fragmentConfig2) {
                super((f) null);
                i.e(fragmentConfig2, "fragmentConfig");
                this.fragmentConfig = fragmentConfig2;
            }

            public static /* synthetic */ AddPaymentMethodFull copy$default(AddPaymentMethodFull addPaymentMethodFull, FragmentConfig fragmentConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentConfig2 = addPaymentMethodFull.getFragmentConfig();
                }
                return addPaymentMethodFull.copy(fragmentConfig2);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodFull copy(FragmentConfig fragmentConfig2) {
                i.e(fragmentConfig2, "fragmentConfig");
                return new AddPaymentMethodFull(fragmentConfig2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof AddPaymentMethodFull) && i.a(getFragmentConfig(), ((AddPaymentMethodFull) obj).getFragmentConfig());
                }
                return true;
            }

            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                FragmentConfig fragmentConfig2 = getFragmentConfig();
                if (fragmentConfig2 != null) {
                    return fragmentConfig2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("AddPaymentMethodFull(fragmentConfig=");
                P0.append(getFragmentConfig());
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodSheet;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "copy", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodSheet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "<init>", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSheetViewModel.kt */
        public static final class AddPaymentMethodSheet extends TransitionTarget {
            private final FragmentConfig fragmentConfig;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodSheet(FragmentConfig fragmentConfig2) {
                super((f) null);
                i.e(fragmentConfig2, "fragmentConfig");
                this.fragmentConfig = fragmentConfig2;
            }

            public static /* synthetic */ AddPaymentMethodSheet copy$default(AddPaymentMethodSheet addPaymentMethodSheet, FragmentConfig fragmentConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentConfig2 = addPaymentMethodSheet.getFragmentConfig();
                }
                return addPaymentMethodSheet.copy(fragmentConfig2);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodSheet copy(FragmentConfig fragmentConfig2) {
                i.e(fragmentConfig2, "fragmentConfig");
                return new AddPaymentMethodSheet(fragmentConfig2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof AddPaymentMethodSheet) && i.a(getFragmentConfig(), ((AddPaymentMethodSheet) obj).getFragmentConfig());
                }
                return true;
            }

            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                FragmentConfig fragmentConfig2 = getFragmentConfig();
                if (fragmentConfig2 != null) {
                    return fragmentConfig2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("AddPaymentMethodSheet(fragmentConfig=");
                P0.append(getFragmentConfig());
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "copy", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$SelectSavedPaymentMethod;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "<init>", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSheetViewModel.kt */
        public static final class SelectSavedPaymentMethod extends TransitionTarget {
            private final FragmentConfig fragmentConfig;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SelectSavedPaymentMethod(FragmentConfig fragmentConfig2) {
                super((f) null);
                i.e(fragmentConfig2, "fragmentConfig");
                this.fragmentConfig = fragmentConfig2;
            }

            public static /* synthetic */ SelectSavedPaymentMethod copy$default(SelectSavedPaymentMethod selectSavedPaymentMethod, FragmentConfig fragmentConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentConfig2 = selectSavedPaymentMethod.getFragmentConfig();
                }
                return selectSavedPaymentMethod.copy(fragmentConfig2);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final SelectSavedPaymentMethod copy(FragmentConfig fragmentConfig2) {
                i.e(fragmentConfig2, "fragmentConfig");
                return new SelectSavedPaymentMethod(fragmentConfig2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof SelectSavedPaymentMethod) && i.a(getFragmentConfig(), ((SelectSavedPaymentMethod) obj).getFragmentConfig());
                }
                return true;
            }

            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                FragmentConfig fragmentConfig2 = getFragmentConfig();
                if (fragmentConfig2 != null) {
                    return fragmentConfig2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("SelectSavedPaymentMethod(fragmentConfig=");
                P0.append(getFragmentConfig());
                P0.append(")");
                return P0.toString();
            }
        }

        private TransitionTarget() {
        }

        public abstract FragmentConfig getFragmentConfig();

        public /* synthetic */ TransitionTarget(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PaymentSheet.GooglePayConfiguration.Environment.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentSheetViewModel(StripeIntentRepository stripeIntentRepository2, PaymentMethodsRepository paymentMethodsRepository2, PaymentFlowResultProcessor paymentFlowResultProcessor2, GooglePayRepository googlePayRepository2, PrefsRepository prefsRepository, EventReporter eventReporter2, PaymentSheetContract.Args args2, Logger logger2, e eVar, Application application, int i, f fVar) {
        this(stripeIntentRepository2, paymentMethodsRepository2, paymentFlowResultProcessor2, googlePayRepository2, prefsRepository, eventReporter2, args2, (i & 128) != 0 ? Logger.Companion.noop$payments_core_release() : logger2, eVar, application);
    }

    /* access modifiers changed from: private */
    public final String apiThrowableToString(Throwable th) {
        if (!(th instanceof APIConnectionException)) {
            return th.getLocalizedMessage();
        }
        Application application = getApplication();
        i.d(application, "getApplication<Application>()");
        return application.getResources().getString(R.string.stripe_failure_connection_error);
    }

    private final void confirmPaymentSelection(PaymentSelection paymentSelection) {
        ConfirmStripeIntentParams confirmStripeIntentParams;
        if (paymentSelection instanceof PaymentSelection.Saved) {
            confirmStripeIntentParams = this.confirmParamsFactory.create((PaymentSelection.Saved) paymentSelection);
        } else {
            confirmStripeIntentParams = paymentSelection instanceof PaymentSelection.New.Card ? this.confirmParamsFactory.create((PaymentSelection.New) paymentSelection) : null;
        }
        if (confirmStripeIntentParams != null) {
            this._startConfirm.setValue(new BaseSheetViewModel.Event(confirmStripeIntentParams));
        }
    }

    public static /* synthetic */ void get_amount$payments_core_release$annotations() {
    }

    public static /* synthetic */ void get_paymentSheetResult$payments_core_release$annotations() {
    }

    public static /* synthetic */ void get_viewState$payments_core_release$annotations() {
    }

    private final void onConfirmedStripeIntent(StripeIntent stripeIntent) {
        Logger logger2 = this.logger;
        StringBuilder P0 = a.P0("\n            ");
        P0.append(stripeIntent.getClass().getSimpleName());
        P0.append(" with id=");
        P0.append(stripeIntent.getId());
        P0.append(" has already been confirmed.\n            ");
        logger2.info(StringsKt__IndentKt.Y(P0.toString()));
        this._viewState.setValue(new PaymentSheetViewState.FinishProcessing(new PaymentSheetViewModel$onConfirmedStripeIntent$1(this)));
    }

    /* access modifiers changed from: private */
    public final void onStripeIntentFetchResponse(StripeIntent stripeIntent) {
        Object obj;
        if (stripeIntent.isConfirmed()) {
            onConfirmedStripeIntent(stripeIntent);
            return;
        }
        try {
            obj = this.stripeIntentValidator.requireValid(stripeIntent);
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a == null) {
            StripeIntent stripeIntent2 = (StripeIntent) obj;
            get_stripeIntent$payments_core_release().setValue(stripeIntent);
            resetViewState(stripeIntent, (String) null);
            return;
        }
        onFatal(a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.stripe.android.StripeIntentResult<? extends com.stripe.android.model.StripeIntent>, com.stripe.android.StripeIntentResult] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStripeIntentResult(com.stripe.android.StripeIntentResult<? extends com.stripe.android.model.StripeIntent> r4) {
        /*
            r3 = this;
            int r0 = r4.getOutcome()
            r1 = 1
            if (r0 == r1) goto L_0x003b
            com.stripe.android.paymentsheet.analytics.EventReporter r0 = r3.eventReporter
            androidx.lifecycle.LiveData r1 = r3.getSelection$payments_core_release()
            java.lang.Object r1 = r1.getValue()
            com.stripe.android.paymentsheet.model.PaymentSelection r1 = (com.stripe.android.paymentsheet.model.PaymentSelection) r1
            r0.onPaymentFailure(r1)
            com.stripe.android.paymentsheet.model.StripeIntentValidator r0 = r3.stripeIntentValidator     // Catch:{ all -> 0x0021 }
            com.stripe.android.model.StripeIntent r1 = r4.getIntent()     // Catch:{ all -> 0x0021 }
            com.stripe.android.model.StripeIntent r0 = r0.requireValid(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0026
        L_0x0021:
            r0 = move-exception
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x0026:
            java.lang.Throwable r1 = kotlin.Result.a(r0)
            if (r1 != 0) goto L_0x0037
            com.stripe.android.model.StripeIntent r0 = (com.stripe.android.model.StripeIntent) r0
            java.lang.String r4 = r4.getFailureMessage()
            r3.resetViewState((com.stripe.android.model.StripeIntent) r0, (java.lang.String) r4)
            goto L_0x00a7
        L_0x0037:
            r3.onFatal(r1)
            goto L_0x00a7
        L_0x003b:
            com.stripe.android.paymentsheet.analytics.EventReporter r0 = r3.eventReporter
            androidx.lifecycle.LiveData r1 = r3.getSelection$payments_core_release()
            java.lang.Object r1 = r1.getValue()
            com.stripe.android.paymentsheet.model.PaymentSelection r1 = (com.stripe.android.paymentsheet.model.PaymentSelection) r1
            r0.onPaymentSuccess(r1)
            androidx.lifecycle.LiveData r0 = r3.getSelection$payments_core_release()
            java.lang.Object r0 = r0.getValue()
            com.stripe.android.paymentsheet.model.PaymentSelection r0 = (com.stripe.android.paymentsheet.model.PaymentSelection) r0
            boolean r1 = r0 instanceof com.stripe.android.paymentsheet.model.PaymentSelection.New.Card
            r2 = 0
            if (r1 == 0) goto L_0x0069
            com.stripe.android.model.StripeIntent r4 = r4.getIntent()
            com.stripe.android.model.PaymentMethod r4 = r4.getPaymentMethod()
            if (r4 == 0) goto L_0x008f
            com.stripe.android.paymentsheet.model.PaymentSelection$Saved r2 = new com.stripe.android.paymentsheet.model.PaymentSelection$Saved
            r2.<init>(r4)
            goto L_0x008f
        L_0x0069:
            com.stripe.android.paymentsheet.model.PaymentSelection$GooglePay r4 = com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay.INSTANCE
            boolean r4 = m0.n.b.i.a(r0, r4)
            if (r4 == 0) goto L_0x007d
            androidx.lifecycle.LiveData r4 = r3.getSelection$payments_core_release()
            java.lang.Object r4 = r4.getValue()
            r2 = r4
            com.stripe.android.paymentsheet.model.PaymentSelection r2 = (com.stripe.android.paymentsheet.model.PaymentSelection) r2
            goto L_0x008f
        L_0x007d:
            boolean r4 = r0 instanceof com.stripe.android.paymentsheet.model.PaymentSelection.Saved
            if (r4 == 0) goto L_0x008d
            androidx.lifecycle.LiveData r4 = r3.getSelection$payments_core_release()
            java.lang.Object r4 = r4.getValue()
            r2 = r4
            com.stripe.android.paymentsheet.model.PaymentSelection r2 = (com.stripe.android.paymentsheet.model.PaymentSelection) r2
            goto L_0x008f
        L_0x008d:
            if (r0 != 0) goto L_0x00a8
        L_0x008f:
            if (r2 == 0) goto L_0x0098
            com.stripe.android.paymentsheet.PrefsRepository r4 = r3.getPrefsRepository()
            r4.savePaymentSelection(r2)
        L_0x0098:
            h0.q.y<com.stripe.android.paymentsheet.model.PaymentSheetViewState> r4 = r3._viewState
            com.stripe.android.paymentsheet.model.PaymentSheetViewState$FinishProcessing r0 = new com.stripe.android.paymentsheet.model.PaymentSheetViewState$FinishProcessing
            com.stripe.android.paymentsheet.PaymentSheetViewModel$onStripeIntentResult$3 r1 = new com.stripe.android.paymentsheet.PaymentSheetViewModel$onStripeIntentResult$3
            r1.<init>(r3)
            r0.<init>(r1)
            r4.setValue(r0)
        L_0x00a7:
            return
        L_0x00a8:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetViewModel.onStripeIntentResult(com.stripe.android.StripeIntentResult):void");
    }

    private final void resetViewState(StripeIntent stripeIntent, Integer num) {
        String str;
        if (num != null) {
            int intValue = num.intValue();
            Application application = getApplication();
            i.d(application, "getApplication<Application>()");
            str = application.getResources().getString(intValue);
        } else {
            str = null;
        }
        resetViewState(stripeIntent, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0083, code lost:
        r4 = r4.getGooglePay();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkout(com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier r13) {
        /*
            r12 = this;
            java.lang.String r0 = "checkoutIdentifier"
            m0.n.b.i.e(r13, r0)
            h0.q.y<com.stripe.android.paymentsheet.model.PaymentSheetViewState> r0 = r12._viewState
            com.stripe.android.paymentsheet.model.PaymentSheetViewState$Reset r1 = new com.stripe.android.paymentsheet.model.PaymentSheetViewState$Reset
            r2 = 0
            r1.<init>(r2)
            r0.setValue(r1)
            r12.checkoutIdentifier = r13
            h0.q.y r13 = r12.get_processing$payments_core_release()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setValue(r0)
            h0.q.y<com.stripe.android.paymentsheet.model.PaymentSheetViewState> r13 = r12._viewState
            com.stripe.android.paymentsheet.model.PaymentSheetViewState$StartProcessing r0 = com.stripe.android.paymentsheet.model.PaymentSheetViewState.StartProcessing.INSTANCE
            r13.setValue(r0)
            androidx.lifecycle.LiveData r13 = r12.getSelection$payments_core_release()
            java.lang.Object r13 = r13.getValue()
            com.stripe.android.paymentsheet.model.PaymentSelection r13 = (com.stripe.android.paymentsheet.model.PaymentSelection) r13
            boolean r0 = r13 instanceof com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay
            if (r0 == 0) goto L_0x00d7
            androidx.lifecycle.LiveData r13 = r12.getStripeIntent$payments_core_release()
            java.lang.Object r13 = r13.getValue()
            boolean r13 = r13 instanceof com.stripe.android.model.PaymentIntent
            if (r13 != 0) goto L_0x0060
            com.stripe.android.Logger r13 = r12.logger
            java.lang.String r0 = "Expected PaymentIntent when checking out with Google Pay,"
            java.lang.String r1 = " but found '"
            java.lang.StringBuilder r0 = i0.d.a.a.a.S0(r0, r1)
            androidx.lifecycle.LiveData r1 = r12.getStripeIntent$payments_core_release()
            java.lang.Object r1 = r1.getValue()
            com.stripe.android.model.StripeIntent r1 = (com.stripe.android.model.StripeIntent) r1
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            com.stripe.android.Logger.DefaultImpls.error$default(r13, r0, r2, r1, r2)
        L_0x0060:
            androidx.lifecycle.LiveData r13 = r12.getStripeIntent$payments_core_release()
            java.lang.Object r13 = r13.getValue()
            boolean r0 = r13 instanceof com.stripe.android.model.PaymentIntent
            if (r0 != 0) goto L_0x006d
            r13 = r2
        L_0x006d:
            com.stripe.android.model.PaymentIntent r13 = (com.stripe.android.model.PaymentIntent) r13
            if (r13 == 0) goto L_0x00da
            h0.q.y r0 = r12.get_launchGooglePay()
            com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$Event r1 = new com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$Event
            com.stripe.android.googlepay.StripeGooglePayContract$Args r3 = new com.stripe.android.googlepay.StripeGooglePayContract$Args
            com.stripe.android.googlepay.StripeGooglePayContract$GooglePayConfig r11 = new com.stripe.android.googlepay.StripeGooglePayContract$GooglePayConfig
            com.stripe.android.paymentsheet.PaymentSheetContract$Args r4 = r12.args
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r4 = r4.getConfig()
            if (r4 == 0) goto L_0x008e
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r4 = r4.getGooglePay()
            if (r4 == 0) goto L_0x008e
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration$Environment r4 = r4.getEnvironment()
            goto L_0x008f
        L_0x008e:
            r4 = r2
        L_0x008f:
            if (r4 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x009c
        L_0x0098:
            com.stripe.android.googlepay.StripeGooglePayEnvironment r4 = com.stripe.android.googlepay.StripeGooglePayEnvironment.Test
        L_0x009a:
            r5 = r4
            goto L_0x009f
        L_0x009c:
            com.stripe.android.googlepay.StripeGooglePayEnvironment r4 = com.stripe.android.googlepay.StripeGooglePayEnvironment.Production
            goto L_0x009a
        L_0x009f:
            com.stripe.android.paymentsheet.PaymentSheetContract$Args r4 = r12.args
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r4 = r4.getGooglePayConfig()
            if (r4 == 0) goto L_0x00ac
            java.lang.String r4 = r4.getCountryCode()
            goto L_0x00ad
        L_0x00ac:
            r4 = r2
        L_0x00ad:
            if (r4 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r4 = ""
        L_0x00b2:
            r6 = r4
            r7 = 0
            com.stripe.android.paymentsheet.PaymentSheetContract$Args r4 = r12.args
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r4 = r4.getConfig()
            if (r4 == 0) goto L_0x00c0
            java.lang.String r2 = r4.getMerchantDisplayName()
        L_0x00c0:
            r8 = r2
            r9 = 4
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.stripe.android.paymentsheet.PaymentSheetContract$Args r2 = r12.args
            java.lang.Integer r2 = r2.getStatusBarColor()
            r3.<init>(r13, r11, r2)
            r1.<init>(r3)
            r0.setValue(r1)
            goto L_0x00da
        L_0x00d7:
            r12.confirmPaymentSelection(r13)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetViewModel.checkout(com.stripe.android.paymentsheet.PaymentSheetViewModel$CheckoutIdentifier):void");
    }

    public final void fetchIsGooglePayReady() {
        if (isGooglePayReady$payments_core_release().getValue() != null) {
            return;
        }
        if (this.args.isGooglePayEnabled()) {
            m0.r.t.a.r.m.a1.a.E2(g0.a.b.b.a.T(this), (e) null, (CoroutineStart) null, new PaymentSheetViewModel$fetchIsGooglePayReady$1(this, (c) null), 3, (Object) null);
        } else {
            get_isGooglePayReady().setValue(Boolean.FALSE);
        }
    }

    public final void fetchStripeIntent() {
        m0.r.t.a.r.m.a1.a.E2(g0.a.b.b.a.T(this), (e) null, (CoroutineStart) null, new PaymentSheetViewModel$fetchStripeIntent$1(this, (c) null), 3, (Object) null);
    }

    public final LiveData<Amount> getAmount$payments_core_release() {
        return this.amount;
    }

    public final PaymentSheetContract.Args getArgs$payments_core_release() {
        return this.args;
    }

    public final w<PaymentSheetViewState> getButtonStateObservable$payments_core_release(CheckoutIdentifier checkoutIdentifier2) {
        i.e(checkoutIdentifier2, "checkoutIdentifier");
        w<PaymentSheetViewState> wVar = new w<>();
        wVar.a(this._viewState, new PaymentSheetViewModel$getButtonStateObservable$1(this, checkoutIdentifier2, wVar));
        return wVar;
    }

    public final CheckoutIdentifier getCheckoutIdentifier$payments_core_release() {
        return this.checkoutIdentifier;
    }

    public PaymentSelection.New.Card getNewCard() {
        return this.newCard;
    }

    public final LiveData<PaymentSheetResult> getPaymentSheetResult$payments_core_release() {
        return this.paymentSheetResult;
    }

    public final LiveData<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> getStartConfirm$payments_core_release() {
        return this.startConfirm;
    }

    public final LiveData<PaymentSheetViewState> getViewState$payments_core_release() {
        return this.viewState;
    }

    public final y<Amount> get_amount$payments_core_release() {
        return this._amount;
    }

    public final y<PaymentSheetResult> get_paymentSheetResult$payments_core_release() {
        return this._paymentSheetResult;
    }

    public final y<PaymentSheetViewState> get_viewState$payments_core_release() {
        return this._viewState;
    }

    public final boolean isProcessingPaymentIntent$payments_core_release() {
        return this.args.getClientSecret() instanceof PaymentIntentClientSecret;
    }

    public void onFatal(Throwable th) {
        i.e(th, "throwable");
        get_fatal().setValue(th);
        this._paymentSheetResult.setValue(new PaymentSheetResult.Failed(th));
    }

    public final void onGooglePayResult$payments_core_release(StripeGooglePayContract.Result result) {
        i.e(result, "googlePayResult");
        if (result instanceof StripeGooglePayContract.Result.PaymentData) {
            confirmPaymentSelection(new PaymentSelection.Saved(((StripeGooglePayContract.Result.PaymentData) result).getPaymentMethod()));
        } else if (result instanceof StripeGooglePayContract.Result.Error) {
            StripeGooglePayContract.Result.Error error = (StripeGooglePayContract.Result.Error) result;
            this.logger.error("Error processing Google Pay payment", error.getException());
            this.eventReporter.onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
            StripeIntent value = getStripeIntent$payments_core_release().getValue();
            if (value != null) {
                i.d(value, "it");
                resetViewState(value, StripeGooglePayContractKt.getErrorResourceID(error));
            }
        } else {
            StripeIntent value2 = getStripeIntent$payments_core_release().getValue();
            if (value2 != null) {
                i.d(value2, "it");
                resetViewState(value2, (String) null);
            }
        }
    }

    public final void onPaymentFlowResult(PaymentFlowResult.Unvalidated unvalidated) {
        i.e(unvalidated, "paymentFlowResult");
        m0.r.t.a.r.m.a1.a.E2(g0.a.b.b.a.T(this), (e) null, (CoroutineStart) null, new PaymentSheetViewModel$onPaymentFlowResult$1(this, unvalidated, (c) null), 3, (Object) null);
    }

    public void onUserCancel() {
        this._paymentSheetResult.setValue(PaymentSheetResult.Canceled.INSTANCE);
    }

    public final void setCheckoutIdentifier$payments_core_release(CheckoutIdentifier checkoutIdentifier2) {
        i.e(checkoutIdentifier2, "<set-?>");
        this.checkoutIdentifier = checkoutIdentifier2;
    }

    public void setNewCard(PaymentSelection.New.Card card) {
        this.newCard = card;
    }

    public final void updatePaymentMethods() {
        m0.r.t.a.r.m.a1.a.E2(g0.a.b.b.a.T(this), (e) null, (CoroutineStart) null, new PaymentSheetViewModel$updatePaymentMethods$1(this, (c) null), 3, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel(StripeIntentRepository stripeIntentRepository2, PaymentMethodsRepository paymentMethodsRepository2, PaymentFlowResultProcessor<? extends StripeIntent, ? extends StripeIntentResult<? extends StripeIntent>> paymentFlowResultProcessor2, GooglePayRepository googlePayRepository2, PrefsRepository prefsRepository, EventReporter eventReporter2, PaymentSheetContract.Args args2, Logger logger2, e eVar, Application application) {
        super(application, args2.getConfig(), prefsRepository, eVar);
        i.e(stripeIntentRepository2, "stripeIntentRepository");
        i.e(paymentMethodsRepository2, "paymentMethodsRepository");
        i.e(paymentFlowResultProcessor2, "paymentFlowResultProcessor");
        i.e(googlePayRepository2, "googlePayRepository");
        i.e(prefsRepository, "prefsRepository");
        i.e(eventReporter2, "eventReporter");
        i.e(args2, "args");
        i.e(logger2, "logger");
        i.e(eVar, "workContext");
        i.e(application, "application");
        this.stripeIntentRepository = stripeIntentRepository2;
        this.paymentMethodsRepository = paymentMethodsRepository2;
        this.paymentFlowResultProcessor = paymentFlowResultProcessor2;
        this.googlePayRepository = googlePayRepository2;
        this.eventReporter = eventReporter2;
        this.args = args2;
        this.logger = logger2;
        this.confirmParamsFactory = ConfirmStripeIntentParamsFactory.Companion.createFactory(args2.getClientSecret());
        y<PaymentSheetResult> yVar = new y<>();
        this._paymentSheetResult = yVar;
        this.paymentSheetResult = yVar;
        y<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> yVar2 = new y<>();
        this._startConfirm = yVar2;
        this.startConfirm = yVar2;
        y<Amount> yVar3 = new y<>();
        this._amount = yVar3;
        this.amount = yVar3;
        y<PaymentSheetViewState> yVar4 = new y<>(null);
        this._viewState = yVar4;
        LiveData<PaymentSheetViewState> A = g0.a.b.b.a.A(yVar4);
        i.d(A, "Transformations.distinctUntilChanged(this)");
        this.viewState = A;
        this.checkoutIdentifier = CheckoutIdentifier.SheetBottomBuy;
        this.stripeIntentValidator = new StripeIntentValidator();
        fetchIsGooglePayReady();
        eventReporter2.onInit(getConfig$payments_core_release());
    }

    /* access modifiers changed from: private */
    public final void resetViewState(StripeIntent stripeIntent, String str) {
        BaseSheetViewModel.UserErrorMessage userErrorMessage = null;
        if (stripeIntent instanceof PaymentIntent) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            Long amount2 = paymentIntent.getAmount();
            String currency = paymentIntent.getCurrency();
            if (amount2 == null || currency == null) {
                onFatal(new IllegalStateException("PaymentIntent could not be parsed correctly."));
            } else {
                this._amount.setValue(new Amount(amount2.longValue(), currency));
                y<PaymentSheetViewState> yVar = this._viewState;
                if (str != null) {
                    userErrorMessage = new BaseSheetViewModel.UserErrorMessage(str);
                }
                yVar.setValue(new PaymentSheetViewState.Reset(userErrorMessage));
            }
        } else if (stripeIntent instanceof SetupIntent) {
            y<PaymentSheetViewState> yVar2 = this._viewState;
            if (str != null) {
                userErrorMessage = new BaseSheetViewModel.UserErrorMessage(str);
            }
            yVar2.setValue(new PaymentSheetViewState.Reset(userErrorMessage));
        }
        get_processing$payments_core_release().setValue(Boolean.FALSE);
    }
}
