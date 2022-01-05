package i0.j.f.s.g.j;

import android.view.ViewTreeObserver;
import android.view.animation.Animation;

/* compiled from: RateUsFragment */
public class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Animation c;
    public final /* synthetic */ Animation d;
    public final /* synthetic */ Animation q;
    public final /* synthetic */ com.instabug.survey.ui.i.j.a x;

    public a(com.instabug.survey.ui.i.j.a aVar, Animation animation, Animation animation2, Animation animation3) {
        this.x = aVar;
        this.c = animation;
        this.d = animation2;
        this.q = animation3;
    }

    public void onGlobalLayout() {
        com.instabug.survey.ui.i.j.a aVar = this.x;
        int i = com.instabug.survey.ui.i.j.a.b2;
        if (aVar.q != null) {
            aVar.d2.startAnimation(this.c);
            this.x.c2.startAnimation(this.d);
            this.x.q.startAnimation(this.q);
        }
    }
}
