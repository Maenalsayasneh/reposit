package s0.a.b.h0;

import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.i0.c;
import s0.a.b.s;

public class a implements s {
    public byte[] a;
    public byte[] b;
    public int c;
    public e d;
    public s0.a.b.j0.a e;
    public int f;

    public a(e eVar) {
        this(eVar, (eVar.b() * 8) / 2, (s0.a.b.j0.a) null);
    }

    public a(e eVar, int i, s0.a.b.j0.a aVar) {
        if (i % 8 == 0) {
            this.d = new c(eVar);
            this.e = aVar;
            this.f = i / 8;
            this.a = new byte[eVar.b()];
            this.b = new byte[eVar.b()];
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
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
        System.arraycopy(this.a, 0, bArr, i, this.f);
        reset();
        return this.f;
    }

    public String getAlgorithmName() {
        return this.d.getAlgorithmName();
    }

    public int getMacSize() {
        return this.f;
    }

    public void init(i iVar) {
        reset();
        this.d.init(true, iVar);
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
