package com.stripe.android.paymentsheet;

import com.stripe.android.R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.view.CardMultilineWidget;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/CardBrand;", "cardBrand", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "get", "(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public final class BaseAddCardFragment$setupCardWidget$3 implements CardMultilineWidget.CardBrandIconSupplier {
    public static final BaseAddCardFragment$setupCardWidget$3 INSTANCE = new BaseAddCardFragment$setupCardWidget$3();

    public final CardMultilineWidget.CardBrandIcon get(CardBrand cardBrand) {
        int i;
        i.e(cardBrand, "cardBrand");
        switch (cardBrand.ordinal()) {
            case 0:
                i = R.drawable.stripe_ic_paymentsheet_card_amex;
                break;
            case 1:
                i = R.drawable.stripe_ic_paymentsheet_card_discover;
                break;
            case 2:
                i = R.drawable.stripe_ic_paymentsheet_card_jcb;
                break;
            case 3:
                i = R.drawable.stripe_ic_paymentsheet_card_dinersclub;
                break;
            case 4:
                i = R.drawable.stripe_ic_paymentsheet_card_visa;
                break;
            case 5:
                i = R.drawable.stripe_ic_paymentsheet_card_mastercard;
                break;
            case 6:
                i = R.drawable.stripe_ic_paymentsheet_card_unionpay;
                break;
            case 7:
                i = R.drawable.stripe_ic_paymentsheet_card_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new CardMultilineWidget.CardBrandIcon(i, false, 2, (f) null);
    }
}
