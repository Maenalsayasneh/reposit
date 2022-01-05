package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "p1", "", "p2", "Lm0/i;", "invoke", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BasePaymentMethodsListFragment.kt */
public final /* synthetic */ class BasePaymentMethodsListFragment$onViewCreated$adapter$1 extends FunctionReferenceImpl implements p<PaymentSelection, Boolean, i> {
    public BasePaymentMethodsListFragment$onViewCreated$adapter$1(BasePaymentMethodsListFragment basePaymentMethodsListFragment) {
        super(2, basePaymentMethodsListFragment, BasePaymentMethodsListFragment.class, "onPaymentOptionSelected", "onPaymentOptionSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PaymentSelection) obj, ((Boolean) obj2).booleanValue());
        return i.a;
    }

    public final void invoke(PaymentSelection paymentSelection, boolean z) {
        m0.n.b.i.e(paymentSelection, "p1");
        ((BasePaymentMethodsListFragment) this.receiver).onPaymentOptionSelected(paymentSelection, z);
    }
}
