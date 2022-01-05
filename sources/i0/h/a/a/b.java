package i0.h.a.a;

import i0.d.a.a.a;
import java.util.Objects;

/* compiled from: Encoding */
public final class b {
    public final String a;

    public b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return a.y0(a.P0("Encoding{name=\""), this.a, "\"}");
    }
}
