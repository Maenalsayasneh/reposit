package m0.r.t.a.r.m;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.m.x0.b;
import m0.r.t.a.r.m.z0.c;
import m0.r.t.a.r.m.z0.f;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.j;

/* compiled from: AbstractTypeChecker.kt */
public final class e {
    public static final e a = new e();

    public static final boolean a(AbstractTypeCheckerContext abstractTypeCheckerContext, e eVar, g gVar, g gVar2, boolean z) {
        boolean z2;
        b bVar = (b) abstractTypeCheckerContext;
        i.e(bVar, "this");
        i.e(gVar, "receiver");
        j s4 = h.s4(bVar, gVar);
        if (s4 instanceof IntegerLiteralTypeConstructor) {
            Set<v> set = ((IntegerLiteralTypeConstructor) s4).c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (f fVar : set) {
                    if (i.a(h.t4(abstractTypeCheckerContext, fVar), h.s4(bVar, gVar2)) || (z && g(eVar, abstractTypeCheckerContext, gVar2, fVar, false, 8))) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: m0.r.t.a.r.m.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: m0.r.t.a.r.m.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024d, code lost:
        if (((m0.r.t.a.r.m.x0.g) r4).Z1 != false) goto L_0x02b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x05d1 A[LOOP:8: B:234:0x0588->B:255:0x05d1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0804  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x05df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(m0.r.t.a.r.m.e r25, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext r26, m0.r.t.a.r.m.z0.f r27, m0.r.t.a.r.m.z0.f r28, boolean r29, int r30) {
        /*
            r6 = r25
            r7 = r26
            r0 = r27
            r1 = r28
            java.util.Objects.requireNonNull(r25)
            java.lang.String r8 = "context"
            m0.n.b.i.e(r7, r8)
            java.lang.String r9 = "subType"
            m0.n.b.i.e(r0, r9)
            java.lang.String r10 = "superType"
            m0.n.b.i.e(r1, r10)
            if (r0 != r1) goto L_0x001e
            goto L_0x0746
        L_0x001e:
            m0.n.b.i.e(r0, r9)
            m0.n.b.i.e(r1, r10)
            m0.r.t.a.r.m.z0.f r0 = r26.J(r27)
            m0.r.t.a.r.m.z0.f r11 = r7.I(r0)
            m0.r.t.a.r.m.z0.f r0 = r7.J(r1)
            m0.r.t.a.r.m.z0.f r12 = r7.I(r0)
            m0.r.t.a.r.m.z0.g r13 = i0.j.f.p.h.O2(r7, r11)
            m0.r.t.a.r.m.z0.g r14 = i0.j.f.p.h.A4(r7, r12)
            r15 = r7
            m0.r.t.a.r.m.x0.b r15 = (m0.r.t.a.r.m.x0.b) r15
            boolean r0 = r15.R(r13)
            java.lang.String r5 = "this"
            java.lang.String r4 = "receiver"
            java.lang.String r3 = "ClassicTypeSystemContext couldn't handle: "
            java.lang.String r2 = ", "
            r16 = 0
            if (r0 != 0) goto L_0x01cf
            boolean r0 = r15.R(r14)
            if (r0 == 0) goto L_0x0057
            goto L_0x01cf
        L_0x0057:
            r15.U(r13)
            r15.U(r14)
            m0.r.t.a.r.m.z0.b r0 = i0.j.f.p.h.r(r15, r14)
            if (r0 != 0) goto L_0x0065
            r0 = r14
            goto L_0x0073
        L_0x0065:
            m0.n.b.i.e(r15, r5)
            m0.n.b.i.e(r0, r4)
            boolean r1 = r0 instanceof m0.r.t.a.r.m.i
            if (r1 == 0) goto L_0x01a7
            m0.r.t.a.r.m.i r0 = (m0.r.t.a.r.m.i) r0
            m0.r.t.a.r.m.a0 r0 = r0.d
        L_0x0073:
            m0.n.b.i.e(r15, r5)
            m0.n.b.i.e(r0, r4)
            boolean r1 = r0 instanceof m0.r.t.a.r.m.a0
            if (r1 == 0) goto L_0x0194
            boolean r1 = r0 instanceof m0.r.t.a.r.m.x0.g
            if (r1 == 0) goto L_0x0084
            m0.r.t.a.r.m.x0.g r0 = (m0.r.t.a.r.m.x0.g) r0
            goto L_0x0086
        L_0x0084:
            r0 = r16
        L_0x0086:
            if (r0 != 0) goto L_0x008b
            r1 = r16
            goto L_0x0093
        L_0x008b:
            m0.n.b.i.e(r15, r5)
            m0.n.b.i.e(r0, r4)
            m0.r.t.a.r.m.v0 r1 = r0.x
        L_0x0093:
            if (r0 == 0) goto L_0x0147
            if (r1 == 0) goto L_0x0147
            boolean r17 = i0.j.f.p.h.p2(r15, r14)
            if (r17 == 0) goto L_0x00dd
            m0.n.b.i.e(r15, r5)
            m0.n.b.i.e(r1, r4)
            r27 = r2
            boolean r2 = r1 instanceof m0.r.t.a.r.m.z0.g
            if (r2 == 0) goto L_0x00b3
            m0.r.t.a.r.m.z0.g r1 = (m0.r.t.a.r.m.z0.g) r1
            r2 = 1
            m0.r.t.a.r.m.z0.g r1 = i0.j.f.p.h.F4(r15, r1, r2)
            r28 = r3
            goto L_0x00f4
        L_0x00b3:
            boolean r2 = r1 instanceof m0.r.t.a.r.m.z0.d
            if (r2 == 0) goto L_0x00d1
            m0.r.t.a.r.m.z0.d r1 = (m0.r.t.a.r.m.z0.d) r1
            m0.r.t.a.r.m.z0.g r2 = i0.j.f.p.h.N2(r15, r1)
            r28 = r3
            r3 = 1
            m0.r.t.a.r.m.z0.g r2 = i0.j.f.p.h.F4(r15, r2, r3)
            m0.r.t.a.r.m.z0.g r1 = i0.j.f.p.h.z4(r15, r1)
            m0.r.t.a.r.m.z0.g r1 = i0.j.f.p.h.F4(r15, r1, r3)
            m0.r.t.a.r.m.z0.f r1 = i0.j.f.p.h.m0(r15, r2, r1)
            goto L_0x00f4
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sealed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r27 = r2
            r28 = r3
            boolean r2 = r15.E(r14)
            if (r2 == 0) goto L_0x00f4
            m0.n.b.i.e(r15, r5)
            m0.n.b.i.e(r1, r4)
            r2 = 0
            r3 = 1
            m0.r.t.a.r.m.v0 r1 = m0.r.t.a.r.m.d0.b(r1, r2, r3)
            goto L_0x00f5
        L_0x00f4:
            r3 = 1
        L_0x00f5:
            r17 = r1
            m0.n.b.i.e(r13, r9)
            m0.n.b.i.e(r0, r10)
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$LowerCapturedTypePolicy r0 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x012e
            if (r0 == r3) goto L_0x010c
            r21 = r27
            r20 = r28
            goto L_0x014b
        L_0x010c:
            r18 = 0
            r19 = 8
            r0 = r25
            r1 = r15
            r3 = r27
            r2 = r13
            r20 = r28
            r21 = r3
            r3 = r17
            r6 = r4
            r4 = r18
            r18 = r6
            r6 = r5
            r5 = r19
            boolean r0 = g(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x014e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x018e
        L_0x012e:
            r21 = r27
            r20 = r28
            r18 = r4
            r6 = r5
            r4 = 0
            r5 = 8
            r0 = r25
            r1 = r15
            r2 = r13
            r3 = r17
            boolean r0 = g(r0, r1, r2, r3, r4, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x018e
        L_0x0147:
            r21 = r2
            r20 = r3
        L_0x014b:
            r18 = r4
            r6 = r5
        L_0x014e:
            m0.r.t.a.r.m.z0.j r0 = i0.j.f.p.h.s4(r15, r14)
            boolean r1 = r15.T(r0)
            if (r1 == 0) goto L_0x018c
            i0.j.f.p.h.p2(r15, r14)
            java.util.Collection r0 = r15.W(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0166
            goto L_0x0186
        L_0x0166:
            java.util.Iterator r14 = r0.iterator()
        L_0x016a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r14.next()
            r3 = r0
            m0.r.t.a.r.m.z0.f r3 = (m0.r.t.a.r.m.z0.f) r3
            r4 = 0
            r5 = 8
            r0 = r25
            r1 = r15
            r2 = r13
            boolean r0 = g(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x016a
            r0 = 0
            goto L_0x0187
        L_0x0186:
            r0 = 1
        L_0x0187:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x018e
        L_0x018c:
            r0 = r16
        L_0x018e:
            r1 = r20
            r2 = r21
            goto L_0x0207
        L_0x0194:
            r1 = r3
            java.lang.StringBuilder r1 = i0.d.a.a.a.W0(r1, r0, r2)
            java.lang.String r0 = i0.d.a.a.a.I0(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01a7:
            r1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.Class r0 = r0.getClass()
            m0.r.d r0 = m0.n.b.m.a(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01cf:
            r1 = r3
            r18 = r4
            r6 = r5
            boolean r0 = r15.e
            if (r0 == 0) goto L_0x01da
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0207
        L_0x01da:
            boolean r0 = i0.j.f.p.h.p2(r15, r13)
            if (r0 == 0) goto L_0x01e9
            boolean r0 = i0.j.f.p.h.p2(r15, r14)
            if (r0 != 0) goto L_0x01e9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0207
        L_0x01e9:
            r0 = 0
            m0.r.t.a.r.m.z0.g r3 = i0.j.f.p.h.F4(r15, r13, r0)
            m0.r.t.a.r.m.z0.g r0 = i0.j.f.p.h.F4(r15, r14, r0)
            m0.n.b.i.e(r15, r8)
            java.lang.String r4 = "a"
            m0.n.b.i.e(r3, r4)
            java.lang.String r4 = "b"
            m0.n.b.i.e(r0, r4)
            boolean r0 = m0.r.t.a.r.m.d.b(r15, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0207:
            if (r0 != 0) goto L_0x080d
            r7.z(r11, r12)
            m0.r.t.a.r.m.z0.g r0 = i0.j.f.p.h.O2(r7, r11)
            m0.r.t.a.r.m.z0.g r3 = i0.j.f.p.h.A4(r7, r12)
            m0.n.b.i.e(r7, r8)
            m0.n.b.i.e(r0, r9)
            m0.n.b.i.e(r3, r10)
            boolean r4 = i0.j.f.p.h.p2(r15, r3)
            java.lang.String r5 = "<this>"
            java.lang.String r8 = "current"
            java.lang.String r10 = ". Supertypes = "
            java.lang.String r11 = "Too many supertypes for type: "
            if (r4 == 0) goto L_0x022c
            goto L_0x0232
        L_0x022c:
            boolean r4 = r7.E(r0)
            if (r4 == 0) goto L_0x0236
        L_0x0232:
            r12 = r18
            goto L_0x02b7
        L_0x0236:
            boolean r4 = r0 instanceof m0.r.t.a.r.m.z0.a
            if (r4 == 0) goto L_0x0277
            r4 = r0
            m0.r.t.a.r.m.z0.a r4 = (m0.r.t.a.r.m.z0.a) r4
            m0.n.b.i.e(r15, r6)
            r12 = r18
            m0.n.b.i.e(r4, r12)
            boolean r13 = r4 instanceof m0.r.t.a.r.m.x0.g
            if (r13 == 0) goto L_0x0250
            m0.r.t.a.r.m.x0.g r4 = (m0.r.t.a.r.m.x0.g) r4
            boolean r4 = r4.Z1
            if (r4 == 0) goto L_0x0279
            goto L_0x02b7
        L_0x0250:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.Class r1 = r4.getClass()
            m0.r.d r1 = m0.n.b.m.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0277:
            r12 = r18
        L_0x0279:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$b r4 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.b.a
            boolean r4 = m0.r.t.a.r.m.c.a(r7, r0, r4)
            if (r4 == 0) goto L_0x0282
            goto L_0x02b7
        L_0x0282:
            boolean r4 = r7.E(r3)
            if (r4 == 0) goto L_0x0289
            goto L_0x0298
        L_0x0289:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$d r4 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.d.a
            boolean r4 = m0.r.t.a.r.m.c.a(r7, r3, r4)
            if (r4 == 0) goto L_0x0292
            goto L_0x0298
        L_0x0292:
            boolean r4 = r7.D(r0)
            if (r4 == 0) goto L_0x02a0
        L_0x0298:
            r20 = r1
            r27 = r2
            r18 = r12
            goto L_0x0376
        L_0x02a0:
            m0.r.t.a.r.m.z0.j r4 = i0.j.f.p.h.s4(r15, r3)
            m0.n.b.i.e(r7, r5)
            java.lang.String r13 = "start"
            m0.n.b.i.e(r0, r13)
            java.lang.String r13 = "end"
            m0.n.b.i.e(r4, r13)
            boolean r13 = m0.r.t.a.r.m.c.b(r7, r0, r4)
            if (r13 == 0) goto L_0x02bf
        L_0x02b7:
            r20 = r1
            r27 = r2
            r18 = r12
            goto L_0x0337
        L_0x02bf:
            r26.C()
            java.util.ArrayDeque<m0.r.t.a.r.m.z0.g> r13 = r7.c
            m0.n.b.i.c(r13)
            java.util.Set<m0.r.t.a.r.m.z0.g> r14 = r7.d
            m0.n.b.i.c(r14)
            r13.push(r0)
        L_0x02cf:
            boolean r17 = r13.isEmpty()
            r17 = r17 ^ 1
            if (r17 == 0) goto L_0x036d
            r18 = r12
            int r12 = r14.size()
            r20 = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r12 > r1) goto L_0x0344
            java.lang.Object r1 = r13.pop()
            m0.r.t.a.r.m.z0.g r1 = (m0.r.t.a.r.m.z0.g) r1
            m0.n.b.i.d(r1, r8)
            boolean r12 = r14.add(r1)
            if (r12 != 0) goto L_0x02f5
            r27 = r2
            goto L_0x033d
        L_0x02f5:
            boolean r12 = i0.j.f.p.h.p2(r15, r1)
            if (r12 == 0) goto L_0x02fe
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$c r12 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.c.a
            goto L_0x0300
        L_0x02fe:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$b r12 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.b.a
        L_0x0300:
            r27 = r2
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$c r2 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.c.a
            boolean r2 = m0.n.b.i.a(r12, r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r12 = r16
        L_0x030f:
            if (r12 != 0) goto L_0x0312
            goto L_0x033d
        L_0x0312:
            m0.r.t.a.r.m.z0.j r1 = i0.j.f.p.h.s4(r15, r1)
            java.util.Collection r1 = r15.W(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x031e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x033d
            java.lang.Object r2 = r1.next()
            m0.r.t.a.r.m.z0.f r2 = (m0.r.t.a.r.m.z0.f) r2
            m0.r.t.a.r.m.z0.g r2 = r12.a(r7, r2)
            boolean r17 = m0.r.t.a.r.m.c.b(r7, r2, r4)
            if (r17 == 0) goto L_0x0339
            r26.A()
        L_0x0337:
            r1 = 1
            goto L_0x0377
        L_0x0339:
            r13.add(r2)
            goto L_0x031e
        L_0x033d:
            r2 = r27
            r12 = r18
            r1 = r20
            goto L_0x02cf
        L_0x0344:
            java.lang.StringBuilder r0 = i0.d.a.a.a.W0(r11, r0, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r14
            java.lang.String r1 = m0.j.g.E(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x036d:
            r20 = r1
            r27 = r2
            r18 = r12
            r26.A()
        L_0x0376:
            r1 = 0
        L_0x0377:
            if (r1 != 0) goto L_0x037b
            goto L_0x07ec
        L_0x037b:
            m0.r.t.a.r.m.z0.g r1 = i0.j.f.p.h.O2(r7, r0)
            m0.r.t.a.r.m.z0.g r2 = i0.j.f.p.h.A4(r7, r3)
            boolean r4 = r7.G(r1)
            if (r4 != 0) goto L_0x0392
            boolean r4 = r7.G(r2)
            if (r4 != 0) goto L_0x0392
            r1 = r16
            goto L_0x03a0
        L_0x0392:
            boolean r4 = r7.G(r1)
            if (r4 == 0) goto L_0x03a6
            boolean r4 = r7.G(r2)
            if (r4 == 0) goto L_0x03a6
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x03a0:
            r12 = r25
            r13 = r18
            goto L_0x041e
        L_0x03a6:
            boolean r4 = r7.G(r1)
            if (r4 == 0) goto L_0x03bb
            r4 = 0
            r12 = r25
            r13 = r18
            boolean r1 = a(r7, r12, r1, r2, r4)
            if (r1 == 0) goto L_0x041c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x041e
        L_0x03bb:
            r12 = r25
            r13 = r18
            boolean r4 = r7.G(r2)
            if (r4 == 0) goto L_0x041c
            m0.r.t.a.r.m.z0.j r4 = i0.j.f.p.h.s4(r15, r1)
            boolean r14 = r4 instanceof m0.r.t.a.r.m.z0.e
            if (r14 == 0) goto L_0x040f
            java.util.Collection r4 = r15.W(r4)
            boolean r14 = r4.isEmpty()
            if (r14 == 0) goto L_0x03d8
            goto L_0x040a
        L_0x03d8:
            java.util.Iterator r4 = r4.iterator()
        L_0x03dc:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x040a
            java.lang.Object r14 = r4.next()
            m0.r.t.a.r.m.z0.f r14 = (m0.r.t.a.r.m.z0.f) r14
            m0.r.t.a.r.m.z0.g r14 = i0.j.f.p.h.y(r15, r14)
            if (r14 != 0) goto L_0x03f3
            r28 = r4
            r14 = r16
            goto L_0x03fd
        L_0x03f3:
            boolean r14 = r7.G(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r28 = r4
        L_0x03fd:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = m0.n.b.i.a(r14, r4)
            if (r4 == 0) goto L_0x0407
            r4 = 1
            goto L_0x040b
        L_0x0407:
            r4 = r28
            goto L_0x03dc
        L_0x040a:
            r4 = 0
        L_0x040b:
            if (r4 == 0) goto L_0x040f
            r4 = 1
            goto L_0x0410
        L_0x040f:
            r4 = 0
        L_0x0410:
            if (r4 != 0) goto L_0x0419
            r4 = 1
            boolean r1 = a(r7, r12, r2, r1, r4)
            if (r1 == 0) goto L_0x041c
        L_0x0419:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x041e
        L_0x041c:
            r1 = r16
        L_0x041e:
            if (r1 != 0) goto L_0x0804
            m0.r.t.a.r.m.z0.j r1 = i0.j.f.p.h.s4(r15, r3)
            m0.r.t.a.r.m.z0.j r2 = i0.j.f.p.h.s4(r15, r0)
            boolean r2 = r15.v(r2, r1)
            if (r2 == 0) goto L_0x0436
            int r2 = r15.V(r1)
            if (r2 != 0) goto L_0x0436
            goto L_0x0746
        L_0x0436:
            m0.r.t.a.r.m.z0.j r2 = i0.j.f.p.h.s4(r15, r3)
            m0.n.b.i.e(r15, r6)
            m0.n.b.i.e(r2, r13)
            boolean r4 = r2 instanceof m0.r.t.a.r.m.j0
            if (r4 == 0) goto L_0x07ee
            m0.r.t.a.r.m.j0 r2 = (m0.r.t.a.r.m.j0) r2
            m0.r.t.a.r.g.c r4 = m0.r.t.a.r.b.g.a.b
            boolean r2 = m0.r.t.a.r.b.f.L(r2, r4)
            if (r2 == 0) goto L_0x0450
            goto L_0x0746
        L_0x0450:
            m0.n.b.i.e(r7, r5)
            m0.n.b.i.e(r0, r9)
            java.lang.String r2 = "superConstructor"
            m0.n.b.i.e(r1, r2)
            boolean r2 = r7.D(r0)
            if (r2 == 0) goto L_0x0466
            java.util.List r2 = r12.c(r7, r0, r1)
            goto L_0x0476
        L_0x0466:
            boolean r2 = i0.j.f.p.h.d2(r15, r1)
            if (r2 != 0) goto L_0x047a
            boolean r2 = i0.j.f.p.h.m2(r15, r1)
            if (r2 != 0) goto L_0x047a
            java.util.List r2 = r12.b(r7, r0, r1)
        L_0x0476:
            r27 = r8
            goto L_0x0543
        L_0x047a:
            m0.r.t.a.r.o.i r2 = new m0.r.t.a.r.o.i
            r2.<init>()
            r26.C()
            java.util.ArrayDeque<m0.r.t.a.r.m.z0.g> r4 = r7.c
            m0.n.b.i.c(r4)
            java.util.Set<m0.r.t.a.r.m.z0.g> r5 = r7.d
            m0.n.b.i.c(r5)
            r4.push(r0)
        L_0x048f:
            boolean r9 = r4.isEmpty()
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x051b
            int r9 = r5.size()
            r14 = 1000(0x3e8, float:1.401E-42)
            if (r9 > r14) goto L_0x04f2
            java.lang.Object r9 = r4.pop()
            m0.r.t.a.r.m.z0.g r9 = (m0.r.t.a.r.m.z0.g) r9
            m0.n.b.i.d(r9, r8)
            boolean r14 = r5.add(r9)
            if (r14 != 0) goto L_0x04af
            goto L_0x048f
        L_0x04af:
            boolean r14 = r7.D(r9)
            if (r14 == 0) goto L_0x04bb
            r2.add(r9)
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$c r14 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.c.a
            goto L_0x04bd
        L_0x04bb:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$b r14 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.b.a
        L_0x04bd:
            r27 = r8
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$c r8 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.c.a
            boolean r8 = m0.n.b.i.a(r14, r8)
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x04ca
            goto L_0x04cc
        L_0x04ca:
            r14 = r16
        L_0x04cc:
            if (r14 != 0) goto L_0x04cf
            goto L_0x04ef
        L_0x04cf:
            m0.r.t.a.r.m.z0.j r8 = i0.j.f.p.h.s4(r15, r9)
            java.util.Collection r8 = r15.W(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x04db:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x04ef
            java.lang.Object r9 = r8.next()
            m0.r.t.a.r.m.z0.f r9 = (m0.r.t.a.r.m.z0.f) r9
            m0.r.t.a.r.m.z0.g r9 = r14.a(r7, r9)
            r4.add(r9)
            goto L_0x04db
        L_0x04ef:
            r8 = r27
            goto L_0x048f
        L_0x04f2:
            java.lang.StringBuilder r0 = i0.d.a.a.a.W0(r11, r0, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r5
            java.lang.String r1 = m0.j.g.E(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x051b:
            r27 = r8
            r26.A()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0529:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0542
            java.lang.Object r5 = r2.next()
            m0.r.t.a.r.m.z0.g r5 = (m0.r.t.a.r.m.z0.g) r5
            java.lang.String r8 = "it"
            m0.n.b.i.d(r5, r8)
            java.util.List r5 = r12.c(r7, r5, r1)
            m0.j.g.b(r4, r5)
            goto L_0x0529
        L_0x0542:
            r2 = r4
        L_0x0543:
            int r4 = r2.size()
            if (r4 == 0) goto L_0x072c
            r5 = 1
            if (r4 == r5) goto L_0x071c
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r4 = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            int r5 = r15.V(r1)
            r4.<init>(r5)
            int r5 = r15.V(r1)
            if (r5 <= 0) goto L_0x06ef
            r8 = 0
            r9 = 0
        L_0x055d:
            int r10 = r8 + 1
            if (r9 != 0) goto L_0x0570
            m0.r.t.a.r.m.z0.k r9 = r15.O(r1, r8)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r9 = r15.P(r9)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r11 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT
            if (r9 == r11) goto L_0x056e
            goto L_0x0570
        L_0x056e:
            r9 = 0
            goto L_0x0571
        L_0x0570:
            r9 = 1
        L_0x0571:
            if (r9 == 0) goto L_0x0579
            r28 = r1
            r27 = r9
            goto L_0x06d9
        L_0x0579:
            java.util.ArrayList r11 = new java.util.ArrayList
            r14 = 10
            int r14 = i0.j.f.p.h.K(r2, r14)
            r11.<init>(r14)
            java.util.Iterator r14 = r2.iterator()
        L_0x0588:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x060a
            java.lang.Object r17 = r14.next()
            r28 = r1
            r1 = r17
            m0.r.t.a.r.m.z0.g r1 = (m0.r.t.a.r.m.z0.g) r1
            m0.n.b.i.e(r7, r6)
            m0.n.b.i.e(r1, r13)
            r27 = r9
            if (r8 < 0) goto L_0x05aa
            int r9 = i0.j.f.p.h.p(r15, r1)
            if (r8 >= r9) goto L_0x05aa
            r9 = 1
            goto L_0x05ab
        L_0x05aa:
            r9 = 0
        L_0x05ab:
            if (r9 == 0) goto L_0x05b2
            m0.r.t.a.r.m.z0.i r9 = i0.j.f.p.h.R0(r15, r1, r8)
            goto L_0x05b4
        L_0x05b2:
            r9 = r16
        L_0x05b4:
            if (r9 != 0) goto L_0x05b9
            r29 = r8
            goto L_0x05cd
        L_0x05b9:
            r29 = r8
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r8 = i0.j.f.p.h.L1(r15, r9)
            r30 = r9
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r9 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r8 != r9) goto L_0x05c7
            r8 = 1
            goto L_0x05c8
        L_0x05c7:
            r8 = 0
        L_0x05c8:
            if (r8 == 0) goto L_0x05cd
            r9 = r30
            goto L_0x05cf
        L_0x05cd:
            r9 = r16
        L_0x05cf:
            if (r9 == 0) goto L_0x05df
            m0.r.t.a.r.m.z0.f r1 = i0.j.f.p.h.G1(r15, r9)
            r11.add(r1)
            r9 = r27
            r1 = r28
            r8 = r29
            goto L_0x0588
        L_0x05df:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Incorrect type: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ", subType: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", superType: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x060a:
            r28 = r1
            r27 = r9
            m0.n.b.i.e(r15, r6)
            java.lang.String r1 = "types"
            m0.n.b.i.e(r11, r1)
            m0.n.b.i.e(r11, r1)
            int r1 = r11.size()
            if (r1 == 0) goto L_0x06e3
            r8 = 1
            if (r1 == r8) goto L_0x06c5
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = 10
            int r8 = i0.j.f.p.h.K(r11, r8)
            r1.<init>(r8)
            java.util.Iterator r8 = r11.iterator()
            r9 = 0
            r14 = 0
        L_0x0633:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x0676
            java.lang.Object r17 = r8.next()
            r29 = r8
            r8 = r17
            m0.r.t.a.r.m.v0 r8 = (m0.r.t.a.r.m.v0) r8
            if (r14 != 0) goto L_0x064e
            boolean r14 = i0.j.f.p.h.h2(r8)
            if (r14 == 0) goto L_0x064c
            goto L_0x064e
        L_0x064c:
            r14 = 0
            goto L_0x064f
        L_0x064e:
            r14 = 1
        L_0x064f:
            r30 = r14
            boolean r14 = r8 instanceof m0.r.t.a.r.m.a0
            if (r14 == 0) goto L_0x0658
            m0.r.t.a.r.m.a0 r8 = (m0.r.t.a.r.m.a0) r8
            goto L_0x0668
        L_0x0658:
            boolean r9 = r8 instanceof m0.r.t.a.r.m.q
            if (r9 == 0) goto L_0x0670
            boolean r9 = i0.j.f.p.h.f2(r8)
            if (r9 == 0) goto L_0x0663
            goto L_0x06cc
        L_0x0663:
            m0.r.t.a.r.m.q r8 = (m0.r.t.a.r.m.q) r8
            m0.r.t.a.r.m.a0 r8 = r8.d
            r9 = 1
        L_0x0668:
            r1.add(r8)
            r8 = r29
            r14 = r30
            goto L_0x0633
        L_0x0670:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0676:
            if (r14 == 0) goto L_0x0688
            java.lang.String r1 = "Intersection of error types: "
            java.lang.String r1 = m0.n.b.i.k(r1, r11)
            m0.r.t.a.r.m.a0 r8 = m0.r.t.a.r.m.p.d(r1)
            java.lang.String r1 = "createErrorType(\"Intersection of error types: $types\")"
            m0.n.b.i.d(r8, r1)
            goto L_0x06cc
        L_0x0688:
            if (r9 != 0) goto L_0x0691
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector r8 = kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            m0.r.t.a.r.m.a0 r8 = r8.b(r1)
            goto L_0x06cc
        L_0x0691:
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = i0.j.f.p.h.K(r11, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r11.iterator()
        L_0x06a0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x06b4
            java.lang.Object r11 = r9.next()
            m0.r.t.a.r.m.v0 r11 = (m0.r.t.a.r.m.v0) r11
            m0.r.t.a.r.m.a0 r11 = i0.j.f.p.h.B4(r11)
            r8.add(r11)
            goto L_0x06a0
        L_0x06b4:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r9 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector r9 = kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            m0.r.t.a.r.m.a0 r1 = r9.b(r1)
            m0.r.t.a.r.m.a0 r8 = r9.b(r8)
            m0.r.t.a.r.m.v0 r8 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.c(r1, r8)
            goto L_0x06cc
        L_0x06c5:
            java.lang.Object r1 = m0.j.g.j0(r11)
            r8 = r1
            m0.r.t.a.r.m.v0 r8 = (m0.r.t.a.r.m.v0) r8
        L_0x06cc:
            m0.n.b.i.e(r15, r6)
            m0.n.b.i.e(r8, r13)
            m0.r.t.a.r.m.m0 r1 = m0.r.t.a.r.m.a1.a.Y(r8)
            r4.add(r1)
        L_0x06d9:
            r9 = r27
            if (r10 < r5) goto L_0x06de
            goto L_0x06f0
        L_0x06de:
            r1 = r28
            r8 = r10
            goto L_0x055d
        L_0x06e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected some types"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x06ef:
            r9 = 0
        L_0x06f0:
            if (r9 != 0) goto L_0x06f9
            boolean r0 = r12.f(r7, r4, r3)
            if (r0 == 0) goto L_0x06f9
            goto L_0x0746
        L_0x06f9:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0701
            goto L_0x07ec
        L_0x0701:
            java.util.Iterator r0 = r2.iterator()
        L_0x0705:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x07ec
            java.lang.Object r1 = r0.next()
            m0.r.t.a.r.m.z0.g r1 = (m0.r.t.a.r.m.z0.g) r1
            m0.r.t.a.r.m.z0.h r1 = r15.M(r1)
            boolean r1 = r12.f(r7, r1, r3)
            if (r1 == 0) goto L_0x0705
            goto L_0x0746
        L_0x071c:
            java.lang.Object r0 = m0.j.g.u(r2)
            m0.r.t.a.r.m.z0.g r0 = (m0.r.t.a.r.m.z0.g) r0
            m0.r.t.a.r.m.z0.h r0 = r15.M(r0)
            boolean r0 = r12.f(r7, r0, r3)
            goto L_0x0814
        L_0x072c:
            m0.r.t.a.r.m.z0.j r1 = i0.j.f.p.h.s4(r15, r0)
            boolean r2 = i0.j.f.p.h.d2(r15, r1)
            if (r2 == 0) goto L_0x073c
            boolean r0 = i0.j.f.p.h.r2(r15, r1)
            goto L_0x0814
        L_0x073c:
            m0.r.t.a.r.m.z0.j r1 = i0.j.f.p.h.s4(r15, r0)
            boolean r1 = i0.j.f.p.h.r2(r15, r1)
            if (r1 == 0) goto L_0x0749
        L_0x0746:
            r0 = 1
            goto L_0x0814
        L_0x0749:
            r26.C()
            java.util.ArrayDeque<m0.r.t.a.r.m.z0.g> r1 = r7.c
            m0.n.b.i.c(r1)
            java.util.Set<m0.r.t.a.r.m.z0.g> r2 = r7.d
            m0.n.b.i.c(r2)
            r1.push(r0)
        L_0x0759:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x07e9
            int r3 = r2.size()
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 > r4) goto L_0x07c8
            java.lang.Object r3 = r1.pop()
            m0.r.t.a.r.m.z0.g r3 = (m0.r.t.a.r.m.z0.g) r3
            r4 = r27
            m0.n.b.i.d(r3, r4)
            boolean r5 = r2.add(r3)
            if (r5 != 0) goto L_0x077b
            goto L_0x07c5
        L_0x077b:
            boolean r5 = r7.D(r3)
            if (r5 == 0) goto L_0x0784
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$c r5 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.c.a
            goto L_0x0786
        L_0x0784:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$b r5 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.b.a
        L_0x0786:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$a$c r6 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.a.c.a
            boolean r6 = m0.n.b.i.a(r5, r6)
            r8 = 1
            r6 = r6 ^ r8
            if (r6 == 0) goto L_0x0791
            goto L_0x0793
        L_0x0791:
            r5 = r16
        L_0x0793:
            if (r5 != 0) goto L_0x0796
            goto L_0x07c5
        L_0x0796:
            m0.r.t.a.r.m.z0.j r3 = i0.j.f.p.h.s4(r15, r3)
            java.util.Collection r3 = r15.W(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x07a2:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x07c5
            java.lang.Object r6 = r3.next()
            m0.r.t.a.r.m.z0.f r6 = (m0.r.t.a.r.m.z0.f) r6
            m0.r.t.a.r.m.z0.g r6 = r5.a(r7, r6)
            m0.r.t.a.r.m.z0.j r9 = i0.j.f.p.h.s4(r15, r6)
            boolean r9 = i0.j.f.p.h.r2(r15, r9)
            if (r9 == 0) goto L_0x07c1
            r26.A()
            r0 = r8
            goto L_0x0814
        L_0x07c1:
            r1.add(r6)
            goto L_0x07a2
        L_0x07c5:
            r27 = r4
            goto L_0x0759
        L_0x07c8:
            java.lang.StringBuilder r0 = i0.d.a.a.a.W0(r11, r0, r10)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            java.lang.String r1 = m0.j.g.E(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x07e9:
            r26.A()
        L_0x07ec:
            r0 = 0
            goto L_0x0814
        L_0x07ee:
            r1 = r27
            r0 = r20
            java.lang.StringBuilder r0 = i0.d.a.a.a.X0(r0, r2, r1)
            java.lang.String r0 = i0.d.a.a.a.J0(r2, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0804:
            boolean r1 = r1.booleanValue()
            r7.z(r0, r3)
            r0 = r1
            goto L_0x0814
        L_0x080d:
            boolean r0 = r0.booleanValue()
            r7.z(r11, r12)
        L_0x0814:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.e.g(m0.r.t.a.r.m.e, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, m0.r.t.a.r.m.z0.f, m0.r.t.a.r.m.z0.f, boolean, int):boolean");
    }

    public final List<g> b(AbstractTypeCheckerContext abstractTypeCheckerContext, g gVar, j jVar) {
        AbstractTypeCheckerContext.a aVar;
        AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
        g gVar2 = gVar;
        j jVar2 = jVar;
        Objects.requireNonNull(abstractTypeCheckerContext);
        i.e(abstractTypeCheckerContext2, "this");
        i.e(gVar2, "receiver");
        i.e(jVar2, "constructor");
        b bVar = (b) abstractTypeCheckerContext2;
        if (!h.d2(bVar, jVar2) && abstractTypeCheckerContext.D(gVar)) {
            return EmptyList.c;
        }
        i.e(bVar, "this");
        i.e(jVar2, "receiver");
        if (jVar2 instanceof j0) {
            m0.r.t.a.r.c.f c = ((j0) jVar2).c();
            d dVar = c instanceof d ? (d) c : null;
            boolean z = false;
            if (!(dVar == null || !h.j2(dVar) || dVar.f() == ClassKind.ENUM_ENTRY || dVar.f() == ClassKind.ANNOTATION_CLASS)) {
                z = true;
            }
            if (!z) {
                m0.r.t.a.r.o.i iVar = new m0.r.t.a.r.o.i();
                abstractTypeCheckerContext.C();
                ArrayDeque<g> arrayDeque = abstractTypeCheckerContext2.c;
                i.c(arrayDeque);
                Set<g> set = abstractTypeCheckerContext2.d;
                i.c(set);
                arrayDeque.push(gVar2);
                while (!arrayDeque.isEmpty()) {
                    if (set.size() <= 1000) {
                        g pop = arrayDeque.pop();
                        i.d(pop, "current");
                        if (set.add(pop)) {
                            g N = bVar.N(pop, CaptureStatus.FOR_SUBTYPING);
                            if (N == null) {
                                N = pop;
                            }
                            if (bVar.v(h.s4(bVar, N), jVar2)) {
                                iVar.add(N);
                                aVar = AbstractTypeCheckerContext.a.c.a;
                            } else if (h.p(bVar, N) == 0) {
                                aVar = AbstractTypeCheckerContext.a.b.a;
                            } else {
                                aVar = abstractTypeCheckerContext2.K(N);
                            }
                            if (!(!i.a(aVar, AbstractTypeCheckerContext.a.c.a))) {
                                aVar = null;
                            }
                            if (aVar != null) {
                                for (f a2 : bVar.W(h.s4(bVar, pop))) {
                                    arrayDeque.add(aVar.a(abstractTypeCheckerContext2, a2));
                                }
                            }
                        }
                    } else {
                        StringBuilder W0 = a.W0("Too many supertypes for type: ", gVar2, ". Supertypes = ");
                        W0.append(m0.j.g.E(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
                        throw new IllegalStateException(W0.toString().toString());
                    }
                }
                abstractTypeCheckerContext.A();
                return iVar;
            } else if (!bVar.v(h.s4(bVar, gVar2), jVar2)) {
                return EmptyList.c;
            } else {
                g N2 = bVar.N(gVar2, CaptureStatus.FOR_SUBTYPING);
                if (N2 == null) {
                    N2 = gVar2;
                }
                return h.L2(N2);
            }
        } else {
            throw new IllegalArgumentException(a.J0(jVar2, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar2, ", ")).toString());
        }
    }

    public final List<g> c(AbstractTypeCheckerContext abstractTypeCheckerContext, g gVar, j jVar) {
        List<g> b = b(abstractTypeCheckerContext, gVar, jVar);
        if (b.size() < 2) {
            return b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            b bVar = (b) abstractTypeCheckerContext;
            m0.r.t.a.r.m.z0.h M = bVar.M((g) next);
            int T3 = h.T3(bVar, M);
            int i = 0;
            while (true) {
                if (i >= T3) {
                    break;
                }
                if (!(h.u(bVar, h.G1(bVar, h.M0(bVar, M, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : b;
    }

    public final boolean d(AbstractTypeCheckerContext abstractTypeCheckerContext, f fVar, f fVar2) {
        i.e(abstractTypeCheckerContext, "context");
        i.e(fVar, "a");
        i.e(fVar2, "b");
        if (fVar == fVar2) {
            return true;
        }
        if (e(abstractTypeCheckerContext, fVar) && e(abstractTypeCheckerContext, fVar2)) {
            f J = abstractTypeCheckerContext.J(fVar);
            f J2 = abstractTypeCheckerContext.J(fVar2);
            g O2 = h.O2(abstractTypeCheckerContext, J);
            b bVar = (b) abstractTypeCheckerContext;
            if (!bVar.v(h.t4(abstractTypeCheckerContext, J), h.t4(abstractTypeCheckerContext, J2))) {
                return false;
            }
            if (h.p(bVar, O2) == 0) {
                if (abstractTypeCheckerContext.B(J) || abstractTypeCheckerContext.B(J2) || h.p2(bVar, O2) == h.p2(bVar, h.O2(abstractTypeCheckerContext, J2))) {
                    return true;
                }
                return false;
            }
        }
        if (!g(this, abstractTypeCheckerContext, fVar, fVar2, false, 8) || !g(this, abstractTypeCheckerContext, fVar2, fVar, false, 8)) {
            return false;
        }
        return true;
    }

    public final boolean e(AbstractTypeCheckerContext abstractTypeCheckerContext, f fVar) {
        c cVar;
        j t4 = h.t4(abstractTypeCheckerContext, fVar);
        b bVar = (b) abstractTypeCheckerContext;
        i.e(bVar, "this");
        i.e(t4, "receiver");
        if (t4 instanceof j0) {
            if (((j0) t4).d()) {
                i.e(abstractTypeCheckerContext, "this");
                i.e(fVar, "receiver");
                m0.r.t.a.r.m.z0.d u = h.u(bVar, fVar);
                if (u == null) {
                    cVar = null;
                } else {
                    cVar = h.s(bVar, u);
                }
                if (!(cVar != null) && !abstractTypeCheckerContext.E(fVar) && i.a(h.s4(bVar, h.O2(abstractTypeCheckerContext, fVar)), h.s4(bVar, h.A4(abstractTypeCheckerContext, fVar)))) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException(a.J0(t4, a.X0("ClassicTypeSystemContext couldn't handle: ", t4, ", ")).toString());
    }

    public final boolean f(AbstractTypeCheckerContext abstractTypeCheckerContext, m0.r.t.a.r.m.z0.h hVar, g gVar) {
        boolean z;
        AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
        m0.r.t.a.r.m.z0.h hVar2 = hVar;
        g gVar2 = gVar;
        i.e(abstractTypeCheckerContext2, "<this>");
        i.e(hVar2, "capturedSubArguments");
        i.e(gVar2, "superType");
        b bVar = (b) abstractTypeCheckerContext2;
        j s4 = h.s4(bVar, gVar2);
        int V = bVar.V(s4);
        if (V > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                m0.r.t.a.r.m.z0.i R0 = h.R0(bVar, gVar2, i);
                if (!h.x2(bVar, R0)) {
                    f G1 = h.G1(bVar, R0);
                    m0.r.t.a.r.m.z0.i M0 = h.M0(abstractTypeCheckerContext2, hVar2, i);
                    h.L1(bVar, M0);
                    TypeVariance typeVariance = TypeVariance.INV;
                    f G12 = h.G1(bVar, M0);
                    TypeVariance P = bVar.P(bVar.O(s4, i));
                    TypeVariance L1 = h.L1(bVar, R0);
                    i.e(P, "declared");
                    i.e(L1, "useSite");
                    if (P == typeVariance) {
                        P = L1;
                    } else if (!(L1 == typeVariance || P == L1)) {
                        P = null;
                    }
                    if (P == null) {
                        return abstractTypeCheckerContext.F();
                    }
                    int i3 = abstractTypeCheckerContext2.a;
                    if (i3 <= 100) {
                        abstractTypeCheckerContext2.a = i3 + 1;
                        int ordinal = P.ordinal();
                        if (ordinal == 0) {
                            z = g(this, abstractTypeCheckerContext, G1, G12, false, 8);
                        } else if (ordinal == 1) {
                            z = g(this, abstractTypeCheckerContext, G12, G1, false, 8);
                        } else if (ordinal == 2) {
                            z = d(abstractTypeCheckerContext2, G12, G1);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractTypeCheckerContext2.a--;
                        if (!z) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(i.k("Arguments depth is too high. Some related argument: ", G12).toString());
                    }
                }
                if (i2 >= V) {
                    break;
                }
                i = i2;
            }
        }
        return true;
    }
}
