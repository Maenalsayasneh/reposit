package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class w2 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ x2 c;

    public w2(x2 x2Var, int i, long[] jArr) {
        this.c = x2Var;
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
        x2 x2Var = this.c;
        v2 v2Var = new v2(jArr);
        v2 v2Var2 = new v2(jArr2);
        g[] gVarArr = x2.j;
        Objects.requireNonNull(x2Var);
        return new y2(x2Var, v2Var, v2Var2, gVarArr);
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
        x2 x2Var = this.c;
        v2 v2Var = new v2(jArr);
        v2 v2Var2 = new v2(jArr2);
        g[] gVarArr = x2.j;
        Objects.requireNonNull(x2Var);
        return new y2(x2Var, v2Var, v2Var2, gVarArr);
    }
}
