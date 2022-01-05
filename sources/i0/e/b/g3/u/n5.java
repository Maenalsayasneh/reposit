package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class n5 implements b {
    public final int a;
    public final String b;
    public final String c;

    public n5(int i, String str, String str2) {
        i.e(str2, "waveId");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return this.a == n5Var.a && i.a(this.b, n5Var.b) && i.a(this.c, n5Var.c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowWaveBanner(userId=");
        P0.append(this.a);
        P0.append(", name=");
        P0.append(this.b);
        P0.append(", waveId=");
        return a.x0(P0, this.c, ')');
    }
}
