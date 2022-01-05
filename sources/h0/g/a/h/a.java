package h0.g.a.h;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.b;
import h0.g.a.d;
import java.util.HashMap;

/* compiled from: Barrier */
public class a extends g {
    public int O0 = 0;
    public boolean P0 = true;
    public int Q0 = 0;
    public boolean R0 = false;

    public boolean G() {
        return this.R0;
    }

    public boolean H() {
        return this.R0;
    }

    public boolean Y() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.N0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.M0[i4];
            if ((this.P0 || constraintWidget.g()) && ((((i2 = this.O0) == 0 || i2 == 1) && !constraintWidget.G()) || (((i3 = this.O0) == 2 || i3 == 3) && !constraintWidget.H()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.N0; i6++) {
            ConstraintWidget constraintWidget2 = this.M0[i6];
            if (this.P0 || constraintWidget2.g()) {
                if (!z2) {
                    int i7 = this.O0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.TOP).d();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.n(ConstraintAnchor.Type.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.O0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.n(ConstraintAnchor.Type.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.n(ConstraintAnchor.Type.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.n(ConstraintAnchor.Type.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.n(ConstraintAnchor.Type.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.Q0;
        int i10 = this.O0;
        if (i10 == 0 || i10 == 1) {
            N(i9, i9);
        } else {
            O(i9, i9);
        }
        this.R0 = true;
        return true;
    }

    public int Z() {
        int i = this.O0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public void f(d dVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        ConstraintAnchor[] constraintAnchorArr2 = this.S;
        constraintAnchorArr2[0] = this.K;
        constraintAnchorArr2[2] = this.L;
        constraintAnchorArr2[1] = this.M;
        constraintAnchorArr2[3] = this.N;
        int i4 = 0;
        while (true) {
            constraintAnchorArr = this.S;
            if (i4 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i4].i = dVar.l(constraintAnchorArr[i4]);
            i4++;
        }
        int i5 = this.O0;
        if (i5 >= 0 && i5 < 4) {
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i5];
            if (!this.R0) {
                Y();
            }
            if (this.R0) {
                this.R0 = false;
                int i6 = this.O0;
                if (i6 == 0 || i6 == 1) {
                    dVar.e(this.K.i, this.b0);
                    dVar.e(this.M.i, this.b0);
                } else if (i6 == 2 || i6 == 3) {
                    dVar.e(this.L.i, this.c0);
                    dVar.e(this.N.i, this.c0);
                }
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.N0) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.M0[i7];
                    if ((this.P0 || constraintWidget.g()) && ((((i2 = this.O0) == 0 || i2 == 1) && constraintWidget.r() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.K.f != null && constraintWidget.M.f != null) || (((i3 = this.O0) == 2 || i3 == 3) && constraintWidget.v() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.L.f != null && constraintWidget.N.f != null))) {
                        z2 = true;
                    } else {
                        i7++;
                    }
                }
                z2 = true;
                boolean z3 = this.K.g() || this.M.g();
                boolean z4 = this.L.g() || this.N.g();
                boolean z5 = !z2 && (((i = this.O0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
                int i8 = 5;
                if (!z5) {
                    i8 = 4;
                }
                for (int i9 = 0; i9 < this.N0; i9++) {
                    ConstraintWidget constraintWidget2 = this.M0[i9];
                    if (this.P0 || constraintWidget2.g()) {
                        SolverVariable l = dVar.l(constraintWidget2.S[this.O0]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.S;
                        int i10 = this.O0;
                        constraintAnchorArr3[i10].i = l;
                        int i11 = (constraintAnchorArr3[i10].f == null || constraintAnchorArr3[i10].f.d != this) ? 0 : constraintAnchorArr3[i10].g + 0;
                        if (i10 == 0 || i10 == 2) {
                            b m = dVar.m();
                            SolverVariable n = dVar.n();
                            n.y = 0;
                            m.f(constraintAnchor.i, l, n, this.Q0 - i11);
                            dVar.c(m);
                        } else {
                            b m2 = dVar.m();
                            SolverVariable n2 = dVar.n();
                            n2.y = 0;
                            m2.e(constraintAnchor.i, l, n2, this.Q0 + i11);
                            dVar.c(m2);
                        }
                        dVar.d(constraintAnchor.i, l, this.Q0 + i11, i8);
                    }
                }
                int i12 = this.O0;
                if (i12 == 0) {
                    dVar.d(this.M.i, this.K.i, 0, 8);
                    dVar.d(this.K.i, this.W.M.i, 0, 4);
                    dVar.d(this.K.i, this.W.K.i, 0, 0);
                } else if (i12 == 1) {
                    dVar.d(this.K.i, this.M.i, 0, 8);
                    dVar.d(this.K.i, this.W.K.i, 0, 4);
                    dVar.d(this.K.i, this.W.M.i, 0, 0);
                } else if (i12 == 2) {
                    dVar.d(this.N.i, this.L.i, 0, 8);
                    dVar.d(this.L.i, this.W.N.i, 0, 4);
                    dVar.d(this.L.i, this.W.L.i, 0, 0);
                } else if (i12 == 3) {
                    dVar.d(this.L.i, this.N.i, 0, 8);
                    dVar.d(this.L.i, this.W.L.i, 0, 4);
                    dVar.d(this.L.i, this.W.N.i, 0, 0);
                }
            }
        }
    }

    public boolean g() {
        return true;
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.O0 = aVar.O0;
        this.P0 = aVar.P0;
        this.Q0 = aVar.Q0;
    }

    public String toString() {
        String y0 = i0.d.a.a.a.y0(i0.d.a.a.a.P0("[Barrier] "), this.f9p0, " {");
        for (int i = 0; i < this.N0; i++) {
            ConstraintWidget constraintWidget = this.M0[i];
            if (i > 0) {
                y0 = i0.d.a.a.a.n0(y0, ", ");
            }
            StringBuilder P02 = i0.d.a.a.a.P0(y0);
            P02.append(constraintWidget.f9p0);
            y0 = P02.toString();
        }
        return i0.d.a.a.a.n0(y0, "}");
    }
}
