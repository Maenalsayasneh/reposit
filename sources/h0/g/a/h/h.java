package h0.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.d;

/* compiled from: Optimizer */
public class h {
    public static boolean[] a = new boolean[3];

    public static void a(c cVar, d dVar, ConstraintWidget constraintWidget) {
        constraintWidget.n = -1;
        constraintWidget.o = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = cVar.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.K.g;
            int w = cVar.w() - constraintWidget.M.g;
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            constraintAnchor.i = dVar.l(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.M;
            constraintAnchor2.i = dVar.l(constraintAnchor2);
            dVar.e(constraintWidget.K.i, i);
            dVar.e(constraintWidget.M.i, w);
            constraintWidget.n = 2;
            constraintWidget.b0 = i;
            int i2 = w - i;
            constraintWidget.X = i2;
            int i3 = constraintWidget.f2i0;
            if (i2 < i3) {
                constraintWidget.X = i3;
            }
        }
        if (cVar.V[1] != dimensionBehaviour2 && constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i4 = constraintWidget.L.g;
            int q = cVar.q() - constraintWidget.N.g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.L;
            constraintAnchor3.i = dVar.l(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.N;
            constraintAnchor4.i = dVar.l(constraintAnchor4);
            dVar.e(constraintWidget.L.i, i4);
            dVar.e(constraintWidget.N.i, q);
            if (constraintWidget.f1h0 > 0 || constraintWidget.f8o0 == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.O;
                constraintAnchor5.i = dVar.l(constraintAnchor5);
                dVar.e(constraintWidget.O.i, constraintWidget.f1h0 + i4);
            }
            constraintWidget.o = 2;
            constraintWidget.c0 = i4;
            int i5 = q - i4;
            constraintWidget.Y = i5;
            int i6 = constraintWidget.f3j0;
            if (i5 < i6) {
                constraintWidget.Y = i6;
            }
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
