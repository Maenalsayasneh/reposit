package s0.a.c;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;
import s0.a.g.h;

public class e<T extends CRL> implements h<T> {
    public final CRLSelector c;
    public final boolean d;
    public final BigInteger q;
    public final byte[] x;
    public final boolean y;

    public static class b {
        public final CRLSelector a;
        public boolean b = false;
        public BigInteger c = null;
        public byte[] d = null;
        public boolean e = false;

        public b(CRLSelector cRLSelector) {
            this.a = (CRLSelector) cRLSelector.clone();
        }
    }

    public static class c extends X509CRLSelector {
        public final e c;

        public c(e eVar) {
            this.c = eVar;
            CRLSelector cRLSelector = eVar.c;
            if (cRLSelector instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        public boolean match(CRL crl) {
            e eVar = this.c;
            return eVar == null ? crl != null : eVar.r0(crl);
        }
    }

    public e(b bVar, a aVar) {
        this.c = bVar.a;
        this.d = bVar.b;
        this.q = bVar.c;
        this.x = bVar.d;
        this.y = bVar.e;
    }

    public Object clone() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (java.util.Arrays.equals(r0, r1) == false) goto L_0x0058;
     */
    /* renamed from: match */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r0(java.security.cert.CRL r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.security.cert.X509CRL
            if (r0 != 0) goto L_0x000b
        L_0x0004:
            java.security.cert.CRLSelector r0 = r4.c
            boolean r5 = r0.match(r5)
            return r5
        L_0x000b:
            r0 = r5
            java.security.cert.X509CRL r0 = (java.security.cert.X509CRL) r0
            r1 = 0
            r2 = 0
            s0.a.a.n r3 = s0.a.a.c3.u.Z1     // Catch:{ Exception -> 0x0058 }
            java.lang.String r3 = r3.d     // Catch:{ Exception -> 0x0058 }
            byte[] r3 = r0.getExtensionValue(r3)     // Catch:{ Exception -> 0x0058 }
            if (r3 == 0) goto L_0x0024
            s0.a.a.o r1 = s0.a.a.o.B(r3)     // Catch:{ Exception -> 0x0058 }
            byte[] r1 = r1.c     // Catch:{ Exception -> 0x0058 }
            s0.a.a.k r1 = s0.a.a.k.B(r1)     // Catch:{ Exception -> 0x0058 }
        L_0x0024:
            boolean r3 = r4.d
            if (r3 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r1 == 0) goto L_0x003f
            java.math.BigInteger r3 = r4.q
            if (r3 == 0) goto L_0x003f
            java.math.BigInteger r1 = r1.D()
            java.math.BigInteger r3 = r4.q
            int r1 = r1.compareTo(r3)
            r3 = 1
            if (r1 != r3) goto L_0x003f
            return r2
        L_0x003f:
            boolean r1 = r4.y
            if (r1 == 0) goto L_0x0004
            s0.a.a.n r1 = s0.a.a.c3.u.a2
            java.lang.String r1 = r1.d
            byte[] r0 = r0.getExtensionValue(r1)
            byte[] r1 = r4.x
            if (r1 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0004
            return r2
        L_0x0052:
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L_0x0004
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.c.e.r0(java.security.cert.CRL):boolean");
    }
}
