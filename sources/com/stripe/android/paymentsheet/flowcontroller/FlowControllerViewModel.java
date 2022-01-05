package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import h0.q.k0;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "Lh0/q/k0;", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "initData", "Lm0/i;", "setInitData", "(Lcom/stripe/android/paymentsheet/flowcontroller/InitData;)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getInitData", "()Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "_initData", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FlowControllerViewModel.kt */
public final class FlowControllerViewModel extends k0 {
    private InitData _initData;
    private PaymentSelection paymentSelection;

    public final InitData getInitData() {
        InitData initData = this._initData;
        if (initData != null) {
            return initData;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final PaymentSelection getPaymentSelection() {
        return this.paymentSelection;
    }

    public final void setInitData(InitData initData) {
        i.e(initData, "initData");
        this._initData = initData;
    }

    public final void setPaymentSelection(PaymentSelection paymentSelection2) {
        this.paymentSelection = paymentSelection2;
    }
}
