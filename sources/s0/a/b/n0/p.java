package s0.a.b.n0;

import java.math.BigInteger;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.b;

public class p implements a {
    public static final p a = new p();

    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        int i = b.i(bigInteger);
        if (bArr.length == i * 2) {
            BigInteger bigInteger2 = new BigInteger(1, h3.q0(bArr, 0, i + 0));
            c(bigInteger, bigInteger2);
            BigInteger bigInteger3 = new BigInteger(1, h3.q0(bArr, i, i + i));
            c(bigInteger, bigInteger3);
            return new BigInteger[]{bigInteger2, bigInteger3};
        }
        throw new IllegalArgumentException("Encoding has incorrect length");
    }

    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int i = b.i(bigInteger);
        byte[] bArr = new byte[(i * 2)];
        BigInteger bigInteger4 = bigInteger;
        byte[] bArr2 = bArr;
        int i2 = i;
        d(bigInteger4, bigInteger2, bArr2, 0, i2);
        d(bigInteger4, bigInteger3, bArr2, i, i2);
        return bArr;
    }

    public BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() >= 0 && bigInteger2.compareTo(bigInteger) < 0) {
            return bigInteger2;
        }
        throw new IllegalArgumentException("Value out of range");
    }

    public final void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i, int i2) {
        c(bigInteger, bigInteger2);
        byte[] byteArray = bigInteger2.toByteArray();
        int max = Math.max(0, byteArray.length - i2);
        int length = byteArray.length - max;
        int i3 = (i2 - length) + i;
        Arrays.fill(bArr, i, i3, (byte) 0);
        System.arraycopy(byteArray, max, bArr, i3, length);
    }
}
