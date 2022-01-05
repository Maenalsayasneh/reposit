package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "viewState", "Lm0/i;", "invoke", "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$googlePayButtonStateObserver$1 extends Lambda implements l<PaymentSheetViewState, i> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$googlePayButtonStateObserver$1(PaymentSheetActivity paymentSheetActivity) {
        super(1);
        this.this$0 = paymentSheetActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentSheetViewState) obj);
        return i.a;
    }

    public final void invoke(PaymentSheetViewState paymentSheetViewState) {
        PrimaryButton.State state = null;
        this.this$0.updateErrorMessage(paymentSheetViewState != null ? paymentSheetViewState.getErrorMessage() : null);
        GooglePayButton googlePayButton = this.this$0.getViewBinding$payments_core_release().googlePayButton;
        if (paymentSheetViewState != null) {
            state = PaymentSheetViewModelKt.convert(paymentSheetViewState);
        }
        googlePayButton.updateState(state);
    }
}
