package h0.g.b.b;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ x c;
    public final /* synthetic */ View[] d;

    public /* synthetic */ a(x xVar, View[] viewArr) {
        this.c = xVar;
        this.d = viewArr;
    }

    public final void run() {
        x xVar = this.c;
        View[] viewArr = this.d;
        if (xVar.p != -1) {
            for (View tag : viewArr) {
                tag.setTag(xVar.p, Long.valueOf(System.nanoTime()));
            }
        }
        if (xVar.q != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(xVar.q, (Object) null);
            }
        }
    }
}
