package i0.h.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate */
public class e extends AnimatorListenerAdapter {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        g gVar = this.a;
        gVar.m = (gVar.m + 4) % gVar.l.c.length;
    }
}
