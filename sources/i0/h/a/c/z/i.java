package i0.h.a.c.z;

import android.animation.ValueAnimator;

/* compiled from: DropdownMenuEndIconDelegate */
public class i implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
