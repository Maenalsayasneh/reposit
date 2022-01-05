package s0.a.b.k0;

import java.security.SecureRandom;
import s0.a.e.b.e0.a;

public final class p1 extends b {
    public final byte[] d;

    public p1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.d = bArr;
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        bArr[31] = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = (byte) (bArr[31] | 64);
    }

    public p1(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public q1 a() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = this.d;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        byte[] bArr3 = a.a;
        byte[] bArr4 = new byte[32];
        a.s(bArr2, 0, bArr4);
        a.b bVar = new a.b((a.C0303a) null);
        a.u(bArr4, bVar);
        int[] iArr3 = bVar.a;
        int[] iArr4 = bVar.b;
        int[] iArr5 = bVar.c;
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        s0.a.e.b.d0.a.w(iArr3, iArr7);
        s0.a.e.b.d0.a.w(iArr4, iArr8);
        s0.a.e.b.d0.a.w(iArr5, iArr9);
        s0.a.e.b.d0.a.s(iArr7, iArr8, iArr6);
        s0.a.e.b.d0.a.x(iArr8, iArr7, iArr8);
        s0.a.e.b.d0.a.s(iArr8, iArr9, iArr8);
        s0.a.e.b.d0.a.w(iArr9, iArr9);
        s0.a.e.b.d0.a.s(iArr6, a.f, iArr6);
        s0.a.e.b.d0.a.a(iArr6, iArr9, iArr6);
        s0.a.e.b.d0.a.x(iArr6, iArr8, iArr6);
        s0.a.e.b.d0.a.t(iArr6);
        if (s0.a.e.b.d0.a.p(iArr6) != 0) {
            s0.a.e.b.d0.a.e(bVar.b, 0, iArr, 0);
            s0.a.e.b.d0.a.e(bVar.c, 0, iArr2, 0);
            s0.a.e.b.d0.a.b(iArr2, iArr, iArr, iArr2);
            s0.a.e.b.d0.a.o(iArr2, iArr2);
            s0.a.e.b.d0.a.s(iArr, iArr2, iArr);
            s0.a.e.b.d0.a.t(iArr);
            s0.a.e.b.d0.a.l(iArr, 0, bArr, 0);
            s0.a.e.b.d0.a.l(iArr, 5, bArr, 16);
            return new q1(bArr, 0);
        }
        throw new IllegalStateException();
    }
}
