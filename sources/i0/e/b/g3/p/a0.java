package i0.e.b.g3.p;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: HallwayViewModel.kt */
public final class a0 implements c {
    public final boolean a;

    public a0(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("UpdateBuddyListState(open="), this.a, ')');
    }
}
