package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.a;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class f extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ g c;

    public f(g gVar, int i, int[] iArr) {
        this.c = gVar;
        this.a = i;
        this.b = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = iArr[i5];
                int[] iArr3 = this.b;
                iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 5) + i5] & i4);
            }
            i2 += 10;
        }
        g gVar = this.c;
        q qVar = new q(iArr);
        q qVar2 = new q(iArr2);
        g[] gVarArr = g.j;
        Objects.requireNonNull(gVar);
        return new h(gVar, qVar, qVar2, gVarArr);
    }

    public h c(int i) {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i2 = i * 5 * 2;
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr3 = this.b;
            iArr[i3] = iArr3[i2 + i3];
            iArr2[i3] = iArr3[i2 + 5 + i3];
        }
        g gVar = this.c;
        q qVar = new q(iArr);
        q qVar2 = new q(iArr2);
        g[] gVarArr = g.j;
        Objects.requireNonNull(gVar);
        return new h(gVar, qVar, qVar2, gVarArr);
    }
}
