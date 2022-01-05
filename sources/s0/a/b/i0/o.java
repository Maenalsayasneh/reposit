package s0.a.b.i0;

import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;

public class o extends w {
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public int e;
    public final int f;
    public final e g;
    public boolean h = true;
    public int i;
    public int j;

    public o(e eVar) {
        super(eVar);
        this.g = eVar;
        int b2 = eVar.b();
        this.f = b2;
        if (b2 == 8) {
            this.b = new byte[eVar.b()];
            this.c = new byte[eVar.b()];
            this.d = new byte[eVar.b()];
            return;
        }
        throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i2, this.f, bArr2, i3);
        return this.f;
    }

    public int b() {
        return this.f;
    }

    public byte c(byte b2) {
        if (this.e == 0) {
            if (this.h) {
                this.h = false;
                this.g.a(this.c, 0, this.d, 0);
                this.i = d(this.d, 0);
                this.j = d(this.d, 4);
            }
            int i2 = this.i + 16843009;
            this.i = i2;
            int i3 = this.j + 16843012;
            this.j = i3;
            if (i3 < 16843012 && i3 > 0) {
                this.j = i3 + 1;
            }
            e(i2, this.c, 0);
            e(this.j, this.c, 4);
            this.g.a(this.c, 0, this.d, 0);
        }
        byte[] bArr = this.d;
        int i4 = this.e;
        int i5 = i4 + 1;
        this.e = i5;
        byte b3 = (byte) (b2 ^ bArr[i4]);
        int i6 = this.f;
        if (i5 == i6) {
            this.e = 0;
            byte[] bArr2 = this.c;
            System.arraycopy(bArr2, i6, bArr2, 0, bArr2.length - i6);
            byte[] bArr3 = this.d;
            byte[] bArr4 = this.c;
            int length = bArr4.length;
            int i7 = this.f;
            System.arraycopy(bArr3, 0, bArr4, length - i7, i7);
        }
        return b3;
    }

    public final int d(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] << 24) & -16777216) + ((bArr[i2 + 2] << 16) & 16711680) + ((bArr[i2 + 1] << 8) & 65280) + (bArr[i2] & 255);
    }

    public final void e(int i2, byte[] bArr, int i3) {
        bArr[i3 + 3] = (byte) (i2 >>> 24);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/GCTR";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        this.h = true;
        this.i = 0;
        this.j = 0;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            int length = bArr.length;
            byte[] bArr2 = this.b;
            if (length < bArr2.length) {
                System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = this.b;
                    if (i2 >= bArr3.length - bArr.length) {
                        break;
                    }
                    bArr3[i2] = 0;
                    i2++;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            }
            reset();
            iVar = c1Var.d;
            if (iVar == null) {
                return;
            }
        } else {
            reset();
            if (iVar == null) {
                return;
            }
        }
        this.g.init(true, iVar);
    }

    public void reset() {
        this.h = true;
        this.i = 0;
        this.j = 0;
        byte[] bArr = this.b;
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        this.e = 0;
        this.g.reset();
    }
}
