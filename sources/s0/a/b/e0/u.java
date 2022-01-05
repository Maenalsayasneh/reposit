package s0.a.b.e0;

import i0.d.a.a.a;
import java.util.Hashtable;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.e1;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class u implements e {
    public static byte[] a = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
    public static byte[] b = {4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};
    public static byte[] c = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    public static byte[] d = {8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
    public static byte[] e = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};
    public static byte[] f = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};
    public static byte[] g = {12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
    public static byte[] h = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
    public static byte[] i = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};
    public static Hashtable j = new Hashtable();
    public int[] k = null;
    public boolean l;
    public byte[] m = a;

    static {
        d("Default", a);
        d("E-TEST", b);
        d("E-A", c);
        d("E-B", d);
        d("E-C", e);
        d("E-D", f);
        d("Param-Z", g);
        d("D-TEST", h);
        d("D-A", i);
    }

    public static void d(String str, byte[] bArr) {
        j.put(j.g(str), bArr);
    }

    public static byte[] g(String str) {
        byte[] bArr = (byte[]) j.get(j.g(str));
        if (bArr != null) {
            return h3.I(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5;
        int[] iArr = this.k;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        } else if (i2 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + 8 <= bArr2.length) {
            int e2 = e(bArr, i2);
            int e3 = e(bArr, i2 + 4);
            int i6 = 7;
            if (this.l) {
                for (int i7 = 0; i7 < 3; i7++) {
                    int i8 = 0;
                    while (i8 < 8) {
                        i8++;
                        int i9 = e2;
                        e2 = e3 ^ c(e2, iArr[i8]);
                        e3 = i9;
                    }
                }
                i4 = e3;
                i5 = e2;
                while (i6 > 0) {
                    i6--;
                    int c2 = i4 ^ c(i5, iArr[i6]);
                    i4 = i5;
                    i5 = c2;
                }
            } else {
                int i10 = 0;
                while (i10 < 8) {
                    i10++;
                    int i11 = e2;
                    e2 = e3 ^ c(e2, iArr[i10]);
                    e3 = i11;
                }
                i4 = e3;
                i5 = e2;
                int i12 = 0;
                while (i12 < 3) {
                    int i13 = 7;
                    while (i13 >= 0 && (i12 != 2 || i13 != 0)) {
                        i13--;
                        int c3 = i4 ^ c(i5, iArr[i13]);
                        i4 = i5;
                        i5 = c3;
                    }
                    i12++;
                }
            }
            h(i5, bArr2, i3);
            h(i4 ^ c(i5, iArr[0]), bArr2, i3 + 4);
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return 8;
    }

    public final int c(int i2, int i3) {
        int i4 = i3 + i2;
        byte[] bArr = this.m;
        int i5 = (bArr[((i4 >> 0) & 15) + 0] << 0) + (bArr[((i4 >> 4) & 15) + 16] << 4) + (bArr[((i4 >> 8) & 15) + 32] << 8) + (bArr[((i4 >> 12) & 15) + 48] << 12) + (bArr[((i4 >> 16) & 15) + 64] << 16) + (bArr[((i4 >> 20) & 15) + 80] << 20) + (bArr[((i4 >> 24) & 15) + 96] << 24) + (bArr[((i4 >> 28) & 15) + 112] << 28);
        return (i5 << 11) | (i5 >>> 21);
    }

    public final int e(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] << 24) & -16777216) + ((bArr[i2 + 2] << 16) & 16711680) + ((bArr[i2 + 1] << 8) & 65280) + (bArr[i2] & 255);
    }

    public final int[] f(boolean z, byte[] bArr) {
        this.l = z;
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i2 = 0; i2 != 8; i2++) {
                iArr[i2] = e(bArr, i2 * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    public String getAlgorithmName() {
        return "GOST28147";
    }

    public final void h(int i2, byte[] bArr, int i3) {
        bArr[i3 + 3] = (byte) (i2 >>> 24);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof e1) {
            e1 e1Var = (e1) iVar;
            byte[] bArr = e1Var.d;
            if (bArr.length == a.length) {
                this.m = h3.I(bArr);
                i iVar2 = e1Var.c;
                if (iVar2 != null) {
                    this.k = f(z, ((y0) iVar2).c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
        } else if (iVar instanceof y0) {
            this.k = f(z, ((y0) iVar).c);
        } else if (iVar != null) {
            throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to GOST28147 init - ")));
        }
    }

    public void reset() {
    }
}
