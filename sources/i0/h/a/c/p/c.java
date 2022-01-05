package i0.h.a.c.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i0.h.a.c.p.e;

/* compiled from: FloatingActionButtonImpl */
public class c extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e.f c;
    public final /* synthetic */ e d;

    public c(e eVar, boolean z, e.f fVar) {
        this.d = eVar;
        this.b = z;
        this.c = fVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.d;
        eVar.B = 0;
        eVar.v = null;
        if (!this.a) {
            FloatingActionButton floatingActionButton = eVar.F;
            boolean z = this.b;
            floatingActionButton.b(z ? 8 : 4, z);
            e.f fVar = this.c;
            if (fVar != null) {
                b bVar = (b) fVar;
                bVar.a.a(bVar.b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.d.F.b(0, this.b);
        e eVar = this.d;
        eVar.B = 1;
        eVar.v = animator;
        this.a = false;
    }
}
