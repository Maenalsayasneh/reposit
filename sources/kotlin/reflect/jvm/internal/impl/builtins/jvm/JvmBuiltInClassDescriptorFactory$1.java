package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.a;
import m0.r.t.a.r.b.k.e;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class JvmBuiltInClassDescriptorFactory$1 extends Lambda implements l<u, a> {
    public static final JvmBuiltInClassDescriptorFactory$1 c = new JvmBuiltInClassDescriptorFactory$1();

    public JvmBuiltInClassDescriptorFactory$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        u uVar = (u) obj;
        i.e(uVar, "module");
        List<v> F = uVar.M(e.c).F();
        ArrayList arrayList = new ArrayList();
        for (T next : F) {
            if (next instanceof a) {
                arrayList.add(next);
            }
        }
        return (a) g.u(arrayList);
    }
}
