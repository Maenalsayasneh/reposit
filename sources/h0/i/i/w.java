package h0.i.i;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import m0.n.b.i;
import m0.s.h;

/* compiled from: ViewGroup.kt */
public final class w implements h<View> {
    public final /* synthetic */ ViewGroup a;

    public w(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public Iterator<View> iterator() {
        ViewGroup viewGroup = this.a;
        i.e(viewGroup, "$this$iterator");
        return new x(viewGroup);
    }
}
