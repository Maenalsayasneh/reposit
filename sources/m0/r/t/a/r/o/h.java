package m0.r.t.a.r.o;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: numbers.kt */
public final class h {
    public final String a;
    public final int b;

    public h(String str, int i) {
        i.e(str, "number");
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && this.b == hVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        StringBuilder P0 = a.P0("NumberWithRadix(number=");
        P0.append(this.a);
        P0.append(", radix=");
        return a.s0(P0, this.b, ')');
    }
}
