package h0.o.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h0.i.e.a;
import h0.o.a.j0;

/* compiled from: FragmentAnim */
public class n extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ j0.a d;
    public final /* synthetic */ a e;

    public n(ViewGroup viewGroup, View view, Fragment fragment, j0.a aVar, a aVar2) {
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
        this.d = aVar;
        this.e = aVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator animator2 = this.c.getAnimator();
        this.c.setAnimator((Animator) null);
        if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
            ((FragmentManager.d) this.d).a(this.c, this.e);
        }
    }
}
