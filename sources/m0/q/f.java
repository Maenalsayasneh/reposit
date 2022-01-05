package m0.q;

import i0.j.f.p.h;
import java.util.Iterator;
import m0.n.b.s.a;

/* compiled from: Progressions.kt */
public class f implements Iterable<Long>, a {
    public final long c;
    public final long d;
    public final long q;

    public f(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.c = j;
            if (i > 0) {
                if (j < j2) {
                    j2 -= h.W2(h.W2(j2, j3) - h.W2(j, j3), j3);
                }
            } else if (i >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (j > j2) {
                long j4 = -j3;
                j2 += h.W2(h.W2(j, j4) - h.W2(j2, j4), j4);
            }
            this.d = j2;
            this.q = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public Iterator iterator() {
        return new g(this.c, this.d, this.q);
    }
}
