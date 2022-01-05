package s0.a.b.b0;

import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class a0 extends m {
    public a0() {
    }

    public a0(a0 a0Var) {
        super(a0Var);
    }

    public f a() {
        return new a0(this);
    }

    public void c(f fVar) {
        i((a0) fVar);
    }

    public int doFinal(byte[] bArr, int i) {
        j();
        h3.l2(this.f, bArr, i);
        h3.l2(this.g, bArr, i + 8);
        h3.l2(this.h, bArr, i + 16);
        h3.l2(this.i, bArr, i + 24);
        h3.l2(this.j, bArr, i + 32);
        h3.l2(this.k, bArr, i + 40);
        h3.l2(this.l, bArr, i + 48);
        h3.l2(this.m, bArr, i + 56);
        reset();
        return 64;
    }

    public String getAlgorithmName() {
        return "SHA-512";
    }

    public int getDigestSize() {
        return 64;
    }

    public void reset() {
        super.reset();
        this.f = 7640891576956012808L;
        this.g = -4942790177534073029L;
        this.h = 4354685564936845355L;
        this.i = -6534734903238641935L;
        this.j = 5840696475078001361L;
        this.k = -7276294671716946913L;
        this.l = 2270897969802886507L;
        this.m = 6620516959819538809L;
    }
}
