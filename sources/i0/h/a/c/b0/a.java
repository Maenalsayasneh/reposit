package i0.h.a.c.b0;

import android.content.Context;
import android.view.View;
import h0.i.i.g0.b;

/* compiled from: ClickActionDelegate */
public class a extends h0.i.i.a {
    public final b.a a;

    public a(Context context, int i) {
        this.a = new b.a(16, context.getString(i));
    }

    public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        bVar.a(this.a);
    }
}
