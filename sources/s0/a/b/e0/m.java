package s0.a.b.e0;

import i0.d.a.a.a;
import s0.a.e.b.b0.c.h3;

public class m extends t0 {
    public static void h(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i2 = 16;
        if (iArr3.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr4.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            char c = 0;
            int i3 = iArr3[0];
            int i4 = iArr3[1];
            int i5 = iArr3[2];
            int i6 = iArr3[3];
            int i7 = iArr3[4];
            int i8 = iArr3[5];
            int i9 = iArr3[6];
            int i10 = 7;
            int i11 = iArr3[7];
            int i12 = 8;
            int i13 = iArr3[8];
            int i14 = iArr3[9];
            int i15 = iArr3[10];
            int i16 = iArr3[11];
            int i17 = 12;
            int i18 = iArr3[12];
            int i19 = iArr3[13];
            int i20 = iArr3[14];
            int i21 = iArr3[15];
            int i22 = i20;
            int i23 = i19;
            int i24 = i18;
            int i25 = i16;
            int i26 = i15;
            int i27 = i14;
            int i28 = i13;
            int i29 = i11;
            int i30 = i9;
            int i31 = i8;
            int i32 = i7;
            int i33 = i6;
            int i34 = i5;
            int i35 = i4;
            int i36 = i3;
            int i37 = i;
            while (i37 > 0) {
                int i38 = i36 + i32;
                int rotateLeft = Integer.rotateLeft(i24 ^ i38, i2);
                int i39 = i28 + rotateLeft;
                int rotateLeft2 = Integer.rotateLeft(i32 ^ i39, i17);
                int i40 = i38 + rotateLeft2;
                int rotateLeft3 = Integer.rotateLeft(rotateLeft ^ i40, i12);
                int i41 = i39 + rotateLeft3;
                int rotateLeft4 = Integer.rotateLeft(rotateLeft2 ^ i41, i10);
                int i42 = i35 + i31;
                int rotateLeft5 = Integer.rotateLeft(i23 ^ i42, i2);
                int i43 = i27 + rotateLeft5;
                int rotateLeft6 = Integer.rotateLeft(i31 ^ i43, i17);
                int i44 = i42 + rotateLeft6;
                int rotateLeft7 = Integer.rotateLeft(rotateLeft5 ^ i44, i12);
                int i45 = i43 + rotateLeft7;
                int rotateLeft8 = Integer.rotateLeft(rotateLeft6 ^ i45, i10);
                int i46 = i34 + i30;
                int rotateLeft9 = Integer.rotateLeft(i22 ^ i46, i2);
                int i47 = i26 + rotateLeft9;
                int rotateLeft10 = Integer.rotateLeft(i30 ^ i47, i17);
                int i48 = i46 + rotateLeft10;
                int rotateLeft11 = Integer.rotateLeft(rotateLeft9 ^ i48, i12);
                int i49 = i47 + rotateLeft11;
                int rotateLeft12 = Integer.rotateLeft(rotateLeft10 ^ i49, i10);
                int i50 = i33 + i29;
                int rotateLeft13 = Integer.rotateLeft(i21 ^ i50, 16);
                int i51 = i25 + rotateLeft13;
                int rotateLeft14 = Integer.rotateLeft(i29 ^ i51, i17);
                int i52 = i50 + rotateLeft14;
                int rotateLeft15 = Integer.rotateLeft(rotateLeft13 ^ i52, 8);
                int i53 = i51 + rotateLeft15;
                int rotateLeft16 = Integer.rotateLeft(rotateLeft14 ^ i53, 7);
                int i54 = i40 + rotateLeft8;
                int rotateLeft17 = Integer.rotateLeft(rotateLeft15 ^ i54, 16);
                int i55 = i49 + rotateLeft17;
                int rotateLeft18 = Integer.rotateLeft(rotateLeft8 ^ i55, 12);
                i36 = i54 + rotateLeft18;
                i21 = Integer.rotateLeft(rotateLeft17 ^ i36, 8);
                i26 = i55 + i21;
                i31 = Integer.rotateLeft(rotateLeft18 ^ i26, 7);
                int i56 = i44 + rotateLeft12;
                int rotateLeft19 = Integer.rotateLeft(rotateLeft3 ^ i56, 16);
                int i57 = i53 + rotateLeft19;
                int rotateLeft20 = Integer.rotateLeft(rotateLeft12 ^ i57, 12);
                i35 = i56 + rotateLeft20;
                i24 = Integer.rotateLeft(rotateLeft19 ^ i35, 8);
                i25 = i57 + i24;
                i30 = Integer.rotateLeft(rotateLeft20 ^ i25, 7);
                int i58 = i48 + rotateLeft16;
                int rotateLeft21 = Integer.rotateLeft(rotateLeft7 ^ i58, 16);
                int i59 = i41 + rotateLeft21;
                int rotateLeft22 = Integer.rotateLeft(rotateLeft16 ^ i59, 12);
                i34 = i58 + rotateLeft22;
                i23 = Integer.rotateLeft(rotateLeft21 ^ i34, 8);
                i28 = i59 + i23;
                i29 = Integer.rotateLeft(rotateLeft22 ^ i28, 7);
                int i60 = i52 + rotateLeft4;
                i2 = 16;
                int rotateLeft23 = Integer.rotateLeft(rotateLeft11 ^ i60, 16);
                int i61 = i45 + rotateLeft23;
                int rotateLeft24 = Integer.rotateLeft(rotateLeft4 ^ i61, 12);
                i33 = i60 + rotateLeft24;
                i22 = Integer.rotateLeft(rotateLeft23 ^ i33, 8);
                i27 = i61 + i22;
                i32 = Integer.rotateLeft(rotateLeft24 ^ i27, 7);
                i37 -= 2;
                c = 0;
                i17 = 12;
                i12 = 8;
                i10 = 7;
            }
            iArr4[c] = i36 + iArr3[c];
            iArr4[1] = i35 + iArr3[1];
            iArr4[2] = i34 + iArr3[2];
            iArr4[3] = i33 + iArr3[3];
            iArr4[4] = i32 + iArr3[4];
            iArr4[5] = i31 + iArr3[5];
            iArr4[6] = i30 + iArr3[6];
            iArr4[7] = i29 + iArr3[7];
            iArr4[8] = i28 + iArr3[8];
            iArr4[9] = i27 + iArr3[9];
            iArr4[10] = i26 + iArr3[10];
            iArr4[11] = i25 + iArr3[11];
            iArr4[12] = i24 + iArr3[12];
            iArr4[13] = i23 + iArr3[13];
            iArr4[14] = i22 + iArr3[14];
            iArr4[15] = i21 + iArr3[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    public void a() {
        int[] iArr = this.d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    public void b(byte[] bArr) {
        h(this.b, this.d, this.e);
        h3.E1(this.e, bArr, 0);
    }

    public void e() {
        int[] iArr = this.d;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    public void g(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 16 || bArr.length == 32) {
                d(bArr.length, this.d, 0);
                h3.h2(bArr, 0, this.d, 4, 4);
                h3.h2(bArr, bArr.length - 16, this.d, 8, 4);
            } else {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
        }
        h3.h2(bArr2, 0, this.d, 14, 2);
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("ChaCha");
        P0.append(this.b);
        return P0.toString();
    }
}
