package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.e.a.k;
import m0.r.t.a.r.e.a.o;
import m0.r.t.a.r.e.a.x.d;
import m0.r.t.a.r.e.a.x.j;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.o.g;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement {
    public final AnnotationTypeQualifierResolver a;
    public final g b;
    public final d c;

    /* compiled from: signatureEnhancement.kt */
    public static class a {
        public final v a;
        public final boolean b;
        public final boolean c;

        public a(v vVar, boolean z, boolean z2) {
            i.e(vVar, "type");
            this.a = vVar;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    public static final class b extends a {
        public final boolean d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(v vVar, boolean z, boolean z2, boolean z3) {
            super(vVar, z2, z3);
            i.e(vVar, "type");
            this.d = z;
        }
    }

    public SignatureEnhancement(AnnotationTypeQualifierResolver annotationTypeQualifierResolver, g gVar, d dVar) {
        i.e(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        i.e(gVar, "javaTypeEnhancementState");
        i.e(dVar, "typeEnhancement");
        this.a = annotationTypeQualifierResolver;
        this.b = gVar;
        this.c = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: m0.r.t.a.r.e.a.t.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: m0.r.t.a.r.e.a.t.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: m0.r.t.a.r.c.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: m0.r.t.a.r.c.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: m0.r.t.a.r.c.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: m0.r.t.a.r.c.t0.a0} */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02fe, code lost:
        if (m0.r.t.a.r.b.f.K(r7) != false) goto L_0x0303;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0237 A[Catch:{ IllegalArgumentException -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0242 A[Catch:{ IllegalArgumentException -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> a(m0.r.t.a.r.e.a.u.c r21, java.util.Collection<? extends D> r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r0 = r22
            java.lang.String r1 = "c"
            m0.n.b.i.e(r8, r1)
            java.lang.String r1 = "platformSignatures"
            m0.n.b.i.e(r0, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r1 = i0.j.f.p.h.K(r0, r10)
            r9.<init>(r1)
            java.util.Iterator r11 = r22.iterator()
        L_0x001f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x046e
            java.lang.Object r0 = r11.next()
            r12 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r12 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r12
            boolean r0 = r12 instanceof m0.r.t.a.r.e.a.t.b
            if (r0 != 0) goto L_0x0033
        L_0x0030:
            r4 = r10
            goto L_0x0464
        L_0x0033:
            r0 = r12
            m0.r.t.a.r.e.a.t.b r0 = (m0.r.t.a.r.e.a.t.b) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = r0.f()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r13 = 1
            if (r1 != r2) goto L_0x004e
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r0.a()
            java.util.Collection r0 = r0.e()
            int r0 = r0.size()
            if (r0 != r13) goto L_0x004e
            goto L_0x0030
        L_0x004e:
            m0.r.t.a.r.c.r0.f r0 = r12.getAnnotations()
            m0.r.t.a.r.e.a.u.c r4 = i0.j.f.p.h.a0(r8, r0)
            boolean r0 = r12 instanceof m0.r.t.a.r.e.a.t.f
            r14 = 0
            if (r0 == 0) goto L_0x0079
            r0 = r12
            m0.r.t.a.r.e.a.t.f r0 = (m0.r.t.a.r.e.a.t.f) r0
            m0.r.t.a.r.c.t0.a0 r1 = r0.o2
            if (r1 != 0) goto L_0x0064
            r1 = r14
            goto L_0x006a
        L_0x0064:
            boolean r1 = r1.y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x006a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = m0.n.b.i.a(r1, r2)
            if (r1 == 0) goto L_0x0079
            m0.r.t.a.r.c.t0.a0 r0 = r0.o2
            m0.n.b.i.c(r0)
            r2 = r0
            goto L_0x007a
        L_0x0079:
            r2 = r12
        L_0x007a:
            r15 = r12
            m0.r.t.a.r.e.a.t.b r15 = (m0.r.t.a.r.e.a.t.b) r15
            m0.r.t.a.r.c.f0 r0 = r15.l0()
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r2 instanceof m0.r.t.a.r.c.r
            if (r0 != 0) goto L_0x0089
            r0 = r14
            goto L_0x008a
        L_0x0089:
            r0 = r2
        L_0x008a:
            m0.r.t.a.r.c.r r0 = (m0.r.t.a.r.c.r) r0
            if (r0 != 0) goto L_0x0090
            r0 = r14
            goto L_0x0098
        L_0x0090:
            m0.r.t.a.r.c.a$a<m0.r.t.a.r.c.o0> r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.w2
            java.lang.Object r0 = r0.h0(r1)
            m0.r.t.a.r.c.o0 r0 = (m0.r.t.a.r.c.o0) r0
        L_0x0098:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r7.e(r12, r0, r4, r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r0 = r0.b(r14)
            r6 = r0
            goto L_0x00a5
        L_0x00a4:
            r6 = r14
        L_0x00a5:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            if (r0 == 0) goto L_0x00ad
            r0 = r12
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r0
            goto L_0x00ae
        L_0x00ad:
            r0 = r14
        L_0x00ae:
            r5 = 0
            if (r0 != 0) goto L_0x00b2
            goto L_0x00c5
        L_0x00b2:
            m0.r.t.a.r.e.b.p r1 = m0.r.t.a.r.e.b.p.a
            m0.r.t.a.r.c.i r3 = r0.b()
            m0.r.t.a.r.c.d r3 = (m0.r.t.a.r.c.d) r3
            r14 = 3
            java.lang.String r0 = m0.r.t.a.r.e.b.n.b(r0, r5, r5, r14)
            java.lang.String r0 = i0.j.f.p.h.Q3(r1, r3, r0)
            if (r0 != 0) goto L_0x00c7
        L_0x00c5:
            r14 = 0
            goto L_0x00d0
        L_0x00c7:
            java.util.Map<java.lang.String, m0.r.t.a.r.e.a.x.h> r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.d
            java.lang.Object r0 = r1.get(r0)
            m0.r.t.a.r.e.a.x.h r0 = (m0.r.t.a.r.e.a.x.h) r0
            r14 = r0
        L_0x00d0:
            if (r14 != 0) goto L_0x00d3
            goto L_0x00df
        L_0x00d3:
            java.util.List<m0.r.t.a.r.e.a.x.k> r0 = r14.b
            r0.size()
            java.util.List r0 = r15.h()
            r0.size()
        L_0x00df:
            java.util.List r0 = r2.h()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            m0.n.b.i.d(r0, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = i0.j.f.p.h.K(r0, r10)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00f5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0365
            java.lang.Object r1 = r0.next()
            m0.r.t.a.r.c.o0 r1 = (m0.r.t.a.r.c.o0) r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 r13 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1
            r13.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r13 = r7.e(r12, r1, r4, r13)
            if (r14 != 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            java.util.List<m0.r.t.a.r.e.a.x.k> r10 = r14.b
            if (r10 != 0) goto L_0x0113
        L_0x0111:
            r5 = 0
            goto L_0x011d
        L_0x0113:
            int r5 = r1.g()
            java.lang.Object r5 = m0.j.g.z(r10, r5)
            m0.r.t.a.r.e.a.x.k r5 = (m0.r.t.a.r.e.a.x.k) r5
        L_0x011d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r5 = r13.b(r5)
            boolean r10 = r5.b
            if (r10 == 0) goto L_0x0128
            m0.r.t.a.r.m.v r10 = r5.a
            goto L_0x0131
        L_0x0128:
            m0.r.t.a.r.m.v r10 = r1.getType()
            java.lang.String r13 = "p.type"
            m0.n.b.i.d(r10, r13)
        L_0x0131:
            java.lang.String r13 = "p"
            m0.n.b.i.d(r1, r13)
            java.lang.String r13 = "<this>"
            m0.n.b.i.e(r1, r13)
            r18 = r0
            m0.r.t.a.r.c.r0.f r0 = r1.getAnnotations()
            r19 = r6
            m0.r.t.a.r.g.b r6 = m0.r.t.a.r.e.a.q.r
            java.lang.String r7 = "DEFAULT_VALUE_FQ_NAME"
            m0.n.b.i.d(r6, r7)
            m0.r.t.a.r.c.r0.c r0 = r0.f(r6)
            if (r0 != 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            m0.r.t.a.r.j.p.g r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.b(r0)
            if (r0 != 0) goto L_0x0159
        L_0x0157:
            r0 = 0
            goto L_0x0160
        L_0x0159:
            boolean r6 = r0 instanceof m0.r.t.a.r.j.p.s
            if (r6 != 0) goto L_0x015e
            r0 = 0
        L_0x015e:
            m0.r.t.a.r.j.p.s r0 = (m0.r.t.a.r.j.p.s) r0
        L_0x0160:
            if (r0 != 0) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            T r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x017f
        L_0x0169:
            m0.r.t.a.r.c.r0.f r0 = r1.getAnnotations()
            m0.r.t.a.r.g.b r6 = m0.r.t.a.r.e.a.q.s
            java.lang.String r7 = "DEFAULT_NULL_FQ_NAME"
            m0.n.b.i.d(r6, r7)
            boolean r0 = r0.n(r6)
            if (r0 == 0) goto L_0x017d
            m0.r.t.a.r.e.a.t.g r0 = m0.r.t.a.r.e.a.t.g.a
            goto L_0x0185
        L_0x017d:
            r0 = 0
            goto L_0x0185
        L_0x017f:
            m0.r.t.a.r.e.a.t.i r6 = new m0.r.t.a.r.e.a.t.i
            r6.<init>(r0)
            r0 = r6
        L_0x0185:
            boolean r6 = r0 instanceof m0.r.t.a.r.e.a.t.i
            if (r6 == 0) goto L_0x0314
            m0.r.t.a.r.e.a.t.i r0 = (m0.r.t.a.r.e.a.t.i) r0
            java.lang.String r0 = r0.a
            m0.n.b.i.e(r10, r13)
            java.lang.String r6 = "value"
            m0.n.b.i.e(r0, r6)
            m0.r.t.a.r.m.j0 r7 = r10.I0()
            m0.r.t.a.r.c.f r7 = r7.c()
            boolean r13 = r7 instanceof m0.r.t.a.r.c.d
            if (r13 == 0) goto L_0x01d8
            m0.r.t.a.r.c.d r7 = (m0.r.t.a.r.c.d) r7
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r13 = r7.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r8 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            if (r13 != r8) goto L_0x01d8
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r6 = r7.w0()
            m0.r.t.a.r.g.d r0 = m0.r.t.a.r.g.d.g(r0)
            java.lang.String r7 = "identifier(value)"
            m0.n.b.i.d(r0, r7)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r7 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BACKEND
            m0.r.t.a.r.c.f r0 = r6.f(r0, r7)
            boolean r6 = r0 instanceof m0.r.t.a.r.c.d
            if (r6 == 0) goto L_0x01d5
            m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r6 = r0.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r7 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r6 != r7) goto L_0x01d5
            m0.r.t.a.r.e.a.f r6 = new m0.r.t.a.r.e.a.f
            r6.<init>(r0)
            r13 = 1
            goto L_0x030c
        L_0x01d5:
            r13 = 1
            goto L_0x030b
        L_0x01d8:
            m0.r.t.a.r.m.v r7 = m0.r.t.a.r.m.a1.a.H2(r10)
            m0.n.b.i.e(r0, r6)
            r6 = 2
            java.lang.String r8 = "0x"
            r10 = 0
            boolean r8 = kotlin.text.StringsKt__IndentKt.J(r0, r8, r10, r6)
            java.lang.String r13 = "(this as java.lang.String).substring(startIndex)"
            if (r8 != 0) goto L_0x021a
            java.lang.String r8 = "0X"
            boolean r8 = kotlin.text.StringsKt__IndentKt.J(r0, r8, r10, r6)
            if (r8 == 0) goto L_0x01f4
            goto L_0x021a
        L_0x01f4:
            java.lang.String r8 = "0b"
            boolean r8 = kotlin.text.StringsKt__IndentKt.J(r0, r8, r10, r6)
            if (r8 != 0) goto L_0x020d
            java.lang.String r8 = "0B"
            boolean r8 = kotlin.text.StringsKt__IndentKt.J(r0, r8, r10, r6)
            if (r8 == 0) goto L_0x0205
            goto L_0x020d
        L_0x0205:
            m0.r.t.a.r.o.h r6 = new m0.r.t.a.r.o.h
            r8 = 10
            r6.<init>(r0, r8)
            goto L_0x0229
        L_0x020d:
            m0.r.t.a.r.o.h r8 = new m0.r.t.a.r.o.h
            java.lang.String r10 = r0.substring(r6)
            m0.n.b.i.d(r10, r13)
            r8.<init>(r10, r6)
            goto L_0x0228
        L_0x021a:
            m0.r.t.a.r.o.h r8 = new m0.r.t.a.r.o.h
            java.lang.String r6 = r0.substring(r6)
            m0.n.b.i.d(r6, r13)
            r10 = 16
            r8.<init>(r6, r10)
        L_0x0228:
            r6 = r8
        L_0x0229:
            java.lang.String r8 = r6.a
            int r6 = r6.b
            m0.r.t.a.r.g.d r10 = m0.r.t.a.r.b.f.a     // Catch:{ IllegalArgumentException -> 0x0301 }
            m0.r.t.a.r.g.c r10 = m0.r.t.a.r.b.g.a.i     // Catch:{ IllegalArgumentException -> 0x0301 }
            boolean r10 = m0.r.t.a.r.b.f.C(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0301 }
            if (r10 == 0) goto L_0x0242
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException -> 0x0301 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0301 }
            r13 = 1
            goto L_0x0303
        L_0x0242:
            m0.r.t.a.r.g.c r10 = m0.r.t.a.r.b.g.a.j     // Catch:{ IllegalArgumentException -> 0x0301 }
            boolean r10 = m0.r.t.a.r.b.f.C(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0301 }
            if (r10 == 0) goto L_0x0261
            java.lang.String r6 = "$this$singleOrNull"
            m0.n.b.i.e(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0301 }
            int r6 = r0.length()     // Catch:{ IllegalArgumentException -> 0x0301 }
            r13 = 1
            if (r6 != r13) goto L_0x0302
            r10 = 0
            char r0 = r0.charAt(r10)     // Catch:{ IllegalArgumentException -> 0x0302 }
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x0261:
            r13 = 1
            m0.r.t.a.r.g.c r10 = m0.r.t.a.r.b.g.a.k     // Catch:{ IllegalArgumentException -> 0x0302 }
            boolean r10 = m0.r.t.a.r.b.f.C(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r10 == 0) goto L_0x028a
            java.lang.String r0 = "$this$toByteOrNull"
            m0.n.b.i.e(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            java.lang.Integer r0 = kotlin.text.StringsKt__IndentKt.T(r8, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r0 == 0) goto L_0x0302
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0302 }
            r6 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r6) goto L_0x0302
            r6 = 127(0x7f, float:1.78E-43)
            if (r0 <= r6) goto L_0x0283
            goto L_0x0302
        L_0x0283:
            byte r0 = (byte) r0     // Catch:{ IllegalArgumentException -> 0x0302 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x028a:
            m0.r.t.a.r.g.c r10 = m0.r.t.a.r.b.g.a.l     // Catch:{ IllegalArgumentException -> 0x0302 }
            boolean r10 = m0.r.t.a.r.b.f.C(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r10 == 0) goto L_0x02b0
            java.lang.String r0 = "$this$toShortOrNull"
            m0.n.b.i.e(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            java.lang.Integer r0 = kotlin.text.StringsKt__IndentKt.T(r8, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r0 == 0) goto L_0x0302
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0302 }
            r6 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r6) goto L_0x0302
            r6 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r6) goto L_0x02aa
            goto L_0x0302
        L_0x02aa:
            short r0 = (short) r0     // Catch:{ IllegalArgumentException -> 0x0302 }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x02b0:
            m0.r.t.a.r.g.c r10 = m0.r.t.a.r.b.g.a.m     // Catch:{ IllegalArgumentException -> 0x0302 }
            boolean r10 = m0.r.t.a.r.b.f.C(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r10 == 0) goto L_0x02bd
            java.lang.Integer r0 = kotlin.text.StringsKt__IndentKt.T(r8, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x02bd:
            m0.r.t.a.r.g.c r10 = m0.r.t.a.r.b.g.a.n     // Catch:{ IllegalArgumentException -> 0x0302 }
            boolean r10 = m0.r.t.a.r.b.f.C(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r10 == 0) goto L_0x02ca
            java.lang.Long r0 = kotlin.text.StringsKt__IndentKt.U(r8, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x02ca:
            m0.r.t.a.r.g.c r6 = m0.r.t.a.r.b.g.a.o     // Catch:{ IllegalArgumentException -> 0x0302 }
            boolean r6 = m0.r.t.a.r.b.f.B(r7, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r6 == 0) goto L_0x02da
            boolean r6 = r7.J0()     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r6 != 0) goto L_0x02da
            r10 = r13
            goto L_0x02db
        L_0x02da:
            r10 = 0
        L_0x02db:
            if (r10 == 0) goto L_0x02e2
            java.lang.Float r0 = m0.r.t.a.r.m.a1.a.b4(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x02e2:
            m0.r.t.a.r.g.c r6 = m0.r.t.a.r.b.g.a.p     // Catch:{ IllegalArgumentException -> 0x0302 }
            boolean r6 = m0.r.t.a.r.b.f.B(r7, r6)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r6 == 0) goto L_0x02f2
            boolean r6 = r7.J0()     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r6 != 0) goto L_0x02f2
            r10 = r13
            goto L_0x02f3
        L_0x02f2:
            r10 = 0
        L_0x02f3:
            if (r10 == 0) goto L_0x02fa
            java.lang.Double r0 = m0.r.t.a.r.m.a1.a.a4(r0)     // Catch:{ IllegalArgumentException -> 0x0302 }
            goto L_0x0303
        L_0x02fa:
            boolean r6 = m0.r.t.a.r.b.f.K(r7)     // Catch:{ IllegalArgumentException -> 0x0302 }
            if (r6 == 0) goto L_0x0302
            goto L_0x0303
        L_0x0301:
            r13 = 1
        L_0x0302:
            r0 = 0
        L_0x0303:
            if (r0 == 0) goto L_0x030b
            m0.r.t.a.r.e.a.d r6 = new m0.r.t.a.r.e.a.d
            r6.<init>(r0)
            goto L_0x030c
        L_0x030b:
            r6 = 0
        L_0x030c:
            if (r6 == 0) goto L_0x0311
            r10 = r13
            r6 = 0
            goto L_0x0329
        L_0x0311:
            r6 = 0
            r10 = 0
            goto L_0x0329
        L_0x0314:
            r6 = 0
            r13 = 1
            m0.r.t.a.r.e.a.t.g r7 = m0.r.t.a.r.e.a.t.g.a
            boolean r7 = m0.n.b.i.a(r0, r7)
            if (r7 == 0) goto L_0x0323
            boolean r10 = m0.r.t.a.r.m.s0.b(r10)
            goto L_0x0329
        L_0x0323:
            if (r0 != 0) goto L_0x035f
            boolean r10 = r1.s0()
        L_0x0329:
            if (r10 == 0) goto L_0x0337
            java.util.Collection r0 = r1.e()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0337
            r10 = r13
            goto L_0x0338
        L_0x0337:
            r10 = r6
        L_0x0338:
            boolean r0 = r5.b
            if (r0 != 0) goto L_0x0345
            boolean r0 = r1.s0()
            if (r10 == r0) goto L_0x0343
            goto L_0x0345
        L_0x0343:
            r0 = r6
            goto L_0x0346
        L_0x0345:
            r0 = r13
        L_0x0346:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$b
            m0.r.t.a.r.m.v r7 = r5.a
            boolean r5 = r5.c
            r1.<init>(r7, r10, r0, r5)
            r3.add(r1)
            r7 = r20
            r8 = r21
            r5 = r6
            r0 = r18
            r6 = r19
            r10 = 10
            goto L_0x00f5
        L_0x035f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0365:
            r19 = r6
            r6 = r5
            r5 = 1
            boolean r0 = r12 instanceof m0.r.t.a.r.c.c0
            if (r0 != 0) goto L_0x036f
            r0 = 0
            goto L_0x0370
        L_0x036f:
            r0 = r12
        L_0x0370:
            m0.r.t.a.r.c.c0 r0 = (m0.r.t.a.r.c.c0) r0
            if (r0 != 0) goto L_0x0376
            r0 = 0
            goto L_0x037e
        L_0x0376:
            boolean r0 = i0.j.f.p.h.n2(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x037e:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r0 = m0.n.b.i.a(r0, r7)
            if (r0 == 0) goto L_0x0389
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD
            goto L_0x038b
        L_0x0389:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE
        L_0x038b:
            r8 = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.c
            r0 = r20
            r1 = r12
            r16 = r3
            r3 = r5
            r17 = r6
            r5 = r8
            r8 = r19
            r6 = r10
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r0.d(r1, r2, r3, r4, r5, r6)
            if (r14 != 0) goto L_0x03a2
            r1 = 0
            goto L_0x03a4
        L_0x03a2:
            m0.r.t.a.r.e.a.x.k r1 = r14.a
        L_0x03a4:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r0 = r0.b(r1)
            if (r8 != 0) goto L_0x03ac
            r1 = 0
            goto L_0x03b2
        L_0x03ac:
            boolean r1 = r8.c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x03b2:
            boolean r1 = m0.n.b.i.a(r1, r7)
            if (r1 != 0) goto L_0x03e1
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03e1
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x03c3
            goto L_0x03d9
        L_0x03c3:
            java.util.Iterator r1 = r16.iterator()
        L_0x03c7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03d9
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$b r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.b) r2
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x03c7
            r5 = r13
            goto L_0x03db
        L_0x03d9:
            r5 = r17
        L_0x03db:
            if (r5 == 0) goto L_0x03de
            goto L_0x03e1
        L_0x03de:
            r5 = r17
            goto L_0x03e2
        L_0x03e1:
            r5 = r13
        L_0x03e2:
            if (r8 != 0) goto L_0x03e6
            r1 = 0
            goto L_0x03ec
        L_0x03e6:
            boolean r1 = r8.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x03ec:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = m0.n.b.i.a(r1, r2)
            if (r1 != 0) goto L_0x041e
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x041e
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x03ff
            goto L_0x0414
        L_0x03ff:
            java.util.Iterator r1 = r16.iterator()
        L_0x0403:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0414
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$b r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.b) r2
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x0403
            goto L_0x0416
        L_0x0414:
            r13 = r17
        L_0x0416:
            if (r13 != 0) goto L_0x041e
            if (r5 == 0) goto L_0x041b
            goto L_0x041e
        L_0x041b:
            r4 = 10
            goto L_0x0464
        L_0x041e:
            if (r5 == 0) goto L_0x042d
            m0.r.t.a.r.c.a$a<java.lang.Object> r1 = m0.r.t.a.r.j.q.a.a
            m0.r.t.a.r.e.a.e r2 = new m0.r.t.a.r.e.a.e
            r2.<init>(r12)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r2)
            goto L_0x042e
        L_0x042d:
            r3 = 0
        L_0x042e:
            if (r8 != 0) goto L_0x0432
            r14 = 0
            goto L_0x0434
        L_0x0432:
            m0.r.t.a.r.m.v r14 = r8.a
        L_0x0434:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r16
            r4 = 10
            int r5 = i0.j.f.p.h.K(r2, r4)
            r1.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0445:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x045e
            java.lang.Object r5 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$b r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.b) r5
            m0.r.t.a.r.e.a.t.j r6 = new m0.r.t.a.r.e.a.t.j
            m0.r.t.a.r.m.v r7 = r5.a
            boolean r5 = r5.d
            r6.<init>(r7, r5)
            r1.add(r6)
            goto L_0x0445
        L_0x045e:
            m0.r.t.a.r.m.v r0 = r0.a
            m0.r.t.a.r.e.a.t.b r12 = r15.v(r14, r1, r0, r3)
        L_0x0464:
            r9.add(r12)
            r7 = r20
            r8 = r21
            r10 = r4
            goto L_0x001f
        L_0x046e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.a(m0.r.t.a.r.e.a.u.c, java.util.Collection):java.util.Collection");
    }

    public final m0.r.t.a.r.e.a.x.g b(c cVar, boolean z, boolean z2) {
        m0.r.t.a.r.e.a.x.g c2;
        i.e(cVar, "annotationDescriptor");
        m0.r.t.a.r.e.a.x.g c3 = c(cVar, z, z2);
        if (c3 != null) {
            return c3;
        }
        c d = this.a.d(cVar);
        if (d == null) {
            return null;
        }
        ReportLevel b2 = this.a.b(cVar);
        if (!b2.isIgnore() && (c2 = c(d, z, z2)) != null) {
            return m0.r.t.a.r.e.a.x.g.a(c2, (NullabilityQualifier) null, b2.isWarning(), 1);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r8.equals("NEVER") == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (r8.equals("MAYBE") == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        r8 = new m0.r.t.a.r.e.a.x.g(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.e.a.x.g c(m0.r.t.a.r.c.r0.c r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            m0.r.t.a.r.g.b r0 = r6.d()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            r2 = r6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor) r2
            boolean r2 = r2.i
            if (r2 != 0) goto L_0x0017
            if (r8 == 0) goto L_0x001b
        L_0x0017:
            if (r7 != 0) goto L_0x001b
            r7 = r4
            goto L_0x001c
        L_0x001b:
            r7 = r3
        L_0x001c:
            m0.r.t.a.r.o.g r8 = r5.b
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r8 = r8.g
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r2 = kotlin.reflect.jvm.internal.impl.utils.ReportLevel.IGNORE
            if (r8 != r2) goto L_0x0025
            goto L_0x004a
        L_0x0025:
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r2 = kotlin.reflect.jvm.internal.impl.utils.ReportLevel.WARN
            if (r8 != r2) goto L_0x002a
            r3 = r4
        L_0x002a:
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.r.a
            boolean r8 = m0.n.b.i.a(r0, r8)
            if (r8 == 0) goto L_0x003a
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r8.<init>(r2, r3)
            goto L_0x004b
        L_0x003a:
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.r.b
            boolean r8 = m0.n.b.i.a(r0, r8)
            if (r8 == 0) goto L_0x004a
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r8.<init>(r2, r3)
            goto L_0x004b
        L_0x004a:
            r8 = r1
        L_0x004b:
            if (r8 != 0) goto L_0x012e
            java.util.List<m0.r.t.a.r.g.b> r8 = m0.r.t.a.r.e.a.r.d
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x005e
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x005e:
            java.util.List<m0.r.t.a.r.g.b> r8 = m0.r.t.a.r.e.a.r.g
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x006f
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x006f:
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.r.e
            boolean r8 = m0.n.b.i.a(r0, r8)
            if (r8 == 0) goto L_0x00dd
            m0.r.t.a.r.j.p.g r8 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.b(r6)
            boolean r0 = r8 instanceof m0.r.t.a.r.j.p.i
            if (r0 == 0) goto L_0x0082
            m0.r.t.a.r.j.p.i r8 = (m0.r.t.a.r.j.p.i) r8
            goto L_0x0083
        L_0x0082:
            r8 = r1
        L_0x0083:
            if (r8 != 0) goto L_0x008e
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x008e:
            m0.r.t.a.r.g.d r8 = r8.c
            java.lang.String r8 = r8.b()
            int r0 = r8.hashCode()
            switch(r0) {
                case 73135176: goto L_0x00cc;
                case 74175084: goto L_0x00c3;
                case 433141802: goto L_0x00b0;
                case 1933739535: goto L_0x009d;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x012a
        L_0x009d:
            java.lang.String r0 = "ALWAYS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00a7
            goto L_0x012a
        L_0x00a7:
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x00b0:
            java.lang.String r0 = "UNKNOWN"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00ba
            goto L_0x012a
        L_0x00ba:
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x00c3:
            java.lang.String r0 = "NEVER"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00d5
            goto L_0x012a
        L_0x00cc:
            java.lang.String r0 = "MAYBE"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00d5
            goto L_0x012a
        L_0x00d5:
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x00dd:
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.r.h
            boolean r8 = m0.n.b.i.a(r0, r8)
            if (r8 == 0) goto L_0x00f3
            m0.r.t.a.r.o.g r8 = r5.b
            boolean r8 = r8.f
            if (r8 == 0) goto L_0x00f3
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x00f3:
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.r.i
            boolean r8 = m0.n.b.i.a(r0, r8)
            if (r8 == 0) goto L_0x0109
            m0.r.t.a.r.o.g r8 = r5.b
            boolean r8 = r8.f
            if (r8 == 0) goto L_0x0109
            m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r8.<init>(r0, r7)
            goto L_0x012b
        L_0x0109:
            m0.r.t.a.r.g.b r7 = m0.r.t.a.r.e.a.r.k
            boolean r7 = m0.n.b.i.a(r0, r7)
            if (r7 == 0) goto L_0x0119
            m0.r.t.a.r.e.a.x.g r7 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r7.<init>(r8, r4)
            goto L_0x0128
        L_0x0119:
            m0.r.t.a.r.g.b r7 = m0.r.t.a.r.e.a.r.j
            boolean r7 = m0.n.b.i.a(r0, r7)
            if (r7 == 0) goto L_0x012a
            m0.r.t.a.r.e.a.x.g r7 = new m0.r.t.a.r.e.a.x.g
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r7.<init>(r8, r4)
        L_0x0128:
            r8 = r7
            goto L_0x012b
        L_0x012a:
            r8 = r1
        L_0x012b:
            if (r8 != 0) goto L_0x012e
            return r1
        L_0x012e:
            boolean r7 = r8.b
            if (r7 != 0) goto L_0x0142
            boolean r7 = r6 instanceof m0.r.t.a.r.e.a.t.h
            if (r7 == 0) goto L_0x0142
            m0.r.t.a.r.e.a.t.h r6 = (m0.r.t.a.r.e.a.t.h) r6
            boolean r6 = r6.i()
            if (r6 == 0) goto L_0x0142
            m0.r.t.a.r.e.a.x.g r8 = m0.r.t.a.r.e.a.x.g.a(r8, r1, r4, r4)
        L_0x0142:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.c(m0.r.t.a.r.c.r0.c, boolean, boolean):m0.r.t.a.r.e.a.x.g");
    }

    public final SignatureParts d(CallableMemberDescriptor callableMemberDescriptor, m0.r.t.a.r.c.r0.a aVar, boolean z, m0.r.t.a.r.e.a.u.c cVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, l<? super CallableMemberDescriptor, ? extends v> lVar) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        l<? super CallableMemberDescriptor, ? extends v> lVar2 = lVar;
        v vVar = (v) lVar2.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> e = callableMemberDescriptor.e();
        i.d(e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(h.K(e, 10));
        for (CallableMemberDescriptor callableMemberDescriptor3 : e) {
            i.d(callableMemberDescriptor3, "it");
            arrayList.add((v) lVar2.invoke(callableMemberDescriptor3));
        }
        return new SignatureParts(aVar, vVar, arrayList, z, h.a0(cVar, ((v) lVar2.invoke(callableMemberDescriptor)).getAnnotations()), annotationQualifierApplicabilityType, false, 64);
    }

    public final SignatureParts e(CallableMemberDescriptor callableMemberDescriptor, o0 o0Var, m0.r.t.a.r.e.a.u.c cVar, l<? super CallableMemberDescriptor, ? extends v> lVar) {
        if (o0Var != null) {
            cVar = h.a0(cVar, o0Var.getAnnotations());
        }
        return d(callableMemberDescriptor, o0Var, false, cVar, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, lVar);
    }

    /* compiled from: signatureEnhancement.kt */
    public final class SignatureParts {
        public final m0.r.t.a.r.c.r0.a a;
        public final v b;
        public final Collection<v> c;
        public final boolean d;
        public final m0.r.t.a.r.e.a.u.c e;
        public final AnnotationQualifierApplicabilityType f;
        public final boolean g;

        public SignatureParts(SignatureEnhancement signatureEnhancement, m0.r.t.a.r.c.r0.a aVar, v vVar, Collection<? extends v> collection, boolean z, m0.r.t.a.r.e.a.u.c cVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
            i.e(signatureEnhancement, "this$0");
            i.e(vVar, "fromOverride");
            i.e(collection, "fromOverridden");
            i.e(cVar, "containerContext");
            i.e(annotationQualifierApplicabilityType, "containerApplicabilityType");
            SignatureEnhancement.this = signatureEnhancement;
            this.a = aVar;
            this.b = vVar;
            this.c = collection;
            this.d = z;
            this.e = cVar;
            this.f = annotationQualifierApplicabilityType;
            this.g = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final <T> T d(java.util.List<m0.r.t.a.r.g.b> r3, m0.r.t.a.r.c.r0.f r4, T r5) {
            /*
                boolean r0 = r3 instanceof java.util.Collection
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x000d
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L_0x000d
                goto L_0x0029
            L_0x000d:
                java.util.Iterator r3 = r3.iterator()
            L_0x0011:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                m0.r.t.a.r.g.b r0 = (m0.r.t.a.r.g.b) r0
                m0.r.t.a.r.c.r0.c r0 = r4.f(r0)
                if (r0 == 0) goto L_0x0025
                r0 = r1
                goto L_0x0026
            L_0x0025:
                r0 = r2
            L_0x0026:
                if (r0 == 0) goto L_0x0011
                goto L_0x002a
            L_0x0029:
                r1 = r2
            L_0x002a:
                if (r1 == 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r5 = 0
            L_0x002e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.d(java.util.List, m0.r.t.a.r.c.r0.f, java.lang.Object):java.lang.Object");
        }

        public static final void e(SignatureParts signatureParts, ArrayList<j> arrayList, v vVar, m0.r.t.a.r.e.a.u.c cVar, m0 m0Var) {
            k kVar;
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
            m0.r.t.a.r.e.a.u.c a0 = h.a0(cVar, vVar.getAnnotations());
            o a2 = a0.a();
            if (a2 == null) {
                kVar = null;
            } else {
                if (signatureParts.g) {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                } else {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
                }
                kVar = a2.a.get(annotationQualifierApplicabilityType);
            }
            arrayList.add(new j(vVar, kVar, m0Var, false));
            List<m0.r.t.a.r.m.m0> H0 = vVar.H0();
            List<m0> parameters = vVar.I0().getParameters();
            i.d(parameters, "type.constructor.parameters");
            Iterator it = ((ArrayList) m0.j.g.F0(H0, parameters)).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                m0.r.t.a.r.m.m0 m0Var2 = (m0.r.t.a.r.m.m0) pair.c;
                m0 m0Var3 = (m0) pair.d;
                if (m0Var2.c()) {
                    v type = m0Var2.getType();
                    i.d(type, "arg.type");
                    arrayList.add(new j(type, kVar, m0Var3, true));
                } else {
                    v type2 = m0Var2.getType();
                    i.d(type2, "arg.type");
                    e(signatureParts, arrayList, type2, a0, m0Var3);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier a(m0.r.t.a.r.c.m0 r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof m0.r.t.a.r.e.a.u.g.e
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                m0.r.t.a.r.e.a.u.g.e r8 = (m0.r.t.a.r.e.a.u.g.e) r8
                java.util.List r0 = r8.getUpperBounds()
                java.lang.String r2 = "upperBounds"
                m0.n.b.i.d(r0, r2)
                boolean r3 = r0.isEmpty()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x001a
                goto L_0x0032
            L_0x001a:
                java.util.Iterator r0 = r0.iterator()
            L_0x001e:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0032
                java.lang.Object r3 = r0.next()
                m0.r.t.a.r.m.v r3 = (m0.r.t.a.r.m.v) r3
                boolean r3 = i0.j.f.p.h.h2(r3)
                if (r3 != 0) goto L_0x001e
                r0 = r4
                goto L_0x0033
            L_0x0032:
                r0 = r5
            L_0x0033:
                if (r0 == 0) goto L_0x0037
                goto L_0x00b4
            L_0x0037:
                java.util.List r0 = r8.getUpperBounds()
                m0.n.b.i.d(r0, r2)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L_0x0045
                goto L_0x0079
            L_0x0045:
                java.util.Iterator r0 = r0.iterator()
            L_0x0049:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0079
                java.lang.Object r3 = r0.next()
                m0.r.t.a.r.m.v r3 = (m0.r.t.a.r.m.v) r3
                m0.r.t.a.r.m.v0 r3 = r3.L0()
                boolean r6 = r3 instanceof m0.r.t.a.r.m.q
                if (r6 == 0) goto L_0x0060
                m0.r.t.a.r.m.q r3 = (m0.r.t.a.r.m.q) r3
                goto L_0x0061
            L_0x0060:
                r3 = r1
            L_0x0061:
                if (r3 != 0) goto L_0x0064
                goto L_0x0074
            L_0x0064:
                m0.r.t.a.r.m.a0 r6 = r3.d
                boolean r6 = r6.J0()
                m0.r.t.a.r.m.a0 r3 = r3.q
                boolean r3 = r3.J0()
                if (r6 == r3) goto L_0x0074
                r3 = r5
                goto L_0x0075
            L_0x0074:
                r3 = r4
            L_0x0075:
                if (r3 != 0) goto L_0x0049
                r0 = r4
                goto L_0x007a
            L_0x0079:
                r0 = r5
            L_0x007a:
                if (r0 == 0) goto L_0x007d
                goto L_0x00b4
            L_0x007d:
                java.util.List r8 = r8.getUpperBounds()
                m0.n.b.i.d(r8, r2)
                boolean r0 = r8.isEmpty()
                if (r0 == 0) goto L_0x008b
                goto L_0x00ad
            L_0x008b:
                java.util.Iterator r8 = r8.iterator()
            L_0x008f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x00ad
                java.lang.Object r0 = r8.next()
                m0.r.t.a.r.m.v r0 = (m0.r.t.a.r.m.v) r0
                java.lang.String r1 = "it"
                m0.n.b.i.d(r0, r1)
                java.lang.String r1 = "<this>"
                m0.n.b.i.e(r0, r1)
                boolean r0 = m0.r.t.a.r.m.s0.g(r0)
                r0 = r0 ^ r5
                if (r0 == 0) goto L_0x008f
                r4 = r5
            L_0x00ad:
                if (r4 == 0) goto L_0x00b2
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x00b4
            L_0x00b2:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L_0x00b4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.a(m0.r.t.a.r.c.m0):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ac, code lost:
            if ((r15.c || !m0.r.t.a.r.m.a1.a.z2(r14)) != false) goto L_0x02b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x0378, code lost:
            if (r7.a == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) goto L_0x039f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x039a, code lost:
            if (m0.n.b.i.a(r5, java.lang.Boolean.TRUE) != false) goto L_0x039f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0425, code lost:
            if (((r10 != null) && r12 && r6 == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE) == false) goto L_0x0429;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x03a4  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x03a6  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x03c7  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x03d2  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x03d7  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x03d9  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x03ed  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x03f0  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x03f2  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x0404  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:244:0x0431  */
        /* JADX WARNING: Removed duplicated region for block: B:247:0x043c  */
        /* JADX WARNING: Removed duplicated region for block: B:250:0x0441  */
        /* JADX WARNING: Removed duplicated region for block: B:260:0x0462  */
        /* JADX WARNING: Removed duplicated region for block: B:263:0x0467 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:266:0x0475  */
        /* JADX WARNING: Removed duplicated region for block: B:267:0x0477  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:272:0x049d  */
        /* JADX WARNING: Removed duplicated region for block: B:273:0x049f  */
        /* JADX WARNING: Removed duplicated region for block: B:276:0x04b5  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x04d3  */
        /* JADX WARNING: Removed duplicated region for block: B:281:0x04d6  */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x04d8  */
        /* JADX WARNING: Removed duplicated region for block: B:284:0x04e0  */
        /* JADX WARNING: Removed duplicated region for block: B:306:0x023f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0229  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x023c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.a b(m0.r.t.a.r.e.a.x.k r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.util.Collection<m0.r.t.a.r.m.v> r2 = r0.c
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r5 = i0.j.f.p.h.K(r2, r4)
                r3.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
            L_0x0015:
                boolean r5 = r2.hasNext()
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L_0x0031
                java.lang.Object r5 = r2.next()
                m0.r.t.a.r.m.v r5 = (m0.r.t.a.r.m.v) r5
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r6)
                m0.r.t.a.r.e.a.u.c r6 = r0.e
                e(r0, r8, r5, r6, r7)
                r3.add(r8)
                goto L_0x0015
            L_0x0031:
                m0.r.t.a.r.m.v r2 = r0.b
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r6)
                m0.r.t.a.r.e.a.u.c r8 = r0.e
                e(r0, r5, r2, r8, r7)
                boolean r2 = r0.d
                if (r2 == 0) goto L_0x0070
                java.util.Collection<m0.r.t.a.r.m.v> r2 = r0.c
                boolean r9 = r2 instanceof java.util.Collection
                if (r9 == 0) goto L_0x004e
                boolean r9 = r2.isEmpty()
                if (r9 == 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                java.util.Iterator r2 = r2.iterator()
            L_0x0052:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x006b
                java.lang.Object r9 = r2.next()
                m0.r.t.a.r.m.v r9 = (m0.r.t.a.r.m.v) r9
                m0.r.t.a.r.m.x0.d r10 = m0.r.t.a.r.m.x0.d.a
                m0.r.t.a.r.m.v r11 = r0.b
                boolean r9 = r10.b(r9, r11)
                r9 = r9 ^ r6
                if (r9 == 0) goto L_0x0052
                r2 = r6
                goto L_0x006c
            L_0x006b:
                r2 = 0
            L_0x006c:
                if (r2 == 0) goto L_0x0070
                r2 = r6
                goto L_0x0071
            L_0x0070:
                r2 = 0
            L_0x0071:
                if (r2 == 0) goto L_0x0075
                r2 = r6
                goto L_0x0079
            L_0x0075:
                int r2 = r5.size()
            L_0x0079:
                m0.r.t.a.r.e.a.x.e[] r9 = new m0.r.t.a.r.e.a.x.e[r2]
                r10 = 0
            L_0x007c:
                java.lang.String r11 = "<this>"
                if (r10 >= r2) goto L_0x0490
                if (r10 != 0) goto L_0x0084
                r12 = r6
                goto L_0x0085
            L_0x0084:
                r12 = 0
            L_0x0085:
                java.lang.Object r13 = r5.get(r10)
                m0.r.t.a.r.e.a.x.j r13 = (m0.r.t.a.r.e.a.x.j) r13
                m0.r.t.a.r.m.v r14 = r13.a
                m0.r.t.a.r.e.a.k r15 = r13.b
                m0.r.t.a.r.c.m0 r8 = r13.c
                boolean r13 = r13.d
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r16 = r3.iterator()
            L_0x009c:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x00bd
                java.lang.Object r17 = r16.next()
                r6 = r17
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r6 = m0.j.g.z(r6, r10)
                m0.r.t.a.r.e.a.x.j r6 = (m0.r.t.a.r.e.a.x.j) r6
                if (r6 != 0) goto L_0x00b4
                r6 = 0
                goto L_0x00b6
            L_0x00b4:
                m0.r.t.a.r.m.v r6 = r6.a
            L_0x00b6:
                if (r6 == 0) goto L_0x00bb
                r7.add(r6)
            L_0x00bb:
                r6 = 1
                goto L_0x009c
            L_0x00bd:
                java.util.ArrayList r6 = new java.util.ArrayList
                r16 = r2
                int r2 = i0.j.f.p.h.K(r7, r4)
                r6.<init>(r2)
                java.util.Iterator r2 = r7.iterator()
            L_0x00cc:
                boolean r17 = r2.hasNext()
                if (r17 == 0) goto L_0x00e4
                java.lang.Object r17 = r2.next()
                r4 = r17
                m0.r.t.a.r.m.v r4 = (m0.r.t.a.r.m.v) r4
                m0.r.t.a.r.e.a.x.e r4 = r0.c(r4)
                r6.add(r4)
                r4 = 10
                goto L_0x00cc
            L_0x00e4:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r4 = r6.iterator()
            L_0x00ed:
                boolean r17 = r4.hasNext()
                if (r17 == 0) goto L_0x0107
                java.lang.Object r17 = r4.next()
                r18 = r3
                r3 = r17
                m0.r.t.a.r.e.a.x.e r3 = (m0.r.t.a.r.e.a.x.e) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = r3.d
                if (r3 == 0) goto L_0x0104
                r2.add(r3)
            L_0x0104:
                r3 = r18
                goto L_0x00ed
            L_0x0107:
                r18 = r3
                java.util.Set r2 = m0.j.g.D0(r2)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r6.iterator()
            L_0x0116:
                boolean r17 = r4.hasNext()
                if (r17 == 0) goto L_0x0130
                java.lang.Object r17 = r4.next()
                r19 = r4
                r4 = r17
                m0.r.t.a.r.e.a.x.e r4 = (m0.r.t.a.r.e.a.x.e) r4
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.c
                if (r4 == 0) goto L_0x012d
                r3.add(r4)
            L_0x012d:
                r4 = r19
                goto L_0x0116
            L_0x0130:
                java.util.Set r3 = m0.j.g.D0(r3)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x013d:
                boolean r17 = r7.hasNext()
                if (r17 == 0) goto L_0x0167
                java.lang.Object r17 = r7.next()
                r19 = r5
                r5 = r17
                m0.r.t.a.r.m.v r5 = (m0.r.t.a.r.m.v) r5
                m0.n.b.i.e(r5, r11)
                m0.r.t.a.r.m.v r17 = i0.j.f.p.h.a1(r5)
                if (r17 != 0) goto L_0x0157
                goto L_0x0159
            L_0x0157:
                r5 = r17
            L_0x0159:
                m0.r.t.a.r.e.a.x.e r5 = r0.c(r5)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r5.c
                if (r5 == 0) goto L_0x0164
                r4.add(r5)
            L_0x0164:
                r5 = r19
                goto L_0x013d
            L_0x0167:
                r19 = r5
                java.util.Set r4 = m0.j.g.D0(r4)
                m0.r.t.a.r.e.a.u.c r5 = r0.e
                m0.r.t.a.r.e.a.u.a r5 = r5.a
                m0.r.t.a.r.e.a.u.b r5 = r5.t
                boolean r5 = r5.b()
                if (r12 == 0) goto L_0x0262
                m0.r.t.a.r.c.r0.a r7 = r0.a
                if (r7 == 0) goto L_0x0262
                boolean r11 = r7 instanceof m0.r.t.a.r.c.m0
                if (r11 != 0) goto L_0x0262
                if (r5 == 0) goto L_0x0262
                m0.r.t.a.r.c.r0.f r7 = r7.getAnnotations()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                r17 = r15
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0194:
                boolean r20 = r7.hasNext()
                if (r20 == 0) goto L_0x024d
                java.lang.Object r1 = r7.next()
                r20 = r7
                r7 = r1
                m0.r.t.a.r.c.r0.c r7 = (m0.r.t.a.r.c.r0.c) r7
                r21 = r9
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver r9 = r11.a
                java.util.Objects.requireNonNull(r9)
                r22 = r11
                java.lang.String r11 = "annotationDescriptor"
                m0.n.b.i.e(r7, r11)
                m0.r.t.a.r.c.d r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.e(r7)
                if (r11 != 0) goto L_0x01bc
                r24 = r6
                r23 = r10
                goto L_0x01d1
            L_0x01bc:
                m0.r.t.a.r.c.r0.f r11 = r11.getAnnotations()
                r23 = r10
                m0.r.t.a.r.g.b r10 = m0.r.t.a.r.e.a.q.c
                r24 = r6
                java.lang.String r6 = "TARGET_ANNOTATION"
                m0.n.b.i.d(r10, r6)
                m0.r.t.a.r.c.r0.c r6 = r11.f(r10)
                if (r6 != 0) goto L_0x01d3
            L_0x01d1:
                r6 = 0
                goto L_0x0226
            L_0x01d3:
                java.util.Map r6 = r6.a()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x01e4:
                boolean r11 = r6.hasNext()
                if (r11 == 0) goto L_0x0207
                java.lang.Object r11 = r6.next()
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r11 = r11.getValue()
                m0.r.t.a.r.j.p.g r11 = (m0.r.t.a.r.j.p.g) r11
                r25 = r6
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1 r6 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1
                r6.<init>(r9)
                java.util.List r6 = r9.a(r11, r6)
                m0.j.g.b(r10, r6)
                r6 = r25
                goto L_0x01e4
            L_0x0207:
                java.util.Iterator r6 = r10.iterator()
                r9 = 0
            L_0x020c:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x0221
                java.lang.Object r10 = r6.next()
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r10 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r10
                int r10 = r10.ordinal()
                r11 = 1
                int r10 = r11 << r10
                r9 = r9 | r10
                goto L_0x020c
            L_0x0221:
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$a r6 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$a
                r6.<init>(r7, r9)
            L_0x0226:
                if (r6 != 0) goto L_0x0229
                goto L_0x0239
            L_0x0229:
                java.util.List r6 = r6.a()
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r7 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                boolean r6 = r6.contains(r7)
                if (r6 != 0) goto L_0x0239
                r6 = 1
                goto L_0x023a
            L_0x0239:
                r6 = 0
            L_0x023a:
                if (r6 == 0) goto L_0x023f
                r15.add(r1)
            L_0x023f:
                r1 = r27
                r7 = r20
                r9 = r21
                r11 = r22
                r10 = r23
                r6 = r24
                goto L_0x0194
            L_0x024d:
                r24 = r6
                r21 = r9
                r23 = r10
                m0.r.t.a.r.c.r0.f$a r1 = m0.r.t.a.r.c.r0.f.i
                m0.r.t.a.r.c.r0.f r1 = r1.a(r15)
                m0.r.t.a.r.c.r0.f r6 = r14.getAnnotations()
                m0.r.t.a.r.c.r0.f r1 = i0.j.f.p.h.M(r1, r6)
                goto L_0x0281
            L_0x0262:
                r24 = r6
                r21 = r9
                r23 = r10
                r17 = r15
                if (r12 == 0) goto L_0x027d
                m0.r.t.a.r.c.r0.a r1 = r0.a
                if (r1 == 0) goto L_0x027d
                m0.r.t.a.r.c.r0.f r1 = r1.getAnnotations()
                m0.r.t.a.r.c.r0.f r6 = r14.getAnnotations()
                m0.r.t.a.r.c.r0.f r1 = i0.j.f.p.h.M(r1, r6)
                goto L_0x0281
            L_0x027d:
                m0.r.t.a.r.c.r0.f r1 = r14.getAnnotations()
            L_0x0281:
                if (r12 == 0) goto L_0x0299
                m0.r.t.a.r.e.a.u.c r6 = r0.e
                m0.r.t.a.r.e.a.o r6 = r6.a()
                if (r6 != 0) goto L_0x028d
                r15 = 0
                goto L_0x029b
            L_0x028d:
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r7 = r0.f
                java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, m0.r.t.a.r.e.a.k> r6 = r6.a
                java.lang.Object r6 = r6.get(r7)
                r15 = r6
                m0.r.t.a.r.e.a.k r15 = (m0.r.t.a.r.e.a.k) r15
                goto L_0x029b
            L_0x0299:
                r15 = r17
            L_0x029b:
                if (r15 != 0) goto L_0x029e
                goto L_0x02af
            L_0x029e:
                boolean r6 = r15.c
                if (r6 != 0) goto L_0x02ab
                boolean r6 = m0.r.t.a.r.m.a1.a.z2(r14)
                if (r6 != 0) goto L_0x02a9
                goto L_0x02ab
            L_0x02a9:
                r6 = 0
                goto L_0x02ac
            L_0x02ab:
                r6 = 1
            L_0x02ac:
                if (r6 == 0) goto L_0x02af
                goto L_0x02b0
            L_0x02af:
                r15 = 0
            L_0x02b0:
                m0.r.t.a.r.m.j0 r6 = r14.I0()
                m0.r.t.a.r.c.f r6 = r6.c()
                boolean r7 = r6 instanceof m0.r.t.a.r.c.m0
                if (r7 == 0) goto L_0x02bf
                m0.r.t.a.r.c.m0 r6 = (m0.r.t.a.r.c.m0) r6
                goto L_0x02c0
            L_0x02bf:
                r6 = 0
            L_0x02c0:
                if (r6 != 0) goto L_0x02c4
                r6 = 0
                goto L_0x02c8
            L_0x02c4:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = r0.a(r6)
            L_0x02c8:
                r7 = 2
                if (r6 != 0) goto L_0x02d6
                kotlin.Pair r6 = new kotlin.Pair
                java.lang.Boolean r9 = java.lang.Boolean.FALSE
                r10 = 0
                r6.<init>(r10, r9)
                r17 = r4
                goto L_0x02f0
            L_0x02d6:
                r10 = 0
                kotlin.Pair r9 = new kotlin.Pair
                m0.r.t.a.r.e.a.x.g r11 = new m0.r.t.a.r.e.a.x.g
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                r17 = r4
                r4 = 0
                r11.<init>(r10, r4, r7)
                if (r6 != r10) goto L_0x02e7
                r4 = 1
                goto L_0x02e8
            L_0x02e7:
                r4 = 0
            L_0x02e8:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r9.<init>(r11, r4)
                r6 = r9
            L_0x02f0:
                A r4 = r6.c
                m0.r.t.a.r.e.a.x.g r4 = (m0.r.t.a.r.e.a.x.g) r4
                B r6 = r6.d
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                boolean r9 = r0.g
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                java.util.Iterator r11 = r1.iterator()
            L_0x0304:
                boolean r20 = r11.hasNext()
                if (r20 == 0) goto L_0x031b
                java.lang.Object r20 = r11.next()
                r7 = r20
                m0.r.t.a.r.c.r0.c r7 = (m0.r.t.a.r.c.r0.c) r7
                m0.r.t.a.r.e.a.x.g r7 = r10.b(r7, r5, r9)
                if (r7 == 0) goto L_0x0319
                goto L_0x031c
            L_0x0319:
                r7 = 2
                goto L_0x0304
            L_0x031b:
                r7 = 0
            L_0x031c:
                if (r7 != 0) goto L_0x031f
                goto L_0x0322
            L_0x031f:
                if (r13 != 0) goto L_0x0322
                goto L_0x0323
            L_0x0322:
                r7 = 0
            L_0x0323:
                if (r7 != 0) goto L_0x0371
                if (r4 != 0) goto L_0x033a
                if (r15 != 0) goto L_0x032a
                goto L_0x032e
            L_0x032a:
                m0.r.t.a.r.e.a.x.g r4 = r15.a
                if (r4 != 0) goto L_0x0330
            L_0x032e:
                r4 = 0
                goto L_0x033a
            L_0x0330:
                m0.r.t.a.r.e.a.x.g r5 = new m0.r.t.a.r.e.a.x.g
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = r4.a
                boolean r4 = r4.b
                r5.<init>(r9, r4)
                r4 = r5
            L_0x033a:
                if (r8 != 0) goto L_0x033e
                r5 = 0
                goto L_0x0342
            L_0x033e:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r0.a(r8)
            L_0x0342:
                if (r5 != 0) goto L_0x0345
                goto L_0x0372
            L_0x0345:
                if (r4 != 0) goto L_0x034e
                m0.r.t.a.r.e.a.x.g r4 = new m0.r.t.a.r.e.a.x.g
                r8 = 0
                r4.<init>(r5, r8)
                goto L_0x0372
            L_0x034e:
                m0.r.t.a.r.e.a.x.g r8 = new m0.r.t.a.r.e.a.x.g
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
                if (r5 != r9) goto L_0x0357
                goto L_0x035e
            L_0x0357:
                if (r4 != r9) goto L_0x035a
                goto L_0x0362
            L_0x035a:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r5 != r9) goto L_0x0360
            L_0x035e:
                r5 = r4
                goto L_0x0362
            L_0x0360:
                if (r4 != r9) goto L_0x0365
            L_0x0362:
                r4 = 2
                r9 = 0
                goto L_0x036c
            L_0x0365:
                if (r5 != r4) goto L_0x0369
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            L_0x0369:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x0362
            L_0x036c:
                r8.<init>(r5, r9, r4)
                r4 = r8
                goto L_0x0372
            L_0x0371:
                r4 = r7
            L_0x0372:
                if (r7 == 0) goto L_0x037b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r7.a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r5 != r6) goto L_0x039d
                goto L_0x039f
            L_0x037b:
                if (r6 != 0) goto L_0x039f
                if (r15 != 0) goto L_0x0381
                r5 = 0
                goto L_0x0394
            L_0x0381:
                m0.r.t.a.r.e.a.x.g r5 = r15.a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r5.a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r5 != r6) goto L_0x038f
                boolean r5 = r15.c
                if (r5 == 0) goto L_0x038f
                r5 = 1
                goto L_0x0390
            L_0x038f:
                r5 = 0
            L_0x0390:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            L_0x0394:
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r5 = m0.n.b.i.a(r5, r6)
                if (r5 == 0) goto L_0x039d
                goto L_0x039f
            L_0x039d:
                r5 = 0
                goto L_0x03a0
            L_0x039f:
                r5 = 1
            L_0x03a0:
                m0.r.t.a.r.e.a.x.e r6 = new m0.r.t.a.r.e.a.x.e
                if (r4 != 0) goto L_0x03a6
                r7 = 0
                goto L_0x03a8
            L_0x03a6:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r7 = r4.a
            L_0x03a8:
                java.util.List<m0.r.t.a.r.g.b> r8 = m0.r.t.a.r.e.a.r.l
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                java.lang.Object r8 = d(r8, r1, r9)
                java.util.List<m0.r.t.a.r.g.b> r10 = m0.r.t.a.r.e.a.r.m
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                java.lang.Object r1 = d(r10, r1, r11)
                if (r8 == 0) goto L_0x03c5
                if (r1 == 0) goto L_0x03c5
                boolean r10 = m0.n.b.i.a(r8, r1)
                if (r10 == 0) goto L_0x03c3
                goto L_0x03c5
            L_0x03c3:
                r8 = 0
                goto L_0x03c8
            L_0x03c5:
                if (r8 != 0) goto L_0x03c8
                r8 = r1
            L_0x03c8:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r8
                if (r5 == 0) goto L_0x03d4
                boolean r1 = m0.r.t.a.r.m.a1.a.z2(r14)
                if (r1 == 0) goto L_0x03d4
                r1 = 1
                goto L_0x03d5
            L_0x03d4:
                r1 = 0
            L_0x03d5:
                if (r4 != 0) goto L_0x03d9
                r4 = 0
                goto L_0x03df
            L_0x03d9:
                boolean r4 = r4.b
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            L_0x03df:
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                boolean r4 = m0.n.b.i.a(r4, r5)
                r6.<init>(r7, r8, r1, r4)
                r5 = 1
                r4 = r4 ^ r5
                if (r4 == 0) goto L_0x03ed
                goto L_0x03ee
            L_0x03ed:
                r6 = 0
            L_0x03ee:
                if (r6 != 0) goto L_0x03f2
                r4 = 0
                goto L_0x03f4
            L_0x03f2:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r6.c
            L_0x03f4:
                boolean r5 = r0.d
                if (r5 == 0) goto L_0x03fc
                if (r12 == 0) goto L_0x03fc
                r5 = 1
                goto L_0x03fd
            L_0x03fc:
                r5 = 0
            L_0x03fd:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = i0.j.f.p.h.L3(r3, r4, r5)
                if (r6 != 0) goto L_0x0404
                goto L_0x0428
            L_0x0404:
                m0.r.t.a.r.c.r0.a r10 = r0.a
                boolean r13 = r10 instanceof m0.r.t.a.r.c.o0
                if (r13 != 0) goto L_0x040b
                r10 = 0
            L_0x040b:
                m0.r.t.a.r.c.o0 r10 = (m0.r.t.a.r.c.o0) r10
                if (r10 != 0) goto L_0x0411
                r10 = 0
                goto L_0x0415
            L_0x0411:
                m0.r.t.a.r.m.v r10 = r10.k0()
            L_0x0415:
                if (r10 == 0) goto L_0x0419
                r10 = 1
                goto L_0x041a
            L_0x0419:
                r10 = 0
            L_0x041a:
                if (r10 == 0) goto L_0x0424
                if (r12 == 0) goto L_0x0424
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r6 != r10) goto L_0x0424
                r10 = 1
                goto L_0x0425
            L_0x0424:
                r10 = 0
            L_0x0425:
                if (r10 != 0) goto L_0x0428
                goto L_0x0429
            L_0x0428:
                r6 = 0
            L_0x0429:
                java.lang.Object r2 = i0.j.f.p.h.K3(r2, r11, r9, r8, r5)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r2
                if (r7 != r4) goto L_0x043c
                r4 = r17
                boolean r3 = m0.n.b.i.a(r4, r3)
                if (r3 != 0) goto L_0x043a
                goto L_0x043e
            L_0x043a:
                r3 = 0
                goto L_0x043f
            L_0x043c:
                r4 = r17
            L_0x043e:
                r3 = 1
            L_0x043f:
                if (r1 != 0) goto L_0x0464
                boolean r1 = r24.isEmpty()
                if (r1 == 0) goto L_0x0448
                goto L_0x045e
            L_0x0448:
                java.util.Iterator r1 = r24.iterator()
            L_0x044c:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L_0x045e
                java.lang.Object r8 = r1.next()
                m0.r.t.a.r.e.a.x.e r8 = (m0.r.t.a.r.e.a.x.e) r8
                boolean r8 = r8.e
                if (r8 == 0) goto L_0x044c
                r1 = 1
                goto L_0x045f
            L_0x045e:
                r1 = 0
            L_0x045f:
                if (r1 == 0) goto L_0x0462
                goto L_0x0464
            L_0x0462:
                r1 = 0
                goto L_0x0465
            L_0x0464:
                r1 = 1
            L_0x0465:
                if (r6 != 0) goto L_0x0473
                if (r3 == 0) goto L_0x0473
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = i0.j.f.p.h.L3(r4, r7, r5)
                r4 = 1
                m0.r.t.a.r.e.a.x.e r1 = i0.j.f.p.h.p0(r3, r2, r4, r1)
                goto L_0x047c
            L_0x0473:
                if (r6 != 0) goto L_0x0477
                r3 = 1
                goto L_0x0478
            L_0x0477:
                r3 = 0
            L_0x0478:
                m0.r.t.a.r.e.a.x.e r1 = i0.j.f.p.h.p0(r6, r2, r3, r1)
            L_0x047c:
                r21[r23] = r1
                int r10 = r23 + 1
                r1 = r27
                r2 = r16
                r3 = r18
                r5 = r19
                r9 = r21
                r4 = 10
                r6 = 1
                r7 = 0
                goto L_0x007c
            L_0x0490:
                r21 = r9
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                r2 = r21
                r1.<init>(r2)
                r2 = r27
                if (r2 != 0) goto L_0x049f
                r3 = 0
                goto L_0x04a4
            L_0x049f:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1
                r3.<init>(r2, r1)
            L_0x04a4:
                m0.r.t.a.r.m.v r2 = r0.b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.c
                boolean r2 = m0.r.t.a.r.m.s0.c(r2, r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                m0.r.t.a.r.e.a.x.d r4 = r4.c
                m0.r.t.a.r.m.v r5 = r0.b
                if (r3 != 0) goto L_0x04b5
                goto L_0x04b6
            L_0x04b5:
                r1 = r3
            L_0x04b6:
                java.util.Objects.requireNonNull(r4)
                m0.n.b.i.e(r5, r11)
                java.lang.String r3 = "qualifiers"
                m0.n.b.i.e(r1, r3)
                m0.r.t.a.r.m.v0 r3 = r5.L0()
                r5 = 0
                m0.r.t.a.r.e.a.x.d$a r1 = r4.b(r3, r1, r5)
                m0.r.t.a.r.m.v r3 = r1.a()
                boolean r1 = r1.c
                if (r1 == 0) goto L_0x04d3
                goto L_0x04d4
            L_0x04d3:
                r3 = 0
            L_0x04d4:
                if (r3 != 0) goto L_0x04d8
                r7 = 0
                goto L_0x04de
            L_0x04d8:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r7 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a
                r1 = 1
                r7.<init>(r3, r1, r2)
            L_0x04de:
                if (r7 != 0) goto L_0x04e8
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r7 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a
                m0.r.t.a.r.m.v r1 = r0.b
                r3 = 0
                r7.<init>(r1, r3, r2)
            L_0x04e8:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.b(m0.r.t.a.r.e.a.x.k):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
            if (r1.containsKey(r0) != false) goto L_0x0086;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final m0.r.t.a.r.e.a.x.e c(m0.r.t.a.r.m.v r11) {
            /*
                r10 = this;
                boolean r0 = i0.j.f.p.h.k2(r11)
                if (r0 == 0) goto L_0x0014
                m0.r.t.a.r.m.q r0 = i0.j.f.p.h.t(r11)
                kotlin.Pair r1 = new kotlin.Pair
                m0.r.t.a.r.m.a0 r2 = r0.d
                m0.r.t.a.r.m.a0 r0 = r0.q
                r1.<init>(r2, r0)
                goto L_0x0019
            L_0x0014:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r11, r11)
            L_0x0019:
                A r0 = r1.c
                m0.r.t.a.r.m.v r0 = (m0.r.t.a.r.m.v) r0
                B r1 = r1.d
                m0.r.t.a.r.m.v r1 = (m0.r.t.a.r.m.v) r1
                m0.r.t.a.r.e.a.x.e r8 = new m0.r.t.a.r.e.a.x.e
                boolean r2 = r0.J0()
                r3 = 0
                if (r2 == 0) goto L_0x002e
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L_0x002c:
                r4 = r2
                goto L_0x0038
            L_0x002e:
                boolean r2 = r1.J0()
                if (r2 != 0) goto L_0x0037
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x002c
            L_0x0037:
                r4 = r3
            L_0x0038:
                java.lang.String r2 = "type"
                m0.n.b.i.e(r0, r2)
                m0.r.t.a.r.c.d r0 = m0.r.t.a.r.m.s0.e(r0)
                r5 = 1
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.Map<K, *>"
                r7 = 0
                if (r0 == 0) goto L_0x005f
                java.lang.String r9 = "readOnly"
                m0.n.b.i.e(r0, r9)
                m0.r.t.a.r.b.k.c r9 = m0.r.t.a.r.b.k.c.a
                m0.r.t.a.r.g.c r0 = m0.r.t.a.r.j.d.g(r0)
                java.util.HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.b> r9 = m0.r.t.a.r.b.k.c.l
                java.util.Objects.requireNonNull(r9, r6)
                boolean r0 = r9.containsKey(r0)
                if (r0 == 0) goto L_0x005f
                r0 = r5
                goto L_0x0060
            L_0x005f:
                r0 = r7
            L_0x0060:
                if (r0 == 0) goto L_0x0065
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L_0x008c
            L_0x0065:
                m0.n.b.i.e(r1, r2)
                m0.r.t.a.r.c.d r0 = m0.r.t.a.r.m.s0.e(r1)
                if (r0 == 0) goto L_0x0085
                java.lang.String r1 = "mutable"
                m0.n.b.i.e(r0, r1)
                m0.r.t.a.r.b.k.c r1 = m0.r.t.a.r.b.k.c.a
                m0.r.t.a.r.g.c r0 = m0.r.t.a.r.j.d.g(r0)
                java.util.HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.b> r1 = m0.r.t.a.r.b.k.c.k
                java.util.Objects.requireNonNull(r1, r6)
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                r5 = r7
            L_0x0086:
                if (r5 == 0) goto L_0x008b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                goto L_0x008c
            L_0x008b:
                r0 = r3
            L_0x008c:
                m0.r.t.a.r.m.v0 r11 = r11.L0()
                boolean r5 = r11 instanceof m0.r.t.a.r.e.a.x.f
                r6 = 0
                r7 = 8
                r2 = r8
                r3 = r4
                r4 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.c(m0.r.t.a.r.m.v):m0.r.t.a.r.e.a.x.e");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SignatureParts(m0.r.t.a.r.c.r0.a aVar, v vVar, Collection collection, boolean z, m0.r.t.a.r.e.a.u.c cVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i) {
            this(SignatureEnhancement.this, aVar, vVar, collection, z, cVar, annotationQualifierApplicabilityType, (i & 64) != 0 ? false : z2);
        }
    }
}
