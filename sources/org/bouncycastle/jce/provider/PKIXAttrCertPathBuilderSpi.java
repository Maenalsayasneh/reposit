package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.CertSelector;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.util.StoreException;
import s0.a.a.c3.u;
import s0.a.c.i;
import s0.a.c.j;
import s0.a.c.k;
import s0.a.g.i;
import s0.a.h.c;
import s0.a.h.d;
import s0.a.h.g;
import s0.a.h.h;

public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    private CertPathBuilderResult build(h hVar, X509Certificate x509Certificate, j jVar, List list) {
        CertPathBuilderResult certPathBuilderResult = null;
        if (list.contains(x509Certificate) || jVar.d.contains(x509Certificate)) {
            return null;
        }
        if (jVar.q != -1 && list.size() - 1 > jVar.q) {
            return null;
        }
        list.add(x509Certificate);
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            CertPathValidator instance2 = CertPathValidator.getInstance("RFC3281", BouncyCastleProvider.PROVIDER_NAME);
            try {
                k kVar = jVar.c;
                if (CertPathValidatorUtilities.isIssuerTrustAnchor(x509Certificate, kVar.e2, kVar.c())) {
                    CertPath generateCertPath = instance.generateCertPath(list);
                    PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) instance2.validate(generateCertPath, jVar);
                    return new PKIXCertPathBuilderResult(generateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(kVar.y);
                arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromAltNames(x509Certificate.getExtensionValue(u.q.d), kVar.Y1));
                HashSet hashSet = new HashSet();
                hashSet.addAll(CertPathValidatorUtilities.findIssuerCerts(x509Certificate, kVar.b(), arrayList));
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext() && certPathBuilderResult == null) {
                        X509Certificate x509Certificate2 = (X509Certificate) it.next();
                        if (!x509Certificate2.getIssuerX500Principal().equals(x509Certificate2.getSubjectX500Principal())) {
                            certPathBuilderResult = build(hVar, x509Certificate2, jVar, list);
                        }
                    }
                    if (certPathBuilderResult == null) {
                        list.remove(x509Certificate);
                    }
                    return certPathBuilderResult;
                }
                throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
            } catch (CertificateParsingException e) {
                throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e);
            } catch (AnnotatedException e2) {
                throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e2);
            } catch (Exception e3) {
                throw new AnnotatedException("Certification path could not be constructed from certificate list.", e3);
            } catch (Exception e4) {
                throw new AnnotatedException("Certification path could not be validated.", e4);
            } catch (AnnotatedException e5) {
                this.certPathException = new AnnotatedException("No valid certification path could be build.", e5);
            }
        } catch (Exception unused) {
            throw new RuntimeException("Exception creating support classes.");
        }
    }

    public static Collection findCertificates(g gVar, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object next : list) {
            if (next instanceof i) {
                try {
                    hashSet.addAll(((i) next).getMatches(gVar));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            }
        }
        return hashSet;
    }

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        j jVar;
        boolean z = certPathParameters instanceof PKIXBuilderParameters;
        if (z || (certPathParameters instanceof c) || (certPathParameters instanceof j)) {
            List arrayList = new ArrayList();
            if (z) {
                j.b bVar = new j.b((PKIXBuilderParameters) certPathParameters);
                if (certPathParameters instanceof d) {
                    c cVar = (c) certPathParameters;
                    bVar.c.addAll(cVar.c());
                    bVar.b(cVar.d2);
                    arrayList = Collections.unmodifiableList(new ArrayList(cVar.c));
                }
                jVar = bVar.a();
            } else {
                jVar = (j) certPathParameters;
            }
            ArrayList arrayList2 = new ArrayList();
            k kVar = jVar.c;
            s0.a.c.i iVar = kVar.d;
            if (iVar instanceof g) {
                try {
                    Collection findCertificates = findCertificates((g) iVar, arrayList);
                    if (!findCertificates.isEmpty()) {
                        Iterator it = findCertificates.iterator();
                        CertPathBuilderResult certPathBuilderResult = null;
                        while (it.hasNext() && certPathBuilderResult == null) {
                            h hVar = (h) it.next();
                            s0.a.h.k kVar2 = new s0.a.h.k();
                            Principal[] b = hVar.c().b();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int i = 0;
                            while (i < b.length) {
                                try {
                                    if (b[i] instanceof X500Principal) {
                                        kVar2.setSubject(((X500Principal) b[i]).getEncoded());
                                    }
                                    s0.a.c.i iVar2 = new s0.a.c.i((CertSelector) kVar2.clone(), (i.a) null);
                                    CertPathValidatorUtilities.findCertificates(linkedHashSet, iVar2, kVar.b());
                                    CertPathValidatorUtilities.findCertificates(linkedHashSet, iVar2, kVar.y);
                                    i++;
                                } catch (AnnotatedException e) {
                                    throw new ExtCertPathBuilderException("Public key certificate for attribute certificate cannot be searched.", e);
                                } catch (IOException e2) {
                                    throw new ExtCertPathBuilderException("cannot encode X500Principal.", e2);
                                }
                            }
                            if (!linkedHashSet.isEmpty()) {
                                Iterator it2 = linkedHashSet.iterator();
                                while (it2.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = build(hVar, (X509Certificate) it2.next(), jVar, arrayList2);
                                }
                            } else {
                                throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
                            }
                        }
                        if (certPathBuilderResult == null && this.certPathException != null) {
                            throw new ExtCertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
                        } else if (certPathBuilderResult != null || this.certPathException != null) {
                            return certPathBuilderResult;
                        } else {
                            throw new CertPathBuilderException("Unable to find certificate chain.");
                        }
                    } else {
                        throw new CertPathBuilderException("No attribute certificate found matching targetConstraints.");
                    }
                } catch (AnnotatedException e3) {
                    throw new ExtCertPathBuilderException("Error finding target attribute certificate.", e3);
                }
            } else {
                StringBuilder P0 = a.P0("TargetConstraints must be an instance of ");
                P0.append(g.class.getName());
                P0.append(" for ");
                P0.append(getClass().getName());
                P0.append(" class.");
                throw new CertPathBuilderException(P0.toString());
            }
        } else {
            StringBuilder P02 = a.P0("Parameters must be an instance of ");
            P02.append(PKIXBuilderParameters.class.getName());
            P02.append(" or ");
            P02.append(j.class.getName());
            P02.append(".");
            throw new InvalidAlgorithmParameterException(P02.toString());
        }
    }
}
