package i0.h.a.c.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import i0.h.a.c.k.c;

/* compiled from: FabTransformationBehavior */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ i0.h.a.c.k.c a;

    public c(FabTransformationBehavior fabTransformationBehavior, i0.h.a.c.k.c cVar) {
        this.a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
