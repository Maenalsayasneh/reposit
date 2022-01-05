package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;
import s0.a.a.c3.b0;
import s0.a.a.c3.o;
import s0.a.a.c3.u;
import s0.a.a.e;
import s0.a.a.o0;
import s0.a.c.o.c;

public class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock = new Object();
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    public X509CRLObject(c cVar, o oVar) throws CRLException {
        super(cVar, oVar, createSigAlgName(oVar), createSigAlgParams(oVar), isIndirectCRL(oVar));
    }

    private static String createSigAlgName(o oVar) throws CRLException {
        try {
            return X509SignatureUtil.getSignatureName(oVar.d);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private static byte[] createSigAlgParams(o oVar) throws CRLException {
        try {
            e eVar = oVar.d.d;
            if (eVar == null) {
                return null;
            }
            return eVar.c().r("DER");
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = getEncoded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal getInternalCRL() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.cacheLock
            monitor-enter(r0)
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal r1 = r8.internalCRLValue     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r1
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            byte[] r0 = r8.getEncoded()     // Catch:{ CRLException -> 0x0010 }
        L_0x000e:
            r7 = r0
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x000e
        L_0x0012:
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal r0 = new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal
            s0.a.c.o.c r2 = r8.bcHelper
            s0.a.a.c3.o r3 = r8.c
            java.lang.String r4 = r8.sigAlgName
            byte[] r5 = r8.sigAlgParams
            boolean r6 = r8.isIndirect
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r8.cacheLock
            monitor-enter(r1)
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal r2 = r8.internalCRLValue     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x002b
            r8.internalCRLValue = r0     // Catch:{ all -> 0x002f }
        L_0x002b:
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal r0 = r8.internalCRLValue     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            return r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject.getInternalCRL():org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLInternal");
    }

    private static boolean isIndirectCRL(o oVar) throws CRLException {
        try {
            byte[] extensionOctets = X509CRLImpl.getExtensionOctets(oVar, u.a2.d);
            if (extensionOctets == null) {
                return false;
            }
            return b0.u(extensionOctets).y;
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    public boolean equals(Object obj) {
        o0 o0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) obj;
            if (!this.hashValueSet || !x509CRLObject.hashValueSet) {
                if ((this.internalCRLValue == null || x509CRLObject.internalCRLValue == null) && (o0Var = this.c.q) != null && !o0Var.w(x509CRLObject.c.q)) {
                    return false;
                }
            } else if (this.hashValue != x509CRLObject.hashValue) {
                return false;
            }
        }
        return getInternalCRL().equals(obj);
    }

    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }
}
