package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.r0.f;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$Getter$descriptor$2 extends Lambda implements a<d0> {
    public final /* synthetic */ KPropertyImpl.Getter c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Getter$descriptor$2(KPropertyImpl.Getter getter) {
        super(0);
        this.c = getter;
    }

    public Object invoke() {
        d0 getter = this.c.t().p().getGetter();
        if (getter != null) {
            return getter;
        }
        c0 t = this.c.t().p();
        Objects.requireNonNull(f.i);
        return h.g0(t, f.a.b);
    }
}
