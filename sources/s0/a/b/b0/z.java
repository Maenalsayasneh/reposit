package s0.a.b.b0;

import i0.d.a.a.a;

public class z extends l {
    public z() {
        this(256);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(int i) {
        super(i);
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return;
        }
        throw new IllegalArgumentException(a.g0("'bitLength' ", i, " not supported for SHA-3"));
    }

    public z(z zVar) {
        super((l) zVar);
    }

    public int doFinal(byte[] bArr, int i) {
        d(2, 2);
        return super.doFinal(bArr, i);
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("SHA3-");
        P0.append(this.f);
        return P0.toString();
    }
}
