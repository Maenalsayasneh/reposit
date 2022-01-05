package i0.h.a.a.h.e;

import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_BatchedLogRequest */
public final class i extends o {
    public final List<q> a;

    public i(List<q> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    public List<q> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.a.equals(((o) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder P0 = a.P0("BatchedLogRequest{logRequests=");
        P0.append(this.a);
        P0.append("}");
        return P0.toString();
    }
}
