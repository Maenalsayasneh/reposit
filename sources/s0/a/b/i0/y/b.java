package s0.a.b.i0.y;

import java.lang.reflect.Array;
import m0.r.t.a.r.m.a1.a;

public class b implements a {
    public long[][] a;

    public void a(long[] jArr) {
        long[] jArr2 = jArr;
        long[] jArr3 = new long[8];
        a.O0(this.a[((int) (jArr2[7] >>> 56)) & 255], jArr3);
        for (int i = 62; i >= 0; i--) {
            long j = jArr3[0];
            long j2 = jArr3[1];
            long j3 = jArr3[2];
            long j4 = jArr3[3];
            long j5 = jArr3[4];
            long j6 = jArr3[5];
            long j7 = jArr3[6];
            long j8 = jArr3[7];
            long j9 = j8 >>> 56;
            jArr3[0] = ((((j << 8) ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 8);
            jArr3[1] = (j2 << 8) | (j >>> 56);
            jArr3[2] = (j3 << 8) | (j2 >>> 56);
            jArr3[3] = (j4 << 8) | (j3 >>> 56);
            jArr3[4] = (j5 << 8) | (j4 >>> 56);
            jArr3[5] = (j6 << 8) | (j5 >>> 56);
            jArr3[6] = (j7 << 8) | (j6 >>> 56);
            jArr3[7] = (j8 << 8) | (j7 >>> 56);
            a.K(this.a[((int) (jArr2[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr3, jArr3);
        }
        a.O0(jArr3, jArr2);
    }

    public void b(long[] jArr) {
        long[] jArr2 = jArr;
        long[][] jArr3 = this.a;
        if (jArr3 == null) {
            this.a = (long[][]) Array.newInstance(long.class, new int[]{256, 8});
        } else {
            long[] jArr4 = jArr3[1];
            if ((((((((((jArr2[0] ^ jArr4[0]) | 0) | (jArr2[1] ^ jArr4[1])) | (jArr2[2] ^ jArr4[2])) | (jArr2[3] ^ jArr4[3])) | (jArr2[4] ^ jArr4[4])) | (jArr2[5] ^ jArr4[5])) | (jArr2[6] ^ jArr4[6])) | (jArr4[7] ^ jArr2[7])) == 0) {
                return;
            }
        }
        a.O0(jArr2, this.a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr5 = this.a;
            long[] jArr6 = jArr5[i >> 1];
            long[] jArr7 = jArr5[i];
            long j = jArr6[0];
            long j2 = jArr6[1];
            long j3 = jArr6[2];
            long j4 = jArr6[3];
            long j5 = jArr6[4];
            long j6 = jArr6[5];
            long j7 = jArr6[6];
            long j8 = jArr6[7];
            jArr7[0] = (j << 1) ^ ((j8 >> 63) & 293);
            jArr7[1] = (j2 << 1) | (j >>> 63);
            jArr7[2] = (j3 << 1) | (j2 >>> 63);
            jArr7[3] = (j4 << 1) | (j3 >>> 63);
            jArr7[4] = (j5 << 1) | (j4 >>> 63);
            jArr7[5] = (j6 << 1) | (j5 >>> 63);
            jArr7[6] = (j7 << 1) | (j6 >>> 63);
            jArr7[7] = (j8 << 1) | (j7 >>> 63);
            a.K(jArr5[i], jArr5[1], jArr5[i + 1]);
        }
    }
}
