package s0.a.b.h0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class n implements s {
    public final int a;
    public final int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;

    public n() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.a = 2;
        this.b = 4;
    }

    public n(int i2, int i3) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.a = i2;
        this.b = i3;
    }

    public static long d(long j2, int i2) {
        return (j2 >>> (-i2)) | (j2 << i2);
    }

    public void a(int i2) {
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            long j6 = j2 + j3;
            long j7 = j4 + j5;
            long d2 = d(j3, 13) ^ j6;
            long d3 = d(j5, 16) ^ j7;
            long j8 = j7 + d2;
            j2 = d(j6, 32) + d3;
            j3 = d(d2, 17) ^ j8;
            j5 = d(d3, 21) ^ j2;
            j4 = d(j8, 32);
        }
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
    }

    public long b() throws DataLengthException, IllegalStateException {
        long j2 = this.i;
        int i2 = this.j;
        long j3 = j2 >>> ((7 - i2) << 3);
        this.i = j3;
        long j4 = j3 >>> 8;
        this.i = j4;
        this.i = j4 | ((((long) ((this.k << 3) + i2)) & 255) << 56);
        c();
        this.g ^= 255;
        a(this.b);
        long j5 = ((this.e ^ this.f) ^ this.g) ^ this.h;
        reset();
        return j5;
    }

    public void c() {
        this.k++;
        this.h ^= this.i;
        a(this.a);
        this.e ^= this.i;
    }

    public int doFinal(byte[] bArr, int i2) throws DataLengthException, IllegalStateException {
        h3.m2(b(), bArr, i2);
        return 8;
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("SipHash-");
        P0.append(this.a);
        P0.append("-");
        P0.append(this.b);
        return P0.toString();
    }

    public int getMacSize() {
        return 8;
    }

    public void init(i iVar) throws IllegalArgumentException {
        if (iVar instanceof y0) {
            byte[] bArr = ((y0) iVar).c;
            if (bArr.length == 16) {
                this.c = h3.i2(bArr, 0);
                this.d = h3.i2(bArr, 8);
                reset();
                return;
            }
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
    }

    public void reset() {
        long j2 = this.c;
        this.e = 8317987319222330741L ^ j2;
        long j3 = this.d;
        this.f = 7237128888997146477L ^ j3;
        this.g = j2 ^ 7816392313619706465L;
        this.h = 8387220255154660723L ^ j3;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public void update(byte b2) throws IllegalStateException {
        long j2 = this.i >>> 8;
        this.i = j2;
        this.i = j2 | ((((long) b2) & 255) << 56);
        int i2 = this.j + 1;
        this.j = i2;
        if (i2 == 8) {
            c();
            this.j = 0;
        }
    }

    public void update(byte[] bArr, int i2, int i3) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = bArr;
        int i4 = i3;
        int i5 = i4 & -8;
        int i6 = this.j;
        int i7 = 0;
        if (i6 == 0) {
            while (i7 < i5) {
                this.i = h3.i2(bArr2, i2 + i7);
                c();
                i7 += 8;
            }
            while (i7 < i4) {
                long j2 = this.i >>> 8;
                this.i = j2;
                this.i = j2 | ((((long) bArr2[i2 + i7]) & 255) << 56);
                i7++;
            }
            this.j = i4 - i5;
            return;
        }
        int i8 = i6 << 3;
        int i9 = 0;
        while (i9 < i5) {
            long i22 = h3.i2(bArr2, i2 + i9);
            this.i = (this.i >>> (-i8)) | (i22 << i8);
            c();
            this.i = i22;
            i9 += 8;
        }
        while (i9 < i4) {
            long j3 = this.i >>> 8;
            this.i = j3;
            this.i = j3 | ((((long) bArr2[i2 + i9]) & 255) << 56);
            int i10 = this.j + 1;
            this.j = i10;
            if (i10 == 8) {
                c();
                this.j = 0;
            }
            i9++;
        }
    }
}
