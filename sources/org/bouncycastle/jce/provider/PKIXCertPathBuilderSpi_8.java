package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import s0.a.a.c3.u;
import s0.a.c.h;
import s0.a.c.j;
import s0.a.c.k;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.h.d;

public class PKIXCertPathBuilderSpi_8 extends CertPathBuilderSpi {
    private Exception certPathException;
    private final c helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathBuilderSpi_8() {
        this(false);
    }

    public PKIXCertPathBuilderSpi_8(boolean z) {
        this.helper = new a();
        this.isForCRLCheck = z;
    }

    public CertPathBuilderResult build(X509Certificate x509Certificate, j jVar, List list) {
        CertPathBuilderResult certPathBuilderResult = null;
        if (list.contains(x509Certificate) || jVar.d.contains(x509Certificate)) {
            return null;
        }
        if (jVar.q != -1 && list.size() - 1 > jVar.q) {
            return null;
        }
        list.add(x509Certificate);
        try {
            CertificateFactory certificateFactory = new CertificateFactory();
            PKIXCertPathValidatorSpi_8 pKIXCertPathValidatorSpi_8 = new PKIXCertPathValidatorSpi_8(this.isForCRLCheck);
            k kVar = jVar.c;
            if (CertPathValidatorUtilities.isIssuerTrustAnchor(x509Certificate, kVar.e2, kVar.c())) {
                CertPath engineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) pKIXCertPathValidatorSpi_8.engineValidate(engineGenerateCertPath, jVar);
                return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(jVar.c.y);
            arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromAltNames(x509Certificate.getExtensionValue(u.q.d), jVar.c.Y1));
            HashSet hashSet = new HashSet();
            hashSet.addAll(CertPathValidatorUtilities.findIssuerCerts(x509Certificate, jVar.c.b(), arrayList));
            if (!hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext() && certPathBuilderResult == null) {
                    certPathBuilderResult = build((X509Certificate) it.next(), jVar, list);
                }
                if (certPathBuilderResult == null) {
                    list.remove(x509Certificate);
                }
                return certPathBuilderResult;
            }
            throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
        } catch (Exception unused) {
            throw new RuntimeException("Exception creating support classes.");
        } catch (CertificateParsingException e) {
            throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e);
        } catch (AnnotatedException e2) {
            throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e2);
        } catch (Exception e3) {
            throw new AnnotatedException("Certification path could not be constructed from certificate list.", e3);
        } catch (Exception e4) {
            throw new AnnotatedException("Certification path could not be validated.", e4);
        } catch (AnnotatedException e5) {
            this.certPathException = e5;
        }
    }

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        j jVar;
        Exception exc;
        j.b bVar;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            k.b bVar2 = new k.b((PKIXParameters) pKIXBuilderParameters);
            if (certPathParameters instanceof d) {
                s0.a.h.c cVar = (s0.a.h.c) certPathParameters;
                for (h add : Collections.unmodifiableList(cVar.x)) {
                    bVar2.e.add(add);
                }
                bVar = new j.b(bVar2.a());
                bVar.c.addAll(cVar.c());
                bVar.b(cVar.d2);
            } else {
                bVar = new j.b(pKIXBuilderParameters);
            }
            jVar = bVar.a();
        } else if (certPathParameters instanceof j) {
            jVar = (j) certPathParameters;
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Parameters must be an instance of ");
            P0.append(PKIXBuilderParameters.class.getName());
            P0.append(" or ");
            P0.append(j.class.getName());
            P0.append(".");
            throw new InvalidAlgorithmParameterException(P0.toString());
        }
        ArrayList arrayList = new ArrayList();
        CertPathBuilderResult certPathBuilderResult = null;
        Iterator it = CertPathValidatorUtilities.findTargets(jVar).iterator();
        while (it.hasNext() && certPathBuilderResult == null) {
            certPathBuilderResult = build((X509Certificate) it.next(), jVar, arrayList);
        }
        if (certPathBuilderResult != null || (exc = this.certPathException) == null) {
            if (certPathBuilderResult != null || this.certPathException != null) {
                return certPathBuilderResult;
            }
            throw new CertPathBuilderException("Unable to find certificate chain.");
        } else if (exc instanceof AnnotatedException) {
            throw new CertPathBuilderException(this.certPathException.getMessage(), this.certPathException.getCause());
        } else {
            throw new CertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
        }
    }

    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }
}
