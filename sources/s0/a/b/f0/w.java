package s0.a.b.f0;

import s0.a.b.h;
import s0.a.b.q;

public class w extends h {
    public byte[] a() {
        byte[] a = super.a();
        if (a.length == 32) {
            a[3] = (byte) (a[3] & 15);
            a[7] = (byte) (a[7] & 15);
            a[11] = (byte) (a[11] & 15);
            a[15] = (byte) (a[15] & 15);
            a[4] = (byte) (a[4] & -4);
            a[8] = (byte) (a[8] & -4);
            a[12] = (byte) (a[12] & -4);
            return a;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    public void b(q qVar) {
        super.b(new q(qVar.a, 256));
    }
}
