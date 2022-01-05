package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class d2 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ e2 c;

    public d2(e2 e2Var, int i, long[] jArr) {
        this.c = e2Var;
        this.a = i;
        this.b = jArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = (long) (((i3 ^ i) - 1) >> 31);
            for (int i4 = 0; i4 < 3; i4++) {
                long j2 = jArr[i4];
                long[] jArr3 = this.b;
                jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 3) + i4] & j);
            }
            i2 += 6;
        }
        e2 e2Var = this.c;
        w1 w1Var = new w1(jArr);
        w1 w1Var2 = new w1(jArr2);
        g[] gVarArr = e2.j;
        Objects.requireNonNull(e2Var);
        return new f2(e2Var, w1Var, w1Var2, gVarArr);
    }

    public h c(int i) {
        long[] jArr = new long[3];
        long[] jArr2 = new long[3];
        int i2 = i * 3 * 2;
        for (int i3 = 0; i3 < 3; i3++) {
            long[] jArr3 = this.b;
            jArr[i3] = jArr3[i2 + i3];
            jArr2[i3] = jArr3[i2 + 3 + i3];
        }
        e2 e2Var = this.c;
        w1 w1Var = new w1(jArr);
        w1 w1Var2 = new w1(jArr2);
        g[] gVarArr = e2.j;
        Objects.requireNonNull(e2Var);
        return new f2(e2Var, w1Var, w1Var2, gVarArr);
    }
}
