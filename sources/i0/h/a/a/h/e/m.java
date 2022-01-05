package i0.h.a.a.h.e;

import i0.d.a.a.a;

/* compiled from: AutoValue_LogResponse */
public final class m extends r {
    public final long a;

    public m(long j) {
        this.a = j;
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        if (this.a == ((r) obj).b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        StringBuilder P0 = a.P0("LogResponse{nextRequestWaitMillis=");
        P0.append(this.a);
        P0.append("}");
        return P0.toString();
    }
}
