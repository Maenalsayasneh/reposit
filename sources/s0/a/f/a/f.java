package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.e.a;

public class f extends m {
    public byte[] Y1;
    public byte[] Z1;
    public a[] a2;
    public k c;
    public n d;
    public byte[][] q;
    public byte[] x;
    public byte[][] y;

    public f(s sVar) {
        s sVar2 = sVar;
        int i = 0;
        if (sVar2.D(0) instanceof k) {
            this.c = k.B(sVar2.D(0));
        } else {
            this.d = n.D(sVar2.D(0));
        }
        s sVar3 = (s) sVar2.D(1);
        this.q = new byte[sVar3.size()][];
        for (int i2 = 0; i2 < sVar3.size(); i2++) {
            this.q[i2] = ((o) sVar3.D(i2)).c;
        }
        this.x = ((o) ((s) sVar2.D(2)).D(0)).c;
        s sVar4 = (s) sVar2.D(3);
        this.y = new byte[sVar4.size()][];
        for (int i3 = 0; i3 < sVar4.size(); i3++) {
            this.y[i3] = ((o) sVar4.D(i3)).c;
        }
        this.Y1 = ((o) ((s) sVar2.D(4)).D(0)).c;
        this.Z1 = ((o) ((s) sVar2.D(5)).D(0)).c;
        s sVar5 = (s) sVar2.D(6);
        byte[][][][] bArr = new byte[sVar5.size()][][][];
        byte[][][][] bArr2 = new byte[sVar5.size()][][][];
        byte[][][] bArr3 = new byte[sVar5.size()][][];
        byte[][] bArr4 = new byte[sVar5.size()][];
        int i4 = 0;
        while (i4 < sVar5.size()) {
            s sVar6 = (s) sVar5.D(i4);
            s sVar7 = (s) sVar6.D(i);
            bArr[i4] = new byte[sVar7.size()][][];
            for (int i5 = i; i5 < sVar7.size(); i5++) {
                s sVar8 = (s) sVar7.D(i5);
                bArr[i4][i5] = new byte[sVar8.size()][];
                for (int i6 = 0; i6 < sVar8.size(); i6++) {
                    bArr[i4][i5][i6] = ((o) sVar8.D(i6)).c;
                }
            }
            s sVar9 = (s) sVar6.D(1);
            bArr2[i4] = new byte[sVar9.size()][][];
            for (int i7 = 0; i7 < sVar9.size(); i7++) {
                s sVar10 = (s) sVar9.D(i7);
                bArr2[i4][i7] = new byte[sVar10.size()][];
                for (int i8 = 0; i8 < sVar10.size(); i8++) {
                    bArr2[i4][i7][i8] = ((o) sVar10.D(i8)).c;
                }
            }
            s sVar11 = (s) sVar6.D(2);
            bArr3[i4] = new byte[sVar11.size()][];
            for (int i9 = 0; i9 < sVar11.size(); i9++) {
                bArr3[i4][i9] = ((o) sVar11.D(i9)).c;
            }
            bArr4[i4] = ((o) sVar6.D(3)).c;
            i4++;
            i = 0;
        }
        int length = this.Z1.length - 1;
        this.a2 = new a[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.Z1;
            int i11 = i10 + 1;
            this.a2[i10] = new a(bArr5[i10], bArr5[i11], h3.a0(bArr[i10]), h3.a0(bArr2[i10]), h3.Y(bArr3[i10]), h3.W(bArr4[i10]));
            i10 = i11;
        }
    }

    public r c() {
        s0.a.a.f fVar = new s0.a.a.f(10);
        e eVar = this.c;
        if (eVar == null) {
            eVar = this.d;
        }
        fVar.a(eVar);
        s0.a.a.f fVar2 = new s0.a.a.f(10);
        int i = 0;
        while (true) {
            byte[][] bArr = this.q;
            if (i >= bArr.length) {
                break;
            }
            fVar2.a(new x0(bArr[i]));
            i++;
        }
        fVar.a(new b1(fVar2));
        s0.a.a.f fVar3 = new s0.a.a.f(10);
        fVar3.a(new x0(this.x));
        fVar.a(new b1(fVar3));
        s0.a.a.f fVar4 = new s0.a.a.f(10);
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.y;
            if (i2 >= bArr2.length) {
                break;
            }
            fVar4.a(new x0(bArr2[i2]));
            i2++;
        }
        fVar.a(new b1(fVar4));
        s0.a.a.f fVar5 = new s0.a.a.f(10);
        fVar5.a(new x0(this.Y1));
        fVar.a(new b1(fVar5));
        s0.a.a.f fVar6 = new s0.a.a.f(10);
        fVar6.a(new x0(this.Z1));
        fVar.a(new b1(fVar6));
        s0.a.a.f fVar7 = new s0.a.a.f(10);
        for (int i3 = 0; i3 < this.a2.length; i3++) {
            s0.a.a.f fVar8 = new s0.a.a.f(10);
            byte[][][] Z = h3.Z(this.a2[i3].d);
            s0.a.a.f fVar9 = new s0.a.a.f(10);
            for (int i4 = 0; i4 < Z.length; i4++) {
                s0.a.a.f fVar10 = new s0.a.a.f(10);
                for (byte[] x0Var : Z[i4]) {
                    fVar10.a(new x0(x0Var));
                }
                fVar9.a(new b1(fVar10));
            }
            fVar8.a(new b1(fVar9));
            byte[][][] Z2 = h3.Z(this.a2[i3].e);
            s0.a.a.f fVar11 = new s0.a.a.f(10);
            for (int i5 = 0; i5 < Z2.length; i5++) {
                s0.a.a.f fVar12 = new s0.a.a.f(10);
                for (byte[] x0Var2 : Z2[i5]) {
                    fVar12.a(new x0(x0Var2));
                }
                fVar11.a(new b1(fVar12));
            }
            fVar8.a(new b1(fVar11));
            byte[][] X = h3.X(this.a2[i3].f);
            s0.a.a.f fVar13 = new s0.a.a.f(10);
            for (byte[] x0Var3 : X) {
                fVar13.a(new x0(x0Var3));
            }
            fVar8.a(new b1(fVar13));
            fVar8.a(new x0(h3.V(this.a2[i3].g)));
            fVar7.a(new b1(fVar8));
        }
        fVar.a(new b1(fVar7));
        return new b1(fVar);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, a[] aVarArr) {
        this.c = new k(1);
        this.q = h3.X(sArr);
        this.x = h3.V(sArr2);
        this.y = h3.X(sArr3);
        this.Y1 = h3.V(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.Z1 = bArr;
        this.a2 = aVarArr;
    }
}
