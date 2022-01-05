package i0.h.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import h0.c0.a.a.b;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange */
public class k extends AnimatorListenerAdapter {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        boolean unused = k.super.setVisible(false, false);
        l lVar = this.a;
        List<b> list = lVar.Z1;
        if (list != null && !lVar.a2) {
            for (b a2 : list) {
                a2.a(lVar);
            }
        }
    }
}
