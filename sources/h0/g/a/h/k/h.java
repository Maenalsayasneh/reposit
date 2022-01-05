package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import h0.g.a.h.e;

/* compiled from: GuidelineReference */
public class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.d.f();
        constraintWidget.e.f();
        this.f = ((e) constraintWidget).Q0;
    }

    public void a(d dVar) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            this.h.c((int) ((((float) dependencyNode.l.get(0).g) * ((e) this.b).M0) + 0.5f));
        }
    }

    public void d() {
        ConstraintWidget constraintWidget = this.b;
        e eVar = (e) constraintWidget;
        int i = eVar.N0;
        int i2 = eVar.O0;
        if (eVar.Q0 == 1) {
            if (i != -1) {
                this.h.l.add(constraintWidget.W.d.h);
                this.b.W.d.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                this.h.l.add(constraintWidget.W.d.i);
                this.b.W.d.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                DependencyNode dependencyNode = this.h;
                dependencyNode.b = true;
                dependencyNode.l.add(constraintWidget.W.d.i);
                this.b.W.d.i.k.add(this.h);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            this.h.l.add(constraintWidget.W.e.h);
            this.b.W.e.h.k.add(this.h);
            this.h.f = i;
        } else if (i2 != -1) {
            this.h.l.add(constraintWidget.W.e.i);
            this.b.W.e.i.k.add(this.h);
            this.h.f = -i2;
        } else {
            DependencyNode dependencyNode2 = this.h;
            dependencyNode2.b = true;
            dependencyNode2.l.add(constraintWidget.W.e.i);
            this.b.W.e.i.k.add(this.h);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (((e) constraintWidget).Q0 == 1) {
            constraintWidget.b0 = this.h.g;
        } else {
            constraintWidget.c0 = this.h.g;
        }
    }

    public void f() {
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
