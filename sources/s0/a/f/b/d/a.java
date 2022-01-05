package s0.a.f.b.d;

import s0.a.b.k0.b;
import s0.a.e.b.b0.c.h3;

public final class a extends b {
    public int d;
    public byte[] q;

    public a(int i, byte[] bArr) {
        super(true);
        int i2;
        int length = bArr.length;
        if (i == 5) {
            i2 = 5224;
        } else if (i == 6) {
            i2 = 12392;
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.e0("unknown security category: ", i));
        }
        if (length == i2) {
            this.d = i;
            this.q = h3.I(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return h3.I(this.q);
    }
}
