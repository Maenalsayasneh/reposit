package h0.i.f;

import android.os.Handler;
import h0.i.f.j;

/* compiled from: CallbackWithHandler */
public class c {
    public final m a;
    public final Handler b;

    public c(m mVar, Handler handler) {
        this.a = mVar;
        this.b = handler;
    }

    public void a(j.a aVar) {
        int i = aVar.b;
        if (i == 0) {
            this.b.post(new a(this, this.a, aVar.a));
            return;
        }
        this.b.post(new b(this, this.a, i));
    }
}
