package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm0/i;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardInputWidget.kt */
public final class CardInputWidget$initView$15 extends Lambda implements l<Boolean, i> {
    public final /* synthetic */ CardInputWidget this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$15(CardInputWidget cardInputWidget) {
        super(1);
        this.this$0 = cardInputWidget;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return i.a;
    }

    public final void invoke(boolean z) {
        this.this$0.getCardBrandView$payments_core_release().setLoading(z);
    }
}
