package s0.a.b.h0;

import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.s;

public class p implements s {
    public byte a;
    public byte b = 0;
    public byte[] c = null;
    public byte d = 0;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte h;
    public byte i;
    public byte j;
    public byte k;

    public int doFinal(byte[] bArr, int i2) throws DataLengthException, IllegalStateException {
        for (int i3 = 1; i3 < 25; i3++) {
            byte[] bArr2 = this.c;
            byte b2 = this.d;
            byte b3 = this.b;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255]) & 255];
            this.d = b4;
            byte b5 = this.k;
            byte b6 = this.j;
            byte b7 = bArr2[(b5 + b6 + i3) & 255];
            this.k = b7;
            byte b8 = this.i;
            byte b9 = bArr2[(b6 + b8 + i3) & 255];
            this.j = b9;
            byte b10 = this.h;
            byte b11 = bArr2[(b8 + b10 + i3) & 255];
            this.i = b11;
            byte b12 = bArr2[(b10 + b4 + i3) & 255];
            this.h = b12;
            byte[] bArr3 = this.e;
            byte b13 = this.a;
            bArr3[b13 & 31] = (byte) (b12 ^ bArr3[b13 & 31]);
            bArr3[(b13 + 1) & 31] = (byte) (b11 ^ bArr3[(b13 + 1) & 31]);
            bArr3[(b13 + 2) & 31] = (byte) (b9 ^ bArr3[(b13 + 2) & 31]);
            bArr3[(b13 + 3) & 31] = (byte) (b7 ^ bArr3[(b13 + 3) & 31]);
            this.a = (byte) ((b13 + 4) & 31);
            byte b14 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b14;
            this.b = (byte) ((b3 + 1) & 255);
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.c;
            int i5 = i4 & 255;
            byte b15 = bArr4[(this.d + bArr4[i5] + this.e[i4 & 31]) & 255];
            this.d = b15;
            byte b16 = bArr4[i5];
            bArr4[i5] = bArr4[b15 & 255];
            bArr4[b15 & 255] = b16;
        }
        byte[] bArr5 = new byte[20];
        for (int i6 = 0; i6 < 20; i6++) {
            byte[] bArr6 = this.c;
            int i7 = i6 & 255;
            byte b17 = bArr6[(this.d + bArr6[i7]) & 255];
            this.d = b17;
            bArr5[i6] = bArr6[(bArr6[bArr6[b17 & 255] & 255] + 1) & 255];
            byte b18 = bArr6[i7];
            bArr6[i7] = bArr6[b17 & 255];
            bArr6[b17 & 255] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, i2, 20);
        reset();
        return 20;
    }

    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    public int getMacSize() {
        return 20;
    }

    public void init(i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            i iVar2 = c1Var.d;
            y0 y0Var = (y0) iVar2;
            if (iVar2 instanceof y0) {
                byte[] bArr = c1Var.c;
                this.f = bArr;
                if (bArr == null || bArr.length < 1 || bArr.length > 768) {
                    throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
                }
                this.g = y0Var.c;
                reset();
                return;
            }
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
    }

    public void reset() {
        byte[] bArr = this.g;
        byte[] bArr2 = this.f;
        this.d = 0;
        this.c = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            this.c[i2] = (byte) i2;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr3 = this.c;
            int i4 = i3 & 255;
            byte b2 = bArr3[(this.d + bArr3[i4] + bArr[i3 % bArr.length]) & 255];
            this.d = b2;
            byte b3 = bArr3[i4];
            byte b4 = b2 & 255;
            bArr3[i4] = bArr3[b4];
            bArr3[b4] = b3;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.c;
            int i6 = i5 & 255;
            byte b5 = bArr4[(this.d + bArr4[i6] + bArr2[i5 % bArr2.length]) & 255];
            this.d = b5;
            byte b6 = bArr4[i6];
            byte b7 = b5 & 255;
            bArr4[i6] = bArr4[b7];
            bArr4[b7] = b6;
        }
        this.b = 0;
        this.b = 0;
        this.k = 0;
        this.j = 0;
        this.i = 0;
        this.h = 0;
        this.a = 0;
        this.e = new byte[32];
        for (int i7 = 0; i7 < 32; i7++) {
            this.e[i7] = 0;
        }
    }

    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.c;
        byte b3 = this.d;
        byte b4 = this.b;
        byte b5 = bArr[(b3 + bArr[b4 & 255]) & 255];
        this.d = b5;
        byte b6 = this.k;
        byte b7 = this.j;
        byte b8 = bArr[(b6 + b7) & 255];
        this.k = b8;
        byte b9 = this.i;
        byte b10 = bArr[(b7 + b9) & 255];
        this.j = b10;
        byte b11 = this.h;
        byte b12 = bArr[(b9 + b11) & 255];
        this.i = b12;
        byte b13 = bArr[(b11 + b5 + ((byte) (b2 ^ bArr[(bArr[bArr[b5 & 255] & 255] + 1) & 255]))) & 255];
        this.h = b13;
        byte[] bArr2 = this.e;
        byte b14 = this.a;
        bArr2[b14 & 31] = (byte) (b13 ^ bArr2[b14 & 31]);
        bArr2[(b14 + 1) & 31] = (byte) (b12 ^ bArr2[(b14 + 1) & 31]);
        bArr2[(b14 + 2) & 31] = (byte) (b10 ^ bArr2[(b14 + 2) & 31]);
        bArr2[(b14 + 3) & 31] = (byte) (b8 ^ bArr2[(b14 + 3) & 31]);
        this.a = (byte) ((b14 + 4) & 31);
        byte b15 = bArr[b4 & 255];
        bArr[b4 & 255] = bArr[b5 & 255];
        bArr[b5 & 255] = b15;
        this.b = (byte) ((b4 + 1) & 255);
    }

    public void update(byte[] bArr, int i2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 + i3 <= bArr.length) {
            for (int i4 = 0; i4 < i3; i4++) {
                update(bArr[i2 + i4]);
            }
            return;
        }
        throw new DataLengthException("input buffer too short");
    }
}
