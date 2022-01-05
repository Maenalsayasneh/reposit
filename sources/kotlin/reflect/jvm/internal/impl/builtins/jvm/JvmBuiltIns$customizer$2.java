package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.l.l;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns$customizer$2 extends Lambda implements a<JvmBuiltInsCustomizer> {
    public final /* synthetic */ JvmBuiltIns c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, l lVar) {
        super(0);
        this.c = jvmBuiltIns;
        this.d = lVar;
    }

    public Object invoke() {
        v vVar = this.c.b;
        if (vVar != null) {
            i.d(vVar, "builtInsModule");
            l lVar = this.d;
            final JvmBuiltIns jvmBuiltIns = this.c;
            return new JvmBuiltInsCustomizer(vVar, lVar, new a<JvmBuiltIns.a>() {
                public Object invoke() {
                    a<JvmBuiltIns.a> aVar = JvmBuiltIns.this.g;
                    if (aVar != null) {
                        JvmBuiltIns.a invoke = aVar.invoke();
                        JvmBuiltIns.this.g = null;
                        return invoke;
                    }
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
            });
        }
        f.a(6);
        throw null;
    }
}
