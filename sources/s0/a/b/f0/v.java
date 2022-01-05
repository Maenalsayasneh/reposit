package s0.a.b.f0;

import s0.a.b.h0.g;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.s;
import s0.a.b.t;

public class v extends t {
    public s a;
    public byte[] b;

    public v(n nVar) {
        g gVar = new g(nVar);
        this.a = gVar;
        this.b = new byte[gVar.c];
    }

    public final byte[] a(int i) {
        int macSize = this.a.getMacSize();
        int i2 = ((i + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i2 * macSize)];
        this.a.init(new y0(this.password));
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = 3;
            while (true) {
                byte b2 = (byte) (bArr[i5] + 1);
                bArr[i5] = b2;
                if (b2 != 0) {
                    break;
                }
                i5--;
            }
            byte[] bArr3 = this.salt;
            int i6 = this.iterationCount;
            if (i6 != 0) {
                if (bArr3 != null) {
                    this.a.update(bArr3, 0, bArr3.length);
                }
                this.a.update(bArr, 0, 4);
                this.a.doFinal(this.b, 0);
                byte[] bArr4 = this.b;
                System.arraycopy(bArr4, 0, bArr2, i4, bArr4.length);
                for (int i7 = 1; i7 < i6; i7++) {
                    s sVar = this.a;
                    byte[] bArr5 = this.b;
                    sVar.update(bArr5, 0, bArr5.length);
                    this.a.doFinal(this.b, 0);
                    int i8 = 0;
                    while (true) {
                        byte[] bArr6 = this.b;
                        if (i8 == bArr6.length) {
                            break;
                        }
                        int i9 = i4 + i8;
                        bArr2[i9] = (byte) (bArr6[i8] ^ bArr2[i9]);
                        i8++;
                    }
                }
                i4 += macSize;
                i3++;
            } else {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
        }
        return bArr2;
    }

    public i generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    public i generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new y0(a(i2), 0, i2);
    }

    public i generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] a2 = a(i3 + i4);
        return new c1(new y0(a2, 0, i3), a2, i3, i4);
    }
}
