package h0.z.a;

import android.animation.Animator;
import h0.z.a.d;

/* compiled from: CircularProgressDrawable */
public class c implements Animator.AnimatorListener {
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;

    public c(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        d.a aVar = this.a;
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        d dVar = this.b;
        if (dVar.b2) {
            dVar.b2 = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.b(false);
            return;
        }
        dVar.a2 += 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        this.b.a2 = 0.0f;
    }
}
