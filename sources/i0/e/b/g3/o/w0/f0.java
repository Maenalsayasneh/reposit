package i0.e.b.g3.o.w0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: AddEditEventViewModel.kt */
public final class f0 implements c {
    public final int a;

    public f0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a == ((f0) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("LoadEvent(eventId="), this.a, ')');
    }
}
