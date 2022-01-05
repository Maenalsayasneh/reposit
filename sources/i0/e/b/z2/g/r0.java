package i0.e.b.z2.g;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ChannelControlModel.kt */
public final class r0 implements c {
    public final boolean a;

    public r0(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.a == ((r0) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("SetSelfMuted(muted="), this.a, ')');
    }
}
