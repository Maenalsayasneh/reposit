package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "convert", "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "payments-core_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModelKt {
    public static final PrimaryButton.State convert(PaymentSheetViewState paymentSheetViewState) {
        i.e(paymentSheetViewState, "$this$convert");
        if (paymentSheetViewState instanceof PaymentSheetViewState.Reset) {
            return PrimaryButton.State.Ready.INSTANCE;
        }
        if (paymentSheetViewState instanceof PaymentSheetViewState.StartProcessing) {
            return PrimaryButton.State.StartProcessing.INSTANCE;
        }
        if (paymentSheetViewState instanceof PaymentSheetViewState.FinishProcessing) {
            return new PrimaryButton.State.FinishProcessing(((PaymentSheetViewState.FinishProcessing) paymentSheetViewState).getOnComplete());
        }
        throw new NoWhenBranchMatchedException();
    }
}
