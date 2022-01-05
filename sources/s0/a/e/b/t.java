package s0.a.e.b;

import java.math.BigInteger;

public class t extends b {
    public h b(h hVar, BigInteger bigInteger) {
        int[] iArr;
        h hVar2;
        h hVar3 = hVar;
        BigInteger bigInteger2 = bigInteger;
        u f = v.f(hVar3, v.e(bigInteger.bitLength(), v.a, 16), true);
        h[] hVarArr = f.c;
        h[] hVarArr2 = f.d;
        int i = f.f;
        if (i == 2) {
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            } else if (bigInteger.signum() == 0) {
                iArr = v.c;
            } else {
                BigInteger add = bigInteger2.shiftLeft(1).add(bigInteger2);
                int bitLength = add.bitLength();
                int i2 = bitLength >> 1;
                int[] iArr2 = new int[i2];
                BigInteger xor = add.xor(bigInteger2);
                int i3 = bitLength - 1;
                int i4 = 1;
                int i5 = 0;
                int i6 = 0;
                while (i4 < i3) {
                    if (!xor.testBit(i4)) {
                        i6++;
                    } else {
                        iArr2[i5] = i6 | ((bigInteger2.testBit(i4) ? -1 : 1) << 16);
                        i4++;
                        i6 = 1;
                        i5++;
                    }
                    i4++;
                }
                int i7 = i5 + 1;
                iArr2[i5] = 65536 | i6;
                if (i2 > i7) {
                    int[] iArr3 = new int[i7];
                    System.arraycopy(iArr2, 0, iArr3, 0, i7);
                    iArr = iArr3;
                } else {
                    iArr = iArr2;
                }
            }
        } else if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            iArr = v.c;
        } else {
            int bitLength2 = (bigInteger.bitLength() / i) + 1;
            int[] iArr4 = new int[bitLength2];
            int i8 = 1 << i;
            int i9 = i8 - 1;
            int i10 = i8 >>> 1;
            int i11 = 0;
            int i12 = 0;
            boolean z = false;
            while (i11 <= bigInteger2.bitLength()) {
                if (bigInteger2.testBit(i11) == z) {
                    i11++;
                } else {
                    bigInteger2 = bigInteger2.shiftRight(i11);
                    int intValue = bigInteger2.intValue() & i9;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i10) != 0;
                    if (z) {
                        intValue -= i8;
                    }
                    if (i12 > 0) {
                        i11--;
                    }
                    iArr4[i12] = (intValue << 16) | i11;
                    i11 = i;
                    i12++;
                }
            }
            if (bitLength2 > i12) {
                iArr = new int[i12];
                System.arraycopy(iArr4, 0, iArr, 0, i12);
            } else {
                iArr = iArr4;
            }
        }
        h m = hVar3.b.m();
        int length = iArr.length;
        if (length > 1) {
            length--;
            int i13 = iArr[length];
            int i14 = i13 >> 16;
            int i15 = i13 & 65535;
            int abs = Math.abs(i14);
            h[] hVarArr3 = i14 < 0 ? hVarArr2 : hVarArr;
            if ((abs << 2) < (1 << i)) {
                int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(abs);
                int i16 = i - numberOfLeadingZeros;
                hVar2 = hVarArr3[((1 << (i - 1)) - 1) >>> 1].a(hVarArr3[(((abs ^ (1 << (numberOfLeadingZeros - 1))) << i16) + 1) >>> 1]);
                i15 -= i16;
            } else {
                hVar2 = hVarArr3[abs >>> 1];
            }
            m = hVar2.y(i15);
        }
        while (length > 0) {
            length--;
            int i17 = iArr[length];
            int i18 = i17 >> 16;
            m = m.A((i18 < 0 ? hVarArr2 : hVarArr)[Math.abs(i18) >>> 1]).y(i17 & 65535);
        }
        return m;
    }
}
