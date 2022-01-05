package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* compiled from: DimensionDependency */
public class f extends DependencyNode {
    public int m;

    public f(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof j) {
            this.e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    public void c(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            for (d next : this.k) {
                next.a(next);
            }
        }
    }
}
