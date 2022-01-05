package s0.a.b.a0;

import java.util.Objects;
import s0.a.b.i;
import s0.a.b.k0.s1;
import s0.a.b.k0.t1;
import s0.a.b.u;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.d0.b;

public final class j implements u {
    public s1 a;

    public void a(i iVar, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        s1 s1Var = this.a;
        Objects.requireNonNull(s1Var);
        byte[] bArr3 = new byte[56];
        System.arraycopy(((t1) iVar).d, 0, bArr3, 0, 56);
        byte[] bArr4 = s1Var.d;
        int[] iArr = new int[14];
        for (int i3 = 0; i3 < 14; i3++) {
            int i4 = (i3 * 4) + 0;
            int i5 = i4 + 1;
            byte b = (bArr4[i4] & 255) | ((bArr4[i5] & 255) << 8);
            int i6 = i5 + 1;
            iArr[i3] = ((bArr4[i6] & 255) << 16) | b | (bArr4[i6 + 1] << 24);
        }
        iArr[0] = iArr[0] & -4;
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
        int[] iArr2 = new int[16];
        b.f(bArr3, 0, iArr2);
        int[] iArr3 = new int[16];
        b.d(iArr2, 0, iArr3, 0);
        int[] iArr4 = new int[16];
        iArr4[0] = 1;
        int[] iArr5 = new int[16];
        iArr5[0] = 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int i7 = 447;
        int i8 = 1;
        while (true) {
            b.a(iArr5, iArr6, iArr7);
            b.t(iArr5, iArr6, iArr5);
            b.a(iArr3, iArr4, iArr6);
            b.t(iArr3, iArr4, iArr3);
            b.o(iArr7, iArr3, iArr7);
            b.o(iArr5, iArr6, iArr5);
            b.s(iArr6, iArr6);
            b.s(iArr3, iArr3);
            b.t(iArr6, iArr3, iArr8);
            b.n(iArr8, 39082, iArr4);
            b.a(iArr4, iArr3, iArr4);
            b.o(iArr4, iArr8, iArr4);
            b.o(iArr3, iArr6, iArr3);
            b.t(iArr7, iArr5, iArr6);
            b.a(iArr7, iArr5, iArr5);
            b.s(iArr5, iArr5);
            b.s(iArr6, iArr6);
            b.o(iArr6, iArr2, iArr6);
            i7--;
            int i9 = (iArr[i7 >>> 5] >>> (i7 & 31)) & 1;
            int i10 = i8 ^ i9;
            b.e(i10, iArr3, iArr5);
            b.e(i10, iArr4, iArr6);
            if (i7 < 2) {
                break;
            }
            i8 = i9;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            int[] iArr9 = new int[16];
            int[] iArr10 = new int[16];
            b.a(iArr3, iArr4, iArr9);
            b.t(iArr3, iArr4, iArr10);
            b.s(iArr9, iArr9);
            b.s(iArr10, iArr10);
            b.o(iArr9, iArr10, iArr3);
            b.t(iArr9, iArr10, iArr9);
            b.n(iArr9, 39082, iArr4);
            b.a(iArr4, iArr10, iArr4);
            b.o(iArr4, iArr9, iArr4);
        }
        b.l(iArr4, iArr4);
        b.o(iArr3, iArr4, iArr3);
        b.r(iArr3, 1);
        b.r(iArr3, -1);
        b.i(iArr3, bArr2, i2);
        if (!(!h3.x(bArr2, i2, 56))) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }

    public int b() {
        return 56;
    }

    public void init(i iVar) {
        this.a = (s1) iVar;
    }
}
