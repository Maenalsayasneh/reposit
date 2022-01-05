package com.stripe.android.paymentsheet;

import com.stripe.android.view.CardInputListener;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"com/stripe/android/paymentsheet/BaseAddCardFragment$onViewCreated$3", "Lcom/stripe/android/view/CardInputListener;", "Lcom/stripe/android/view/CardInputListener$FocusField;", "focusField", "Lm0/i;", "onFocusChange", "(Lcom/stripe/android/view/CardInputListener$FocusField;)V", "onCardComplete", "()V", "onExpirationComplete", "onCvcComplete", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public final class BaseAddCardFragment$onViewCreated$3 implements CardInputListener {
    public final /* synthetic */ BaseAddCardFragment this$0;

    public BaseAddCardFragment$onViewCreated$3(BaseAddCardFragment baseAddCardFragment) {
        this.this$0 = baseAddCardFragment;
    }

    public void onCardComplete() {
    }

    public void onCvcComplete() {
        BaseAddCardFragment.access$getBillingAddressView$p(this.this$0).focusFirstField();
    }

    public void onExpirationComplete() {
    }

    public void onFocusChange(CardInputListener.FocusField focusField) {
        i.e(focusField, "focusField");
    }
}
