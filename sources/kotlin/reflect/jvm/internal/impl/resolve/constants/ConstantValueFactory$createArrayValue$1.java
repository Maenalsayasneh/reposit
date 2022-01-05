package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.v;

/* compiled from: ConstantValueFactory.kt */
public final class ConstantValueFactory$createArrayValue$1 extends Lambda implements l<u, v> {
    public final /* synthetic */ v c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstantValueFactory$createArrayValue$1(v vVar) {
        super(1);
        this.c = vVar;
    }

    public Object invoke(Object obj) {
        i.e((u) obj, "it");
        return this.c;
    }
}
