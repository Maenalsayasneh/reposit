package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class k1 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ l1 c;

    public k1(l1 l1Var, int i, long[] jArr) {
        this.c = l1Var;
        this.a = i;
        this.b = jArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            long j = (long) (((i3 ^ i) - 1) >> 31);
            for (int i4 = 0; i4 < 2; i4++) {
                long j2 = jArr[i4];
                long[] jArr3 = this.b;
                jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 2) + i4] & j);
            }
            i2 += 4;
        }
        l1 l1Var = this.c;
        g1 g1Var = new g1(jArr);
        g1 g1Var2 = new g1(jArr2);
        g[] gVarArr = l1.j;
        Objects.requireNonNull(l1Var);
        return new m1(l1Var, g1Var, g1Var2, gVarArr);
    }

    public h c(int i) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i2 = i * 2 * 2;
        for (int i3 = 0; i3 < 2; i3++) {
            long[] jArr3 = this.b;
            jArr[i3] = jArr3[i2 + i3];
            jArr2[i3] = jArr3[i2 + 2 + i3];
        }
        l1 l1Var = this.c;
        g1 g1Var = new g1(jArr);
        g1 g1Var2 = new g1(jArr2);
        g[] gVarArr = l1.j;
        Objects.requireNonNull(l1Var);
        return new m1(l1Var, g1Var, g1Var2, gVarArr);
    }
}
