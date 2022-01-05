package com.stripe.android.view;

import com.stripe.android.databinding.StripeActivityBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/databinding/StripeActivityBinding;", "invoke", "()Lcom/stripe/android/databinding/StripeActivityBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeActivity.kt */
public final class StripeActivity$viewBinding$2 extends Lambda implements a<StripeActivityBinding> {
    public final /* synthetic */ StripeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeActivity$viewBinding$2(StripeActivity stripeActivity) {
        super(0);
        this.this$0 = stripeActivity;
    }

    public final StripeActivityBinding invoke() {
        StripeActivityBinding inflate = StripeActivityBinding.inflate(this.this$0.getLayoutInflater());
        i.d(inflate, "StripeActivityBinding.inflate(layoutInflater)");
        return inflate;
    }
}
