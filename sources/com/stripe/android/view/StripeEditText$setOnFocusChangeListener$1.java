package com.stripe.android.view;

import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "view", "", "hasFocus", "Lm0/i;", "onFocusChange", "(Landroid/view/View;Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeEditText.kt */
public final class StripeEditText$setOnFocusChangeListener$1 implements View.OnFocusChangeListener {
    public final /* synthetic */ StripeEditText this$0;

    public StripeEditText$setOnFocusChangeListener$1(StripeEditText stripeEditText) {
        this.this$0 = stripeEditText;
    }

    public final void onFocusChange(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChange : this.this$0.getInternalFocusChangeListeners$payments_core_release()) {
            onFocusChange.onFocusChange(view, z);
        }
        View.OnFocusChangeListener access$getExternalFocusChangeListener$p = this.this$0.externalFocusChangeListener;
        if (access$getExternalFocusChangeListener$p != null) {
            access$getExternalFocusChangeListener$p.onFocusChange(view, z);
        }
    }
}
