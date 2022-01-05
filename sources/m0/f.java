package m0;

import i0.j.f.p.h;
import m0.n.b.i;

/* compiled from: ULong.kt */
public final class f implements Comparable<f> {
    public static final a c = new a((m0.n.b.f) null);
    public final long d;

    /* compiled from: ULong.kt */
    public static final class a {
        public a(m0.n.b.f fVar) {
        }
    }

    public /* synthetic */ f(long j) {
        this.d = j;
    }

    public static String a(long j) {
        if (j >= 0) {
            m0.r.t.a.r.m.a1.a.B0(10);
            String l = Long.toString(j, 10);
            i.d(l, "java.lang.Long.toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        m0.r.t.a.r.m.a1.a.B0(10);
        String l2 = Long.toString(j3, 10);
        i.d(l2, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l2);
        m0.r.t.a.r.m.a1.a.B0(10);
        String l3 = Long.toString(j4, 10);
        i.d(l3, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }

    public int compareTo(Object obj) {
        return h.v4(this.d, ((f) obj).d);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.d == ((f) obj).d;
    }

    public int hashCode() {
        long j = this.d;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return a(this.d);
    }
}
