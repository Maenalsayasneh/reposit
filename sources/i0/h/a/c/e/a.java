package i0.h.a.c.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class a extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public a(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.w(this.a);
        this.a.J2 = null;
    }

    public void onAnimationStart(Animator animator) {
        this.a.O2++;
    }
}
