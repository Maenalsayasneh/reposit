package m0.r.t.a.r.b.k;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.o.c;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class g implements c<d> {
    public final /* synthetic */ JvmBuiltInsCustomizer a;

    public g(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.a = jvmBuiltInsCustomizer;
    }

    public Iterable a(Object obj) {
        Collection<v> b = ((d) obj).i().b();
        i.d(b, "it.typeConstructor.supertypes");
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.a;
        ArrayList arrayList = new ArrayList();
        for (v I0 : b) {
            f c = I0.I0().c();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            f a2 = c == null ? null : c.a();
            d dVar = a2 instanceof d ? (d) a2 : null;
            if (dVar != null) {
                lazyJavaClassDescriptor = jvmBuiltInsCustomizer.f(dVar);
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }
}
