package m0.q;

/* compiled from: Ranges.kt */
public final class h extends f implements b<Long> {
    static {
        new h(1, 0);
    }

    public h(long j, long j2) {
        super(j, j2, 1);
    }

    public Comparable c() {
        return Long.valueOf(this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!(this.c == hVar.c && this.d == hVar.d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.c;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.d;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public boolean isEmpty() {
        return this.c > this.d;
    }

    public Comparable j() {
        return Long.valueOf(this.d);
    }

    public String toString() {
        return this.c + ".." + this.d;
    }
}
