package i0.h.a.c.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseTransientBottomBar b;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.b = baseTransientBottomBar;
        this.a = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.d(this.a);
    }
}
