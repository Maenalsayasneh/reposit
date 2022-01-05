package m0.r.t.a.r.e.b;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import m0.n.b.i;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.k.b.d;
import m0.r.t.a.r.k.b.e;

/* compiled from: JavaClassDataFinder.kt */
public final class c implements e {
    public final i a;
    public final DeserializedDescriptorResolver b;

    public c(i iVar, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        i.e(iVar, "kotlinClassFinder");
        i.e(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.a = iVar;
        this.b = deserializedDescriptorResolver;
    }

    public d a(a aVar) {
        i.e(aVar, "classId");
        j F0 = h.F0(this.a, aVar);
        if (F0 == null) {
            return null;
        }
        i.a(F0.e(), aVar);
        return this.b.f(F0);
    }
}
