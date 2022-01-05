package i0.h.a.c.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* compiled from: BottomAppBar */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public c(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.w(this.a);
        Objects.requireNonNull(this.a);
        this.a.K2 = null;
    }

    public void onAnimationStart(Animator animator) {
        this.a.O2++;
    }
}
