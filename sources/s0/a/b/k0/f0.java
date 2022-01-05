package s0.a.b.k0;

import s0.a.e.b.b0.c.h3;

public final class f0 extends b {
    public final byte[] d;

    public f0(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public byte[] getEncoded() {
        return h3.I(this.d);
    }
}
