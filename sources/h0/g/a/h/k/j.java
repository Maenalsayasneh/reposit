package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import h0.g.a.h.f;
import i0.d.a.a.a;

/* compiled from: HorizontalWidgetRun */
public class j extends WidgetRun {
    public static int[] k = new int[2];

    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = DependencyNode.Type.LEFT;
        this.i.e = DependencyNode.Type.RIGHT;
        this.f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0287, code lost:
        if (r14 != 1) goto L_0x02e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h0.g.a.h.k.d r17) {
        /*
            r16 = this;
            r8 = r16
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = r8.j
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x001d
            if (r0 == r1) goto L_0x001d
            if (r0 == r2) goto L_0x0013
            goto L_0x001d
        L_0x0013:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.M
            r8.l(r1, r0, r10)
            return
        L_0x001d:
            h0.g.a.h.k.f r0 = r8.e
            boolean r3 = r0.j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r3 != 0) goto L_0x02e6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r8.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x02e6
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r8.b
            int r4 = r3.q
            if (r4 == r1) goto L_0x02cf
            if (r4 == r2) goto L_0x0035
            goto L_0x02e6
        L_0x0035:
            int r1 = r3.r
            r4 = -1
            if (r1 == 0) goto L_0x006d
            if (r1 != r2) goto L_0x003d
            goto L_0x006d
        L_0x003d:
            int r1 = r3.a0
            if (r1 == r4) goto L_0x005c
            if (r1 == 0) goto L_0x0051
            if (r1 == r9) goto L_0x0047
            r1 = r10
            goto L_0x0068
        L_0x0047:
            h0.g.a.h.k.l r1 = r3.e
            h0.g.a.h.k.f r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r3.Z
            goto L_0x0065
        L_0x0051:
            h0.g.a.h.k.l r1 = r3.e
            h0.g.a.h.k.f r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r3.Z
            float r1 = r1 / r2
            goto L_0x0066
        L_0x005c:
            h0.g.a.h.k.l r1 = r3.e
            h0.g.a.h.k.f r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r3.Z
        L_0x0065:
            float r1 = r1 * r2
        L_0x0066:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0068:
            r0.c(r1)
            goto L_0x02e6
        L_0x006d:
            h0.g.a.h.k.l r0 = r3.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r0.h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r0.i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f
            if (r0 == 0) goto L_0x007b
            r0 = r9
            goto L_0x007c
        L_0x007b:
            r0 = r10
        L_0x007c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f
            if (r1 == 0) goto L_0x0084
            r1 = r9
            goto L_0x0085
        L_0x0084:
            r1 = r10
        L_0x0085:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r3.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f
            if (r2 == 0) goto L_0x008d
            r2 = r9
            goto L_0x008e
        L_0x008d:
            r2 = r10
        L_0x008e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r3.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 == 0) goto L_0x0096
            r5 = r9
            goto L_0x0097
        L_0x0096:
            r5 = r10
        L_0x0097:
            int r14 = r3.a0
            if (r0 == 0) goto L_0x01d8
            if (r1 == 0) goto L_0x01d8
            if (r2 == 0) goto L_0x01d8
            if (r5 == 0) goto L_0x01d8
            float r15 = r3.Z
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x0106
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x0106
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0105
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x00b8
            goto L_0x0105
        L_0x00b8:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.h
            int r1 = r1.f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            int r1 = r1.f
            int r3 = r0 - r1
            int r0 = r12.g
            int r1 = r12.f
            int r4 = r0 + r1
            int r0 = r13.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            h0.g.a.h.k.f r0 = r8.e
            int[] r1 = k
            r1 = r1[r10]
            r0.c(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            int[] r1 = k
            r1 = r1[r9]
            r0.c(r1)
        L_0x0105:
            return
        L_0x0106:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x0163
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x0163
            boolean r2 = r12.c
            if (r2 == 0) goto L_0x0162
            boolean r2 = r13.c
            if (r2 != 0) goto L_0x011b
            goto L_0x0162
        L_0x011b:
            int r2 = r0.g
            int r0 = r0.f
            int r2 = r2 + r0
            int r0 = r1.g
            int r1 = r1.f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            int r1 = r12.f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            h0.g.a.h.k.f r0 = r8.e
            int[] r1 = k
            r1 = r1[r10]
            r0.c(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            int[] r1 = k
            r1 = r1[r9]
            r0.c(r1)
            goto L_0x0163
        L_0x0162:
            return
        L_0x0163:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01d7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x01d7
            boolean r1 = r12.c
            if (r1 == 0) goto L_0x01d7
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x0178
            goto L_0x01d7
        L_0x0178:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.h
            int r1 = r1.f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            int r1 = r1.f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            int r1 = r12.f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            h0.g.a.h.k.f r0 = r8.e
            int[] r1 = k
            r1 = r1[r10]
            r0.c(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            int[] r1 = k
            r1 = r1[r9]
            r0.c(r1)
            goto L_0x02e6
        L_0x01d7:
            return
        L_0x01d8:
            if (r0 == 0) goto L_0x025a
            if (r2 == 0) goto L_0x025a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0259
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x01e9
            goto L_0x0259
        L_0x01e9:
            float r1 = r3.Z
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.h
            int r2 = r2.f
            int r0 = r0 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.i
            int r3 = r3.f
            int r2 = r2 - r3
            if (r14 == r4) goto L_0x0236
            if (r14 == 0) goto L_0x0236
            if (r14 == r9) goto L_0x0213
            goto L_0x02e6
        L_0x0213:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 / r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0226
            float r0 = (float) r3
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x0226:
            h0.g.a.h.k.f r1 = r8.e
            r1.c(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            r0.c(r3)
            goto L_0x02e6
        L_0x0236:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0249
            float r0 = (float) r3
            float r0 = r0 / r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x0249:
            h0.g.a.h.k.f r1 = r8.e
            r1.c(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            r0.c(r3)
            goto L_0x02e6
        L_0x0259:
            return
        L_0x025a:
            if (r1 == 0) goto L_0x02e6
            if (r5 == 0) goto L_0x02e6
            boolean r0 = r12.c
            if (r0 == 0) goto L_0x02ce
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0267
            goto L_0x02ce
        L_0x0267:
            float r0 = r3.Z
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r12.l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.g
            int r2 = r12.f
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r13.l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.g
            int r3 = r13.f
            int r2 = r2 - r3
            if (r14 == r4) goto L_0x02ac
            if (r14 == 0) goto L_0x028a
            if (r14 == r9) goto L_0x02ac
            goto L_0x02e6
        L_0x028a:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x029d
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x029d:
            h0.g.a.h.k.f r0 = r8.e
            r0.c(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            r0.c(r1)
            goto L_0x02e6
        L_0x02ac:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02bf
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02bf:
            h0.g.a.h.k.f r0 = r8.e
            r0.c(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            h0.g.a.h.k.l r0 = r0.e
            h0.g.a.h.k.f r0 = r0.e
            r0.c(r1)
            goto L_0x02e6
        L_0x02ce:
            return
        L_0x02cf:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r3.W
            if (r1 == 0) goto L_0x02e6
            h0.g.a.h.k.j r1 = r1.d
            h0.g.a.h.k.f r1 = r1.e
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x02e6
            float r2 = r3.v
            int r1 = r1.g
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.c(r1)
        L_0x02e6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0401
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x02f4
            goto L_0x0401
        L_0x02f4:
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0303
            boolean r0 = r1.j
            if (r0 == 0) goto L_0x0303
            h0.g.a.h.k.f r0 = r8.e
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0303
            return
        L_0x0303:
            h0.g.a.h.k.f r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x034d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x034d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.b
            int r1 = r0.q
            if (r1 != 0) goto L_0x034d
            boolean r0 = r0.D()
            if (r0 != 0) goto L_0x034d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.h
            int r3 = r2.f
            int r0 = r0 + r3
            int r1 = r1.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.i
            int r3 = r3.f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.c(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.i
            r0.c(r1)
            h0.g.a.h.k.f r0 = r8.e
            r0.c(r3)
            return
        L_0x034d:
            h0.g.a.h.k.f r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03b1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b1
            int r0 = r8.a
            if (r0 != r9) goto L_0x03b1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.h
            int r2 = r2.f
            int r0 = r0 + r2
            int r1 = r1.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.i
            int r2 = r2.f
            int r1 = r1 + r2
            int r1 = r1 - r0
            h0.g.a.h.k.f r0 = r8.e
            int r0 = r0.m
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.b
            int r2 = r1.u
            int r1 = r1.t
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ac
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ac:
            h0.g.a.h.k.f r1 = r8.e
            r1.c(r0)
        L_0x03b1:
            h0.g.a.h.k.f r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03b8
            return
        L_0x03b8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.h
            int r4 = r3.f
            int r4 = r4 + r2
            int r5 = r1.g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r8.i
            int r6 = r6.f
            int r6 = r6 + r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r8.b
            float r7 = r7.f4k0
            if (r0 != r1) goto L_0x03e2
            r7 = r11
            goto L_0x03e4
        L_0x03e2:
            r2 = r4
            r5 = r6
        L_0x03e4:
            int r5 = r5 - r2
            h0.g.a.h.k.f r0 = r8.e
            int r0 = r0.g
            int r5 = r5 - r0
            float r0 = (float) r2
            float r0 = r0 + r11
            float r1 = (float) r5
            float r1 = r1 * r7
            float r1 = r1 + r0
            int r0 = (int) r1
            r3.c(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.h
            int r1 = r1.g
            h0.g.a.h.k.f r2 = r8.e
            int r2 = r2.g
            int r1 = r1 + r2
            r0.c(r1)
        L_0x0401:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.k.j.a(h0.g.a.h.k.d):void");
    }

    public void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4 = this.b;
        if (constraintWidget4.a) {
            this.e.c(constraintWidget4.w());
        }
        if (!this.e.j) {
            ConstraintWidget.DimensionBehaviour r = this.b.r();
            this.d = r;
            if (r != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (r == dimensionBehaviour && (constraintWidget3 = this.b.W) != null && (constraintWidget3.r() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget3.r() == dimensionBehaviour)) {
                    int w = (constraintWidget3.w() - this.b.K.e()) - this.b.M.e();
                    b(this.h, constraintWidget3.d.h, this.b.K.e());
                    b(this.i, constraintWidget3.d.i, -this.b.M.e());
                    this.e.c(w);
                    return;
                } else if (this.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.e.c(this.b.w());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (constraintWidget2 = this.b.W) != null && (constraintWidget2.r() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget2.r() == dimensionBehaviour3)) {
                b(this.h, constraintWidget2.d.h, this.b.K.e());
                b(this.i, constraintWidget2.d.i, -this.b.M.e());
                return;
            }
        }
        f fVar = this.e;
        if (fVar.j) {
            ConstraintWidget constraintWidget5 = this.b;
            if (constraintWidget5.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.S;
                if (constraintAnchorArr[0].f == null || constraintAnchorArr[1].f == null) {
                    if (constraintAnchorArr[0].f != null) {
                        DependencyNode h = h(constraintAnchorArr[0]);
                        if (h != null) {
                            DependencyNode dependencyNode = this.h;
                            int e = this.b.S[0].e();
                            dependencyNode.l.add(h);
                            dependencyNode.f = e;
                            h.k.add(dependencyNode);
                            b(this.i, this.h, this.e.g);
                            return;
                        }
                        return;
                    } else if (constraintAnchorArr[1].f != null) {
                        DependencyNode h2 = h(constraintAnchorArr[1]);
                        if (h2 != null) {
                            DependencyNode dependencyNode2 = this.i;
                            dependencyNode2.l.add(h2);
                            dependencyNode2.f = -this.b.S[1].e();
                            h2.k.add(dependencyNode2);
                            b(this.h, this.i, -this.e.g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget5 instanceof f) && constraintWidget5.W != null && constraintWidget5.n(ConstraintAnchor.Type.CENTER).f == null) {
                        ConstraintWidget constraintWidget6 = this.b;
                        b(this.h, constraintWidget6.W.d.h, constraintWidget6.x());
                        b(this.i, this.h, this.e.g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget5.D()) {
                    this.h.f = this.b.S[0].e();
                    this.i.f = -this.b.S[1].e();
                    return;
                } else {
                    DependencyNode h3 = h(this.b.S[0]);
                    if (h3 != null) {
                        DependencyNode dependencyNode3 = this.h;
                        int e2 = this.b.S[0].e();
                        dependencyNode3.l.add(h3);
                        dependencyNode3.f = e2;
                        h3.k.add(dependencyNode3);
                    }
                    DependencyNode h4 = h(this.b.S[1]);
                    if (h4 != null) {
                        DependencyNode dependencyNode4 = this.i;
                        dependencyNode4.l.add(h4);
                        dependencyNode4.f = -this.b.S[1].e();
                        h4.k.add(dependencyNode4);
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
            }
        }
        if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget7 = this.b;
            int i = constraintWidget7.q;
            if (i == 2) {
                ConstraintWidget constraintWidget8 = constraintWidget7.W;
                if (constraintWidget8 != null) {
                    f fVar2 = constraintWidget8.e.e;
                    fVar.l.add(fVar2);
                    fVar2.k.add(this.e);
                    f fVar3 = this.e;
                    fVar3.b = true;
                    fVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3) {
                if (constraintWidget7.r == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    l lVar = constraintWidget7.e;
                    lVar.h.a = this;
                    lVar.i.a = this;
                    fVar.a = this;
                    if (constraintWidget7.E()) {
                        this.e.l.add(this.b.e.e);
                        this.b.e.e.k.add(this.e);
                        l lVar2 = this.b.e;
                        lVar2.e.a = this;
                        this.e.l.add(lVar2.h);
                        this.e.l.add(this.b.e.i);
                        this.b.e.h.k.add(this.e);
                        this.b.e.i.k.add(this.e);
                    } else if (this.b.D()) {
                        this.b.e.e.l.add(this.e);
                        this.e.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(this.e);
                    }
                } else {
                    f fVar4 = constraintWidget7.e.e;
                    fVar.l.add(fVar4);
                    fVar4.k.add(this.e);
                    this.b.e.h.k.add(this.e);
                    this.b.e.i.k.add(this.e);
                    f fVar5 = this.e;
                    fVar5.b = true;
                    fVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        ConstraintWidget constraintWidget9 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget9.S;
        if (constraintAnchorArr2[0].f == null || constraintAnchorArr2[1].f == null) {
            if (constraintAnchorArr2[0].f != null) {
                DependencyNode h5 = h(constraintAnchorArr2[0]);
                if (h5 != null) {
                    DependencyNode dependencyNode5 = this.h;
                    int e3 = this.b.S[0].e();
                    dependencyNode5.l.add(h5);
                    dependencyNode5.f = e3;
                    h5.k.add(dependencyNode5);
                    c(this.i, this.h, 1, this.e);
                }
            } else if (constraintAnchorArr2[1].f != null) {
                DependencyNode h6 = h(constraintAnchorArr2[1]);
                if (h6 != null) {
                    DependencyNode dependencyNode6 = this.i;
                    dependencyNode6.l.add(h6);
                    dependencyNode6.f = -this.b.S[1].e();
                    h6.k.add(dependencyNode6);
                    c(this.h, this.i, -1, this.e);
                }
            } else if (!(constraintWidget9 instanceof f) && (constraintWidget = constraintWidget9.W) != null) {
                b(this.h, constraintWidget.d.h, constraintWidget9.x());
                c(this.i, this.h, 1, this.e);
            }
        } else if (constraintWidget9.D()) {
            this.h.f = this.b.S[0].e();
            this.i.f = -this.b.S[1].e();
        } else {
            DependencyNode h7 = h(this.b.S[0]);
            DependencyNode h8 = h(this.b.S[1]);
            if (h7 != null) {
                h7.k.add(this);
                if (h7.j) {
                    a(this);
                }
            }
            if (h8 != null) {
                h8.k.add(this);
                if (h8.j) {
                    a(this);
                }
            }
            this.j = WidgetRun.RunType.CENTER;
        }
    }

    public void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.b0 = dependencyNode.g;
        }
    }

    public void f() {
        this.c = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    public boolean k() {
        if (this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.q == 0) {
            return true;
        }
        return false;
    }

    public final void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder P0 = a.P0("HorizontalRun ");
        P0.append(this.b.f9p0);
        return P0.toString();
    }
}
