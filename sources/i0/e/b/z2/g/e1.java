package i0.e.b.z2.g;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class e1 implements b {
    public final String a;

    public e1(String str) {
        i.e(str, "emoji");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && i.a(this.a, ((e1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ShowRaisedHand(emoji="), this.a, ')');
    }
}
