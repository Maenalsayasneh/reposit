package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class s1 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ t1 c;

    public s1(t1 t1Var, int i, long[] jArr) {
        this.c = t1Var;
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
        t1 t1Var = this.c;
        o1 o1Var = new o1(jArr);
        o1 o1Var2 = new o1(jArr2);
        g[] gVarArr = t1.j;
        Objects.requireNonNull(t1Var);
        return new u1(t1Var, o1Var, o1Var2, gVarArr);
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
        t1 t1Var = this.c;
        o1 o1Var = new o1(jArr);
        o1 o1Var2 = new o1(jArr2);
        g[] gVarArr = t1.j;
        Objects.requireNonNull(t1Var);
        return new u1(t1Var, o1Var, o1Var2, gVarArr);
    }
}
