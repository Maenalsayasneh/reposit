package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.d.a.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.j.u.d;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.k.b.i;
import m0.r.t.a.r.l.f;
import m0.r.t.a.r.l.h;

/* compiled from: DeserializedMemberScope.kt */
public abstract class DeserializedMemberScope extends g {
    public static final /* synthetic */ k<Object>[] b;
    public final i c;
    public final a d;
    public final h e;
    public final m0.r.t.a.r.l.i f;

    /* compiled from: DeserializedMemberScope.kt */
    public final class NoReorderImplementation implements a {
        public static final /* synthetic */ k<Object>[] a;
        public final List<ProtoBuf$Function> b;
        public final List<ProtoBuf$Property> c;
        public final List<ProtoBuf$TypeAlias> d;
        public final h e;
        public final h f;
        public final h g;
        public final h h;
        public final h i;
        public final h j;
        public final h k;
        public final h l;
        public final h m;
        public final h n;
        public final /* synthetic */ DeserializedMemberScope o;

        static {
            Class<NoReorderImplementation> cls = NoReorderImplementation.class;
            a = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "allFunctions", "getAllFunctions()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "allProperties", "getAllProperties()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), m.c(new PropertyReference1Impl(m.a(cls), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), m.c(new PropertyReference1Impl(m.a(cls), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), m.c(new PropertyReference1Impl(m.a(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), m.c(new PropertyReference1Impl(m.a(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public NoReorderImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            m0.n.b.i.e(deserializedMemberScope, "this$0");
            m0.n.b.i.e(list, "functionList");
            m0.n.b.i.e(list2, "propertyList");
            m0.n.b.i.e(list3, "typeAliasList");
            this.o = deserializedMemberScope;
            this.b = list;
            this.c = list2;
            this.d = !deserializedMemberScope.c.a.c.f() ? EmptyList.c : list3;
            this.e = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$declaredFunctions$2(this));
            this.f = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$declaredProperties$2(this));
            this.g = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$allTypeAliases$2(this));
            this.h = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$allFunctions$2(this));
            this.i = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$allProperties$2(this));
            this.j = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2(this));
            this.k = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$functionsByName$2(this));
            this.l = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$propertiesByName$2(this));
            this.m = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$functionNames$2(this, deserializedMemberScope));
            this.n = deserializedMemberScope.c.a.a.d(new DeserializedMemberScope$NoReorderImplementation$variableNames$2(this, deserializedMemberScope));
        }

        public Collection<g0> a(d dVar, b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            h hVar = this.m;
            k<Object>[] kVarArr = a;
            if (!((Set) i0.j.f.p.h.K1(hVar, kVarArr[8])).contains(dVar)) {
                return EmptyList.c;
            }
            Collection<g0> collection = (Collection) ((Map) i0.j.f.p.h.K1(this.k, kVarArr[6])).get(dVar);
            return collection != null ? collection : EmptyList.c;
        }

        public Set<d> b() {
            return (Set) i0.j.f.p.h.K1(this.m, a[8]);
        }

        public Collection<c0> c(d dVar, b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            h hVar = this.n;
            k<Object>[] kVarArr = a;
            if (!((Set) i0.j.f.p.h.K1(hVar, kVarArr[9])).contains(dVar)) {
                return EmptyList.c;
            }
            Collection<c0> collection = (Collection) ((Map) i0.j.f.p.h.K1(this.l, kVarArr[7])).get(dVar);
            return collection != null ? collection : EmptyList.c;
        }

        public Set<d> d() {
            return (Set) i0.j.f.p.h.K1(this.n, a[9]);
        }

        public Set<d> e() {
            List<ProtoBuf$TypeAlias> list = this.d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.o;
            for (l lVar : list) {
                linkedHashSet.add(i0.j.f.p.h.v1(deserializedMemberScope.c.b, ((ProtoBuf$TypeAlias) lVar).Z1));
            }
            return linkedHashSet;
        }

        public void f(Collection<m0.r.t.a.r.c.i> collection, m0.r.t.a.r.j.u.d dVar, m0.n.a.l<? super d, Boolean> lVar, b bVar) {
            m0.n.b.i.e(collection, "result");
            m0.n.b.i.e(dVar, "kindFilter");
            m0.n.b.i.e(lVar, "nameFilter");
            m0.n.b.i.e(bVar, "location");
            d.a aVar = m0.r.t.a.r.j.u.d.a;
            if (dVar.a(m0.r.t.a.r.j.u.d.h)) {
                for (Object next : (List) i0.j.f.p.h.K1(this.i, a[4])) {
                    m0.r.t.a.r.g.d name = ((c0) next).getName();
                    m0.n.b.i.d(name, "it.name");
                    if (lVar.invoke(name).booleanValue()) {
                        collection.add(next);
                    }
                }
            }
            d.a aVar2 = m0.r.t.a.r.j.u.d.a;
            if (dVar.a(m0.r.t.a.r.j.u.d.g)) {
                for (Object next2 : (List) i0.j.f.p.h.K1(this.h, a[3])) {
                    m0.r.t.a.r.g.d name2 = ((g0) next2).getName();
                    m0.n.b.i.d(name2, "it.name");
                    if (lVar.invoke(name2).booleanValue()) {
                        collection.add(next2);
                    }
                }
            }
        }

        public l0 g(m0.r.t.a.r.g.d dVar) {
            m0.n.b.i.e(dVar, "name");
            return (l0) ((Map) i0.j.f.p.h.K1(this.j, a[5])).get(dVar);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    public final class OptimizedImplementation implements a {
        public static final /* synthetic */ k<Object>[] a;
        public final Map<m0.r.t.a.r.g.d, byte[]> b;
        public final Map<m0.r.t.a.r.g.d, byte[]> c;
        public final Map<m0.r.t.a.r.g.d, byte[]> d;
        public final f<m0.r.t.a.r.g.d, Collection<g0>> e;
        public final f<m0.r.t.a.r.g.d, Collection<c0>> f;
        public final m0.r.t.a.r.l.g<m0.r.t.a.r.g.d, l0> g;
        public final h h;
        public final h i;
        public final /* synthetic */ DeserializedMemberScope j;

        static {
            Class<OptimizedImplementation> cls = OptimizedImplementation.class;
            a = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), m.c(new PropertyReference1Impl(m.a(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            Map<m0.r.t.a.r.g.d, byte[]> map;
            m0.n.b.i.e(deserializedMemberScope, "this$0");
            m0.n.b.i.e(list, "functionList");
            m0.n.b.i.e(list2, "propertyList");
            m0.n.b.i.e(list3, "typeAliasList");
            this.j = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : list) {
                m0.r.t.a.r.g.d v1 = i0.j.f.p.h.v1(deserializedMemberScope.c.b, ((ProtoBuf$Function) ((l) next)).a2);
                Object obj = linkedHashMap.get(v1);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(v1, obj);
                }
                ((List) obj).add(next);
            }
            this.b = h(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.j;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T next2 : list2) {
                m0.r.t.a.r.g.d v12 = i0.j.f.p.h.v1(deserializedMemberScope2.c.b, ((ProtoBuf$Property) ((l) next2)).a2);
                Object obj2 = linkedHashMap2.get(v12);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(v12, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.c = h(linkedHashMap2);
            if (this.j.c.a.c.f()) {
                DeserializedMemberScope deserializedMemberScope3 = this.j;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (T next3 : list3) {
                    m0.r.t.a.r.g.d v13 = i0.j.f.p.h.v1(deserializedMemberScope3.c.b, ((ProtoBuf$TypeAlias) ((l) next3)).Z1);
                    Object obj3 = linkedHashMap3.get(v13);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap3.put(v13, obj3);
                    }
                    ((List) obj3).add(next3);
                }
                map = h(linkedHashMap3);
            } else {
                map = m0.j.g.o();
            }
            this.d = map;
            this.e = this.j.c.a.a.g(new DeserializedMemberScope$OptimizedImplementation$functions$1(this));
            this.f = this.j.c.a.a.g(new DeserializedMemberScope$OptimizedImplementation$properties$1(this));
            this.g = this.j.c.a.a.h(new DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1(this));
            DeserializedMemberScope deserializedMemberScope4 = this.j;
            this.h = deserializedMemberScope4.c.a.a.d(new DeserializedMemberScope$OptimizedImplementation$functionNames$2(this, deserializedMemberScope4));
            DeserializedMemberScope deserializedMemberScope5 = this.j;
            this.i = deserializedMemberScope5.c.a.a.d(new DeserializedMemberScope$OptimizedImplementation$variableNames$2(this, deserializedMemberScope5));
        }

        public Collection<g0> a(m0.r.t.a.r.g.d dVar, b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            if (!b().contains(dVar)) {
                return EmptyList.c;
            }
            return (Collection) ((LockBasedStorageManager.m) this.e).invoke(dVar);
        }

        public Set<m0.r.t.a.r.g.d> b() {
            return (Set) i0.j.f.p.h.K1(this.h, a[0]);
        }

        public Collection<c0> c(m0.r.t.a.r.g.d dVar, b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            if (!d().contains(dVar)) {
                return EmptyList.c;
            }
            return (Collection) ((LockBasedStorageManager.m) this.f).invoke(dVar);
        }

        public Set<m0.r.t.a.r.g.d> d() {
            return (Set) i0.j.f.p.h.K1(this.i, a[1]);
        }

        public Set<m0.r.t.a.r.g.d> e() {
            return this.d.keySet();
        }

        public void f(Collection<m0.r.t.a.r.c.i> collection, m0.r.t.a.r.j.u.d dVar, m0.n.a.l<? super m0.r.t.a.r.g.d, Boolean> lVar, b bVar) {
            m0.n.b.i.e(collection, "result");
            m0.n.b.i.e(dVar, "kindFilter");
            m0.n.b.i.e(lVar, "nameFilter");
            m0.n.b.i.e(bVar, "location");
            d.a aVar = m0.r.t.a.r.j.u.d.a;
            if (dVar.a(m0.r.t.a.r.j.u.d.h)) {
                Set<m0.r.t.a.r.g.d> d2 = d();
                ArrayList arrayList = new ArrayList();
                for (m0.r.t.a.r.g.d next : d2) {
                    if (lVar.invoke(next).booleanValue()) {
                        arrayList.addAll(c(next, bVar));
                    }
                }
                m0.r.t.a.r.j.f fVar = m0.r.t.a.r.j.f.c;
                m0.n.b.i.d(fVar, "INSTANCE");
                i0.j.f.p.h.U3(arrayList, fVar);
                collection.addAll(arrayList);
            }
            d.a aVar2 = m0.r.t.a.r.j.u.d.a;
            if (dVar.a(m0.r.t.a.r.j.u.d.g)) {
                Set<m0.r.t.a.r.g.d> b2 = b();
                ArrayList arrayList2 = new ArrayList();
                for (m0.r.t.a.r.g.d next2 : b2) {
                    if (lVar.invoke(next2).booleanValue()) {
                        arrayList2.addAll(a(next2, bVar));
                    }
                }
                m0.r.t.a.r.j.f fVar2 = m0.r.t.a.r.j.f.c;
                m0.n.b.i.d(fVar2, "INSTANCE");
                i0.j.f.p.h.U3(arrayList2, fVar2);
                collection.addAll(arrayList2);
            }
        }

        public l0 g(m0.r.t.a.r.g.d dVar) {
            m0.n.b.i.e(dVar, "name");
            return this.g.invoke(dVar);
        }

        public final Map<m0.r.t.a.r.g.d, byte[]> h(Map<m0.r.t.a.r.g.d, ? extends Collection<? extends m0.r.t.a.r.h.a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(i0.j.f.p.h.R2(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<m0.r.t.a.r.h.a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(iterable, 10));
                for (m0.r.t.a.r.h.a aVar : iterable) {
                    int e2 = aVar.e();
                    int g2 = CodedOutputStream.g(e2) + e2;
                    if (g2 > 4096) {
                        g2 = 4096;
                    }
                    CodedOutputStream k = CodedOutputStream.k(byteArrayOutputStream, g2);
                    k.y(e2);
                    aVar.d(k);
                    k.j();
                    arrayList.add(m0.i.a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    public interface a {
        Collection<g0> a(m0.r.t.a.r.g.d dVar, b bVar);

        Set<m0.r.t.a.r.g.d> b();

        Collection<c0> c(m0.r.t.a.r.g.d dVar, b bVar);

        Set<m0.r.t.a.r.g.d> d();

        Set<m0.r.t.a.r.g.d> e();

        void f(Collection<m0.r.t.a.r.c.i> collection, m0.r.t.a.r.j.u.d dVar, m0.n.a.l<? super m0.r.t.a.r.g.d, Boolean> lVar, b bVar);

        l0 g(m0.r.t.a.r.g.d dVar);
    }

    static {
        Class<DeserializedMemberScope> cls = DeserializedMemberScope.class;
        b = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), m.c(new PropertyReference1Impl(m.a(cls), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public DeserializedMemberScope(i iVar, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3, m0.n.a.a<? extends Collection<m0.r.t.a.r.g.d>> aVar) {
        a aVar2;
        m0.n.b.i.e(iVar, "c");
        m0.n.b.i.e(list, "functionList");
        m0.n.b.i.e(list2, "propertyList");
        m0.n.b.i.e(list3, "typeAliasList");
        m0.n.b.i.e(aVar, "classNames");
        this.c = iVar;
        if (iVar.a.c.a()) {
            aVar2 = new NoReorderImplementation(this, list, list2, list3);
        } else {
            aVar2 = new OptimizedImplementation(this, list, list2, list3);
        }
        this.d = aVar2;
        this.e = iVar.a.a.d(new DeserializedMemberScope$classNames$2(aVar));
        this.f = iVar.a.a.e(new DeserializedMemberScope$classifierNamesLazy$2(this));
    }

    public Collection<g0> a(m0.r.t.a.r.g.d dVar, b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        return this.d.a(dVar, bVar);
    }

    public Set<m0.r.t.a.r.g.d> b() {
        return this.d.b();
    }

    public Collection<c0> c(m0.r.t.a.r.g.d dVar, b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        return this.d.c(dVar, bVar);
    }

    public Set<m0.r.t.a.r.g.d> d() {
        return this.d.d();
    }

    public Set<m0.r.t.a.r.g.d> e() {
        m0.r.t.a.r.l.i iVar = this.f;
        k<Object> kVar = b[1];
        m0.n.b.i.e(iVar, "<this>");
        m0.n.b.i.e(kVar, "p");
        return (Set) iVar.invoke();
    }

    public m0.r.t.a.r.c.f f(m0.r.t.a.r.g.d dVar, b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        if (q(dVar)) {
            return this.c.a.b(l(dVar));
        }
        if (this.d.e().contains(dVar)) {
            return this.d.g(dVar);
        }
        return null;
    }

    public abstract void h(Collection<m0.r.t.a.r.c.i> collection, m0.n.a.l<? super m0.r.t.a.r.g.d, Boolean> lVar);

    public final Collection<m0.r.t.a.r.c.i> i(m0.r.t.a.r.j.u.d dVar, m0.n.a.l<? super m0.r.t.a.r.g.d, Boolean> lVar, b bVar) {
        m0.n.b.i.e(dVar, "kindFilter");
        m0.n.b.i.e(lVar, "nameFilter");
        m0.n.b.i.e(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = m0.r.t.a.r.j.u.d.a;
        if (dVar.a(m0.r.t.a.r.j.u.d.d)) {
            h(arrayList, lVar);
        }
        this.d.f(arrayList, dVar, lVar, bVar);
        if (dVar.a(m0.r.t.a.r.j.u.d.j)) {
            for (m0.r.t.a.r.g.d next : m()) {
                if (lVar.invoke(next).booleanValue()) {
                    m0.r.t.a.r.m.a1.a.N(arrayList, this.c.a.b(l(next)));
                }
            }
        }
        d.a aVar2 = m0.r.t.a.r.j.u.d.a;
        if (dVar.a(m0.r.t.a.r.j.u.d.e)) {
            for (m0.r.t.a.r.g.d next2 : this.d.e()) {
                if (lVar.invoke(next2).booleanValue()) {
                    m0.r.t.a.r.m.a1.a.N(arrayList, this.d.g(next2));
                }
            }
        }
        return m0.r.t.a.r.m.a1.a.G0(arrayList);
    }

    public void j(m0.r.t.a.r.g.d dVar, List<g0> list) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(list, "functions");
    }

    public void k(m0.r.t.a.r.g.d dVar, List<c0> list) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(list, "descriptors");
    }

    public abstract m0.r.t.a.r.g.a l(m0.r.t.a.r.g.d dVar);

    public final Set<m0.r.t.a.r.g.d> m() {
        return (Set) i0.j.f.p.h.K1(this.e, b[0]);
    }

    public abstract Set<m0.r.t.a.r.g.d> n();

    public abstract Set<m0.r.t.a.r.g.d> o();

    public abstract Set<m0.r.t.a.r.g.d> p();

    public boolean q(m0.r.t.a.r.g.d dVar) {
        m0.n.b.i.e(dVar, "name");
        return m().contains(dVar);
    }

    public boolean r(g0 g0Var) {
        m0.n.b.i.e(g0Var, "function");
        return true;
    }
}
