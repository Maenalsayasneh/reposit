package i0.e.b.g3.o.w0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: AddEditEventViewModel.kt */
public final class n0 implements c {
    public final boolean a;

    public n0(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.a == ((n0) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("UpdateMemberOnly(isMemberOnly="), this.a, ')');
    }
}
