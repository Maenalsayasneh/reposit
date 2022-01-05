package i0.e.b.g3.o.x0;

import android.view.View;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ x c;

    public /* synthetic */ a(x xVar) {
        this.c = xVar;
    }

    public final void onClick(View view) {
        x xVar = this.c;
        i.e(xVar, "this$0");
        View.OnClickListener onClickListener = xVar.q;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
