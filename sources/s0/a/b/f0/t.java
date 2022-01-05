package s0.a.b.f0;

import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.o;

public class t extends s0.a.b.t {
    public n a;
    public int b;
    public int c;

    public t(n nVar) {
        this.a = nVar;
        this.b = nVar.getDigestSize();
        this.c = ((o) nVar).getByteLength();
    }

    public final byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        int i4 = i2;
        int i5 = this.c;
        byte[] bArr4 = new byte[i5];
        byte[] bArr5 = new byte[i4];
        int i6 = 0;
        for (int i7 = 0; i7 != i5; i7++) {
            bArr4[i7] = (byte) i;
        }
        byte[] bArr6 = this.salt;
        int i8 = 1;
        if (bArr6 == null || bArr6.length == 0) {
            bArr = new byte[0];
        } else {
            int i9 = this.c;
            int length = (((bArr6.length + i9) - 1) / i9) * i9;
            bArr = new byte[length];
            for (int i10 = 0; i10 != length; i10++) {
                byte[] bArr7 = this.salt;
                bArr[i10] = bArr7[i10 % bArr7.length];
            }
        }
        byte[] bArr8 = this.password;
        if (bArr8 == null || bArr8.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i11 = this.c;
            int length2 = (((bArr8.length + i11) - 1) / i11) * i11;
            bArr2 = new byte[length2];
            for (int i12 = 0; i12 != length2; i12++) {
                byte[] bArr9 = this.password;
                bArr2[i12] = bArr9[i12 % bArr9.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr10 = new byte[length3];
        System.arraycopy(bArr, 0, bArr10, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr10, bArr.length, bArr2.length);
        int i13 = this.c;
        byte[] bArr11 = new byte[i13];
        int i14 = this.b;
        int i15 = ((i4 + i14) - 1) / i14;
        byte[] bArr12 = new byte[i14];
        int i16 = 1;
        while (i16 <= i15) {
            this.a.update(bArr4, i6, i5);
            this.a.update(bArr10, i6, length3);
            this.a.doFinal(bArr12, i6);
            for (int i17 = i8; i17 < this.iterationCount; i17++) {
                this.a.update(bArr12, i6, i14);
                this.a.doFinal(bArr12, i6);
            }
            for (int i18 = i6; i18 != i13; i18++) {
                bArr11[i18] = bArr12[i18 % i14];
            }
            int i19 = i6;
            while (true) {
                int i20 = this.c;
                if (i19 == length3 / i20) {
                    break;
                }
                int i21 = i20 * i19;
                int i22 = (i13 + i21) - 1;
                int i23 = i5;
                int i24 = (bArr11[i13 - 1] & 255) + (bArr10[i22] & 255) + 1;
                bArr10[i22] = (byte) i24;
                int i25 = i24 >>> 8;
                int i26 = i13 - 2;
                while (true) {
                    bArr3 = bArr4;
                    if (i26 < 0) {
                        break;
                    }
                    int i27 = i21 + i26;
                    int i28 = (bArr11[i26] & 255) + (bArr10[i27] & 255) + i25;
                    bArr10[i27] = (byte) i28;
                    i25 = i28 >>> 8;
                    i26--;
                    bArr4 = bArr3;
                    length3 = length3;
                }
                i19++;
                bArr4 = bArr3;
                i5 = i23;
                length3 = length3;
            }
            int i29 = i5;
            byte[] bArr13 = bArr4;
            int i30 = length3;
            if (i16 == i15) {
                int i31 = i16 - 1;
                int i32 = this.b;
                i3 = 0;
                System.arraycopy(bArr12, 0, bArr5, i31 * i32, i4 - (i31 * i32));
            } else {
                i3 = 0;
                System.arraycopy(bArr12, 0, bArr5, (i16 - 1) * this.b, i14);
            }
            i16++;
            i6 = i3;
            bArr4 = bArr13;
            i5 = i29;
            length3 = i30;
            i8 = 1;
        }
        return bArr5;
    }

    public i generateDerivedMacParameters(int i) {
        int i2 = i / 8;
        return new y0(generateDerivedKey(3, i2), 0, i2);
    }

    public i generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new y0(generateDerivedKey(1, i2), 0, i2);
    }

    public i generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i3);
        return new c1(new y0(generateDerivedKey, 0, i3), generateDerivedKey(2, i4), 0, i4);
    }
}
