package s0.a.b.k0;

import java.security.SecureRandom;
import s0.a.e.b.e0.b;

public final class s1 extends b {
    public final byte[] d;

    public s1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.d = bArr;
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public s1(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 56);
    }

    public t1 a() {
        byte[] bArr = new byte[56];
        byte[] bArr2 = this.d;
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        byte[] bArr3 = b.a;
        byte[] bArr4 = new byte[57];
        b.s(bArr2, 0, bArr4);
        b.C0304b bVar = new b.C0304b((b.a) null);
        b.u(bArr4, bVar);
        int[] iArr3 = bVar.a;
        int[] iArr4 = bVar.b;
        int[] iArr5 = bVar.c;
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        s0.a.e.b.d0.b.s(iArr3, iArr7);
        s0.a.e.b.d0.b.s(iArr4, iArr8);
        s0.a.e.b.d0.b.s(iArr5, iArr9);
        s0.a.e.b.d0.b.o(iArr7, iArr8, iArr6);
        s0.a.e.b.d0.b.a(iArr7, iArr8, iArr7);
        s0.a.e.b.d0.b.o(iArr7, iArr9, iArr7);
        s0.a.e.b.d0.b.s(iArr9, iArr9);
        s0.a.e.b.d0.b.n(iArr6, 39081, iArr6);
        s0.a.e.b.d0.b.t(iArr6, iArr9, iArr6);
        s0.a.e.b.d0.b.a(iArr6, iArr7, iArr6);
        s0.a.e.b.d0.b.r(iArr6, 1);
        s0.a.e.b.d0.b.r(iArr6, -1);
        if (s0.a.e.b.d0.b.m(iArr6) != 0) {
            s0.a.e.b.d0.b.d(bVar.a, 0, iArr, 0);
            s0.a.e.b.d0.b.d(bVar.b, 0, iArr2, 0);
            s0.a.e.b.d0.b.l(iArr, iArr);
            s0.a.e.b.d0.b.o(iArr, iArr2, iArr);
            s0.a.e.b.d0.b.s(iArr, iArr);
            s0.a.e.b.d0.b.r(iArr, 1);
            s0.a.e.b.d0.b.r(iArr, -1);
            s0.a.e.b.d0.b.i(iArr, bArr, 0);
            return new t1(bArr, 0);
        }
        throw new IllegalStateException();
    }
}
