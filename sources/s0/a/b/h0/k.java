package s0.a.b.h0;

import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.s;

public class k implements s {
    public n a;
    public int b;
    public byte[] c = new byte[64];
    public byte[] d = new byte[64];

    public k(n nVar) {
        this.a = nVar;
        this.b = nVar.getDigestSize();
    }

    public int doFinal(byte[] bArr, int i) {
        int i2 = this.b;
        byte[] bArr2 = new byte[i2];
        this.a.doFinal(bArr2, 0);
        n nVar = this.a;
        byte[] bArr3 = this.d;
        nVar.update(bArr3, 0, bArr3.length);
        this.a.update(bArr2, 0, i2);
        int doFinal = this.a.doFinal(bArr, i);
        reset();
        return doFinal;
    }

    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/HMAC";
    }

    public int getMacSize() {
        return this.b;
    }

    public void init(i iVar) {
        this.a.reset();
        byte[] bArr = ((y0) iVar).c;
        if (bArr.length <= 64) {
            System.arraycopy(bArr, 0, this.c, 0, bArr.length);
            int length = bArr.length;
            while (true) {
                byte[] bArr2 = this.c;
                if (length >= bArr2.length) {
                    break;
                }
                bArr2[length] = 0;
                length++;
            }
        } else {
            this.a.update(bArr, 0, bArr.length);
            this.a.doFinal(this.c, 0);
            int i = this.b;
            while (true) {
                byte[] bArr3 = this.c;
                if (i >= bArr3.length) {
                    break;
                }
                bArr3[i] = 0;
                i++;
            }
        }
        byte[] bArr4 = this.c;
        byte[] bArr5 = new byte[bArr4.length];
        this.d = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        int i2 = 0;
        while (true) {
            byte[] bArr6 = this.c;
            if (i2 >= bArr6.length) {
                break;
            }
            bArr6[i2] = (byte) (bArr6[i2] ^ 54);
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr7 = this.d;
            if (i3 < bArr7.length) {
                bArr7[i3] = (byte) (bArr7[i3] ^ 92);
                i3++;
            } else {
                n nVar = this.a;
                byte[] bArr8 = this.c;
                nVar.update(bArr8, 0, bArr8.length);
                return;
            }
        }
    }

    public void reset() {
        this.a.reset();
        n nVar = this.a;
        byte[] bArr = this.c;
        nVar.update(bArr, 0, bArr.length);
    }

    public void update(byte b2) {
        this.a.update(b2);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
