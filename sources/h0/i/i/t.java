package h0.i.i;

import android.text.TextUtils;
import android.view.View;
import h0.i.i.q;

/* compiled from: ViewCompat */
public class t extends q.b<CharSequence> {
    public t(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    public Object b(View view) {
        return view.getStateDescription();
    }

    public void c(View view, Object obj) {
        view.setStateDescription((CharSequence) obj);
    }

    public boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
