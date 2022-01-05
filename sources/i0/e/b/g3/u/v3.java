package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ProfileViewModel.kt */
public final class v3 implements c {
    public final int a;

    public v3(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3) && this.a == ((v3) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("CancelWave(userId="), this.a, ')');
    }
}
