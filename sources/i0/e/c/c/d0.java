package i0.e.c.c;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BackchannelChatViewModel.kt */
public final class d0 implements c {
    public final int a;

    public d0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.a == ((d0) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("MarkSeen(messageId="), this.a, ')');
    }
}
