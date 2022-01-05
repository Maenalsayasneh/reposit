package m0.r.t.a.r.c.t0;

import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.a.l;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.t0.b;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: AbstractClassDescriptor */
public class a implements l<e, a0> {
    public final /* synthetic */ b.a c;

    public a(b.a aVar) {
        this.c = aVar;
    }

    public Object invoke(Object obj) {
        e eVar = (e) obj;
        f e = eVar.e(b.this);
        if (e == null) {
            return (a0) b.this.d.invoke();
        }
        if (e instanceof l0) {
            return KotlinTypeFactory.b((l0) e, s0.f(e.i().getParameters()));
        }
        if (e instanceof s) {
            return s0.o(e.i().a(eVar), ((s) e).E(eVar), this);
        }
        return e.q();
    }
}
