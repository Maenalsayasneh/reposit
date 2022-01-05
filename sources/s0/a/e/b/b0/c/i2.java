package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class i2 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ j2 c;

    public i2(j2 j2Var, int i, long[] jArr) {
        this.c = j2Var;
        this.a = i;
        this.b = jArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = (long) (((i3 ^ i) - 1) >> 31);
            for (int i4 = 0; i4 < 4; i4++) {
                long j2 = jArr[i4];
                long[] jArr3 = this.b;
                jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 4) + i4] & j);
            }
            i2 += 8;
        }
        j2 j2Var = this.c;
        h2 h2Var = new h2(jArr);
        h2 h2Var2 = new h2(jArr2);
        g[] gVarArr = j2.j;
        Objects.requireNonNull(j2Var);
        return new k2(j2Var, h2Var, h2Var2, gVarArr);
    }

    public h c(int i) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[4];
        int i2 = i * 4 * 2;
        for (int i3 = 0; i3 < 4; i3++) {
            long[] jArr3 = this.b;
            jArr[i3] = jArr3[i2 + i3];
            jArr2[i3] = jArr3[i2 + 4 + i3];
        }
        j2 j2Var = this.c;
        h2 h2Var = new h2(jArr);
        h2 h2Var2 = new h2(jArr2);
        g[] gVarArr = j2.j;
        Objects.requireNonNull(j2Var);
        return new k2(j2Var, h2Var, h2Var2, gVarArr);
    }
}
