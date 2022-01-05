package i0.e.b.z2.g;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class c implements i0.e.b.a3.b.c {
    public final Integer a;

    public c() {
        this.a = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && i.a(this.a, ((c) obj).a);
    }

    public int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return a.v0(a.P0("AcceptSpeakerInvite(fromUser="), this.a, ')');
    }

    public c(Integer num) {
        this.a = num;
    }

    public c(Integer num, int i) {
        int i2 = i & 1;
        this.a = null;
    }
}
