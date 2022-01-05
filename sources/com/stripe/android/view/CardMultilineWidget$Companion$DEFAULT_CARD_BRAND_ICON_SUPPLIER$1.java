package com.stripe.android.view;

import com.stripe.android.model.CardBrand;
import com.stripe.android.view.CardMultilineWidget;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/CardBrand;", "cardBrand", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "get", "(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardMultilineWidget.kt */
public final class CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1 implements CardMultilineWidget.CardBrandIconSupplier {
    public static final CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1 INSTANCE = new CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1();

    public final CardMultilineWidget.CardBrandIcon get(CardBrand cardBrand) {
        i.e(cardBrand, "cardBrand");
        return new CardMultilineWidget.CardBrandIcon(cardBrand.getIcon(), cardBrand == CardBrand.Unknown);
    }
}
