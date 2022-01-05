package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.R;
import com.stripe.android.databinding.MaskedCardViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import h0.i.b.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138G@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020$8\u0006@BX\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcom/stripe/android/view/MaskedCardView;", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "imageView", "Lm0/i;", "applyTint", "(Landroid/widget/ImageView;)V", "updateUi", "()V", "updateBrandIcon", "updateCheckMark", "", "selected", "setSelected", "(Z)V", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "setPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "", "<set-?>", "last4", "Ljava/lang/String;", "getLast4", "()Ljava/lang/String;", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "Lcom/stripe/android/databinding/MaskedCardViewBinding;", "viewBinding", "Lcom/stripe/android/databinding/MaskedCardViewBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/MaskedCardViewBinding;", "Lcom/stripe/android/model/CardBrand;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MaskedCardView.kt */
public final class MaskedCardView extends LinearLayout {
    private CardBrand cardBrand;
    private final CardDisplayTextFactory cardDisplayFactory;
    private String last4;
    private final ThemeConfig themeConfig;
    private final MaskedCardViewBinding viewBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            CardBrand.values();
            int[] iArr = new int[8];
            $EnumSwitchMapping$0 = iArr;
            iArr[CardBrand.AmericanExpress.ordinal()] = 1;
            iArr[CardBrand.Discover.ordinal()] = 2;
            iArr[CardBrand.JCB.ordinal()] = 3;
            iArr[CardBrand.DinersClub.ordinal()] = 4;
            iArr[CardBrand.Visa.ordinal()] = 5;
            iArr[CardBrand.MasterCard.ordinal()] = 6;
            iArr[CardBrand.UnionPay.ordinal()] = 7;
            iArr[CardBrand.Unknown.ordinal()] = 8;
        }
    }

    public MaskedCardView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void applyTint(ImageView imageView) {
        imageView.setImageTintList(ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(true)));
    }

    private final void updateBrandIcon() {
        int i;
        AppCompatImageView appCompatImageView = this.viewBinding.brandIcon;
        Context context = getContext();
        switch (this.cardBrand.ordinal()) {
            case 0:
                i = R.drawable.stripe_ic_amex_template_32;
                break;
            case 1:
                i = R.drawable.stripe_ic_discover_template_32;
                break;
            case 2:
                i = R.drawable.stripe_ic_jcb_template_32;
                break;
            case 3:
                i = R.drawable.stripe_ic_diners_template_32;
                break;
            case 4:
                i = R.drawable.stripe_ic_visa_template_32;
                break;
            case 5:
                i = R.drawable.stripe_ic_mastercard_template_32;
                break;
            case 6:
                i = R.drawable.stripe_ic_unionpay_template_32;
                break;
            case 7:
                i = R.drawable.stripe_ic_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageDrawable(a.getDrawable(context, i));
    }

    private final void updateCheckMark() {
        AppCompatImageView appCompatImageView = this.viewBinding.checkIcon;
        i.d(appCompatImageView, "viewBinding.checkIcon");
        appCompatImageView.setVisibility(isSelected() ? 0 : 4);
    }

    private final void updateUi() {
        updateBrandIcon();
        AppCompatTextView appCompatTextView = this.viewBinding.details;
        i.d(appCompatTextView, "viewBinding.details");
        appCompatTextView.setText(this.cardDisplayFactory.createStyled$payments_core_release(this.cardBrand, this.last4, isSelected()));
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final MaskedCardViewBinding getViewBinding$payments_core_release() {
        return this.viewBinding;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        CardBrand cardBrand2;
        i.e(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        if (card == null || (cardBrand2 = card.brand) == null) {
            cardBrand2 = CardBrand.Unknown;
        }
        this.cardBrand = cardBrand2;
        this.last4 = card != null ? card.last4 : null;
        updateUi();
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        updateCheckMark();
        updateUi();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.cardBrand = CardBrand.Unknown;
        MaskedCardViewBinding inflate = MaskedCardViewBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "MaskedCardViewBinding.in…text),\n        this\n    )");
        this.viewBinding = inflate;
        ThemeConfig themeConfig2 = new ThemeConfig(context);
        this.themeConfig = themeConfig2;
        Resources resources = getResources();
        i.d(resources, "resources");
        this.cardDisplayFactory = new CardDisplayTextFactory(resources, themeConfig2);
        AppCompatImageView appCompatImageView = inflate.brandIcon;
        i.d(appCompatImageView, "viewBinding.brandIcon");
        applyTint(appCompatImageView);
        AppCompatImageView appCompatImageView2 = inflate.checkIcon;
        i.d(appCompatImageView2, "viewBinding.checkIcon");
        applyTint(appCompatImageView2);
    }
}
