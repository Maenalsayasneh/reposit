package m0.r.t.a.r.b;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.g0;
import m0.r.t.a.r.c.t0.m;
import m0.r.t.a.r.c.t0.w;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.p;

/* compiled from: suspendFunctionTypes.kt */
public final class h {
    public static final w a;
    public static final w b;

    static {
        u i = p.i();
        i.d(i, "getErrorModule()");
        m mVar = new m(i, g.e);
        ClassKind classKind = ClassKind.INTERFACE;
        d g = g.f.g();
        h0 h0Var = h0.a;
        l lVar = LockBasedStorageManager.b;
        w wVar = new w(mVar, classKind, false, false, g, h0Var, lVar);
        Modality modality = Modality.ABSTRACT;
        if (modality != null) {
            wVar.c2 = modality;
            m0.r.t.a.r.c.p pVar = o.e;
            if (pVar != null) {
                wVar.d2 = pVar;
                Objects.requireNonNull(f.i);
                f fVar = f.a.b;
                Variance variance = Variance.IN_VARIANCE;
                wVar.I0(i0.j.f.p.h.L2(g0.M0(wVar, fVar, false, variance, d.g("T"), 0, lVar)));
                wVar.H0();
                a = wVar;
                u i2 = p.i();
                i.d(i2, "getErrorModule()");
                w wVar2 = new w(new m(i2, g.d), classKind, false, false, g.g.g(), h0Var, lVar);
                wVar2.c2 = modality;
                wVar2.d2 = pVar;
                wVar2.I0(i0.j.f.p.h.L2(g0.M0(wVar2, fVar, false, variance, d.g("T"), 0, lVar)));
                wVar2.H0();
                b = wVar2;
                return;
            }
            w.I(9);
            throw null;
        }
        w.I(6);
        throw null;
    }

    public static final boolean a(b bVar, boolean z) {
        if (z) {
            return i.a(bVar, g.g);
        }
        return i.a(bVar, g.f);
    }
}
