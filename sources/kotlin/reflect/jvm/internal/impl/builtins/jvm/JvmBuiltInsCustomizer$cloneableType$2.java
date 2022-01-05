package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import m0.n.a.a;
import m0.r.t.a.r.b.k.e;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a0;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$cloneableType$2 extends Lambda implements a<a0> {
    public final /* synthetic */ JvmBuiltInsCustomizer c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, l lVar) {
        super(0);
        this.c = jvmBuiltInsCustomizer;
        this.d = lVar;
    }

    public Object invoke() {
        u uVar = this.c.g().a;
        e eVar = e.a;
        return h.G0(uVar, e.e, new NotFoundClasses(this.d, this.c.g().a)).q();
    }
}
