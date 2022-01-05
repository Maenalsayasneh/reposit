package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import s0.a.c.i;
import s0.a.c.k;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.h.d;
import s0.a.h.g;
import s0.a.h.h;

public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi {
    private final c helper = new a();

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        k kVar;
        boolean z = certPathParameters instanceof d;
        if (z || (certPathParameters instanceof k)) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            Set hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            if (certPathParameters instanceof PKIXParameters) {
                k.b bVar = new k.b((PKIXParameters) certPathParameters);
                if (z) {
                    d dVar = (d) certPathParameters;
                    bVar.k = dVar.c2;
                    bVar.j = dVar.b2;
                    hashSet = Collections.unmodifiableSet(dVar.a2);
                    hashSet2 = Collections.unmodifiableSet(dVar.Z1);
                    hashSet3 = Collections.unmodifiableSet(dVar.Y1);
                }
                kVar = bVar.a();
            } else {
                kVar = (k) certPathParameters;
            }
            k kVar2 = kVar;
            Date date = new Date();
            Date validityDate = CertPathValidatorUtilities.getValidityDate(kVar2, date);
            i iVar = kVar2.d;
            if (iVar instanceof g) {
                h hVar = ((g) iVar).y;
                CertPath processAttrCert1 = RFC3281CertPathUtilities.processAttrCert1(hVar, kVar2);
                CertPathValidatorResult processAttrCert2 = RFC3281CertPathUtilities.processAttrCert2(certPath, kVar2);
                X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(0);
                RFC3281CertPathUtilities.processAttrCert3(x509Certificate, kVar2);
                RFC3281CertPathUtilities.processAttrCert4(x509Certificate, hashSet4);
                RFC3281CertPathUtilities.processAttrCert5(hVar, validityDate);
                RFC3281CertPathUtilities.processAttrCert7(hVar, certPath, processAttrCert1, kVar2, hashSet);
                RFC3281CertPathUtilities.additionalChecks(hVar, hashSet2, hashSet3);
                RFC3281CertPathUtilities.checkCRLs(hVar, kVar2, date, validityDate, x509Certificate, certPath.getCertificates(), this.helper);
                return processAttrCert2;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("TargetConstraints must be an instance of ");
            P0.append(g.class.getName());
            P0.append(" for ");
            P0.append(getClass().getName());
            P0.append(" class.");
            throw new InvalidAlgorithmParameterException(P0.toString());
        }
        throw new InvalidAlgorithmParameterException(i0.d.a.a.a.Y(d.class, i0.d.a.a.a.P0("Parameters must be a "), " instance."));
    }
}
