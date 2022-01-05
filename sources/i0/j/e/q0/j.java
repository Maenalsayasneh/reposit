package i0.j.e.q0;

import android.content.Context;
import i0.j.e.t0.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import k0.b.l;
import k0.b.w.a;

/* compiled from: LoggingFileResolver */
public class j {
    public static final String a = e.class.getSimpleName();
    public e b;
    public ConcurrentLinkedQueue<b> c = new ConcurrentLinkedQueue<>();
    public a d;
    public WeakReference<Context> e;

    public j(Context context) {
        this.b = new e(context);
        this.e = new WeakReference<>(context);
        this.b.c();
        if (this.d == null) {
            this.d = l.n(2, TimeUnit.SECONDS).v(k0.b.d0.a.c()).i(new i(this)).p(new h(this)).t(new f(this), new g(), k0.b.z.b.a.c, k0.b.z.b.a.d);
        }
    }
}
