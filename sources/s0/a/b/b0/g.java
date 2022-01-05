package s0.a.b.b0;

import s0.a.g.f;

public class g extends e {
    public static final byte[] m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public g() {
        super(m);
    }

    public g(g gVar) {
        super(m);
        c(gVar);
    }

    public f a() {
        return new g(this);
    }

    public String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    public int getDigestSize() {
        return 64;
    }
}
