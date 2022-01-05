package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class b1 extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ c1 c;

    public b1(c1 c1Var, int i, int[] iArr) {
        this.c = c1Var;
        this.a = i;
        this.b = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 17; i5++) {
                int i6 = iArr[i5];
                int[] iArr3 = this.b;
                iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 17) + i5] & i4);
            }
            i2 += 34;
        }
        c1 c1Var = this.c;
        e1 e1Var = new e1(iArr);
        e1 e1Var2 = new e1(iArr2);
        g[] gVarArr = c1.j;
        Objects.requireNonNull(c1Var);
        return new f1(c1Var, e1Var, e1Var2, gVarArr);
    }

    public h c(int i) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int i2 = i * 17 * 2;
        for (int i3 = 0; i3 < 17; i3++) {
            int i4 = iArr[i3];
            int[] iArr3 = this.b;
            iArr[i3] = i4 ^ iArr3[i2 + i3];
            iArr2[i3] = iArr2[i3] ^ iArr3[(i2 + 17) + i3];
        }
        c1 c1Var = this.c;
        e1 e1Var = new e1(iArr);
        e1 e1Var2 = new e1(iArr2);
        g[] gVarArr = c1.j;
        Objects.requireNonNull(c1Var);
        return new f1(c1Var, e1Var, e1Var2, gVarArr);
    }
}
