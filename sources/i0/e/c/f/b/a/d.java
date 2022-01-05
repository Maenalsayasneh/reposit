package i0.e.c.f.b.a;

import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BackchannelChatSegment.kt */
public final class d extends e {
    public final j a;
    public final Error b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(j jVar, Error error) {
        super((f) null);
        i.e(jVar, "range");
        i.e(error, "error");
        this.a = jVar;
        this.b = error;
    }

    public j a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Failed(range=");
        P0.append(this.a);
        P0.append(", error=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
