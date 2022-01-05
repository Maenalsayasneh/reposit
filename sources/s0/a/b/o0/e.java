package s0.a.b.o0;

import java.math.BigInteger;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class e {
    public final byte[] a;
    public int b = 0;

    public e(byte[] bArr) {
        this.a = bArr;
    }

    public e(byte[] bArr, byte[] bArr2) {
        int i = 0;
        this.a = bArr2;
        while (i != bArr.length) {
            if (bArr[i] == bArr2[i]) {
                i++;
            } else {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.b += bArr.length;
    }

    public boolean a() {
        return this.b < this.a.length;
    }

    public BigInteger b() {
        int e = e();
        int i = this.b;
        int i2 = i + e;
        byte[] bArr = this.a;
        if (i2 <= bArr.length) {
            int i3 = e + i;
            this.b = i3;
            return new BigInteger(1, h3.q0(bArr, i, i3));
        }
        throw new IllegalArgumentException("not enough data for big num");
    }

    public byte[] c() {
        int e = e();
        if (e == 0) {
            return new byte[0];
        }
        int i = this.b;
        byte[] bArr = this.a;
        if (i <= bArr.length - e) {
            int i2 = e + i;
            this.b = i2;
            return h3.q0(bArr, i, i2);
        }
        throw new IllegalArgumentException("not enough data for block");
    }

    public String d() {
        return j.a(c());
    }

    public int e() {
        int i = this.b;
        byte[] bArr = this.a;
        if (i <= bArr.length - 4) {
            int i2 = i + 1;
            this.b = i2;
            int i3 = i2 + 1;
            this.b = i3;
            byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
            int i4 = i3 + 1;
            this.b = i4;
            byte b3 = b2 | ((bArr[i3] & 255) << 8);
            this.b = i4 + 1;
            return b3 | (bArr[i4] & 255);
        }
        throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
    }

    public void f() {
        int e = e();
        int i = this.b;
        if (i <= this.a.length - e) {
            this.b = i + e;
            return;
        }
        throw new IllegalArgumentException("not enough data for block");
    }
}
