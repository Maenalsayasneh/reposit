package s0.a.b.i0.y;

import java.lang.reflect.Array;
import m0.r.t.a.r.m.a1.a;

public class c implements a {
    public long[][] a;

    public void a(long[] jArr) {
        long[] jArr2 = new long[2];
        a.M0(this.a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i = 14; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = j2 >>> 56;
            jArr2[0] = (j3 << 7) ^ ((((j << 8) ^ j3) ^ (j3 << 1)) ^ (j3 << 2));
            jArr2[1] = (j2 << 8) | (j >>> 56);
            a.I(this.a[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        jArr[0] = jArr2[0];
        jArr[1] = jArr2[1];
    }

    public void b(long[] jArr) {
        long[][] jArr2 = this.a;
        if (jArr2 == null) {
            this.a = (long[][]) Array.newInstance(long.class, new int[]{256, 2});
        } else {
            long[] jArr3 = jArr2[1];
            if ((((jArr[0] ^ jArr3[0]) | 0) | (jArr[1] ^ jArr3[1])) == 0) {
                return;
            }
        }
        long[] jArr4 = this.a[1];
        jArr4[0] = jArr[0];
        jArr4[1] = jArr[1];
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr5 = this.a;
            long[] jArr6 = jArr5[i >> 1];
            long[] jArr7 = jArr5[i];
            long j = jArr6[0];
            long j2 = jArr6[1];
            jArr7[0] = ((j2 >> 63) & 135) ^ (j << 1);
            jArr7[1] = (j >>> 63) | (j2 << 1);
            a.I(jArr5[i], jArr5[1], jArr5[i + 1]);
        }
    }
}
