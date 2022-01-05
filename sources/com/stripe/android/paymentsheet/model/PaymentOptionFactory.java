package com.stripe.android.paymentsheet.model;

import android.content.res.Resources;
import com.stripe.android.R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "", "", "last4", "createCardLabel", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/model/CardBrand;", "brand", "", "getIcon", "(Lcom/stripe/android/model/CardBrand;)I", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "selection", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "create", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/PaymentOption;", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionFactory.kt */
public final class PaymentOptionFactory {
    private final Resources resources;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            PaymentMethod.Type.values();
            int[] iArr = new int[21];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            CardBrand.values();
            int[] iArr2 = new int[8];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[CardBrand.Visa.ordinal()] = 1;
            iArr2[CardBrand.AmericanExpress.ordinal()] = 2;
            iArr2[CardBrand.Discover.ordinal()] = 3;
            iArr2[CardBrand.JCB.ordinal()] = 4;
            iArr2[CardBrand.DinersClub.ordinal()] = 5;
            iArr2[CardBrand.MasterCard.ordinal()] = 6;
            iArr2[CardBrand.UnionPay.ordinal()] = 7;
            iArr2[CardBrand.Unknown.ordinal()] = 8;
        }
    }

    public PaymentOptionFactory(Resources resources2) {
        i.e(resources2, "resources");
        this.resources = resources2;
    }

    private final String createCardLabel(String str) {
        String string = str != null ? this.resources.getString(R.string.paymentsheet_payment_method_item_card_number, new Object[]{str}) : null;
        return string != null ? string : "";
    }

    private final int getIcon(CardBrand cardBrand) {
        switch (cardBrand.ordinal()) {
            case 0:
                return R.drawable.stripe_ic_paymentsheet_card_amex;
            case 1:
                return R.drawable.stripe_ic_paymentsheet_card_discover;
            case 2:
                return R.drawable.stripe_ic_paymentsheet_card_jcb;
            case 3:
                return R.drawable.stripe_ic_paymentsheet_card_dinersclub;
            case 4:
                return R.drawable.stripe_ic_paymentsheet_card_visa;
            case 5:
                return R.drawable.stripe_ic_paymentsheet_card_mastercard;
            case 6:
                return R.drawable.stripe_ic_paymentsheet_card_unionpay;
            case 7:
                return R.drawable.stripe_ic_paymentsheet_card_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final PaymentOption create(PaymentSelection paymentSelection) {
        PaymentMethod.Card card;
        i.e(paymentSelection, "selection");
        String str = null;
        if (i.a(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            return new PaymentOption(R.drawable.stripe_google_pay_mark, "Google Pay");
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            PaymentSelection.Saved saved = (PaymentSelection.Saved) paymentSelection;
            PaymentMethod.Type type = saved.getPaymentMethod().type;
            if (type == null || type.ordinal() != 0 || (card = saved.getPaymentMethod().card) == null) {
                return null;
            }
            return new PaymentOption(getIcon(card.brand), createCardLabel(card.last4));
        } else if (paymentSelection instanceof PaymentSelection.New.Card) {
            PaymentSelection.New.Card card2 = (PaymentSelection.New.Card) paymentSelection;
            int icon = getIcon(card2.getBrand());
            PaymentMethodCreateParams.Card card$payments_core_release = card2.getPaymentMethodCreateParams().getCard$payments_core_release();
            if (card$payments_core_release != null) {
                str = card$payments_core_release.getLast4$payments_core_release();
            }
            return new PaymentOption(icon, createCardLabel(str));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
