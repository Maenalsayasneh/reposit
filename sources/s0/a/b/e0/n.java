package s0.a.b.e0;

import s0.a.b.i;
import s0.a.b.i0.m;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.k0.e1;
import s0.a.b.k0.f1;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;

public class n extends v {
    public void init(boolean z, i iVar) {
        byte[] bArr;
        y0 y0Var;
        f1 f1Var;
        boolean z2 = z;
        i iVar2 = iVar;
        if (iVar2 instanceof d1) {
            iVar2 = ((d1) iVar2).d;
        }
        f1 f1Var2 = (f1) iVar2;
        i iVar3 = f1Var2.d;
        if (iVar3 instanceof e1) {
            y0Var = (y0) ((e1) iVar3).c;
            bArr = ((e1) iVar3).d;
        } else {
            y0 y0Var2 = (y0) iVar3;
            bArr = null;
            y0Var = y0Var2;
        }
        byte[] bArr2 = y0Var.c;
        byte[] bArr3 = f1Var2.c;
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 == 8) {
                    break;
                }
                int g2 = h3.g2(bArr2, i2 * 4);
                if ((bArr3[i] & (1 << i2)) == 0) {
                    z3 = false;
                }
                if (z3) {
                    i3 += g2;
                } else {
                    i4 += g2;
                }
                i2++;
            }
            byte[] bArr4 = new byte[8];
            h3.D1(i3, bArr4, 0);
            h3.D1(i4, bArr4, 4);
            m mVar = new m(new u());
            mVar.init(true, new c1(new e1(new y0(bArr2), bArr), bArr4));
            mVar.a(bArr2, 0, bArr2, 0);
            mVar.a(bArr2, 8, bArr2, 8);
            mVar.a(bArr2, 16, bArr2, 16);
            mVar.a(bArr2, 24, bArr2, 24);
        }
        y0 y0Var3 = new y0(bArr2);
        if (bArr != null) {
            e1 e1Var = new e1(y0Var3, bArr);
            byte[] bArr5 = f1Var2.c;
        } else {
            f1Var = new f1(y0Var3, f1Var2.c);
        }
        super.init(z2, f1Var);
    }
}
