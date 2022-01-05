package s0.a.f.d.a;

import i0.d.a.a.a;
import java.util.Objects;
import s0.a.e.b.b0.c.h3;

public class e {
    public b a;
    public int b;
    public int[] c;

    public e(b bVar, int i) {
        this.a = bVar;
        this.b = i;
        int[] iArr = new int[(i + 1)];
        this.c = iArr;
        iArr[i] = 1;
    }

    public e(b bVar, byte[] bArr) {
        this.a = bVar;
        int i = 8;
        int i2 = 1;
        while (bVar.a > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            this.c = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.c;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.c;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (this.a.c(this.c[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    c();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public e(e eVar) {
        this.a = eVar.a;
        this.b = eVar.b;
        this.c = h3.K(eVar.c);
    }

    public static int b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public final int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return iArr3;
            }
            b bVar = this.a;
            int i = iArr3[length];
            int i2 = iArr[length];
            Objects.requireNonNull(bVar);
            iArr3[length] = i ^ i2;
        }
    }

    public final void c() {
        int length = this.c.length;
        do {
            this.b = length - 1;
            length = this.b;
            if (length < 0 || this.c[length] != 0) {
            }
            this.b = length - 1;
            length = this.b;
            return;
        } while (this.c[length] != 0);
    }

    public int d(int i) {
        if (i < 0 || i > this.b) {
            return 0;
        }
        return this.c[i];
    }

    public int e() {
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x003c
            boolean r1 = r8 instanceof s0.a.f.d.a.e
            if (r1 != 0) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            s0.a.f.d.a.e r8 = (s0.a.f.d.a.e) r8
            s0.a.f.d.a.b r1 = r7.a
            s0.a.f.d.a.b r2 = r8.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            int r1 = r7.b
            int r2 = r8.b
            if (r1 != r2) goto L_0x003c
            int[] r1 = r7.c
            int[] r8 = r8.c
            int r2 = b(r1)
            int r3 = b(r8)
            r4 = 1
            if (r2 == r3) goto L_0x002b
        L_0x0029:
            r8 = r0
            goto L_0x0039
        L_0x002b:
            r3 = r0
        L_0x002c:
            if (r3 > r2) goto L_0x0038
            r5 = r1[r3]
            r6 = r8[r3]
            if (r5 == r6) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0038:
            r8 = r4
        L_0x0039:
            if (r8 == 0) goto L_0x003c
            return r4
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.d.a.e.equals(java.lang.Object):boolean");
    }

    public byte[] f() {
        int i = 8;
        int i2 = 1;
        while (this.a.a > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.c.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public void g(int i) {
        if (this.a.c(i)) {
            this.c = i(this.c, i);
            c();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public e h(int i) {
        if (this.a.c(i)) {
            return new e(this.a, i(this.c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public int hashCode() {
        int i = this.a.b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public final int[] i(int[] iArr, int i) {
        int b2 = b(iArr);
        if (b2 == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[(b2 + 1)];
        while (b2 >= 0) {
            iArr3[b2] = this.a.d(iArr[b2], i);
            b2--;
        }
        return iArr3;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        StringBuilder P0 = a.P0(" Polynomial over ");
        P0.append(this.a.toString());
        P0.append(": \n");
        String sb2 = P0.toString();
        for (int i = 0; i < this.c.length; i++) {
            StringBuilder P02 = a.P0(sb2);
            b bVar = this.a;
            int i2 = this.c[i];
            String str2 = "";
            for (int i3 = 0; i3 < bVar.a; i3++) {
                if ((((byte) i2) & 1) == 0) {
                    sb = new StringBuilder();
                    str = "0";
                } else {
                    sb = new StringBuilder();
                    str = "1";
                }
                str2 = a.y0(sb, str, str2);
                i2 >>>= 1;
            }
            P02.append(str2);
            P02.append("Y^");
            P02.append(i);
            P02.append("+");
            sb2 = P02.toString();
        }
        return a.n0(sb2, ";");
    }

    public e(b bVar, int[] iArr) {
        int[] iArr2;
        this.a = bVar;
        int b2 = b(iArr);
        if (b2 == -1) {
            iArr2 = new int[1];
        } else {
            int i = b2 + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.c = iArr2;
        c();
    }
}
