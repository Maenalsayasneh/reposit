package com.stripe.android.view;

import android.text.Editable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/view/CardFormView$cardValidTextWatcher$1", "Lcom/stripe/android/view/StripeTextWatcher;", "Landroid/text/Editable;", "s", "Lm0/i;", "afterTextChanged", "(Landroid/text/Editable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardFormView.kt */
public final class CardFormView$cardValidTextWatcher$1 extends StripeTextWatcher {
    public final /* synthetic */ CardFormView this$0;

    public CardFormView$cardValidTextWatcher$1(CardFormView cardFormView) {
        this.this$0 = cardFormView;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        CardValidCallback access$getCardValidCallback$p = this.this$0.cardValidCallback;
        if (access$getCardValidCallback$p != null) {
            access$getCardValidCallback$p.onInputChanged(this.this$0.getInvalidFields().isEmpty(), this.this$0.getInvalidFields());
        }
    }
}
