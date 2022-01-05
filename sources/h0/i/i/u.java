package h0.i.i;

import android.view.View;
import h0.i.i.q;

/* compiled from: ViewCompat */
public class u extends q.b<Boolean> {
    public u(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    public Object b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    public void c(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    public boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
