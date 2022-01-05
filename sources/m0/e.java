package m0;

import i0.j.f.p.h;
import m0.n.b.f;

/* compiled from: UInt.kt */
public final class e implements Comparable<e> {
    public static final a c = new a((f) null);
    public final int d;

    /* compiled from: UInt.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public /* synthetic */ e(int i) {
        this.d = i;
    }

    public static String a(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    public int compareTo(Object obj) {
        return h.u4(this.d, ((e) obj).d);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.d == ((e) obj).d;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return a(this.d);
    }
}
