package s0.a.b.b0;

import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class y extends m {
    public y() {
    }

    public y(y yVar) {
        super(yVar);
    }

    public f a() {
        return new y(this);
    }

    public void c(f fVar) {
        i((y) fVar);
    }

    public int doFinal(byte[] bArr, int i) {
        j();
        h3.l2(this.f, bArr, i);
        h3.l2(this.g, bArr, i + 8);
        h3.l2(this.h, bArr, i + 16);
        h3.l2(this.i, bArr, i + 24);
        h3.l2(this.j, bArr, i + 32);
        h3.l2(this.k, bArr, i + 40);
        reset();
        return 48;
    }

    public String getAlgorithmName() {
        return "SHA-384";
    }

    public int getDigestSize() {
        return 48;
    }

    public void reset() {
        super.reset();
        this.f = -3766243637369397544L;
        this.g = 7105036623409894663L;
        this.h = -7973340178411365097L;
        this.i = 1526699215303891257L;
        this.j = 7436329637833083697L;
        this.k = -8163818279084223215L;
        this.l = -2662702644619276377L;
        this.m = 5167115440072839076L;
    }
}
