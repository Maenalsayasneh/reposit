package i0.e.b.g3.o.w0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class l0 implements c {
    public final OffsetDateTime a;

    public l0(OffsetDateTime offsetDateTime) {
        i.e(offsetDateTime, "newDateTime");
        this.a = offsetDateTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && i.a(this.a, ((l0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateDateTime(newDateTime=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
