package i0.j.f.s.g.l;

import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.ImageView;

/* compiled from: ThanksFragment */
public class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Animation c;
    public final /* synthetic */ Animation d;
    public final /* synthetic */ Animation q;
    public final /* synthetic */ com.instabug.survey.ui.i.m.a x;

    public a(com.instabug.survey.ui.i.m.a aVar, Animation animation, Animation animation2, Animation animation3) {
        this.x = aVar;
        this.c = animation;
        this.d = animation2;
        this.q = animation3;
    }

    public void onGlobalLayout() {
        ImageView imageView;
        com.instabug.survey.ui.i.m.a aVar = this.x;
        if (aVar.q != null && (imageView = aVar.d) != null && aVar.x != null) {
            imageView.startAnimation(this.c);
            this.x.q.startAnimation(this.d);
            this.x.x.startAnimation(this.q);
        }
    }
}
