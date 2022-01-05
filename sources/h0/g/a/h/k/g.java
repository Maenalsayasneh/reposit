package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.h.c;
import h0.g.a.h.k.b;

/* compiled from: Direct */
public class g {
    public static b.a a = new b.a();
    public static int b;
    public static int c;

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour r = constraintWidget.r();
        ConstraintWidget.DimensionBehaviour v = constraintWidget.v();
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        c cVar = constraintWidget2 != null ? (c) constraintWidget2 : null;
        if (cVar != null) {
            ConstraintWidget.DimensionBehaviour r2 = cVar.r();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (cVar != null) {
            ConstraintWidget.DimensionBehaviour v2 = cVar.v();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = r == dimensionBehaviour5 || constraintWidget.G() || r == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (r == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.q == 0 && constraintWidget.Z == 0.0f && constraintWidget.z(0)) || (r == dimensionBehaviour2 && constraintWidget.q == 1 && constraintWidget.A(0, constraintWidget.w()));
        boolean z2 = v == dimensionBehaviour5 || constraintWidget.H() || v == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (v == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.r == 0 && constraintWidget.Z == 0.0f && constraintWidget.z(1)) || (r == dimensionBehaviour && constraintWidget.r == 1 && constraintWidget.A(1, constraintWidget.q()));
        if (constraintWidget.Z > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r14 = r12.M.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        r5 = r5.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, h0.g.a.h.k.b.C0030b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.l
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            int r3 = b
            r4 = 1
            int r3 = r3 + r4
            b = r3
            boolean r3 = r0 instanceof h0.g.a.h.c
            r5 = 0
            if (r3 != 0) goto L_0x002a
            boolean r3 = r17.F()
            if (r3 == 0) goto L_0x002a
            boolean r3 = a(r17)
            if (r3 == 0) goto L_0x002a
            h0.g.a.h.k.b$a r3 = new h0.g.a.h.k.b$a
            r3.<init>()
            h0.g.a.h.c.g0(r0, r1, r3, r5)
        L_0x002a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.n(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.n(r6)
            int r7 = r3.d()
            int r8 = r6.d()
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r9 = r3.a
            r10 = 0
            r11 = 8
            if (r9 == 0) goto L_0x011e
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x011e
            java.util.Iterator r3 = r9.iterator()
        L_0x004d:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x011e
            java.lang.Object r9 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r9.d
            int r13 = r16 + 1
            boolean r14 = a(r12)
            boolean r15 = r12.F()
            if (r15 == 0) goto L_0x0071
            if (r14 == 0) goto L_0x0071
            h0.g.a.h.k.b$a r15 = new h0.g.a.h.k.b$a
            r15.<init>()
            h0.g.a.h.c.g0(r12, r1, r15, r5)
        L_0x0071:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r12.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r5) goto L_0x00cb
            if (r14 == 0) goto L_0x007c
            goto L_0x00cb
        L_0x007c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r12.r()
            if (r14 != r5) goto L_0x011b
            int r5 = r12.u
            if (r5 < 0) goto L_0x011b
            int r5 = r12.t
            if (r5 < 0) goto L_0x011b
            int r5 = r12.f8o0
            if (r5 == r11) goto L_0x0098
            int r5 = r12.q
            if (r5 != 0) goto L_0x011b
            float r5 = r12.Z
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x011b
        L_0x0098:
            boolean r5 = r12.D()
            if (r5 != 0) goto L_0x011b
            boolean r5 = r12.H
            if (r5 != 0) goto L_0x011b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r12.K
            if (r9 != r5) goto L_0x00b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f
            if (r14 == 0) goto L_0x00b0
            boolean r14 = r14.c
            if (r14 != 0) goto L_0x00bc
        L_0x00b0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.M
            if (r9 != r14) goto L_0x00be
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 == 0) goto L_0x00be
            boolean r5 = r5.c
            if (r5 == 0) goto L_0x00be
        L_0x00bc:
            r5 = r4
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            if (r5 == 0) goto L_0x011b
            boolean r5 = r12.D()
            if (r5 != 0) goto L_0x011b
            d(r13, r0, r1, r12, r2)
            goto L_0x011b
        L_0x00cb:
            boolean r5 = r12.F()
            if (r5 == 0) goto L_0x00d2
            goto L_0x011b
        L_0x00d2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r12.K
            if (r9 != r5) goto L_0x00ed
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f
            if (r14 != 0) goto L_0x00ed
            int r5 = r5.e()
            int r5 = r5 + r7
            int r9 = r12.w()
            int r9 = r9 + r5
            r12.N(r5, r9)
            b(r13, r12, r1, r2)
            goto L_0x011b
        L_0x00ed:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.M
            if (r9 != r14) goto L_0x0108
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r5.f
            if (r15 != 0) goto L_0x0108
            int r5 = r14.e()
            int r5 = r7 - r5
            int r9 = r12.w()
            int r9 = r5 - r9
            r12.N(r9, r5)
            b(r13, r12, r1, r2)
            goto L_0x011b
        L_0x0108:
            if (r9 != r5) goto L_0x011b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r14.f
            if (r5 == 0) goto L_0x011b
            boolean r5 = r5.c
            if (r5 == 0) goto L_0x011b
            boolean r5 = r12.D()
            if (r5 != 0) goto L_0x011b
            c(r13, r1, r12, r2)
        L_0x011b:
            r5 = 0
            goto L_0x004d
        L_0x011e:
            boolean r3 = r0 instanceof h0.g.a.h.e
            if (r3 == 0) goto L_0x0123
            return
        L_0x0123:
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r6.a
            if (r3 == 0) goto L_0x01fe
            boolean r5 = r6.c
            if (r5 == 0) goto L_0x01fe
            java.util.Iterator r3 = r3.iterator()
        L_0x012f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01fe
            java.lang.Object r5 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.d
            int r7 = r16 + 1
            boolean r9 = a(r6)
            boolean r12 = r6.F()
            if (r12 == 0) goto L_0x0155
            if (r9 == 0) goto L_0x0155
            h0.g.a.h.k.b$a r12 = new h0.g.a.h.k.b$a
            r12.<init>()
            r13 = 0
            h0.g.a.h.c.g0(r6, r1, r12, r13)
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.K
            if (r5 != r12) goto L_0x0164
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r6.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f
            if (r14 == 0) goto L_0x0164
            boolean r14 = r14.c
            if (r14 != 0) goto L_0x0170
        L_0x0164:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r6.M
            if (r5 != r14) goto L_0x0172
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f
            if (r12 == 0) goto L_0x0172
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x0172
        L_0x0170:
            r12 = r4
            goto L_0x0173
        L_0x0172:
            r12 = r13
        L_0x0173:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r6.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r14 != r15) goto L_0x01b1
            if (r9 == 0) goto L_0x017e
            goto L_0x01b1
        L_0x017e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r6.r()
            if (r5 != r15) goto L_0x012f
            int r5 = r6.u
            if (r5 < 0) goto L_0x012f
            int r5 = r6.t
            if (r5 < 0) goto L_0x012f
            int r5 = r6.f8o0
            if (r5 == r11) goto L_0x019a
            int r5 = r6.q
            if (r5 != 0) goto L_0x012f
            float r5 = r6.Z
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x012f
        L_0x019a:
            boolean r5 = r6.D()
            if (r5 != 0) goto L_0x012f
            boolean r5 = r6.H
            if (r5 != 0) goto L_0x012f
            if (r12 == 0) goto L_0x012f
            boolean r5 = r6.D()
            if (r5 != 0) goto L_0x012f
            d(r7, r0, r1, r6, r2)
            goto L_0x012f
        L_0x01b1:
            boolean r9 = r6.F()
            if (r9 == 0) goto L_0x01b9
            goto L_0x012f
        L_0x01b9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.K
            if (r5 != r9) goto L_0x01d5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r6.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f
            if (r14 != 0) goto L_0x01d5
            int r5 = r9.e()
            int r5 = r5 + r8
            int r9 = r6.w()
            int r9 = r9 + r5
            r6.N(r5, r9)
            b(r7, r6, r1, r2)
            goto L_0x012f
        L_0x01d5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r6.M
            if (r5 != r14) goto L_0x01f1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r9.f
            if (r5 != 0) goto L_0x01f1
            int r5 = r14.e()
            int r5 = r8 - r5
            int r9 = r6.w()
            int r9 = r5 - r9
            r6.N(r9, r5)
            b(r7, r6, r1, r2)
            goto L_0x012f
        L_0x01f1:
            if (r12 == 0) goto L_0x012f
            boolean r5 = r6.D()
            if (r5 != 0) goto L_0x012f
            c(r7, r1, r6, r2)
            goto L_0x012f
        L_0x01fe:
            r0.l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.k.g.b(int, androidx.constraintlayout.core.widgets.ConstraintWidget, h0.g.a.h.k.b$b, boolean):void");
    }

