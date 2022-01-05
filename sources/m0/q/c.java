package m0.q;

import i0.j.f.p.h;
import java.util.Iterator;
import m0.n.b.s.a;

/* compiled from: Progressions.kt */
public class c implements Iterable<Integer>, a {
    public final int c;
    public final int d;
    public final int q;

    public c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.c = i;
            this.d = h.C1(i, i2, i3);
            this.q = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.c == cVar.c && this.d == cVar.d && this.q == cVar.q)) {
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
        return (((this.c * 31) + this.d) * 31) + this.q;
    }

    public boolean isEmpty() {
        if (this.q > 0) {
            if (this.c > this.d) {
                return true;
            }
        } else if (this.c < this.d) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new d(this.c, this.d, this.q);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.q > 0) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append("..");
            sb.append(this.d);
            sb.append(" step ");
            i = this.q;
        } else {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(" downTo ");
            sb.append(this.d);
            sb.append(" step ");
            i = -this.q;
        }
        sb.append(i);
        return sb.toString();
    }
}
