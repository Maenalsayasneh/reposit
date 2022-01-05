package m0.r.t.a.r.k.b.w;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedPackageMemberScope.kt */
public class e extends DeserializedMemberScope {
    public final v g;
    public final b h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(m0.r.t.a.r.c.v r16, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r17, m0.r.t.a.r.f.c.c r18, m0.r.t.a.r.f.c.a r19, m0.r.t.a.r.k.b.w.d r20, m0.r.t.a.r.k.b.g r21, m0.n.a.a<? extends java.util.Collection<m0.r.t.a.r.g.d>> r22) {
        /*
            r15 = this;
            r6 = r15
            r14 = r16
            r0 = r17
            java.lang.String r1 = "packageDescriptor"
            m0.n.b.i.e(r14, r1)
            java.lang.String r1 = "proto"
            m0.n.b.i.e(r0, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r18
            m0.n.b.i.e(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r19
            m0.n.b.i.e(r3, r1)
            java.lang.String r1 = "components"
            r4 = r21
            m0.n.b.i.e(r4, r1)
            java.lang.String r1 = "classNames"
            r5 = r22
            m0.n.b.i.e(r5, r1)
            m0.r.t.a.r.f.c.e r10 = new m0.r.t.a.r.f.c.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r1 = r0.b2
            java.lang.String r7 = "proto.typeTable"
            m0.n.b.i.d(r1, r7)
            r10.<init>(r1)
            m0.r.t.a.r.f.c.g$a r1 = m0.r.t.a.r.f.c.g.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r0.c2
            java.lang.String r8 = "proto.versionRequirementTable"
            m0.n.b.i.d(r7, r8)
            m0.r.t.a.r.f.c.g r11 = r1.a(r7)
            r7 = r21
            r8 = r16
            r9 = r18
            r12 = r19
            r13 = r20
            m0.r.t.a.r.k.b.i r1 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r0.Y1
            java.lang.String r3 = "proto.functionList"
            m0.n.b.i.d(r2, r3)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r3 = r0.Z1
            java.lang.String r4 = "proto.propertyList"
            m0.n.b.i.d(r3, r4)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r4 = r0.a2
            java.lang.String r0 = "proto.typeAliasList"
            m0.n.b.i.d(r4, r0)
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.g = r14
            m0.r.t.a.r.g.b r0 = r16.d()
            r6.h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.k.b.w.e.<init>(m0.r.t.a.r.c.v, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, m0.r.t.a.r.f.c.c, m0.r.t.a.r.f.c.a, m0.r.t.a.r.k.b.w.d, m0.r.t.a.r.k.b.g, m0.n.a.a):void");
    }

    public f f(d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        i.e(dVar, "name");
        i.e(bVar, "location");
        h.q3(this.c.a.i, bVar, this.g, dVar);
        return super.f(dVar, bVar);
    }

    public Collection g(m0.r.t.a.r.j.u.d dVar, l lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        Collection<m0.r.t.a.r.c.i> i = i(dVar, lVar, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<m0.r.t.a.r.c.s0.b> iterable = this.c.a.k;
        ArrayList arrayList = new ArrayList();
        for (m0.r.t.a.r.c.s0.b a : iterable) {
            g.b(arrayList, a.a(this.h));
        }
        return g.Z(i, arrayList);
    }

    public void h(Collection<m0.r.t.a.r.c.i> collection, l<? super d, Boolean> lVar) {
        i.e(collection, "result");
        i.e(lVar, "nameFilter");
    }

    public a l(d dVar) {
        i.e(dVar, "name");
        return new a(this.h, dVar);
    }

    public Set<d> n() {
        return EmptySet.c;
    }

    public Set<d> o() {
        return EmptySet.c;
    }

    public Set<d> p() {
        return EmptySet.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q(m0.r.t.a.r.g.d r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            m0.n.b.i.e(r6, r0)
            m0.n.b.i.e(r6, r0)
            java.util.Set r0 = r5.m()
            boolean r0 = r0.contains(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0047
            m0.r.t.a.r.k.b.i r0 = r5.c
            m0.r.t.a.r.k.b.g r0 = r0.a
            java.lang.Iterable<m0.r.t.a.r.c.s0.b> r0 = r0.k
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0028
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
            goto L_0x0042
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r0.next()
            m0.r.t.a.r.c.s0.b r3 = (m0.r.t.a.r.c.s0.b) r3
            m0.r.t.a.r.g.b r4 = r5.h
            boolean r3 = r3.b(r4, r6)
            if (r3 == 0) goto L_0x002c
            r6 = r1
            goto L_0x0043
        L_0x0042:
            r6 = r2
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.k.b.w.e.q(m0.r.t.a.r.g.d):boolean");
    }
}
