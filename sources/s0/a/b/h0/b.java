package s0.a.b.h0;

import java.util.Objects;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.j0.a;
import s0.a.b.k0.c1;
import s0.a.b.s;

public class b implements s {
    public byte[] a;
    public byte[] b;
    public int c;
    public j d;
    public a e = null;
    public int f;

    public b(e eVar) {
        int b2 = (eVar.b() * 8) / 2;
        if (b2 % 8 == 0) {
            this.a = new byte[eVar.b()];
            j jVar = new j(eVar, 8);
            this.d = jVar;
            this.e = null;
            this.f = b2 / 8;
            this.b = new byte[jVar.d];
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    public int doFinal(byte[] bArr, int i) {
        int i2 = this.d.d;
        a aVar = this.e;
        if (aVar == null) {
            while (true) {
                int i3 = this.c;
                if (i3 >= i2) {
                    break;
                }
                this.b[i3] = 0;
                this.c = i3 + 1;
            }
        } else {
            aVar.a(this.b, this.c);
        }
        this.d.a(this.b, 0, this.a, 0);
        j jVar = this.d;
        jVar.e.a(jVar.b, 0, this.a, 0);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        reset();
        return this.f;
    }

    public String getAlgorithmName() {
        j jVar = this.d;
        return jVar.e.getAlgorithmName() + "/CFB" + (jVar.d * 8);
    }

    public int getMacSize() {
        return this.f;
    }

    public void init(i iVar) {
        e eVar;
        reset();
        j jVar = this.d;
        Objects.requireNonNull(jVar);
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            int length = bArr.length;
            byte[] bArr2 = jVar.a;
            if (length < bArr2.length) {
                System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            }
            jVar.b();
            eVar = jVar.e;
            iVar = c1Var.d;
        } else {
            jVar.b();
            eVar = jVar.e;
        }
        eVar.init(true, iVar);
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
                this.d.b();
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
            int i3 = this.d.d;
            int i4 = this.c;
            int i5 = i3 - i4;
            if (i2 > i5) {
                System.arraycopy(bArr, i, this.b, i4, i5);
                this.d.a(this.b, 0, this.a, 0);
                this.c = 0;
                i2 -= i5;
                i += i5;
                while (i2 > i3) {
                    this.d.a(bArr, i, this.a, 0);
                    i2 -= i3;
                    i += i3;
                }
            }
            System.arraycopy(bArr, i, this.b, this.c, i2);
            this.c += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
