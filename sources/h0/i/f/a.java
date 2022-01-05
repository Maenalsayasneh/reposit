package h0.i.f;

import android.graphics.Typeface;
import h0.i.b.d.h;
import h0.i.c.e;

/* compiled from: CallbackWithHandler */
public class a implements Runnable {
    public final /* synthetic */ m c;
    public final /* synthetic */ Typeface d;

    public a(c cVar, m mVar, Typeface typeface) {
        this.c = mVar;
        this.d = typeface;
    }

    public void run() {
        m mVar = this.c;
        Typeface typeface = this.d;
        h.a aVar = ((e.a) mVar).a;
        if (aVar != null) {
            aVar.e(typeface);
        }
    }
}
