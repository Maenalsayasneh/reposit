package s0.a.f.d.a;

import java.lang.reflect.Array;
import s0.a.e.b.b0.c.h3;

public class a {
    public int a;
    public int b;
    public int[][] c;
    public int d;

    public a(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.b = i;
            this.a = iArr.length;
            this.d = iArr[0].length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.a; i4++) {
                int[] iArr2 = iArr[i4];
                int i5 = this.d - 1;
                iArr2[i5] = iArr2[i5] & i3;
            }
            this.c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public byte[] a() {
        int i = this.a;
        int i2 = 8;
        byte[] bArr = new byte[((((this.b + 7) >>> 3) * i) + 8)];
        h3.a(i, bArr, 0);
        h3.a(this.b, bArr, 4);
        int i3 = this.b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < this.a; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                h3.a(this.c[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.c[i6][i4] >>> i8) & 255);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a || this.b != aVar.b || this.d != aVar.d) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (!h3.K0(this.c[i], aVar.c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.a * 31) + this.b) * 31) + this.d;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + h3.n1(this.c[i2]);
        }
        return i;
    }

    public String toString() {
        int i = this.b & 31;
        int i2 = this.d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.c[i3][this.d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public a(a aVar) {
        this.b = aVar.b;
        this.a = aVar.a;
        this.d = aVar.d;
        this.c = new int[aVar.c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.c;
            if (i < iArr.length) {
                iArr[i] = h3.K(aVar.c[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public a(byte[] bArr) {
        if (bArr.length >= 9) {
            this.a = h3.b(bArr, 0);
            int b2 = h3.b(bArr, 4);
            this.b = b2;
            int i = this.a;
            int i2 = ((b2 + 7) >>> 3) * i;
            if (i > 0) {
                int i3 = 8;
                if (i2 == bArr.length - 8) {
                    int i4 = (b2 + 31) >>> 5;
                    this.d = i4;
                    int[] iArr = new int[2];
                    iArr[1] = i4;
                    iArr[0] = i;
                    this.c = (int[][]) Array.newInstance(int.class, iArr);
                    int i5 = this.b;
                    int i6 = i5 >> 5;
                    int i7 = i5 & 31;
                    for (int i8 = 0; i8 < this.a; i8++) {
                        int i9 = 0;
                        while (i9 < i6) {
                            this.c[i8][i9] = h3.b(bArr, i3);
                            i9++;
                            i3 += 4;
                        }
                        int i10 = 0;
                        while (i10 < i7) {
                            int[] iArr2 = this.c[i8];
                            iArr2[i6] = ((bArr[i3] & 255) << i10) ^ iArr2[i6];
                            i10 += 8;
                            i3++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
