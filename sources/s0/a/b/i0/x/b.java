package s0.a.b.i0.x;

import s0.a.e.b.b0.c.h3;

public class b {
    public byte[] a;
    public long[][] b;

    public void a(byte[] bArr) {
        byte[] bArr2 = bArr;
        long[] jArr = this.b[bArr2[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.b[bArr2[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        h3.l2(j, bArr2, 0);
        h3.l2(j2, bArr2, 8);
    }
}
