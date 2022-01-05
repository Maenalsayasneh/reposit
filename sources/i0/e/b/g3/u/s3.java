package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class s3 implements c {
    public final int a;
    public final String b;

    public s3(int i, String str) {
        i.e(str, "waveId");
        this.a = i;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return this.a == s3Var.a && i.a(this.b, s3Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("AcceptWave(userId=");
        P0.append(this.a);
        P0.append(", waveId=");
        return a.x0(P0, this.b, ')');
    }
}
