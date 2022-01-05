package m0.r.t.a;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.e.a.p;
import m0.r.t.a.r.f.d.a.e;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;

/* compiled from: RuntimeTypeMapper.kt */
public final class n {
    public static final a a;
    public static final n b = null;

    static {
        a l = a.l(new b("java.lang.Void"));
        i.d(l, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        a = l;
    }

    public static final PrimitiveType a(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(cls.getSimpleName());
        i.d(jvmPrimitiveType, "JvmPrimitiveType.get(simpleName)");
        return jvmPrimitiveType.getPrimitiveType();
    }

    public static final JvmFunctionSignature.c b(r rVar) {
        String q1 = h.q1(rVar);
        if (q1 == null) {
            if (rVar instanceof d0) {
                String b2 = DescriptorUtilsKt.m(rVar).getName().b();
                i.d(b2, "descriptor.propertyIfAccessor.name.asString()");
                q1 = p.a(b2);
            } else if (rVar instanceof e0) {
                String b3 = DescriptorUtilsKt.m(rVar).getName().b();
                i.d(b3, "descriptor.propertyIfAccessor.name.asString()");
                q1 = p.b(b3);
            } else {
                q1 = rVar.getName().b();
                i.d(q1, "descriptor.name.asString()");
            }
        }
        return new JvmFunctionSignature.c(new e.b(q1, m0.r.t.a.r.e.b.n.b(rVar, false, false, 1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.reflect.jvm.internal.JvmFunctionSignature$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.c c(m0.r.t.a.r.c.c0 r7) {
        /*
            java.lang.String r0 = "possiblyOverriddenProperty"
            m0.n.b.i.e(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7 = m0.r.t.a.r.j.d.z(r7)
            java.lang.String r0 = "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)"
            m0.n.b.i.d(r7, r0)
            m0.r.t.a.r.c.c0 r7 = (m0.r.t.a.r.c.c0) r7
            m0.r.t.a.r.c.c0 r1 = r7.a()
            java.lang.String r7 = "DescriptorUtils.unwrapFa…rriddenProperty).original"
            m0.n.b.i.d(r1, r7)
            boolean r7 = r1 instanceof m0.r.t.a.r.k.b.w.f
            r0 = 0
            if (r7 == 0) goto L_0x003d
            r7 = r1
            m0.r.t.a.r.k.b.w.f r7 = (m0.r.t.a.r.k.b.w.f) r7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = r7.t2
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r4 = "JvmProtoBuf.propertySignature"
            m0.n.b.i.d(r3, r4)
            java.lang.Object r3 = i0.j.f.p.h.c1(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3
            if (r3 == 0) goto L_0x00be
            m0.r.t.a.c$c r6 = new m0.r.t.a.c$c
            m0.r.t.a.r.f.c.c r4 = r7.u2
            m0.r.t.a.r.f.c.e r5 = r7.v2
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003d:
            boolean r7 = r1 instanceof m0.r.t.a.r.e.a.t.f
            if (r7 == 0) goto L_0x00be
            r7 = r1
            m0.r.t.a.r.e.a.t.f r7 = (m0.r.t.a.r.e.a.t.f) r7
            m0.r.t.a.r.c.h0 r7 = r7.r()
            boolean r2 = r7 instanceof m0.r.t.a.r.e.a.v.a
            if (r2 != 0) goto L_0x004d
            r7 = r0
        L_0x004d:
            m0.r.t.a.r.e.a.v.a r7 = (m0.r.t.a.r.e.a.v.a) r7
            if (r7 == 0) goto L_0x0056
            m0.r.t.a.r.e.a.w.l r7 = r7.b()
            goto L_0x0057
        L_0x0056:
            r7 = r0
        L_0x0057:
            boolean r2 = r7 instanceof m0.r.t.a.r.c.v0.b.n
            if (r2 == 0) goto L_0x0065
            m0.r.t.a.c$a r0 = new m0.r.t.a.c$a
            m0.r.t.a.r.c.v0.b.n r7 = (m0.r.t.a.r.c.v0.b.n) r7
            java.lang.reflect.Field r7 = r7.a
            r0.<init>(r7)
            goto L_0x0099
        L_0x0065:
            boolean r2 = r7 instanceof m0.r.t.a.r.c.v0.b.q
            if (r2 == 0) goto L_0x009a
            m0.r.t.a.c$b r2 = new m0.r.t.a.c$b
            m0.r.t.a.r.c.v0.b.q r7 = (m0.r.t.a.r.c.v0.b.q) r7
            java.lang.reflect.Method r7 = r7.a
            m0.r.t.a.r.c.e0 r1 = r1.getSetter()
            if (r1 == 0) goto L_0x007a
            m0.r.t.a.r.c.h0 r1 = r1.r()
            goto L_0x007b
        L_0x007a:
            r1 = r0
        L_0x007b:
            boolean r3 = r1 instanceof m0.r.t.a.r.e.a.v.a
            if (r3 != 0) goto L_0x0080
            r1 = r0
        L_0x0080:
            m0.r.t.a.r.e.a.v.a r1 = (m0.r.t.a.r.e.a.v.a) r1
            if (r1 == 0) goto L_0x0089
            m0.r.t.a.r.e.a.w.l r1 = r1.b()
            goto L_0x008a
        L_0x0089:
            r1 = r0
        L_0x008a:
            boolean r3 = r1 instanceof m0.r.t.a.r.c.v0.b.q
            if (r3 != 0) goto L_0x008f
            r1 = r0
        L_0x008f:
            m0.r.t.a.r.c.v0.b.q r1 = (m0.r.t.a.r.c.v0.b.q) r1
            if (r1 == 0) goto L_0x0095
            java.lang.reflect.Method r0 = r1.a
        L_0x0095:
            r2.<init>(r7, r0)
            r0 = r2
        L_0x0099:
            return r0
        L_0x009a:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r7)
            r7 = 41
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
        L_0x00be:
            m0.r.t.a.r.c.d0 r7 = r1.getGetter()
            m0.n.b.i.c(r7)
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = b(r7)
            m0.r.t.a.r.c.e0 r1 = r1.getSetter()
            if (r1 == 0) goto L_0x00d3
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r0 = b(r1)
        L_0x00d3:
            m0.r.t.a.c$d r1 = new m0.r.t.a.c$d
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.n.c(m0.r.t.a.r.c.c0):m0.r.t.a.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r0.h().isEmpty() != false) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.JvmFunctionSignature d(m0.r.t.a.r.c.r r7) {
        /*
            java.lang.String r0 = "possiblySubstitutedFunction"
            m0.n.b.i.e(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = m0.r.t.a.r.j.d.z(r7)
            java.lang.String r1 = "DescriptorUtils.unwrapFa…siblySubstitutedFunction)"
            m0.n.b.i.d(r0, r1)
            m0.r.t.a.r.c.r r0 = (m0.r.t.a.r.c.r) r0
            m0.r.t.a.r.c.r r0 = r0.a()
            java.lang.String r1 = "DescriptorUtils.unwrapFa…titutedFunction).original"
            m0.n.b.i.d(r0, r1)
            boolean r1 = r0 instanceof m0.r.t.a.r.k.b.w.b
            if (r1 == 0) goto L_0x0077
            r1 = r0
            m0.r.t.a.r.k.b.w.b r1 = (m0.r.t.a.r.k.b.w.b) r1
            m0.r.t.a.r.h.l r2 = r1.A()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            if (r3 == 0) goto L_0x0041
            m0.r.t.a.r.f.d.a.h r3 = m0.r.t.a.r.f.d.a.h.a
            r4 = r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r4
            m0.r.t.a.r.f.c.c r5 = r1.Y()
            m0.r.t.a.r.f.c.e r6 = r1.R()
            m0.r.t.a.r.f.d.a.e$b r3 = r3.c(r4, r5, r6)
            if (r3 == 0) goto L_0x0041
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$c
            r7.<init>(r3)
            return r7
        L_0x0041:
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r3 == 0) goto L_0x0072
            m0.r.t.a.r.f.d.a.h r3 = m0.r.t.a.r.f.d.a.h.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r2
            m0.r.t.a.r.f.c.c r4 = r1.Y()
            m0.r.t.a.r.f.c.e r1 = r1.R()
            m0.r.t.a.r.f.d.a.e$b r1 = r3.a(r2, r4, r1)
            if (r1 == 0) goto L_0x0072
            m0.r.t.a.r.c.i r7 = r7.b()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            m0.n.b.i.d(r7, r0)
            boolean r7 = m0.r.t.a.r.j.e.b(r7)
            if (r7 == 0) goto L_0x006c
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$c
            r7.<init>(r1)
            goto L_0x0071
        L_0x006c:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$b r7 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$b
            r7.<init>(r1)
        L_0x0071:
            return r7
        L_0x0072:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = b(r0)
            return r7
        L_0x0077:
            boolean r7 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            r1 = 0
            if (r7 == 0) goto L_0x00bd
            r7 = r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r7 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r7
            m0.r.t.a.r.c.h0 r7 = r7.r()
            boolean r2 = r7 instanceof m0.r.t.a.r.e.a.v.a
            if (r2 != 0) goto L_0x0088
            r7 = r1
        L_0x0088:
            m0.r.t.a.r.e.a.v.a r7 = (m0.r.t.a.r.e.a.v.a) r7
            if (r7 == 0) goto L_0x0091
            m0.r.t.a.r.e.a.w.l r7 = r7.b()
            goto L_0x0092
        L_0x0091:
            r7 = r1
        L_0x0092:
            boolean r2 = r7 instanceof m0.r.t.a.r.c.v0.b.q
            if (r2 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = r7
        L_0x0098:
            m0.r.t.a.r.c.v0.b.q r1 = (m0.r.t.a.r.c.v0.b.q) r1
            if (r1 == 0) goto L_0x00a6
            java.lang.reflect.Method r7 = r1.a
            if (r7 == 0) goto L_0x00a6
            kotlin.reflect.jvm.internal.JvmFunctionSignature$a r0 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$a
            r0.<init>(r7)
            return r0
        L_0x00a6:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x00bd:
            boolean r7 = r0 instanceof m0.r.t.a.r.e.a.t.c
            r2 = 41
            java.lang.String r3 = " ("
            if (r7 == 0) goto L_0x011d
            r7 = r0
            m0.r.t.a.r.e.a.t.c r7 = (m0.r.t.a.r.e.a.t.c) r7
            m0.r.t.a.r.c.h0 r7 = r7.r()
            boolean r4 = r7 instanceof m0.r.t.a.r.e.a.v.a
            if (r4 != 0) goto L_0x00d1
            r7 = r1
        L_0x00d1:
            m0.r.t.a.r.e.a.v.a r7 = (m0.r.t.a.r.e.a.v.a) r7
            if (r7 == 0) goto L_0x00d9
            m0.r.t.a.r.e.a.w.l r1 = r7.b()
        L_0x00d9:
            boolean r7 = r1 instanceof m0.r.t.a.r.c.v0.b.k
            if (r7 == 0) goto L_0x00e7
            kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor r7 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor
            m0.r.t.a.r.c.v0.b.k r1 = (m0.r.t.a.r.c.v0.b.k) r1
            java.lang.reflect.Constructor<?> r0 = r1.a
            r7.<init>(r0)
            goto L_0x00fc
        L_0x00e7:
            boolean r7 = r1 instanceof m0.r.t.a.r.c.v0.b.h
            if (r7 == 0) goto L_0x00fd
            r7 = r1
            m0.r.t.a.r.c.v0.b.h r7 = (m0.r.t.a.r.c.v0.b.h) r7
            boolean r4 = r7.q()
            if (r4 == 0) goto L_0x00fd
            kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor r0 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor
            java.lang.Class<?> r7 = r7.a
            r0.<init>(r7)
            r7 = r0
        L_0x00fc:
            return r7
        L_0x00fd:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r7.<init>(r0)
            throw r7
        L_0x011d:
            m0.r.t.a.r.g.d r7 = r0.getName()
            m0.r.t.a.r.g.d r1 = m0.r.t.a.r.b.g.c
            boolean r7 = r7.equals(r1)
            r1 = 0
            r4 = 1
            if (r7 == 0) goto L_0x0133
            boolean r7 = i0.j.f.p.h.g2(r0)
            if (r7 == 0) goto L_0x0133
            r7 = r4
            goto L_0x0134
        L_0x0133:
            r7 = r1
        L_0x0134:
            if (r7 != 0) goto L_0x0166
            m0.r.t.a.r.g.d r7 = r0.getName()
            m0.r.t.a.r.g.d r5 = m0.r.t.a.r.b.g.b
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x014a
            boolean r7 = i0.j.f.p.h.g2(r0)
            if (r7 == 0) goto L_0x014a
            r7 = r4
            goto L_0x014b
        L_0x014a:
            r7 = r1
        L_0x014b:
            if (r7 == 0) goto L_0x014e
            goto L_0x0166
        L_0x014e:
            m0.r.t.a.r.g.d r7 = r0.getName()
            m0.r.t.a.r.b.k.a r5 = m0.r.t.a.r.b.k.a.e
            m0.r.t.a.r.g.d r5 = m0.r.t.a.r.b.k.a.f
            boolean r7 = m0.n.b.i.a(r7, r5)
            if (r7 == 0) goto L_0x0167
            java.util.List r7 = r0.h()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0167
        L_0x0166:
            r1 = r4
        L_0x0167:
            if (r1 == 0) goto L_0x016e
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = b(r0)
            return r7
        L_0x016e:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.n.d(m0.r.t.a.r.c.r):kotlin.reflect.jvm.internal.JvmFunctionSignature");
    }
}
