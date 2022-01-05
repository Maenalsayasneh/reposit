package s0.a.g;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;

public final class b {
    public static final BigInteger a = BigInteger.valueOf(0);
    public static final BigInteger b = BigInteger.valueOf(1);
    public static final BigInteger c = BigInteger.valueOf(2);
    public static final BigInteger d = BigInteger.valueOf(3);
    public static final BigInteger e = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    public static final int f = BigInteger.valueOf(743).bitLength();

    public static void a(BigInteger bigInteger, byte[] bArr, int i, int i2) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i2) {
            System.arraycopy(byteArray, 0, bArr, i, i2);
            return;
        }
        int i3 = 1;
        if (byteArray[0] != 0 || byteArray.length == 1) {
            i3 = 0;
        }
        int length = byteArray.length - i3;
        if (length <= i2) {
            int i4 = (i2 - length) + i;
            Arrays.fill(bArr, i, i4, (byte) 0);
            System.arraycopy(byteArray, i3, bArr, i4, length);
            return;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static byte[] b(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length <= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, i2, bArr, i - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public static byte[] d(int i, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i >= 1) {
            int i2 = (i + 7) / 8;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
            return bArr;
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    public static BigInteger e(int i, SecureRandom secureRandom) {
        return new BigInteger(1, d(i, secureRandom));
    }

    public static BigInteger f(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger e2;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo < 0) {
            if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
                e2 = f(a, bigInteger2.subtract(bigInteger), secureRandom);
            } else {
                for (int i = 0; i < 1000; i++) {
                    BigInteger e3 = e(bigInteger2.bitLength(), secureRandom);
                    if (e3.compareTo(bigInteger) >= 0 && e3.compareTo(bigInteger2) <= 0) {
                        return e3;
                    }
                }
                e2 = e(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
            }
            return e2.add(bigInteger);
        } else if (compareTo <= 0) {
            return bigInteger;
        } else {
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
    }

    public static BigInteger g(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        } else if (i == 2) {
            return secureRandom.nextInt() < 0 ? c : d;
        } else {
            do {
                byte[] d2 = d(i, secureRandom);
                d2[0] = (byte) (((byte) (1 << (7 - ((d2.length * 8) - i)))) | d2[0]);
                int length = d2.length - 1;
                d2[length] = (byte) (d2[length] | 1);
                bigInteger = new BigInteger(1, d2);
                if (i > f) {
                    while (!bigInteger.gcd(e).equals(b)) {
                        bigInteger = bigInteger.add(c);
                    }
                }
            } while (!bigInteger.isProbablePrime(i2));
            return bigInteger;
        }
    }

    public static BigInteger h(byte[] bArr, int i, int i2) {
        if (!(i == 0 && i2 == bArr.length)) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static int i(BigInteger bigInteger) {
        if (bigInteger.equals(a)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static BigInteger j(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        } else if (bigInteger.signum() == 1) {
            if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            int bitLength = bigInteger.bitLength();
            int[] P0 = h3.P0(bitLength, bigInteger);
            int[] P02 = h3.P0(bitLength, bigInteger2);
            int length = P0.length;
            int[] iArr = new int[length];
            if (h3.r2(P0, P02, iArr) != 0) {
                return h3.l3(length, iArr);
            }
            throw new ArithmeticException("BigInteger not invertible.");
        } else {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        } else if (bigInteger.signum() == 1) {
            BigInteger bigInteger3 = b;
            if (bigInteger.equals(bigInteger3)) {
                return a;
            }
            if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            if (bigInteger2.equals(bigInteger3)) {
                return bigInteger3;
            }
            int bitLength = bigInteger.bitLength();
            int[] P0 = h3.P0(bitLength, bigInteger);
            int[] P02 = h3.P0(bitLength, bigInteger2);
            int length = P0.length;
            int[] iArr = new int[length];
            if (h3.s2(P0, P02, iArr)) {
                return h3.l3(length, iArr);
            }
            throw new ArithmeticException("BigInteger not invertible.");
        } else {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
    }
}
