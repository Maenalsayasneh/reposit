package i0.h.a.c.b;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import i0.h.a.c.w.g;

/* compiled from: AppBarLayout */
public class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ g a;

    public b(AppBarLayout appBarLayout, g gVar) {
        this.a = gVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
