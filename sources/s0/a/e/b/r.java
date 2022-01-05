package s0.a.e.b;

import java.math.BigInteger;
import s0.a.e.b.e;

public class r {
    public static final BigInteger a;
    public static final BigInteger b = c.c.negate();
    public static final BigInteger c;
    public static final a0[] d;
    public static final byte[][] e = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
    public static final a0[] f;
    public static final byte[][] g = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};

    static {
        BigInteger bigInteger = c.b;
        BigInteger negate = bigInteger.negate();
        a = negate;
        BigInteger negate2 = c.d.negate();
        c = negate2;
        BigInteger bigInteger2 = c.a;
        d = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, negate), null, new a0(negate, negate), null, new a0(bigInteger, negate), null};
        f = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, bigInteger), null, new a0(negate, bigInteger), null, new a0(bigInteger, bigInteger), null};
    }

    public static q a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b2));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(c.b);
        }
        return new q(shiftRight, i2);
    }

    public static BigInteger[] b(byte b2, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b2 == 1 || b2 == -1) {
            if (z) {
                bigInteger = c.c;
                bigInteger2 = BigInteger.valueOf((long) b2);
            } else {
                bigInteger = c.a;
                bigInteger2 = c.b;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b2 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger[] c(e.a aVar) {
        int i;
        if (aVar.v()) {
            int l = aVar.l();
            int intValue = aVar.b.t().intValue();
            byte b2 = (byte) (intValue == 0 ? -1 : 1);
            BigInteger bigInteger = aVar.e;
            if (bigInteger != null) {
                if (bigInteger.equals(c.c)) {
                    i = 1;
                } else if (bigInteger.equals(c.e)) {
                    i = 2;
                }
                BigInteger[] b3 = b(b2, (l + 3) - intValue, false);
                if (b2 == 1) {
                    b3[0] = b3[0].negate();
                    b3[1] = b3[1].negate();
                }
                BigInteger bigInteger2 = c.b;
                return new BigInteger[]{bigInteger2.add(b3[1]).shiftRight(i), bigInteger2.add(b3[0]).shiftRight(i).negate()};
            }
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }
}
