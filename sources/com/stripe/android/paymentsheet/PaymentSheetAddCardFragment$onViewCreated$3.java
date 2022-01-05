package com.stripe.android.paymentsheet;

import android.widget.TextView;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "viewState", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetAddCardFragment.kt */
public final class PaymentSheetAddCardFragment$onViewCreated$3<T> implements z<PaymentSheetViewState> {
    public final /* synthetic */ GooglePayButton $googlePayButton;
    public final /* synthetic */ TextView $messageView;
    public final /* synthetic */ PaymentSheetAddCardFragment this$0;

    public PaymentSheetAddCardFragment$onViewCreated$3(PaymentSheetAddCardFragment paymentSheetAddCardFragment, TextView textView, GooglePayButton googlePayButton) {
        this.this$0 = paymentSheetAddCardFragment;
        this.$messageView = textView;
        this.$googlePayButton = googlePayButton;
    }

    public final void onChanged(PaymentSheetViewState paymentSheetViewState) {
        BaseSheetViewModel.UserErrorMessage errorMessage;
        TextView textView = this.$messageView;
        PrimaryButton.State state = null;
        int i = 0;
        if (!((paymentSheetViewState != null ? paymentSheetViewState.getErrorMessage() : null) != null)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.$messageView.setText((paymentSheetViewState == null || (errorMessage = paymentSheetViewState.getErrorMessage()) == null) ? null : errorMessage.getMessage());
        GooglePayButton googlePayButton = this.$googlePayButton;
        if (paymentSheetViewState != null) {
            state = PaymentSheetViewModelKt.convert(paymentSheetViewState);
        }
        googlePayButton.updateState(state);
        if (paymentSheetViewState instanceof PaymentSheetViewState.Reset) {
            this.this$0.updateSelection();
        }
    }
}
