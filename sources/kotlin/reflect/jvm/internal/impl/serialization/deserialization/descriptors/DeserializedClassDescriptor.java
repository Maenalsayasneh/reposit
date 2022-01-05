package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import m0.n.a.l;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.b;
import m0.r.t.a.r.f.c.a;
import m0.r.t.a.r.f.c.g;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.k.b.r;
import m0.r.t.a.r.k.b.s;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor extends b implements i {
    public final a Y1;
    public final h0 Z1;
    public final m0.r.t.a.r.g.a a2;
    public final Modality b2;
    public final p c2;
    public final ClassKind d2;
    public final m0.r.t.a.r.k.b.i e2;
    public final g f2;
    public final DeserializedClassTypeConstructor g2;
    public final ScopesHolderForClass<DeserializedClassMemberScope> h2;
    public final EnumEntryClassDescriptors i2;
    public final i j2;
    public final m0.r.t.a.r.l.i<c> k2;
    public final h<Collection<c>> l2;
    public final m0.r.t.a.r.l.i<d> m2;
    public final h<Collection<d>> n2;
    public final r.a o2;
    public final f p2;
    public final ProtoBuf$Class y;

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {
        public final e g;
        public final h<Collection<i>> h;
        public final h<Collection<v>> i;
        public final /* synthetic */ DeserializedClassDescriptor j;

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends m0.r.t.a.r.j.g {
            public final /* synthetic */ List<D> a;

            public a(List<D> list) {
                this.a = list;
            }

            public void a(CallableMemberDescriptor callableMemberDescriptor) {
                m0.n.b.i.e(callableMemberDescriptor, "fakeOverride");
                OverridingUtil.r(callableMemberDescriptor, (l<CallableMemberDescriptor, m0.i>) null);
                this.a.add(callableMemberDescriptor);
            }

            public void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                m0.n.b.i.e(callableMemberDescriptor, "fromSuper");
                m0.n.b.i.e(callableMemberDescriptor2, "fromCurrent");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8, m0.r.t.a.r.m.x0.e r9) {
            /*
                r7 = this;
                java.lang.String r0 = "this$0"
                m0.n.b.i.e(r8, r0)
                java.lang.String r0 = "kotlinTypeRefiner"
                m0.n.b.i.e(r9, r0)
                r7.j = r8
                m0.r.t.a.r.k.b.i r2 = r8.e2
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.y
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r3 = r0.i2
                java.lang.String r0 = "classProto.functionList"
                m0.n.b.i.d(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.y
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r4 = r0.j2
                java.lang.String r0 = "classProto.propertyList"
                m0.n.b.i.d(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.y
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r5 = r0.k2
                java.lang.String r0 = "classProto.typeAliasList"
                m0.n.b.i.d(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.y
                java.util.List<java.lang.Integer> r0 = r0.f2
                java.lang.String r1 = "classProto.nestedClassNameList"
                m0.n.b.i.d(r0, r1)
                m0.r.t.a.r.k.b.i r8 = r8.e2
                m0.r.t.a.r.f.c.c r8 = r8.b
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = i0.j.f.p.h.K(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x0045:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x005d
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                m0.r.t.a.r.g.d r6 = i0.j.f.p.h.v1(r8, r6)
                r1.add(r6)
                goto L_0x0045
            L_0x005d:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.g = r9
                m0.r.t.a.r.k.b.i r8 = r7.c
                m0.r.t.a.r.k.b.g r8 = r8.a
                m0.r.t.a.r.l.l r8 = r8.a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                r9.<init>(r7)
                m0.r.t.a.r.l.h r8 = r8.d(r9)
                r7.h = r8
                m0.r.t.a.r.k.b.i r8 = r7.c
                m0.r.t.a.r.k.b.g r8 = r8.a
                m0.r.t.a.r.l.l r8 = r8.a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                r9.<init>(r7)
                m0.r.t.a.r.l.h r8 = r8.d(r9)
                r7.i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor, m0.r.t.a.r.m.x0.e):void");
        }

        public Collection<g0> a(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            t(dVar, bVar);
            return super.a(dVar, bVar);
        }

        public Collection<c0> c(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            t(dVar, bVar);
            return super.c(dVar, bVar);
        }

        public m0.r.t.a.r.c.f f(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            t(dVar, bVar);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.j.i2;
            if (enumEntryClassDescriptors != null) {
                m0.n.b.i.e(dVar, "name");
                d invoke = enumEntryClassDescriptors.b.invoke(dVar);
                if (invoke != null) {
                    return invoke;
                }
            }
            return super.f(dVar, bVar);
        }

        public Collection<i> g(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
            m0.n.b.i.e(dVar, "kindFilter");
            m0.n.b.i.e(lVar, "nameFilter");
            return (Collection) this.h.invoke();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.collections.EmptyList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(java.util.Collection<m0.r.t.a.r.c.i> r5, m0.n.a.l<? super m0.r.t.a.r.g.d, java.lang.Boolean> r6) {
            /*
                r4 = this;
                java.lang.String r0 = "result"
                m0.n.b.i.e(r5, r0)
                java.lang.String r0 = "nameFilter"
                m0.n.b.i.e(r6, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r6 = r4.j
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors r6 = r6.i2
                if (r6 != 0) goto L_0x0012
                r6 = 0
                goto L_0x0041
            L_0x0012:
                java.util.Map<m0.r.t.a.r.g.d, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r0 = r6.a
                java.util.Set r0 = r0.keySet()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0021:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0040
                java.lang.Object r2 = r0.next()
                m0.r.t.a.r.g.d r2 = (m0.r.t.a.r.g.d) r2
                java.lang.String r3 = "name"
                m0.n.b.i.e(r2, r3)
                m0.r.t.a.r.l.g<m0.r.t.a.r.g.d, m0.r.t.a.r.c.d> r3 = r6.b
                java.lang.Object r2 = r3.invoke(r2)
                m0.r.t.a.r.c.d r2 = (m0.r.t.a.r.c.d) r2
                if (r2 == 0) goto L_0x0021
                r1.add(r2)
                goto L_0x0021
            L_0x0040:
                r6 = r1
            L_0x0041:
                if (r6 == 0) goto L_0x0044
                goto L_0x0046
            L_0x0044:
                kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.c
            L_0x0046:
                r5.addAll(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.h(java.util.Collection, m0.n.a.l):void");
        }

        public void j(m0.r.t.a.r.g.d dVar, List<g0> list) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(list, "functions");
            ArrayList arrayList = new ArrayList();
            for (v o : (Collection) this.i.invoke()) {
                arrayList.addAll(o.o().a(dVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(this.c.a.n.b(dVar, this.j));
            s(dVar, arrayList, list);
        }

        public void k(m0.r.t.a.r.g.d dVar, List<c0> list) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (v o : (Collection) this.i.invoke()) {
                arrayList.addAll(o.o().c(dVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            s(dVar, arrayList, list);
        }

        public m0.r.t.a.r.g.a l(m0.r.t.a.r.g.d dVar) {
            m0.n.b.i.e(dVar, "name");
            m0.r.t.a.r.g.a d = this.j.a2.d(dVar);
            m0.n.b.i.d(d, "classId.createNestedClassId(name)");
            return d;
        }

        public Set<m0.r.t.a.r.g.d> n() {
            List<v> k = this.j.g2.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (v o : k) {
                Set<m0.r.t.a.r.g.d> e = o.o().e();
                if (e == null) {
                    return null;
                }
                m0.j.g.b(linkedHashSet, e);
            }
            return linkedHashSet;
        }

        public Set<m0.r.t.a.r.g.d> o() {
            List<v> k = this.j.g2.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (v o : k) {
                m0.j.g.b(linkedHashSet, o.o().b());
            }
            linkedHashSet.addAll(this.c.a.n.e(this.j));
            return linkedHashSet;
        }

        public Set<m0.r.t.a.r.g.d> p() {
            List<v> k = this.j.g2.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (v o : k) {
                m0.j.g.b(linkedHashSet, o.o().d());
            }
            return linkedHashSet;
        }

        public boolean r(g0 g0Var) {
            m0.n.b.i.e(g0Var, "function");
            return this.c.a.o.c(this.j, g0Var);
        }

        public final <D extends CallableMemberDescriptor> void s(m0.r.t.a.r.g.d dVar, Collection<? extends D> collection, List<D> list) {
            m0.r.t.a.r.g.d dVar2 = dVar;
            Collection<? extends D> collection2 = collection;
            this.c.a.q.a().h(dVar2, collection2, new ArrayList(list), this.j, new a(list));
        }

        public void t(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
            m0.n.b.i.e(dVar, "name");
            m0.n.b.i.e(bVar, "location");
            i0.j.f.p.h.p3(this.c.a.i, bVar, this.j, dVar);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassTypeConstructor extends m0.r.t.a.r.m.b {
        public final h<List<m0>> c;
        public final /* synthetic */ DeserializedClassDescriptor d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeserializedClassTypeConstructor(DeserializedClassDescriptor deserializedClassDescriptor) {
            super(deserializedClassDescriptor.e2.a.a);
            m0.n.b.i.e(deserializedClassDescriptor, "this$0");
            this.d = deserializedClassDescriptor;
            this.c = deserializedClassDescriptor.e2.a.a.d(new DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(deserializedClassDescriptor));
        }

        public m0.r.t.a.r.c.f c() {
            return this.d;
        }

        public boolean d() {
            return true;
        }

        public Collection<v> g() {
            m0.r.t.a.r.g.b b;
            DeserializedClassDescriptor deserializedClassDescriptor = this.d;
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.y;
            m0.r.t.a.r.f.c.e eVar = deserializedClassDescriptor.e2.d;
            m0.n.b.i.e(protoBuf$Class, "<this>");
            m0.n.b.i.e(eVar, "typeTable");
            List<ProtoBuf$Type> list = protoBuf$Class.c2;
            boolean z = !list.isEmpty();
            ArrayList arrayList = list;
            if (!z) {
                arrayList = null;
            }
            ArrayList<ProtoBuf$Type> arrayList2 = arrayList;
            if (arrayList == null) {
                List<Integer> list2 = protoBuf$Class.d2;
                m0.n.b.i.d(list2, "supertypeIdList");
                ArrayList arrayList3 = new ArrayList(i0.j.f.p.h.K(list2, 10));
                for (Integer num : list2) {
                    m0.n.b.i.d(num, "it");
                    arrayList3.add(eVar.a(num.intValue()));
                }
                arrayList2 = arrayList3;
            }
            DeserializedClassDescriptor deserializedClassDescriptor2 = this.d;
            ArrayList arrayList4 = new ArrayList(i0.j.f.p.h.K(arrayList2, 10));
            for (ProtoBuf$Type f : arrayList2) {
                arrayList4.add(deserializedClassDescriptor2.e2.h.f(f));
            }
            DeserializedClassDescriptor deserializedClassDescriptor3 = this.d;
            List<T> Z = m0.j.g.Z(arrayList4, deserializedClassDescriptor3.e2.a.n.d(deserializedClassDescriptor3));
            ArrayList<NotFoundClasses.b> arrayList5 = new ArrayList<>();
            for (T I0 : Z) {
                m0.r.t.a.r.c.f c2 = I0.I0().c();
                NotFoundClasses.b bVar = c2 instanceof NotFoundClasses.b ? (NotFoundClasses.b) c2 : null;
                if (bVar != null) {
                    arrayList5.add(bVar);
                }
            }
            if (!arrayList5.isEmpty()) {
                DeserializedClassDescriptor deserializedClassDescriptor4 = this.d;
                m0.r.t.a.r.k.b.l lVar = deserializedClassDescriptor4.e2.a.h;
                ArrayList arrayList6 = new ArrayList(i0.j.f.p.h.K(arrayList5, 10));
                for (NotFoundClasses.b bVar2 : arrayList5) {
                    m0.r.t.a.r.g.a g = DescriptorUtilsKt.g(bVar2);
                    String b2 = (g == null || (b = g.b()) == null) ? null : b.b();
                    if (b2 == null) {
                        b2 = bVar2.getName().b();
                    }
                    arrayList6.add(b2);
                }
                lVar.b(deserializedClassDescriptor4, arrayList6);
            }
            return m0.j.g.v0(Z);
        }

        public List<m0> getParameters() {
            return (List) this.c.invoke();
        }

        public k0 j() {
            return k0.a.a;
        }

        public d p() {
            return this.d;
        }

        public String toString() {
            String str = this.d.getName().c;
            m0.n.b.i.d(str, "name.toString()");
            return str;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class EnumEntryClassDescriptors {
        public final Map<m0.r.t.a.r.g.d, ProtoBuf$EnumEntry> a;
        public final m0.r.t.a.r.l.g<m0.r.t.a.r.g.d, d> b;
        public final h<Set<m0.r.t.a.r.g.d>> c;
        public final /* synthetic */ DeserializedClassDescriptor d;

        public EnumEntryClassDescriptors(DeserializedClassDescriptor deserializedClassDescriptor) {
            m0.n.b.i.e(deserializedClassDescriptor, "this$0");
            this.d = deserializedClassDescriptor;
            List<ProtoBuf$EnumEntry> list = deserializedClassDescriptor.y.l2;
            m0.n.b.i.d(list, "classProto.enumEntryList");
            int R2 = i0.j.f.p.h.R2(i0.j.f.p.h.K(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(R2 < 16 ? 16 : R2);
            for (T next : list) {
                linkedHashMap.put(i0.j.f.p.h.v1(deserializedClassDescriptor.e2.b, ((ProtoBuf$EnumEntry) next).Y1), next);
            }
            this.a = linkedHashMap;
            DeserializedClassDescriptor deserializedClassDescriptor2 = this.d;
            this.b = deserializedClassDescriptor2.e2.a.a.h(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(this, deserializedClassDescriptor2));
            this.c = this.d.e2.a.a.d(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(m0.r.t.a.r.k.b.i iVar, ProtoBuf$Class protoBuf$Class, m0.r.t.a.r.f.c.c cVar, a aVar, h0 h0Var) {
        super(iVar.a.a, i0.j.f.p.h.X0(cVar, protoBuf$Class.Z1).j());
        int i;
        ClassKind classKind;
        f fVar;
        m0.n.b.i.e(iVar, "outerContext");
        m0.n.b.i.e(protoBuf$Class, "classProto");
        m0.n.b.i.e(cVar, "nameResolver");
        m0.n.b.i.e(aVar, "metadataVersion");
        m0.n.b.i.e(h0Var, "sourceElement");
        this.y = protoBuf$Class;
        this.Y1 = aVar;
        this.Z1 = h0Var;
        this.a2 = i0.j.f.p.h.X0(cVar, protoBuf$Class.Z1);
        s sVar = s.a;
        this.b2 = sVar.a(m0.r.t.a.r.f.c.b.d.d(protoBuf$Class.Y1));
        this.c2 = i0.j.f.p.h.x0(sVar, m0.r.t.a.r.f.c.b.c.d(protoBuf$Class.Y1));
        ProtoBuf$Class.Kind d = m0.r.t.a.r.f.c.b.e.d(protoBuf$Class.Y1);
        if (d == null) {
            i = -1;
        } else {
            i = s.a.b[d.ordinal()];
        }
        switch (i) {
            case 1:
                classKind = ClassKind.CLASS;
                break;
            case 2:
                classKind = ClassKind.INTERFACE;
                break;
            case 3:
                classKind = ClassKind.ENUM_CLASS;
                break;
            case 4:
                classKind = ClassKind.ENUM_ENTRY;
                break;
            case 5:
                classKind = ClassKind.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                classKind = ClassKind.OBJECT;
                break;
            default:
                classKind = ClassKind.CLASS;
                break;
        }
        this.d2 = classKind;
        List<ProtoBuf$TypeParameter> list = protoBuf$Class.b2;
        m0.n.b.i.d(list, "classProto.typeParameterList");
        ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Class.o2;
        m0.n.b.i.d(protoBuf$TypeTable, "classProto.typeTable");
        m0.r.t.a.r.f.c.e eVar = new m0.r.t.a.r.f.c.e(protoBuf$TypeTable);
        g.a aVar2 = m0.r.t.a.r.f.c.g.a;
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Class.q2;
        m0.n.b.i.d(protoBuf$VersionRequirementTable, "classProto.versionRequirementTable");
        m0.r.t.a.r.k.b.i a = iVar.a(this, list, cVar, eVar, aVar2.a(protoBuf$VersionRequirementTable), aVar);
        this.e2 = a;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        this.f2 = classKind == classKind2 ? new StaticScopeForKotlinEnum(a.a.a, this) : MemberScope.a.b;
        this.g2 = new DeserializedClassTypeConstructor(this);
        ScopesHolderForClass scopesHolderForClass = ScopesHolderForClass.a;
        m0.r.t.a.r.k.b.g gVar = a.a;
        this.h2 = ScopesHolderForClass.a(this, gVar.a, gVar.q.c(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        r.a aVar3 = null;
        this.i2 = classKind == classKind2 ? new EnumEntryClassDescriptors(this) : null;
        i iVar2 = iVar.c;
        this.j2 = iVar2;
        this.k2 = a.a.a.e(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.l2 = a.a.a.d(new DeserializedClassDescriptor$constructors$1(this));
        this.m2 = a.a.a.e(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.n2 = a.a.a.d(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        m0.r.t.a.r.f.c.c cVar2 = a.b;
        m0.r.t.a.r.f.c.e eVar2 = a.d;
        DeserializedClassDescriptor deserializedClassDescriptor = iVar2 instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) iVar2 : null;
        this.o2 = new r.a(protoBuf$Class, cVar2, eVar2, h0Var, deserializedClassDescriptor != null ? deserializedClassDescriptor.o2 : aVar3);
        if (!m0.r.t.a.r.f.c.b.b.d(protoBuf$Class.Y1).booleanValue()) {
            Objects.requireNonNull(f.i);
            fVar = f.a.b;
        } else {
            fVar = new m0.r.t.a.r.k.b.w.i(a.a.a, new DeserializedClassDescriptor$annotations$1(this));
        }
        this.p2 = fVar;
    }

    public boolean A0() {
        return false;
    }

    public MemberScope E(e eVar) {
        m0.n.b.i.e(eVar, "kotlinTypeRefiner");
        return this.h2.b(eVar);
    }

    public boolean E0() {
        return i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.g, this.y.Y1, "IS_DATA.get(classProto.flags)");
    }

    public Collection<d> G() {
        return (Collection) this.n2.invoke();
    }

    public boolean H() {
        return i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.j, this.y.Y1, "IS_INLINE_CLASS.get(classProto.flags)") && this.Y1.a(1, 4, 2);
    }

    public boolean K() {
        return i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.i, this.y.Y1, "IS_EXPECT_CLASS.get(classProto.flags)");
    }

    public boolean L() {
        return i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.f, this.y.Y1, "IS_INNER.get(classProto.flags)");
    }

    public c P() {
        return (c) this.k2.invoke();
    }

    public MemberScope Q() {
        return this.f2;
    }

    public d S() {
        return (d) this.m2.invoke();
    }

    public i b() {
        return this.j2;
    }

    public ClassKind f() {
        return this.d2;
    }

    public f getAnnotations() {
        return this.p2;
    }

    public p getVisibility() {
        return this.c2;
    }

    public j0 i() {
        return this.g2;
    }

    public boolean isExternal() {
        return i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.h, this.y.Y1, "IS_EXTERNAL_CLASS.get(classProto.flags)");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r4 = r0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isInline() {
        /*
            r5 = this;
            m0.r.t.a.r.f.c.b$b r0 = m0.r.t.a.r.f.c.b.j
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r5.y
            int r1 = r1.Y1
            java.lang.String r2 = "IS_INLINE_CLASS.get(classProto.flags)"
            boolean r0 = i0.d.a.a.a.E(r0, r1, r2)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002d
            m0.r.t.a.r.f.c.a r0 = r5.Y1
            r3 = 4
            int r4 = r0.b
            if (r4 >= r2) goto L_0x0018
            goto L_0x0027
        L_0x0018:
            if (r4 <= r2) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            int r4 = r0.c
            if (r4 >= r3) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            if (r4 <= r3) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            int r0 = r0.d
            if (r0 > r2) goto L_0x0029
        L_0x0027:
            r0 = r2
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            r1 = r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.isInline():boolean");
    }

    public Modality j() {
        return this.b2;
    }

    public Collection<c> k() {
        return (Collection) this.l2.invoke();
    }

    public h0 r() {
        return this.Z1;
    }

    public List<m0> t() {
        return this.e2.h.c();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("deserialized ");
        P0.append(K() ? "expect " : "");
        P0.append("class ");
        P0.append(getName());
        return P0.toString();
    }

    public boolean w() {
        return m0.r.t.a.r.f.c.b.e.d(this.y.Y1) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    public boolean z() {
        return i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.k, this.y.Y1, "IS_FUN_INTERFACE.get(classProto.flags)");
    }
}
