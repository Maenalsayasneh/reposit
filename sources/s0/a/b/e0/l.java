package s0.a.b.e0;

import s0.a.e.b.b0.c.h3;

public class l extends t0 {
    public void a() {
        int[] iArr = this.d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    public void b(byte[] bArr) {
        m.h(this.b, this.d, this.e);
        h3.E1(this.e, bArr, 0);
    }

    public int c() {
        return 12;
    }

    public void e() {
        this.d[12] = 0;
    }

    public void g(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                d(bArr.length, this.d, 0);
                h3.h2(bArr, 0, this.d, 4, 8);
            } else {
                throw new IllegalArgumentException("ChaCha7539 requires 256 bit key");
            }
        }
        h3.h2(bArr2, 0, this.d, 13, 3);
    }

    public String getAlgorithmName() {
        return "ChaCha7539";
    }
}
