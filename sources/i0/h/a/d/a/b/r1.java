package i0.h.a.d.a.b;

import android.support.annotation.Nullable;
import java.util.Arrays;

public final class r1 {
    public byte[] a = new byte[4096];
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    @Nullable
    public String i;

    public r1() {
        c();
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int d2 = d(30, bArr, i2, i3);
        if (d2 == -1) {
            return -1;
        }
        if (this.c == -1) {
            long b2 = p1.b(this.a, 0);
            this.c = b2;
            if (b2 == 67324752) {
                this.h = false;
                this.d = p1.b(this.a, 18);
                this.g = p1.c(this.a, 8);
                this.e = p1.c(this.a, 26);
                int c2 = this.e + 30 + p1.c(this.a, 28);
                this.f = c2;
                int length = this.a.length;
                if (length < c2) {
                    do {
                        length += length;
                    } while (length < c2);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.h = true;
            }
        }
        int d3 = d(this.f, bArr, i2 + d2, i3 - d2);
        if (d3 == -1) {
            return -1;
        }
        int i4 = d2 + d3;
        if (!this.h && this.i == null) {
            this.i = new String(this.a, 30, this.e);
        }
        return i4;
    }

    public final m2 b() {
        int i2 = this.b;
        int i3 = this.f;
        if (i2 < i3) {
            return new m2(this.i, this.d, this.g, true, this.h, Arrays.copyOf(this.a, i2));
        }
        m2 m2Var = new m2(this.i, this.d, this.g, false, this.h, Arrays.copyOf(this.a, i3));
        c();
        return m2Var;
    }

    public final void c() {
        this.b = 0;
        this.e = -1;
        this.c = -1;
        this.h = false;
        this.f = 30;
        this.d = -1;
        this.g = -1;
        this.i = null;
    }

    public final int d(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.b;
        if (i5 >= i2) {
            return 0;
        }
        int min = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.a, this.b, min);
        int i6 = this.b + min;
        this.b = i6;
        if (i6 < i2) {
            return -1;
        }
        return min;
    }
}
