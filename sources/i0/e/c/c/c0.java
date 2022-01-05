package i0.e.c.c;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.c.f.b.a.j;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class c0 implements c {
    public final j a;

    public c0(j jVar) {
        i.e(jVar, "range");
        this.a = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && i.a(this.a, ((c0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("LoadMessages(range=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
