package com.stripe.android.view;

import androidx.lifecycle.LiveData;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.Stripe;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.i18n.ErrorMessageTranslator;
import com.stripe.android.view.i18n.TranslatorManager;
import h0.q.k0;
import h0.q.m0;
import h0.q.y;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel;", "Lh0/q/k0;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;)Landroidx/lifecycle/LiveData;", "createPaymentMethod", "updatedPaymentMethodCreateParams$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "updatedPaymentMethodCreateParams", "Lcom/stripe/android/CustomerSession;", "customerSession", "paymentMethod", "attachPaymentMethod$payments_core_release", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/PaymentMethod;)Landroidx/lifecycle/LiveData;", "attachPaymentMethod", "Lcom/stripe/android/Stripe;", "stripe", "Lcom/stripe/android/Stripe;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "", "", "productUsage", "Ljava/util/Set;", "<init>", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;Lcom/stripe/android/view/i18n/ErrorMessageTranslator;)V", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodViewModel.kt */
public final class AddPaymentMethodViewModel extends k0 {
    private final AddPaymentMethodActivityStarter.Args args;
    /* access modifiers changed from: private */
    public final ErrorMessageTranslator errorMessageTranslator;
    private final Set<String> productUsage;
    private final Stripe stripe;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Lcom/stripe/android/Stripe;", "stripe", "Lcom/stripe/android/Stripe;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "<init>", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodViewModel.kt */
    public static final class Factory implements m0.b {
        private final AddPaymentMethodActivityStarter.Args args;
        private final Stripe stripe;

        public Factory(Stripe stripe2, AddPaymentMethodActivityStarter.Args args2) {
            i.e(stripe2, "stripe");
            i.e(args2, "args");
            this.stripe = stripe2;
            this.args = args2;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            return new AddPaymentMethodViewModel(this.stripe, this.args, (ErrorMessageTranslator) null, 4, (f) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddPaymentMethodViewModel(Stripe stripe2, AddPaymentMethodActivityStarter.Args args2, ErrorMessageTranslator errorMessageTranslator2, int i, f fVar) {
        this(stripe2, args2, (i & 4) != 0 ? TranslatorManager.INSTANCE.getErrorMessageTranslator() : errorMessageTranslator2);
    }

    public final /* synthetic */ LiveData<Result<PaymentMethod>> attachPaymentMethod$payments_core_release(CustomerSession customerSession, PaymentMethod paymentMethod) {
        i.e(customerSession, "customerSession");
        i.e(paymentMethod, "paymentMethod");
        y yVar = new y();
        String str = paymentMethod.id;
        if (str == null) {
            str = "";
        }
        customerSession.attachPaymentMethod$payments_core_release(str, this.productUsage, new AddPaymentMethodViewModel$attachPaymentMethod$1(this, yVar));
        return yVar;
    }

    public final LiveData<Result<PaymentMethod>> createPaymentMethod$payments_core_release(PaymentMethodCreateParams paymentMethodCreateParams) {
        i.e(paymentMethodCreateParams, "params");
        y yVar = new y();
        Stripe.createPaymentMethod$default(this.stripe, updatedPaymentMethodCreateParams$payments_core_release(paymentMethodCreateParams), (String) null, (String) null, new AddPaymentMethodViewModel$createPaymentMethod$1(yVar), 6, (Object) null);
        return yVar;
    }

    public final PaymentMethodCreateParams updatedPaymentMethodCreateParams$payments_core_release(PaymentMethodCreateParams paymentMethodCreateParams) {
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        i.e(paymentMethodCreateParams2, "params");
        return PaymentMethodCreateParams.copy$default(paymentMethodCreateParams2, (PaymentMethodCreateParams.Type) null, (PaymentMethodCreateParams.Card) null, (PaymentMethodCreateParams.Ideal) null, (PaymentMethodCreateParams.Fpx) null, (PaymentMethodCreateParams.SepaDebit) null, (PaymentMethodCreateParams.AuBecsDebit) null, (PaymentMethodCreateParams.BacsDebit) null, (PaymentMethodCreateParams.Sofort) null, (PaymentMethodCreateParams.Upi) null, (PaymentMethodCreateParams.Netbanking) null, (PaymentMethod.BillingDetails) null, (Map) null, this.productUsage, 4095, (Object) null);
    }

    public AddPaymentMethodViewModel(Stripe stripe2, AddPaymentMethodActivityStarter.Args args2, ErrorMessageTranslator errorMessageTranslator2) {
        i.e(stripe2, "stripe");
        i.e(args2, "args");
        i.e(errorMessageTranslator2, "errorMessageTranslator");
        this.stripe = stripe2;
        this.args = args2;
        this.errorMessageTranslator = errorMessageTranslator2;
        String[] strArr = new String[2];
        strArr[0] = AddPaymentMethodActivity.PRODUCT_TOKEN;
        strArr[1] = args2.isPaymentSessionActive$payments_core_release() ? PaymentSession.PRODUCT_TOKEN : null;
        this.productUsage = g.D0(g.M(strArr));
    }
}
