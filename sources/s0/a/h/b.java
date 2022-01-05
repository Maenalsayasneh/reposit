package s0.a.h;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import s0.a.a.c3.a0;
import s0.a.a.c3.c;
import s0.a.a.c3.u0;
import s0.a.a.c3.w;
import s0.a.a.c3.x;
import s0.a.a.e;
import s0.a.g.h;

public class b implements CertSelector, h {
    public final e c;

    public b(c cVar) {
        this.c = cVar.c;
    }

    public Principal[] b() {
        x xVar;
        e eVar = this.c;
        if (eVar instanceof u0) {
            xVar = ((u0) eVar).c;
        } else {
            xVar = (x) eVar;
        }
        w[] t = xVar.t();
        ArrayList arrayList = new ArrayList(t.length);
        for (int i = 0; i != t.length; i++) {
            if (t[i].d == 4) {
                try {
                    arrayList.add(new X500Principal(t[i].c.c().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 != array.length; i2++) {
            if (array[i2] instanceof Principal) {
                arrayList2.add(array[i2]);
            }
        }
        return (Principal[]) arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    public final boolean c(X500Principal x500Principal, x xVar) {
        w[] t = xVar.t();
        for (int i = 0; i != t.length; i++) {
            w wVar = t[i];
            if (wVar.d == 4) {
                try {
                    if (new X500Principal(wVar.c.c().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public Object clone() {
        return new b(c.s(this.c));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.c.equals(((b) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        e eVar = this.c;
        if (eVar instanceof u0) {
            u0 u0Var = (u0) eVar;
            a0 a0Var = u0Var.d;
            if (a0Var == null) {
                if (c(x509Certificate.getSubjectX500Principal(), u0Var.c)) {
                    return true;
                }
            } else if (!a0Var.d.F(x509Certificate.getSerialNumber()) || !c(x509Certificate.getIssuerX500Principal(), u0Var.d.c)) {
                return false;
            } else {
                return true;
            }
        } else {
            if (c(x509Certificate.getSubjectX500Principal(), (x) eVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean r0(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return match((Certificate) obj);
    }
}
