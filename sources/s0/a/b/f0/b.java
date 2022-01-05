package s0.a.b.f0;

import s0.a.b.k0.c;
import s0.a.b.q;

public class b extends a {
    public byte[] a() {
        boolean z;
        boolean z2;
        int i = this.b;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.a.nextBytes(bArr);
            c.c(bArr);
            z = true;
            i2++;
            if (i2 >= 20) {
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    z2 = false;
                    break;
                } else if (c.b(bArr, i3)) {
                    z2 = true;
                    break;
                } else {
                    i3 += 8;
                }
            }
            if (!z2 && c.a(bArr, 0)) {
                break;
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                z = false;
                break;
            } else if (c.b(bArr, i4)) {
                break;
            } else {
                i4 += 8;
            }
        }
        if (!z && c.a(bArr, 0)) {
            return bArr;
        }
        throw new IllegalStateException("Unable to generate DES-EDE key");
    }

    public void b(q qVar) {
        this.a = qVar.a;
        int i = (qVar.b + 7) / 8;
        this.b = i;
        if (i == 0 || i == 21) {
            this.b = 24;
        } else if (i == 14) {
            this.b = 16;
        } else if (i != 24 && i != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }
}
