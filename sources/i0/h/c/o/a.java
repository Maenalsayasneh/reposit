package i0.h.c.o;

import android.content.Context;
import i0.h.c.q.b;

/* compiled from: DefaultHeartBeatInfo */
public final /* synthetic */ class a implements b {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public Object get() {
        f fVar;
        Context context = this.a;
        int i = d.a;
        f fVar2 = f.a;
        synchronized (f.class) {
            if (f.a == null) {
                f.a = new f(context);
            }
            fVar = f.a;
        }
        return fVar;
    }
}
