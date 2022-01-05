package h0.g.a;

import androidx.constraintlayout.core.SolverVariable;
import h0.g.a.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow */
public class f extends b {
    public int f = 128;
    public SolverVariable[] g = new SolverVariable[128];
    public SolverVariable[] h = new SolverVariable[128];
    public int i = 0;
    public b j = new b(this);

    /* compiled from: PriorityGoalRow */
    public class a implements Comparator<SolverVariable> {
        public a(f fVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((SolverVariable) obj).q - ((SolverVariable) obj2).q;
        }
    }

    /* compiled from: PriorityGoalRow */
    public class b {
        public SolverVariable a;

        public b(f fVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder P0 = i0.d.a.a.a.P0(str);
                    P0.append(this.a.b2[i]);
                    P0.append(" ");
                    str = P0.toString();
                }
            }
            StringBuilder S0 = i0.d.a.a.a.S0(str, "] ");
            S0.append(this.a);
            return S0.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r8 < r7) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.SolverVariable a(h0.g.a.d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = r11
            r2 = r0
        L_0x0004:
            int r3 = r10.i
            if (r1 >= r3) goto L_0x005d
            androidx.constraintlayout.core.SolverVariable[] r3 = r10.g
            r4 = r3[r1]
            int r5 = r4.q
            boolean r5 = r12[r5]
            if (r5 == 0) goto L_0x0013
            goto L_0x005a
        L_0x0013:
            h0.g.a.f$b r5 = r10.j
            r5.a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L_0x0039
            java.util.Objects.requireNonNull(r5)
        L_0x001f:
            if (r4 < 0) goto L_0x0035
            androidx.constraintlayout.core.SolverVariable r3 = r5.a
            float[] r3 = r3.b2
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            int r4 = r4 + -1
            goto L_0x001f
        L_0x0035:
            r6 = r11
        L_0x0036:
            if (r6 == 0) goto L_0x005a
            goto L_0x0059
        L_0x0039:
            r3 = r3[r2]
            java.util.Objects.requireNonNull(r5)
        L_0x003e:
            if (r4 < 0) goto L_0x0056
            float[] r7 = r3.b2
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r8 = r5.a
            float[] r8 = r8.b2
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0051
            int r4 = r4 + -1
            goto L_0x003e
        L_0x0051:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r6 = r11
        L_0x0057:
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x005d:
            if (r2 != r0) goto L_0x0061
            r11 = 0
            return r11
        L_0x0061:
            androidx.constraintlayout.core.SolverVariable[] r11 = r10.g
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.f.a(h0.g.a.d, boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    public void b(SolverVariable solverVariable) {
        this.j.a = solverVariable;
        Arrays.fill(solverVariable.b2, 0.0f);
        solverVariable.b2[solverVariable.y] = 1.0f;
        m(solverVariable);
    }

    public void clear() {
        this.i = 0;
        this.b = 0.0f;
    }

    public boolean isEmpty() {
        return this.i == 0;
    }

    public void l(d dVar, b bVar, boolean z) {
        b bVar2 = bVar;
        SolverVariable solverVariable = bVar2.a;
        if (solverVariable != null) {
            b.a aVar = bVar2.d;
            int a2 = aVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                SolverVariable e = aVar.e(i2);
                float h2 = aVar.h(i2);
                b bVar3 = this.j;
                bVar3.a = e;
                boolean z2 = true;
                if (e.d) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = bVar3.a.b2;
                        fArr[i3] = (solverVariable.b2[i3] * h2) + fArr[i3];
                        if (Math.abs(fArr[i3]) < 1.0E-4f) {
                            bVar3.a.b2[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        f.this.n(bVar3.a);
                    }
                    z2 = false;
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = solverVariable.b2[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * h2;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            bVar3.a.b2[i4] = f3;
                        } else {
                            bVar3.a.b2[i4] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    m(e);
                }
                this.b = (bVar2.b * h2) + this.b;
            }
            n(solverVariable);
        }
    }

    public final void m(SolverVariable solverVariable) {
        int i2;
        int i3 = this.i + 1;
        SolverVariable[] solverVariableArr = this.g;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.g = solverVariableArr2;
            this.h = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.g;
        int i4 = this.i;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.i = i5;
        if (i5 > 1 && solverVariableArr3[i5 - 1].q > solverVariable.q) {
            int i6 = 0;
            while (true) {
                i2 = this.i;
                if (i6 >= i2) {
                    break;
                }
                this.h[i6] = this.g[i6];
                i6++;
            }
            Arrays.sort(this.h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.i; i7++) {
                this.g[i7] = this.h[i7];
            }
        }
        solverVariable.d = true;
        solverVariable.a(this);
    }

    public final void n(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.i) {
            if (this.g[i2] == solverVariable) {
                while (true) {
                    int i3 = this.i;
                    if (i2 < i3 - 1) {
                        SolverVariable[] solverVariableArr = this.g;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    } else {
                        this.i = i3 - 1;
                        solverVariable.d = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public String toString() {
        StringBuilder S0 = i0.d.a.a.a.S0("", " goal -> (");
        S0.append(this.b);
        S0.append(") : ");
        String sb = S0.toString();
        for (int i2 = 0; i2 < this.i; i2++) {
            this.j.a = this.g[i2];
            StringBuilder P0 = i0.d.a.a.a.P0(sb);
            P0.append(this.j);
            P0.append(" ");
            sb = P0.toString();
        }
        return sb;
    }
}
