package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import h0.g.a.h.a;

/* compiled from: HelperReferences */
public class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    public void a(d dVar) {
        a aVar = (a) this.b;
        int i = aVar.O0;
        int i2 = 0;
        int i3 = -1;
        for (DependencyNode dependencyNode : this.h.l) {
            int i4 = dependencyNode.g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.h.c(i3 + aVar.Q0);
        } else {
            this.h.c(i2 + aVar.Q0);
        }
    }

    public void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof a) {
            DependencyNode dependencyNode = this.h;
            dependencyNode.b = true;
            a aVar = (a) constraintWidget;
            int i = aVar.O0;
            boolean z = aVar.P0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.e = DependencyNode.Type.LEFT;
                while (i2 < aVar.N0) {
                    ConstraintWidget constraintWidget2 = aVar.M0[i2];
                    if (z || constraintWidget2.f8o0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.d.h;
                        dependencyNode2.k.add(this.h);
                        this.h.l.add(dependencyNode2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 1) {
                dependencyNode.e = DependencyNode.Type.RIGHT;
                while (i2 < aVar.N0) {
                    ConstraintWidget constraintWidget3 = aVar.M0[i2];
                    if (z || constraintWidget3.f8o0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.d.i;
                        dependencyNode3.k.add(this.h);
                        this.h.l.add(dependencyNode3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 2) {
                dependencyNode.e = DependencyNode.Type.TOP;
                while (i2 < aVar.N0) {
                    ConstraintWidget constraintWidget4 = aVar.M0[i2];
                    if (z || constraintWidget4.f8o0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.e.h;
                        dependencyNode4.k.add(this.h);
                        this.h.l.add(dependencyNode4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            } else if (i == 3) {
                dependencyNode.e = DependencyNode.Type.BOTTOM;
                while (i2 < aVar.N0) {
                    ConstraintWidget constraintWidget5 = aVar.M0[i2];
                    if (z || constraintWidget5.f8o0 != 8) {
                        DependencyNode dependencyNode5 = constraintWidget5.e.i;
                        dependencyNode5.k.add(this.h);
                        this.h.l.add(dependencyNode5);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            }
        }
    }

    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof a) {
            int i = ((a) constraintWidget).O0;
            if (i == 0 || i == 1) {
                constraintWidget.b0 = this.h.g;
            } else {
                constraintWidget.c0 = this.h.g;
            }
        }
    }

    public void f() {
        this.c = null;
        this.h.b();
    }

    public boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }
}
