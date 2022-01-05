package h0.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import h0.f.a;

/* compiled from: Transition */
public class k extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;
    public final /* synthetic */ j b;

    public k(j jVar, a aVar) {
        this.b = jVar;
        this.a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k2.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.b.k2.add(animator);
    }
}
