package h0.g.a;

import androidx.constraintlayout.core.SolverVariable;
import h0.g.a.d;
import java.util.ArrayList;

/* compiled from: ArrayRow */
public class b implements d.a {
    public SolverVariable a = null;
    public float b = 0.0f;
    public ArrayList<SolverVariable> c = new ArrayList<>();
    public a d;
    public boolean e = false;

    /* compiled from: ArrayRow */
    public interface a {
        int a();

        boolean b(SolverVariable solverVariable);

        float c(b bVar, boolean z);

        void clear();

        void d(SolverVariable solverVariable, float f);

        SolverVariable e(int i);

        void f(SolverVariable solverVariable, float f, boolean z);

        void g();

        float h(int i);

        float i(SolverVariable solverVariable, boolean z);

        float j(SolverVariable solverVariable);

        void k(float f);
    }

    public b() {
    }

    public SolverVariable a(d dVar, boolean[] zArr) {
        return i(zArr, (SolverVariable) null);
    }

    public void b(SolverVariable solverVariable) {
        float f;
        int i = solverVariable.y;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.d.d(solverVariable, f);
        }
        f = 1.0f;
        this.d.d(solverVariable, f);
    }

    public b c(d dVar, int i) {
        this.d.d(dVar.k(i, "ep"), 1.0f);
        this.d.d(dVar.k(i, "em"), -1.0f);
        return this;
    }

    public void clear() {
        this.d.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.d.d(solverVariable, -1.0f);
        this.d.d(solverVariable2, 1.0f);
        this.d.d(solverVariable3, f);
        this.d.d(solverVariable4, -f);
        return this;
    }

    public b e(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.d(solverVariable, -1.0f);
            this.d.d(solverVariable2, 1.0f);
            this.d.d(solverVariable3, 1.0f);
        } else {
            this.d.d(solverVariable, 1.0f);
            this.d.d(solverVariable2, -1.0f);
            this.d.d(solverVariable3, -1.0f);
        }
        return this;
    }

    public b f(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.d(solverVariable, -1.0f);
            this.d.d(solverVariable2, 1.0f);
            this.d.d(solverVariable3, -1.0f);
        } else {
            this.d.d(solverVariable, 1.0f);
            this.d.d(solverVariable2, -1.0f);
            this.d.d(solverVariable3, 1.0f);
        }
        return this;
    }

    public b g(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.d.d(solverVariable3, 0.5f);
        this.d.d(solverVariable4, 0.5f);
        this.d.d(solverVariable, -0.5f);
        this.d.d(solverVariable2, -0.5f);
        this.b = -f;
        return this;
    }

    public final boolean h(SolverVariable solverVariable) {
        return solverVariable.f2 <= 1;
    }

    public final SolverVariable i(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int a2 = this.d.a();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < a2; i++) {
            float h = this.d.h(i);
            if (h < 0.0f) {
                SolverVariable e2 = this.d.e(i);
                if ((zArr == null || !zArr[e2.q]) && e2 != solverVariable && (((type = e2.c2) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && h < f)) {
                    f = h;
                    solverVariable2 = e2;
                }
            }
        }
        return solverVariable2;
    }

    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.d.a() == 0;
    }

    public void j(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.d.d(solverVariable2, -1.0f);
            this.a.x = -1;
            this.a = null;
        }
        float i = this.d.i(solverVariable, true) * -1.0f;
        this.a = solverVariable;
        if (i != 1.0f) {
            this.b /= i;
            this.d.k(i);
        }
    }

    public void k(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.Z1) {
            float j = this.d.j(solverVariable);
            this.b = (solverVariable.Y1 * j) + this.b;
            this.d.i(solverVariable, z);
            if (z) {
                solverVariable.b(this);
            }
            if (this.d.a() == 0) {
                this.e = true;
                dVar.d = true;
            }
        }
    }

    public void l(d dVar, b bVar, boolean z) {
        float c2 = this.d.c(bVar, z);
        this.b = (bVar.b * c2) + this.b;
        if (z) {
            bVar.a.b(this);
        }
        if (this.a != null && this.d.a() == 0) {
            this.e = true;
            dVar.d = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = i0.d.a.a.a.n0(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            h0.g.a.b$a r5 = r10.d
            int r5 = r5.a()
        L_0x003b:
            if (r3 >= r5) goto L_0x009a
            h0.g.a.b$a r6 = r10.d
            androidx.constraintlayout.core.SolverVariable r6 = r6.e(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            h0.g.a.b$a r7 = r10.d
            float r7 = r7.h(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0074
            java.lang.String r1 = "- "
            java.lang.String r0 = i0.d.a.a.a.n0(r0, r1)
            goto L_0x0073
        L_0x0064:
            if (r8 <= 0) goto L_0x006d
            java.lang.String r1 = " + "
            java.lang.String r0 = i0.d.a.a.a.n0(r0, r1)
            goto L_0x0074
        L_0x006d:
            java.lang.String r1 = " - "
            java.lang.String r0 = i0.d.a.a.a.n0(r0, r1)
        L_0x0073:
            float r7 = r7 * r9
        L_0x0074:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = i0.d.a.a.a.n0(r0, r6)
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0096:
            r1 = r4
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009a:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = i0.d.a.a.a.n0(r0, r1)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.d = new a(this, cVar);
    }
}
