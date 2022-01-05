package i0.j.e.m0.e;

import android.view.animation.Animation;
import android.widget.ListView;

/* compiled from: InstabugDialogFragment */
public class g implements Animation.AnimationListener {
    public final /* synthetic */ ListView c;

    public g(ListView listView) {
        this.c = listView;
    }

    public void onAnimationEnd(Animation animation) {
        this.c.setVerticalScrollBarEnabled(true);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.c.setVerticalScrollBarEnabled(false);
    }
}
