package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.x;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.u.f;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.a;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class LazyJavaPackageFragmentProvider implements x {
    public final c a;
    public final a<b, LazyJavaPackageFragment> b;

    public LazyJavaPackageFragmentProvider(m0.r.t.a.r.e.a.u.a aVar) {
        i.e(aVar, "components");
        c cVar = new c(aVar, f.a.a, new InitializedLazyImpl(null));
        this.a = cVar;
        this.b = cVar.a.a.b();
    }

    public List<LazyJavaPackageFragment> a(b bVar) {
        i.e(bVar, "fqName");
        return g.L(c(bVar));
    }

    public void b(b bVar, Collection<v> collection) {
        i.e(bVar, "fqName");
        i.e(collection, "packageFragments");
        m0.r.t.a.r.m.a1.a.N(collection, c(bVar));
    }

    public final LazyJavaPackageFragment c(b bVar) {
        t b2 = this.a.a.b.b(bVar);
        if (b2 == null) {
            return null;
        }
        return (LazyJavaPackageFragment) ((LockBasedStorageManager.d) this.b).c(bVar, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, b2));
    }

    public Collection n(b bVar, l lVar) {
        List list;
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        LazyJavaPackageFragment c = c(bVar);
        if (c == null) {
            list = null;
        } else {
            list = (List) c.d2.invoke();
        }
        return list != null ? list : EmptyList.c;
    }
}
