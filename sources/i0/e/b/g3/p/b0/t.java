package i0.e.b.g3.p.b0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BuddyListViewModel.kt */
public final class t implements c {
    public final int a;
    public final String b;

    public t(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && i.a(this.b, tVar.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("SendWave(userId=");
        P0.append(this.a);
        P0.append(", name=");
        return a.w0(P0, this.b, ')');
    }
}
