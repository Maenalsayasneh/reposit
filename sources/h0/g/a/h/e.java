package h0.g.a.h;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.b;
import h0.g.a.d;
import java.util.HashMap;

/* compiled from: Guideline */
public class e extends ConstraintWidget {
    public float M0 = -1.0f;
    public int N0 = -1;
    public int O0 = -1;
    public ConstraintAnchor P0 = this.L;
    public int Q0;
    public boolean R0;

    public e() {
        this.Q0 = 0;
        this.T.clear();
        this.T.add(this.P0);
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            this.S[i] = this.P0;
        }
    }

    public boolean G() {
        return this.R0;
    }

    public boolean H() {
        return this.R0;
    }

    public void W(d dVar, boolean z) {
        if (this.W != null) {
            int o = dVar.o(this.P0);
            if (this.Q0 == 1) {
                this.b0 = o;
                this.c0 = 0;
                P(this.W.q());
                U(0);
                return;
            }
            this.b0 = 0;
            this.c0 = o;
            U(this.W.w());
            P(0);
        }
    }

    public void X(int i) {
        ConstraintAnchor constraintAnchor = this.P0;
        constraintAnchor.b = i;
        constraintAnchor.c = true;
        this.R0 = true;
    }

    public void Y(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            this.T.clear();
            if (this.Q0 == 1) {
                this.P0 = this.K;
            } else {
                this.P0 = this.L;
            }
            this.T.add(this.P0);
            int length = this.S.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.S[i2] = this.P0;
            }
        }
    }

    public void f(d dVar, boolean z) {
        c cVar = (c) this.W;
        if (cVar != null) {
            ConstraintAnchor n = cVar.n(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor n2 = cVar.n(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.W;
            boolean z2 = true;
            boolean z3 = constraintWidget != null && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (this.Q0 == 0) {
                n = cVar.n(ConstraintAnchor.Type.TOP);
                n2 = cVar.n(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.W;
                if (constraintWidget2 == null || constraintWidget2.V[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.R0) {
                ConstraintAnchor constraintAnchor = this.P0;
                if (constraintAnchor.c) {
                    SolverVariable l = dVar.l(constraintAnchor);
                    dVar.e(l, this.P0.d());
                    if (this.N0 != -1) {
                        if (z3) {
                            dVar.f(dVar.l(n2), l, 0, 5);
                        }
                    } else if (this.O0 != -1 && z3) {
                        SolverVariable l2 = dVar.l(n2);
                        dVar.f(l, dVar.l(n), 0, 5);
                        dVar.f(l2, l, 0, 5);
                    }
                    this.R0 = false;
                    return;
                }
            }
            if (this.N0 != -1) {
                SolverVariable l3 = dVar.l(this.P0);
                dVar.d(l3, dVar.l(n), this.N0, 8);
                if (z3) {
                    dVar.f(dVar.l(n2), l3, 0, 5);
                }
            } else if (this.O0 != -1) {
                SolverVariable l4 = dVar.l(this.P0);
                SolverVariable l5 = dVar.l(n2);
                dVar.d(l4, l5, -this.O0, 8);
                if (z3) {
                    dVar.f(l4, dVar.l(n), 0, 5);
                    dVar.f(l5, l4, 0, 5);
                }
            } else if (this.M0 != -1.0f) {
                SolverVariable l6 = dVar.l(this.P0);
                SolverVariable l7 = dVar.l(n2);
                float f = this.M0;
                b m = dVar.m();
                m.d.d(l6, -1.0f);
                m.d.d(l7, f);
                dVar.c(m);
            }
        }
    }

    public boolean g() {
        return true;
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.M0 = eVar.M0;
        this.N0 = eVar.N0;
        this.O0 = eVar.O0;
        Y(eVar.Q0);
    }

    public ConstraintAnchor n(ConstraintAnchor.Type type) {
        int ordinal = type.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.Q0 == 0) {
                return this.P0;
            }
            return null;
        }
        if (this.Q0 == 1) {
            return this.P0;
        }
        return null;
    }
}
