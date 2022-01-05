package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import s0.a.a.c3.o0;
import s0.a.a.c3.u;
import s0.a.a.n;
import s0.a.c.i;
import s0.a.c.j;
import s0.a.c.k;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.h.d;

public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final c helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    public PKIXCertPathValidatorSpi(boolean z) {
        this.helper = new a();
        this.isForCRLCheck = z;
    }

    public static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        if (x509Certificate instanceof s0.a.c.l.a) {
            RuntimeException runtimeException = null;
            try {
                if (((s0.a.c.l.a) x509Certificate).getTBSCertificateNative() != null) {
                    return;
                }
            } catch (RuntimeException e) {
                runtimeException = e;
            }
            throw new AnnotatedException("unable to process TBSCertificate", runtimeException);
        }
        try {
            o0.s(x509Certificate.getTBSCertificate());
        } catch (CertificateEncodingException e2) {
            throw new AnnotatedException("unable to process TBSCertificate", e2);
        } catch (IllegalArgumentException e3) {
            throw new AnnotatedException(e3.getMessage());
        }
    }

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        k kVar;
        List<? extends Certificate> list;
        PublicKey publicKey;
        s0.a.a.b3.c cVar;
        boolean z;
        HashSet hashSet;
        List<PKIXCertPathChecker> list2;
        ArrayList[] arrayListArr;
        int i;
        X509Certificate x509Certificate;
        int i2;
        int i3;
        int i4;
        HashSet hashSet2;
        CertPath certPath2 = certPath;
        CertPathParameters certPathParameters2 = certPathParameters;
        if (certPathParameters2 instanceof PKIXParameters) {
            k.b bVar = new k.b((PKIXParameters) certPathParameters2);
            if (certPathParameters2 instanceof d) {
                d dVar = (d) certPathParameters2;
                bVar.k = dVar.c2;
                bVar.j = dVar.b2;
            }
            kVar = bVar.a();
        } else if (certPathParameters2 instanceof j) {
            kVar = ((j) certPathParameters2).c;
        } else if (certPathParameters2 instanceof k) {
            kVar = (k) certPathParameters2;
        } else {
            throw new InvalidAlgorithmParameterException(i0.d.a.a.a.Y(PKIXParameters.class, i0.d.a.a.a.P0("Parameters must be a "), " instance."));
        }
        if (kVar.e2 != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Date validityDate = CertPathValidatorUtilities.getValidityDate(kVar, new Date());
                Set<String> initialPolicies = kVar.c.getInitialPolicies();
                try {
                    TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), kVar.e2, kVar.c());
                    if (findTrustAnchor != null) {
                        checkCertificate(findTrustAnchor.getTrustedCert());
                        k.b bVar2 = new k.b(kVar);
                        bVar2.l = Collections.singleton(findTrustAnchor);
                        k a = bVar2.a();
                        int i5 = size + 1;
                        ArrayList[] arrayListArr2 = new ArrayList[i5];
                        for (int i6 = 0; i6 < i5; i6++) {
                            arrayListArr2[i6] = new ArrayList();
                        }
                        HashSet hashSet3 = new HashSet();
                        hashSet3.add("2.5.29.32.0");
                        PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, (PolicyNode) null, new HashSet(), "2.5.29.32.0", false);
                        arrayListArr2[0].add(pKIXPolicyNode);
                        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                        HashSet hashSet4 = new HashSet();
                        int i7 = a.d() ? 0 : i5;
                        int i8 = a.c.isAnyPolicyInhibited() ? 0 : i5;
                        if (a.c.isPolicyMappingInhibited()) {
                            i5 = 0;
                        }
                        X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                cVar = PrincipalUtils.getSubjectPrincipal(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (RuntimeException e) {
                                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e, certPath2, -1);
                            }
                        } else {
                            cVar = PrincipalUtils.getCA(findTrustAnchor);
                            publicKey = findTrustAnchor.getCAPublicKey();
                        }
                        try {
                            n nVar = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey).c;
                            i iVar = a.d;
                            int i9 = i5;
                            if (iVar == null) {
                                z = false;
                            } else if (iVar.r0((X509Certificate) certificates.get(0))) {
                                z = false;
                            } else {
                                throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                            }
                            List<PKIXCertPathChecker> certPathCheckers = a.c.getCertPathCheckers();
                            for (PKIXCertPathChecker init : certPathCheckers) {
                                init.init(z);
                                certPathCheckers = certPathCheckers;
                            }
                            List<PKIXCertPathChecker> list3 = certPathCheckers;
                            ProvCrlRevocationChecker provCrlRevocationChecker = a.b2 ? new ProvCrlRevocationChecker(this.helper) : null;
                            PublicKey publicKey2 = publicKey;
                            PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                            int i10 = i9;
                            s0.a.a.b3.c cVar2 = cVar;
                            X509Certificate x509Certificate2 = trustedCert;
                            int i11 = i8;
                            int size2 = certificates.size() - 1;
                            int i12 = size;
                            int i13 = i7;
                            X509Certificate x509Certificate3 = null;
                            int i14 = i13;
                            while (size2 >= 0) {
                                int i15 = size - size2;
                                Set<String> set = initialPolicies;
                                X509Certificate x509Certificate4 = (X509Certificate) certificates.get(size2);
                                int i16 = i12;
                                boolean z2 = size2 == certificates.size() + -1;
                                try {
                                    checkCertificate(x509Certificate4);
                                    List<PKIXCertPathChecker> list4 = list3;
                                    List<? extends Certificate> list5 = certificates;
                                    int i17 = i16;
                                    int i18 = i11;
                                    k kVar2 = a;
                                    k kVar3 = a;
                                    int i19 = i14;
                                    Date date = validityDate;
                                    Date date2 = validityDate;
                                    int i20 = i15;
                                    int i21 = i17;
                                    int i22 = i10;
                                    int i23 = size2;
                                    X509Certificate x509Certificate5 = x509Certificate4;
                                    PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                    boolean z3 = z2;
                                    ArrayList[] arrayListArr3 = arrayListArr2;
                                    TrustAnchor trustAnchor = findTrustAnchor;
                                    RFC3280CertPathUtilities.processCertA(certPath, kVar2, date, provCrlRevocationChecker, size2, publicKey2, z3, cVar2, x509Certificate2);
                                    RFC3280CertPathUtilities.processCertBC(certPath2, i23, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                    PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath2, i23, RFC3280CertPathUtilities.processCertD(certPath, i23, hashSet4, pKIXPolicyNode2, arrayListArr3, i18, this.isForCRLCheck));
                                    RFC3280CertPathUtilities.processCertF(certPath2, i23, processCertE, i19);
                                    if (i20 == size) {
                                        i3 = i18;
                                        arrayListArr = arrayListArr3;
                                        list2 = list4;
                                        i2 = i21;
                                        i4 = i22;
                                        x509Certificate = x509Certificate5;
                                    } else if (x509Certificate5 == null || x509Certificate5.getVersion() != 1) {
                                        x509Certificate = x509Certificate5;
                                        RFC3280CertPathUtilities.prepareNextCertA(certPath2, i23);
                                        arrayListArr = arrayListArr3;
                                        int i24 = i22;
                                        PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i23, arrayListArr, processCertE, i24);
                                        RFC3280CertPathUtilities.prepareNextCertG(certPath2, i23, pKIXNameConstraintValidator2);
                                        int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i23, i19);
                                        int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i23, i24);
                                        int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i23, i18);
                                        i19 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i23, prepareNextCertH1);
                                        int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i23, prepareNextCertH2);
                                        int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i23, prepareNextCertH3);
                                        RFC3280CertPathUtilities.prepareNextCertK(certPath2, i23);
                                        int prepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i23, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i23, i21));
                                        RFC3280CertPathUtilities.prepareNextCertN(certPath2, i23);
                                        Set criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                            hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                            hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                            hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                            hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                            hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                            hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                        } else {
                                            hashSet2 = new HashSet();
                                        }
                                        list2 = list4;
                                        RFC3280CertPathUtilities.prepareNextCertO(certPath2, i23, hashSet2, list2);
                                        s0.a.a.b3.c subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate);
                                        try {
                                            PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i23, this.helper);
                                            n nVar2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey).c;
                                            pKIXPolicyNode2 = prepareCertB;
                                            x509Certificate2 = x509Certificate;
                                            i12 = prepareNextCertM;
                                            cVar2 = subjectPrincipal;
                                            publicKey2 = nextWorkingKey;
                                            int i25 = prepareNextCertJ;
                                            i = prepareNextCertI2;
                                            i11 = i25;
                                            size2 = i23 - 1;
                                            arrayListArr2 = arrayListArr;
                                            list3 = list2;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            initialPolicies = set;
                                            certificates = list5;
                                            validityDate = date2;
                                            findTrustAnchor = trustAnchor;
                                            i10 = i;
                                            x509Certificate3 = x509Certificate;
                                            i14 = i19;
                                            a = kVar3;
                                        } catch (CertPathValidatorException e2) {
                                            throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath2, i23);
                                        }
                                    } else {
                                        if (i20 == 1) {
                                            x509Certificate = x509Certificate5;
                                            if (x509Certificate.equals(trustAnchor.getTrustedCert())) {
                                                i3 = i18;
                                                arrayListArr = arrayListArr3;
                                                list2 = list4;
                                                i2 = i21;
                                                i4 = i22;
                                            }
                                        }
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, i23);
                                    }
                                    pKIXPolicyNode2 = processCertE;
                                    i = i4;
                                    i11 = i3;
                                    i12 = i2;
                                    size2 = i23 - 1;
                                    arrayListArr2 = arrayListArr;
                                    list3 = list2;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    initialPolicies = set;
                                    certificates = list5;
                                    validityDate = date2;
                                    findTrustAnchor = trustAnchor;
                                    i10 = i;
                                    x509Certificate3 = x509Certificate;
                                    i14 = i19;
                                    a = kVar3;
                                } catch (AnnotatedException e3) {
                                    AnnotatedException annotatedException = e3;
                                    throw new CertPathValidatorException(annotatedException.getMessage(), annotatedException.getUnderlyingException(), certPath2, size2);
                                }
                            }
                            k kVar4 = a;
                            int i26 = size2;
                            ArrayList[] arrayListArr4 = arrayListArr2;
                            TrustAnchor trustAnchor2 = findTrustAnchor;
                            Set<String> set2 = initialPolicies;
                            List<PKIXCertPathChecker> list6 = list3;
                            int i27 = i26 + 1;
                            int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i27, RFC3280CertPathUtilities.wrapupCertA(i14, x509Certificate3));
                            Set criticalExtensionOIDs2 = x509Certificate3.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                                hashSet.remove(u.i2.d);
                            } else {
                                hashSet = new HashSet();
                            }
                            RFC3280CertPathUtilities.wrapupCertF(certPath2, i27, list6, hashSet);
                            X509Certificate x509Certificate6 = x509Certificate3;
                            PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, kVar4, set2, i27, arrayListArr4, pKIXPolicyNode2, hashSet4);
                            if (wrapupCertB > 0 || wrapupCertG != null) {
                                return new PKIXCertPathValidatorResult(trustAnchor2, wrapupCertG, x509Certificate6.getPublicKey());
                            }
                            throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, i26);
                        } catch (CertPathValidatorException e4) {
                            throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                        }
                    } else {
                        list = certificates;
                        try {
                            throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                        } catch (AnnotatedException e5) {
                            e = e5;
                            throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, list.size() - 1);
                        }
                    }
                } catch (AnnotatedException e6) {
                    e = e6;
                    list = certificates;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, list.size() - 1);
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
