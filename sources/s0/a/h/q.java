package s0.a.h;

import i0.d.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import s0.a.a.c3.e;
import s0.a.a.c3.f;
import s0.a.a.c3.u;
import s0.a.a.c3.v;
import s0.a.a.j;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.e.b.b0.c.h3;

public class q implements h {
    public f c;
    public Date d;
    public Date q;

    public q(byte[] bArr) throws IOException {
        try {
            r i = new j((InputStream) new ByteArrayInputStream(bArr)).i();
            f fVar = i instanceof f ? (f) i : i != null ? new f(s.B(i)) : null;
            this.c = fVar;
            try {
                this.q = fVar.c.Y1.d.D();
                this.d = fVar.c.Y1.c.D();
            } catch (ParseException unused) {
                throw new IOException("invalid data structure in certificate!");
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(a.b0(e2, a.P0("exception decoding certificate structure: ")));
        }
    }

    public a a() {
        return new a((s) this.c.c.d.c());
    }

    public f[] b(String str) {
        s sVar = this.c.c.Z1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != sVar.size(); i++) {
            f fVar = new f(sVar.D(i));
            e eVar = fVar.c;
            Objects.requireNonNull(eVar);
            if (new n(eVar.c.d).d.equals(str)) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    public b c() {
        return new b(this.c.c.q);
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.after(this.q)) {
            StringBuilder P0 = a.P0("certificate expired on ");
            P0.append(this.q);
            throw new CertificateExpiredException(P0.toString());
        } else if (date.before(this.d)) {
            StringBuilder P02 = a.P0("certificate not valid till ");
            P02.append(this.d);
            throw new CertificateNotYetValidException(P02.toString());
        }
    }

    public final Set d(boolean z) {
        v vVar = this.c.c.b2;
        if (vVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration v = vVar.v();
        while (v.hasMoreElements()) {
            n nVar = (n) v.nextElement();
            if (vVar.s(nVar).p2 == z) {
                hashSet.add(nVar.d);
            }
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((h) obj).getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public Set getCriticalExtensionOIDs() {
        return d(true);
    }

    public byte[] getEncoded() throws IOException {
        return this.c.getEncoded();
    }

    public byte[] getExtensionValue(String str) {
        v vVar = this.c.c.b2;
        if (vVar == null) {
            return null;
        }
        u uVar = (u) vVar.c.get(new n(str));
        if (uVar == null) {
            return null;
        }
        try {
            return uVar.q2.r("DER");
        } catch (Exception e) {
            throw new RuntimeException(a.b0(e, a.P0("error encoding ")));
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return d(false);
    }

    public Date getNotAfter() {
        return this.q;
    }

    public BigInteger getSerialNumber() {
        return this.c.c.y.E();
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        try {
            return h3.m1(getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }
}
