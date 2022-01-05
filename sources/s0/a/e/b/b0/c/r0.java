package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class r0 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ s0 c;

    public r0(s0 s0Var, int i, int[] iArr) {
        this.c = s0Var;
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
        s0 s0Var = this.c;
        u0 u0Var = new u0(iArr);
        u0 u0Var2 = new u0(iArr2);
        g[] gVarArr = s0.j;
        Objects.requireNonNull(s0Var);
        return new v0(s0Var, u0Var, u0Var2, gVarArr);
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
        s0 s0Var = this.c;
        u0 u0Var = new u0(iArr);
        u0 u0Var2 = new u0(iArr2);
        g[] gVarArr = s0.j;
        Objects.requireNonNull(s0Var);
        return new v0(s0Var, u0Var, u0Var2, gVarArr);
    }
}
