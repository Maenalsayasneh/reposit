package i0.e.c.h;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BackchannelInboxViewModel.kt */
public final class g implements c {
    public final String a;

    public g(String str) {
        i.e(str, "chatId");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && i.a(this.a, ((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ArchiveChat(chatId="), this.a, ')');
    }
}
