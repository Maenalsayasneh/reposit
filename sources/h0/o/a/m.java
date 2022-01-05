package h0.o.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h0.o.a.j0;

/* compiled from: FragmentAnim */
public class m implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Fragment d;
    public final /* synthetic */ j0.a q;
    public final /* synthetic */ h0.i.e.a x;

    /* compiled from: FragmentAnim */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (m.this.d.getAnimatingAway() != null) {
                m.this.d.setAnimatingAway((View) null);
                m mVar = m.this;
                ((FragmentManager.d) mVar.q).a(mVar.d, mVar.x);
            }
        }
    }

    public m(ViewGroup viewGroup, Fragment fragment, j0.a aVar, h0.i.e.a aVar2) {
        this.c = viewGroup;
        this.d = fragment;
        this.q = aVar;
        this.x = aVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.c.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
