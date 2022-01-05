package s0.a.h;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import s0.a.a.c3.q0;
import s0.a.a.c3.r0;
import s0.a.a.c3.s0;
import s0.a.a.c3.u;
import s0.a.a.c3.w;
import s0.a.a.j;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.g.h;

public class g implements h {
    public Collection Y1 = new HashSet();
    public Collection Z1 = new HashSet();
    public a c;
    public b d;
    public BigInteger q;
    public Date x;
    public h y;

    public Object clone() {
        g gVar = new g();
        gVar.y = this.y;
        gVar.x = this.x != null ? new Date(this.x.getTime()) : null;
        gVar.c = this.c;
        gVar.d = this.d;
        gVar.q = this.q;
        gVar.Z1 = Collections.unmodifiableCollection(this.Z1);
        gVar.Y1 = Collections.unmodifiableCollection(this.Y1);
        return gVar;
    }

    public boolean r0(Object obj) {
        byte[] extensionValue;
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        h hVar2 = this.y;
        if (hVar2 != null && !hVar2.equals(hVar)) {
            return false;
        }
        if (this.q != null && !hVar.getSerialNumber().equals(this.q)) {
            return false;
        }
        if (this.c != null && !hVar.a().equals(this.c)) {
            return false;
        }
        if (this.d != null && !hVar.c().equals(this.d)) {
            return false;
        }
        Date date = this.x;
        if (date != null) {
            try {
                hVar.checkValidity(date);
            } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                return false;
            }
        }
        if ((!this.Y1.isEmpty() || !this.Z1.isEmpty()) && (extensionValue = hVar.getExtensionValue(u.n2.d)) != null) {
            try {
                r0 s = r0.s(new j(((x0) r.x(extensionValue)).c).i());
                int size = s.c.size();
                s0[] s0VarArr = new s0[size];
                Enumeration E = s.c.E();
                int i = 0;
                while (E.hasMoreElements()) {
                    int i2 = i + 1;
                    Object nextElement = E.nextElement();
                    s0VarArr[i] = nextElement instanceof s0 ? (s0) nextElement : nextElement != null ? new s0(s.B(nextElement)) : null;
                    i = i2;
                }
                if (!this.Y1.isEmpty()) {
                    boolean z = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        q0[] s2 = s0VarArr[i3].s();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= s2.length) {
                                break;
                            } else if (this.Y1.contains(w.t(s2[i4].c))) {
                                z = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
                if (!this.Z1.isEmpty()) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < size; i5++) {
                        q0[] s3 = s0VarArr[i5].s();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= s3.length) {
                                break;
                            } else if (this.Z1.contains(w.t(s3[i6].d))) {
                                z2 = true;
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                }
            } catch (IOException | IllegalArgumentException unused2) {
            }
        }
        return true;
    }
}
