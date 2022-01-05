package s0.a.h;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import s0.a.a.c3.a0;
import s0.a.a.c3.w;
import s0.a.a.c3.x;
import s0.a.a.c3.z;
import s0.a.a.s;
import s0.a.d.c;
import s0.a.g.h;

public class a implements CertSelector, h {
    public final z c;

    public a(s sVar) {
        this.c = z.s(sVar);
    }

    public Principal[] b() {
        x xVar = this.c.d;
        if (xVar != null) {
            return c(xVar);
        }
        return null;
    }

    public final Principal[] c(x xVar) {
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

    public Object clone() {
        return new a((s) this.c.c());
    }

    public BigInteger d() {
        a0 a0Var = this.c.c;
        if (a0Var != null) {
            return a0Var.d.E();
        }
        return null;
    }

    public final boolean e(c cVar, x xVar) {
        w[] t = xVar.t();
        for (int i = 0; i != t.length; i++) {
            w wVar = t[i];
            if (wVar.d == 4) {
                try {
                    if (new c(wVar.c.c().getEncoded()).equals(cVar)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.c.equals(((a) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean match(java.security.cert.Certificate r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.security.cert.X509Certificate
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = r6
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            s0.a.a.c3.z r2 = r5.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.a0 r3 = r2.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            r4 = 1
            if (r3 == 0) goto L_0x004d
            s0.a.a.k r6 = r3.d     // Catch:{ CertificateEncodingException -> 0x00d1 }
            java.math.BigInteger r2 = r0.getSerialNumber()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            boolean r6 = r6.F(r2)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r6 == 0) goto L_0x004c
            byte[] r6 = r0.getTBSCertificate()     // Catch:{ IOException -> 0x0041 }
            s0.a.a.r r6 = s0.a.a.r.x(r6)     // Catch:{ IOException -> 0x0041 }
            s0.a.a.c3.p0 r6 = s0.a.a.c3.p0.s(r6)     // Catch:{ IOException -> 0x0041 }
            s0.a.d.c r0 = new s0.a.d.c     // Catch:{ IOException -> 0x0041 }
            s0.a.a.b3.c r6 = r6.d     // Catch:{ IOException -> 0x0041 }
            s0.a.a.c3.x0 r6 = s0.a.a.c3.x0.u(r6)     // Catch:{ IOException -> 0x0041 }
            r0.<init>((s0.a.a.c3.x0) r6)     // Catch:{ IOException -> 0x0041 }
            s0.a.a.c3.z r6 = r5.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.a0 r6 = r6.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.x r6 = r6.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            boolean r6 = r5.e(r0, r6)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r6 == 0) goto L_0x004c
            r1 = r4
            goto L_0x004c
        L_0x0041:
            r6 = move-exception
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException     // Catch:{ CertificateEncodingException -> 0x00d1 }
            java.lang.String r6 = r6.toString()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            r0.<init>(r6)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            throw r0     // Catch:{ CertificateEncodingException -> 0x00d1 }
        L_0x004c:
            return r1
        L_0x004d:
            s0.a.a.c3.x r2 = r2.d     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r2 == 0) goto L_0x007e
            byte[] r0 = r0.getTBSCertificate()     // Catch:{ IOException -> 0x0073 }
            s0.a.a.r r0 = s0.a.a.r.x(r0)     // Catch:{ IOException -> 0x0073 }
            s0.a.a.c3.p0 r0 = s0.a.a.c3.p0.s(r0)     // Catch:{ IOException -> 0x0073 }
            s0.a.d.c r2 = new s0.a.d.c     // Catch:{ IOException -> 0x0073 }
            s0.a.a.b3.c r0 = r0.q     // Catch:{ IOException -> 0x0073 }
            s0.a.a.c3.x0 r0 = s0.a.a.c3.x0.u(r0)     // Catch:{ IOException -> 0x0073 }
            r2.<init>((s0.a.a.c3.x0) r0)     // Catch:{ IOException -> 0x0073 }
            s0.a.a.c3.z r0 = r5.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.x r0 = r0.d     // Catch:{ CertificateEncodingException -> 0x00d1 }
            boolean r0 = r5.e(r2, r0)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r0 == 0) goto L_0x007e
            return r4
        L_0x0073:
            r6 = move-exception
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException     // Catch:{ CertificateEncodingException -> 0x00d1 }
            java.lang.String r6 = r6.toString()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            r0.<init>(r6)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            throw r0     // Catch:{ CertificateEncodingException -> 0x00d1 }
        L_0x007e:
            s0.a.a.c3.z r0 = r5.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.f0 r0 = r0.q     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r0 == 0) goto L_0x00d1
            r2 = 0
            if (r0 == 0) goto L_0x008e
            s0.a.a.c3.b r0 = r0.q     // Catch:{  }
            s0.a.a.n r0 = r0.c     // Catch:{  }
            java.lang.String r0 = r0.d     // Catch:{  }
            goto L_0x008f
        L_0x008e:
            r0 = r2
        L_0x008f:
            java.lang.String r3 = "BC"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0, r3)     // Catch:{  }
            s0.a.a.c3.z r3 = r5.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.f0 r3 = r3.q     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r3 == 0) goto L_0x00a2
            s0.a.a.g r3 = r3.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            int r3 = r3.E()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            goto L_0x00a3
        L_0x00a2:
            r3 = -1
        L_0x00a3:
            if (r3 == 0) goto L_0x00b0
            if (r3 == r4) goto L_0x00a8
            goto L_0x00bb
        L_0x00a8:
            byte[] r6 = r6.getEncoded()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            r0.update(r6)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            goto L_0x00bb
        L_0x00b0:
            java.security.PublicKey r6 = r6.getPublicKey()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            byte[] r6 = r6.getEncoded()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            r0.update(r6)     // Catch:{ CertificateEncodingException -> 0x00d1 }
        L_0x00bb:
            byte[] r6 = r0.digest()     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.z r0 = r5.c     // Catch:{ CertificateEncodingException -> 0x00d1 }
            s0.a.a.c3.f0 r0 = r0.q     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r0 == 0) goto L_0x00cb
            s0.a.a.o0 r0 = r0.x     // Catch:{ CertificateEncodingException -> 0x00d1 }
            byte[] r2 = r0.B()     // Catch:{ CertificateEncodingException -> 0x00d1 }
        L_0x00cb:
            boolean r6 = java.util.Arrays.equals(r6, r2)     // Catch:{ CertificateEncodingException -> 0x00d1 }
            if (r6 != 0) goto L_0x00d1
        L_0x00d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.h.a.match(java.security.cert.Certificate):boolean");
    }

    public boolean r0(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return match((Certificate) obj);
    }
}
