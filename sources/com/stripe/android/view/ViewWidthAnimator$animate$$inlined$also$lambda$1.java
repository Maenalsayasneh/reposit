package com.stripe.android.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TypeCastException;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "valueAnimator", "Lm0/i;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "com/stripe/android/view/ViewWidthAnimator$animate$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ViewWidthAnimator.kt */
public final class ViewWidthAnimator$animate$$inlined$also$lambda$1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $endWidth$inlined;
    public final /* synthetic */ a $onAnimationEnd$inlined;
    public final /* synthetic */ ViewWidthAnimator this$0;

    public ViewWidthAnimator$animate$$inlined$also$lambda$1(ViewWidthAnimator viewWidthAnimator, int i, a aVar) {
        this.this$0 = viewWidthAnimator;
        this.$endWidth$inlined = i;
        this.$onAnimationEnd$inlined = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i.d(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        View access$getView$p = this.this$0.view;
        ViewGroup.LayoutParams layoutParams = access$getView$p.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = intValue;
            access$getView$p.setLayoutParams(layoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
