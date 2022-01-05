package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.stripe.android.stripe3ds2.databinding.StripeBrandZoneViewBinding;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "issuerImageView", "Landroid/widget/ImageView;", "getIssuerImageView$3ds2sdk_release", "()Landroid/widget/ImageView;", "paymentSystemImageView", "getPaymentSystemImageView$3ds2sdk_release", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BrandZoneView.kt */
public final class BrandZoneView extends LinearLayout {
    private final ImageView issuerImageView;
    private final ImageView paymentSystemImageView;

    public BrandZoneView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final ImageView getIssuerImageView$3ds2sdk_release() {
        return this.issuerImageView;
    }

    public final ImageView getPaymentSystemImageView$3ds2sdk_release() {
        return this.paymentSystemImageView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        StripeBrandZoneViewBinding inflate = StripeBrandZoneViewBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "StripeBrandZoneViewBindi…           this\n        )");
        ImageView imageView = inflate.issuerImage;
        i.d(imageView, "viewBinding.issuerImage");
        this.issuerImageView = imageView;
        ImageView imageView2 = inflate.paymentSystemImage;
        i.d(imageView2, "viewBinding.paymentSystemImage");
        this.paymentSystemImageView = imageView2;
    }
}
