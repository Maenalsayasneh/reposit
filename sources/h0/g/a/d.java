package h0.g.a;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: LinearSystem */
public class d {
    public static boolean a = false;
    public static int b = 1000;
    public static long c;
    public boolean d;
    public int e;
    public a f;
    public int g;
    public int h;
    public b[] i;
    public boolean j;
    public boolean[] k;
    public int l;
    public int m;
    public int n;
    public final c o;
    public SolverVariable[] p;
    public int q;
    public a r;

    /* compiled from: LinearSystem */
    public interface a {
        SolverVariable a(d dVar, boolean[] zArr);

        void b(SolverVariable solverVariable);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.d = false;
        this.e = 0;
        this.g = 32;
        this.h = 32;
        this.i = null;
        this.j = false;
        this.k = new boolean[32];
        this.l = 1;
        this.m = 0;
        this.n = 32;
        this.p = new SolverVariable[b];
        this.q = 0;
        this.i = new b[32];
        t();
        c cVar = new c();
        this.o = cVar;
        this.f = new f(cVar);
        this.r = new b(cVar);
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable a2 = this.o.c.a();
        if (a2 == null) {
            a2 = new SolverVariable(type);
            a2.c2 = type;
        } else {
            a2.e();
            a2.c2 = type;
        }
        int i2 = this.q;
        int i3 = b;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            b = i4;
            this.p = (SolverVariable[]) Arrays.copyOf(this.p, i4);
        }
        SolverVariable[] solverVariableArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        solverVariableArr[i5] = a2;
        return a2;
    }

    public void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        b m2 = m();
        if (solverVariable2 == solverVariable3) {
            m2.d.d(solverVariable, 1.0f);
            m2.d.d(solverVariable4, 1.0f);
            m2.d.d(solverVariable2, -2.0f);
        } else if (f2 == 0.5f) {
            m2.d.d(solverVariable, 1.0f);
            m2.d.d(solverVariable2, -1.0f);
            m2.d.d(solverVariable3, -1.0f);
            m2.d.d(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                m2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            m2.d.d(solverVariable, -1.0f);
            m2.d.d(solverVariable2, 1.0f);
            m2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            m2.d.d(solverVariable4, -1.0f);
            m2.d.d(solverVariable3, 1.0f);
            m2.b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            m2.d.d(solverVariable, f3 * 1.0f);
            m2.d.d(solverVariable2, f3 * -1.0f);
            m2.d.d(solverVariable3, -1.0f * f2);
            m2.d.d(solverVariable4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                m2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(h0.g.a.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.m
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.n
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.l
            int r2 = r2 + r3
            int r4 = r0.h
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01b9
            h0.g.a.b[] r2 = r0.i
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            h0.g.a.b$a r6 = r1.d
            int r6 = r6.a()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            h0.g.a.b$a r8 = r1.d
            androidx.constraintlayout.core.SolverVariable r8 = r8.e(r7)
            int r9 = r8.x
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.Z1
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r9 = r1.c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r6 = r1.c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r8 = r1.c
            java.lang.Object r8 = r8.get(r7)
            androidx.constraintlayout.core.SolverVariable r8 = (androidx.constraintlayout.core.SolverVariable) r8
            boolean r9 = r8.Z1
            if (r9 == 0) goto L_0x005f
            r1.k(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            h0.g.a.b[] r9 = r0.i
            int r8 = r8.x
            r8 = r9[r8]
            r1.l(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r6 = r1.c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = r3
            goto L_0x0022
        L_0x0073:
            androidx.constraintlayout.core.SolverVariable r2 = r1.a
            if (r2 == 0) goto L_0x0083
            h0.g.a.b$a r2 = r1.d
            int r2 = r2.a()
            if (r2 != 0) goto L_0x0083
            r1.e = r3
            r0.d = r3
        L_0x0083:
            boolean r2 = r17.isEmpty()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            h0.g.a.b$a r2 = r1.d
            r2.g()
        L_0x009b:
            h0.g.a.b$a r2 = r1.d
            int r2 = r2.a()
            r11 = r6
            r13 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
        L_0x00a8:
            if (r8 >= r2) goto L_0x00ff
            h0.g.a.b$a r15 = r1.d
            float r15 = r15.h(r8)
            h0.g.a.b$a r4 = r1.d
            androidx.constraintlayout.core.SolverVariable r4 = r4.e(r8)
            androidx.constraintlayout.core.SolverVariable$Type r5 = r4.c2
            androidx.constraintlayout.core.SolverVariable$Type r7 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r5 != r7) goto L_0x00d9
            if (r9 != 0) goto L_0x00c3
            boolean r5 = r1.h(r4)
            goto L_0x00cb
        L_0x00c3:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cd
            boolean r5 = r1.h(r4)
        L_0x00cb:
            r12 = r5
            goto L_0x00d6
        L_0x00cd:
            if (r12 != 0) goto L_0x00fb
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto L_0x00fb
            r12 = r3
        L_0x00d6:
            r9 = r4
            r11 = r15
            goto L_0x00fb
        L_0x00d9:
            if (r9 != 0) goto L_0x00fb
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fb
            if (r10 != 0) goto L_0x00e6
            boolean r5 = r1.h(r4)
            goto L_0x00ee
        L_0x00e6:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f0
            boolean r5 = r1.h(r4)
        L_0x00ee:
            r14 = r5
            goto L_0x00f9
        L_0x00f0:
            if (r14 != 0) goto L_0x00fb
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto L_0x00fb
            r14 = r3
        L_0x00f9:
            r10 = r4
            r13 = r15
        L_0x00fb:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a8
        L_0x00ff:
            if (r9 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r9 = r10
        L_0x0103:
            if (r9 != 0) goto L_0x0107
            r2 = r3
            goto L_0x010b
        L_0x0107:
            r1.j(r9)
            r2 = 0
        L_0x010b:
            h0.g.a.b$a r4 = r1.d
            int r4 = r4.a()
            if (r4 != 0) goto L_0x0115
            r1.e = r3
        L_0x0115:
            if (r2 == 0) goto L_0x01a1
            int r2 = r0.l
            int r2 = r2 + r3
            int r4 = r0.h
            if (r2 < r4) goto L_0x0121
            r16.p()
        L_0x0121:
            androidx.constraintlayout.core.SolverVariable$Type r2 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            r4 = 0
            androidx.constraintlayout.core.SolverVariable r2 = r0.a(r2, r4)
            int r4 = r0.e
            int r4 = r4 + r3
            r0.e = r4
            int r5 = r0.l
            int r5 = r5 + r3
            r0.l = r5
            r2.q = r4
            h0.g.a.c r5 = r0.o
            androidx.constraintlayout.core.SolverVariable[] r5 = r5.d
            r5[r4] = r2
            r1.a = r2
            int r4 = r0.m
            r16.i(r17)
            int r5 = r0.m
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01a1
            h0.g.a.d$a r4 = r0.r
            h0.g.a.b r4 = (h0.g.a.b) r4
            java.util.Objects.requireNonNull(r4)
            r5 = 0
            r4.a = r5
            h0.g.a.b$a r5 = r4.d
            r5.clear()
            r5 = 0
        L_0x0156:
            h0.g.a.b$a r7 = r1.d
            int r7 = r7.a()
            if (r5 >= r7) goto L_0x0172
            h0.g.a.b$a r7 = r1.d
            androidx.constraintlayout.core.SolverVariable r7 = r7.e(r5)
            h0.g.a.b$a r8 = r1.d
            float r8 = r8.h(r5)
            h0.g.a.b$a r9 = r4.d
            r9.f(r7, r8, r3)
            int r5 = r5 + 1
            goto L_0x0156
        L_0x0172:
            h0.g.a.d$a r4 = r0.r
            r0.s(r4)
            int r4 = r2.x
            r5 = -1
            if (r4 != r5) goto L_0x019f
            androidx.constraintlayout.core.SolverVariable r4 = r1.a
            if (r4 != r2) goto L_0x018a
            r4 = 0
            androidx.constraintlayout.core.SolverVariable r2 = r1.i(r4, r2)
            if (r2 == 0) goto L_0x018a
            r1.j(r2)
        L_0x018a:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0193
            androidx.constraintlayout.core.SolverVariable r2 = r1.a
            r2.g(r0, r1)
        L_0x0193:
            h0.g.a.c r2 = r0.o
            h0.g.a.e<h0.g.a.b> r2 = r2.b
            r2.b(r1)
            int r2 = r0.m
            int r2 = r2 - r3
            r0.m = r2
        L_0x019f:
            r2 = r3
            goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            androidx.constraintlayout.core.SolverVariable r4 = r1.a
            if (r4 == 0) goto L_0x01b3
            androidx.constraintlayout.core.SolverVariable$Type r4 = r4.c2
            androidx.constraintlayout.core.SolverVariable$Type r5 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r4 == r5) goto L_0x01b4
            float r4 = r1.b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r3 = 0
        L_0x01b4:
            if (r3 != 0) goto L_0x01b7
            return
        L_0x01b7:
            r4 = r2
            goto L_0x01ba
        L_0x01b9:
            r4 = 0
        L_0x01ba:
            if (r4 != 0) goto L_0x01bf
            r16.i(r17)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.d.c(h0.g.a.b):void");
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        if (i3 == 8 && solverVariable2.Z1 && solverVariable.x == -1) {
            solverVariable.f(this, solverVariable2.Y1 + ((float) i2));
            return null;
        }
        b m2 = m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m2.b = (float) i2;
        }
        if (!z) {
            m2.d.d(solverVariable, -1.0f);
            m2.d.d(solverVariable2, 1.0f);
        } else {
            m2.d.d(solverVariable, 1.0f);
            m2.d.d(solverVariable2, -1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.x;
        if (i3 == -1) {
            solverVariable.f(this, (float) i2);
            for (int i4 = 0; i4 < this.e + 1; i4++) {
                SolverVariable solverVariable2 = this.o.d[i4];
            }
        } else if (i3 != -1) {
            b bVar = this.i[i3];
            if (bVar.e) {
                bVar.b = (float) i2;
            } else if (bVar.d.a() == 0) {
                bVar.e = true;
                bVar.b = (float) i2;
            } else {
                b m2 = m();
                if (i2 < 0) {
                    m2.b = (float) (i2 * -1);
                    m2.d.d(solverVariable, 1.0f);
                } else {
                    m2.b = (float) i2;
                    m2.d.d(solverVariable, -1.0f);
                }
                c(m2);
            }
        } else {
            b m3 = m();
            m3.a = solverVariable;
            float f2 = (float) i2;
            solverVariable.Y1 = f2;
            m3.b = f2;
            m3.e = true;
            c(m3);
        }
    }

    public void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        b m2 = m();
        SolverVariable n2 = n();
        n2.y = 0;
        m2.e(solverVariable, solverVariable2, n2, i2);
        if (i3 != 8) {
            m2.d.d(k(i3, (String) null), (float) ((int) (m2.d.j(n2) * -1.0f)));
        }
        c(m2);
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        b m2 = m();
        SolverVariable n2 = n();
        n2.y = 0;
        m2.f(solverVariable, solverVariable2, n2, i2);
        if (i3 != 8) {
            m2.d.d(k(i3, (String) null), (float) ((int) (m2.d.j(n2) * -1.0f)));
        }
        c(m2);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2, int i2) {
        b m2 = m();
        m2.d(solverVariable, solverVariable2, solverVariable3, solverVariable4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(b bVar) {
        int i2;
        if (bVar.e) {
            bVar.a.f(this, bVar.b);
        } else {
            b[] bVarArr = this.i;
            int i3 = this.m;
            bVarArr[i3] = bVar;
            SolverVariable solverVariable = bVar.a;
            solverVariable.x = i3;
            this.m = i3 + 1;
            solverVariable.g(this, bVar);
        }
        if (this.d) {
            int i4 = 0;
            while (i4 < this.m) {
                if (this.i[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.i;
                if (bVarArr2[i4] != null && bVarArr2[i4].e) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.a.f(this, bVar2.b);
                    this.o.b.b(bVar2);
                    this.i[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.m;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.i;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.x == i5) {
                            bVarArr3[i7].a.x = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.i[i6] = null;
                    }
                    this.m = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.d = false;
        }
    }

    public final void j() {
        for (int i2 = 0; i2 < this.m; i2++) {
            b bVar = this.i[i2];
            bVar.a.Y1 = bVar.b;
        }
    }

    public SolverVariable k(int i2, String str) {
        if (this.l + 1 >= this.h) {
            p();
        }
        SolverVariable a2 = a(SolverVariable.Type.ERROR, str);
        int i3 = this.e + 1;
        this.e = i3;
        this.l++;
        a2.q = i3;
        a2.y = i2;
        this.o.d[i3] = a2;
        this.f.b(a2);
        return a2;
    }

    public SolverVariable l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.l + 1 >= this.h) {
            p();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.i;
            if (solverVariable == null) {
                constraintAnchor.l();
                solverVariable = constraintAnchor.i;
            }
            int i2 = solverVariable.q;
            if (i2 == -1 || i2 > this.e || this.o.d[i2] == null) {
                if (i2 != -1) {
                    solverVariable.e();
                }
                int i3 = this.e + 1;
                this.e = i3;
                this.l++;
                solverVariable.q = i3;
                solverVariable.c2 = SolverVariable.Type.UNRESTRICTED;
                this.o.d[i3] = solverVariable;
            }
        }
        return solverVariable;
    }

    public b m() {
        b a2 = this.o.b.a();
        if (a2 == null) {
            a2 = new b(this.o);
            c++;
        } else {
            a2.a = null;
            a2.d.clear();
            a2.b = 0.0f;
            a2.e = false;
        }
        SolverVariable.c++;
        return a2;
    }

    public SolverVariable n() {
        if (this.l + 1 >= this.h) {
            p();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, (String) null);
        int i2 = this.e + 1;
        this.e = i2;
        this.l++;
        a2.q = i2;
        this.o.d[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).i;
        if (solverVariable != null) {
            return (int) (solverVariable.Y1 + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.g * 2;
        this.g = i2;
        this.i = (b[]) Arrays.copyOf(this.i, i2);
        c cVar = this.o;
        cVar.d = (SolverVariable[]) Arrays.copyOf(cVar.d, this.g);
        int i3 = this.g;
        this.k = new boolean[i3];
        this.h = i3;
        this.n = i3;
    }

    public void q() throws Exception {
        if (this.f.isEmpty()) {
            j();
        } else if (this.j) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.m) {
                    z = true;
                    break;
                } else if (!this.i[i2].e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                r(this.f);
            } else {
                j();
            }
        } else {
            r(this.f);
        }
    }

    public void r(a aVar) throws Exception {
        float f2;
        int i2;
        boolean z;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.m) {
                z = false;
                break;
            }
            b[] bVarArr = this.i;
            if (bVarArr[i3].a.c2 != SolverVariable.Type.UNRESTRICTED && bVarArr[i3].b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                int i8 = 0;
                while (i7 < this.m) {
                    b bVar = this.i[i7];
                    if (bVar.a.c2 != SolverVariable.Type.UNRESTRICTED && !bVar.e && bVar.b < f2) {
                        int a2 = bVar.d.a();
                        int i9 = 0;
                        while (i9 < a2) {
                            SolverVariable e2 = bVar.d.e(i9);
                            float j2 = bVar.d.j(e2);
                            if (j2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = e2.a2[i10] / j2;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i6 = e2.q;
                                        i8 = i10;
                                        f3 = f4;
                                        i5 = i7;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i7++;
                    f2 = 0.0f;
                }
                if (i5 != -1) {
                    b bVar2 = this.i[i5];
                    bVar2.a.x = -1;
                    bVar2.j(this.o.d[i6]);
                    SolverVariable solverVariable = bVar2.a;
                    solverVariable.x = i5;
                    solverVariable.g(this, bVar2);
                } else {
                    z2 = true;
                }
                if (i4 > this.l / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i2 = 0; i2 < this.l; i2++) {
            this.k[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.l * 2) {
                return i3;
            }
            SolverVariable solverVariable = ((b) aVar).a;
            if (solverVariable != null) {
                this.k[solverVariable.q] = true;
            }
            SolverVariable a2 = aVar.a(this, this.k);
            if (a2 != null) {
                boolean[] zArr = this.k;
                int i4 = a2.q;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.m; i6++) {
                    b bVar = this.i[i6];
                    if (bVar.a.c2 != SolverVariable.Type.UNRESTRICTED && !bVar.e && bVar.d.b(a2)) {
                        float j2 = bVar.d.j(a2);
                        if (j2 < 0.0f) {
                            float f3 = (-bVar.b) / j2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.i[i5];
                    bVar2.a.x = -1;
                    bVar2.j(a2);
                    SolverVariable solverVariable2 = bVar2.a;
                    solverVariable2.x = i5;
                    solverVariable2.g(this, bVar2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    public final void t() {
        for (int i2 = 0; i2 < this.m; i2++) {
            b bVar = this.i[i2];
            if (bVar != null) {
                this.o.b.b(bVar);
            }
            this.i[i2] = null;
        }
    }

    public void u() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.o;
            SolverVariable[] solverVariableArr = cVar.d;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.e();
            }
            i2++;
        }
        e<SolverVariable> eVar = cVar.c;
        SolverVariable[] solverVariableArr2 = this.p;
        int i3 = this.q;
        Objects.requireNonNull(eVar);
        if (i3 > solverVariableArr2.length) {
            i3 = solverVariableArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            SolverVariable solverVariable2 = solverVariableArr2[i4];
            int i5 = eVar.b;
            Object[] objArr = eVar.a;
            if (i5 < objArr.length) {
                objArr[i5] = solverVariable2;
                eVar.b = i5 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.o.d, (Object) null);
        this.e = 0;
        this.f.clear();
        this.l = 1;
        for (int i6 = 0; i6 < this.m; i6++) {
            b[] bVarArr = this.i;
            if (bVarArr[i6] != null) {
                Objects.requireNonNull(bVarArr[i6]);
            }
        }
        t();
        this.m = 0;
        this.r = new b(this.o);
    }
}
