package i0.h.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate */
public class f extends AnimatorListenerAdapter {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        g gVar = this.a;
        gVar.p.a(gVar.a);
    }
}
