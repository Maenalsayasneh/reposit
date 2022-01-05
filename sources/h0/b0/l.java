package h0.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition */
public class l extends AnimatorListenerAdapter {
    public final /* synthetic */ j a;

    public l(j jVar) {
        this.a = jVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.p();
        animator.removeListener(this);
    }
}
