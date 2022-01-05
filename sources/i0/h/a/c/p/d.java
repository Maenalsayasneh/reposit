package i0.h.a.c.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import i0.h.a.c.p.e;

/* compiled from: FloatingActionButtonImpl */
public class d extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e.f b;
    public final /* synthetic */ e c;

    public d(e eVar, boolean z, e.f fVar) {
        this.c = eVar;
        this.a = z;
        this.b = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.c;
        eVar.B = 0;
        eVar.v = null;
        e.f fVar = this.b;
        if (fVar != null) {
            b bVar = (b) fVar;
            bVar.a.b(bVar.b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.c.F.b(0, this.a);
        e eVar = this.c;
        eVar.B = 2;
        eVar.v = animator;
    }
}
