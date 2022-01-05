package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import i0.j.f.p.h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.s0.a;
import m0.r.t.a.r.c.s0.b;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.w;
import m0.r.t.a.r.d.a.c;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.k.b.f;
import m0.r.t.a.r.k.b.h;
import m0.r.t.a.r.k.b.j;
import m0.r.t.a.r.k.b.m;
import m0.r.t.a.r.k.b.p;
import m0.r.t.a.r.k.b.v.c;
import m0.r.t.a.r.l.l;

/* compiled from: BuiltInsLoaderImpl.kt */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    public final c b = new c();

    public w a(l lVar, u uVar, Iterable<? extends b> iterable, m0.r.t.a.r.c.s0.c cVar, a aVar, boolean z) {
        l lVar2 = lVar;
        u uVar2 = uVar;
        Iterable<? extends b> iterable2 = iterable;
        m0.r.t.a.r.c.s0.c cVar2 = cVar;
        a aVar2 = aVar;
        i.e(lVar2, "storageManager");
        i.e(uVar2, "builtInsModule");
        i.e(iterable2, "classDescriptorFactories");
        i.e(cVar2, "platformDependentDeclarationFilter");
        i.e(aVar2, "additionalClassPartsProvider");
        Set<m0.r.t.a.r.g.b> set = g.p;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.b);
        i.e(lVar2, "storageManager");
        i.e(uVar2, "module");
        i.e(set, "packageFqNames");
        i.e(iterable2, "classDescriptorFactories");
        i.e(cVar2, "platformDependentDeclarationFilter");
        i.e(aVar2, "additionalClassPartsProvider");
        i.e(builtInsLoaderImpl$createPackageFragmentProvider$1, "loadResource");
        ArrayList arrayList = new ArrayList(h.K(set, 10));
        for (m0.r.t.a.r.g.b bVar : set) {
            String a = m0.r.t.a.r.k.b.v.a.m.a(bVar);
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke(a);
            if (inputStream != null) {
                arrayList.add(m0.r.t.a.r.k.b.v.b.I0(bVar, lVar2, uVar2, inputStream, z));
            } else {
                throw new IllegalStateException(i.k("Resource not found in classpath: ", a));
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = r9;
        PackageFragmentProviderImpl packageFragmentProviderImpl2 = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = r7;
        NotFoundClasses notFoundClasses2 = new NotFoundClasses(lVar2, uVar2);
        h.a aVar3 = h.a.a;
        j jVar = r5;
        j jVar2 = new j(packageFragmentProviderImpl2);
        m0.r.t.a.r.k.b.v.a aVar4 = m0.r.t.a.r.k.b.v.a.m;
        m0.r.t.a.r.k.b.b bVar2 = new m0.r.t.a.r.k.b.b(uVar2, notFoundClasses2, aVar4);
        p.a aVar5 = p.a.a;
        m0.r.t.a.r.k.b.l lVar3 = m0.r.t.a.r.k.b.l.a;
        m0.r.t.a.r.k.b.g gVar = r0;
        PackageFragmentProviderImpl packageFragmentProviderImpl3 = packageFragmentProviderImpl2;
        i.d(lVar3, "DO_NOTHING");
        c.a aVar6 = c.a.a;
        PackageFragmentProviderImpl packageFragmentProviderImpl4 = packageFragmentProviderImpl3;
        ArrayList arrayList2 = arrayList;
        m.a aVar7 = m.a.a;
        Objects.requireNonNull(f.a);
        f fVar = f.a.b;
        e eVar = aVar4.a;
        m0.r.t.a.r.j.t.b bVar3 = r2;
        m0.r.t.a.r.j.t.b bVar4 = new m0.r.t.a.r.j.t.b(lVar2, EmptyList.c);
        m0.r.t.a.r.k.b.g gVar2 = new m0.r.t.a.r.k.b.g(lVar, uVar, aVar3, jVar, bVar2, packageFragmentProviderImpl, aVar5, lVar3, aVar6, aVar7, iterable, notFoundClasses, fVar, aVar, cVar, eVar, (m0.r.t.a.r.m.x0.h) null, bVar3, (m0.r.t.a.r.c.s0.e) null, 327680);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((m0.r.t.a.r.k.b.v.b) it.next()).H0(gVar);
        }
        return packageFragmentProviderImpl4;
    }
}
