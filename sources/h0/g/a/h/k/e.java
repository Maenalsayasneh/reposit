package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.g.a.h.c;
import h0.g.a.h.g;
import h0.g.a.h.k.b;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: DependencyGraph */
public class e {
    public c a;
    public boolean b = true;
    public boolean c = true;
    public c d;
    public ArrayList<WidgetRun> e = new ArrayList<>();
    public b.C0030b f;
    public b.a g;
    public ArrayList<k> h;

    public e(c cVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.a = cVar;
        this.d = cVar;
    }

    public final void a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<k> arrayList, k kVar) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.c == null) {
            c cVar = this.a;
            if (widgetRun != cVar.d && widgetRun != cVar.e) {
                if (kVar == null) {
                    kVar = new k(widgetRun, i2);
                    arrayList.add(kVar);
                }
                widgetRun.c = kVar;
                kVar.c.add(widgetRun);
                for (d next : widgetRun.h.k) {
                    if (next instanceof DependencyNode) {
                        a((DependencyNode) next, i, 0, dependencyNode2, arrayList, kVar);
                    }
                }
                for (d next2 : widgetRun.i.k) {
                    if (next2 instanceof DependencyNode) {
                        a((DependencyNode) next2, i, 1, dependencyNode2, arrayList, kVar);
                    }
                }
                if (i == 1 && (widgetRun instanceof l)) {
                    for (d next3 : ((l) widgetRun).k.k) {
                        if (next3 instanceof DependencyNode) {
                            a((DependencyNode) next3, i, 2, dependencyNode2, arrayList, kVar);
                        }
                    }
                }
                for (DependencyNode a2 : widgetRun.h.l) {
                    a(a2, i, 0, dependencyNode2, arrayList, kVar);
                }
                for (DependencyNode a3 : widgetRun.i.l) {
                    a(a3, i, 1, dependencyNode2, arrayList, kVar);
                }
                if (i == 1 && (widgetRun instanceof l)) {
                    for (DependencyNode a4 : ((l) widgetRun).k.l) {
                        a(a4, i, 2, dependencyNode2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028c, code lost:
        r4 = r0.V;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(h0.g.a.h.c r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.M0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0347
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.V
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.f8o0
            r7 = 8
            if (r6 != r7) goto L_0x0025
            r2.a = r10
            goto L_0x0008
        L_0x0025:
            float r6 = r2.v
            r11 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r8 = 2
            if (r7 >= 0) goto L_0x0034
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r7) goto L_0x0034
            r2.q = r8
        L_0x0034:
            float r7 = r2.y
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0040
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r9) goto L_0x0040
            r2.r = r8
        L_0x0040:
            float r9 = r2.Z
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            r12 = 3
            if (r9 <= 0) goto L_0x0074
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r9) goto L_0x0057
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r13) goto L_0x0054
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r13) goto L_0x0057
        L_0x0054:
            r2.q = r12
            goto L_0x0074
        L_0x0057:
            if (r4 != r9) goto L_0x0064
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r13) goto L_0x0061
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r13) goto L_0x0064
        L_0x0061:
            r2.r = r12
            goto L_0x0074
        L_0x0064:
            if (r5 != r9) goto L_0x0074
            if (r4 != r9) goto L_0x0074
            int r9 = r2.q
            if (r9 != 0) goto L_0x006e
            r2.q = r12
        L_0x006e:
            int r9 = r2.r
            if (r9 != 0) goto L_0x0074
            r2.r = r12
        L_0x0074:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r9) goto L_0x008a
            int r13 = r2.q
            if (r13 != r10) goto L_0x008a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r2.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f
            if (r13 == 0) goto L_0x0088
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r2.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f
            if (r13 != 0) goto L_0x008a
        L_0x0088:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008a:
            r13 = r5
            if (r4 != r9) goto L_0x009f
            int r5 = r2.r
            if (r5 != r10) goto L_0x009f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 == 0) goto L_0x009d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 != 0) goto L_0x009f
        L_0x009d:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x009f:
            r14 = r4
            h0.g.a.h.k.j r4 = r2.d
            r4.d = r13
            int r5 = r2.q
            r4.a = r5
            h0.g.a.h.k.l r4 = r2.e
            r4.d = r14
            int r15 = r2.r
            r4.a = r15
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r13 == r4) goto L_0x00bc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r13 == r11) goto L_0x00bc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != r11) goto L_0x00c8
        L_0x00bc:
            if (r14 == r4) goto L_0x02f0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r14 == r11) goto L_0x02f0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r14 != r11) goto L_0x00c8
            goto L_0x02f0
        L_0x00c8:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r13 != r9) goto L_0x019b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r14 == r3) goto L_0x00d4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r14 != r8) goto L_0x019b
        L_0x00d4:
            if (r5 != r12) goto L_0x010f
            if (r14 != r3) goto L_0x00e2
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r3
            r8 = r3
            r4.f(r5, r6, r7, r8, r9)
        L_0x00e2:
            int r9 = r2.q()
            float r3 = (float) r9
            float r4 = r2.Z
            float r3 = r3 * r4
            float r3 = r3 + r11
            int r7 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r2.a = r10
            goto L_0x0008
        L_0x010f:
            if (r5 != r10) goto L_0x0127
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r3
            r8 = r14
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r2 = r2.w()
            r3.m = r2
            goto L_0x0008
        L_0x0127:
            r8 = 2
            if (r5 != r8) goto L_0x0166
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r0.V
            r8 = 0
            r12 = r3[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r10) goto L_0x0137
            r3 = r3[r8]
            if (r3 != r4) goto L_0x019b
        L_0x0137:
            int r3 = r17.w()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r11
            int r7 = (int) r6
            int r9 = r2.q()
            r4 = r16
            r5 = r2
            r6 = r10
            r8 = r14
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r8 = 1
            r2.a = r8
            goto L_0x0008
        L_0x0166:
            r8 = r10
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r10 = r2.S
            r12 = 0
            r11 = r10[r12]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f
            if (r11 == 0) goto L_0x0176
            r10 = r10[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.f
            if (r8 != 0) goto L_0x019b
        L_0x0176:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r3
            r8 = r14
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r3 = 1
            r2.a = r3
            goto L_0x0008
        L_0x019b:
            if (r14 != r9) goto L_0x027d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 == r3) goto L_0x01a5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r13 != r8) goto L_0x027d
        L_0x01a5:
            r8 = 3
            if (r15 != r8) goto L_0x01ed
            if (r13 != r3) goto L_0x01b4
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r3
            r8 = r3
            r4.f(r5, r6, r7, r8, r9)
        L_0x01b4:
            int r7 = r2.w()
            float r3 = r2.Z
            int r4 = r2.a0
            r5 = -1
            if (r4 != r5) goto L_0x01c3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c3:
            float r4 = (float) r7
            float r4 = r4 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r3
            int r9 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r8 = 1
            r2.a = r8
            goto L_0x0008
        L_0x01ed:
            r8 = 1
            if (r15 != r8) goto L_0x0206
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r13
            r8 = r3
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r2 = r2.q()
            r3.m = r2
            goto L_0x0008
        L_0x0206:
            r8 = 2
            if (r15 != r8) goto L_0x0248
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r0.V
            r8 = 1
            r10 = r3[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 == r11) goto L_0x0216
            r3 = r3[r8]
            if (r3 != r4) goto L_0x027d
        L_0x0216:
            int r3 = r2.w()
            int r4 = r17.q()
            float r4 = (float) r4
            float r7 = r7 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r4
            int r9 = (int) r7
            r4 = r16
            r5 = r2
            r6 = r13
            r7 = r3
            r8 = r11
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r3 = 1
            r2.a = r3
            goto L_0x0008
        L_0x0248:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.S
            r8 = 2
            r10 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.f
            if (r8 == 0) goto L_0x0258
            r8 = 3
            r4 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f
            if (r4 != 0) goto L_0x027d
        L_0x0258:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r3
            r8 = r14
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r3 = 1
            r2.a = r3
            goto L_0x0008
        L_0x027d:
            r3 = 1
            if (r13 != r9) goto L_0x0008
            if (r14 != r9) goto L_0x0008
            if (r5 == r3) goto L_0x02cf
            if (r15 != r3) goto L_0x0287
            goto L_0x02cf
        L_0x0287:
            r4 = 2
            if (r15 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.V
            r5 = 0
            r5 = r4[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r8) goto L_0x0008
            r4 = r4[r3]
            if (r4 != r8) goto L_0x0008
            int r3 = r17.w()
            float r3 = (float) r3
            float r6 = r6 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r3
            int r9 = (int) r6
            int r4 = r17.q()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r3
            int r3 = (int) r7
            r4 = r16
            r5 = r2
            r6 = r8
            r7 = r9
            r9 = r3
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r3 = 1
            r2.a = r3
            goto L_0x0008
        L_0x02cf:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.m = r4
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r2 = r2.q()
            r3.m = r2
            goto L_0x0008
        L_0x02f0:
            int r3 = r2.w()
            if (r13 != r4) goto L_0x0309
            int r3 = r17.w()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.K
            int r5 = r5.g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.M
            int r5 = r5.g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x030b
        L_0x0309:
            r7 = r3
            r6 = r13
        L_0x030b:
            int r3 = r2.q()
            if (r14 != r4) goto L_0x0324
            int r3 = r17.q()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.L
            int r4 = r4.g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.N
            int r4 = r4.g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0326
        L_0x0324:
            r9 = r3
            r8 = r14
        L_0x0326:
            r4 = r16
            r5 = r2
            r4.f(r5, r6, r7, r8, r9)
            h0.g.a.h.k.j r3 = r2.d
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.w()
            r3.c(r4)
            h0.g.a.h.k.l r3 = r2.e
            h0.g.a.h.k.f r3 = r3.e
            int r4 = r2.q()
            r3.c(r4)
            r3 = 1
            r2.a = r3
            goto L_0x0008
        L_0x0347:
            r2 = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.k.e.b(h0.g.a.h.c):boolean");
    }

    public void c() {
        ArrayList<WidgetRun> arrayList = this.e;
        arrayList.clear();
        this.d.d.f();
        this.d.e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        Iterator<ConstraintWidget> it = this.d.M0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof h0.g.a.h.e) {
                arrayList.add(new h(next));
            } else {
                if (next.D()) {
                    if (next.b == null) {
                        next.b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.E()) {
                    if (next.c == null) {
                        next.c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof g) {
                    arrayList.add(new i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
        this.h.clear();
        k.a = 0;
        e(this.a.d, 0, this.h);
        e(this.a.e, 1, this.h);
        this.b = false;
    }

    public final int d(c cVar, int i) {
        float f2;
        e eVar = this;
        c cVar2 = cVar;
        int i2 = i;
        int size = eVar.h.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            k kVar = eVar.h.get(i3);
            WidgetRun widgetRun = kVar.b;
            if (widgetRun instanceof c) {
                if (((c) widgetRun).f != i2) {
                    j = Math.max(j, j2);
                    i3++;
                    j2 = 0;
                    eVar = this;
                    cVar2 = cVar;
                }
            } else if (i2 == 0) {
                if (!(widgetRun instanceof j)) {
                    j = Math.max(j, j2);
                    i3++;
                    j2 = 0;
                    eVar = this;
                    cVar2 = cVar;
                }
            } else if (!(widgetRun instanceof l)) {
                j = Math.max(j, j2);
                i3++;
                j2 = 0;
                eVar = this;
                cVar2 = cVar;
            }
            DependencyNode dependencyNode = (i2 == 0 ? cVar2.d : cVar2.e).h;
            DependencyNode dependencyNode2 = (i2 == 0 ? cVar2.d : cVar2.e).i;
            boolean contains = widgetRun.h.l.contains(dependencyNode);
            boolean contains2 = kVar.b.i.l.contains(dependencyNode2);
            long j3 = kVar.b.j();
            if (!contains || !contains2) {
                if (contains) {
                    DependencyNode dependencyNode3 = kVar.b.h;
                    j2 = Math.max(kVar.b(dependencyNode3, (long) dependencyNode3.f), ((long) kVar.b.h.f) + j3);
                } else if (contains2) {
                    DependencyNode dependencyNode4 = kVar.b.i;
                    j2 = Math.max(-kVar.a(dependencyNode4, (long) dependencyNode4.f), ((long) (-kVar.b.i.f)) + j3);
                } else {
                    WidgetRun widgetRun2 = kVar.b;
                    j2 = (widgetRun2.j() + ((long) widgetRun2.h.f)) - ((long) kVar.b.i.f);
                }
                j = Math.max(j, j2);
                i3++;
                j2 = 0;
                eVar = this;
                cVar2 = cVar;
            } else {
                long b2 = kVar.b(kVar.b.h, j2);
                long a2 = kVar.a(kVar.b.i, j2);
                long j4 = b2 - j3;
                WidgetRun widgetRun3 = kVar.b;
                int i4 = widgetRun3.i.f;
                if (j4 >= ((long) (-i4))) {
                    j4 += (long) i4;
                }
                long j5 = (long) widgetRun3.h.f;
                long j6 = ((-a2) - j3) - j5;
                if (j6 >= j5) {
                    j6 -= j5;
                }
                ConstraintWidget constraintWidget = widgetRun3.b;
                Objects.requireNonNull(constraintWidget);
                if (i2 == 0) {
                    f2 = constraintWidget.f4k0;
                } else {
                    f2 = i2 == 1 ? constraintWidget.f5l0 : -1.0f;
                }
                float f3 = (float) (f2 > 0.0f ? (long) ((((float) j4) / (1.0f - f2)) + (((float) j6) / f2)) : 0);
                long a3 = ((long) ((f3 * f2) + 0.5f)) + j3 + ((long) a.a(1.0f, f2, f3, 0.5f));
                WidgetRun widgetRun4 = kVar.b;
                j2 = (((long) widgetRun4.h.f) + a3) - ((long) widgetRun4.i.f);
                j = Math.max(j, j2);
                i3++;
                j2 = 0;
                eVar = this;
                cVar2 = cVar;
            }
        }
        return (int) j;
    }

    public final void e(WidgetRun widgetRun, int i, ArrayList<k> arrayList) {
        for (d next : widgetRun.h.k) {
            if (next instanceof DependencyNode) {
                a((DependencyNode) next, i, 0, widgetRun.i, arrayList, (k) null);
            } else if (next instanceof WidgetRun) {
                a(((WidgetRun) next).h, i, 0, widgetRun.i, arrayList, (k) null);
            }
        }
        for (d next2 : widgetRun.i.k) {
            if (next2 instanceof DependencyNode) {
                a((DependencyNode) next2, i, 1, widgetRun.h, arrayList, (k) null);
            } else if (next2 instanceof WidgetRun) {
                a(((WidgetRun) next2).i, i, 1, widgetRun.h, arrayList, (k) null);
            }
        }
        if (i == 1) {
            for (d next3 : ((l) widgetRun).k.k) {
                if (next3 instanceof DependencyNode) {
                    a((DependencyNode) next3, i, 2, (DependencyNode) null, arrayList, (k) null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.a aVar = this.g;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        ((ConstraintLayout.b) this.f).b(constraintWidget, aVar);
        constraintWidget.U(this.g.e);
        constraintWidget.P(this.g.f);
        b.a aVar2 = this.g;
        constraintWidget.F = aVar2.h;
        constraintWidget.M(aVar2.g);
    }

    public void g() {
        f fVar;
        Iterator<ConstraintWidget> it = this.a.M0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.q;
                int i2 = next.r;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                f fVar2 = next.d.e;
                boolean z3 = fVar2.j;
                f fVar3 = next.e.e;
                boolean z4 = fVar3.j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    f(next, dimensionBehaviour4, fVar2.g, dimensionBehaviour4, fVar3.g);
                    next.a = true;
                } else if (z3 && z) {
                    f(next, ConstraintWidget.DimensionBehaviour.FIXED, fVar2.g, dimensionBehaviour3, fVar3.g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.e.e.m = next.q();
                    } else {
                        next.e.e.c(next.q());
                        next.a = true;
                    }
                } else if (z4 && z2) {
                    f(next, dimensionBehaviour3, fVar2.g, ConstraintWidget.DimensionBehaviour.FIXED, fVar3.g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.d.e.m = next.w();
                    } else {
                        next.d.e.c(next.w());
                        next.a = true;
                    }
                }
                if (next.a && (fVar = next.e.l) != null) {
                    fVar.c(next.f1h0);
                }
            }
        }
    }
}
