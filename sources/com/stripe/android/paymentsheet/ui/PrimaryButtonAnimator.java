package com.stripe.android.paymentsheet.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.stripe.android.R;
import kotlin.Metadata;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "", "Landroid/view/View;", "view", "", "parentWidth", "Lkotlin/Function0;", "Lm0/i;", "onAnimationEnd", "slideToCenter", "(Landroid/view/View;ILm0/n/a/a;)V", "delay", "(Landroid/view/View;Lm0/n/a/a;)V", "fadeIn$payments_core_release", "fadeIn", "fadeOut$payments_core_release", "(Landroid/view/View;)V", "fadeOut", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "slideAnimationDuration", "J", "<init>", "(Landroid/content/Context;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PrimaryButtonAnimator.kt */
public final class PrimaryButtonAnimator {
    public static final Companion Companion = new Companion((f) null);
    public static final long HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION = 1500;
    private final Context context;
    private final long slideAnimationDuration;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator$Companion;", "", "", "HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION", "J", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PrimaryButtonAnimator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PrimaryButtonAnimator(Context context2) {
        i.e(context2, "context");
        this.context = context2;
        this.slideAnimationDuration = (long) context2.getResources().getInteger(17694720);
    }

    /* access modifiers changed from: private */
    public final void delay(View view, a<m0.i> aVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 0.0f});
        i.d(ofFloat, "animator");
        ofFloat.setDuration(HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
        ofFloat.addListener(new PrimaryButtonAnimator$delay$$inlined$also$lambda$1(aVar));
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    public final void slideToCenter(View view, int i, a<m0.i> aVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, -(((((float) (view.getRight() - view.getLeft())) / 2.0f) + ((float) view.getLeft())) - (((float) i) / 2.0f))});
        i.d(ofFloat, "animator");
        ofFloat.setDuration(this.slideAnimationDuration);
        ofFloat.addListener(new PrimaryButtonAnimator$slideToCenter$$inlined$also$lambda$1(this, view, aVar));
        ofFloat.start();
    }

    public final void fadeIn$payments_core_release(View view, int i, a<m0.i> aVar) {
        i.e(view, "view");
        i.e(aVar, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, R.anim.stripe_paymentsheet_transition_fade_in);
        loadAnimation.setAnimationListener(new PrimaryButtonAnimator$fadeIn$$inlined$also$lambda$1(this, view, i, aVar));
        view.startAnimation(loadAnimation);
    }

    public final void fadeOut$payments_core_release(View view) {
        i.e(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, R.anim.stripe_paymentsheet_transition_fade_out);
        loadAnimation.setAnimationListener(new PrimaryButtonAnimator$fadeOut$$inlined$also$lambda$1(view));
        view.startAnimation(loadAnimation);
    }
}
