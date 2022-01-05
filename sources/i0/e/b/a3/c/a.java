package i0.e.b.a3.c;

import m0.n.b.i;

/* compiled from: OAuthAuthentication.kt */
public final class a {
    public final String a;
    public final String b;
    public final String c;

    public a(String str, String str2, String str3) {
        i.e(str, "username");
        i.e(str2, "token");
        i.e(str3, "tokenSecret");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c);
    }

    public int hashCode() {
        return this.c.hashCode() + i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TwitterSession(username=");
        P0.append(this.a);
        P0.append(", token=");
        P0.append(this.b);
        P0.append(", tokenSecret=");
        return i0.d.a.a.a.x0(P0, this.c, ')');
    }
}
