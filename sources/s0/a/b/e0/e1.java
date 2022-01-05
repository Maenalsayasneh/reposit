package s0.a.b.e0;

import s0.a.e.b.b0.c.h3;

public class e1 extends t0 {
    public int c() {
        return 24;
    }

    public void g(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("XSalsa20 doesn't support re-init with null key");
        } else if (bArr.length == 32) {
            super.g(bArr, bArr2);
            h3.h2(bArr2, 8, this.d, 8, 2);
            int[] iArr = this.d;
            int[] iArr2 = new int[iArr.length];
            t0.f(20, iArr, iArr2);
            int[] iArr3 = this.d;
            iArr3[1] = iArr2[0] - iArr3[0];
            iArr3[2] = iArr2[5] - iArr3[5];
            iArr3[3] = iArr2[10] - iArr3[10];
            iArr3[4] = iArr2[15] - iArr3[15];
            iArr3[11] = iArr2[6] - iArr3[6];
            iArr3[12] = iArr2[7] - iArr3[7];
            iArr3[13] = iArr2[8] - iArr3[8];
            iArr3[14] = iArr2[9] - iArr3[9];
            h3.h2(bArr2, 16, iArr3, 6, 2);
        } else {
            throw new IllegalArgumentException("XSalsa20 requires a 256 bit key");
        }
    }

    public String getAlgorithmName() {
        return "XSalsa20";
    }
}
