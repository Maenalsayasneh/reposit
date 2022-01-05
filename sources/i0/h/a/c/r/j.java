package i0.h.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import h0.c0.a.a.b;
import java.util.List;
import java.util.Objects;

/* compiled from: DrawableWithAnimatedVisibilityChange */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        l lVar = this.a;
        List<b> list = lVar.Z1;
        if (list != null && !lVar.a2) {
            for (b requireNonNull : list) {
                Objects.requireNonNull(requireNonNull);
            }
        }
    }
}
