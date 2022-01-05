package h0.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import g0.a.b.b.a;
import h0.g.a.d;
import h0.g.a.h.k.b;
import h0.g.a.h.k.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer */
public class c extends j {
    public b N0 = new b(this);
    public e O0 = new e(this);
    public int P0;
    public b.C0030b Q0 = null;
    public boolean R0 = false;
    public d S0 = new d();
    public int T0;
    public int U0;
    public int V0 = 0;
    public int W0 = 0;
    public b[] X0 = new b[4];
    public b[] Y0 = new b[4];
    public int Z0 = 257;
    public boolean a1 = false;
    public boolean b1 = false;
    public WeakReference<ConstraintAnchor> c1 = null;
    public WeakReference<ConstraintAnchor> d1 = null;
    public WeakReference<ConstraintAnchor> e1 = null;
    public WeakReference<ConstraintAnchor> f1 = null;
    public HashSet<ConstraintWidget> g1 = new HashSet<>();
    public b.a h1 = new b.a();

    public static boolean g0(ConstraintWidget constraintWidget, b.C0030b bVar, b.a aVar, int i) {
        int i2;
        int i3;
        if (bVar == null) {
            return false;
        }
        if (constraintWidget.f8o0 == 8 || (constraintWidget instanceof e) || (constraintWidget instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.a = constraintWidget.r();
        aVar.b = constraintWidget.v();
        aVar.c = constraintWidget.w();
        aVar.d = constraintWidget.q();
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Z > 0.0f;
        boolean z4 = z2 && constraintWidget.Z > 0.0f;
        if (z && constraintWidget.z(0) && constraintWidget.q == 0 && !z3) {
            aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.r == 0) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.z(1) && constraintWidget.r == 0 && !z4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.q == 0) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.G()) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.H()) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.s[0] == 4) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i3 = aVar.d;
                } else {
                    aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    ((ConstraintLayout.b) bVar).b(constraintWidget, aVar);
                    i3 = aVar.f;
                }
                aVar.a = dimensionBehaviour4;
                aVar.c = (int) (constraintWidget.Z * ((float) i3));
            }
        }
        if (z4) {
            if (constraintWidget.s[1] == 4) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i2 = aVar.c;
                } else {
                    aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    ((ConstraintLayout.b) bVar).b(constraintWidget, aVar);
                    i2 = aVar.e;
                }
                aVar.b = dimensionBehaviour6;
                if (constraintWidget.a0 == -1) {
                    aVar.d = (int) (((float) i2) / constraintWidget.Z);
                } else {
                    aVar.d = (int) (constraintWidget.Z * ((float) i2));
                }
            }
        }
        ((ConstraintLayout.b) bVar).b(constraintWidget, aVar);
        constraintWidget.U(aVar.e);
        constraintWidget.P(aVar.f);
        constraintWidget.F = aVar.h;
        constraintWidget.M(aVar.g);
        aVar.j = 0;
        return aVar.i;
    }

    public void I() {
        this.S0.u();
        this.T0 = 0;
        this.U0 = 0;
        super.I();
    }

    public void V(boolean z, boolean z2) {
        super.V(z, z2);
        int size = this.M0.size();
        for (int i = 0; i < size; i++) {
            this.M0.get(i).V(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x07cf  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x07fc A[LOOP:32: B:466:0x07fa->B:467:0x07fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0882  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0893  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x08d5  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x08d7  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x08e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X() {
        /*
            r24 = this;
            r1 = r24
            r2 = 0
            r1.b0 = r2
            r1.c0 = r2
            r1.a1 = r2
            r1.b1 = r2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.M0
            int r3 = r0.size()
            int r0 = r24.w()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r24.q()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.V
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.P0
            if (r8 != 0) goto L_0x0248
            int r8 = r1.Z0
            boolean r8 = h0.g.a.h.h.b(r8, r6)
            if (r8 == 0) goto L_0x0248
            h0.g.a.h.k.b$b r8 = r1.Q0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r24.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r24.v()
            h0.g.a.h.k.g.b = r2
            h0.g.a.h.k.g.c = r2
            r24.K()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r12 = r1.M0
            int r13 = r12.size()
            r14 = r2
        L_0x004c:
            if (r14 >= r13) goto L_0x005a
            java.lang.Object r15 = r12.get(r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r15
            r15.K()
            int r14 = r14 + 1
            goto L_0x004c
        L_0x005a:
            boolean r14 = r1.R0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 != r15) goto L_0x0068
            int r10 = r24.w()
            r1.N(r2, r10)
            goto L_0x0070
        L_0x0068:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r1.K
            r10.b = r2
            r10.c = r6
            r1.b0 = r2
        L_0x0070:
            r10 = r2
            r15 = r10
            r16 = r15
        L_0x0074:
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r10 >= r13) goto L_0x00d0
            java.lang.Object r18 = r12.get(r10)
            r2 = r18
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r9 = r2 instanceof h0.g.a.h.e
            if (r9 == 0) goto L_0x00be
            h0.g.a.h.e r2 = (h0.g.a.h.e) r2
            int r9 = r2.Q0
            if (r9 != r6) goto L_0x00cc
            int r9 = r2.N0
            r15 = -1
            if (r9 == r15) goto L_0x0093
            r2.X(r9)
            goto L_0x00bc
        L_0x0093:
            int r9 = r2.O0
            if (r9 == r15) goto L_0x00a8
            boolean r9 = r24.G()
            if (r9 == 0) goto L_0x00a8
            int r9 = r24.w()
            int r15 = r2.O0
            int r9 = r9 - r15
            r2.X(r9)
            goto L_0x00bc
        L_0x00a8:
            boolean r9 = r24.G()
            if (r9 == 0) goto L_0x00bc
            float r9 = r2.M0
            int r15 = r24.w()
            float r15 = (float) r15
            float r9 = r9 * r15
            float r9 = r9 + r17
            int r9 = (int) r9
            r2.X(r9)
        L_0x00bc:
            r15 = r6
            goto L_0x00cc
        L_0x00be:
            boolean r9 = r2 instanceof h0.g.a.h.a
            if (r9 == 0) goto L_0x00cc
            h0.g.a.h.a r2 = (h0.g.a.h.a) r2
            int r2 = r2.Z()
            if (r2 != 0) goto L_0x00cc
            r16 = r6
        L_0x00cc:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x0074
        L_0x00d0:
            if (r15 == 0) goto L_0x00ee
            r2 = 0
        L_0x00d3:
            if (r2 >= r13) goto L_0x00ee
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9 instanceof h0.g.a.h.e
            if (r10 == 0) goto L_0x00ea
            h0.g.a.h.e r9 = (h0.g.a.h.e) r9
            int r10 = r9.Q0
            if (r10 != r6) goto L_0x00ea
            r10 = 0
            h0.g.a.h.k.g.b(r10, r9, r8, r14)
            goto L_0x00eb
        L_0x00ea:
            r10 = 0
        L_0x00eb:
            int r2 = r2 + 1
            goto L_0x00d3
        L_0x00ee:
            r10 = 0
            h0.g.a.h.k.g.b(r10, r1, r8, r14)
            if (r16 == 0) goto L_0x0115
            r2 = 0
        L_0x00f5:
            if (r2 >= r13) goto L_0x0115
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9 instanceof h0.g.a.h.a
            if (r10 == 0) goto L_0x0112
            h0.g.a.h.a r9 = (h0.g.a.h.a) r9
            int r10 = r9.Z()
            if (r10 != 0) goto L_0x0112
            boolean r10 = r9.Y()
            if (r10 == 0) goto L_0x0112
            h0.g.a.h.k.g.b(r6, r9, r8, r14)
        L_0x0112:
            int r2 = r2 + 1
            goto L_0x00f5
        L_0x0115:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 != r2) goto L_0x0122
            int r2 = r24.q()
            r9 = 0
            r1.O(r9, r2)
            goto L_0x012b
        L_0x0122:
            r9 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.L
            r2.b = r9
            r2.c = r6
            r1.c0 = r9
        L_0x012b:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x012e:
            if (r2 >= r13) goto L_0x0184
            java.lang.Object r11 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            boolean r15 = r11 instanceof h0.g.a.h.e
            if (r15 == 0) goto L_0x0174
            h0.g.a.h.e r11 = (h0.g.a.h.e) r11
            int r15 = r11.Q0
            if (r15 != 0) goto L_0x0181
            int r9 = r11.N0
            r15 = -1
            if (r9 == r15) goto L_0x0149
            r11.X(r9)
            goto L_0x0172
        L_0x0149:
            int r9 = r11.O0
            if (r9 == r15) goto L_0x015e
            boolean r9 = r24.H()
            if (r9 == 0) goto L_0x015e
            int r9 = r24.q()
            int r15 = r11.O0
            int r9 = r9 - r15
            r11.X(r9)
            goto L_0x0172
        L_0x015e:
            boolean r9 = r24.H()
            if (r9 == 0) goto L_0x0172
            float r9 = r11.M0
            int r15 = r24.q()
            float r15 = (float) r15
            float r9 = r9 * r15
            float r9 = r9 + r17
            int r9 = (int) r9
            r11.X(r9)
        L_0x0172:
            r9 = r6
            goto L_0x0181
        L_0x0174:
            boolean r15 = r11 instanceof h0.g.a.h.a
            if (r15 == 0) goto L_0x0181
            h0.g.a.h.a r11 = (h0.g.a.h.a) r11
            int r11 = r11.Z()
            if (r11 != r6) goto L_0x0181
            r10 = r6
        L_0x0181:
            int r2 = r2 + 1
            goto L_0x012e
        L_0x0184:
            if (r9 == 0) goto L_0x019f
            r2 = 0
        L_0x0187:
            if (r2 >= r13) goto L_0x019f
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r11 = r9 instanceof h0.g.a.h.e
            if (r11 == 0) goto L_0x019c
            h0.g.a.h.e r9 = (h0.g.a.h.e) r9
            int r11 = r9.Q0
            if (r11 != 0) goto L_0x019c
            h0.g.a.h.k.g.g(r6, r9, r8)
        L_0x019c:
            int r2 = r2 + 1
            goto L_0x0187
        L_0x019f:
            r2 = 0
            h0.g.a.h.k.g.g(r2, r1, r8)
            if (r10 == 0) goto L_0x01c6
            r2 = 0
        L_0x01a6:
            if (r2 >= r13) goto L_0x01c6
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9 instanceof h0.g.a.h.a
            if (r10 == 0) goto L_0x01c3
            h0.g.a.h.a r9 = (h0.g.a.h.a) r9
            int r10 = r9.Z()
            if (r10 != r6) goto L_0x01c3
            boolean r10 = r9.Y()
            if (r10 == 0) goto L_0x01c3
            h0.g.a.h.k.g.g(r6, r9, r8)
        L_0x01c3:
            int r2 = r2 + 1
            goto L_0x01a6
        L_0x01c6:
            r2 = 0
        L_0x01c7:
            if (r2 >= r13) goto L_0x01fd
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.F()
            if (r10 == 0) goto L_0x01fa
            boolean r10 = h0.g.a.h.k.g.a(r9)
            if (r10 == 0) goto L_0x01fa
            h0.g.a.h.k.b$a r10 = h0.g.a.h.k.g.a
            r11 = 0
            g0(r9, r8, r10, r11)
            boolean r10 = r9 instanceof h0.g.a.h.e
            if (r10 == 0) goto L_0x01f4
            r10 = r9
            h0.g.a.h.e r10 = (h0.g.a.h.e) r10
            int r10 = r10.Q0
            if (r10 != 0) goto L_0x01f0
            h0.g.a.h.k.g.g(r11, r9, r8)
            goto L_0x01fa
        L_0x01f0:
            h0.g.a.h.k.g.b(r11, r9, r8, r14)
            goto L_0x01fa
        L_0x01f4:
            h0.g.a.h.k.g.b(r11, r9, r8, r14)
            h0.g.a.h.k.g.g(r11, r9, r8)
        L_0x01fa:
            int r2 = r2 + 1
            goto L_0x01c7
        L_0x01fd:
            r2 = 0
        L_0x01fe:
            if (r2 >= r3) goto L_0x0248
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r8 = r1.M0
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r8
            boolean r9 = r8.F()
            if (r9 == 0) goto L_0x0245
            boolean r9 = r8 instanceof h0.g.a.h.e
            if (r9 != 0) goto L_0x0245
            boolean r9 = r8 instanceof h0.g.a.h.a
            if (r9 != 0) goto L_0x0245
            boolean r9 = r8 instanceof h0.g.a.h.i
            if (r9 != 0) goto L_0x0245
            boolean r9 = r8.H
            if (r9 != 0) goto L_0x0245
            r9 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r8.p(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r8.p(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0237
            int r10 = r8.q
            if (r10 == r6) goto L_0x0237
            if (r9 != r11) goto L_0x0237
            int r9 = r8.r
            if (r9 == r6) goto L_0x0237
            r9 = r6
            goto L_0x0238
        L_0x0237:
            r9 = 0
        L_0x0238:
            if (r9 != 0) goto L_0x0245
            h0.g.a.h.k.b$a r9 = new h0.g.a.h.k.b$a
            r9.<init>()
            h0.g.a.h.k.b$b r10 = r1.Q0
            r11 = 0
            g0(r8, r10, r9, r11)
        L_0x0245:
            int r2 = r2 + 1
            goto L_0x01fe
        L_0x0248:
            r2 = 2
            if (r3 <= r2) goto L_0x0623
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0251
            if (r7 != r9) goto L_0x0623
        L_0x0251:
            int r9 = r1.Z0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = h0.g.a.h.h.b(r9, r10)
            if (r9 == 0) goto L_0x0623
            h0.g.a.h.k.b$b r9 = r1.Q0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r1.M0
            int r11 = r10.size()
            r12 = 0
        L_0x0264:
            if (r12 >= r11) goto L_0x0297
            java.lang.Object r13 = r10.get(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r24.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r24.v()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r13.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r13.v()
            boolean r2 = g0.a.b.b.a.E0(r14, r15, r2, r8)
            if (r2 != 0) goto L_0x0283
            goto L_0x0287
        L_0x0283:
            boolean r2 = r13 instanceof h0.g.a.h.d
            if (r2 == 0) goto L_0x0293
        L_0x0287:
            r22 = r0
            r20 = r3
            r19 = r4
            r23 = r5
            r21 = r7
            goto L_0x05d7
        L_0x0293:
            int r12 = r12 + 1
            r2 = 2
            goto L_0x0264
        L_0x0297:
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x029e:
            if (r6 >= r11) goto L_0x0384
            java.lang.Object r19 = r10.get(r6)
            r20 = r3
            r3 = r19
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            r19 = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r24.r()
            r21 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r24.v()
            r22 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r3.r()
            r23 = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.v()
            boolean r0 = g0.a.b.b.a.E0(r4, r7, r0, r5)
            if (r0 != 0) goto L_0x02ce
            h0.g.a.h.k.b$a r0 = r1.h1
            r4 = 0
            g0(r3, r9, r0, r4)
        L_0x02ce:
            boolean r0 = r3 instanceof h0.g.a.h.e
            if (r0 == 0) goto L_0x02f3
            r4 = r3
            h0.g.a.h.e r4 = (h0.g.a.h.e) r4
            int r5 = r4.Q0
            if (r5 != 0) goto L_0x02e4
            if (r12 != 0) goto L_0x02e1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = r5
        L_0x02e1:
            r12.add(r4)
        L_0x02e4:
            int r5 = r4.Q0
            r7 = 1
            if (r5 != r7) goto L_0x02f3
            if (r2 != 0) goto L_0x02f0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02f0:
            r2.add(r4)
        L_0x02f3:
            boolean r4 = r3 instanceof h0.g.a.h.g
            if (r4 == 0) goto L_0x0338
            boolean r4 = r3 instanceof h0.g.a.h.a
            if (r4 == 0) goto L_0x0321
            r4 = r3
            h0.g.a.h.a r4 = (h0.g.a.h.a) r4
            int r5 = r4.Z()
            if (r5 != 0) goto L_0x030f
            if (r8 != 0) goto L_0x030c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x030c:
            r8.add(r4)
        L_0x030f:
            int r5 = r4.Z()
            r7 = 1
            if (r5 != r7) goto L_0x0338
            if (r13 != 0) goto L_0x031d
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x031d:
            r13.add(r4)
            goto L_0x0338
        L_0x0321:
            r4 = r3
            h0.g.a.h.g r4 = (h0.g.a.h.g) r4
            if (r8 != 0) goto L_0x032b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x032b:
            r8.add(r4)
            if (r13 != 0) goto L_0x0335
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0335:
            r13.add(r4)
        L_0x0338:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 != 0) goto L_0x0354
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 != 0) goto L_0x0354
            if (r0 != 0) goto L_0x0354
            boolean r4 = r3 instanceof h0.g.a.h.a
            if (r4 != 0) goto L_0x0354
            if (r14 != 0) goto L_0x0351
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0351:
            r14.add(r3)
        L_0x0354:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 != 0) goto L_0x0376
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 != 0) goto L_0x0376
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 != 0) goto L_0x0376
            if (r0 != 0) goto L_0x0376
            boolean r0 = r3 instanceof h0.g.a.h.a
            if (r0 != 0) goto L_0x0376
            if (r15 != 0) goto L_0x0373
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0373:
            r15.add(r3)
        L_0x0376:
            int r6 = r6 + 1
            r4 = r19
            r3 = r20
            r7 = r21
            r0 = r22
            r5 = r23
            goto L_0x029e
        L_0x0384:
            r22 = r0
            r20 = r3
            r19 = r4
            r23 = r5
            r21 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x03ab
            java.util.Iterator r2 = r2.iterator()
        L_0x0399:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ab
            java.lang.Object r3 = r2.next()
            h0.g.a.h.e r3 = (h0.g.a.h.e) r3
            r4 = 0
            r5 = 0
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x0399
        L_0x03ab:
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L_0x03cc
            java.util.Iterator r2 = r8.iterator()
        L_0x03b3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03cc
            java.lang.Object r3 = r2.next()
            h0.g.a.h.g r3 = (h0.g.a.h.g) r3
            h0.g.a.h.k.m r6 = g0.a.b.b.a.C(r3, r5, r0, r4)
            r3.X(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 0
            goto L_0x03b3
        L_0x03cc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x03ee
            java.util.Iterator r2 = r2.iterator()
        L_0x03da:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ee
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 0
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x03da
        L_0x03ee:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x0410
            java.util.Iterator r2 = r2.iterator()
        L_0x03fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0410
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 0
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x03fc
        L_0x0410:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x0432
            java.util.Iterator r2 = r2.iterator()
        L_0x041e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0432
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 0
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x041e
        L_0x0432:
            r4 = 0
            r5 = 0
            if (r14 == 0) goto L_0x044a
            java.util.Iterator r2 = r14.iterator()
        L_0x043a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x044a
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x043a
        L_0x044a:
            if (r12 == 0) goto L_0x0461
            java.util.Iterator r2 = r12.iterator()
        L_0x0450:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0461
            java.lang.Object r3 = r2.next()
            h0.g.a.h.e r3 = (h0.g.a.h.e) r3
            r5 = 1
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x0450
        L_0x0461:
            r5 = 1
            if (r13 == 0) goto L_0x0481
            java.util.Iterator r2 = r13.iterator()
        L_0x0468:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0481
            java.lang.Object r3 = r2.next()
            h0.g.a.h.g r3 = (h0.g.a.h.g) r3
            h0.g.a.h.k.m r6 = g0.a.b.b.a.C(r3, r5, r0, r4)
            r3.X(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0468
        L_0x0481:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x04a3
            java.util.Iterator r2 = r2.iterator()
        L_0x048f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04a3
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 1
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x048f
        L_0x04a3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x04c5
            java.util.Iterator r2 = r2.iterator()
        L_0x04b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c5
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 1
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x04b1
        L_0x04c5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x04e7
            java.util.Iterator r2 = r2.iterator()
        L_0x04d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04e7
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 1
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x04d3
        L_0x04e7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.n(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.a
            if (r2 == 0) goto L_0x0509
            java.util.Iterator r2 = r2.iterator()
        L_0x04f5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0509
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.d
            r4 = 0
            r5 = 1
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x04f5
        L_0x0509:
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L_0x0521
            java.util.Iterator r2 = r15.iterator()
        L_0x0511:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0521
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            g0.a.b.b.a.C(r3, r5, r0, r4)
            goto L_0x0511
        L_0x0521:
            r2 = 0
        L_0x0522:
            if (r2 >= r11) goto L_0x055a
            java.lang.Object r3 = r10.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.V
            r5 = 0
            r6 = r4[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r5) goto L_0x053a
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x053a
            r4 = 1
            goto L_0x053b
        L_0x053a:
            r4 = 0
        L_0x053b:
            if (r4 == 0) goto L_0x0557
            int r4 = r3.K0
            h0.g.a.h.k.m r4 = g0.a.b.b.a.D(r0, r4)
            int r3 = r3.L0
            h0.g.a.h.k.m r3 = g0.a.b.b.a.D(r0, r3)
            if (r4 == 0) goto L_0x0557
            if (r3 == 0) goto L_0x0557
            r5 = 0
            r4.d(r5, r3)
            r5 = 2
            r3.d = r5
            r0.remove(r4)
        L_0x0557:
            int r2 = r2 + 1
            goto L_0x0522
        L_0x055a:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x0563
            goto L_0x05d7
        L_0x0563:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r24.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x059a
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x0571:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x058f
            java.lang.Object r5 = r2.next()
            h0.g.a.h.k.m r5 = (h0.g.a.h.k.m) r5
            int r6 = r5.d
            r7 = 1
            if (r6 != r7) goto L_0x0583
            goto L_0x0571
        L_0x0583:
            h0.g.a.d r6 = r1.S0
            r7 = 0
            int r6 = r5.c(r6, r7)
            if (r6 <= r4) goto L_0x0571
            r3 = r5
            r4 = r6
            goto L_0x0571
        L_0x058f:
            if (r3 == 0) goto L_0x059a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.Q(r2)
            r1.U(r4)
            goto L_0x059b
        L_0x059a:
            r3 = 0
        L_0x059b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r24.v()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r4) goto L_0x05d1
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x05a9:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05c6
            java.lang.Object r5 = r0.next()
            h0.g.a.h.k.m r5 = (h0.g.a.h.k.m) r5
            int r6 = r5.d
            if (r6 != 0) goto L_0x05ba
            goto L_0x05a9
        L_0x05ba:
            h0.g.a.d r6 = r1.S0
            r7 = 1
            int r6 = r5.c(r6, r7)
            if (r6 <= r4) goto L_0x05a9
            r2 = r5
            r4 = r6
            goto L_0x05a9
        L_0x05c6:
            if (r2 == 0) goto L_0x05d1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.T(r0)
            r1.P(r4)
            goto L_0x05d2
        L_0x05d1:
            r2 = 0
        L_0x05d2:
            if (r3 != 0) goto L_0x05d9
            if (r2 == 0) goto L_0x05d7
            goto L_0x05d9
        L_0x05d7:
            r0 = 0
            goto L_0x05da
        L_0x05d9:
            r0 = 1
        L_0x05da:
            if (r0 == 0) goto L_0x061a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r2 = r23
            if (r2 != r0) goto L_0x05f8
            int r3 = r24.w()
            r4 = r22
            if (r4 >= r3) goto L_0x05f3
            if (r4 <= 0) goto L_0x05f3
            r1.U(r4)
            r3 = 1
            r1.a1 = r3
            goto L_0x05fa
        L_0x05f3:
            int r3 = r24.w()
            goto L_0x05fb
        L_0x05f8:
            r4 = r22
        L_0x05fa:
            r3 = r4
        L_0x05fb:
            r5 = r21
            if (r5 != r0) goto L_0x0615
            int r0 = r24.q()
            r6 = r19
            if (r6 >= r0) goto L_0x0610
            if (r6 <= 0) goto L_0x0610
            r1.P(r6)
            r4 = 1
            r1.b1 = r4
            goto L_0x0617
        L_0x0610:
            int r4 = r24.q()
            goto L_0x0618
        L_0x0615:
            r6 = r19
        L_0x0617:
            r4 = r6
        L_0x0618:
            r0 = 1
            goto L_0x062c
        L_0x061a:
            r6 = r19
            r5 = r21
            r4 = r22
            r2 = r23
            goto L_0x0629
        L_0x0623:
            r20 = r3
            r6 = r4
            r2 = r5
            r5 = r7
            r4 = r0
        L_0x0629:
            r3 = r4
            r4 = r6
            r0 = 0
        L_0x062c:
            r6 = 64
            boolean r7 = r1.h0(r6)
            if (r7 != 0) goto L_0x063f
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.h0(r7)
            if (r7 == 0) goto L_0x063d
            goto L_0x063f
        L_0x063d:
            r7 = 0
            goto L_0x0640
        L_0x063f:
            r7 = 1
        L_0x0640:
            h0.g.a.d r8 = r1.S0
            java.util.Objects.requireNonNull(r8)
            r9 = 0
            r8.j = r9
            int r9 = r1.Z0
            if (r9 == 0) goto L_0x0651
            if (r7 == 0) goto L_0x0651
            r7 = 1
            r8.j = r7
        L_0x0651:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r1.M0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r24.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r9) goto L_0x0665
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r24.v()
            if (r8 != r9) goto L_0x0662
            goto L_0x0665
        L_0x0662:
            r8 = 0
            r10 = 0
            goto L_0x0667
        L_0x0665:
            r8 = 0
            r10 = 1
        L_0x0667:
            r1.V0 = r8
            r1.W0 = r8
            r9 = r20
            r8 = 0
        L_0x066e:
            if (r8 >= r9) goto L_0x0684
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r1.M0
            java.lang.Object r11 = r11.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof h0.g.a.h.j
            if (r12 == 0) goto L_0x0681
            h0.g.a.h.j r11 = (h0.g.a.h.j) r11
            r11.X()
        L_0x0681:
            int r8 = r8 + 1
            goto L_0x066e
        L_0x0684:
            boolean r8 = r1.h0(r6)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x068b:
            if (r12 == 0) goto L_0x08de
            r13 = 1
            int r14 = r0 + 1
            h0.g.a.d r0 = r1.S0     // Catch:{ Exception -> 0x076b }
            r0.u()     // Catch:{ Exception -> 0x076b }
            r13 = 0
            r1.V0 = r13     // Catch:{ Exception -> 0x076b }
            r1.W0 = r13     // Catch:{ Exception -> 0x076b }
            h0.g.a.d r0 = r1.S0     // Catch:{ Exception -> 0x076b }
            r1.l(r0)     // Catch:{ Exception -> 0x076b }
            r0 = 0
        L_0x06a0:
            if (r0 >= r9) goto L_0x06b2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.M0     // Catch:{ Exception -> 0x076b }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x076b }
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13     // Catch:{ Exception -> 0x076b }
            h0.g.a.d r15 = r1.S0     // Catch:{ Exception -> 0x076b }
            r13.l(r15)     // Catch:{ Exception -> 0x076b }
            int r0 = r0 + 1
            goto L_0x06a0
        L_0x06b2:
            h0.g.a.d r0 = r1.S0     // Catch:{ Exception -> 0x076b }
            r1.Z(r0)     // Catch:{ Exception -> 0x076b }
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.c1     // Catch:{ Exception -> 0x075d }
            r12 = 5
            if (r0 == 0) goto L_0x06e1
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x06e1
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.c1     // Catch:{ Exception -> 0x075d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r1.L     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r13 = r13.l(r15)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r15 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r0 = r15.l(r0)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r15 = r1.S0     // Catch:{ Exception -> 0x075d }
            r6 = 0
            r15.f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x075d }
            r6 = 0
            r1.c1 = r6     // Catch:{ Exception -> 0x0768 }
        L_0x06e1:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.e1     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x070a
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x070a
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.e1     // Catch:{ Exception -> 0x075d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r6 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r1.N     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.l(r13)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r0 = r13.l(r0)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x075d }
            r6 = 0
            r1.e1 = r6     // Catch:{ Exception -> 0x0768 }
        L_0x070a:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.d1     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x0733
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x0733
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.d1     // Catch:{ Exception -> 0x075d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r6 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r1.K     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.l(r13)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r0 = r13.l(r0)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            r15 = 0
            r13.f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x075d }
            r6 = 0
            r1.d1 = r6     // Catch:{ Exception -> 0x0768 }
        L_0x0733:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f1     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x0760
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x0760
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f1     // Catch:{ Exception -> 0x075d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r6 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r1.M     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.l(r13)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            androidx.constraintlayout.core.SolverVariable r0 = r13.l(r0)     // Catch:{ Exception -> 0x075d }
            h0.g.a.d r13 = r1.S0     // Catch:{ Exception -> 0x075d }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x075d }
            r6 = 0
            r1.f1 = r6     // Catch:{ Exception -> 0x0768 }
            goto L_0x0761
        L_0x075d:
            r0 = move-exception
            r6 = 0
            goto L_0x0769
        L_0x0760:
            r6 = 0
        L_0x0761:
            h0.g.a.d r0 = r1.S0     // Catch:{ Exception -> 0x0768 }
            r0.q()     // Catch:{ Exception -> 0x0768 }
            r12 = 1
            goto L_0x0786
        L_0x0768:
            r0 = move-exception
        L_0x0769:
            r12 = 1
            goto L_0x076d
        L_0x076b:
            r0 = move-exception
            r6 = 0
        L_0x076d:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x0786:
            if (r12 == 0) goto L_0x07cf
            h0.g.a.d r0 = r1.S0
            boolean[] r6 = h0.g.a.h.h.a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.h0(r6)
            r1.W(r0, r12)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.M0
            int r13 = r13.size()
            r15 = 0
            r19 = 0
        L_0x07a2:
            if (r15 >= r13) goto L_0x07cd
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.M0
            java.lang.Object r6 = r6.get(r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            r6.W(r0, r12)
            r21 = r0
            int r0 = r6.h
            r22 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07bf
            int r0 = r6.i
            if (r0 == r12) goto L_0x07bd
            goto L_0x07bf
        L_0x07bd:
            r0 = 0
            goto L_0x07c0
        L_0x07bf:
            r0 = 1
        L_0x07c0:
            if (r0 == 0) goto L_0x07c4
            r19 = 1
        L_0x07c4:
            int r15 = r15 + 1
            r0 = r21
            r12 = r22
            r6 = 64
            goto L_0x07a2
        L_0x07cd:
            r12 = -1
            goto L_0x07ea
        L_0x07cf:
            r12 = -1
            h0.g.a.d r0 = r1.S0
            r1.W(r0, r8)
            r0 = 0
        L_0x07d6:
            if (r0 >= r9) goto L_0x07e8
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.M0
            java.lang.Object r6 = r6.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            h0.g.a.d r13 = r1.S0
            r6.W(r13, r8)
            int r0 = r0 + 1
            goto L_0x07d6
        L_0x07e8:
            r19 = 0
        L_0x07ea:
            r0 = 8
            if (r10 == 0) goto L_0x0855
            if (r14 >= r0) goto L_0x0855
            boolean[] r6 = h0.g.a.h.h.a
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x0855
            r6 = 0
            r12 = 0
            r15 = 0
        L_0x07fa:
            if (r6 >= r9) goto L_0x0821
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.M0
            java.lang.Object r13 = r13.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            int r0 = r13.b0
            int r22 = r13.w()
            int r0 = r22 + r0
            int r15 = java.lang.Math.max(r15, r0)
            int r0 = r13.c0
            int r13 = r13.q()
            int r13 = r13 + r0
            int r12 = java.lang.Math.max(r12, r13)
            int r6 = r6 + 1
            r0 = 8
            r13 = 2
            goto L_0x07fa
        L_0x0821:
            int r0 = r1.f2i0
            int r0 = java.lang.Math.max(r0, r15)
            int r6 = r1.f3j0
            int r6 = java.lang.Math.max(r6, r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r12) goto L_0x0842
            int r13 = r24.w()
            if (r13 >= r0) goto L_0x0842
            r1.U(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            r11 = 0
            r0[r11] = r12
            r11 = 1
            r19 = 1
        L_0x0842:
            if (r5 != r12) goto L_0x0855
            int r0 = r24.q()
            if (r0 >= r6) goto L_0x0855
            r1.P(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            r6 = 1
            r0[r6] = r12
            r11 = 1
            r19 = 1
        L_0x0855:
            int r0 = r1.f2i0
            int r6 = r24.w()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r24.w()
            if (r0 <= r6) goto L_0x0872
            r1.U(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11 = 0
            r0[r11] = r6
            r11 = 1
            r19 = 1
        L_0x0872:
            int r0 = r1.f3j0
            int r6 = r24.q()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r24.q()
            if (r0 <= r6) goto L_0x0890
            r1.P(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12 = 1
            r0[r12] = r6
            r11 = r12
            r19 = r11
            goto L_0x0891
        L_0x0890:
            r12 = 1
        L_0x0891:
            if (r11 != 0) goto L_0x08d1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            r6 = 0
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x08b2
            if (r3 <= 0) goto L_0x08b2
            int r0 = r24.w()
            if (r0 <= r3) goto L_0x08b2
            r1.a1 = r12
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r11
            r1.U(r3)
            r11 = r12
            r19 = r11
        L_0x08b2:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            r0 = r0[r12]
            if (r0 != r13) goto L_0x08d1
            if (r4 <= 0) goto L_0x08d1
            int r0 = r24.q()
            if (r0 <= r4) goto L_0x08d1
            r1.b1 = r12
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r12] = r6
            r1.P(r4)
            r0 = 8
            r11 = 1
            r19 = 1
            goto L_0x08d3
        L_0x08d1:
            r0 = 8
        L_0x08d3:
            if (r14 <= r0) goto L_0x08d7
            r12 = 0
            goto L_0x08d9
        L_0x08d7:
            r12 = r19
        L_0x08d9:
            r0 = r14
            r6 = 64
            goto L_0x068b
        L_0x08de:
            r1.M0 = r7
            if (r11 == 0) goto L_0x08ea
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.V
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r5
        L_0x08ea:
            h0.g.a.d r0 = r1.S0
            h0.g.a.c r0 = r0.o
            r1.L(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.c.X():void");
    }

    public void Y(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.V0 + 1;
            b[] bVarArr = this.Y0;
            if (i2 >= bVarArr.length) {
                this.Y0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.Y0;
            int i3 = this.V0;
            bVarArr2[i3] = new b(constraintWidget, 0, this.R0);
            this.V0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.W0 + 1;
            b[] bVarArr3 = this.X0;
            if (i4 >= bVarArr3.length) {
                this.X0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.X0;
            int i5 = this.W0;
            bVarArr4[i5] = new b(constraintWidget, 1, this.R0);
            this.W0 = i5 + 1;
        }
    }

    public boolean Z(d dVar) {
        boolean z;
        boolean h02 = h0(64);
        f(dVar, h02);
        int size = this.M0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.M0.get(i);
            boolean[] zArr = constraintWidget.U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.M0.get(i2);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i3 = 0; i3 < aVar.N0; i3++) {
                        ConstraintWidget constraintWidget3 = aVar.M0[i3];
                        if (aVar.P0 || constraintWidget3.g()) {
                            int i4 = aVar.O0;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.U[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.g1.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = this.M0.get(i5);
            if (constraintWidget4.e()) {
                if (constraintWidget4 instanceof i) {
                    this.g1.add(constraintWidget4);
                } else {
                    constraintWidget4.f(dVar, h02);
                }
            }
        }
        while (this.g1.size() > 0) {
            int size2 = this.g1.size();
            Iterator<ConstraintWidget> it = this.g1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) it.next();
                HashSet<ConstraintWidget> hashSet = this.g1;
                int i6 = 0;
                while (true) {
                    if (i6 >= iVar.N0) {
                        z = false;
                        continue;
                        break;
                    } else if (hashSet.contains(iVar.M0[i6])) {
                        z = true;
                        continue;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (z) {
                    iVar.f(dVar, h02);
                    this.g1.remove(iVar);
                    break;
                }
            }
            if (size2 == this.g1.size()) {
                Iterator<ConstraintWidget> it2 = this.g1.iterator();
                while (it2.hasNext()) {
                    it2.next().f(dVar, h02);
                }
                this.g1.clear();
            }
        }
        if (d.a) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = this.M0.get(i7);
                if (!constraintWidget5.e()) {
                    hashSet2.add(constraintWidget5);
                }
            }
            d(this, dVar, hashSet2, r() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) it3.next();
                h.a(this, dVar, constraintWidget6);
                constraintWidget6.f(dVar, h02);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = this.M0.get(i8);
                if (constraintWidget7 instanceof c) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.Q(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.T(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.f(dVar, h02);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.Q(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.T(dimensionBehaviour2);
                    }
                } else {
                    h.a(this, dVar, constraintWidget7);
                    if (!constraintWidget7.e()) {
                        constraintWidget7.f(dVar, h02);
                    }
                }
            }
        }
        if (this.V0 > 0) {
            a.c(this, dVar, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.W0 > 0) {
            a.c(this, dVar, (ArrayList<ConstraintWidget>) null, 1);
        }
        return true;
    }

    public void a0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > ((ConstraintAnchor) this.f1.get()).d()) {
            this.f1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void b0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.d1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > ((ConstraintAnchor) this.d1.get()).d()) {
            this.d1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void c0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.e1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > ((ConstraintAnchor) this.e1.get()).d()) {
            this.e1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void d0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.c1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > ((ConstraintAnchor) this.c1.get()).d()) {
            this.c1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144 A[EDGE_INSN: B:77:0x0144->B:62:0x0144 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e0(boolean r11, int r12) {
        /*
            r10 = this;
            h0.g.a.h.k.e r0 = r10.O0
            r1 = 1
            r11 = r11 & r1
            h0.g.a.h.c r2 = r0.a
            r3 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.p(r3)
            h0.g.a.h.c r4 = r0.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r4.p(r1)
            h0.g.a.h.c r5 = r0.a
            int r5 = r5.x()
            h0.g.a.h.c r6 = r0.a
            int r6 = r6.y()
            if (r11 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 == r7) goto L_0x0025
            if (r4 != r7) goto L_0x008b
        L_0x0025:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.e
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0042
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            int r9 = r8.f
            if (r9 != r12) goto L_0x002b
            boolean r8 = r8.k()
            if (r8 != 0) goto L_0x002b
            r11 = r3
        L_0x0042:
            if (r12 != 0) goto L_0x0068
            if (r11 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r11) goto L_0x008b
            h0.g.a.h.c r11 = r0.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11.Q(r7)
            h0.g.a.h.c r11 = r0.a
            int r7 = r0.d(r11, r3)
            r11.U(r7)
            h0.g.a.h.c r11 = r0.a
            h0.g.a.h.k.j r7 = r11.d
            h0.g.a.h.k.f r7 = r7.e
            int r11 = r11.w()
            r7.c(r11)
            goto L_0x008b
        L_0x0068:
            if (r11 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r11) goto L_0x008b
            h0.g.a.h.c r11 = r0.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11.T(r7)
            h0.g.a.h.c r11 = r0.a
            int r7 = r0.d(r11, r1)
            r11.P(r7)
            h0.g.a.h.c r11 = r0.a
            h0.g.a.h.k.l r7 = r11.e
            h0.g.a.h.k.f r7 = r7.e
            int r11 = r11.q()
            r7.c(r11)
        L_0x008b:
            if (r12 != 0) goto L_0x00b6
            h0.g.a.h.c r11 = r0.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r11.V
            r7 = r6[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 == r8) goto L_0x009d
            r6 = r6[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r6 != r7) goto L_0x00c7
        L_0x009d:
            int r11 = r11.w()
            int r11 = r11 + r5
            h0.g.a.h.c r6 = r0.a
            h0.g.a.h.k.j r6 = r6.d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.i
            r6.c(r11)
            h0.g.a.h.c r6 = r0.a
            h0.g.a.h.k.j r6 = r6.d
            h0.g.a.h.k.f r6 = r6.e
            int r11 = r11 - r5
            r6.c(r11)
            goto L_0x00e1
        L_0x00b6:
            h0.g.a.h.c r11 = r0.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r11.V
            r7 = r5[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 == r8) goto L_0x00c9
            r5 = r5[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r7) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r11 = r3
            goto L_0x00e2
        L_0x00c9:
            int r11 = r11.q()
            int r11 = r11 + r6
            h0.g.a.h.c r5 = r0.a
            h0.g.a.h.k.l r5 = r5.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.i
            r5.c(r11)
            h0.g.a.h.c r5 = r0.a
            h0.g.a.h.k.l r5 = r5.e
            h0.g.a.h.k.f r5 = r5.e
            int r11 = r11 - r6
            r5.c(r11)
        L_0x00e1:
            r11 = r1
        L_0x00e2:
            r0.g()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r0.e
            java.util.Iterator r5 = r5.iterator()
        L_0x00eb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x010b
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r6
            int r7 = r6.f
            if (r7 == r12) goto L_0x00fc
            goto L_0x00eb
        L_0x00fc:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.b
            h0.g.a.h.c r8 = r0.a
            if (r7 != r8) goto L_0x0107
            boolean r7 = r6.g
            if (r7 != 0) goto L_0x0107
            goto L_0x00eb
        L_0x0107:
            r6.e()
            goto L_0x00eb
        L_0x010b:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r0.e
            java.util.Iterator r5 = r5.iterator()
        L_0x0111:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0144
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r6
            int r7 = r6.f
            if (r7 == r12) goto L_0x0122
            goto L_0x0111
        L_0x0122:
            if (r11 != 0) goto L_0x012b
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.b
            h0.g.a.h.c r8 = r0.a
            if (r7 != r8) goto L_0x012b
            goto L_0x0111
        L_0x012b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.h
            boolean r7 = r7.j
            if (r7 != 0) goto L_0x0132
            goto L_0x0143
        L_0x0132:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.i
            boolean r7 = r7.j
            if (r7 != 0) goto L_0x0139
            goto L_0x0143
        L_0x0139:
            boolean r7 = r6 instanceof h0.g.a.h.k.c
            if (r7 != 0) goto L_0x0111
            h0.g.a.h.k.f r6 = r6.e
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x0111
        L_0x0143:
            r1 = r3
        L_0x0144:
            h0.g.a.h.c r11 = r0.a
            r11.Q(r2)
            h0.g.a.h.c r11 = r0.a
            r11.T(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.c.e0(boolean, int):boolean");
    }

    public void f0() {
        this.O0.b = true;
    }

    public boolean h0(int i) {
        return (this.Z0 & i) == i;
    }

    public void i0(b.C0030b bVar) {
        this.Q0 = bVar;
        this.O0.f = bVar;
    }

    public void j0(int i) {
        this.Z0 = i;
        d.a = h0(512);
    }
}
