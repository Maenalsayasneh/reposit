package i0.h.a.b.g.h;

import android.content.Context;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.b;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class u2 extends b<a.d.c> implements i0.h.a.b.i.a {
    public static final a.g<c> k;
    public static final e l;
    public static final a.C0131a<c, a.d.c> m;
    public static final a<a.d.c> n;
    public final Context o;

    static {
        e eVar;
        a.g<c> gVar = new a.g<>();
        k = gVar;
        if (!i0.h.a.b.c.m.b.U()) {
            eVar = new f();
        } else {
            eVar = new g();
        }
        l = eVar;
        x2 x2Var = new x2();
        m = x2Var;
        n = new a<>("Recaptcha.API", x2Var, gVar);
    }

    public u2(Context context) {
        super(context, n, null, b.a.a);
        this.o = context;
        ExecutorService executorService = h.a;
        k2.i();
        ExecutorService executorService2 = h.a;
        l2.i();
    }
}
