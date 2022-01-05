package m0.r.t.a;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$initialize$1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.s0.a;
import m0.r.t.a.r.c.s0.c;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.c.v0.a.f;
import m0.r.t.a.r.c.v0.a.h;
import m0.r.t.a.r.c.v0.a.j;
import m0.r.t.a.r.d.a.c;
import m0.r.t.a.r.e.a.j;
import m0.r.t.a.r.e.a.s.c;
import m0.r.t.a.r.e.a.u.b;
import m0.r.t.a.r.e.a.u.e;
import m0.r.t.a.r.e.b.o;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.t.b;
import m0.r.t.a.r.k.b.f;
import m0.r.t.a.r.k.b.h;
import m0.r.t.a.r.k.b.p;
import m0.r.t.a.r.m.x0.h;
import m0.r.t.a.r.o.g;

/* compiled from: moduleByClassLoader.kt */
public final class i {
    public static final ConcurrentMap<p, WeakReference<m0.r.t.a.r.c.v0.a.i>> a = new ConcurrentHashMap();

    public static final m0.r.t.a.r.c.v0.a.i a(Class<?> cls) {
        LockBasedStorageManager lockBasedStorageManager;
        a aVar;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer;
        m0.n.b.i.e(cls, "$this$getOrCreateModule");
        ClassLoader e = ReflectClassUtilKt.e(cls);
        p pVar = new p(e);
        ConcurrentMap<p, WeakReference<m0.r.t.a.r.c.v0.a.i>> concurrentMap = a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(pVar);
        if (weakReference != null) {
            m0.r.t.a.r.c.v0.a.i iVar = (m0.r.t.a.r.c.v0.a.i) weakReference.get();
            if (iVar != null) {
                m0.n.b.i.d(iVar, "it");
                return iVar;
            }
            concurrentMap.remove(pVar, weakReference);
        }
        m0.n.b.i.e(e, "classLoader");
        LockBasedStorageManager lockBasedStorageManager2 = new LockBasedStorageManager("RuntimeModuleData");
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager2, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
        d j = d.j("<runtime module for " + e + '>');
        m0.n.b.i.d(j, "special(\"<runtime module for $classLoader>\")");
        v vVar = new v(j, lockBasedStorageManager2, jvmBuiltIns, (Map) null, (d) null, 56);
        lockBasedStorageManager2.c.b();
        try {
            if (jvmBuiltIns.b == null) {
                jvmBuiltIns.b = vVar;
                lockBasedStorageManager2.c.a();
                m0.n.b.i.e(vVar, "moduleDescriptor");
                JvmBuiltIns$initialize$1 jvmBuiltIns$initialize$1 = new JvmBuiltIns$initialize$1(vVar, true);
                m0.n.b.i.e(jvmBuiltIns$initialize$1, "computation");
                jvmBuiltIns.g = jvmBuiltIns$initialize$1;
                f fVar = r8;
                f fVar2 = new f(e);
                DeserializedDescriptorResolver deserializedDescriptorResolver = r5;
                DeserializedDescriptorResolver deserializedDescriptorResolver2 = new DeserializedDescriptorResolver();
                e eVar = r3;
                e eVar2 = new e();
                NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager2, vVar);
                o.a aVar2 = o.a.a;
                p pVar2 = pVar;
                NotFoundClasses notFoundClasses2 = notFoundClasses;
                o.a aVar3 = aVar2;
                m0.n.b.i.e(e, "classLoader");
                m0.n.b.i.e(vVar, "module");
                m0.n.b.i.e(lockBasedStorageManager2, "storageManager");
                m0.n.b.i.e(notFoundClasses2, "notFoundClasses");
                m0.n.b.i.e(fVar2, "reflectKotlinClassFinder");
                m0.n.b.i.e(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
                m0.n.b.i.e(eVar2, "singleModuleClassResolver");
                m0.n.b.i.e(aVar2, "packagePartProvider");
                AnnotationTypeQualifierResolver annotationTypeQualifierResolver = r4;
                g gVar = g.b;
                g gVar2 = gVar;
                AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = new AnnotationTypeQualifierResolver(lockBasedStorageManager2, gVar);
                e eVar3 = eVar2;
                f fVar3 = fVar2;
                DeserializedDescriptorResolver deserializedDescriptorResolver3 = deserializedDescriptorResolver2;
                m0.r.t.a.r.c.v0.a.d dVar = r8;
                m0.r.t.a.r.c.v0.a.d dVar2 = new m0.r.t.a.r.c.v0.a.d(e);
                m0.r.t.a.r.e.a.s.e eVar4 = m0.r.t.a.r.e.a.s.e.a;
                f fVar4 = fVar3;
                m0.r.t.a.r.e.a.s.e eVar5 = eVar4;
                m0.n.b.i.d(eVar4, "DO_NOTHING");
                h hVar = h.b;
                m0.r.t.a.r.e.a.u.a aVar4 = r3;
                g gVar3 = gVar;
                h hVar2 = hVar;
                h hVar3 = hVar;
                m0.r.t.a.r.e.a.s.d dVar3 = m0.r.t.a.r.e.a.s.d.a;
                m0.r.t.a.r.e.a.s.d dVar4 = dVar3;
                m0.n.b.i.d(dVar3, "EMPTY");
                m0.r.t.a.r.e.a.s.d dVar5 = dVar3;
                v vVar2 = vVar;
                c.a aVar5 = c.a.a;
                String str = "EMPTY";
                JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
                b bVar = r3;
                m0.r.t.a.r.c.v0.a.d dVar6 = dVar;
                EmptyList emptyList = EmptyList.c;
                b bVar2 = new b(lockBasedStorageManager2, emptyList);
                LockBasedStorageManager lockBasedStorageManager3 = lockBasedStorageManager2;
                j jVar = j.a;
                k0.a aVar6 = k0.a.a;
                c.a aVar7 = c.a.a;
                c.a aVar8 = aVar7;
                c.a aVar9 = aVar7;
                ReflectionTypes reflectionTypes = r3;
                ReflectionTypes reflectionTypes2 = new ReflectionTypes(vVar2, notFoundClasses2);
                SignatureEnhancement signatureEnhancement = r3;
                EmptyList emptyList2 = emptyList;
                NotFoundClasses notFoundClasses3 = notFoundClasses2;
                b.a aVar10 = b.a.a;
                b.a aVar11 = aVar10;
                SignatureEnhancement signatureEnhancement2 = new SignatureEnhancement(annotationTypeQualifierResolver2, gVar3, new m0.r.t.a.r.e.a.x.d(aVar10));
                j.a aVar12 = j.a.a;
                Objects.requireNonNull(m0.r.t.a.r.m.x0.h.b);
                m0.r.t.a.r.m.x0.i iVar2 = h.a.b;
                c.a aVar13 = aVar9;
                m0.r.t.a.r.e.a.u.a aVar14 = new m0.r.t.a.r.e.a.u.a(lockBasedStorageManager3, dVar6, fVar, deserializedDescriptorResolver, eVar5, hVar2, dVar4, aVar5, bVar, jVar, eVar, aVar3, aVar6, aVar8, vVar2, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, aVar12, aVar11, iVar2, gVar2);
                LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(aVar4);
                m0.n.b.i.e(vVar2, "module");
                String str2 = "storageManager";
                LockBasedStorageManager lockBasedStorageManager4 = lockBasedStorageManager3;
                m0.n.b.i.e(lockBasedStorageManager4, str2);
                String str3 = "notFoundClasses";
                NotFoundClasses notFoundClasses4 = notFoundClasses3;
                m0.n.b.i.e(notFoundClasses4, str3);
                m0.n.b.i.e(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
                f fVar5 = fVar4;
                m0.n.b.i.e(fVar5, "reflectKotlinClassFinder");
                DeserializedDescriptorResolver deserializedDescriptorResolver4 = deserializedDescriptorResolver3;
                m0.n.b.i.e(deserializedDescriptorResolver4, "deserializedDescriptorResolver");
                m0.r.t.a.r.e.b.c cVar = new m0.r.t.a.r.e.b.c(fVar5, deserializedDescriptorResolver4);
                m0.r.t.a.r.e.b.b bVar3 = new m0.r.t.a.r.e.b.b(vVar2, notFoundClasses4, lockBasedStorageManager4, fVar5);
                h.a aVar15 = h.a.a;
                Objects.requireNonNull(m0.r.t.a.r.k.b.f.a);
                m0.r.t.a.r.k.b.f fVar6 = f.a.b;
                m0.n.b.i.e(lockBasedStorageManager4, str2);
                m0.n.b.i.e(vVar2, "moduleDescriptor");
                m0.n.b.i.e(aVar15, "configuration");
                m0.n.b.i.e(cVar, "classDataFinder");
                m0.n.b.i.e(bVar3, "annotationAndConstantLoader");
                m0.n.b.i.e(lazyJavaPackageFragmentProvider, "packageFragmentProvider");
                m0.n.b.i.e(notFoundClasses4, str3);
                m0.r.t.a.r.c.v0.a.h hVar4 = hVar3;
                m0.n.b.i.e(hVar4, "errorReporter");
                m0.n.b.i.e(aVar13, "lookupTracker");
                m0.n.b.i.e(fVar6, "contractDeserializer");
                m0.n.b.i.e(iVar2, "kotlinTypeChecker");
                m0.r.t.a.r.b.f m = vVar2.m();
                JvmBuiltIns jvmBuiltIns3 = m instanceof JvmBuiltIns ? (JvmBuiltIns) m : null;
                p.a aVar16 = p.a.a;
                m0.r.t.a.r.e.b.d dVar7 = m0.r.t.a.r.e.b.d.a;
                if (jvmBuiltIns3 == null) {
                    aVar = null;
                } else {
                    aVar = jvmBuiltIns3.O();
                }
                if (aVar == null) {
                    aVar = a.C0252a.a;
                }
                a aVar17 = aVar;
                if (jvmBuiltIns3 == null) {
                    jvmBuiltInsCustomizer = null;
                } else {
                    jvmBuiltInsCustomizer = jvmBuiltIns3.O();
                }
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer2 = jvmBuiltInsCustomizer == null ? c.b.a : jvmBuiltInsCustomizer;
                m0.r.t.a.r.f.d.a.h hVar5 = m0.r.t.a.r.f.d.a.h.a;
                m0.r.t.a.r.h.e eVar6 = m0.r.t.a.r.f.d.a.h.b;
                m0.r.t.a.r.j.t.b bVar4 = r3;
                m0.r.t.a.r.j.t.b bVar5 = new m0.r.t.a.r.j.t.b(lockBasedStorageManager4, emptyList2);
                m0.r.t.a.r.k.b.g gVar4 = r3;
                v vVar3 = vVar2;
                DeserializedDescriptorResolver deserializedDescriptorResolver5 = deserializedDescriptorResolver4;
                m0.r.t.a.r.c.v0.a.f fVar7 = fVar5;
                c.a aVar18 = aVar13;
                NotFoundClasses notFoundClasses5 = notFoundClasses4;
                LockBasedStorageManager lockBasedStorageManager5 = lockBasedStorageManager4;
                m0.r.t.a.r.k.b.g gVar5 = new m0.r.t.a.r.k.b.g(lockBasedStorageManager4, vVar2, aVar15, cVar, bVar3, lazyJavaPackageFragmentProvider, aVar16, hVar4, aVar18, dVar7, emptyList2, notFoundClasses5, fVar6, aVar17, jvmBuiltInsCustomizer2, eVar6, iVar2, bVar4, (m0.r.t.a.r.c.s0.e) null, 262144);
                m0.r.t.a.r.k.b.g gVar6 = gVar4;
                m0.n.b.i.e(gVar6, "<set-?>");
                deserializedDescriptorResolver5.g = gVar6;
                m0.r.t.a.r.e.a.s.d dVar8 = dVar5;
                m0.n.b.i.d(dVar8, str);
                m0.r.t.a.r.j.s.a aVar19 = new m0.r.t.a.r.j.s.a(lazyJavaPackageFragmentProvider, dVar8);
                m0.n.b.i.e(aVar19, "<set-?>");
                eVar3.a = aVar19;
                ClassLoader classLoader = m0.i.class.getClassLoader();
                m0.n.b.i.d(classLoader, "stdlibClassLoader");
                LockBasedStorageManager lockBasedStorageManager6 = lockBasedStorageManager5;
                m0.r.t.a.r.b.k.j jVar2 = new m0.r.t.a.r.b.k.j(lockBasedStorageManager6, new m0.r.t.a.r.c.v0.a.f(classLoader), vVar3, notFoundClasses5, jvmBuiltIns2.O(), jvmBuiltIns2.O(), aVar15, iVar2, new m0.r.t.a.r.j.t.b(lockBasedStorageManager6, emptyList2));
                v vVar4 = vVar3;
                vVar4.H0(vVar3);
                m0.r.t.a.r.c.t0.j jVar3 = new m0.r.t.a.r.c.t0.j(m0.j.g.K(aVar19.a, jVar2));
                m0.n.b.i.e(jVar3, "providerForModuleContent");
                vVar4.Z1 = jVar3;
                m0.r.t.a.r.c.v0.a.i iVar3 = new m0.r.t.a.r.c.v0.a.i(gVar6, new m0.r.t.a.r.c.v0.a.a(deserializedDescriptorResolver5, fVar7), (m0.n.b.f) null);
                while (true) {
                    ConcurrentMap<p, WeakReference<m0.r.t.a.r.c.v0.a.i>> concurrentMap2 = a;
                    p pVar3 = pVar2;
                    WeakReference putIfAbsent = concurrentMap2.putIfAbsent(pVar3, new WeakReference(iVar3));
                    if (putIfAbsent == null) {
                        return iVar3;
                    }
                    m0.r.t.a.r.c.v0.a.i iVar4 = (m0.r.t.a.r.c.v0.a.i) putIfAbsent.get();
                    if (iVar4 != null) {
                        return iVar4;
                    }
                    concurrentMap2.remove(pVar3, putIfAbsent);
                    pVar2 = pVar3;
                }
            } else {
                v vVar5 = vVar;
                JvmBuiltIns jvmBuiltIns4 = jvmBuiltIns;
                lockBasedStorageManager = lockBasedStorageManager2;
                try {
                    throw new AssertionError("Built-ins module is already set: " + jvmBuiltIns4.b + " (attempting to reset to " + vVar5 + ")");
                } catch (Throwable th) {
                    th = th;
                    try {
                        ((LockBasedStorageManager.f.a) lockBasedStorageManager.d).a(th);
                        throw null;
                    } catch (Throwable th2) {
                        lockBasedStorageManager.c.a();
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            lockBasedStorageManager = lockBasedStorageManager2;
            ((LockBasedStorageManager.f.a) lockBasedStorageManager.d).a(th);
            throw null;
        }
    }
}
