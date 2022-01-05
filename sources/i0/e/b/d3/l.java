package i0.e.b.d3;

import android.text.style.ClickableSpan;
import android.view.View;
import m0.i;
import m0.n.a.a;

/* compiled from: ViewExtensions.kt */
public final class l extends ClickableSpan {
    public final /* synthetic */ a<i> c;

    public l(a<i> aVar) {
        this.c = aVar;
    }

    public void onClick(View view) {
        m0.n.b.i.e(view, "widget");
        this.c.invoke();
    }
}
