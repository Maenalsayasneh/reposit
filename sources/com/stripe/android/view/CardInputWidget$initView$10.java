package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/i;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardInputWidget.kt */
public final class CardInputWidget$initView$10 extends Lambda implements a<i> {
    public final /* synthetic */ CardInputWidget this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$10(CardInputWidget cardInputWidget) {
        super(0);
        this.this$0 = cardInputWidget;
    }

    public final void invoke() {
        this.this$0.scrollEnd();
        CardInputListener access$getCardInputListener$p = this.this$0.cardInputListener;
        if (access$getCardInputListener$p != null) {
            access$getCardInputListener$p.onCardComplete();
        }
    }
}
