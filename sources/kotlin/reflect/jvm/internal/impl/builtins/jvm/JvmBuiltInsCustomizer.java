package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.b.k.d;
import m0.r.t.a.r.b.k.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.s0.a;
import m0.r.t.a.r.c.s0.c;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.e.b.n;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.w;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer implements a, c {
    public static final /* synthetic */ k<Object>[] a;
    public final u b;
    public final d c = d.a;
    public final h d;
    public final v e;
    public final h f;
    public final m0.r.t.a.r.l.a<b, m0.r.t.a.r.c.d> g;
    public final h h;

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    static {
        Class<JvmBuiltInsCustomizer> cls = JvmBuiltInsCustomizer.class;
        a = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), m.c(new PropertyReference1Impl(m.a(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), m.c(new PropertyReference1Impl(m.a(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(u uVar, l lVar, m0.n.a.a<JvmBuiltIns.a> aVar) {
        i.e(uVar, "moduleDescriptor");
        i.e(lVar, "storageManager");
        i.e(aVar, "settingsComputation");
        this.b = uVar;
        this.d = lVar.d(aVar);
        m0.r.t.a.r.c.t0.i iVar = new m0.r.t.a.r.c.t0.i(new f(uVar, new b("java.io")), m0.r.t.a.r.g.d.g("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, i0.j.f.p.h.L2(new w(lVar, new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1(this))), h0.a, false, lVar);
        iVar.H0(MemberScope.a.b, EmptySet.c, (m0.r.t.a.r.c.c) null);
        a0 q = iVar.q();
        i.d(q, "mockSerializableClass.defaultType");
        this.e = q;
        this.f = lVar.d(new JvmBuiltInsCustomizer$cloneableType$2(this, lVar));
        this.g = lVar.b();
        this.h = lVar.d(new JvmBuiltInsCustomizer$notConsideredDeprecation$2(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<m0.r.t.a.r.c.c> a(m0.r.t.a.r.c.d r15) {
        /*
            r14 = this;
            java.lang.String r0 = "classDescriptor"
            m0.n.b.i.e(r15, r0)
            r0 = r15
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r0.d2
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            if (r0 != r1) goto L_0x0172
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = r14.g()
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x0018
            goto L_0x0172
        L_0x0018:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r0 = r14.f(r15)
            if (r0 != 0) goto L_0x0021
            kotlin.collections.EmptyList r15 = kotlin.collections.EmptyList.c
            return r15
        L_0x0021:
            m0.r.t.a.r.b.k.d r1 = r14.c
            m0.r.t.a.r.g.b r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r0)
            m0.r.t.a.r.b.k.b r3 = m0.r.t.a.r.b.k.b.f
            m0.r.t.a.r.b.f r3 = m0.r.t.a.r.b.k.b.g
            r4 = 4
            r5 = 0
            m0.r.t.a.r.c.d r1 = m0.r.t.a.r.b.k.d.d(r1, r2, r3, r5, r4)
            if (r1 != 0) goto L_0x0036
            kotlin.collections.EmptyList r15 = kotlin.collections.EmptyList.c
            return r15
        L_0x0036:
            m0.r.t.a.r.m.l0 r2 = i0.j.f.p.h.q0(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r3 = r0.j2
            m0.r.t.a.r.l.h<java.util.List<m0.r.t.a.r.c.c>> r3 = r3.q
            java.lang.Object r3 = r3.invoke()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0051:
            boolean r6 = r3.hasNext()
            r7 = 3
            r8 = 0
            if (r6 == 0) goto L_0x0108
            java.lang.Object r6 = r3.next()
            r9 = r6
            m0.r.t.a.r.c.c r9 = (m0.r.t.a.r.c.c) r9
            m0.r.t.a.r.c.p r10 = r9.getVisibility()
            m0.r.t.a.r.c.q0 r10 = r10.a()
            boolean r10 = r10.isPublicAPI()
            r11 = 1
            if (r10 == 0) goto L_0x0101
            java.util.Collection r10 = r1.k()
            java.lang.String r12 = "defaultKotlinVersion.constructors"
            m0.n.b.i.d(r10, r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x007f
            goto L_0x00a7
        L_0x007f:
            java.util.Iterator r10 = r10.iterator()
        L_0x0083:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00a7
            java.lang.Object r12 = r10.next()
            m0.r.t.a.r.c.c r12 = (m0.r.t.a.r.c.c) r12
            java.lang.String r13 = "it"
            m0.n.b.i.d(r12, r13)
            m0.r.t.a.r.c.h r13 = r9.c(r2)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r12 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.j(r12, r13)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r13 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            if (r12 != r13) goto L_0x00a2
            r12 = r11
            goto L_0x00a3
        L_0x00a2:
            r12 = r8
        L_0x00a3:
            if (r12 == 0) goto L_0x0083
            r10 = r8
            goto L_0x00a8
        L_0x00a7:
            r10 = r11
        L_0x00a8:
            if (r10 == 0) goto L_0x0101
            java.util.List r10 = r9.h()
            int r10 = r10.size()
            if (r10 != r11) goto L_0x00e3
            java.util.List r10 = r9.h()
            java.lang.String r12 = "valueParameters"
            m0.n.b.i.d(r10, r12)
            java.lang.Object r10 = m0.j.g.j0(r10)
            m0.r.t.a.r.c.o0 r10 = (m0.r.t.a.r.c.o0) r10
            m0.r.t.a.r.m.v r10 = r10.getType()
            m0.r.t.a.r.m.j0 r10 = r10.I0()
            m0.r.t.a.r.c.f r10 = r10.c()
            if (r10 != 0) goto L_0x00d3
            r10 = r5
            goto L_0x00d7
        L_0x00d3:
            m0.r.t.a.r.g.c r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.i(r10)
        L_0x00d7:
            m0.r.t.a.r.g.c r12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.i(r15)
            boolean r10 = m0.n.b.i.a(r10, r12)
            if (r10 == 0) goto L_0x00e3
            r10 = r11
            goto L_0x00e4
        L_0x00e3:
            r10 = r8
        L_0x00e4:
            if (r10 != 0) goto L_0x0101
            boolean r10 = m0.r.t.a.r.b.f.D(r9)
            if (r10 != 0) goto L_0x0101
            m0.r.t.a.r.b.k.k r10 = m0.r.t.a.r.b.k.k.a
            java.util.Set<java.lang.String> r10 = m0.r.t.a.r.b.k.k.f
            m0.r.t.a.r.e.b.p r12 = m0.r.t.a.r.e.b.p.a
            java.lang.String r7 = m0.r.t.a.r.e.b.n.b(r9, r8, r8, r7)
            java.lang.String r7 = i0.j.f.p.h.Q3(r12, r0, r7)
            boolean r7 = r10.contains(r7)
            if (r7 != 0) goto L_0x0101
            r8 = r11
        L_0x0101:
            if (r8 == 0) goto L_0x0051
            r4.add(r6)
            goto L_0x0051
        L_0x0108:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = i0.j.f.p.h.K(r4, r3)
            r1.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0117:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0171
            java.lang.Object r4 = r3.next()
            m0.r.t.a.r.c.c r4 = (m0.r.t.a.r.c.c) r4
            m0.r.t.a.r.c.r$a r5 = r4.s()
            r5.l(r15)
            r6 = r15
            m0.r.t.a.r.c.t0.b r6 = (m0.r.t.a.r.c.t0.b) r6
            m0.r.t.a.r.m.a0 r6 = r6.q()
            r5.e(r6)
            r5.d()
            m0.r.t.a.r.m.p0 r6 = r2.g()
            r5.i(r6)
            m0.r.t.a.r.b.k.k r6 = m0.r.t.a.r.b.k.k.a
            java.util.Set<java.lang.String> r6 = m0.r.t.a.r.b.k.k.g
            m0.r.t.a.r.e.b.p r9 = m0.r.t.a.r.e.b.p.a
            java.lang.String r4 = m0.r.t.a.r.e.b.n.b(r4, r8, r8, r7)
            java.lang.String r4 = i0.j.f.p.h.Q3(r9, r0, r4)
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L_0x0162
            m0.r.t.a.r.l.h r4 = r14.h
            m0.r.k<java.lang.Object>[] r6 = a
            r9 = 2
            r6 = r6[r9]
            java.lang.Object r4 = i0.j.f.p.h.K1(r4, r6)
            m0.r.t.a.r.c.r0.f r4 = (m0.r.t.a.r.c.r0.f) r4
            r5.o(r4)
        L_0x0162:
            m0.r.t.a.r.c.r r4 = r5.build()
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"
            java.util.Objects.requireNonNull(r4, r5)
            m0.r.t.a.r.c.c r4 = (m0.r.t.a.r.c.c) r4
            r1.add(r4)
            goto L_0x0117
        L_0x0171:
            return r1
        L_0x0172:
            kotlin.collections.EmptyList r15 = kotlin.collections.EmptyList.c
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.a(m0.r.t.a.r.c.d):java.util.Collection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x029f, code lost:
        if (r1 != 3) goto L_0x02bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0236 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0229 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<m0.r.t.a.r.c.g0> b(m0.r.t.a.r.g.d r14, m0.r.t.a.r.c.d r15) {
        /*
            r13 = this;
            java.lang.String r0 = "name"
            m0.n.b.i.e(r14, r0)
            java.lang.String r0 = "classDescriptor"
            m0.n.b.i.e(r15, r0)
            m0.r.t.a.r.b.k.a r0 = m0.r.t.a.r.b.k.a.e
            m0.r.t.a.r.g.d r0 = m0.r.t.a.r.b.k.a.f
            boolean r0 = m0.n.b.i.a(r14, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r15 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r0 == 0) goto L_0x00b0
            m0.r.t.a.r.g.d r0 = m0.r.t.a.r.b.f.a
            m0.r.t.a.r.g.c r0 = m0.r.t.a.r.b.g.a.h
            boolean r0 = m0.r.t.a.r.b.f.c(r15, r0)
            if (r0 != 0) goto L_0x002d
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = m0.r.t.a.r.b.f.s(r15)
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = r2
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x00b0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r15 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r15
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r15.y
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r0 = r0.i2
            java.lang.String r3 = "classDescriptor.classProto.functionList"
            m0.n.b.i.d(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0042
            goto L_0x0067
        L_0x0042:
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0067
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3
            m0.r.t.a.r.k.b.i r4 = r15.e2
            m0.r.t.a.r.f.c.c r4 = r4.b
            int r3 = r3.a2
            m0.r.t.a.r.g.d r3 = i0.j.f.p.h.v1(r4, r3)
            m0.r.t.a.r.b.k.a r4 = m0.r.t.a.r.b.k.a.e
            m0.r.t.a.r.g.d r4 = m0.r.t.a.r.b.k.a.f
            boolean r3 = m0.n.b.i.a(r3, r4)
            if (r3 == 0) goto L_0x0046
            r2 = r1
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.c
            return r14
        L_0x006c:
            m0.r.t.a.r.l.h r0 = r13.f
            m0.r.k<java.lang.Object>[] r2 = a
            r1 = r2[r1]
            java.lang.Object r0 = i0.j.f.p.h.K1(r0, r1)
            m0.r.t.a.r.m.a0 r0 = (m0.r.t.a.r.m.a0) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.o()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS
            java.util.Collection r14 = r0.a(r14, r1)
            java.lang.Object r14 = m0.j.g.i0(r14)
            m0.r.t.a.r.c.g0 r14 = (m0.r.t.a.r.c.g0) r14
            m0.r.t.a.r.c.r$a r14 = r14.s()
            r14.l(r15)
            m0.r.t.a.r.c.p r0 = m0.r.t.a.r.c.o.e
            r14.k(r0)
            m0.r.t.a.r.m.a0 r0 = r15.q()
            r14.e(r0)
            m0.r.t.a.r.c.f0 r15 = r15.G0()
            r14.c(r15)
            m0.r.t.a.r.c.r r14 = r14.build()
            m0.r.t.a.r.c.g0 r14 = (m0.r.t.a.r.c.g0) r14
            m0.n.b.i.c(r14)
            java.util.List r14 = i0.j.f.p.h.L2(r14)
            return r14
        L_0x00b0:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = r13.g()
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x00bb
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.c
            return r14
        L_0x00bb:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2 r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            r0.<init>(r14)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r14 = r13.f(r15)
            r3 = 3
            r4 = 2
            r5 = 0
            if (r14 != 0) goto L_0x00cd
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.c
            goto L_0x022d
        L_0x00cd:
            m0.r.t.a.r.b.k.d r6 = r13.c
            m0.r.t.a.r.g.b r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r14)
            m0.r.t.a.r.b.k.b r8 = m0.r.t.a.r.b.k.b.f
            m0.r.t.a.r.b.f r8 = m0.r.t.a.r.b.k.b.g
            java.util.Objects.requireNonNull(r6)
            java.lang.String r9 = "fqName"
            m0.n.b.i.e(r7, r9)
            java.lang.String r9 = "builtIns"
            m0.n.b.i.e(r8, r9)
            r9 = 4
            m0.r.t.a.r.c.d r6 = m0.r.t.a.r.b.k.d.d(r6, r7, r8, r5, r9)
            if (r6 != 0) goto L_0x00ee
            kotlin.collections.EmptySet r6 = kotlin.collections.EmptySet.c
            goto L_0x0116
        L_0x00ee:
            m0.r.t.a.r.b.k.c r7 = m0.r.t.a.r.b.k.c.a
            m0.r.t.a.r.g.c r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.i(r6)
            java.util.HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.b> r9 = m0.r.t.a.r.b.k.c.l
            java.lang.Object r7 = r9.get(r7)
            m0.r.t.a.r.g.b r7 = (m0.r.t.a.r.g.b) r7
            if (r7 != 0) goto L_0x0103
            java.util.Set r6 = i0.j.f.p.h.N3(r6)
            goto L_0x0116
        L_0x0103:
            m0.r.t.a.r.c.d[] r9 = new m0.r.t.a.r.c.d[r4]
            r9[r2] = r6
            m0.r.t.a.r.c.d r6 = r8.j(r7)
            java.lang.String r7 = "builtIns.getBuiltInClassByFqName(kotlinMutableAnalogFqName)"
            m0.n.b.i.d(r6, r7)
            r9[r1] = r6
            java.util.List r6 = m0.j.g.K(r9)
        L_0x0116:
            java.lang.Object r7 = m0.j.g.H(r6)
            m0.r.t.a.r.c.d r7 = (m0.r.t.a.r.c.d) r7
            if (r7 != 0) goto L_0x0122
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.c
            goto L_0x022d
        L_0x0122:
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = i0.j.f.p.h.K(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x0131:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0145
            java.lang.Object r9 = r6.next()
            m0.r.t.a.r.c.d r9 = (m0.r.t.a.r.c.d) r9
            m0.r.t.a.r.g.b r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r9)
            r8.add(r9)
            goto L_0x0131
        L_0x0145:
            java.lang.String r6 = "set"
            m0.n.b.i.e(r8, r6)
            m0.r.t.a.r.o.j r6 = new m0.r.t.a.r.o.j
            r6.<init>(r5)
            r6.addAll(r8)
            m0.r.t.a.r.b.k.d r8 = r13.c
            boolean r8 = r8.b(r15)
            m0.r.t.a.r.l.a<m0.r.t.a.r.g.b, m0.r.t.a.r.c.d> r9 = r13.g
            m0.r.t.a.r.g.b r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r14)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 r11 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
            r11.<init>(r14, r7)
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d r9 = (kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.d) r9
            java.lang.Object r14 = r9.c(r10, r11)
            m0.r.t.a.r.c.d r14 = (m0.r.t.a.r.c.d) r14
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r14 = r14.z0()
            java.lang.String r7 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            m0.n.b.i.d(r14, r7)
            java.lang.Object r14 = r0.invoke(r14)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0183:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x022c
            java.lang.Object r7 = r14.next()
            r9 = r7
            m0.r.t.a.r.c.g0 r9 = (m0.r.t.a.r.c.g0) r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r10 = r9.f()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r11 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r10 == r11) goto L_0x019a
            goto L_0x0223
        L_0x019a:
            m0.r.t.a.r.c.p r10 = r9.getVisibility()
            m0.r.t.a.r.c.q0 r10 = r10.a()
            boolean r10 = r10.isPublicAPI()
            if (r10 != 0) goto L_0x01aa
            goto L_0x0223
        L_0x01aa:
            boolean r10 = m0.r.t.a.r.b.f.D(r9)
            if (r10 == 0) goto L_0x01b2
            goto L_0x0223
        L_0x01b2:
            java.util.Collection r10 = r9.e()
            java.lang.String r11 = "analogueMember.overriddenDescriptors"
            m0.n.b.i.d(r10, r11)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x01c2
            goto L_0x01e6
        L_0x01c2:
            java.util.Iterator r10 = r10.iterator()
        L_0x01c6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01e6
            java.lang.Object r11 = r10.next()
            m0.r.t.a.r.c.r r11 = (m0.r.t.a.r.c.r) r11
            m0.r.t.a.r.c.i r11 = r11.b()
            java.lang.String r12 = "it.containingDeclaration"
            m0.n.b.i.d(r11, r12)
            m0.r.t.a.r.g.b r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r11)
            boolean r11 = r6.contains(r11)
            if (r11 == 0) goto L_0x01c6
            goto L_0x01e7
        L_0x01e6:
            r1 = r2
        L_0x01e7:
            if (r1 == 0) goto L_0x01ea
            goto L_0x0223
        L_0x01ea:
            m0.r.t.a.r.c.i r1 = r9.b()
            m0.r.t.a.r.c.d r1 = (m0.r.t.a.r.c.d) r1
            java.lang.String r10 = m0.r.t.a.r.e.b.n.b(r9, r2, r2, r3)
            m0.r.t.a.r.b.k.k r11 = m0.r.t.a.r.b.k.k.a
            java.util.Set<java.lang.String> r11 = m0.r.t.a.r.b.k.k.e
            m0.r.t.a.r.e.b.p r12 = m0.r.t.a.r.e.b.p.a
            java.lang.String r1 = i0.j.f.p.h.Q3(r12, r1, r10)
            boolean r1 = r11.contains(r1)
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x0207
            r1 = 1
            goto L_0x021f
        L_0x0207:
            java.util.List r1 = i0.j.f.p.h.L2(r9)
            m0.r.t.a.r.b.k.i r9 = m0.r.t.a.r.b.k.i.a
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2 r10 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
            r10.<init>(r13)
            java.lang.Boolean r1 = m0.r.t.a.r.m.a1.a.d2(r1, r9, r10)
            java.lang.String r9 = "private fun SimpleFunctionDescriptor.isMutabilityViolation(isMutable: Boolean): Boolean {\n        val owner = containingDeclaration as ClassDescriptor\n        val jvmDescriptor = computeJvmDescriptor()\n\n        if ((SignatureBuildingComponents.signature(owner, jvmDescriptor) in MUTABLE_METHOD_SIGNATURES) xor isMutable) return true\n\n        return DFS.ifAny<CallableMemberDescriptor>(\n            listOf(this),\n            { it.original.overriddenDescriptors }\n        ) { overridden ->\n            overridden.kind == CallableMemberDescriptor.Kind.DECLARATION &&\n                    j2kClassMapper.isMutable(overridden.containingDeclaration as ClassDescriptor)\n        }\n    }"
            m0.n.b.i.d(r1, r9)
            boolean r1 = r1.booleanValue()
        L_0x021f:
            if (r1 != 0) goto L_0x0223
            r1 = 1
            goto L_0x0224
        L_0x0223:
            r1 = r2
        L_0x0224:
            if (r1 == 0) goto L_0x0229
            r0.add(r7)
        L_0x0229:
            r1 = 1
            goto L_0x0183
        L_0x022c:
            r14 = r0
        L_0x022d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0236:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x02cd
            java.lang.Object r1 = r14.next()
            m0.r.t.a.r.c.g0 r1 = (m0.r.t.a.r.c.g0) r1
            m0.r.t.a.r.c.i r6 = r1.b()
            m0.r.t.a.r.c.d r6 = (m0.r.t.a.r.c.d) r6
            m0.r.t.a.r.m.l0 r6 = i0.j.f.p.h.q0(r6, r15)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r6 = r6.c()
            m0.r.t.a.r.c.r r6 = r1.c(r6)
            java.lang.String r7 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            java.util.Objects.requireNonNull(r6, r7)
            m0.r.t.a.r.c.g0 r6 = (m0.r.t.a.r.c.g0) r6
            m0.r.t.a.r.c.r$a r6 = r6.s()
            r6.l(r15)
            r7 = r15
            m0.r.t.a.r.c.t0.b r7 = (m0.r.t.a.r.c.t0.b) r7
            m0.r.t.a.r.c.f0 r7 = r7.G0()
            r6.c(r7)
            r6.d()
            m0.r.t.a.r.c.i r7 = r1.b()
            m0.r.t.a.r.c.d r7 = (m0.r.t.a.r.c.d) r7
            java.lang.String r1 = m0.r.t.a.r.e.b.n.b(r1, r2, r2, r3)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            java.util.List r7 = i0.j.f.p.h.L2(r7)
            m0.r.t.a.r.b.k.g r9 = new m0.r.t.a.r.b.k.g
            r9.<init>(r13)
            m0.r.t.a.r.b.k.h r10 = new m0.r.t.a.r.b.k.h
            r10.<init>(r1, r8)
            java.lang.Object r1 = m0.r.t.a.r.m.a1.a.e1(r7, r9, r10)
            java.lang.String r7 = "private fun FunctionDescriptor.getJdkMethodStatus(): JDKMemberStatus {\n        val owner = containingDeclaration as ClassDescriptor\n        val jvmDescriptor = computeJvmDescriptor()\n        var result: JDKMemberStatus? = null\n        return DFS.dfs<ClassDescriptor, JDKMemberStatus>(\n            listOf(owner),\n            {\n                // Search through mapped supertypes to determine that Set.toArray should be invisible, while we have only\n                // Collection.toArray there explicitly\n                // Note, that we can't find j.u.Collection.toArray within overriddenDescriptors of j.u.Set.toArray\n                it.typeConstructor.supertypes.mapNotNull {\n                    (it.constructor.declarationDescriptor?.original as? ClassDescriptor)?.getJavaAnalogue()\n                }\n            },\n            object : DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() {\n                override fun beforeChildren(javaClassDescriptor: ClassDescriptor): Boolean {\n                    val signature = SignatureBuildingComponents.signature(javaClassDescriptor, jvmDescriptor)\n                    when (signature) {\n                        in HIDDEN_METHOD_SIGNATURES -> result = JDKMemberStatus.HIDDEN\n                        in VISIBLE_METHOD_SIGNATURES -> result = JDKMemberStatus.VISIBLE\n                        in DROP_LIST_METHOD_SIGNATURES -> result = JDKMemberStatus.DROP\n                    }\n\n                    return result == null\n                }\n\n                override fun result() = result ?: JDKMemberStatus.NOT_CONSIDERED\n            })\n    }"
            m0.n.b.i.d(r1, r7)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r1 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x02b2
            if (r1 == r4) goto L_0x02a2
            if (r1 == r3) goto L_0x02b8
            goto L_0x02bd
        L_0x02a2:
            m0.r.t.a.r.l.h r1 = r13.h
            m0.r.k<java.lang.Object>[] r7 = a
            r7 = r7[r4]
            java.lang.Object r1 = i0.j.f.p.h.K1(r1, r7)
            m0.r.t.a.r.c.r0.f r1 = (m0.r.t.a.r.c.r0.f) r1
            r6.o(r1)
            goto L_0x02bd
        L_0x02b2:
            boolean r1 = i0.j.f.p.h.j2(r15)
            if (r1 == 0) goto L_0x02ba
        L_0x02b8:
            r1 = r5
            goto L_0x02c6
        L_0x02ba:
            r6.g()
        L_0x02bd:
            m0.r.t.a.r.c.r r1 = r6.build()
            m0.r.t.a.r.c.g0 r1 = (m0.r.t.a.r.c.g0) r1
            m0.n.b.i.c(r1)
        L_0x02c6:
            if (r1 == 0) goto L_0x0236
            r0.add(r1)
            goto L_0x0236
        L_0x02cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.b(m0.r.t.a.r.g.d, m0.r.t.a.r.c.d):java.util.Collection");
    }

    public boolean c(m0.r.t.a.r.c.d dVar, g0 g0Var) {
        i.e(dVar, "classDescriptor");
        i.e(g0Var, "functionDescriptor");
        LazyJavaClassDescriptor f2 = f(dVar);
        if (f2 == null || !g0Var.getAnnotations().n(m0.r.t.a.r.c.s0.d.a)) {
            return true;
        }
        if (!g().b) {
            return false;
        }
        String b2 = n.b(g0Var, false, false, 3);
        LazyJavaClassMemberScope H0 = f2.z0();
        m0.r.t.a.r.g.d name = g0Var.getName();
        i.d(name, "functionDescriptor.name");
        Collection<g0> a2 = H0.a(name, NoLookupLocation.FROM_BUILTINS);
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            for (g0 b3 : a2) {
                if (i.a(n.b(b3, false, false, 3), b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Collection<v> d(m0.r.t.a.r.c.d dVar) {
        i.e(dVar, "classDescriptor");
        m0.r.t.a.r.g.c i = DescriptorUtilsKt.i(dVar);
        m0.r.t.a.r.b.k.k kVar = m0.r.t.a.r.b.k.k.a;
        boolean z = false;
        if (kVar.a(i)) {
            a0 a0Var = (a0) i0.j.f.p.h.K1(this.f, a[1]);
            i.d(a0Var, "cloneableType");
            return g.K(a0Var, this.e);
        }
        i.e(i, "fqName");
        if (kVar.a(i)) {
            z = true;
        } else {
            m0.r.t.a.r.g.a h2 = m0.r.t.a.r.b.k.c.a.h(i);
            if (h2 != null) {
                try {
                    z = Serializable.class.isAssignableFrom(Class.forName(h2.b().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (z) {
            return i0.j.f.p.h.L2(this.e);
        }
        return EmptyList.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r2 = r2.H0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection e(m0.r.t.a.r.c.d r2) {
        /*
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            m0.n.b.i.e(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = r1.g()
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x0010
            kotlin.collections.EmptySet r2 = kotlin.collections.EmptySet.c
            goto L_0x0028
        L_0x0010:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r2 = r1.f(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r2 = r2.z0()
            if (r2 != 0) goto L_0x0020
        L_0x001e:
            r2 = r0
            goto L_0x0024
        L_0x0020:
            java.util.Set r2 = r2.b()
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            kotlin.collections.EmptySet r2 = kotlin.collections.EmptySet.c
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.e(m0.r.t.a.r.c.d):java.util.Collection");
    }

    public final LazyJavaClassDescriptor f(m0.r.t.a.r.c.d dVar) {
        m0.r.t.a.r.g.d dVar2 = m0.r.t.a.r.b.f.a;
        if (dVar == null) {
            m0.r.t.a.r.b.f.a(107);
            throw null;
        } else if (m0.r.t.a.r.b.f.c(dVar, g.a.b) || !m0.r.t.a.r.b.f.M(dVar)) {
            return null;
        } else {
            m0.r.t.a.r.g.c i = DescriptorUtilsKt.i(dVar);
            if (!i.f()) {
                return null;
            }
            m0.r.t.a.r.g.a h2 = m0.r.t.a.r.b.k.c.a.h(i);
            b b2 = h2 == null ? null : h2.b();
            if (b2 == null) {
                return null;
            }
            m0.r.t.a.r.c.d A3 = i0.j.f.p.h.A3(g().a, b2, NoLookupLocation.FROM_BUILTINS);
            if (A3 instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) A3;
            }
            return null;
        }
    }

    public final JvmBuiltIns.a g() {
        return (JvmBuiltIns.a) i0.j.f.p.h.K1(this.d, a[0]);
    }
}
