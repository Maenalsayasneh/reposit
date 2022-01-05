package s0.a.b.e0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;

public class d0 implements e {
    public static final byte[] a = {Byte.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44};
    public final int[] b = new int[4];
    public boolean c = false;
    public boolean d;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte[] bArr3 = bArr;
        int i3 = i;
        byte[] bArr4 = bArr2;
        int i4 = i2;
        if (this.c) {
            int i5 = 16;
            if (i3 > bArr3.length - 16) {
                throw new DataLengthException("input buffer too short");
            } else if (i4 <= bArr4.length - 16) {
                int i6 = 0;
                int i7 = 8;
                if (this.d) {
                    int y = h3.y(bArr, i);
                    int y2 = h3.y(bArr3, i3 + 4);
                    int y3 = h3.y(bArr3, i3 + 8);
                    int y4 = h3.y(bArr3, i3 + 12);
                    int[] iArr = this.b;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    int i10 = iArr[2];
                    int i11 = iArr[3];
                    while (true) {
                        byte b10 = (a[i6] & 255) ^ y;
                        byte b11 = b10 ^ y3;
                        byte rotateLeft = b11 ^ (Integer.rotateLeft(b11, 8) ^ Integer.rotateLeft(b11, 24));
                        byte b12 = y4 ^ rotateLeft;
                        b6 = (y2 ^ rotateLeft) ^ i9;
                        byte b13 = y3 ^ i10;
                        b7 = b12 ^ i11;
                        byte b14 = b6 ^ b7;
                        byte rotateLeft2 = b14 ^ (Integer.rotateLeft(b14, 24) ^ Integer.rotateLeft(b14, 8));
                        b8 = (b10 ^ i8) ^ rotateLeft2;
                        b9 = b13 ^ rotateLeft2;
                        i6++;
                        if (i6 > 16) {
                            break;
                        }
                        int rotateLeft3 = Integer.rotateLeft(b6, 1);
                        int rotateLeft4 = Integer.rotateLeft(b9, 5);
                        int rotateLeft5 = Integer.rotateLeft(b7, 2);
                        byte b15 = rotateLeft3 ^ ((~rotateLeft5) & (~rotateLeft4));
                        byte b16 = b8 ^ (rotateLeft4 & b15);
                        byte b17 = rotateLeft4 ^ ((rotateLeft5 ^ b15) ^ b16);
                        byte b18 = b15 ^ ((~b16) & (~b17));
                        byte b19 = rotateLeft5 ^ (b17 & b18);
                        int rotateLeft6 = Integer.rotateLeft(b18, 31);
                        y3 = Integer.rotateLeft(b17, 27);
                        y2 = rotateLeft6;
                        y = b19;
                        y4 = Integer.rotateLeft(b16, 30);
                    }
                    h3.B1(b8, bArr4, i4);
                    h3.B1(b6, bArr4, i4 + 4);
                    h3.B1(b9, bArr4, i4 + 8);
                    h3.B1(b7, bArr4, i4 + 12);
                } else {
                    int y5 = h3.y(bArr, i);
                    int y6 = h3.y(bArr3, i3 + 4);
                    int y7 = h3.y(bArr3, i3 + 8);
                    int y8 = h3.y(bArr3, i3 + 12);
                    int[] iArr2 = this.b;
                    int i12 = iArr2[0];
                    int i13 = iArr2[1];
                    int i14 = iArr2[2];
                    int i15 = iArr2[3];
                    int i16 = 16;
                    while (true) {
                        byte b20 = y5 ^ y7;
                        byte rotateLeft7 = b20 ^ (Integer.rotateLeft(b20, i7) ^ Integer.rotateLeft(b20, 24));
                        b2 = (y6 ^ rotateLeft7) ^ i13;
                        b3 = (y8 ^ rotateLeft7) ^ i15;
                        byte b21 = b2 ^ b3;
                        byte rotateLeft8 = (Integer.rotateLeft(b21, 24) ^ Integer.rotateLeft(b21, i7)) ^ b21;
                        b4 = (y7 ^ i14) ^ rotateLeft8;
                        b5 = ((y5 ^ i12) ^ rotateLeft8) ^ (a[i16] & 255);
                        i16--;
                        if (i16 < 0) {
                            break;
                        }
                        int rotateLeft9 = Integer.rotateLeft(b2, 1);
                        int rotateLeft10 = Integer.rotateLeft(b4, 5);
                        int rotateLeft11 = Integer.rotateLeft(b3, 2);
                        byte b22 = ((~rotateLeft11) & (~rotateLeft10)) ^ rotateLeft9;
                        byte b23 = b5 ^ (rotateLeft10 & b22);
                        byte b24 = ((rotateLeft11 ^ b22) ^ b23) ^ rotateLeft10;
                        byte b25 = b22 ^ ((~b23) & (~b24));
                        byte b26 = rotateLeft11 ^ (b24 & b25);
                        y6 = Integer.rotateLeft(b25, 31);
                        y7 = Integer.rotateLeft(b24, 27);
                        i5 = 16;
                        i7 = 8;
                        int rotateLeft12 = Integer.rotateLeft(b23, 30);
                        y5 = b26;
                        y8 = rotateLeft12;
                    }
                    h3.B1(b5, bArr4, i4);
                    h3.B1(b2, bArr4, i4 + 4);
                    h3.B1(b4, bArr4, i4 + 8);
                    h3.B1(b3, bArr4, i4 + 12);
                }
                return i5;
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new IllegalStateException("Noekeon not initialised");
        }
    }

    public int b() {
        return 16;
    }

    public String getAlgorithmName() {
        return "Noekeon";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof y0) {
            this.d = z;
            this.c = true;
            byte[] bArr = ((y0) iVar).c;
            int[] iArr = this.b;
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                iArr[0 + i2] = h3.y(bArr, i);
                i += 4;
            }
            if (!z) {
                int[] iArr2 = this.b;
                int i3 = iArr2[0];
                int i4 = iArr2[1];
                int i5 = iArr2[2];
                int i6 = iArr2[3];
                int i7 = i3 ^ i5;
                int rotateLeft = i7 ^ (Integer.rotateLeft(i7, 8) ^ Integer.rotateLeft(i7, 24));
                int i8 = i4 ^ rotateLeft;
                int i9 = i6 ^ rotateLeft;
                int i10 = i8 ^ i9;
                int rotateLeft2 = i10 ^ (Integer.rotateLeft(i10, 8) ^ Integer.rotateLeft(i10, 24));
                int i11 = i3 ^ rotateLeft2;
                int i12 = i5 ^ rotateLeft2;
                int[] iArr3 = this.b;
                iArr3[0] = i11;
                iArr3[1] = i8;
                iArr3[2] = i12;
                iArr3[3] = i9;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to Noekeon init - ")));
    }

    public void reset() {
    }
}
