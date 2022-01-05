package h0.g.a;

import androidx.constraintlayout.core.SolverVariable;
import h0.g.a.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables */
public class a implements b.a {
    public int a = 0;
    public final b b;
    public final c c;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
    }

    public int a() {
        return this.a;
    }

    public boolean b(SolverVariable solverVariable) {
        int i2 = this.h;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == solverVariable.q) {
                return true;
            }
            i2 = this.f[i2];
            i3++;
        }
        return false;
    }

    public float c(b bVar, boolean z) {
        float j2 = j(bVar.a);
        i(bVar.a, z);
        b.a aVar = bVar.d;
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            SolverVariable e2 = aVar.e(i2);
            f(e2, aVar.j(e2) * j2, z);
        }
        return j2;
    }

    public final void clear() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            SolverVariable solverVariable = this.c.d[this.e[i2]];
            if (solverVariable != null) {
                solverVariable.b(this.b);
            }
            i2 = this.f[i2];
            i3++;
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void d(SolverVariable solverVariable, float f2) {
        if (f2 == 0.0f) {
            i(solverVariable, true);
            return;
        }
        int i2 = this.h;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = solverVariable.q;
            this.f[0] = -1;
            solverVariable.f2++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.j) {
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int[] iArr2 = this.e;
            int i6 = iArr2[i2];
            int i7 = solverVariable.q;
            if (i6 == i7) {
                this.g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f[i2];
            i4++;
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.e;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.j = false;
            this.i = i8 - 1;
            this.g = Arrays.copyOf(this.g, i11);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i8] = solverVariable.q;
        this.g[i8] = f2;
        if (i5 != -1) {
            int[] iArr7 = this.f;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f[i8] = this.h;
            this.h = i8;
        }
        solverVariable.f2++;
        solverVariable.a(this.b);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.j) {
            this.i++;
        }
        int[] iArr8 = this.e;
        if (i12 >= iArr8.length) {
            this.j = true;
        }
        if (this.i >= iArr8.length) {
            this.j = true;
            this.i = iArr8.length - 1;
        }
    }

    public SolverVariable e(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.d[this.e[i3]];
            }
            i3 = this.f[i3];
            i4++;
        }
        return null;
    }

    public void f(SolverVariable solverVariable, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.h;
            if (i2 == -1) {
                this.h = 0;
                this.g[0] = f2;
                this.e[0] = solverVariable.q;
                this.f[0] = -1;
                solverVariable.f2++;
                solverVariable.a(this.b);
                this.a++;
                if (!this.j) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int[] iArr2 = this.e;
                int i6 = iArr2[i2];
                int i7 = solverVariable.q;
                if (i6 == i7) {
                    float[] fArr = this.g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.h) {
                            this.h = this.f[i2];
                        } else {
                            int[] iArr3 = this.f;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            solverVariable.b(this.b);
                        }
                        if (this.j) {
                            this.i = i2;
                        }
                        solverVariable.f2--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f[i2];
                i4++;
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr4 = this.e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.e;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = solverVariable.q;
            this.g[i8] = f2;
            if (i5 != -1) {
                int[] iArr8 = this.f;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f[i8] = this.h;
                this.h = i8;
            }
            solverVariable.f2++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr9 = this.e;
            if (i12 >= iArr9.length) {
                this.j = true;
                this.i = iArr9.length - 1;
            }
        }
    }

    public void g() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f[i2];
            i3++;
        }
    }

    public float h(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.g[i3];
            }
            i3 = this.f[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float i(SolverVariable solverVariable, boolean z) {
        int i2 = this.h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == solverVariable.q) {
                if (i2 == this.h) {
                    this.h = this.f[i2];
                } else {
                    int[] iArr = this.f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.b(this.b);
                }
                solverVariable.f2--;
                this.a--;
                this.e[i2] = -1;
                if (this.j) {
                    this.i = i2;
                }
                return this.g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    public final float j(SolverVariable solverVariable) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == solverVariable.q) {
                return this.g[i2];
            }
            i2 = this.f[i2];
            i3++;
        }
        return 0.0f;
    }

    public void k(float f2) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f[i2];
            i3++;
        }
    }

    public String toString() {
        int i2 = this.h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder P0 = i0.d.a.a.a.P0(i0.d.a.a.a.n0(str, " -> "));
            P0.append(this.g[i2]);
            P0.append(" : ");
            StringBuilder P02 = i0.d.a.a.a.P0(P0.toString());
            P02.append(this.c.d[this.e[i2]]);
            str = P02.toString();
            i2 = this.f[i2];
            i3++;
        }
        return str;
    }
}
