package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.a;
import m0.r.t.a.q.c;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$Getter$caller$2 extends Lambda implements a<c<?>> {
    public final /* synthetic */ KPropertyImpl.Getter c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Getter$caller$2(KPropertyImpl.Getter getter) {
        super(0);
        this.c = getter;
    }

    public Object invoke() {
        return h.j(this.c, true);
    }
}
