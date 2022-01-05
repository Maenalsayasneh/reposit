package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class u3 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ v3 c;

    public u3(v3 v3Var, int i, long[] jArr) {
        this.c = v3Var;
        this.a = i;
        this.b = jArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = (long) (((i3 ^ i) - 1) >> 31);
            for (int i4 = 0; i4 < 9; i4++) {
                long j2 = jArr[i4];
                long[] jArr3 = this.b;
                jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 9) + i4] & j);
            }
            i2 += 18;
        }
        v3 v3Var = this.c;
        q3 q3Var = new q3(jArr);
        q3 q3Var2 = new q3(jArr2);
        g[] gVarArr = v3.j;
        Objects.requireNonNull(v3Var);
        return new w3(v3Var, q3Var, q3Var2, gVarArr);
    }

    public h c(int i) {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        int i2 = i * 9 * 2;
        for (int i3 = 0; i3 < 9; i3++) {
            long[] jArr3 = this.b;
            jArr[i3] = jArr3[i2 + i3];
            jArr2[i3] = jArr3[i2 + 9 + i3];
        }
        v3 v3Var = this.c;
        q3 q3Var = new q3(jArr);
        q3 q3Var2 = new q3(jArr2);
        g[] gVarArr = v3.j;
        Objects.requireNonNull(v3Var);
        return new w3(v3Var, q3Var, q3Var2, gVarArr);
    }
}
