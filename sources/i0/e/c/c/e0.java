package i0.e.c.c;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class e0 implements c {
    public final String a;

    public e0(String str) {
        i.e(str, "clientMessageId");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && i.a(this.a, ((e0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("Retry(clientMessageId="), this.a, ')');
    }
}
