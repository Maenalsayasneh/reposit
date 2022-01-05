package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.stripe.android.databinding.StripeGooglePayButtonBinding;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/GooglePayButton;", "Landroid/widget/FrameLayout;", "Lm0/i;", "onReadyState", "()V", "onStartProcessing", "onFinishProcessing", "", "enabled", "setEnabled", "(Z)V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "state", "updateState", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", "Lcom/stripe/android/databinding/StripeGooglePayButtonBinding;", "viewBinding", "Lcom/stripe/android/databinding/StripeGooglePayButtonBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/StripeGooglePayButtonBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: GooglePayButton.kt */
public final class GooglePayButton extends FrameLayout {
    private final StripeGooglePayButtonBinding viewBinding;

    public GooglePayButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public GooglePayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void onFinishProcessing() {
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        i.d(primaryButton, "viewBinding.primaryButton");
        primaryButton.setVisibility(0);
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        i.d(relativeLayout, "viewBinding.googlePayButtonIcon");
        relativeLayout.setVisibility(8);
    }

    private final void onReadyState() {
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        i.d(primaryButton, "viewBinding.primaryButton");
        primaryButton.setVisibility(8);
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        i.d(relativeLayout, "viewBinding.googlePayButtonIcon");
        relativeLayout.setVisibility(0);
    }

    private final void onStartProcessing() {
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        i.d(primaryButton, "viewBinding.primaryButton");
        primaryButton.setVisibility(0);
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        i.d(relativeLayout, "viewBinding.googlePayButtonIcon");
        relativeLayout.setVisibility(8);
    }

    public final StripeGooglePayButtonBinding getViewBinding$payments_core_release() {
        return this.viewBinding;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        i.d(primaryButton, "viewBinding.primaryButton");
        primaryButton.setEnabled(z);
    }

    public final void updateState(PrimaryButton.State state) {
        this.viewBinding.primaryButton.updateState(state);
        if (state instanceof PrimaryButton.State.Ready) {
            onReadyState();
        } else if (i.a(state, PrimaryButton.State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state instanceof PrimaryButton.State.FinishProcessing) {
            onFinishProcessing();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GooglePayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        StripeGooglePayButtonBinding inflate = StripeGooglePayButtonBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "StripeGooglePayButtonBin…text),\n        this\n    )");
        this.viewBinding = inflate;
        setClickable(true);
        super.setEnabled(true);
        PrimaryButton primaryButton = inflate.primaryButton;
        i.d(primaryButton, "viewBinding.primaryButton");
        primaryButton.setBackgroundTintList(ColorStateList.valueOf(-16777216));
    }
}
