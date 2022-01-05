package com.stripe.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.TypeCastException;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/stripe/android/view/ViewWidthAnimator$animate$1$2", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lm0/i;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ViewWidthAnimator.kt */
public final class ViewWidthAnimator$animate$$inlined$also$lambda$2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int $endWidth$inlined;
    public final /* synthetic */ a $onAnimationEnd$inlined;
    public final /* synthetic */ ViewWidthAnimator this$0;

    public ViewWidthAnimator$animate$$inlined$also$lambda$2(ViewWidthAnimator viewWidthAnimator, int i, a aVar) {
        this.this$0 = viewWidthAnimator;
        this.$endWidth$inlined = i;
        this.$onAnimationEnd$inlined = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        View access$getView$p = this.this$0.view;
        ViewGroup.LayoutParams layoutParams = access$getView$p.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.$endWidth$inlined;
            access$getView$p.setLayoutParams(layoutParams);
            this.$onAnimationEnd$inlined.invoke();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
