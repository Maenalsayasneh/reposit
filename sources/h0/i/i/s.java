package h0.i.i;

import android.text.TextUtils;
import android.view.View;
import h0.i.i.q;

/* compiled from: ViewCompat */
public class s extends q.b<CharSequence> {
    public s(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    public Object b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public void c(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    public boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
