package i0.b.c.f;

import android.view.View;
import i0.b.c.f.c;
import m0.n.b.i;

/* compiled from: BaseProxy.kt */
public abstract class a<P extends c<? extends P, ? extends V>, V extends View> implements c<P, V> {
    public final V a;

    public a(V v) {
        i.e(v, "view");
        this.a = v;
    }
}
