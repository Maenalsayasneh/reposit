package i0.e.c.f.b.a;

import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BackchannelChatSegment.kt */
public final class k extends e {
    public final j a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        super((f) null);
        i.e(jVar, "range");
        this.a = jVar;
    }

    public j a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && i.a(this.a, ((k) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("Unknown(range=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
