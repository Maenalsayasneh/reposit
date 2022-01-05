package s0.a.b.h0;

import java.util.Objects;
import s0.a.b.e0.g1;
import s0.a.b.i;
import s0.a.b.s;

public final class q implements s {
    public final b a = new b((a) null);
    public int b;
    public final int[] c = new int[2];
    public g1 d;
    public int e;
    public int f;

    public static class b extends g1 {
        public b(a aVar) {
        }
    }

    public final int a(int i) {
        int[] iArr = this.c;
        int i2 = this.e;
        int i3 = iArr[i2];
        if (i == 0) {
            return i3;
        }
        int i4 = iArr[(i2 + 1) % iArr.length];
        return (i4 >>> (32 - i)) | (i3 << i);
    }

    public final void b() {
        int i = 0;
        this.b = 0;
        while (true) {
            int[] iArr = this.c;
            if (i < iArr.length - 1) {
                iArr[i] = this.a.m();
                i++;
            } else {
                this.e = iArr.length - 1;
                this.f = 3;
                return;
            }
        }
    }

    public final void c() {
        int i = (this.f + 1) % 4;
        this.f = i;
        if (i == 0) {
            this.c[this.e] = this.a.m();
            this.e = (this.e + 1) % this.c.length;
        }
    }

    public int doFinal(byte[] bArr, int i) {
        int i2;
        c();
        int a2 = this.b ^ a(this.f * 8);
        this.b = a2;
        if (this.f != 0) {
            i2 = this.a.m();
        } else {
            int[] iArr = this.c;
            int length = (this.e + 1) % iArr.length;
            this.e = length;
            i2 = iArr[length];
        }
        int i3 = a2 ^ i2;
        this.b = i3;
        g1.k(i3, bArr, i);
        reset();
        return 4;
    }

    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    public int getMacSize() {
        return 4;
    }

    public void init(i iVar) {
        this.a.init(true, iVar);
        b bVar = this.a;
        Objects.requireNonNull(bVar);
        this.d = new g1(bVar);
        b();
    }

    public void reset() {
        g1 g1Var = this.d;
        if (g1Var != null) {
            this.a.c(g1Var);
        }
        b();
    }

    public void update(byte b2) {
        c();
        int i = this.f * 8;
        int i2 = 128;
        int i3 = 0;
        while (i2 > 0) {
            if ((b2 & i2) != 0) {
                this.b = a(i + i3) ^ this.b;
            }
            i2 >>= 1;
            i3++;
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
