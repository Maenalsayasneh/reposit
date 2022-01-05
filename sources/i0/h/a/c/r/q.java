package i0.h.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
public class q extends AnimatorListenerAdapter {
    public final /* synthetic */ r a;

    public q(r rVar) {
        this.a = rVar;
    }

    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        r rVar = this.a;
        rVar.h = (rVar.h + 1) % rVar.g.c.length;
        rVar.i = true;
    }
}
