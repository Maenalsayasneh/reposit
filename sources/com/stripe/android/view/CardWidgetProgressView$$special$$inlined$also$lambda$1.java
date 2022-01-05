package com.stripe.android.view;

import android.view.animation.Animation;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t¸\u0006\u0000"}, d2 = {"com/stripe/android/view/CardWidgetProgressView$fadeIn$1$1", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "p0", "Lm0/i;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardWidgetProgressView.kt */
public final class CardWidgetProgressView$$special$$inlined$also$lambda$1 implements Animation.AnimationListener {
    public final /* synthetic */ CardWidgetProgressView this$0;

    public CardWidgetProgressView$$special$$inlined$also$lambda$1(CardWidgetProgressView cardWidgetProgressView) {
        this.this$0 = cardWidgetProgressView;
    }

    public void onAnimationEnd(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.this$0.setVisibility(0);
    }
}
