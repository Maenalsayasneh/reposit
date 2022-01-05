package i0.e.c.f.b.a;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: BackchannelChatSegment.kt */
public final class f extends h {
    public final j a;
    public final long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(j jVar, long j) {
        super((m0.n.b.f) null);
        i.e(jVar, "range");
        this.a = jVar;
        this.b = j;
    }

    public j a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Loaded(range=");
        P0.append(this.a);
        P0.append(", loadTime=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
