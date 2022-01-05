package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.g.a.h.c;
import java.util.ArrayList;

/* compiled from: BasicMeasure */
public class b {
    public final ArrayList<ConstraintWidget> a = new ArrayList<>();
    public a b = new a();
    public c c;

    /* compiled from: BasicMeasure */
    public static class a {
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* renamed from: h0.g.a.h.k.b$b  reason: collision with other inner class name */
    /* compiled from: BasicMeasure */
    public interface C0030b {
    }

    public b(c cVar) {
        this.c = cVar;
    }

    public final boolean a(C0030b bVar, ConstraintWidget constraintWidget, int i) {
        this.b.a = constraintWidget.r();
        this.b.b = constraintWidget.v();
        this.b.c = constraintWidget.w();
        this.b.d = constraintWidget.q();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Z > 0.0f;
        boolean z4 = z2 && constraintWidget.Z > 0.0f;
        if (z3 && constraintWidget.s[0] == 4) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.s[1] == 4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((ConstraintLayout.b) bVar).b(constraintWidget, aVar);
        constraintWidget.U(this.b.e);
        constraintWidget.P(this.b.f);
        a aVar2 = this.b;
        constraintWidget.F = aVar2.h;
        constraintWidget.M(aVar2.g);
        a aVar3 = this.b;
        aVar3.j = 0;
        return aVar3.i;
    }

    public final void b(c cVar, int i, int i2, int i3) {
        int i4 = cVar.f2i0;
        int i5 = cVar.f3j0;
        cVar.S(0);
        cVar.R(0);
        cVar.X = i2;
        int i6 = cVar.f2i0;
        if (i2 < i6) {
            cVar.X = i6;
        }
        cVar.Y = i3;
        int i7 = cVar.f3j0;
        if (i3 < i7) {
            cVar.Y = i7;
        }
        cVar.S(i4);
        cVar.R(i5);
        c cVar2 = this.c;
        cVar2.P0 = i;
        cVar2.X();
    }

    public void c(c cVar) {
        this.a.clear();
        int size = cVar.M0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = cVar.M0.get(i);
            ConstraintWidget.DimensionBehaviour r = constraintWidget.r();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (r == dimensionBehaviour || constraintWidget.v() == dimensionBehaviour) {
                this.a.add(constraintWidget);
            }
        }
        cVar.f0();
    }
}
