package s0.a.b.h0;

import java.util.Objects;
import s0.a.b.e0.g1;
import s0.a.b.e0.i1;
import s0.a.b.i;
import s0.a.b.s;

public final class r implements s {
    public final a a;
    public final int b;
    public final int[] c;
    public final int[] d;
    public i1 e;
    public int f;
    public int g;

    public static class a extends i1 {
        public a(int i) {
            super(i);
        }
    }

    public r(int i) {
        this.a = new a(i);
        this.b = i;
        int i2 = i / 32;
        this.c = new int[i2];
        this.d = new int[(i2 + 1)];
    }

    public final void a() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = this.a.m();
            i2++;
        }
        while (true) {
            int[] iArr2 = this.d;
            if (i < iArr2.length - 1) {
                iArr2[i] = this.a.m();
                i++;
            } else {
                this.f = iArr2.length - 1;
                this.g = 3;
                return;
            }
        }
    }

    public final void b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int[] iArr2 = this.d;
                int i4 = this.f + i2;
                int i5 = iArr2[i4 % iArr2.length];
                if (i != 0) {
                    int i6 = iArr2[(i4 + 1) % iArr2.length];
                    i5 = (i6 >>> (32 - i)) | (i5 << i);
                }
                iArr[i2] = i3 ^ i5;
                i2++;
            } else {
                return;
            }
        }
    }

    public int doFinal(byte[] bArr, int i) {
        int i2 = (this.g + 1) % 4;
        this.g = i2;
        if (i2 == 0) {
            this.f = (this.f + 1) % this.d.length;
        }
        b(i2 * 8);
        int i3 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 < iArr.length) {
                g1.k(iArr[i3], bArr, (i3 * 4) + i);
                i3++;
            } else {
                reset();
                return this.b / 8;
            }
        }
    }

    public String getAlgorithmName() {
        StringBuilder P0 = i0.d.a.a.a.P0("Zuc256Mac-");
        P0.append(this.b);
        return P0.toString();
    }

    public int getMacSize() {
        return this.b / 8;
    }

    public void init(i iVar) {
        this.a.init(true, iVar);
        a aVar = this.a;
        Objects.requireNonNull(aVar);
        this.e = new i1((i1) aVar);
        a();
    }

    public void reset() {
        i1 i1Var = this.e;
        if (i1Var != null) {
            this.a.c(i1Var);
        }
        a();
    }

    public void update(byte b2) {
        int i = (this.g + 1) % 4;
        this.g = i;
        if (i == 0) {
            this.d[this.f] = this.a.m();
            this.f = (this.f + 1) % this.d.length;
        }
        int i2 = this.g * 8;
        int i3 = 128;
        int i4 = 0;
        while (i3 > 0) {
            if ((b2 & i3) != 0) {
                b(i2 + i4);
            }
            i3 >>= 1;
            i4++;
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
