package i0.e.b.z2.g;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ChannelControlModel.kt */
public final class m0 implements c {
    public final int a;

    public m0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.a == ((m0) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("RejectSpeakerInvite(fromUser="), this.a, ')');
    }
}
