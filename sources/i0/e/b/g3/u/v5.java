package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class v5 implements c {
    public final String a;

    public v5(String str) {
        i.e(str, "oauthVerifier");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5) && i.a(this.a, ((v5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateTwitterProfile(oauthVerifier="), this.a, ')');
    }
}
