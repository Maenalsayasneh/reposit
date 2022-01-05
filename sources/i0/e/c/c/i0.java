package i0.e.c.c;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class i0 implements c {
    public final String a;

    public i0(String str) {
        i.e(str, "messageBody");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && i.a(this.a, ((i0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateText(messageBody="), this.a, ')');
    }
}
