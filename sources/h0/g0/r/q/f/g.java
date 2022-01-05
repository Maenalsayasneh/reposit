package h0.g0.r.q.f;

import android.content.Context;
import h0.g0.r.t.q.a;

/* compiled from: Trackers */
public class g {
    public static g a;
    public a b;
    public b c;
    public e d;
    public f e;

    public g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = new a(applicationContext, aVar);
        this.c = new b(applicationContext, aVar);
        this.d = new e(applicationContext, aVar);
        this.e = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (a == null) {
                a = new g(context, aVar);
            }
            gVar = a;
        }
        return gVar;
    }
}
