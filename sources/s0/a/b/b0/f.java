package s0.a.b.b0;

public final class f extends e {
    public static final byte[] m = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public f() {
        super(m);
    }

    public f(f fVar) {
        super(m);
        c(fVar);
    }

    public s0.a.g.f a() {
        return new f(this);
    }

    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    public String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    public int getDigestSize() {
        return 32;
    }
}
