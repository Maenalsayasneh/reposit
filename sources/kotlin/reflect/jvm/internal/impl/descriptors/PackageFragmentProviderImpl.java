package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.x;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: PackageFragmentProviderImpl.kt */
public final class PackageFragmentProviderImpl implements x {
    public final Collection<v> a;

    public PackageFragmentProviderImpl(Collection<? extends v> collection) {
        i.e(collection, "packageFragments");
        this.a = collection;
    }

    public List<v> a(b bVar) {
        i.e(bVar, "fqName");
        Collection<v> collection = this.a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (i.a(((v) next).d(), bVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void b(b bVar, Collection<v> collection) {
        i.e(bVar, "fqName");
        i.e(collection, "packageFragments");
        for (T next : this.a) {
            if (i.a(((v) next).d(), bVar)) {
                collection.add(next);
            }
        }
    }

    public Collection<b> n(b bVar, l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.d(SequencesKt___SequencesKt.g(g.e(this.a), PackageFragmentProviderImpl$getSubPackagesOf$1.c), new PackageFragmentProviderImpl$getSubPackagesOf$2(bVar)));
    }
}
