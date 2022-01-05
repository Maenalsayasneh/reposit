package com.stripe.android.view;

import android.content.Context;
import com.stripe.android.CustomerSession;
import com.stripe.android.R;
import com.stripe.android.StripeError;
import com.stripe.android.model.PaymentMethod;
import h0.b.a.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001!BT\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lh0/b/a/d;", "create", "(Lcom/stripe/android/model/PaymentMethod;)Lh0/b/a/d;", "Lm0/i;", "onDeletedPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "onDeletedPaymentMethod", "Lkotlin/Function1;", "onDeletedPaymentMethodCallback", "Lm0/n/a/l;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Ljava/lang/Object;", "", "", "productUsage", "Ljava/util/Set;", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lm0/n/a/l;)V", "PaymentMethodDeleteListener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DeletePaymentMethodDialogFactory.kt */
public final class DeletePaymentMethodDialogFactory {
    /* access modifiers changed from: private */
    public final PaymentMethodsAdapter adapter;
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Context context;
    private final Object customerSession;
    private final l<PaymentMethod, i> onDeletedPaymentMethodCallback;
    private final Set<String> productUsage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onPaymentMethodRetrieved", "(Lcom/stripe/android/model/PaymentMethod;)V", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "onError", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DeletePaymentMethodDialogFactory.kt */
    public static final class PaymentMethodDeleteListener implements CustomerSession.PaymentMethodRetrievalListener {
        public void onError(int i, String str, StripeError stripeError) {
            m0.n.b.i.e(str, "errorMessage");
        }

        public void onPaymentMethodRetrieved(PaymentMethod paymentMethod) {
            m0.n.b.i.e(paymentMethod, "paymentMethod");
        }
    }

    public DeletePaymentMethodDialogFactory(Context context2, PaymentMethodsAdapter paymentMethodsAdapter, CardDisplayTextFactory cardDisplayTextFactory2, Object obj, Set<String> set, l<? super PaymentMethod, i> lVar) {
        m0.n.b.i.e(context2, "context");
        m0.n.b.i.e(paymentMethodsAdapter, "adapter");
        m0.n.b.i.e(cardDisplayTextFactory2, "cardDisplayTextFactory");
        m0.n.b.i.e(set, "productUsage");
        m0.n.b.i.e(lVar, "onDeletedPaymentMethodCallback");
        this.context = context2;
        this.adapter = paymentMethodsAdapter;
        this.cardDisplayTextFactory = cardDisplayTextFactory2;
        this.customerSession = obj;
        this.productUsage = set;
        this.onDeletedPaymentMethodCallback = lVar;
    }

    public final d create(PaymentMethod paymentMethod) {
        m0.n.b.i.e(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        String createUnstyled$payments_core_release = card != null ? this.cardDisplayTextFactory.createUnstyled$payments_core_release(card) : null;
        d.a aVar = new d.a(this.context, R.style.AlertDialogStyle);
        aVar.e(R.string.delete_payment_method_prompt_title);
        aVar.a.f = createUnstyled$payments_core_release;
        aVar.d(17039370, new DeletePaymentMethodDialogFactory$create$1(this, paymentMethod));
        aVar.c(17039360, new DeletePaymentMethodDialogFactory$create$2(this, paymentMethod));
        aVar.a.l = new DeletePaymentMethodDialogFactory$create$3(this, paymentMethod);
        d a = aVar.a();
        m0.n.b.i.d(a, "AlertDialog.Builder(cont…  }\n            .create()");
        return a;
    }

    public final void onDeletedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        m0.n.b.i.e(paymentMethod, "paymentMethod");
        this.adapter.deletePaymentMethod$payments_core_release(paymentMethod);
        String str = paymentMethod.id;
        if (str != null) {
            Object obj = this.customerSession;
            if (obj instanceof Result.Failure) {
                obj = null;
            }
            CustomerSession customerSession2 = (CustomerSession) obj;
            if (customerSession2 != null) {
                customerSession2.detachPaymentMethod$payments_core_release(str, this.productUsage, new PaymentMethodDeleteListener());
            }
        }
        this.onDeletedPaymentMethodCallback.invoke(paymentMethod);
    }
}
