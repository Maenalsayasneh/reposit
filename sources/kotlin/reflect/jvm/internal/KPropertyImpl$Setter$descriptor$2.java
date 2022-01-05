package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.r0.f;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$Setter$descriptor$2 extends Lambda implements a<e0> {
    public final /* synthetic */ KPropertyImpl.Setter c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Setter$descriptor$2(KPropertyImpl.Setter setter) {
        super(0);
        this.c = setter;
    }

    public Object invoke() {
        e0 setter = this.c.t().p().getSetter();
        if (setter != null) {
            return setter;
        }
        c0 t = this.c.t().p();
        Objects.requireNonNull(f.i);
        f fVar = f.a.b;
        return h.h0(t, fVar, fVar);
    }
}
