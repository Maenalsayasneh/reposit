package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.R;
import com.stripe.android.databinding.ShippingMethodViewBinding;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.StripeColorUtils;
import h0.i.b.a;
import java.util.Currency;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/ShippingMethodView;", "Landroid/widget/RelativeLayout;", "", "selected", "Lm0/i;", "setSelected", "(Z)V", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "setShippingMethod", "(Lcom/stripe/android/model/ShippingMethod;)V", "", "unselectedTextColorPrimaryInt", "I", "selectedColorInt", "Lcom/stripe/android/databinding/ShippingMethodViewBinding;", "viewBinding", "Lcom/stripe/android/databinding/ShippingMethodViewBinding;", "Lcom/stripe/android/view/StripeColorUtils;", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "unselectedTextColorSecondaryInt", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ShippingMethodView.kt */
public final class ShippingMethodView extends RelativeLayout {
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int unselectedTextColorPrimaryInt;
    private final int unselectedTextColorSecondaryInt;
    private final ShippingMethodViewBinding viewBinding;

    public ShippingMethodView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ShippingMethodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingMethodView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setSelected(boolean z) {
        if (z) {
            this.viewBinding.name.setTextColor(this.selectedColorInt);
            this.viewBinding.description.setTextColor(this.selectedColorInt);
            this.viewBinding.price.setTextColor(this.selectedColorInt);
            AppCompatImageView appCompatImageView = this.viewBinding.selectedIcon;
            i.d(appCompatImageView, "viewBinding.selectedIcon");
            appCompatImageView.setVisibility(0);
            return;
        }
        this.viewBinding.name.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.description.setTextColor(this.unselectedTextColorSecondaryInt);
        this.viewBinding.price.setTextColor(this.unselectedTextColorPrimaryInt);
        AppCompatImageView appCompatImageView2 = this.viewBinding.selectedIcon;
        i.d(appCompatImageView2, "viewBinding.selectedIcon");
        appCompatImageView2.setVisibility(4);
    }

    public final void setShippingMethod(ShippingMethod shippingMethod) {
        i.e(shippingMethod, "shippingMethod");
        TextView textView = this.viewBinding.name;
        i.d(textView, "viewBinding.name");
        textView.setText(shippingMethod.getLabel());
        TextView textView2 = this.viewBinding.description;
        i.d(textView2, "viewBinding.description");
        textView2.setText(shippingMethod.getDetail());
        TextView textView3 = this.viewBinding.price;
        i.d(textView3, "viewBinding.price");
        long amount = shippingMethod.getAmount();
        Currency currency = shippingMethod.getCurrency();
        String string = getContext().getString(R.string.price_free);
        i.d(string, "context.getString(R.string.price_free)");
        textView3.setText(PaymentUtils.formatPriceStringUsingFree(amount, currency, string));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        ShippingMethodViewBinding inflate = ShippingMethodViewBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "ShippingMethodViewBindin…text),\n        this\n    )");
        this.viewBinding = inflate;
        int colorAccent = stripeColorUtils.getColorAccent();
        int textColorPrimary = stripeColorUtils.getTextColorPrimary();
        int textColorSecondary = stripeColorUtils.getTextColorSecondary();
        StripeColorUtils.Companion companion = StripeColorUtils.Companion;
        this.selectedColorInt = companion.isColorTransparent(colorAccent) ? a.getColor(context, R.color.stripe_accent_color_default) : colorAccent;
        this.unselectedTextColorPrimaryInt = companion.isColorTransparent(textColorPrimary) ? a.getColor(context, R.color.stripe_color_text_unselected_primary_default) : textColorPrimary;
        this.unselectedTextColorSecondaryInt = companion.isColorTransparent(textColorSecondary) ? a.getColor(context, R.color.stripe_color_text_unselected_secondary_default) : textColorSecondary;
    }
}
