package i0.h.a.b.k;

import com.google.android.gms.common.api.Scope;
import h0.b0.v;
import i0.h.a.b.c.g.a;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class d {
    public static final a.g<i0.h.a.b.k.b.a> a;
    public static final a.g<i0.h.a.b.k.b.a> b;
    public static final a.C0131a<i0.h.a.b.k.b.a, a> c;
    public static final a.C0131a<i0.h.a.b.k.b.a, e> d;

    static {
        a.g<i0.h.a.b.k.b.a> gVar = new a.g<>();
        a = gVar;
        a.g<i0.h.a.b.k.b.a> gVar2 = new a.g<>();
        b = gVar2;
        c cVar = new c();
        c = cVar;
        f fVar = new f();
        d = fVar;
        new Scope("profile");
        new Scope("email");
        v.A(cVar, "Cannot construct an Api with a null ClientBuilder");
        v.A(gVar, "Cannot construct an Api with a null ClientKey");
        v.A(fVar, "Cannot construct an Api with a null ClientBuilder");
        v.A(gVar2, "Cannot construct an Api with a null ClientKey");
    }
}
