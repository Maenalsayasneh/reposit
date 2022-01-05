package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.BaseAddCardFragment;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "errorMessage", "Lm0/i;", "displayErrorMessage", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public final class BaseAddCardFragment$setupCardWidget$6 implements StripeEditText.ErrorMessageListener {
    public final /* synthetic */ BaseAddCardFragment this$0;

    public BaseAddCardFragment$setupCardWidget$6(BaseAddCardFragment baseAddCardFragment) {
        this.this$0 = baseAddCardFragment;
    }

    public final void displayErrorMessage(String str) {
        this.this$0.onCardError(BaseAddCardFragment.AddCardViewModel.Field.Cvc, str);
    }
}
