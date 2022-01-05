package com.stripe.android.paymentsheet.ui;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n¸\u0006\u000b"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lm0/i;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release", "com/stripe/android/paymentsheet/ui/PrimaryButtonAnimator$$special$$inlined$doOnEnd$1"}, k = 1, mv = {1, 4, 2})
/* compiled from: Animator.kt */
public final class PrimaryButtonAnimator$slideToCenter$$inlined$also$lambda$1 implements Animator.AnimatorListener {
    public final /* synthetic */ a $onAnimationEnd$inlined;
    public final /* synthetic */ View $view$inlined;
    public final /* synthetic */ PrimaryButtonAnimator this$0;

    public PrimaryButtonAnimator$slideToCenter$$inlined$also$lambda$1(PrimaryButtonAnimator primaryButtonAnimator, View view, a aVar) {
        this.this$0 = primaryButtonAnimator;
        this.$view$inlined = view;
        this.$onAnimationEnd$inlined = aVar;
    }

    public void onAnimationCancel(Animator animator) {
        i.f(animator, "animator");
    }

    public void onAnimationEnd(Animator animator) {
        i.f(animator, "animator");
        this.this$0.delay(this.$view$inlined, this.$onAnimationEnd$inlined);
    }

    public void onAnimationRepeat(Animator animator) {
        i.f(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        i.f(animator, "animator");
    }
}
