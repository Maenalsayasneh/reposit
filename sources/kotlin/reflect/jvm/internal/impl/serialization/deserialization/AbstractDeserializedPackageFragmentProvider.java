package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptySet;
import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.x;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.k.b.g;
import m0.r.t.a.r.k.b.o;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public abstract class AbstractDeserializedPackageFragmentProvider implements x {
    public final l a;
    public final o b;
    public final u c;
    public g d;
    public final m0.r.t.a.r.l.g<b, v> e;

    public AbstractDeserializedPackageFragmentProvider(l lVar, o oVar, u uVar) {
        i.e(lVar, "storageManager");
        i.e(oVar, "finder");
        i.e(uVar, "moduleDescriptor");
        this.a = lVar;
        this.b = oVar;
        this.c = uVar;
        this.e = lVar.h(new AbstractDeserializedPackageFragmentProvider$fragments$1(this));
    }

    public List<v> a(b bVar) {
        i.e(bVar, "fqName");
        return m0.j.g.L(this.e.invoke(bVar));
    }

    public void b(b bVar, Collection<v> collection) {
        i.e(bVar, "fqName");
        i.e(collection, "packageFragments");
        a.N(collection, this.e.invoke(bVar));
    }

    public Collection<b> n(b bVar, m0.n.a.l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        return EmptySet.c;
    }
}
