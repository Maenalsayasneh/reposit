package h0.b.f;

import android.view.View;
import android.view.Window;
import h0.b.e.i.a;

/* compiled from: ToolbarWidgetWrapper */
public class x0 implements View.OnClickListener {
    public final a c;
    public final /* synthetic */ y0 d;

    public x0(y0 y0Var) {
        this.d = y0Var;
        this.c = new a(y0Var.a.getContext(), 0, 16908332, 0, y0Var.i);
    }

    public void onClick(View view) {
        y0 y0Var = this.d;
        Window.Callback callback = y0Var.l;
        if (callback != null && y0Var.m) {
            callback.onMenuItemSelected(0, this.c);
        }
    }
}
