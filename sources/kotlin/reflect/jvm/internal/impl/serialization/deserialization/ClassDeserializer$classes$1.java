package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import m0.n.a.l;
import m0.r.t.a.r.c.d;

/* compiled from: ClassDeserializer.kt */
public final class ClassDeserializer$classes$1 extends Lambda implements l<ClassDeserializer.a, d> {
    public final /* synthetic */ ClassDeserializer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        super(1);
        this.c = classDeserializer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e8, code lost:
        if (((r11 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) r11).m().contains(r12)) != false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r17
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.a) r0
            java.lang.String r1 = "key"
            m0.n.b.i.e(r0, r1)
            r1 = r16
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer r2 = r1.c
            java.util.Objects.requireNonNull(r2)
            m0.r.t.a.r.g.a r3 = r0.a
            m0.r.t.a.r.k.b.g r4 = r2.c
            java.lang.Iterable<m0.r.t.a.r.c.s0.b> r4 = r4.k
            java.util.Iterator r4 = r4.iterator()
        L_0x001a:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x002e
            java.lang.Object r5 = r4.next()
            m0.r.t.a.r.c.s0.b r5 = (m0.r.t.a.r.c.s0.b) r5
            m0.r.t.a.r.c.d r6 = r5.c(r3)
            if (r6 != 0) goto L_0x0125
            goto L_0x001a
        L_0x002e:
            java.util.Set<m0.r.t.a.r.g.a> r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.b
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0038
            goto L_0x00f6
        L_0x0038:
            m0.r.t.a.r.k.b.d r0 = r0.b
            if (r0 != 0) goto L_0x0048
            m0.r.t.a.r.k.b.g r0 = r2.c
            m0.r.t.a.r.k.b.e r0 = r0.d
            m0.r.t.a.r.k.b.d r0 = r0.a(r3)
            if (r0 != 0) goto L_0x0048
            goto L_0x00f6
        L_0x0048:
            m0.r.t.a.r.f.c.c r4 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r5 = r0.b
            m0.r.t.a.r.f.c.a r14 = r0.c
            m0.r.t.a.r.c.h0 r0 = r0.d
            m0.r.t.a.r.g.a r7 = r3.g()
            java.lang.String r8 = "name"
            java.lang.String r9 = "classId.shortClassName"
            if (r7 == 0) goto L_0x0096
            r10 = 2
            m0.r.t.a.r.c.d r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.a(r2, r7, r6, r10)
            boolean r7 = r2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r7 == 0) goto L_0x0066
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r2
            goto L_0x0067
        L_0x0066:
            r2 = r6
        L_0x0067:
            if (r2 != 0) goto L_0x006b
            goto L_0x00f6
        L_0x006b:
            m0.r.t.a.r.g.d r3 = r3.j()
            m0.n.b.i.d(r3, r9)
            m0.n.b.i.e(r3, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope> r7 = r2.h2
            m0.r.t.a.r.k.b.i r8 = r2.e2
            m0.r.t.a.r.k.b.g r8 = r8.a
            m0.r.t.a.r.m.x0.h r8 = r8.q
            m0.r.t.a.r.m.x0.e r8 = r8.c()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r7 = r7.b(r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope r7 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope) r7
            java.util.Set r7 = r7.m()
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x0092
            goto L_0x00f6
        L_0x0092:
            m0.r.t.a.r.k.b.i r2 = r2.e2
            goto L_0x011a
        L_0x0096:
            m0.r.t.a.r.k.b.g r7 = r2.c
            m0.r.t.a.r.c.w r7 = r7.f
            m0.r.t.a.r.g.b r10 = r3.h()
            java.lang.String r11 = "classId.packageFqName"
            m0.n.b.i.d(r10, r11)
            java.util.List r7 = i0.j.f.p.h.Z2(r7, r10)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00ad:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00f0
            java.lang.Object r10 = r7.next()
            r11 = r10
            m0.r.t.a.r.c.v r11 = (m0.r.t.a.r.c.v) r11
            boolean r12 = r11 instanceof m0.r.t.a.r.k.b.k
            r13 = 0
            r15 = 1
            if (r12 == 0) goto L_0x00ea
            m0.r.t.a.r.k.b.k r11 = (m0.r.t.a.r.k.b.k) r11
            m0.r.t.a.r.g.d r12 = r3.j()
            m0.n.b.i.d(r12, r9)
            java.util.Objects.requireNonNull(r11)
            m0.n.b.i.e(r12, r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl r11 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl) r11
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r11 = r11.o()
            boolean r6 = r11 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
            if (r6 == 0) goto L_0x00e7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r11 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) r11
            java.util.Set r6 = r11.m()
            boolean r6 = r6.contains(r12)
            if (r6 == 0) goto L_0x00e7
            r6 = r15
            goto L_0x00e8
        L_0x00e7:
            r6 = r13
        L_0x00e8:
            if (r6 == 0) goto L_0x00eb
        L_0x00ea:
            r13 = r15
        L_0x00eb:
            if (r13 == 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            r6 = 0
            goto L_0x00ad
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            r8 = r10
            m0.r.t.a.r.c.v r8 = (m0.r.t.a.r.c.v) r8
            if (r8 != 0) goto L_0x00f8
        L_0x00f6:
            r6 = 0
            goto L_0x0125
        L_0x00f8:
            m0.r.t.a.r.k.b.g r7 = r2.c
            m0.r.t.a.r.f.c.e r10 = new m0.r.t.a.r.f.c.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r2 = r5.o2
            java.lang.String r3 = "classProto.typeTable"
            m0.n.b.i.d(r2, r3)
            r10.<init>(r2)
            m0.r.t.a.r.f.c.g$a r2 = m0.r.t.a.r.f.c.g.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r3 = r5.q2
            java.lang.String r6 = "classProto.versionRequirementTable"
            m0.n.b.i.d(r3, r6)
            m0.r.t.a.r.f.c.g r11 = r2.a(r3)
            r13 = 0
            r9 = r4
            r12 = r14
            m0.r.t.a.r.k.b.i r2 = r7.a(r8, r9, r10, r11, r12, r13)
        L_0x011a:
            r8 = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            r7 = r6
            r9 = r5
            r10 = r4
            r11 = r14
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0125:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1.invoke(java.lang.Object):java.lang.Object");
    }
}
