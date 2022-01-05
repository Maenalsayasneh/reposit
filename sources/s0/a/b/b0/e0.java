package s0.a.b.b0;

import i0.d.a.a.a;
import s0.a.b.k0.m1;
import s0.a.b.o;
import s0.a.g.f;

public class e0 implements o, f {
    public f0 a;

    public e0(int i, int i2) {
        f0 f0Var = new f0(i, i2);
        this.a = f0Var;
        f0Var.f((m1) null);
    }

    public f a() {
        return new e0(this);
    }

    public void c(f fVar) {
        this.a.c(((e0) fVar).a);
    }

    public int doFinal(byte[] bArr, int i) {
        return this.a.e(bArr, i);
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("Skein-");
        P0.append(this.a.b.e * 8);
        P0.append("-");
        P0.append(this.a.c * 8);
        return P0.toString();
    }

    public int getByteLength() {
        return this.a.b.e;
    }

    public int getDigestSize() {
        return this.a.c;
    }

    public void reset() {
        this.a.h();
    }

    public void update(byte b) {
        f0 f0Var = this.a;
        byte[] bArr = f0Var.j;
        bArr[0] = b;
        f0Var.l(bArr, 0, 1);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.a.l(bArr, i, i2);
    }

    public e0(e0 e0Var) {
        f0 f0Var = e0Var.a;
        f0 f0Var2 = new f0(f0Var.b.e * 8, f0Var.c * 8);
        f0Var2.d(f0Var);
        this.a = f0Var2;
    }
}
