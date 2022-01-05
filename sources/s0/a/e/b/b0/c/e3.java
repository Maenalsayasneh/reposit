package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class e3 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ f3 c;

    public e3(f3 f3Var, int i, long[] jArr) {
        this.c = f3Var;
        this.a = i;
        this.b = jArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        long[] jArr = new long[5];
        long[] jArr2 = new long[5];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = (long) (((i3 ^ i) - 1) >> 31);
            for (int i4 = 0; i4 < 5; i4++) {
                long j2 = jArr[i4];
                long[] jArr3 = this.b;
                jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 5) + i4] & j);
            }
            i2 += 10;
        }
        f3 f3Var = this.c;
        a3 a3Var = new a3(jArr);
        a3 a3Var2 = new a3(jArr2);
        g[] gVarArr = f3.j;
        Objects.requireNonNull(f3Var);
        return new g3(f3Var, a3Var, a3Var2, gVarArr);
    }

    public h c(int i) {
        long[] jArr = new long[5];
        long[] jArr2 = new long[5];
        int i2 = i * 5 * 2;
        for (int i3 = 0; i3 < 5; i3++) {
            long[] jArr3 = this.b;
            jArr[i3] = jArr3[i2 + i3];
            jArr2[i3] = jArr3[i2 + 5 + i3];
        }
        f3 f3Var = this.c;
        a3 a3Var = new a3(jArr);
        a3 a3Var2 = new a3(jArr2);
        g[] gVarArr = f3.j;
        Objects.requireNonNull(f3Var);
        return new g3(f3Var, a3Var, a3Var2, gVarArr);
    }
}
