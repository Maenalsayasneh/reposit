package s0.a.g;

import java.util.Arrays;
import s0.a.b.b0.c0;
import s0.a.e.b.b0.c.h3;

public class e {
    public static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] b;

    public e(byte[] bArr, int i) {
        if (i % 8 == 0) {
            c0 c0Var = new c0(256);
            c0Var.update(bArr, 0, bArr.length);
            int i2 = i / 8;
            byte[] bArr2 = new byte[i2];
            c0Var.b(bArr2, 0, i2);
            this.b = bArr2;
            return;
        }
        throw new IllegalArgumentException("bitLength must be a multiple of 8");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return Arrays.equals(((e) obj).b, this.b);
        }
        return false;
    }

    public int hashCode() {
        return h3.m1(this.b);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.b.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(a[(this.b[i] >>> 4) & 15]);
            stringBuffer.append(a[this.b[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
