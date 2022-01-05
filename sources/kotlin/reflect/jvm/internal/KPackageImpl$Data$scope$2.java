package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.a.a;
import m0.r.k;
import m0.r.t.a.r.c.t0.m;
import m0.r.t.a.r.c.v0.a.e;
import m0.r.t.a.r.c.v0.a.i;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.b;

/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$scope$2 extends Lambda implements a<MemberScope> {
    public final /* synthetic */ KPackageImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$scope$2(KPackageImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        List<j> list;
        e a = KPackageImpl.Data.a(this.c);
        if (a == null) {
            return MemberScope.a.b;
        }
        m0.r.t.a.j jVar = this.c.b;
        boolean z = false;
        k kVar = KDeclarationContainerImpl.Data.a[0];
        m0.r.t.a.r.c.v0.a.a aVar = ((i) jVar.invoke()).b;
        Objects.requireNonNull(aVar);
        m0.n.b.i.e(a, "fileClass");
        ConcurrentHashMap<m0.r.t.a.r.g.a, MemberScope> concurrentHashMap = aVar.c;
        m0.r.t.a.r.g.a e = a.e();
        Object obj = concurrentHashMap.get(e);
        if (obj == null) {
            b h = a.e().h();
            m0.n.b.i.d(h, "fileClass.classId.packageFqName");
            KotlinClassHeader kotlinClassHeader = a.b;
            KotlinClassHeader.Kind kind = kotlinClassHeader.a;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            if (kind == kind2) {
                String[] strArr = kotlinClassHeader.c;
                if (kind == kind2) {
                    z = true;
                }
                List<String> list2 = null;
                if (!z) {
                    strArr = null;
                }
                if (strArr != null) {
                    list2 = g.d(strArr);
                }
                if (list2 == null) {
                    list2 = EmptyList.c;
                }
                ArrayList arrayList = new ArrayList();
                for (String d : list2) {
                    m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(new b(m0.r.t.a.r.j.s.b.d(d).a.replace('/', '.')));
                    m0.n.b.i.d(l, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
                    j F0 = h.F0(aVar.b, l);
                    if (F0 != null) {
                        arrayList.add(F0);
                    }
                }
                list = arrayList;
            } else {
                list = h.L2(a);
            }
            m mVar = new m(aVar.a.c().b, h);
            ArrayList arrayList2 = new ArrayList();
            for (j a2 : list) {
                MemberScope a3 = aVar.a.a(mVar, a2);
                if (a3 != null) {
                    arrayList2.add(a3);
                }
            }
            obj = m0.r.t.a.r.j.u.b.h("package " + h + " (" + a + ')', g.v0(arrayList2));
            MemberScope putIfAbsent = concurrentHashMap.putIfAbsent(e, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        m0.n.b.i.d(obj, "cache.getOrPut(fileClass.classId) {\n        val fqName = fileClass.classId.packageFqName\n\n        val parts =\n            if (fileClass.classHeader.kind == KotlinClassHeader.Kind.MULTIFILE_CLASS)\n                fileClass.classHeader.multifilePartNames.mapNotNull { partName ->\n                    val classId = ClassId.topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)\n                    kotlinClassFinder.findKotlinClass(classId)\n                }\n            else listOf(fileClass)\n\n        val packageFragment = EmptyPackageFragmentDescriptor(resolver.components.moduleDescriptor, fqName)\n\n        val scopes = parts.mapNotNull { part ->\n            resolver.createKotlinPackagePartScope(packageFragment, part)\n        }.toList()\n\n        ChainedMemberScope.create(\"package $fqName ($fileClass)\", scopes)\n    }");
        return (MemberScope) obj;
    }
}
