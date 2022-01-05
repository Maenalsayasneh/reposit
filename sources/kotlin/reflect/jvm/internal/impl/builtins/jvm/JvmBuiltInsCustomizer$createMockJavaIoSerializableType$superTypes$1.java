package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1 extends Lambda implements a<v> {
    public final /* synthetic */ JvmBuiltInsCustomizer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.c = jvmBuiltInsCustomizer;
    }

    public Object invoke() {
        a0 f = this.c.b.m().f();
        i.d(f, "moduleDescriptor.builtIns.anyType");
        return f;
    }
}
