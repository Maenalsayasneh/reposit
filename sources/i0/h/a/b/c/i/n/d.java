package i0.h.a.b.c.i.n;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zaaa;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.b;
import i0.h.a.b.c.g.j.n;
import i0.h.a.b.c.i.o;
import i0.h.a.b.m.g;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class d extends b<a.d.c> implements o {
    public static final a.g<e> k;
    public static final a.C0131a<e, a.d.c> l;
    public static final a<a.d.c> m;

    static {
        a.g<e> gVar = new a.g<>();
        k = gVar;
        f fVar = new f();
        l = fVar;
        m = new a<>("ClientTelemetry.API", fVar, gVar);
    }

    public d(Context context) {
        super(context, m, a.d.g, b.a.a);
    }

    public final g<Void> d(zaaa zaaa) {
        n.a a = n.a();
        a.c = new Feature[]{i0.h.a.b.g.c.d.a};
        a.b = false;
        a.a = new c(zaaa);
        return c(2, a.a());
    }
}
