package com.stripe.android.view;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "invoke", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeActivity.kt */
public final class StripeActivity$progressBar$2 extends Lambda implements a<LinearProgressIndicator> {
    public final /* synthetic */ StripeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeActivity$progressBar$2(StripeActivity stripeActivity) {
        super(0);
        this.this$0 = stripeActivity;
    }

    public final LinearProgressIndicator invoke() {
        return this.this$0.getViewBinding().progressBar;
    }
}
