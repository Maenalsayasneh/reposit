package m0.r.t.a.r.k.b;

import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.f.c.a;
import m0.r.t.a.r.f.c.c;

/* compiled from: ProtoBasedClassDataFinder.kt */
public final class q implements e {
    public final c a;
    public final a b;
    public final l<m0.r.t.a.r.g.a, h0> c;
    public final Map<m0.r.t.a.r.g.a, ProtoBuf$Class> d;

    public q(ProtoBuf$PackageFragment protoBuf$PackageFragment, c cVar, a aVar, l<? super m0.r.t.a.r.g.a, ? extends h0> lVar) {
        i.e(protoBuf$PackageFragment, "proto");
        i.e(cVar, "nameResolver");
        i.e(aVar, "metadataVersion");
        i.e(lVar, "classSource");
        this.a = cVar;
        this.b = aVar;
        this.c = lVar;
        List<ProtoBuf$Class> list = protoBuf$PackageFragment.b2;
        i.d(list, "proto.class_List");
        int R2 = h.R2(h.K(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(R2 < 16 ? 16 : R2);
        for (T next : list) {
            linkedHashMap.put(h.X0(this.a, ((ProtoBuf$Class) next).Z1), next);
        }
        this.d = linkedHashMap;
    }

    public d a(m0.r.t.a.r.g.a aVar) {
        i.e(aVar, "classId");
        ProtoBuf$Class protoBuf$Class = this.d.get(aVar);
        if (protoBuf$Class == null) {
            return null;
        }
        return new d(this.a, protoBuf$Class, this.b, this.c.invoke(aVar));
    }
}
