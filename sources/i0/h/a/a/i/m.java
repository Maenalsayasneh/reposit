package i0.h.a.a.i;

import android.content.Context;
import i0.h.a.a.i.c;
import i0.h.a.a.i.s.e;
import i0.h.a.a.i.s.h.k;
import i0.h.a.a.i.s.h.o;
import i0.h.a.a.i.u.a;
import java.util.Objects;

/* compiled from: TransportRuntime */
public class m implements l {
    public static volatile n a;
    public final a b;
    public final a c;
    public final e d;
    public final k e;

    public m(a aVar, a aVar2, e eVar, k kVar, o oVar) {
        this.b = aVar;
        this.c = aVar2;
        this.d = eVar;
        this.e = kVar;
        oVar.a.execute(new i0.h.a.a.i.s.h.m(oVar));
    }

    public static m a() {
        n nVar = a;
        if (nVar != null) {
            return ((c) nVar).e2.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (m.class) {
                if (a == null) {
                    Objects.requireNonNull(context);
                    Class<Context> cls = Context.class;
                    a = new c(context, (c.a) null);
                }
            }
        }
    }
}
