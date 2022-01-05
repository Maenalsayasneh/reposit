package s0.a.b.h0;

import s0.a.b.e;
import s0.a.b.e0.o;
import s0.a.b.i;
import s0.a.b.i0.c;
import s0.a.b.j0.a;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.s;

public class h implements s {
    public byte[] a;
    public byte[] b;
    public int c;
    public e d;
    public a e;
    public int f;
    public y0 g;
    public y0 h;

    public h(e eVar, int i, a aVar) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else if (eVar instanceof o) {
            this.d = new c(eVar);
            this.e = aVar;
            this.f = i / 8;
            this.a = new byte[eVar.b()];
            this.b = new byte[eVar.b()];
            this.c = 0;
        } else {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
    }

    public int doFinal(byte[] bArr, int i) {
        int b2 = this.d.b();
        if (this.e == null) {
            while (true) {
                int i2 = this.c;
                if (i2 >= b2) {
                    break;
                }
                this.b[i2] = 0;
                this.c = i2 + 1;
            }
        } else {
            if (this.c == b2) {
                this.d.a(this.b, 0, this.a, 0);
                this.c = 0;
            }
            this.e.a(this.b, this.c);
        }
        this.d.a(this.b, 0, this.a, 0);
        o oVar = new o();
        oVar.init(false, this.g);
        byte[] bArr2 = this.a;
        oVar.a(bArr2, 0, bArr2, 0);
        oVar.init(true, this.h);
        byte[] bArr3 = this.a;
        oVar.a(bArr3, 0, bArr3, 0);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        reset();
        return this.f;
    }

    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    public int getMacSize() {
        return this.f;
    }

    public void init(i iVar) {
        y0 y0Var;
        y0 y0Var2;
        reset();
        boolean z = iVar instanceof y0;
        if (z || (iVar instanceof c1)) {
            if (z) {
                y0Var = (y0) iVar;
            } else {
                y0Var = (y0) ((c1) iVar).d;
            }
            byte[] bArr = y0Var.c;
            if (bArr.length == 16) {
                y0Var2 = new y0(bArr, 0, 8);
                this.g = new y0(bArr, 8, 8);
                this.h = y0Var2;
            } else if (bArr.length == 24) {
                y0Var2 = new y0(bArr, 0, 8);
                this.g = new y0(bArr, 8, 8);
                this.h = new y0(bArr, 16, 8);
            } else {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            if (iVar instanceof c1) {
                this.d.init(true, new c1(y0Var2, ((c1) iVar).c));
            } else {
                this.d.init(true, y0Var2);
            }
        } else {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
    }

    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.c = 0;
                this.d.reset();
                return;
            }
        }
    }

    public void update(byte b2) {
        int i = this.c;
        byte[] bArr = this.b;
        if (i == bArr.length) {
            this.d.a(bArr, 0, this.a, 0);
            this.c = 0;
        }
        byte[] bArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr2[i2] = b2;
    }

    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int b2 = this.d.b();
            int i3 = this.c;
            int i4 = b2 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.b, i3, i4);
                this.d.a(this.b, 0, this.a, 0);
                this.c = 0;
                i2 -= i4;
                i += i4;
                while (i2 > b2) {
                    this.d.a(bArr, i, this.a, 0);
                    i2 -= b2;
                    i += b2;
                }
            }
            System.arraycopy(bArr, i, this.b, this.c, i2);
            this.c += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
