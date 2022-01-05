package s0.a.e.b.b0.c;

import java.util.Objects;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class a extends s0.a.e.b.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ b c;

    public a(b bVar, int i, int[] iArr) {
        this.c = bVar;
        this.a = i;
        this.b = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = ((i3 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = iArr[i5];
                int[] iArr3 = this.b;
                iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 4) + i5] & i4);
            }
            i2 += 8;
        }
        b bVar = this.c;
        d dVar = new d(iArr);
        d dVar2 = new d(iArr2);
        g[] gVarArr = b.j;
        Objects.requireNonNull(bVar);
        return new e(bVar, dVar, dVar2, gVarArr);
    }

    public h c(int i) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i2 = i * 4 * 2;
        for (int i3 = 0; i3 < 4; i3++) {
            int[] iArr3 = this.b;
            iArr[i3] = iArr3[i2 + i3];
            iArr2[i3] = iArr3[i2 + 4 + i3];
        }
        b bVar = this.c;
        d dVar = new d(iArr);
        d dVar2 = new d(iArr2);
        g[] gVarArr = b.j;
        Objects.requireNonNull(bVar);
        return new e(bVar, dVar, dVar2, gVarArr);
    }
}
