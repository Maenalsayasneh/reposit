package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.h.k.d;
import h0.g.a.h.k.f;
import h0.g.a.h.k.k;

public abstract class WidgetRun implements d {
    public int a;
    public ConstraintWidget b;
    public k c;
    public ConstraintWidget.DimensionBehaviour d;
    public f e = new f(this);
    public int f = 0;
    public boolean g = false;
    public DependencyNode h = new DependencyNode(this);
    public DependencyNode i = new DependencyNode(this);
    public RunType j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    public void a(d dVar) {
    }

    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.f = i2;
        dependencyNode2.k.add(dependencyNode);
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, f fVar) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.l.add(this.e);
        dependencyNode.h = i2;
        dependencyNode.i = fVar;
        dependencyNode2.k.add(dependencyNode);
        fVar.k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.b;
            int i5 = constraintWidget.u;
            i4 = Math.max(constraintWidget.t, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.b;
            int i6 = constraintWidget2.x;
            int max = Math.max(constraintWidget2.w, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int ordinal = constraintAnchor2.e.ordinal();
        if (ordinal == 1) {
            return constraintWidget.d.h;
        }
        if (ordinal == 2) {
            return constraintWidget.e.h;
        }
        if (ordinal == 3) {
            return constraintWidget.d.i;
        }
        if (ordinal == 4) {
            return constraintWidget.e.i;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.e.k;
    }

    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        WidgetRun widgetRun = i2 == 0 ? constraintWidget.d : constraintWidget.e;
        int ordinal = constraintAnchor2.e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.i;
        }
        return null;
    }

    public long j() {
        f fVar = this.e;
        if (fVar.j) {
            return (long) fVar.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.a == 3) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            r12 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r12.h(r13)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r12.h(r14)
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.j
            if (r2 != 0) goto L_0x0012
            goto L_0x00f5
        L_0x0012:
            int r2 = r0.g
            int r13 = r13.e()
            int r13 = r13 + r2
            int r2 = r1.g
            int r14 = r14.e()
            int r2 = r2 - r14
            int r14 = r2 - r13
            h0.g.a.h.k.f r3 = r12.e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r12.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x00b4
            int r4 = r12.a
            if (r4 == 0) goto L_0x00ad
            r7 = 1
            if (r4 == r7) goto L_0x009d
            r8 = 2
            if (r4 == r8) goto L_0x0075
            r8 = 3
            if (r4 == r8) goto L_0x003f
            goto L_0x00b4
        L_0x003f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r12.b
            h0.g.a.h.k.j r9 = r4.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.d
            if (r10 != r6) goto L_0x0056
            int r10 = r9.a
            if (r10 != r8) goto L_0x0056
            h0.g.a.h.k.l r10 = r4.e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r10.d
            if (r11 != r6) goto L_0x0056
            int r6 = r10.a
            if (r6 != r8) goto L_0x0056
            goto L_0x00b4
        L_0x0056:
            if (r15 != 0) goto L_0x005a
            h0.g.a.h.k.l r9 = r4.e
        L_0x005a:
            h0.g.a.h.k.f r6 = r9.e
            boolean r8 = r6.j
            if (r8 == 0) goto L_0x00b4
            float r4 = r4.Z
            if (r15 != r7) goto L_0x006b
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0071
        L_0x006b:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0071:
            r3.c(r4)
            goto L_0x00b4
        L_0x0075:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r12.b
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r4.W
            if (r6 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x0080
            h0.g.a.h.k.j r6 = r6.d
            goto L_0x0082
        L_0x0080:
            h0.g.a.h.k.l r6 = r6.e
        L_0x0082:
            h0.g.a.h.k.f r6 = r6.e
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x008d
            float r4 = r4.v
            goto L_0x008f
        L_0x008d:
            float r4 = r4.y
        L_0x008f:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.g(r4, r15)
            r3.c(r4)
            goto L_0x00b4
        L_0x009d:
            int r3 = r3.m
            int r3 = r12.g(r3, r15)
            h0.g.a.h.k.f r4 = r12.e
            int r3 = java.lang.Math.min(r3, r14)
            r4.c(r3)
            goto L_0x00b4
        L_0x00ad:
            int r4 = r12.g(r14, r15)
            r3.c(r4)
        L_0x00b4:
            h0.g.a.h.k.f r3 = r12.e
            boolean r4 = r3.j
            if (r4 != 0) goto L_0x00bb
            return
        L_0x00bb:
            int r3 = r3.g
            if (r3 != r14) goto L_0x00ca
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r12.h
            r14.c(r13)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r12.i
            r13.c(r2)
            return
        L_0x00ca:
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r12.b
            if (r15 != 0) goto L_0x00d1
            float r14 = r14.f4k0
            goto L_0x00d3
        L_0x00d1:
            float r14 = r14.f5l0
        L_0x00d3:
            if (r0 != r1) goto L_0x00da
            int r13 = r0.g
            int r2 = r1.g
            r14 = r5
        L_0x00da:
            int r2 = r2 - r13
            int r2 = r2 - r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r12.h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.c(r13)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r12.i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r12.h
            int r14 = r14.g
            h0.g.a.h.k.f r15 = r12.e
            int r15 = r15.g
            int r14 = r14 + r15
            r13.c(r14)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }
}
