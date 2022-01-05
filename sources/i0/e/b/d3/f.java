package i0.e.b.d3;

import android.view.View;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ View c;

    public /* synthetic */ f(View view) {
        this.c = view;
    }

    public final void run() {
        View view = this.c;
        i.e(view, "$this_fadeOut");
        view.setVisibility(8);
    }
}
