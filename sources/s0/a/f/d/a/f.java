package s0.a.f.d.a;

public class f {
    public b a;
    public e b;
    public e[] c;
    public e[] d;

    public f(b bVar, e eVar) {
        int i;
        int d2;
        int[] iArr;
        this.a = bVar;
        this.b = eVar;
        int e = eVar.e();
        this.c = new e[e];
        int i2 = 0;
        while (true) {
            i = e >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr2 = new int[(i3 + 1)];
            iArr2[i3] = 1;
            this.c[i2] = new e(this.a, iArr2);
            i2++;
        }
        while (i < e) {
            int i4 = i << 1;
            int[] iArr3 = new int[(i4 + 1)];
            iArr3[i4] = 1;
            e eVar2 = new e(this.a, iArr3);
            e[] eVarArr = this.c;
            e eVar3 = this.b;
            int[] iArr4 = eVar2.c;
            int[] iArr5 = eVar3.c;
            int b2 = e.b(iArr5);
            if (b2 != -1) {
                int length = iArr4.length;
                int[] iArr6 = new int[length];
                int b3 = e.b(iArr5);
                int b4 = eVar2.a.b(b3 == -1 ? 0 : iArr5[b3]);
                System.arraycopy(iArr4, 0, iArr6, 0, length);
                while (b2 <= e.b(iArr6)) {
                    b bVar2 = eVar2.a;
                    int b5 = e.b(iArr6);
                    int d3 = bVar2.d(b5 == -1 ? 0 : iArr6[b5], b4);
                    int b6 = e.b(iArr6) - b2;
                    int b7 = e.b(iArr5);
                    if (b7 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr7 = new int[(b7 + b6 + 1)];
                        System.arraycopy(iArr5, 0, iArr7, b6, b7 + 1);
                        iArr = iArr7;
                    }
                    iArr6 = eVar2.a(eVar2.i(iArr, d3), iArr6);
                }
                eVarArr[i] = new e(eVar2.a, iArr6);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int e2 = this.b.e();
        e[] eVarArr2 = new e[e2];
        int i5 = e2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            eVarArr2[i6] = new e(this.c[i6]);
        }
        this.d = new e[e2];
        while (i5 >= 0) {
            this.d[i5] = new e(this.a, i5);
            i5--;
        }
        for (int i7 = 0; i7 < e2; i7++) {
            if (eVarArr2[i7].d(i7) == 0) {
                int i8 = i7 + 1;
                boolean z = false;
                while (i8 < e2) {
                    if (eVarArr2[i8].d(i7) != 0) {
                        e eVar4 = eVarArr2[i7];
                        eVarArr2[i7] = eVarArr2[i8];
                        eVarArr2[i8] = eVar4;
                        e[] eVarArr3 = this.d;
                        e eVar5 = eVarArr3[i7];
                        eVarArr3[i7] = eVarArr3[i8];
                        eVarArr3[i8] = eVar5;
                        i8 = e2;
                        z = true;
                    }
                    i8++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int b8 = this.a.b(eVarArr2[i7].d(i7));
            eVarArr2[i7].g(b8);
            this.d[i7].g(b8);
            for (int i9 = 0; i9 < e2; i9++) {
                if (!(i9 == i7 || (d2 = eVarArr2[i9].d(i7)) == 0)) {
                    e h = eVarArr2[i7].h(d2);
                    e h2 = this.d[i7].h(d2);
                    e eVar6 = eVarArr2[i9];
                    eVar6.c = eVar6.a(eVar6.c, h.c);
                    eVar6.c();
                    e eVar7 = this.d[i9];
                    eVar7.c = eVar7.a(eVar7.c, h2.c);
                    eVar7.c();
                }
            }
        }
    }
}
