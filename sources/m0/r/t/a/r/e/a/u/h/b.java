package m0.r.t.a.r.e.a.u.h;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.u.f;
import m0.r.t.a.r.e.a.w.j;
import m0.r.t.a.r.e.a.w.u;
import m0.r.t.a.r.e.a.w.w;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: JavaTypeResolver.kt */
public final class b {
    public final c a;
    public final f b;

    public b(c cVar, f fVar) {
        i.e(cVar, "c");
        i.e(fVar, "typeParameterResolver");
        this.a = cVar;
        this.b = fVar;
    }

    public static final a0 d(j jVar) {
        a0 d = p.d(i.k("Unresolved java class ", jVar.o()));
        i.d(d, "createErrorType(\"Unresolved java class ${javaType.presentableText}\")");
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ed, code lost:
        if ((!r10.isEmpty()) != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0133, code lost:
        if (r5 == false) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0247  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.m.a0 a(m0.r.t.a.r.e.a.w.j r17, m0.r.t.a.r.e.a.u.h.a r18, m0.r.t.a.r.m.a0 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = 0
            if (r2 != 0) goto L_0x000b
            r4 = r3
            goto L_0x000f
        L_0x000b:
            m0.r.t.a.r.c.r0.f r4 = r19.getAnnotations()
        L_0x000f:
            r5 = 4
            r6 = 0
            if (r4 != 0) goto L_0x001d
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations
            m0.r.t.a.r.e.a.u.c r7 = r0.a
            r8 = r17
            r4.<init>(r7, r8, r6, r5)
            goto L_0x001f
        L_0x001d:
            r8 = r17
        L_0x001f:
            m0.r.t.a.r.e.a.w.i r7 = r17.c()
            r9 = 1
            if (r7 != 0) goto L_0x002c
            m0.r.t.a.r.m.j0 r5 = r16.b(r17)
            goto L_0x019b
        L_0x002c:
            boolean r10 = r7 instanceof m0.r.t.a.r.e.a.w.g
            if (r10 == 0) goto L_0x0187
            r10 = r7
            m0.r.t.a.r.e.a.w.g r10 = (m0.r.t.a.r.e.a.w.g) r10
            m0.r.t.a.r.g.b r11 = r10.d()
            if (r11 == 0) goto L_0x017b
            boolean r7 = r1.c
            if (r7 == 0) goto L_0x009e
            m0.r.t.a.r.g.b r7 = m0.r.t.a.r.e.a.u.h.c.a
            boolean r7 = m0.n.b.i.a(r11, r7)
            if (r7 == 0) goto L_0x009e
            m0.r.t.a.r.e.a.u.c r5 = r0.a
            m0.r.t.a.r.e.a.u.a r5 = r5.a
            kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes r5 = r5.p
            kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$a r7 = r5.e
            m0.r.k<java.lang.Object>[] r11 = kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.b
            r11 = r11[r9]
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "types"
            m0.n.b.i.e(r5, r7)
            java.lang.String r7 = "property"
            m0.n.b.i.e(r11, r7)
            java.lang.String r7 = r11.getName()
            java.lang.String r7 = kotlin.text.StringsKt__IndentKt.a(r7)
            m0.r.t.a.r.g.d r7 = m0.r.t.a.r.g.d.g(r7)
            java.lang.String r11 = "identifier(className)"
            m0.n.b.i.d(r7, r11)
            m0.c r11 = r5.d
            java.lang.Object r11 = r11.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r11 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) r11
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r12 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION
            m0.r.t.a.r.c.f r11 = r11.f(r7, r12)
            boolean r12 = r11 instanceof m0.r.t.a.r.c.d
            if (r12 == 0) goto L_0x0084
            m0.r.t.a.r.c.d r11 = (m0.r.t.a.r.c.d) r11
            goto L_0x0085
        L_0x0084:
            r11 = r3
        L_0x0085:
            if (r11 != 0) goto L_0x0160
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r5 = r5.c
            m0.r.t.a.r.g.a r11 = new m0.r.t.a.r.g.a
            m0.r.t.a.r.g.b r12 = m0.r.t.a.r.b.g.i
            r11.<init>(r12, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.util.List r7 = i0.j.f.p.h.L2(r7)
            m0.r.t.a.r.c.d r11 = r5.a(r11, r7)
            goto L_0x0160
        L_0x009e:
            m0.r.t.a.r.b.k.d r7 = m0.r.t.a.r.b.k.d.a
            m0.r.t.a.r.e.a.u.c r12 = r0.a
            m0.r.t.a.r.e.a.u.a r12 = r12.a
            m0.r.t.a.r.c.u r12 = r12.o
            m0.r.t.a.r.b.f r12 = r12.m()
            m0.r.t.a.r.c.d r11 = m0.r.t.a.r.b.k.d.d(r7, r11, r12, r3, r5)
            if (r11 != 0) goto L_0x00b3
            r11 = r3
            goto L_0x0160
        L_0x00b3:
            boolean r5 = r7.c(r11)
            if (r5 == 0) goto L_0x0160
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r5 = r1.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r12 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            if (r5 == r12) goto L_0x015c
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r5 = r1.a
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r12 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE
            if (r5 == r12) goto L_0x015c
            java.util.List r5 = r17.E()
            java.lang.Object r5 = m0.j.g.I(r5)
            m0.r.t.a.r.e.a.w.w r5 = (m0.r.t.a.r.e.a.w.w) r5
            boolean r12 = r5 instanceof m0.r.t.a.r.e.a.w.a0
            if (r12 == 0) goto L_0x00d6
            m0.r.t.a.r.e.a.w.a0 r5 = (m0.r.t.a.r.e.a.w.a0) r5
            goto L_0x00d7
        L_0x00d6:
            r5 = r3
        L_0x00d7:
            if (r5 != 0) goto L_0x00da
            goto L_0x00e8
        L_0x00da:
            m0.r.t.a.r.e.a.w.w r12 = r5.A()
            if (r12 == 0) goto L_0x00e8
            boolean r5 = r5.I()
            if (r5 != 0) goto L_0x00e8
            r5 = r9
            goto L_0x00e9
        L_0x00e8:
            r5 = r6
        L_0x00e9:
            if (r5 != 0) goto L_0x00ec
            goto L_0x0132
        L_0x00ec:
            java.lang.String r5 = "readOnly"
            m0.n.b.i.e(r11, r5)
            m0.r.t.a.r.g.c r5 = m0.r.t.a.r.j.d.g(r11)
            m0.r.t.a.r.b.k.c r12 = m0.r.t.a.r.b.k.c.a
            java.util.HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.b> r12 = m0.r.t.a.r.b.k.c.l
            java.lang.Object r5 = r12.get(r5)
            m0.r.t.a.r.g.b r5 = (m0.r.t.a.r.g.b) r5
            if (r5 == 0) goto L_0x0136
            m0.r.t.a.r.b.f r12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r11)
            m0.r.t.a.r.c.d r5 = r12.j(r5)
            java.lang.String r12 = "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)"
            m0.n.b.i.d(r5, r12)
            m0.r.t.a.r.m.j0 r5 = r5.i()
            java.util.List r5 = r5.getParameters()
            java.lang.String r12 = "JavaToKotlinClassMapper.convertReadOnlyToMutable(readOnlyContainer)\n            .typeConstructor.parameters"
            m0.n.b.i.d(r5, r12)
            java.lang.Object r5 = m0.j.g.I(r5)
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            if (r5 != 0) goto L_0x0125
            r5 = r3
            goto L_0x0129
        L_0x0125:
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r5.l()
        L_0x0129:
            if (r5 != 0) goto L_0x012c
            goto L_0x0132
        L_0x012c:
            kotlin.reflect.jvm.internal.impl.types.Variance r12 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r5 == r12) goto L_0x0132
            r5 = r9
            goto L_0x0133
        L_0x0132:
            r5 = r6
        L_0x0133:
            if (r5 == 0) goto L_0x0160
            goto L_0x015c
        L_0x0136:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Given class "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " is not a "
            r2.append(r3)
            java.lang.String r3 = "read-only"
            r2.append(r3)
            java.lang.String r3 = " collection"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x015c:
            m0.r.t.a.r.c.d r11 = r7.a(r11)
        L_0x0160:
            if (r11 != 0) goto L_0x016c
            m0.r.t.a.r.e.a.u.c r5 = r0.a
            m0.r.t.a.r.e.a.u.a r5 = r5.a
            m0.r.t.a.r.e.a.u.d r5 = r5.k
            m0.r.t.a.r.c.d r11 = r5.a(r10)
        L_0x016c:
            if (r11 != 0) goto L_0x0170
            r5 = r3
            goto L_0x0174
        L_0x0170:
            m0.r.t.a.r.m.j0 r5 = r11.i()
        L_0x0174:
            if (r5 != 0) goto L_0x019b
            m0.r.t.a.r.m.j0 r5 = r16.b(r17)
            goto L_0x019b
        L_0x017b:
            java.lang.String r1 = "Class type should have a FQ name: "
            java.lang.String r1 = m0.n.b.i.k(r1, r7)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L_0x0187:
            boolean r5 = r7 instanceof m0.r.t.a.r.e.a.w.x
            if (r5 == 0) goto L_0x032c
            m0.r.t.a.r.e.a.u.f r5 = r0.b
            m0.r.t.a.r.e.a.w.x r7 = (m0.r.t.a.r.e.a.w.x) r7
            m0.r.t.a.r.c.m0 r5 = r5.a(r7)
            if (r5 != 0) goto L_0x0197
            r5 = r3
            goto L_0x019b
        L_0x0197:
            m0.r.t.a.r.m.j0 r5 = r5.i()
        L_0x019b:
            if (r5 != 0) goto L_0x019e
            return r3
        L_0x019e:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r7 = r1.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r10 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            if (r7 != r10) goto L_0x01a6
            r11 = r6
            goto L_0x01b4
        L_0x01a6:
            boolean r7 = r1.c
            if (r7 != 0) goto L_0x01b2
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r7 = r1.a
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r10 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE
            if (r7 == r10) goto L_0x01b2
            r7 = r9
            goto L_0x01b3
        L_0x01b2:
            r7 = r6
        L_0x01b3:
            r11 = r7
        L_0x01b4:
            if (r2 != 0) goto L_0x01b8
            r7 = r3
            goto L_0x01bc
        L_0x01b8:
            m0.r.t.a.r.m.j0 r7 = r19.I0()
        L_0x01bc:
            boolean r7 = m0.n.b.i.a(r7, r5)
            if (r7 == 0) goto L_0x01cf
            boolean r7 = r17.v()
            if (r7 != 0) goto L_0x01cf
            if (r11 == 0) goto L_0x01cf
            m0.r.t.a.r.m.a0 r1 = r2.M0(r9)
            return r1
        L_0x01cf:
            boolean r2 = r17.v()
            java.lang.String r7 = "constructor.parameters"
            if (r2 != 0) goto L_0x01f2
            java.util.List r10 = r17.E()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x01f0
            java.util.List r10 = r5.getParameters()
            m0.n.b.i.d(r10, r7)
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r9
            if (r10 == 0) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r10 = r6
            goto L_0x01f3
        L_0x01f2:
            r10 = r9
        L_0x01f3:
            java.util.List r12 = r5.getParameters()
            m0.n.b.i.d(r12, r7)
            java.lang.String r7 = "parameter"
            r13 = 10
            if (r10 == 0) goto L_0x0247
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = i0.j.f.p.h.K(r12, r13)
            r3.<init>(r6)
            java.util.Iterator r6 = r12.iterator()
        L_0x020d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0240
            java.lang.Object r8 = r6.next()
            m0.r.t.a.r.c.m0 r8 = (m0.r.t.a.r.c.m0) r8
            m0.r.t.a.r.m.w r9 = new m0.r.t.a.r.m.w
            m0.r.t.a.r.e.a.u.c r10 = r0.a
            m0.r.t.a.r.e.a.u.a r10 = r10.a
            m0.r.t.a.r.l.l r10 = r10.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$1$erasedUpperBound$1 r12 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$1$erasedUpperBound$1
            r12.<init>(r8, r1, r5)
            r9.<init>(r10, r12)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution r10 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.b
            m0.n.b.i.d(r8, r7)
            if (r2 == 0) goto L_0x0232
            r12 = r1
            goto L_0x0238
        L_0x0232:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r12 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE
            m0.r.t.a.r.e.a.u.h.a r12 = r1.a(r12)
        L_0x0238:
            m0.r.t.a.r.m.m0 r8 = r10.h(r8, r12, r9)
            r3.add(r8)
            goto L_0x020d
        L_0x0240:
            java.util.List r1 = m0.j.g.v0(r3)
        L_0x0244:
            r10 = r1
            goto L_0x0320
        L_0x0247:
            int r1 = r12.size()
            java.util.List r2 = r17.E()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0288
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = i0.j.f.p.h.K(r12, r13)
            r1.<init>(r2)
            java.util.Iterator r2 = r12.iterator()
        L_0x0262:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0283
            java.lang.Object r3 = r2.next()
            m0.r.t.a.r.c.m0 r3 = (m0.r.t.a.r.c.m0) r3
            m0.r.t.a.r.m.o0 r6 = new m0.r.t.a.r.m.o0
            m0.r.t.a.r.g.d r3 = r3.getName()
            java.lang.String r3 = r3.b()
            m0.r.t.a.r.m.a0 r3 = m0.r.t.a.r.m.p.d(r3)
            r6.<init>(r3)
            r1.add(r6)
            goto L_0x0262
        L_0x0283:
            java.util.List r1 = m0.j.g.v0(r1)
            goto L_0x0244
        L_0x0288:
            java.util.List r1 = r17.E()
            java.lang.Iterable r1 = m0.j.g.E0(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r8 = i0.j.f.p.h.K(r1, r13)
            r2.<init>(r8)
            m0.j.m r1 = (m0.j.m) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x029f:
            r8 = r1
            m0.j.n r8 = (m0.j.n) r8
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x031a
            java.lang.Object r8 = r8.next()
            m0.j.l r8 = (m0.j.l) r8
            int r10 = r8.a
            T r8 = r8.b
            m0.r.t.a.r.e.a.w.w r8 = (m0.r.t.a.r.e.a.w.w) r8
            r12.size()
            java.lang.Object r10 = r12.get(r10)
            m0.r.t.a.r.c.m0 r10 = (m0.r.t.a.r.c.m0) r10
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r13 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r14 = 3
            m0.r.t.a.r.e.a.u.h.a r15 = m0.r.t.a.r.e.a.u.h.c.c(r13, r6, r3, r14)
            m0.n.b.i.d(r10, r7)
            boolean r9 = r8 instanceof m0.r.t.a.r.e.a.w.a0
            if (r9 == 0) goto L_0x0309
            m0.r.t.a.r.e.a.w.a0 r8 = (m0.r.t.a.r.e.a.w.a0) r8
            m0.r.t.a.r.e.a.w.w r9 = r8.A()
            boolean r8 = r8.I()
            if (r8 == 0) goto L_0x02da
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x02dc
        L_0x02da:
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L_0x02dc:
            if (r9 == 0) goto L_0x0304
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r10.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r3 != r6) goto L_0x02e7
            goto L_0x02ef
        L_0x02e7:
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r10.l()
            if (r8 == r3) goto L_0x02ef
            r3 = 1
            goto L_0x02f0
        L_0x02ef:
            r3 = 0
        L_0x02f0:
            if (r3 == 0) goto L_0x02f5
            r3 = 0
            r6 = 0
            goto L_0x0304
        L_0x02f5:
            r3 = 0
            r6 = 0
            m0.r.t.a.r.e.a.u.h.a r13 = m0.r.t.a.r.e.a.u.h.c.c(r13, r6, r3, r14)
            m0.r.t.a.r.m.v r9 = r0.e(r9, r13)
            m0.r.t.a.r.m.m0 r8 = m0.r.t.a.r.m.a1.a.Q0(r9, r8, r10)
            goto L_0x0315
        L_0x0304:
            m0.r.t.a.r.m.m0 r8 = m0.r.t.a.r.e.a.u.h.c.b(r10, r15)
            goto L_0x0315
        L_0x0309:
            m0.r.t.a.r.m.o0 r9 = new m0.r.t.a.r.m.o0
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            m0.r.t.a.r.m.v r8 = r0.e(r8, r15)
            r9.<init>(r10, r8)
            r8 = r9
        L_0x0315:
            r2.add(r8)
            r9 = 1
            goto L_0x029f
        L_0x031a:
            java.util.List r1 = m0.j.g.v0(r2)
            goto L_0x0244
        L_0x0320:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            r12 = 0
            r13 = 16
            r8 = r4
            r9 = r5
            m0.r.t.a.r.m.a0 r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x032c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unknown classifier kind: "
            java.lang.String r2 = m0.n.b.i.k(r2, r7)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.a.u.h.b.a(m0.r.t.a.r.e.a.w.j, m0.r.t.a.r.e.a.u.h.a, m0.r.t.a.r.m.a0):m0.r.t.a.r.m.a0");
    }

