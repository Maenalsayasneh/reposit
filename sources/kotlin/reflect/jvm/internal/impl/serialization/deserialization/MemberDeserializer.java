package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.a0;
import m0.r.t.a.r.c.t0.b0;
import m0.r.t.a.r.c.t0.o;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.f.c.b;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.f.c.f;
import m0.r.t.a.r.f.c.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.k.b.c;
import m0.r.t.a.r.k.b.g;
import m0.r.t.a.r.k.b.i;
import m0.r.t.a.r.k.b.r;
import m0.r.t.a.r.k.b.s;
import m0.r.t.a.r.k.b.u;
import m0.r.t.a.r.m.a1.a;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer {
    public final i a;
    public final c b;

    public MemberDeserializer(i iVar) {
        m0.n.b.i.e(iVar, "c");
        this.a = iVar;
        g gVar = iVar.a;
        this.b = new c(gVar.b, gVar.l);
    }

    public final r a(m0.r.t.a.r.c.i iVar) {
        if (iVar instanceof v) {
            b d = ((v) iVar).d();
            i iVar2 = this.a;
            return new r.b(d, iVar2.b, iVar2.d, iVar2.g);
        } else if (iVar instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) iVar).o2;
        } else {
            return null;
        }
    }

    public final DeserializedMemberDescriptor.CoroutinesCompatibilityMode b(DeserializedMemberDescriptor deserializedMemberDescriptor, TypeDeserializer typeDeserializer) {
        if (!m(deserializedMemberDescriptor)) {
            return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
        }
        for (m0 upperBounds : typeDeserializer.c()) {
            upperBounds.getUpperBounds();
        }
        if (typeDeserializer.e) {
            return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
        }
        return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode c(m0.r.t.a.r.k.b.w.b r4, m0.r.t.a.r.c.f0 r5, java.util.Collection<? extends m0.r.t.a.r.c.o0> r6, java.util.Collection<? extends m0.r.t.a.r.c.m0> r7, m0.r.t.a.r.m.v r8, boolean r9) {
        /*
            r3 = this;
            boolean r0 = r3.m(r4)
            if (r0 != 0) goto L_0x0009
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
            return r4
        L_0x0009:
            m0.r.t.a.r.g.b r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.d(r4)
            m0.r.t.a.r.g.b r0 = m0.r.t.a.r.k.b.u.a
            boolean r4 = m0.n.b.i.a(r4, r0)
            if (r4 == 0) goto L_0x0018
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
            return r4
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r1 = i0.j.f.p.h.K(r6, r0)
            r4.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0027:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r6.next()
            m0.r.t.a.r.c.o0 r1 = (m0.r.t.a.r.c.o0) r1
            m0.r.t.a.r.m.v r1 = r1.getType()
            r4.add(r1)
            goto L_0x0027
        L_0x003b:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            r5 = r6
            goto L_0x0044
        L_0x0040:
            m0.r.t.a.r.m.v r5 = r5.getType()
        L_0x0044:
            java.util.List r5 = m0.j.g.L(r5)
            java.util.List r4 = m0.j.g.Z(r4, r5)
            if (r8 != 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            boolean r5 = r3.d(r8)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
        L_0x0057:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = m0.n.b.i.a(r6, r5)
            if (r5 == 0) goto L_0x0062
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            return r4
        L_0x0062:
            boolean r5 = r7 instanceof java.util.Collection
            r6 = 1
            r8 = 0
            if (r5 == 0) goto L_0x006f
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x006f
            goto L_0x00b1
        L_0x006f:
            java.util.Iterator r5 = r7.iterator()
        L_0x0073:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b1
            java.lang.Object r7 = r5.next()
            m0.r.t.a.r.c.m0 r7 = (m0.r.t.a.r.c.m0) r7
            java.util.List r7 = r7.getUpperBounds()
            java.lang.String r1 = "typeParameter.upperBounds"
            m0.n.b.i.d(r7, r1)
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x008f
            goto L_0x00ac
        L_0x008f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0093:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r7.next()
            m0.r.t.a.r.m.v r1 = (m0.r.t.a.r.m.v) r1
            java.lang.String r2 = "it"
            m0.n.b.i.d(r1, r2)
            boolean r1 = r3.d(r1)
            if (r1 == 0) goto L_0x0093
            r7 = r6
            goto L_0x00ad
        L_0x00ac:
            r7 = r8
        L_0x00ad:
            if (r7 == 0) goto L_0x0073
            r5 = r6
            goto L_0x00b2
        L_0x00b1:
            r5 = r8
        L_0x00b2:
            if (r5 == 0) goto L_0x00b7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            return r4
        L_0x00b7:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = i0.j.f.p.h.K(r4, r0)
            r5.<init>(r7)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00c6:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0130
            java.lang.Object r7 = r4.next()
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            java.lang.String r0 = "type"
            m0.n.b.i.d(r7, r0)
            boolean r0 = m0.r.t.a.r.b.e.h(r7)
            if (r0 == 0) goto L_0x0121
            java.util.List r0 = r7.H0()
            int r0 = r0.size()
            r1 = 3
            if (r0 > r1) goto L_0x0121
            java.util.List r7 = r7.H0()
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00f7
            goto L_0x0118
        L_0x00f7:
            java.util.Iterator r7 = r7.iterator()
        L_0x00fb:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r7.next()
            m0.r.t.a.r.m.m0 r0 = (m0.r.t.a.r.m.m0) r0
            m0.r.t.a.r.m.v r0 = r0.getType()
            java.lang.String r1 = "it.type"
            m0.n.b.i.d(r0, r1)
            boolean r0 = r3.d(r0)
            if (r0 == 0) goto L_0x00fb
            r7 = r6
            goto L_0x0119
        L_0x0118:
            r7 = r8
        L_0x0119:
            if (r7 == 0) goto L_0x011e
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            goto L_0x012c
        L_0x011e:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER
            goto L_0x012c
        L_0x0121:
            boolean r7 = r3.d(r7)
            if (r7 == 0) goto L_0x012a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            goto L_0x012c
        L_0x012a:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
        L_0x012c:
            r5.add(r7)
            goto L_0x00c6
        L_0x0130:
            java.lang.Comparable r4 = m0.j.g.O(r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode) r4
            if (r4 != 0) goto L_0x013a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
        L_0x013a:
            if (r9 == 0) goto L_0x013f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER
            goto L_0x0141
        L_0x013f:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
        L_0x0141:
            java.lang.String r6 = "a"
            m0.n.b.i.e(r5, r6)
            java.lang.String r6 = "b"
            m0.n.b.i.e(r4, r6)
            int r6 = r5.compareTo(r4)
            if (r6 < 0) goto L_0x0152
            r4 = r5
        L_0x0152:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.c(m0.r.t.a.r.k.b.w.b, m0.r.t.a.r.c.f0, java.util.Collection, java.util.Collection, m0.r.t.a.r.m.v, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode");
    }

    public final boolean d(m0.r.t.a.r.m.v vVar) {
        return a.K0(vVar, MemberDeserializer$containsSuspendFunctionType$1.c);
    }

    public final f e(l lVar, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (m0.r.t.a.r.f.c.b.b.d(i).booleanValue()) {
            return new m0.r.t.a.r.k.b.w.i(this.a.a.a, new MemberDeserializer$getAnnotations$1(this, lVar, annotatedCallableKind));
        }
        Objects.requireNonNull(f.i);
        return f.a.b;
    }

    public final f0 f() {
        m0.r.t.a.r.c.i iVar = this.a.c;
        d dVar = iVar instanceof d ? (d) iVar : null;
        if (dVar == null) {
            return null;
        }
        return dVar.G0();
    }

    public final f g(ProtoBuf$Property protoBuf$Property, boolean z) {
        if (m0.r.t.a.r.f.c.b.b.d(protoBuf$Property.Y1).booleanValue()) {
            return new m0.r.t.a.r.k.b.w.i(this.a.a.a, new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, protoBuf$Property));
        }
        Objects.requireNonNull(f.i);
        return f.a.b;
    }

    public final m0.r.t.a.r.c.c h(ProtoBuf$Constructor protoBuf$Constructor, boolean z) {
        i iVar;
        m0.r.t.a.r.k.b.w.c cVar;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        TypeDeserializer typeDeserializer;
        ProtoBuf$Constructor protoBuf$Constructor2 = protoBuf$Constructor;
        m0.n.b.i.e(protoBuf$Constructor2, "proto");
        d dVar = (d) this.a.c;
        int i = protoBuf$Constructor2.Y1;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        f e = e(protoBuf$Constructor2, i, annotatedCallableKind);
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        i iVar2 = this.a;
        m0.r.t.a.r.k.b.w.c cVar2 = new m0.r.t.a.r.k.b.w.c(dVar, (h) null, e, z, kind, protoBuf$Constructor, iVar2.b, iVar2.d, iVar2.e, iVar2.g, (h0) null);
        MemberDeserializer memberDeserializer = i.b(this.a, cVar2, EmptyList.c, (m0.r.t.a.r.f.c.c) null, (e) null, (m0.r.t.a.r.f.c.g) null, (m0.r.t.a.r.f.c.a) null, 60).i;
        List<ProtoBuf$ValueParameter> list = protoBuf$Constructor2.Z1;
        m0.n.b.i.d(list, "proto.valueParameterList");
        cVar2.S0(memberDeserializer.l(list, protoBuf$Constructor2, annotatedCallableKind), i0.j.f.p.h.x0(s.a, m0.r.t.a.r.f.c.b.c.d(protoBuf$Constructor2.Y1)));
        cVar2.P0(dVar.q());
        boolean z2 = true;
        cVar2.o2 = !m0.r.t.a.r.f.c.b.m.d(protoBuf$Constructor2.Y1).booleanValue();
        m0.r.t.a.r.c.i iVar3 = this.a.c;
        Boolean bool = null;
        DeserializedClassDescriptor deserializedClassDescriptor = iVar3 instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) iVar3 : null;
        if (deserializedClassDescriptor == null) {
            iVar = null;
        } else {
            iVar = deserializedClassDescriptor.e2;
        }
        if (!(iVar == null || (typeDeserializer = iVar.h) == null)) {
            bool = Boolean.valueOf(typeDeserializer.e);
        }
        if (!m0.n.b.i.a(bool, Boolean.TRUE) || !m(cVar2)) {
            z2 = false;
        }
        if (z2) {
            coroutinesCompatibilityMode = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
            cVar = cVar2;
        } else {
            List<o0> h = cVar2.h();
            m0.n.b.i.d(h, "descriptor.valueParameters");
            List<m0> typeParameters = cVar2.getTypeParameters();
            m0.n.b.i.d(typeParameters, "descriptor.typeParameters");
            cVar = cVar2;
            coroutinesCompatibilityMode = c(cVar2, (f0) null, h, typeParameters, cVar2.Z1, false);
        }
        m0.n.b.i.e(coroutinesCompatibilityMode, "<set-?>");
        cVar.D2 = coroutinesCompatibilityMode;
        return cVar;
    }

    public final g0 i(ProtoBuf$Function protoBuf$Function) {
        int i;
        f fVar;
        m0.r.t.a.r.f.c.g gVar;
        f0 f0Var;
        m0.r.t.a.r.m.v f;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        m0.n.b.i.e(protoBuf$Function2, "proto");
        boolean z = true;
        if ((protoBuf$Function2.y & 1) != 1) {
            z = false;
        }
        if (z) {
            i = protoBuf$Function2.Y1;
        } else {
            int i2 = protoBuf$Function2.Z1;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        f e = e(protoBuf$Function2, i3, annotatedCallableKind);
        if (i0.j.f.p.h.R1(protoBuf$Function)) {
            fVar = new m0.r.t.a.r.k.b.w.a(this.a.a.a, new MemberDeserializer$getReceiverParameterAnnotations$1(this, protoBuf$Function2, annotatedCallableKind));
        } else {
            Objects.requireNonNull(f.i);
            fVar = f.a.b;
        }
        if (m0.n.b.i.a(DescriptorUtilsKt.h(this.a.c).c(i0.j.f.p.h.v1(this.a.b, protoBuf$Function2.a2)), u.a)) {
            g.a aVar = m0.r.t.a.r.f.c.g.a;
            gVar = m0.r.t.a.r.f.c.g.b;
        } else {
            gVar = this.a.e;
        }
        m0.r.t.a.r.f.c.g gVar2 = gVar;
        i iVar = this.a;
        m0.r.t.a.r.c.i iVar2 = iVar.c;
        m0.r.t.a.r.g.d v1 = i0.j.f.p.h.v1(iVar.b, protoBuf$Function2.a2);
        s sVar = s.a;
        CallableMemberDescriptor.Kind U2 = i0.j.f.p.h.U2(sVar, m0.r.t.a.r.f.c.b.n.d(i3));
        i iVar3 = this.a;
        m0.r.t.a.r.k.b.w.g gVar3 = new m0.r.t.a.r.k.b.w.g(iVar2, (g0) null, e, v1, U2, protoBuf$Function, iVar3.b, iVar3.d, gVar2, iVar3.g, (h0) null);
        i iVar4 = this.a;
        List<ProtoBuf$TypeParameter> list = protoBuf$Function2.d2;
        m0.n.b.i.d(list, "proto.typeParameterList");
        i b2 = i.b(iVar4, gVar3, list, (m0.r.t.a.r.f.c.c) null, (e) null, (m0.r.t.a.r.f.c.g) null, (m0.r.t.a.r.f.c.a) null, 60);
        ProtoBuf$Type o3 = i0.j.f.p.h.o3(protoBuf$Function2, this.a.d);
        if (o3 == null || (f = b2.h.f(o3)) == null) {
            f0Var = null;
        } else {
            f0Var = i0.j.f.p.h.k0(gVar3, f, fVar);
        }
        f0 f2 = f();
        List<m0> c = b2.h.c();
        MemberDeserializer memberDeserializer = b2.i;
        List<ProtoBuf$ValueParameter> list2 = protoBuf$Function2.g2;
        m0.n.b.i.d(list2, "proto.valueParameterList");
        List<o0> l = memberDeserializer.l(list2, protoBuf$Function2, annotatedCallableKind);
        m0.r.t.a.r.m.v f3 = b2.h.f(i0.j.f.p.h.E3(protoBuf$Function2, this.a.d));
        Modality a2 = sVar.a(m0.r.t.a.r.f.c.b.d.d(i3));
        p x0 = i0.j.f.p.h.x0(sVar, m0.r.t.a.r.f.c.b.c.d(i3));
        Map o = m0.j.g.o();
        b.C0265b bVar = m0.r.t.a.r.f.c.b.t;
        m0.r.t.a.r.k.b.w.g gVar4 = gVar3;
        i iVar5 = b2;
        int i4 = i3;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode c2 = c(gVar3, f0Var, l, c, f3, i0.d.a.a.a.E(bVar, i3, "IS_SUSPEND.get(flags)"));
        m0.n.b.i.e(c, "typeParameters");
        m0.n.b.i.e(l, "unsubstitutedValueParameters");
        m0.n.b.i.e(x0, "visibility");
        m0.n.b.i.e(o, "userDataMap");
        m0.n.b.i.e(c2, "isExperimentalCoroutineInReleaseEnvironment");
        gVar4.U0(f0Var, f2, c, l, f3, a2, x0, o);
        m0.r.t.a.r.k.b.w.g gVar5 = gVar4;
        m0.n.b.i.d(gVar5, "super.initialize(\n            extensionReceiverParameter,\n            dispatchReceiverParameter,\n            typeParameters,\n            unsubstitutedValueParameters,\n            unsubstitutedReturnType,\n            modality,\n            visibility,\n            userDataMap\n        )");
        gVar5.B2 = c2;
        gVar5.e2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.o, i4, "IS_OPERATOR.get(flags)");
        gVar5.f2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.p, i4, "IS_INFIX.get(flags)");
        gVar5.g2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.s, i4, "IS_EXTERNAL_FUNCTION.get(flags)");
        gVar5.h2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.q, i4, "IS_INLINE.get(flags)");
        gVar5.i2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.r, i4, "IS_TAILREC.get(flags)");
        gVar5.n2 = i0.d.a.a.a.E(bVar, i4, "IS_SUSPEND.get(flags)");
        gVar5.j2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.u, i4, "IS_EXPECT_FUNCTION.get(flags)");
        gVar5.o2 = !m0.r.t.a.r.f.c.b.v.d(i4).booleanValue();
        i iVar6 = this.a;
        Pair<a.C0250a<?>, Object> a3 = iVar6.a.m.a(protoBuf$Function, gVar5, iVar6.d, iVar5.h);
        if (a3 != null) {
            gVar5.M0((a.C0250a) a3.c, a3.d);
        }
        return gVar5;
    }

    public final c0 j(ProtoBuf$Property protoBuf$Property) {
        int i;
        f fVar;
        ProtoBuf$Type protoBuf$Type;
        m0.r.t.a.r.k.b.w.f fVar2;
        f0 f0Var;
        b.d<ProtoBuf$Visibility> dVar;
        b.C0265b bVar;
        b.C0265b bVar2;
        s sVar;
        i iVar;
        boolean z;
        b.d<ProtoBuf$Modality> dVar2;
        a0 a0Var;
        b.C0265b bVar3;
        m0.r.t.a.r.k.b.w.f fVar3;
        a0 a0Var2;
        boolean z2;
        b0 b0Var;
        int i2;
        m0.r.t.a.r.m.v f;
        ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
        m0.n.b.i.e(protoBuf$Property2, "proto");
        boolean z3 = true;
        if ((protoBuf$Property2.y & 1) != 1) {
            z3 = false;
        }
        if (z3) {
            i = protoBuf$Property2.Y1;
        } else {
            int i3 = protoBuf$Property2.Z1;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        m0.r.t.a.r.c.i iVar2 = this.a.c;
        f e = e(protoBuf$Property2, i4, AnnotatedCallableKind.PROPERTY);
        s sVar2 = s.a;
        b.d<ProtoBuf$Modality> dVar3 = m0.r.t.a.r.f.c.b.d;
        Modality a2 = sVar2.a(dVar3.d(i4));
        b.d<ProtoBuf$Visibility> dVar4 = m0.r.t.a.r.f.c.b.c;
        p x0 = i0.j.f.p.h.x0(sVar2, dVar4.d(i4));
        boolean E = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.w, i4, "IS_VAR.get(flags)");
        m0.r.t.a.r.g.d v1 = i0.j.f.p.h.v1(this.a.b, protoBuf$Property2.a2);
        CallableMemberDescriptor.Kind U2 = i0.j.f.p.h.U2(sVar2, m0.r.t.a.r.f.c.b.n.d(i4));
        b.d<ProtoBuf$Visibility> dVar5 = dVar4;
        boolean E2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.A, i4, "IS_LATEINIT.get(flags)");
        b.d<ProtoBuf$Modality> dVar6 = dVar3;
        boolean E3 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.z, i4, "IS_CONST.get(flags)");
        b.d<ProtoBuf$Visibility> dVar7 = dVar5;
        s sVar3 = sVar2;
        boolean E4 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.C, i4, "IS_EXTERNAL_PROPERTY.get(flags)");
        b.d<ProtoBuf$Visibility> dVar8 = dVar5;
        b.d<ProtoBuf$Modality> dVar9 = dVar6;
        boolean E5 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.D, i4, "IS_DELEGATED.get(flags)");
        b.d<ProtoBuf$Modality> dVar10 = dVar6;
        s sVar4 = sVar3;
        boolean E6 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.E, i4, "IS_EXPECT_PROPERTY.get(flags)");
        s sVar5 = sVar3;
        int i5 = i4;
        i iVar3 = this.a;
        m0.r.t.a.r.k.b.w.f fVar4 = r1;
        m0.r.t.a.r.k.b.w.f fVar5 = new m0.r.t.a.r.k.b.w.f(iVar2, (c0) null, e, a2, x0, E, v1, U2, E2, E3, E4, E5, E6, protoBuf$Property, iVar3.b, iVar3.d, iVar3.e, iVar3.g);
        i iVar4 = this.a;
        ProtoBuf$Property protoBuf$Property3 = protoBuf$Property;
        List<ProtoBuf$TypeParameter> list = protoBuf$Property3.d2;
        m0.n.b.i.d(list, "proto.typeParameterList");
        i b2 = i.b(iVar4, fVar4, list, (m0.r.t.a.r.f.c.c) null, (e) null, (m0.r.t.a.r.f.c.g) null, (m0.r.t.a.r.f.c.a) null, 60);
        int i6 = i5;
        boolean E7 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.x, i6, "HAS_GETTER.get(flags)");
        if (!E7 || !i0.j.f.p.h.S1(protoBuf$Property)) {
            Objects.requireNonNull(f.i);
            fVar = f.a.b;
        } else {
            fVar = new m0.r.t.a.r.k.b.w.a(this.a.a.a, new MemberDeserializer$getReceiverParameterAnnotations$1(this, protoBuf$Property3, AnnotatedCallableKind.PROPERTY_GETTER));
        }
        m0.r.t.a.r.m.v f2 = b2.h.f(i0.j.f.p.h.F3(protoBuf$Property3, this.a.d));
        List<m0> c = b2.h.c();
        f0 f3 = f();
        e eVar = this.a.d;
        m0.n.b.i.e(protoBuf$Property3, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        if (protoBuf$Property.x()) {
            protoBuf$Type = protoBuf$Property3.e2;
        } else {
            protoBuf$Type = protoBuf$Property.y() ? eVar.a(protoBuf$Property3.f2) : null;
        }
        if (protoBuf$Type == null || (f = b2.h.f(protoBuf$Type)) == null) {
            f0Var = null;
            fVar2 = fVar4;
        } else {
            fVar2 = fVar4;
            f0Var = i0.j.f.p.h.k0(fVar2, f, fVar);
        }
        fVar2.L0(f2, c, f3, f0Var);
        b.C0265b bVar4 = m0.r.t.a.r.f.c.b.b;
        boolean E8 = i0.d.a.a.a.E(bVar4, i6, "HAS_ANNOTATIONS.get(flags)");
        b.d<ProtoBuf$Visibility> dVar11 = dVar8;
        ProtoBuf$Visibility d = dVar11.d(i6);
        b.d<ProtoBuf$Modality> dVar12 = dVar10;
        ProtoBuf$Modality d2 = dVar12.d(i6);
        if (d == null) {
            m0.r.t.a.r.f.c.b.a(10);
            throw null;
        } else if (d2 != null) {
            int g = bVar4.e(Boolean.valueOf(E8)) | dVar12.e(d2) | dVar11.e(d);
            b.C0265b bVar5 = m0.r.t.a.r.f.c.b.I;
            Boolean bool = Boolean.FALSE;
            b.C0265b bVar6 = m0.r.t.a.r.f.c.b.J;
            b.C0265b bVar7 = m0.r.t.a.r.f.c.b.K;
            int g2 = g | bVar5.e(bool) | bVar6.e(bool) | bVar7.e(bool);
            if (E7) {
                int i7 = (protoBuf$Property3.y & 256) == 256 ? protoBuf$Property3.h2 : g2;
                boolean E9 = i0.d.a.a.a.E(bVar5, i7, "IS_NOT_DEFAULT.get(getterFlags)");
                boolean E10 = i0.d.a.a.a.E(bVar6, i7, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                boolean E11 = i0.d.a.a.a.E(bVar7, i7, "IS_INLINE_ACCESSOR.get(getterFlags)");
                f e2 = e(protoBuf$Property3, i7, AnnotatedCallableKind.PROPERTY_GETTER);
                if (E9) {
                    s sVar6 = sVar5;
                    Modality a3 = sVar6.a(dVar12.d(i7));
                    z = true;
                    sVar = sVar6;
                    p x02 = i0.j.f.p.h.x0(sVar6, dVar11.d(i7));
                    bVar3 = bVar7;
                    bVar2 = bVar6;
                    bVar = bVar5;
                    iVar = b2;
                    dVar = dVar11;
                    dVar2 = dVar12;
                    fVar3 = fVar2;
                    a0Var = new a0(fVar2, e2, a3, x02, !E9, E10, E11, fVar2.f(), (d0) null, h0.a);
                } else {
                    iVar = b2;
                    bVar3 = bVar7;
                    bVar2 = bVar6;
                    bVar = bVar5;
                    dVar2 = dVar12;
                    dVar = dVar11;
                    fVar3 = fVar2;
                    sVar = sVar5;
                    z = true;
                    a0Var = i0.j.f.p.h.g0(fVar3, e2);
                    m0.n.b.i.d(a0Var, "{\n                DescriptorFactory.createDefaultGetter(property, annotations)\n            }");
                }
                a0Var.J0(fVar3.getReturnType());
            } else {
                iVar = b2;
                bVar3 = bVar7;
                bVar2 = bVar6;
                bVar = bVar5;
                dVar2 = dVar12;
                dVar = dVar11;
                fVar3 = fVar2;
                sVar = sVar5;
                z = true;
                a0Var = null;
            }
            a0 a0Var3 = a0Var;
            boolean z4 = z;
            if (i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.y, i6, "HAS_SETTER.get(flags)")) {
                int i8 = (protoBuf$Property3.y & 512) == 512 ? z4 : false ? protoBuf$Property3.i2 : g2;
                boolean E12 = i0.d.a.a.a.E(bVar, i8, "IS_NOT_DEFAULT.get(setterFlags)");
                boolean E13 = i0.d.a.a.a.E(bVar2, i8, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                boolean E14 = i0.d.a.a.a.E(bVar3, i8, "IS_INLINE_ACCESSOR.get(setterFlags)");
                AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
                f e3 = e(protoBuf$Property3, i8, annotatedCallableKind);
                if (E12) {
                    s sVar7 = sVar;
                    b0 b0Var2 = r4;
                    z2 = z4;
                    a0Var2 = a0Var3;
                    b0 b0Var3 = new b0(fVar3, e3, sVar7.a(dVar2.d(i8)), i0.j.f.p.h.x0(sVar7, dVar.d(i8)), !E12, E13, E14, fVar3.f(), (e0) null, h0.a);
                    i2 = i6;
                    b0 b0Var4 = b0Var2;
                    b0Var4.K0((o0) m0.j.g.j0(i.b(iVar, b0Var2, EmptyList.c, (m0.r.t.a.r.f.c.c) null, (e) null, (m0.r.t.a.r.f.c.g) null, (m0.r.t.a.r.f.c.a) null, 60).i.l(i0.j.f.p.h.L2(protoBuf$Property3.g2), protoBuf$Property3, annotatedCallableKind)));
                    b0Var = b0Var4;
                } else {
                    z2 = z4;
                    a0Var2 = a0Var3;
                    i2 = i6;
                    Objects.requireNonNull(f.i);
                    b0Var = i0.j.f.p.h.h0(fVar3, e3, f.a.b);
                    m0.n.b.i.d(b0Var, "{\n                DescriptorFactory.createDefaultSetter(\n                    property, annotations,\n                    Annotations.EMPTY /* Otherwise the setter is not default, see DescriptorResolver.resolvePropertySetterDescriptor */\n                )\n            }");
                }
            } else {
                z2 = z4;
                a0Var2 = a0Var3;
                i2 = i6;
                b0Var = null;
            }
            if (i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.B, i2, "HAS_CONSTANT.get(flags)")) {
                fVar3.H0(this.a.a.a.e(new MemberDeserializer$loadProperty$3(this, protoBuf$Property3, fVar3)));
            }
            o oVar = new o(g(protoBuf$Property3, false), fVar3);
            o oVar2 = new o(g(protoBuf$Property3, z2), fVar3);
            m0.n.b.i.e(b(fVar3, iVar.h), "isExperimentalCoroutineInReleaseEnvironment");
            fVar3.o2 = a0Var2;
            fVar3.p2 = b0Var;
            fVar3.r2 = oVar;
            fVar3.s2 = oVar2;
            return fVar3;
        } else {
            m0.r.t.a.r.f.c.b.a(11);
            throw null;
        }
    }

    public final l0 k(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        ProtoBuf$Type protoBuf$Type;
        ProtoBuf$Type protoBuf$Type2;
        ProtoBuf$TypeAlias protoBuf$TypeAlias2 = protoBuf$TypeAlias;
        m0.n.b.i.e(protoBuf$TypeAlias2, "proto");
        f.a aVar = f.i;
        List<ProtoBuf$Annotation> list = protoBuf$TypeAlias2.f2;
        m0.n.b.i.d(list, "proto.annotationList");
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : list) {
            c cVar = this.b;
            m0.n.b.i.d(protoBuf$Annotation, "it");
            arrayList.add(cVar.a(protoBuf$Annotation, this.a.b));
        }
        f a2 = aVar.a(arrayList);
        p x0 = i0.j.f.p.h.x0(s.a, m0.r.t.a.r.f.c.b.c.d(protoBuf$TypeAlias2.Y1));
        i iVar = this.a;
        m0.r.t.a.r.l.l lVar = iVar.a.a;
        m0.r.t.a.r.c.i iVar2 = iVar.c;
        m0.r.t.a.r.g.d v1 = i0.j.f.p.h.v1(iVar.b, protoBuf$TypeAlias2.Z1);
        i iVar3 = this.a;
        m0.r.t.a.r.k.b.w.h hVar = new m0.r.t.a.r.k.b.w.h(lVar, iVar2, a2, v1, x0, protoBuf$TypeAlias, iVar3.b, iVar3.d, iVar3.e, iVar3.g);
        i iVar4 = this.a;
        List<ProtoBuf$TypeParameter> list2 = protoBuf$TypeAlias2.a2;
        m0.n.b.i.d(list2, "proto.typeParameterList");
        m0.r.t.a.r.k.b.w.h hVar2 = hVar;
        i b2 = i.b(iVar4, hVar, list2, (m0.r.t.a.r.f.c.c) null, (e) null, (m0.r.t.a.r.f.c.g) null, (m0.r.t.a.r.f.c.a) null, 60);
        List<m0> c = b2.h.c();
        TypeDeserializer typeDeserializer = b2.h;
        e eVar = this.a.d;
        m0.n.b.i.e(protoBuf$TypeAlias2, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        boolean z = true;
        if (protoBuf$TypeAlias.y()) {
            protoBuf$Type = protoBuf$TypeAlias2.b2;
            m0.n.b.i.d(protoBuf$Type, "underlyingType");
        } else {
            if ((protoBuf$TypeAlias2.y & 8) == 8) {
                protoBuf$Type = eVar.a(protoBuf$TypeAlias2.c2);
            } else {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
        }
        m0.r.t.a.r.m.a0 d = typeDeserializer.d(protoBuf$Type, false);
        TypeDeserializer typeDeserializer2 = b2.h;
        e eVar2 = this.a.d;
        m0.n.b.i.e(protoBuf$TypeAlias2, "<this>");
        m0.n.b.i.e(eVar2, "typeTable");
        if (protoBuf$TypeAlias.x()) {
            protoBuf$Type2 = protoBuf$TypeAlias2.d2;
            m0.n.b.i.d(protoBuf$Type2, "expandedType");
        } else {
            if ((protoBuf$TypeAlias2.y & 32) != 32) {
                z = false;
            }
            if (z) {
                protoBuf$Type2 = eVar2.a(protoBuf$TypeAlias2.e2);
            } else {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
        }
        hVar2.B0(c, d, typeDeserializer2.d(protoBuf$Type2, false), b(hVar2, b2.h));
        return hVar2;
    }

    public final List<o0> l(List<ProtoBuf$ValueParameter> list, l lVar, AnnotatedCallableKind annotatedCallableKind) {
        f fVar;
        ProtoBuf$Type protoBuf$Type;
        m0.r.t.a.r.m.v vVar;
        m0.r.t.a.r.c.a aVar = (m0.r.t.a.r.c.a) this.a.c;
        m0.r.t.a.r.c.i b2 = aVar.b();
        m0.n.b.i.d(b2, "callableDescriptor.containingDeclaration");
        r a2 = a(b2);
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) next;
                boolean z = true;
                if ((protoBuf$ValueParameter.y & 1) != 1) {
                    z = false;
                }
                int i3 = z ? protoBuf$ValueParameter.Y1 : 0;
                if (a2 == null || !i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.b, i3, "HAS_ANNOTATIONS.get(flags)")) {
                    Objects.requireNonNull(f.i);
                    fVar = f.a.b;
                } else {
                    fVar = new m0.r.t.a.r.k.b.w.i(this.a.a.a, new MemberDeserializer$valueParameters$1$annotations$1(this, a2, lVar, annotatedCallableKind, i, protoBuf$ValueParameter));
                }
                m0.r.t.a.r.g.d v1 = i0.j.f.p.h.v1(this.a.b, protoBuf$ValueParameter.Z1);
                i iVar = this.a;
                m0.r.t.a.r.m.v f = iVar.h.f(i0.j.f.p.h.r4(protoBuf$ValueParameter, iVar.d));
                boolean E = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.F, i3, "DECLARES_DEFAULT_VALUE.get(flags)");
                boolean E2 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.G, i3, "IS_CROSSINLINE.get(flags)");
                boolean E3 = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.H, i3, "IS_NOINLINE.get(flags)");
                e eVar = this.a.d;
                m0.n.b.i.e(protoBuf$ValueParameter, "<this>");
                m0.n.b.i.e(eVar, "typeTable");
                if (protoBuf$ValueParameter.y()) {
                    protoBuf$Type = protoBuf$ValueParameter.c2;
                } else {
                    protoBuf$Type = (protoBuf$ValueParameter.y & 32) == 32 ? eVar.a(protoBuf$ValueParameter.d2) : null;
                }
                if (protoBuf$Type == null) {
                    vVar = null;
                } else {
                    vVar = this.a.h.f(protoBuf$Type);
                }
                h0 h0Var = h0.a;
                m0.n.b.i.d(h0Var, "NO_SOURCE");
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new ValueParameterDescriptorImpl(aVar, (o0) null, i, fVar, v1, f, E, E2, E3, vVar, h0Var));
                arrayList = arrayList2;
                i = i2;
            } else {
                m0.j.g.r0();
                throw null;
            }
        }
        return m0.j.g.v0(arrayList);
    }

    public final boolean m(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        boolean z;
        boolean z2;
        if (!this.a.a.c.g()) {
            return false;
        }
        List<m0.r.t.a.r.f.c.f> F0 = deserializedMemberDescriptor.F0();
        if (!(F0 instanceof Collection) || !F0.isEmpty()) {
            Iterator<T> it = F0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m0.r.t.a.r.f.c.f fVar = (m0.r.t.a.r.f.c.f) it.next();
                if (!m0.n.b.i.a(fVar.a, new f.a(1, 3, 0, 4)) || fVar.b != ProtoBuf$VersionRequirement.VersionKind.LANGUAGE_VERSION) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }
}
