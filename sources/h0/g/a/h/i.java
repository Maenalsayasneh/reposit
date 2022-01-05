package h0.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.g.a.h.k.b;

/* compiled from: VirtualLayout */
public class i extends g {
    public int O0 = 0;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 0;
    public boolean U0 = false;
    public int V0 = 0;
    public int W0 = 0;
    public b.a X0 = new b.a();
    public b.C0030b Y0 = null;

    public void Y() {
        for (int i = 0; i < this.N0; i++) {
            ConstraintWidget constraintWidget = this.M0[i];
            if (constraintWidget != null) {
                constraintWidget.H = true;
            }
        }
    }

    public void Z(int i, int i2, int i3, int i4) {
    }

    public void a0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.C0030b bVar;
        ConstraintWidget constraintWidget2;
        while (true) {
            bVar = this.Y0;
            if (bVar != null || (constraintWidget2 = this.W) == null) {
                b.a aVar = this.X0;
                aVar.a = dimensionBehaviour;
                aVar.b = dimensionBehaviour2;
                aVar.c = i;
                aVar.d = i2;
                ((ConstraintLayout.b) bVar).b(constraintWidget, aVar);
                constraintWidget.U(this.X0.e);
                constraintWidget.P(this.X0.f);
                b.a aVar2 = this.X0;
                constraintWidget.F = aVar2.h;
                constraintWidget.M(aVar2.g);
            } else {
                this.Y0 = ((c) constraintWidget2).Q0;
            }
        }
        b.a aVar3 = this.X0;
        aVar3.a = dimensionBehaviour;
        aVar3.b = dimensionBehaviour2;
        aVar3.c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) bVar).b(constraintWidget, aVar3);
        constraintWidget.U(this.X0.e);
        constraintWidget.P(this.X0.f);
        b.a aVar22 = this.X0;
        constraintWidget.F = aVar22.h;
        constraintWidget.M(aVar22.g);
    }

    public void c(c cVar) {
        Y();
    }
}
