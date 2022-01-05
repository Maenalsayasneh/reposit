package i0.e.b.b3.d;

import m0.n.b.i;

/* compiled from: SafetyNetClient.kt */
public final class a {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        i.e(str, "nonce");
        i.e(str2, "result");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.b, aVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AttestationResult(nonce=");
        P0.append(this.a);
        P0.append(", result=");
        return i0.d.a.a.a.x0(P0, this.b, ')');
    }
}
