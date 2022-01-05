package com.stripe.android.paymentsheet.ui;

import android.view.View;
import android.view.animation.Animation;
import kotlin.Metadata;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t¸\u0006\u0000"}, d2 = {"com/stripe/android/paymentsheet/ui/PrimaryButtonAnimator$fadeIn$1$1", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "p0", "Lm0/i;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PrimaryButtonAnimator.kt */
public final class PrimaryButtonAnimator$fadeIn$$inlined$also$lambda$1 implements Animation.AnimationListener {
    public final /* synthetic */ a $onAnimationEnd$inlined;
    public final /* synthetic */ int $parentWidth$inlined;
    public final /* synthetic */ View $view$inlined;
    public final /* synthetic */ PrimaryButtonAnimator this$0;

    public PrimaryButtonAnimator$fadeIn$$inlined$also$lambda$1(PrimaryButtonAnimator primaryButtonAnimator, View view, int i, a aVar) {
        this.this$0 = primaryButtonAnimator;
        this.$view$inlined = view;
        this.$parentWidth$inlined = i;
        this.$onAnimationEnd$inlined = aVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.$view$inlined.setVisibility(0);
        this.this$0.slideToCenter(this.$view$inlined, this.$parentWidth$inlined, this.$onAnimationEnd$inlined);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.$view$inlined.setVisibility(0);
    }
}
