package s0.a.f.d.a;

import i0.d.a.a.a;
import s0.a.e.b.b0.c.h3;

public class d {
    public int[] a;

    public d(byte[] bArr) {
        if (bArr.length > 4) {
            boolean z = false;
            int b = h3.b(bArr, 0);
            int a2 = c.a(b - 1);
            if (bArr.length == (b * a2) + 4) {
                this.a = new int[b];
                for (int i = 0; i < b; i++) {
                    int[] iArr = this.a;
                    int i2 = (i * a2) + 4;
                    int i3 = 0;
                    for (int i4 = a2 - 1; i4 >= 0; i4--) {
                        i3 |= (bArr[i2 + i4] & 255) << (i4 * 8);
                    }
                    iArr[i] = i3;
                }
                int[] iArr2 = this.a;
                int length = iArr2.length;
                boolean[] zArr = new boolean[length];
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (iArr2[i5] < 0 || iArr2[i5] >= length || zArr[iArr2[i5]]) {
                            break;
                        }
                        zArr[iArr2[i5]] = true;
                        i5++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException("invalid encoding");
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    public byte[] a() {
        int length = this.a.length;
        int a2 = c.a(length - 1);
        byte[] bArr = new byte[((length * a2) + 4)];
        h3.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            int i2 = this.a[i];
            int i3 = (i * a2) + 4;
            for (int i4 = a2 - 1; i4 >= 0; i4--) {
                bArr[i3 + i4] = (byte) (i2 >>> (i4 * 8));
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return h3.K0(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return h3.n1(this.a);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[");
        P0.append(this.a[0]);
        String sb = P0.toString();
        for (int i = 1; i < this.a.length; i++) {
            StringBuilder S0 = a.S0(sb, ", ");
            S0.append(this.a[i]);
            sb = S0.toString();
        }
        return a.n0(sb, "]");
    }
}
