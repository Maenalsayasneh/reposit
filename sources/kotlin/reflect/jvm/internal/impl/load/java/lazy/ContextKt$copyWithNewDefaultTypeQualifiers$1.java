package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.e.a.o;
import m0.r.t.a.r.e.a.u.c;

/* compiled from: context.kt */
public final class ContextKt$copyWithNewDefaultTypeQualifiers$1 extends Lambda implements a<o> {
    public final /* synthetic */ c c;
    public final /* synthetic */ f d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextKt$copyWithNewDefaultTypeQualifiers$1(c cVar, f fVar) {
        super(0);
        this.c = cVar;
        this.d = fVar;
    }

    public Object invoke() {
        return h.S(this.c, this.d);
    }
}
