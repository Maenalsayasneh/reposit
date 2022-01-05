package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.stripe.android.databinding.CardBrandViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020'¢\u0006\u0004\b3\u00104J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004R+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168F@FX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00065"}, d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", "Lm0/i;", "updateIcon", "()V", "renderBrandIcon", "applyTint", "", "<set-?>", "isLoading$delegate", "Lm0/o/d;", "isLoading", "()Z", "setLoading", "(Z)V", "Lcom/stripe/android/view/CardWidgetProgressView;", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "shouldShowErrorIcon$delegate", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "shouldShowErrorIcon", "Lcom/stripe/android/model/CardBrand;", "brand$delegate", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "setBrand", "(Lcom/stripe/android/model/CardBrand;)V", "brand", "shouldShowCvc$delegate", "getShouldShowCvc", "setShouldShowCvc", "shouldShowCvc", "Lcom/stripe/android/databinding/CardBrandViewBinding;", "viewBinding", "Lcom/stripe/android/databinding/CardBrandViewBinding;", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "", "tintColorInt", "I", "getTintColorInt$payments_core_release", "()I", "setTintColorInt$payments_core_release", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardBrandView.kt */
public final class CardBrandView extends FrameLayout {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(CardBrandView.class, "isLoading", "isLoading()Z", 0), a.o1(CardBrandView.class, AccountRangeJsonParser.FIELD_BRAND, "getBrand()Lcom/stripe/android/model/CardBrand;", 0), a.o1(CardBrandView.class, "shouldShowCvc", "getShouldShowCvc()Z", 0), a.o1(CardBrandView.class, "shouldShowErrorIcon", "getShouldShowErrorIcon()Z", 0)};
    private final d brand$delegate;
    private final ImageView iconView;
    private final d isLoading$delegate;
    /* access modifiers changed from: private */
    public final CardWidgetProgressView progressView;
    private final d shouldShowCvc$delegate;
    private final d shouldShowErrorIcon$delegate;
    private int tintColorInt;
    private final CardBrandViewBinding viewBinding;

    public CardBrandView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void applyTint() {
        ImageView imageView = this.iconView;
        Drawable drawable = imageView.getDrawable();
        drawable.mutate().setTint(this.tintColorInt);
        imageView.setImageDrawable(g0.a.b.b.a.D0(drawable));
    }

    private final void renderBrandIcon() {
        this.iconView.setImageResource(getBrand().getIcon());
        if (getBrand() == CardBrand.Unknown) {
            applyTint();
        }
    }

    /* access modifiers changed from: private */
    public final void updateIcon() {
        if (isLoading()) {
            renderBrandIcon();
        } else if (getShouldShowErrorIcon()) {
            this.iconView.setImageResource(getBrand().getErrorIcon());
        } else if (getShouldShowCvc()) {
            this.iconView.setImageResource(getBrand().getCvcIcon());
            applyTint();
        } else {
            renderBrandIcon();
        }
    }

    public final CardBrand getBrand() {
        return (CardBrand) this.brand$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final boolean getShouldShowCvc() {
        return ((Boolean) this.shouldShowCvc$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getShouldShowErrorIcon() {
        return ((Boolean) this.shouldShowErrorIcon$delegate.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final int getTintColorInt$payments_core_release() {
        return this.tintColorInt;
    }

    public final boolean isLoading() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setBrand(CardBrand cardBrand) {
        i.e(cardBrand, "<set-?>");
        this.brand$delegate.setValue(this, $$delegatedProperties[1], cardBrand);
    }

    public final void setLoading(boolean z) {
        this.isLoading$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setShouldShowCvc(boolean z) {
        this.shouldShowCvc$delegate.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setShouldShowErrorIcon(boolean z) {
        this.shouldShowErrorIcon$delegate.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setTintColorInt$payments_core_release(int i) {
        this.tintColorInt = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        CardBrandViewBinding inflate = CardBrandViewBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "CardBrandViewBinding.inf…text),\n        this\n    )");
        this.viewBinding = inflate;
        ImageView imageView = inflate.icon;
        i.d(imageView, "viewBinding.icon");
        this.iconView = imageView;
        CardWidgetProgressView cardWidgetProgressView = inflate.progress;
        i.d(cardWidgetProgressView, "viewBinding.progress");
        this.progressView = cardWidgetProgressView;
        Boolean bool = Boolean.FALSE;
        this.isLoading$delegate = new CardBrandView$$special$$inlined$observable$1(bool, bool, this);
        CardBrand cardBrand = CardBrand.Unknown;
        this.brand$delegate = new CardBrandView$$special$$inlined$observable$2(cardBrand, cardBrand, this);
        this.shouldShowCvc$delegate = new CardBrandView$$special$$inlined$observable$3(bool, bool, this);
        this.shouldShowErrorIcon$delegate = new CardBrandView$$special$$inlined$observable$4(bool, bool, this);
        setClickable(false);
        setFocusable(false);
        addOnLayoutChangeListener(new CardBrandView$$special$$inlined$doOnNextLayout$1(this));
    }
}
