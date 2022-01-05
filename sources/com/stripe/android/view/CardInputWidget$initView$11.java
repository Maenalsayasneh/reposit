package com.stripe.android.view;

import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/CardBrand;", "brand", "Lm0/i;", "invoke", "(Lcom/stripe/android/model/CardBrand;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardInputWidget.kt */
public final class CardInputWidget$initView$11 extends Lambda implements l<CardBrand, i> {
    public final /* synthetic */ CardInputWidget this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInputWidget$initView$11(CardInputWidget cardInputWidget) {
        super(1);
        this.this$0 = cardInputWidget;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CardBrand) obj);
        return i.a;
    }

    public final void invoke(CardBrand cardBrand) {
        m0.n.b.i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
        this.this$0.getCardBrandView$payments_core_release().setBrand(cardBrand);
        CardInputWidget cardInputWidget = this.this$0;
        cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.getCardNumberEditText$payments_core_release().getPanLength$payments_core_release());
        this.this$0.updateCvc();
    }
}
