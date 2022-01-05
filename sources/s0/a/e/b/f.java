package s0.a.e.b;

import java.util.Objects;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;

public class f extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long[] c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ e.d e;

    public f(e.d dVar, int i, int i2, long[] jArr, int[] iArr) {
        this.e = dVar;
        this.a = i;
        this.b = i2;
        this.c = jArr;
        this.d = iArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int i2;
        int i3 = this.b;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            long j = (long) (((i5 ^ i) - 1) >> 31);
            int i6 = 0;
            while (true) {
                i2 = this.b;
                if (i6 >= i2) {
                    break;
                }
                long j2 = jArr[i6];
                long[] jArr3 = this.c;
                jArr[i6] = j2 ^ (jArr3[i4 + i6] & j);
                jArr2[i6] = jArr2[i6] ^ (jArr3[(i2 + i4) + i6] & j);
                i6++;
            }
            i4 += i2 * 2;
        }
        return d(jArr, jArr2);
    }

    public h c(int i) {
        int i2 = this.b;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = i * i2 * 2;
        int i4 = 0;
        while (true) {
            int i5 = this.b;
            if (i4 >= i5) {
                return d(jArr, jArr2);
            }
            long[] jArr3 = this.c;
            jArr[i4] = jArr3[i3 + i4];
            jArr2[i4] = jArr3[i5 + i3 + i4];
            i4++;
        }
    }

    public final h d(long[] jArr, long[] jArr2) {
        g.c cVar = new g.c(this.e.j, this.d, new m(jArr));
        g.c cVar2 = new g.c(this.e.j, this.d, new m(jArr2));
        e.d dVar = this.e;
        Objects.requireNonNull(dVar);
        return new h.d(dVar, cVar, cVar2);
    }
}
