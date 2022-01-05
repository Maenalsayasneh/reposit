package s0.a.b.f0;

import s0.a.b.h;
import s0.a.b.k0.c;
import s0.a.b.q;

public class a extends h {
    public byte[] a() {
        byte[] bArr = new byte[8];
        do {
            this.a.nextBytes(bArr);
            c.c(bArr);
        } while (c.b(bArr, 0));
        return bArr;
    }

    public void b(q qVar) {
        super.b(qVar);
        int i = this.b;
        if (i == 0 || i == 7) {
            this.b = 8;
        } else if (i != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
