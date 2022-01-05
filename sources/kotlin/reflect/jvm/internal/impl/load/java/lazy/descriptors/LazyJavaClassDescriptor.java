package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.q0;
import m0.r.t.a.r.c.t0.h;
import m0.r.t.a.r.e.a.m;
import m0.r.t.a.r.e.a.s.d;
import m0.r.t.a.r.e.a.t.d;
import m0.r.t.a.r.e.a.u.a;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.j;
import m0.r.t.a.r.j.u.f;
import m0.r.t.a.r.m.b;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor extends h implements d {
    public final c a2;
    public final g b2;
    public final m0.r.t.a.r.c.d c2;
    public final c d2;
    public final ClassKind e2;
    public final Modality f2;
    public final q0 g2;
    public final boolean h2;
    public final LazyJavaClassTypeConstructor i2;
    public final LazyJavaClassMemberScope j2;
    public final ScopesHolderForClass<LazyJavaClassMemberScope> k2;
    public final f l2;
    public final LazyJavaStaticClassScope m2;
    public final m0.r.t.a.r.c.r0.f n2;
    public final m0.r.t.a.r.l.h<List<m0>> o2;

    /* compiled from: LazyJavaClassDescriptor.kt */
    public final class LazyJavaClassTypeConstructor extends b {
        public final m0.r.t.a.r.l.h<List<m0>> c;
        public final /* synthetic */ LazyJavaClassDescriptor d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LazyJavaClassTypeConstructor(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            super(lazyJavaClassDescriptor.d2.a.a);
            i.e(lazyJavaClassDescriptor, "this$0");
            this.d = lazyJavaClassDescriptor;
            this.c = lazyJavaClassDescriptor.d2.a.a.d(new LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1(lazyJavaClassDescriptor));
        }

        public m0.r.t.a.r.c.f c() {
            return this.d;
        }

        public boolean d() {
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
            if ((!r8.d() && r8.i(m0.r.t.a.r.b.g.k)) != false) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
            if (r9 == null) goto L_0x019e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0230  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x024f  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0284  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0289  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.Collection<m0.r.t.a.r.m.v> g() {
            /*
                r22 = this;
                r0 = r22
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.d
                m0.r.t.a.r.e.a.w.g r1 = r1.b2
                java.util.Collection r1 = r1.b()
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r1.size()
                r2.<init>(r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 0
                r3.<init>(r4)
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r5 = r0.d
                m0.r.t.a.r.c.r0.f r5 = r5.n2
                m0.r.t.a.r.g.b r6 = m0.r.t.a.r.e.a.q.n
                java.lang.String r7 = "PURELY_IMPLEMENTS_ANNOTATION"
                m0.n.b.i.d(r6, r7)
                m0.r.t.a.r.c.r0.c r5 = r5.f(r6)
                r6 = 1
                r7 = 0
                if (r5 != 0) goto L_0x002e
                goto L_0x0089
            L_0x002e:
                java.util.Map r5 = r5.a()
                java.util.Collection r5 = r5.values()
                java.lang.Object r5 = m0.j.g.k0(r5)
                boolean r8 = r5 instanceof m0.r.t.a.r.j.p.s
                if (r8 == 0) goto L_0x0041
                m0.r.t.a.r.j.p.s r5 = (m0.r.t.a.r.j.p.s) r5
                goto L_0x0042
            L_0x0041:
                r5 = r7
            L_0x0042:
                if (r5 != 0) goto L_0x0046
                r5 = r7
                goto L_0x004a
            L_0x0046:
                T r5 = r5.a
                java.lang.String r5 = (java.lang.String) r5
            L_0x004a:
                if (r5 != 0) goto L_0x004d
                goto L_0x0089
            L_0x004d:
                kotlin.reflect.jvm.internal.impl.name.State r8 = kotlin.reflect.jvm.internal.impl.name.State.BEGINNING
                r9 = r4
            L_0x0050:
                int r10 = r5.length()
                if (r9 >= r10) goto L_0x0080
                char r10 = r5.charAt(r9)
                int r9 = r9 + 1
                int r11 = r8.ordinal()
                if (r11 == 0) goto L_0x0076
                if (r11 == r6) goto L_0x0068
                r12 = 2
                if (r11 == r12) goto L_0x0076
                goto L_0x0050
            L_0x0068:
                r11 = 46
                if (r10 != r11) goto L_0x006f
                kotlin.reflect.jvm.internal.impl.name.State r8 = kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT
                goto L_0x0050
            L_0x006f:
                boolean r10 = java.lang.Character.isJavaIdentifierPart(r10)
                if (r10 != 0) goto L_0x0050
                goto L_0x0086
            L_0x0076:
                boolean r8 = java.lang.Character.isJavaIdentifierPart(r10)
                if (r8 != 0) goto L_0x007d
                goto L_0x0086
            L_0x007d:
                kotlin.reflect.jvm.internal.impl.name.State r8 = kotlin.reflect.jvm.internal.impl.name.State.MIDDLE
                goto L_0x0050
            L_0x0080:
                kotlin.reflect.jvm.internal.impl.name.State r9 = kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT
                if (r8 == r9) goto L_0x0086
                r8 = r6
                goto L_0x0087
            L_0x0086:
                r8 = r4
            L_0x0087:
                if (r8 != 0) goto L_0x008b
            L_0x0089:
                r8 = r7
                goto L_0x0090
            L_0x008b:
                m0.r.t.a.r.g.b r8 = new m0.r.t.a.r.g.b
                r8.<init>((java.lang.String) r5)
            L_0x0090:
                if (r8 != 0) goto L_0x0093
                goto L_0x00a7
            L_0x0093:
                boolean r5 = r8.d()
                if (r5 != 0) goto L_0x00a3
                m0.r.t.a.r.g.d r5 = m0.r.t.a.r.b.g.k
                boolean r5 = r8.i(r5)
                if (r5 == 0) goto L_0x00a3
                r5 = r6
                goto L_0x00a4
            L_0x00a3:
                r5 = r4
            L_0x00a4:
                if (r5 == 0) goto L_0x00a7
                goto L_0x00a8
            L_0x00a7:
                r8 = r7
            L_0x00a8:
                r5 = 10
                if (r8 != 0) goto L_0x00c5
                m0.r.t.a.r.e.a.g r9 = m0.r.t.a.r.e.a.g.a
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r9 = r0.d
                m0.r.t.a.r.g.b r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r9)
                java.lang.String r10 = "classFqName"
                m0.n.b.i.e(r9, r10)
                java.util.HashMap<m0.r.t.a.r.g.b, m0.r.t.a.r.g.b> r10 = m0.r.t.a.r.e.a.g.b
                java.lang.Object r9 = r10.get(r9)
                m0.r.t.a.r.g.b r9 = (m0.r.t.a.r.g.b) r9
                if (r9 != 0) goto L_0x00c6
                goto L_0x019e
            L_0x00c5:
                r9 = r8
            L_0x00c6:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r10 = r0.d
                m0.r.t.a.r.e.a.u.c r10 = r10.d2
                m0.r.t.a.r.e.a.u.a r10 = r10.a
                m0.r.t.a.r.c.u r10 = r10.o
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r11 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER
                int r12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.a
                java.lang.String r12 = "<this>"
                m0.n.b.i.e(r10, r12)
                java.lang.String r12 = "topLevelClassFqName"
                m0.n.b.i.e(r9, r12)
                java.lang.String r12 = "location"
                m0.n.b.i.e(r11, r12)
                r9.d()
                m0.r.t.a.r.g.b r12 = r9.e()
                java.lang.String r13 = "topLevelClassFqName.parent()"
                m0.n.b.i.d(r12, r13)
                m0.r.t.a.r.c.y r10 = r10.M(r12)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r10 = r10.o()
                m0.r.t.a.r.g.d r9 = r9.g()
                java.lang.String r12 = "topLevelClassFqName.shortName()"
                m0.n.b.i.d(r9, r12)
                m0.r.t.a.r.c.f r9 = r10.f(r9, r11)
                boolean r10 = r9 instanceof m0.r.t.a.r.c.d
                if (r10 == 0) goto L_0x0109
                m0.r.t.a.r.c.d r9 = (m0.r.t.a.r.c.d) r9
                goto L_0x010a
            L_0x0109:
                r9 = r7
            L_0x010a:
                if (r9 != 0) goto L_0x010e
                goto L_0x019e
            L_0x010e:
                m0.r.t.a.r.m.j0 r10 = r9.i()
                java.util.List r10 = r10.getParameters()
                int r10 = r10.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r11 = r0.d
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor r11 = r11.i2
                java.util.List r11 = r11.getParameters()
                java.lang.String r12 = "getTypeConstructor().parameters"
                m0.n.b.i.d(r11, r12)
                int r12 = r11.size()
                if (r12 != r10) goto L_0x0155
                java.util.ArrayList r8 = new java.util.ArrayList
                int r10 = i0.j.f.p.h.K(r11, r5)
                r8.<init>(r10)
                java.util.Iterator r10 = r11.iterator()
            L_0x013a:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x0190
                java.lang.Object r11 = r10.next()
                m0.r.t.a.r.c.m0 r11 = (m0.r.t.a.r.c.m0) r11
                m0.r.t.a.r.m.o0 r12 = new m0.r.t.a.r.m.o0
                kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                m0.r.t.a.r.m.a0 r11 = r11.q()
                r12.<init>(r13, r11)
                r8.add(r12)
                goto L_0x013a
            L_0x0155:
                if (r12 != r6) goto L_0x019e
                if (r10 <= r6) goto L_0x019e
                if (r8 != 0) goto L_0x019e
                m0.r.t.a.r.m.o0 r8 = new m0.r.t.a.r.m.o0
                kotlin.reflect.jvm.internal.impl.types.Variance r12 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                java.lang.Object r11 = m0.j.g.j0(r11)
                m0.r.t.a.r.c.m0 r11 = (m0.r.t.a.r.c.m0) r11
                m0.r.t.a.r.m.a0 r11 = r11.q()
                r8.<init>(r12, r11)
                m0.q.e r11 = new m0.q.e
                r11.<init>(r6, r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                int r12 = i0.j.f.p.h.K(r11, r5)
                r10.<init>(r12)
                java.util.Iterator r11 = r11.iterator()
            L_0x017e:
                r12 = r11
                m0.q.d r12 = (m0.q.d) r12
                boolean r12 = r12.d
                if (r12 == 0) goto L_0x018f
                r12 = r11
                m0.j.o r12 = (m0.j.o) r12
                r12.a()
                r10.add(r8)
                goto L_0x017e
            L_0x018f:
                r8 = r10
            L_0x0190:
                kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r10 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
                m0.r.t.a.r.c.r0.f$a r10 = m0.r.t.a.r.c.r0.f.i
                java.util.Objects.requireNonNull(r10)
                m0.r.t.a.r.c.r0.f r10 = m0.r.t.a.r.c.r0.f.a.b
                m0.r.t.a.r.m.a0 r8 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.e(r10, r9, r8)
                goto L_0x019f
            L_0x019e:
                r8 = r7
            L_0x019f:
                java.util.Iterator r1 = r1.iterator()
            L_0x01a3:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0229
                java.lang.Object r9 = r1.next()
                m0.r.t.a.r.e.a.w.j r9 = (m0.r.t.a.r.e.a.w.j) r9
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r10 = r0.d
                m0.r.t.a.r.e.a.u.c r10 = r10.d2
                m0.r.t.a.r.e.a.u.h.b r10 = r10.e
                kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r11 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE
                r12 = 3
                m0.r.t.a.r.e.a.u.h.a r11 = m0.r.t.a.r.e.a.u.h.c.c(r11, r4, r7, r12)
                m0.r.t.a.r.m.v r15 = r10.e(r9, r11)
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r10 = r0.d
                m0.r.t.a.r.e.a.u.c r10 = r10.d2
                m0.r.t.a.r.e.a.u.a r10 = r10.a
                m0.r.t.a.r.e.a.u.b r10 = r10.t
                boolean r10 = r10.b()
                if (r10 == 0) goto L_0x01fc
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r10 = r0.d
                m0.r.t.a.r.e.a.u.c r10 = r10.d2
                m0.r.t.a.r.e.a.u.a r11 = r10.a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r13 = r11.r
                java.util.Objects.requireNonNull(r13)
                java.lang.String r11 = "type"
                m0.n.b.i.e(r15, r11)
                java.lang.String r11 = "context"
                m0.n.b.i.e(r10, r11)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts
                kotlin.collections.EmptyList r16 = kotlin.collections.EmptyList.c
                r17 = 0
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r19 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
                r20 = 0
                r21 = 64
                r14 = 0
                r12 = r11
                r18 = r10
                r12.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r10 = r11.b(r7)
                m0.r.t.a.r.m.v r15 = r10.a
            L_0x01fc:
                m0.r.t.a.r.m.j0 r10 = r15.I0()
                m0.r.t.a.r.c.f r10 = r10.c()
                boolean r10 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.b
                if (r10 == 0) goto L_0x020b
                r3.add(r9)
            L_0x020b:
                m0.r.t.a.r.m.j0 r9 = r15.I0()
                if (r8 != 0) goto L_0x0213
                r10 = r7
                goto L_0x0217
            L_0x0213:
                m0.r.t.a.r.m.j0 r10 = r8.I0()
            L_0x0217:
                boolean r9 = m0.n.b.i.a(r9, r10)
                if (r9 == 0) goto L_0x021e
                goto L_0x01a3
            L_0x021e:
                boolean r9 = m0.r.t.a.r.b.f.y(r15)
                if (r9 != 0) goto L_0x01a3
                r2.add(r15)
                goto L_0x01a3
            L_0x0229:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.d
                m0.r.t.a.r.c.d r4 = r1.c2
                if (r4 != 0) goto L_0x0230
                goto L_0x0242
            L_0x0230:
                m0.r.t.a.r.m.l0 r1 = i0.j.f.p.h.q0(r4, r1)
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r1 = r1.c()
                m0.r.t.a.r.m.a0 r4 = r4.q()
                kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                m0.r.t.a.r.m.v r7 = r1.k(r4, r7)
            L_0x0242:
                m0.r.t.a.r.m.a1.a.N(r2, r7)
                m0.r.t.a.r.m.a1.a.N(r2, r8)
                boolean r1 = r3.isEmpty()
                r1 = r1 ^ r6
                if (r1 == 0) goto L_0x027d
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.d
                m0.r.t.a.r.e.a.u.c r4 = r1.d2
                m0.r.t.a.r.e.a.u.a r4 = r4.a
                m0.r.t.a.r.k.b.l r4 = r4.f
                java.util.ArrayList r7 = new java.util.ArrayList
                int r5 = i0.j.f.p.h.K(r3, r5)
                r7.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x0264:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x027a
                java.lang.Object r5 = r3.next()
                m0.r.t.a.r.e.a.w.w r5 = (m0.r.t.a.r.e.a.w.w) r5
                m0.r.t.a.r.e.a.w.j r5 = (m0.r.t.a.r.e.a.w.j) r5
                java.lang.String r5 = r5.o()
                r7.add(r5)
                goto L_0x0264
            L_0x027a:
                r4.b(r1, r7)
            L_0x027d:
                boolean r1 = r2.isEmpty()
                r1 = r1 ^ r6
                if (r1 == 0) goto L_0x0289
                java.util.List r1 = m0.j.g.v0(r2)
                goto L_0x029d
            L_0x0289:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r1 = r0.d
                m0.r.t.a.r.e.a.u.c r1 = r1.d2
                m0.r.t.a.r.e.a.u.a r1 = r1.a
                m0.r.t.a.r.c.u r1 = r1.o
                m0.r.t.a.r.b.f r1 = r1.m()
                m0.r.t.a.r.m.a0 r1 = r1.f()
                java.util.List r1 = i0.j.f.p.h.L2(r1)
            L_0x029d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.g():java.util.Collection");
        }

        public List<m0> getParameters() {
            return (List) this.c.invoke();
        }

        public k0 j() {
            return this.d.d2.a.m;
        }

        public m0.r.t.a.r.c.d p() {
            return this.d;
        }

        public String toString() {
            String b = this.d.getName().b();
            i.d(b, "name.asString()");
            return b;
        }
    }

    static {
        m0.j.g.h0("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(c cVar, m0.r.t.a.r.c.i iVar, g gVar, m0.r.t.a.r.c.d dVar) {
        super(cVar.a.a, iVar, gVar.getName(), cVar.a.j.a(gVar), false);
        ClassKind classKind;
        Modality modality;
        i.e(cVar, "outerContext");
        i.e(iVar, "containingDeclaration");
        i.e(gVar, "jClass");
        this.a2 = cVar;
        this.b2 = gVar;
        this.c2 = dVar;
        c F = i0.j.f.p.h.F(cVar, this, gVar, 0, 4);
        this.d2 = F;
        Objects.requireNonNull((d.a) F.a.g);
        gVar.H();
        if (gVar.q()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (gVar.G()) {
            classKind = ClassKind.INTERFACE;
        } else if (gVar.z()) {
            classKind = ClassKind.ENUM_CLASS;
        } else {
            classKind = ClassKind.CLASS;
        }
        this.e2 = classKind;
        if (gVar.q() || gVar.z()) {
            modality = Modality.FINAL;
        } else {
            modality = Modality.Companion.a(false, gVar.D() || gVar.isAbstract() || gVar.G(), !gVar.isFinal());
        }
        this.f2 = modality;
        this.g2 = gVar.getVisibility();
        this.h2 = gVar.j() != null && !gVar.P();
        this.i2 = new LazyJavaClassTypeConstructor(this);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(F, this, gVar, dVar != null, (LazyJavaClassMemberScope) null);
        this.j2 = lazyJavaClassMemberScope;
        ScopesHolderForClass scopesHolderForClass = ScopesHolderForClass.a;
        a aVar = F.a;
        this.k2 = ScopesHolderForClass.a(this, aVar.a, aVar.u.c(), new LazyJavaClassDescriptor$scopeHolder$1(this));
        this.l2 = new f(lazyJavaClassMemberScope);
        this.m2 = new LazyJavaStaticClassScope(F, gVar, this);
        this.n2 = i0.j.f.p.h.z3(F, gVar);
        this.o2 = F.a.a.d(new LazyJavaClassDescriptor$declaredParameters$1(this));
    }

    public boolean A0() {
        return false;
    }

    public MemberScope E(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this.k2.b(eVar);
    }

    public boolean E0() {
        return false;
    }

    public Collection<m0.r.t.a.r.c.d> G() {
        if (this.f2 != Modality.SEALED) {
            return EmptyList.c;
        }
        m0.r.t.a.r.e.a.u.h.a c = m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, false, (m0) null, 3);
        Collection<j> M = this.b2.M();
        ArrayList arrayList = new ArrayList();
        for (j e : M) {
            m0.r.t.a.r.c.f c3 = this.d2.e.e(e, c).I0().c();
            m0.r.t.a.r.c.d dVar = c3 instanceof m0.r.t.a.r.c.d ? (m0.r.t.a.r.c.d) c3 : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public boolean H() {
        return false;
    }

    /* renamed from: H0 */
    public LazyJavaClassMemberScope z0() {
        return (LazyJavaClassMemberScope) super.z0();
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return this.h2;
    }

    public m0.r.t.a.r.c.c P() {
        return null;
    }

    public MemberScope Q() {
        return this.m2;
    }

    public m0.r.t.a.r.c.d S() {
        return null;
    }

    public ClassKind f() {
        return this.e2;
    }

    public m0.r.t.a.r.c.r0.f getAnnotations() {
        return this.n2;
    }

    public p getVisibility() {
        if (!i.a(this.g2, o.a) || this.b2.j() != null) {
            return i0.j.f.p.h.h4(this.g2);
        }
        p pVar = m.a;
        i.d(pVar, "{\n            JavaDescriptorVisibilities.PACKAGE_VISIBILITY\n        }");
        return pVar;
    }

    public j0 i() {
        return this.i2;
    }

    public boolean isInline() {
        return false;
    }

    public Modality j() {
        return this.f2;
    }

    public Collection k() {
        return (List) this.j2.q.invoke();
    }

    public List<m0> t() {
        return (List) this.o2.invoke();
    }

    public String toString() {
        return i.k("Lazy Java class ", DescriptorUtilsKt.i(this));
    }

    public boolean w() {
        return false;
    }

    public MemberScope w0() {
        return this.l2;
    }

    public boolean z() {
        return false;
    }
}
