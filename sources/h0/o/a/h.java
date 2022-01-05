package h0.o.a;

import android.graphics.Rect;
import android.view.View;

/* compiled from: DefaultSpecialEffectsController */
public class h implements Runnable {
    public final /* synthetic */ l0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Rect q;

    public h(b bVar, l0 l0Var, View view, Rect rect) {
        this.c = l0Var;
        this.d = view;
        this.q = rect;
    }

    public void run() {
        this.c.j(this.d, this.q);
    }
}
