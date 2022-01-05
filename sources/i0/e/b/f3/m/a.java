package i0.e.b.f3.m;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ View c;

    public /* synthetic */ a(View view) {
        this.c = view;
    }

    public final void run() {
        View view = this.c;
        i.e(view, "$this_apply");
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
