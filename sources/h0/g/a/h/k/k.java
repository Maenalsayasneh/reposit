package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* compiled from: RunGroup */
public class k {
    public static int a;
    public WidgetRun b = null;
    public ArrayList<WidgetRun> c = new ArrayList<>();

    public k(WidgetRun widgetRun, int i) {
        a++;
        this.b = widgetRun;
    }

    public final long a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof i) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = dependencyNode.k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.min(j2, a(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.i) {
            return j2;
        }
        long j3 = j - widgetRun.j();
        return Math.min(Math.min(j2, a(widgetRun.h, j3)), j3 - ((long) widgetRun.h.f));
    }

    public final long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof i) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = dependencyNode.k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.max(j2, b(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.h) {
            return j2;
        }
        long j3 = j + widgetRun.j();
        return Math.max(Math.max(j2, b(widgetRun.i, j3)), j3 - ((long) widgetRun.i.f));
    }
}
