package s0.a.d.e;

import java.security.spec.AlgorithmParameterSpec;
import s0.a.a.g2.a;
import s0.a.a.g2.e;
import s0.a.a.g2.f;
import s0.a.a.n;
import s0.a.d.d.d;

public class l implements AlgorithmParameterSpec, d {
    public n a;
    public String b;
    public String c;
    public String d;

    public l(String str, String str2, String str3) {
        e eVar;
        try {
            eVar = (e) s0.a.a.g2.d.b.get(new n(str));
        } catch (IllegalArgumentException unused) {
            n nVar = (n) s0.a.a.g2.d.a.get(str);
            if (nVar != null) {
                str = nVar.d;
                eVar = (e) s0.a.a.g2.d.b.get(nVar);
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            this.a = new n(eVar.d.D(), eVar.q.D(), eVar.x.D());
            this.b = str;
            this.c = str2;
            this.d = str3;
            return;
        }
        throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
    }

    public static l a(f fVar) {
        n nVar = fVar.q;
        if (nVar != null) {
            return new l(fVar.c.d, fVar.d.d, nVar.d);
        }
        return new l(fVar.c.d, fVar.d.d, (String) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.a) || !this.c.equals(lVar.c)) {
            return false;
        }
        String str = this.d;
        String str2 = lVar.d;
        return str == str2 || (str != null && str.equals(str2));
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() ^ this.c.hashCode();
        String str = this.d;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public l(n nVar) {
        this.a = nVar;
        this.c = a.p.d;
        this.d = null;
    }
}
