package s0.a.b.k0;

import s0.a.e.b.b0.c.h3;

public final class i0 extends b {
    public final byte[] d;

    public i0(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }

    public byte[] getEncoded() {
        return h3.I(this.d);
    }
}
