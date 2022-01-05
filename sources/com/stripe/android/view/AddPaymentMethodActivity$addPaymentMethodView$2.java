package com.stripe.android.view;

import com.stripe.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodView;", "invoke", "()Lcom/stripe/android/view/AddPaymentMethodView;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodActivity.kt */
public final class AddPaymentMethodActivity$addPaymentMethodView$2 extends Lambda implements a<AddPaymentMethodView> {
    public final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$addPaymentMethodView$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    public final AddPaymentMethodView invoke() {
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        AddPaymentMethodView access$createPaymentMethodView = addPaymentMethodActivity.createPaymentMethodView(addPaymentMethodActivity.getArgs());
        access$createPaymentMethodView.setId(R.id.stripe_add_payment_method_form);
        return access$createPaymentMethodView;
    }
}
