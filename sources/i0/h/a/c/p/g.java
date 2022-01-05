package i0.h.a.c.p;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl */
public class g implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ e c;

    public g(e eVar) {
        this.c = eVar;
    }

    public boolean onPreDraw() {
        e eVar = this.c;
        float rotation = eVar.F.getRotation();
        if (eVar.y == rotation) {
            return true;
        }
        eVar.y = rotation;
        eVar.u();
        return true;
    }
}
