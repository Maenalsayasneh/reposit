package s0.a.b.e0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;

public class x implements s0.a.b.x {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int[] e;
    public int f;
    public int g = 4;
    public boolean h = false;

    public final int a() {
        int[] iArr = this.e;
        int i = (iArr[0] >>> 2) | (iArr[1] << 30);
        int i2 = (iArr[0] >>> 12) | (iArr[1] << 20);
        int i3 = (iArr[0] >>> 15) | (iArr[1] << 17);
        int i4 = (iArr[1] >>> 4) | (iArr[2] << 28);
        int i5 = (iArr[1] >>> 13) | (iArr[2] << 19);
        int i6 = iArr[2];
        int i7 = (iArr[2] >>> 9) | (iArr[3] << 23);
        int i8 = (iArr[2] >>> 25) | (iArr[3] << 7);
        int i9 = (iArr[3] << 1) | (iArr[2] >>> 31);
        int[] iArr2 = this.d;
        int i10 = (iArr2[0] >>> 8) | (iArr2[1] << 24);
        int i11 = (iArr2[0] >>> 13) | (iArr2[1] << 19);
        int i12 = (iArr2[0] >>> 20) | (iArr2[1] << 12);
        int i13 = (iArr2[1] >>> 10) | (iArr2[2] << 22);
        int i14 = (iArr2[1] >>> 28) | (iArr2[2] << 4);
        int i15 = (iArr2[2] >>> 15) | (iArr2[3] << 17);
        int i16 = i9 & i2 & ((iArr2[2] >>> 31) | (iArr2[3] << 1));
        return ((((((((i16 ^ ((((i11 & i12) ^ (i2 & i10)) ^ (i9 & i13)) ^ (i14 & i15))) ^ ((iArr2[2] >>> 29) | (iArr2[3] << 3))) ^ i) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) ^ i8;
    }

    public final int b() {
        int[] iArr = this.d;
        int i = iArr[0];
        int i2 = (iArr[0] >>> 7) | (iArr[1] << 25);
        int i3 = (iArr[1] >>> 6) | (iArr[2] << 26);
        return iArr[3] ^ ((((i2 ^ i) ^ i3) ^ ((iArr[2] >>> 6) | (iArr[3] << 26))) ^ ((iArr[2] >>> 17) | (iArr[3] << 15)));
    }

    public final int c() {
        int[] iArr = this.e;
        int i = iArr[0];
        int i2 = (iArr[0] >>> 3) | (iArr[1] << 29);
        int i3 = (iArr[0] >>> 11) | (iArr[1] << 21);
        int i4 = (iArr[0] >>> 13) | (iArr[1] << 19);
        int i5 = (iArr[0] >>> 17) | (iArr[1] << 15);
        int i6 = (iArr[0] >>> 18) | (iArr[1] << 14);
        int i7 = (iArr[0] >>> 26) | (iArr[1] << 6);
        int i8 = (iArr[0] >>> 27) | (iArr[1] << 5);
        int i9 = (iArr[1] >>> 8) | (iArr[2] << 24);
        int i10 = (iArr[1] >>> 16) | (iArr[2] << 16);
        int i11 = (iArr[1] >>> 24) | (iArr[2] << 8);
        int i12 = (iArr[1] >>> 27) | (iArr[2] << 5);
        int i13 = (iArr[1] >>> 29) | (iArr[2] << 3);
        int i14 = (iArr[2] >>> 1) | (iArr[3] << 31);
        return (((((((iArr[3] ^ (((i ^ i7) ^ i11) ^ ((iArr[2] >>> 27) | (iArr[3] << 5)))) ^ (i2 & ((iArr[2] >>> 3) | (iArr[3] << 29)))) ^ (i3 & i4)) ^ (i5 & i6)) ^ (i8 & i12)) ^ (i9 & i10)) ^ (i13 & i14)) ^ (((iArr[2] >>> 4) | (iArr[3] << 28)) & ((iArr[2] >>> 20) | (iArr[3] << 12)));
    }

    public final int[] d(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    public String getAlgorithmName() {
        return "Grain-128";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            if (bArr == null || bArr.length != 12) {
                throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
            }
            i iVar2 = c1Var.d;
            if (iVar2 instanceof y0) {
                y0 y0Var = (y0) iVar2;
                byte[] bArr2 = y0Var.c;
                byte[] bArr3 = new byte[bArr2.length];
                this.b = bArr3;
                this.a = new byte[bArr2.length];
                this.d = new int[4];
                this.e = new int[4];
                this.c = new byte[4];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                byte[] bArr4 = y0Var.c;
                System.arraycopy(bArr4, 0, this.a, 0, bArr4.length);
                reset();
                return;
            }
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.h) {
            throw new IllegalStateException("Grain-128 not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i3 + i4;
                byte b2 = bArr[i + i4];
                if (this.g > 3) {
                    int a2 = a();
                    this.f = a2;
                    byte[] bArr3 = this.c;
                    bArr3[0] = (byte) a2;
                    bArr3[1] = (byte) (a2 >> 8);
                    bArr3[2] = (byte) (a2 >> 16);
                    bArr3[3] = (byte) (a2 >> 24);
                    int[] iArr = this.e;
                    d(iArr, c() ^ this.d[0]);
                    this.e = iArr;
                    int[] iArr2 = this.d;
                    d(iArr2, b());
                    this.d = iArr2;
                    this.g = 0;
                }
                byte[] bArr4 = this.c;
                int i6 = this.g;
                this.g = i6 + 1;
                bArr2[i5] = (byte) (b2 ^ bArr4[i6]);
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
        this.g = 4;
        byte[] bArr = this.a;
        byte[] bArr2 = this.b;
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.a = bArr;
        this.b = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.e;
            if (i >= iArr.length) {
                break;
            }
            byte[] bArr3 = this.a;
            int i3 = i2 + 3;
            int i4 = i2 + 2;
            int i5 = i2 + 1;
            iArr[i] = (bArr3[i2] & 255) | (bArr3[i3] << 24) | ((bArr3[i4] << 16) & 16711680) | ((bArr3[i5] << 8) & 65280);
            int[] iArr2 = this.d;
            byte[] bArr4 = this.b;
            iArr2[i] = (bArr4[i2] & 255) | ((bArr4[i5] << 8) & 65280) | (bArr4[i3] << 24) | ((bArr4[i4] << 16) & 16711680);
            i2 += 4;
            i++;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            this.f = a();
            int[] iArr3 = this.e;
            d(iArr3, (c() ^ this.d[0]) ^ this.f);
            this.e = iArr3;
            int[] iArr4 = this.d;
            d(iArr4, b() ^ this.f);
            this.d = iArr4;
        }
        this.h = true;
    }
}
