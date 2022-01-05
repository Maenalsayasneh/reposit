package i0.e.b.z2.g;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ChannelViewModel.kt */
public final class b implements c {
    public final long a;

    public b(long j) {
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        StringBuilder P0 = a.P0("AcceptNewChannelInvite(inviteId=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
