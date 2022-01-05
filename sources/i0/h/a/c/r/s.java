package i0.h.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
public class s extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;

    public s(t tVar) {
        this.a = tVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        t tVar = this.a;
        if (tVar.m) {
            tVar.g.setRepeatCount(-1);
            t tVar2 = this.a;
            tVar2.n.a(tVar2.a);
            this.a.m = false;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        t tVar = this.a;
        tVar.j = (tVar.j + 1) % tVar.i.c.length;
        tVar.k = true;
    }
}
