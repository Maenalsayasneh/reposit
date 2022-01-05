package m0.q;

import java.util.NoSuchElementException;
import m0.j.p;

/* compiled from: ProgressionIterators.kt */
public final class g extends p {
    public final long c;
    public boolean d;
    public long q;
    public final long x;

    public g(long j, long j2, long j3) {
        this.x = j3;
        this.c = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.d = z;
        this.q = !z ? j2 : j;
    }

    public long a() {
        long j = this.q;
        if (j != this.c) {
            this.q = this.x + j;
        } else if (this.d) {
            this.d = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public boolean hasNext() {
        return this.d;
    }
}
