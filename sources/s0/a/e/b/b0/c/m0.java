package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class m0 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ n0 c;

    public m0(n0 n0Var, int i, int[] iArr) {
        this.c = n0Var;
        this.a = i;
        this.b = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = iArr[i5];
                int[] iArr3 = this.b;
                iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 8) + i5] & i4);
            }
            i2 += 16;
        }
        n0 n0Var = this.c;
        p0 p0Var = new p0(iArr);
        p0 p0Var2 = new p0(iArr2);
        g[] gVarArr = n0.j;
        Objects.requireNonNull(n0Var);
        return new q0(n0Var, p0Var, p0Var2, gVarArr);
    }

    public h c(int i) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i2 = i * 8 * 2;
        for (int i3 = 0; i3 < 8; i3++) {
            int[] iArr3 = this.b;
            iArr[i3] = iArr3[i2 + i3];
            iArr2[i3] = iArr3[i2 + 8 + i3];
        }
        n0 n0Var = this.c;
        p0 p0Var = new p0(iArr);
        p0 p0Var2 = new p0(iArr2);
        g[] gVarArr = n0.j;
        Objects.requireNonNull(n0Var);
        return new q0(n0Var, p0Var, p0Var2, gVarArr);
    }
}
