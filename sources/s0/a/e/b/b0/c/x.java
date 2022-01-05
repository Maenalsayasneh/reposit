package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class x extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ y c;

    public x(y yVar, int i, int[] iArr) {
        this.c = yVar;
        this.a = i;
        this.b = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 6; i5++) {
                int i6 = iArr[i5];
                int[] iArr3 = this.b;
                iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 6) + i5] & i4);
            }
            i2 += 12;
        }
        y yVar = this.c;
        a0 a0Var = new a0(iArr);
        a0 a0Var2 = new a0(iArr2);
        g[] gVarArr = y.j;
        Objects.requireNonNull(yVar);
        return new b0(yVar, a0Var, a0Var2, gVarArr);
    }

    public h c(int i) {
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int i2 = i * 6 * 2;
        for (int i3 = 0; i3 < 6; i3++) {
            int[] iArr3 = this.b;
            iArr[i3] = iArr3[i2 + i3];
            iArr2[i3] = iArr3[i2 + 6 + i3];
        }
        y yVar = this.c;
        a0 a0Var = new a0(iArr);
        a0 a0Var2 = new a0(iArr2);
        g[] gVarArr = y.j;
        Objects.requireNonNull(yVar);
        return new b0(yVar, a0Var, a0Var2, gVarArr);
    }
}
