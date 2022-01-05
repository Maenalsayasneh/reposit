package h0.i.i;

import android.view.View;
import h0.i.i.q;

/* compiled from: ViewCompat */
public class r extends q.b<Boolean> {
    public r(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    public Object b(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }

    public void c(View view, Object obj) {
        view.setScreenReaderFocusable(((Boolean) obj).booleanValue());
    }

    public boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
