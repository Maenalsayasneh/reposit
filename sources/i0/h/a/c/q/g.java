package i0.h.a.c.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class g {
    public final ArrayList<b> a = new ArrayList<>();
    public b b = null;
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new a();

    /* compiled from: StateListAnimator */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.c == animator) {
                gVar.c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }
}
