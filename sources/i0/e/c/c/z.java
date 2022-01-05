package i0.e.c.c;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: BackchannelChatViewModel.kt */
public final class z implements c {
    public final int a;

    public z(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a == ((z) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("BlockUser(userId="), this.a, ')');
    }
}