    public static void c(int i, b.C0030b bVar, ConstraintWidget constraintWidget, boolean z) {
        float f = constraintWidget.f4k0;
        int d = constraintWidget.K.f.d();
        int d2 = constraintWidget.M.f.d();
        int e = constraintWidget.K.e() + d;
        int e2 = d2 - constraintWidget.M.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int w = constraintWidget.w();
        int i2 = (d2 - d) - w;
        if (d > d2) {
            i2 = (d - d2) - w;
        }
        int i3 = ((int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2))) + d;
        int i4 = i3 + w;
        if (d > d2) {
            i4 = i3 - w;
        }
        constraintWidget.N(i3, i4);
        b(i + 1, constraintWidget, bVar, z);
    }

    public static void d(int i, ConstraintWidget constraintWidget, b.C0030b bVar, ConstraintWidget constraintWidget2, boolean z) {
        int i2;
        float f = constraintWidget2.f4k0;
        int e = constraintWidget2.K.e() + constraintWidget2.K.f.d();
        int d = constraintWidget2.M.f.d() - constraintWidget2.M.e();
        if (d >= e) {
            int w = constraintWidget2.w();
            if (constraintWidget2.f8o0 != 8) {
                int i3 = constraintWidget2.q;
                if (i3 == 2) {
                    if (constraintWidget instanceof c) {
                        i2 = constraintWidget.w();
                    } else {
                        i2 = constraintWidget.W.w();
                    }
                    w = (int) (constraintWidget2.f4k0 * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    w = d - e;
                }
                w = Math.max(constraintWidget2.t, w);
                int i4 = constraintWidget2.u;
                if (i4 > 0) {
                    w = Math.min(i4, w);
                }
            }
            int i5 = e + ((int) ((f * ((float) ((d - e) - w))) + 0.5f));
            constraintWidget2.N(i5, w + i5);
            b(i + 1, constraintWidget2, bVar, z);
        }
    }

    public static void e(int i, b.C0030b bVar, ConstraintWidget constraintWidget) {
        float f = constraintWidget.f5l0;
        int d = constraintWidget.L.f.d();
        int d2 = constraintWidget.N.f.d();
        int e = constraintWidget.L.e() + d;
        int e2 = d2 - constraintWidget.N.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int q = constraintWidget.q();
        int i2 = (d2 - d) - q;
        if (d > d2) {
            i2 = (d - d2) - q;
        }
        int i3 = (int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2));
        int i4 = d + i3;
        int i5 = i4 + q;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - q;
        }
        constraintWidget.O(i4, i5);
        g(i + 1, constraintWidget, bVar);
    }

    public static void f(int i, ConstraintWidget constraintWidget, b.C0030b bVar, ConstraintWidget constraintWidget2) {
        int i2;
        float f = constraintWidget2.f5l0;
        int e = constraintWidget2.L.e() + constraintWidget2.L.f.d();
        int d = constraintWidget2.N.f.d() - constraintWidget2.N.e();
        if (d >= e) {
            int q = constraintWidget2.q();
            if (constraintWidget2.f8o0 != 8) {
                int i3 = constraintWidget2.r;
                if (i3 == 2) {
                    if (constraintWidget instanceof c) {
                        i2 = constraintWidget.q();
                    } else {
                        i2 = constraintWidget.W.q();
                    }
                    q = (int) (f * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    q = d - e;
                }
                q = Math.max(constraintWidget2.w, q);
                int i4 = constraintWidget2.x;
                if (i4 > 0) {
                    q = Math.min(i4, q);
                }
            }
            int i5 = e + ((int) ((f * ((float) ((d - e) - q))) + 0.5f));
            constraintWidget2.O(i5, q + i5);
            g(i + 1, constraintWidget2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r14 = r11.N.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        r8 = r13.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, h0.g.a.h.k.b.C0030b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.m
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = c
            r3 = 1
            int r2 = r2 + r3
            c = r2
            boolean r2 = r0 instanceof h0.g.a.h.c
            r4 = 0
            if (r2 != 0) goto L_0x0028
            boolean r2 = r17.F()
            if (r2 == 0) goto L_0x0028
            boolean r2 = a(r17)
            if (r2 == 0) goto L_0x0028
            h0.g.a.h.k.b$a r2 = new h0.g.a.h.k.b$a
            r2.<init>()
            h0.g.a.h.c.g0(r0, r1, r2, r4)
        L_0x0028:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.n(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.n(r5)
            int r6 = r2.d()
            int r7 = r5.d()
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r8 = r2.a
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x0118
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0118
            java.util.Iterator r2 = r8.iterator()
        L_0x004b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0118
            java.lang.Object r8 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r8.d
            int r12 = r16 + 1
            boolean r13 = a(r11)
            boolean r14 = r11.F()
            if (r14 == 0) goto L_0x006f
            if (r13 == 0) goto L_0x006f
            h0.g.a.h.k.b$a r14 = new h0.g.a.h.k.b$a
            r14.<init>()
            h0.g.a.h.c.g0(r11, r1, r14, r4)
        L_0x006f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r11.v()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r14 != r15) goto L_0x00c9
            if (r13 == 0) goto L_0x007a
            goto L_0x00c9
        L_0x007a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r11.v()
            if (r13 != r15) goto L_0x004b
            int r13 = r11.x
            if (r13 < 0) goto L_0x004b
            int r13 = r11.w
            if (r13 < 0) goto L_0x004b
            int r13 = r11.f8o0
            if (r13 == r10) goto L_0x0096
            int r13 = r11.r
            if (r13 != 0) goto L_0x004b
            float r13 = r11.Z
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x004b
        L_0x0096:
            boolean r13 = r11.E()
            if (r13 != 0) goto L_0x004b
            boolean r13 = r11.H
            if (r13 != 0) goto L_0x004b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.L
            if (r8 != r13) goto L_0x00ae
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f
            if (r14 == 0) goto L_0x00ae
            boolean r14 = r14.c
            if (r14 != 0) goto L_0x00ba
        L_0x00ae:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.N
            if (r8 != r14) goto L_0x00bc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r13.f
            if (r8 == 0) goto L_0x00bc
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x00bc
        L_0x00ba:
            r8 = r3
            goto L_0x00bd
        L_0x00bc:
            r8 = r4
        L_0x00bd:
            if (r8 == 0) goto L_0x004b
            boolean r8 = r11.E()
            if (r8 != 0) goto L_0x004b
            f(r12, r0, r1, r11)
            goto L_0x004b
        L_0x00c9:
            boolean r13 = r11.F()
            if (r13 == 0) goto L_0x00d1
            goto L_0x004b
        L_0x00d1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.L
            if (r8 != r13) goto L_0x00ed
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f
            if (r14 != 0) goto L_0x00ed
            int r8 = r13.e()
            int r8 = r8 + r6
            int r13 = r11.q()
            int r13 = r13 + r8
            r11.O(r8, r13)
            g(r12, r11, r1)
            goto L_0x004b
        L_0x00ed:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.N
            if (r8 != r14) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.f
            if (r15 != 0) goto L_0x0109
            int r8 = r14.e()
            int r8 = r6 - r8
            int r13 = r11.q()
            int r13 = r8 - r13
            r11.O(r13, r8)
            g(r12, r11, r1)
            goto L_0x004b
        L_0x0109:
            if (r8 != r13) goto L_0x004b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r14.f
            if (r8 == 0) goto L_0x004b
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x004b
            e(r12, r1, r11)
            goto L_0x004b
        L_0x0118:
            boolean r2 = r0 instanceof h0.g.a.h.e
            if (r2 == 0) goto L_0x011d
            return
        L_0x011d:
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r5.a
            if (r2 == 0) goto L_0x01f4
            boolean r5 = r5.c
            if (r5 == 0) goto L_0x01f4
            java.util.Iterator r2 = r2.iterator()
        L_0x0129:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01f4
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.d
            int r8 = r16 + 1
            boolean r11 = a(r6)
            boolean r12 = r6.F()
            if (r12 == 0) goto L_0x014d
            if (r11 == 0) goto L_0x014d
            h0.g.a.h.k.b$a r12 = new h0.g.a.h.k.b$a
            r12.<init>()
            h0.g.a.h.c.g0(r6, r1, r12, r4)
        L_0x014d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.L
            if (r5 != r12) goto L_0x015b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r6.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f
            if (r13 == 0) goto L_0x015b
            boolean r13 = r13.c
            if (r13 != 0) goto L_0x0167
        L_0x015b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r6.N
            if (r5 != r13) goto L_0x0169
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f
            if (r12 == 0) goto L_0x0169
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x0169
        L_0x0167:
            r12 = r3
            goto L_0x016a
        L_0x0169:
            r12 = r4
        L_0x016a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r6.v()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01a7
            if (r11 == 0) goto L_0x0175
            goto L_0x01a7
        L_0x0175:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r6.v()
            if (r5 != r14) goto L_0x0129
            int r5 = r6.x
            if (r5 < 0) goto L_0x0129
            int r5 = r6.w
            if (r5 < 0) goto L_0x0129
            int r5 = r6.f8o0
            if (r5 == r10) goto L_0x0191
            int r5 = r6.r
            if (r5 != 0) goto L_0x0129
            float r5 = r6.Z
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0129
        L_0x0191:
            boolean r5 = r6.E()
            if (r5 != 0) goto L_0x0129
            boolean r5 = r6.H
            if (r5 != 0) goto L_0x0129
            if (r12 == 0) goto L_0x0129
            boolean r5 = r6.E()
            if (r5 != 0) goto L_0x0129
            f(r8, r0, r1, r6)
            goto L_0x0129
        L_0x01a7:
            boolean r11 = r6.F()
            if (r11 == 0) goto L_0x01af
            goto L_0x0129
        L_0x01af:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.L
            if (r5 != r11) goto L_0x01cb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r6.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f
            if (r13 != 0) goto L_0x01cb
            int r5 = r11.e()
            int r5 = r5 + r7
            int r11 = r6.q()
            int r11 = r11 + r5
            r6.O(r5, r11)
            g(r8, r6, r1)
            goto L_0x0129
        L_0x01cb:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r6.N
            if (r5 != r13) goto L_0x01e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r11.f
            if (r5 != 0) goto L_0x01e7
            int r5 = r13.e()
            int r5 = r7 - r5
            int r11 = r6.q()
            int r11 = r5 - r11
            r6.O(r11, r5)
            g(r8, r6, r1)
            goto L_0x0129
        L_0x01e7:
            if (r12 == 0) goto L_0x0129
            boolean r5 = r6.E()
            if (r5 != 0) goto L_0x0129
            e(r8, r1, r6)
            goto L_0x0129
        L_0x01f4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r5 = r2.a
            if (r5 == 0) goto L_0x026e
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x026e
            int r5 = r2.d()
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
        L_0x020c:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x026e
            java.lang.Object r6 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.d
            int r8 = r16 + 1
            boolean r9 = a(r7)
            boolean r10 = r7.F()
            if (r10 == 0) goto L_0x0230
            if (r9 == 0) goto L_0x0230
            h0.g.a.h.k.b$a r10 = new h0.g.a.h.k.b$a
            r10.<init>()
            h0.g.a.h.c.g0(r7, r1, r10, r4)
        L_0x0230:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r7.v()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x023a
            if (r9 == 0) goto L_0x020c
        L_0x023a:
            boolean r9 = r7.F()
            if (r9 == 0) goto L_0x0241
            goto L_0x020c
        L_0x0241:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.O
            if (r6 != r9) goto L_0x020c
            int r6 = r6.e()
            int r6 = r6 + r5
            boolean r9 = r7.F
            if (r9 != 0) goto L_0x024f
            goto L_0x026a
        L_0x024f:
            int r9 = r7.f1h0
            int r9 = r6 - r9
            int r10 = r7.Y
            int r10 = r10 + r9
            r7.c0 = r9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r7.L
            r11.m(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.N
            r9.m(r10)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.O
            r9.b = r6
            r9.c = r3
            r7.k = r3
        L_0x026a:
            g(r8, r7, r1)
            goto L_0x020c
        L_0x026e:
            r0.m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.k.g.g(int, androidx.constraintlayout.core.widgets.ConstraintWidget, h0.g.a.h.k.b$b):void");
    }
}
