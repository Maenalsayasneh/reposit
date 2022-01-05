package com.stripe.android.view;

import android.view.ViewStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/ViewStub;", "invoke", "()Landroid/view/ViewStub;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeActivity.kt */
public final class StripeActivity$viewStub$2 extends Lambda implements a<ViewStub> {
    public final /* synthetic */ StripeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeActivity$viewStub$2(StripeActivity stripeActivity) {
        super(0);
        this.this$0 = stripeActivity;
    }

    public final ViewStub invoke() {
        ViewStub viewStub = this.this$0.getViewBinding().viewStub;
        i.d(viewStub, "viewBinding.viewStub");
        return viewStub;
    }
}
