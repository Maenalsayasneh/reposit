package androidx.constraintlayout.core.widgets.analyzer;

import h0.g.a.h.k.d;
import h0.g.a.h.k.f;
import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements d {
    public d a = null;
    public boolean b = false;
    public boolean c = false;
    public WidgetRun d;
    public Type e = Type.UNKNOWN;
    public int f;
    public int g;
    public int h = 1;
    public f i = null;
    public boolean j = false;
    public List<d> k = new ArrayList();
    public List<DependencyNode> l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    public void a(d dVar) {
        for (DependencyNode dependencyNode : this.l) {
            if (!dependencyNode.j) {
                return;
            }
        }
        this.c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i2 = 0;
        for (DependencyNode next : this.l) {
            if (!(next instanceof f)) {
                i2++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i2 == 1 && dependencyNode2.j) {
            f fVar = this.i;
            if (fVar != null) {
                if (fVar.j) {
                    this.f = this.h * fVar.g;
                } else {
                    return;
                }
            }
            c(dependencyNode2.g + this.f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            for (d next : this.k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.f9p0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