    public final j0 b(j jVar) {
        a l = a.l(new m0.r.t.a.r.g.b(jVar.w()));
        i.d(l, "topLevel(FqName(javaType.classifierQualifiedName))");
        j0 i = this.a.a.d.c().l.a(l, h.L2(0)).i();
        i.d(i, "c.components.deserializedDescriptorResolver.components.notFoundClasses.getClass(classId, listOf(0)).typeConstructor");
        return i;
    }

    public final v c(m0.r.t.a.r.e.a.w.f fVar, a aVar, boolean z) {
        i.e(fVar, "arrayType");
        i.e(aVar, "attr");
        w n = fVar.n();
        u uVar = n instanceof u ? (u) n : null;
        PrimitiveType type = uVar == null ? null : uVar.getType();
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.a, fVar, true);
        if (type != null) {
            a0 r = this.a.a.o.m().r(type);
            i.d(r, "c.module.builtIns.getPrimitiveArrayKotlinType(primitiveType)");
            r.Q0(m0.r.t.a.r.c.r0.f.i.a(g.X(lazyJavaAnnotations, r.getAnnotations())));
            if (aVar.c) {
                return r;
            }
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            return KotlinTypeFactory.c(r, r.M0(true));
        }
        v e = e(n, c.c(TypeUsage.COMMON, aVar.c, (m0) null, 2));
        if (aVar.c) {
            a0 i = this.a.a.o.m().i(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, e, lazyJavaAnnotations);
            i.d(i, "c.module.builtIns.getArrayType(projectionKind, componentType, annotations)");
            return i;
        }
        KotlinTypeFactory kotlinTypeFactory2 = KotlinTypeFactory.a;
        a0 i2 = this.a.a.o.m().i(Variance.INVARIANT, e, lazyJavaAnnotations);
        i.d(i2, "c.module.builtIns.getArrayType(INVARIANT, componentType, annotations)");
        return KotlinTypeFactory.c(i2, this.a.a.o.m().i(Variance.OUT_VARIANCE, e, lazyJavaAnnotations).M0(true));
    }

    public final v e(w wVar, a aVar) {
        a0 a0Var;
        i.e(aVar, "attr");
        if (wVar instanceof u) {
            PrimitiveType type = ((u) wVar).getType();
            if (type != null) {
                a0Var = this.a.a.o.m().t(type);
            } else {
                a0Var = this.a.a.o.m().x();
            }
            i.d(a0Var, "{\n                val primitiveType = javaType.type\n                if (primitiveType != null) c.module.builtIns.getPrimitiveKotlinType(primitiveType)\n                else c.module.builtIns.unitType\n            }");
            return a0Var;
        }
        boolean z = false;
        if (wVar instanceof j) {
            j jVar = (j) wVar;
            if (!aVar.c && aVar.a != TypeUsage.SUPERTYPE) {
                z = true;
            }
            boolean v = jVar.v();
            if (v || z) {
                a0 a2 = a(jVar, aVar.a(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), (a0) null);
                if (a2 == null) {
                    return d(jVar);
                }
                a0 a3 = a(jVar, aVar.a(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), a2);
                if (a3 == null) {
                    return d(jVar);
                }
                if (v) {
                    return new RawTypeImpl(a2, a3);
                }
                KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
                return KotlinTypeFactory.c(a2, a3);
            }
            a0 a4 = a(jVar, aVar, (a0) null);
            if (a4 == null) {
                a4 = d(jVar);
            }
            return a4;
        } else if (wVar instanceof m0.r.t.a.r.e.a.w.f) {
            return c((m0.r.t.a.r.e.a.w.f) wVar, aVar, false);
        } else {
            if (wVar instanceof m0.r.t.a.r.e.a.w.a0) {
                w A = ((m0.r.t.a.r.e.a.w.a0) wVar).A();
                v e = A == null ? null : e(A, aVar);
                if (e != null) {
                    return e;
                }
                a0 m = this.a.a.o.m().m();
                i.d(m, "c.module.builtIns.defaultBound");
                return m;
            } else if (wVar == null) {
                a0 m2 = this.a.a.o.m().m();
                i.d(m2, "c.module.builtIns.defaultBound");
                return m2;
            } else {
                throw new UnsupportedOperationException(i.k("Unsupported type: ", wVar));
            }
        }
    }
}
