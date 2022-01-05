package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import s0.a.b.b0.p;
import s0.a.b.b0.s;
import s0.a.b.b0.v;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.t;

public class OldPKCS12ParametersGenerator extends t {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private n digest;
    private int u;
    private int v;

    public OldPKCS12ParametersGenerator(n nVar) {
        this.digest = nVar;
        if (nVar instanceof p) {
            this.u = 16;
        } else if (!(nVar instanceof v) && !(nVar instanceof s)) {
            StringBuilder P0 = a.P0("Digest ");
            P0.append(nVar.getAlgorithmName());
            P0.append(" unsupported");
            throw new IllegalArgumentException(P0.toString());
        } else {
            this.u = 20;
        }
        this.v = 64;
    }

    private void adjust(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = (bArr2[length] & 255) + (bArr[i4] & 255) + i3;
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        int i4 = i2;
        int i5 = this.v;
        byte[] bArr3 = new byte[i5];
        byte[] bArr4 = new byte[i4];
        int i6 = 0;
        for (int i7 = 0; i7 != i5; i7++) {
            bArr3[i7] = (byte) i;
        }
        byte[] bArr5 = this.salt;
        int i8 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i9 = this.v;
            int length = (((bArr5.length + i9) - 1) / i9) * i9;
            bArr = new byte[length];
            for (int i10 = 0; i10 != length; i10++) {
                byte[] bArr6 = this.salt;
                bArr[i10] = bArr6[i10 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i11 = this.v;
            int length2 = (((bArr7.length + i11) - 1) / i11) * i11;
            bArr2 = new byte[length2];
            for (int i12 = 0; i12 != length2; i12++) {
                byte[] bArr8 = this.password;
                bArr2[i12] = bArr8[i12 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i13 = this.v;
        byte[] bArr10 = new byte[i13];
        int i14 = this.u;
        int i15 = ((i4 + i14) - 1) / i14;
        int i16 = 1;
        while (i16 <= i15) {
            int i17 = this.u;
            byte[] bArr11 = new byte[i17];
            this.digest.update(bArr3, i6, i5);
            this.digest.update(bArr9, i6, length3);
            this.digest.doFinal(bArr11, i6);
            for (int i18 = i8; i18 != this.iterationCount; i18++) {
                this.digest.update(bArr11, i6, i17);
                this.digest.doFinal(bArr11, i6);
            }
            for (int i19 = i6; i19 != i13; i19++) {
                bArr10[i16] = bArr11[i19 % i17];
            }
            int i20 = i6;
            while (true) {
                int i21 = this.v;
                if (i20 == length3 / i21) {
                    break;
                }
                adjust(bArr9, i21 * i20, bArr10);
                i20++;
            }
            if (i16 == i15) {
                int i22 = i16 - 1;
                int i23 = this.u;
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, i22 * i23, i4 - (i22 * i23));
            } else {
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i16 - 1) * this.u, i17);
            }
            i16++;
            i6 = i3;
            i8 = 1;
        }
        return bArr4;
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
