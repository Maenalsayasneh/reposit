package com.stripe.android.paymentsheet;

import com.stripe.android.view.CardValidCallback;
import java.util.Set;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isValid", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "<anonymous parameter 1>", "Lm0/i;", "onInputChanged", "(ZLjava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public final class BaseAddCardFragment$onViewCreated$2 implements CardValidCallback {
    public final /* synthetic */ BaseAddCardFragment this$0;

    public BaseAddCardFragment$onViewCreated$2(BaseAddCardFragment baseAddCardFragment) {
        this.this$0 = baseAddCardFragment;
    }

    public final void onInputChanged(boolean z, Set<? extends CardValidCallback.Fields> set) {
        i.e(set, "<anonymous parameter 1>");
        this.this$0.getAddCardViewModel().setCardValid(z);
        this.this$0.updateSelection();
    }
}
