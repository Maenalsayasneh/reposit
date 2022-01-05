package i0.e.b.z2.g;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;

/* compiled from: ChannelViewModel.kt */
public final class w0 implements b {
    public final int a;

    public w0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && this.a == ((w0) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("ShowEndConfirmation(userCount="), this.a, ')');
    }
}
