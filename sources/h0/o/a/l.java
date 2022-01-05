package h0.o.a;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.Fragment;
import h0.i.e.a;

/* compiled from: FragmentAnim */
public class l implements a.C0042a {
    public final /* synthetic */ Fragment a;

    public l(Fragment fragment) {
        this.a = fragment;
    }

    public void a() {
        if (this.a.getAnimatingAway() != null) {
            View animatingAway = this.a.getAnimatingAway();
            this.a.setAnimatingAway((View) null);
            animatingAway.clearAnimation();
        }
        this.a.setAnimator((Animator) null);
    }
}
