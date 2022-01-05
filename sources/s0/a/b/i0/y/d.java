package s0.a.b.i0.y;

import java.lang.reflect.Array;
import m0.r.t.a.r.m.a1.a;

public class d implements a {
    public long[][] a;

    public void a(long[] jArr) {
        long[] jArr2 = jArr;
        long[] jArr3 = new long[4];
        a.N0(this.a[((int) (jArr2[3] >>> 56)) & 255], jArr3);
        for (int i = 30; i >= 0; i--) {
            long j = jArr3[0];
            long j2 = jArr3[1];
            long j3 = jArr3[2];
            long j4 = jArr3[3];
            long j5 = j4 >>> 56;
            jArr3[0] = ((((j << 8) ^ j5) ^ (j5 << 2)) ^ (j5 << 5)) ^ (j5 << 10);
            jArr3[1] = (j >>> 56) | (j2 << 8);
            jArr3[2] = (j3 << 8) | (j2 >>> 56);
            jArr3[3] = (j4 << 8) | (j3 >>> 56);
            a.J(this.a[((int) (jArr2[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr3, jArr3);
        }
        a.N0(jArr3, jArr2);
    }

    public void b(long[] jArr) {
        long[] jArr2 = jArr;
        long[][] jArr3 = this.a;
        if (jArr3 == null) {
            this.a = (long[][]) Array.newInstance(long.class, new int[]{256, 4});
        } else {
            long[] jArr4 = jArr3[1];
            if ((((((jArr2[0] ^ jArr4[0]) | 0) | (jArr2[1] ^ jArr4[1])) | (jArr2[2] ^ jArr4[2])) | (jArr2[3] ^ jArr4[3])) == 0) {
                return;
            }
        }
        a.N0(jArr2, this.a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr5 = this.a;
            long[] jArr6 = jArr5[i >> 1];
            long[] jArr7 = jArr5[i];
            long j = jArr6[0];
            long j2 = jArr6[1];
            long j3 = jArr6[2];
            long j4 = jArr6[3];
            jArr7[0] = ((j4 >> 63) & 1061) ^ (j << 1);
            jArr7[1] = (j >>> 63) | (j2 << 1);
            jArr7[2] = (j3 << 1) | (j2 >>> 63);
            jArr7[3] = (j4 << 1) | (j3 >>> 63);
            a.J(jArr5[i], jArr5[1], jArr5[i + 1]);
        }
    }
}
