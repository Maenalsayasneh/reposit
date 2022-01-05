package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class w0 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ x0 c;

    public w0(x0 x0Var, int i, int[] iArr) {
        this.c = x0Var;
        this.a = i;
        this.b = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 12; i5++) {
                int i6 = iArr[i5];
                int[] iArr3 = this.b;
                iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 12) + i5] & i4);
            }
            i2 += 24;
        }
        x0 x0Var = this.c;
        z0 z0Var = new z0(iArr);
        z0 z0Var2 = new z0(iArr2);
        g[] gVarArr = x0.j;
        Objects.requireNonNull(x0Var);
        return new a1(x0Var, z0Var, z0Var2, gVarArr);
    }

    public h c(int i) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int i2 = i * 12 * 2;
        for (int i3 = 0; i3 < 12; i3++) {
            int[] iArr3 = this.b;
            iArr[i3] = iArr3[i2 + i3];
            iArr2[i3] = iArr3[i2 + 12 + i3];
        }
        x0 x0Var = this.c;
        z0 z0Var = new z0(iArr);
        z0 z0Var2 = new z0(iArr2);
        g[] gVarArr = x0.j;
        Objects.requireNonNull(x0Var);
        return new a1(x0Var, z0Var, z0Var2, gVarArr);
    }
}
