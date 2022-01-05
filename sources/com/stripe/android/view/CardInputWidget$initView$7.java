package com.stripe.android.view;

import android.view.View;
import com.stripe.android.view.CardInputListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "hasFocus", "Lm0/i;", "onFocusChange", "(Landroid/view/View;Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardInputWidget.kt */
public final class CardInputWidget$initView$7 implements View.OnFocusChangeListener {
    public final /* synthetic */ CardInputWidget this$0;

    public CardInputWidget$initView$7(CardInputWidget cardInputWidget) {
        this.this$0 = cardInputWidget;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.this$0.scrollEnd();
            CardInputListener access$getCardInputListener$p = this.this$0.cardInputListener;
            if (access$getCardInputListener$p != null) {
                access$getCardInputListener$p.onFocusChange(CardInputListener.FocusField.PostalCode);
            }
        }
    }
}
