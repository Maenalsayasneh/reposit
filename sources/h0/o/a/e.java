package h0.o.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import h0.o.a.b;

/* compiled from: DefaultSpecialEffectsController */
public class e implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ View d;
    public final /* synthetic */ b.C0060b q;

    /* compiled from: DefaultSpecialEffectsController */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            e eVar = e.this;
            eVar.c.endViewTransition(eVar.d);
            e.this.q.a();
        }
    }

    public e(b bVar, ViewGroup viewGroup, View view, b.C0060b bVar2) {
        this.c = viewGroup;
        this.d = view;
        this.q = bVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.c.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
