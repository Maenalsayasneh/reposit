package com.stripe.android.view;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Metadata;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/ViewWidthAnimator;", "", "", "startWidth", "endWidth", "Lkotlin/Function0;", "Lm0/i;", "onAnimationEnd", "animate", "(IILm0/n/a/a;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "", "duration", "J", "<init>", "(Landroid/view/View;J)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ViewWidthAnimator.kt */
public final class ViewWidthAnimator {
    private final long duration;
    /* access modifiers changed from: private */
    public final View view;

    public ViewWidthAnimator(View view2, long j) {
        i.e(view2, "view");
        this.view = view2;
        this.duration = j;
    }

    public final void animate(int i, int i2, a<m0.i> aVar) {
        i.e(aVar, "onAnimationEnd");
        ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{i, i2}).setDuration(this.duration);
        duration2.addUpdateListener(new ViewWidthAnimator$animate$$inlined$also$lambda$1(this, i2, aVar));
        duration2.addListener(new ViewWidthAnimator$animate$$inlined$also$lambda$2(this, i2, aVar));
        duration2.start();
    }
}
