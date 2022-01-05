package s0.a.b.b0;

import s0.a.b.o;
import s0.a.g.f;

public abstract class h implements o, f {
    public final byte[] a;
    public int b;
    public long c;

    public h() {
        this.a = new byte[4];
        this.b = 0;
    }

    public h(h hVar) {
        this.a = new byte[4];
        d(hVar);
    }

    public void d(h hVar) {
        byte[] bArr = hVar.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = hVar.b;
        this.c = hVar.c;
    }

    public void e() {
        long j = this.c << 3;
        byte b2 = Byte.MIN_VALUE;
        while (true) {
            update(b2);
            if (this.b != 0) {
                b2 = 0;
            } else {
                g(j);
                f();
                return;
            }
        }
    }

    public abstract void f();

    public abstract void g(long j);

    public int getByteLength() {
        return 64;
    }

    public abstract void h(byte[] bArr, int i);

    public void reset() {
        this.c = 0;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void update(byte b2) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b2;
        if (i2 == bArr.length) {
            h(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                int i6 = i5 + 1;
                this.b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    h(bArr2, 0);
                    this.b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            h(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += (long) max;
    }
}
