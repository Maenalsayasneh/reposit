package s0.a.b.a0;

import java.util.Objects;
import s0.a.b.k0.p1;
import s0.a.b.k0.q1;
import s0.a.b.u;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.d0.a;

public final class i implements u {
    public p1 a;

    public void a(s0.a.b.i iVar, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        p1 p1Var = this.a;
        Objects.requireNonNull(p1Var);
        byte[] bArr3 = new byte[32];
        System.arraycopy(((q1) iVar).d, 0, bArr3, 0, 32);
        byte[] bArr4 = p1Var.d;
        int[] iArr = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = (i3 * 4) + 0;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            iArr[i3] = (bArr4[i6 + 1] << 24) | (bArr4[i4] & 255) | ((bArr4[i5] & 255) << 8) | ((bArr4[i6] & 255) << 16);
        }
        iArr[0] = iArr[0] & -8;
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = iArr[7] | 1073741824;
        int[] iArr2 = new int[10];
        a.g(bArr3, 0, iArr2);
        int[] iArr3 = new int[10];
        a.e(iArr2, 0, iArr3, 0);
        int[] iArr4 = new int[10];
        iArr4[0] = 1;
        int[] iArr5 = new int[10];
        iArr5[0] = 1;
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int i7 = 254;
        int i8 = 1;
        while (true) {
            a.b(iArr5, iArr6, iArr7, iArr5);
            a.b(iArr3, iArr4, iArr6, iArr3);
            a.s(iArr7, iArr3, iArr7);
            a.s(iArr5, iArr6, iArr5);
            a.w(iArr6, iArr6);
            a.w(iArr3, iArr3);
            a.x(iArr6, iArr3, iArr8);
            a.r(iArr8, 121666, iArr4);
            a.a(iArr4, iArr3, iArr4);
            a.s(iArr4, iArr8, iArr4);
            a.s(iArr3, iArr6, iArr3);
            a.b(iArr7, iArr5, iArr5, iArr6);
            a.w(iArr5, iArr5);
            a.w(iArr6, iArr6);
            a.s(iArr6, iArr2, iArr6);
            i7--;
            int i9 = (iArr[i7 >>> 5] >>> (i7 & 31)) & 1;
            int i10 = i8 ^ i9;
            a.f(i10, iArr3, iArr5);
            a.f(i10, iArr4, iArr6);
            if (i7 < 3) {
                break;
            }
            i8 = i9;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            int[] iArr9 = new int[10];
            int[] iArr10 = new int[10];
            a.b(iArr3, iArr4, iArr9, iArr10);
            a.w(iArr9, iArr9);
            a.w(iArr10, iArr10);
            a.s(iArr9, iArr10, iArr3);
            a.x(iArr9, iArr10, iArr9);
            a.r(iArr9, 121666, iArr4);
            a.a(iArr4, iArr10, iArr4);
            a.s(iArr4, iArr9, iArr4);
        }
        a.o(iArr4, iArr4);
        a.s(iArr3, iArr4, iArr3);
        a.t(iArr3);
        a.l(iArr3, 0, bArr2, i2);
        a.l(iArr3, 5, bArr2, i2 + 16);
        if (!(!h3.x(bArr2, i2, 32))) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }

    public int b() {
        return 32;
    }

    public void init(s0.a.b.i iVar) {
        this.a = (p1) iVar;
    }
}
