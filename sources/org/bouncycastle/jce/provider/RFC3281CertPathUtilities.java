package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertSelector;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import s0.a.a.c3.a0;
import s0.a.a.c3.r0;
import s0.a.a.c3.s;
import s0.a.a.c3.u;
import s0.a.a.c3.w0;
import s0.a.c.g;
import s0.a.c.i;
import s0.a.c.j;
import s0.a.c.k;
import s0.a.c.o.c;
import s0.a.h.e;
import s0.a.h.h;

public class RFC3281CertPathUtilities {
    private static final String AUTHORITY_INFO_ACCESS = u.l2.d;
    private static final String CRL_DISTRIBUTION_POINTS = u.d2.d;
    private static final String NO_REV_AVAIL = u.m2.d;
    private static final String TARGET_INFORMATION = u.n2.d;

    public static void additionalChecks(h hVar, Set set, Set set2) throws CertPathValidatorException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hVar.b(str) != null) {
                throw new CertPathValidatorException(a.o0("Attribute certificate contains prohibited attribute: ", str, "."));
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (hVar.b(str2) == null) {
                throw new CertPathValidatorException(a.o0("Attribute certificate does not contain necessary attribute: ", str2, "."));
            }
        }
    }

    private static void checkCRL(s sVar, h hVar, k kVar, Date date, Date date2, X509Certificate x509Certificate, CertStatus certStatus, ReasonsMask reasonsMask, List list, c cVar) throws AnnotatedException, RecoverableCertPathValidatorException {
        Iterator it;
        X509CRL x509crl;
        s sVar2 = sVar;
        h hVar2 = hVar;
        k kVar2 = kVar;
        Date date3 = date2;
        CertStatus certStatus2 = certStatus;
        ReasonsMask reasonsMask2 = reasonsMask;
        if (hVar2.getExtensionValue(w0.c.d) == null) {
            if (date2.getTime() <= date.getTime()) {
                Iterator it2 = CertPathValidatorUtilities.getCompleteCRLs(new g(kVar, date2, (CertPath) null, -1, x509Certificate, (PublicKey) null), sVar2, hVar2, kVar2, date3).iterator();
                boolean z = false;
                AnnotatedException e = null;
                while (it2.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
                    try {
                        X509CRL x509crl2 = (X509CRL) it2.next();
                        ReasonsMask processCRLD = RFC3280CertPathUtilities.processCRLD(x509crl2, sVar2);
                        if (!processCRLD.hasNewReasons(reasonsMask2)) {
                            continue;
                        } else {
                            ReasonsMask reasonsMask3 = processCRLD;
                            it = it2;
                            try {
                                X509CRL x509crl3 = x509crl2;
                                PublicKey processCRLG = RFC3280CertPathUtilities.processCRLG(x509crl3, RFC3280CertPathUtilities.processCRLF(x509crl2, hVar, (X509Certificate) null, (PublicKey) null, kVar, list, cVar));
                                if (kVar2.c2) {
                                    try {
                                        x509crl = RFC3280CertPathUtilities.processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl3, kVar.b(), kVar2.Z1, cVar), processCRLG);
                                    } catch (AnnotatedException e2) {
                                        e = e2;
                                    }
                                } else {
                                    Date date4 = date;
                                    c cVar2 = cVar;
                                    x509crl = null;
                                }
                                if (kVar2.d2 != 1) {
                                    if (hVar.getNotAfter().getTime() < x509crl3.getThisUpdate().getTime()) {
                                        throw new AnnotatedException("No valid CRL for current time found.");
                                    }
                                }
                                RFC3280CertPathUtilities.processCRLB1(sVar2, hVar2, x509crl3);
                                RFC3280CertPathUtilities.processCRLB2(sVar2, hVar2, x509crl3);
                                RFC3280CertPathUtilities.processCRLC(x509crl, x509crl3, kVar2);
                                RFC3280CertPathUtilities.processCRLI(date3, x509crl, hVar2, certStatus2, kVar2);
                                RFC3280CertPathUtilities.processCRLJ(date3, x509crl3, hVar2, certStatus2);
                                if (certStatus.getCertStatus() == 8) {
                                    certStatus2.setCertStatus(11);
                                }
                                reasonsMask2.addReasons(reasonsMask3);
                                z = true;
                            } catch (AnnotatedException e3) {
                                e = e3;
                                Date date5 = date;
                                c cVar3 = cVar;
                            }
                            it2 = it;
                        }
                    } catch (AnnotatedException e4) {
                        e = e4;
                        Date date6 = date;
                        c cVar4 = cVar;
                        it = it2;
                    }
                }
                if (!z) {
                    throw e;
                }
                return;
            }
            throw new AnnotatedException("Validation time is in future.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void checkCRLs(s0.a.h.h r20, s0.a.c.k r21, java.util.Date r22, java.util.Date r23, java.security.cert.X509Certificate r24, java.util.List r25, s0.a.c.o.c r26) throws java.security.cert.CertPathValidatorException {
        /*
            r11 = r20
            r0 = r21
            boolean r1 = r0.b2
            if (r1 == 0) goto L_0x018d
            java.lang.String r1 = NO_REV_AVAIL
            byte[] r1 = r11.getExtensionValue(r1)
            if (r1 != 0) goto L_0x0174
            java.lang.String r1 = CRL_DISTRIBUTION_POINTS     // Catch:{ AnnotatedException -> 0x016b }
            s0.a.a.r r1 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r11, r1)     // Catch:{ AnnotatedException -> 0x016b }
            s0.a.a.c3.k r1 = s0.a.a.c3.k.t(r1)     // Catch:{ AnnotatedException -> 0x016b }
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map<s0.a.a.c3.w, s0.a.c.d> r3 = r0.a2     // Catch:{ AnnotatedException -> 0x0162 }
            r12 = r23
            r13 = r26
            java.util.List r3 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(r1, r3, r12, r13)     // Catch:{ AnnotatedException -> 0x0162 }
            r2.addAll(r3)     // Catch:{ AnnotatedException -> 0x0162 }
            s0.a.c.k$b r3 = new s0.a.c.k$b
            r3.<init>((s0.a.c.k) r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x0035:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r2
            s0.a.c.d r4 = (s0.a.c.d) r4
            java.util.List<s0.a.c.d> r5 = r3.g
            r5.add(r4)
            goto L_0x0035
        L_0x0044:
            s0.a.c.k r14 = r3.a()
            org.bouncycastle.jce.provider.CertStatus r15 = new org.bouncycastle.jce.provider.CertStatus
            r15.<init>()
            org.bouncycastle.jce.provider.ReasonsMask r16 = new org.bouncycastle.jce.provider.ReasonsMask
            r16.<init>()
            java.lang.String r10 = "No valid CRL for distribution point found."
            r17 = 1
            r0 = 11
            r2 = 0
            if (r1 == 0) goto L_0x00ae
            s0.a.a.c3.s[] r9 = r1.s()     // Catch:{ Exception -> 0x00a4 }
            r8 = r2
            r18 = r8
        L_0x0062:
            int r1 = r9.length     // Catch:{ AnnotatedException -> 0x009b }
            if (r8 >= r1) goto L_0x0098
            int r1 = r15.getCertStatus()     // Catch:{ AnnotatedException -> 0x009b }
            if (r1 != r0) goto L_0x0098
            boolean r0 = r16.isAllReasons()     // Catch:{ AnnotatedException -> 0x009b }
            if (r0 != 0) goto L_0x0098
            r1 = r9[r8]     // Catch:{ AnnotatedException -> 0x009b }
            r2 = r20
            r3 = r14
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r15
            r0 = r8
            r8 = r16
            r19 = r9
            r9 = r25
            r12 = r10
            r10 = r26
            checkCRL(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ AnnotatedException -> 0x0096 }
            int r8 = r0 + 1
            r0 = 11
            r10 = r12
            r18 = r17
            r9 = r19
            r12 = r23
            goto L_0x0062
        L_0x0096:
            r0 = move-exception
            goto L_0x009d
        L_0x0098:
            r12 = r10
            r0 = 0
            goto L_0x00b2
        L_0x009b:
            r0 = move-exception
            r12 = r10
        L_0x009d:
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            r1.<init>(r12, r0)
            r0 = r1
            goto L_0x00b2
        L_0x00a4:
            r0 = move-exception
            r1 = r0
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r2 = "Distribution points could not be read."
            r0.<init>(r2, r1)
            throw r0
        L_0x00ae:
            r12 = r10
            r0 = 0
            r18 = 0
        L_0x00b2:
            int r1 = r15.getCertStatus()
            r2 = 11
            if (r1 != r2) goto L_0x0102
            boolean r1 = r16.isAllReasons()
            if (r1 != 0) goto L_0x0102
            s0.a.a.b3.c r1 = org.bouncycastle.jce.provider.PrincipalUtils.getEncodedIssuerPrincipal(r20)     // Catch:{ Exception -> 0x00f2 }
            s0.a.a.c3.s r2 = new s0.a.a.c3.s     // Catch:{ AnnotatedException -> 0x00f0 }
            s0.a.a.c3.t r3 = new s0.a.a.c3.t     // Catch:{ AnnotatedException -> 0x00f0 }
            s0.a.a.c3.x r4 = new s0.a.a.c3.x     // Catch:{ AnnotatedException -> 0x00f0 }
            s0.a.a.c3.w r5 = new s0.a.a.c3.w     // Catch:{ AnnotatedException -> 0x00f0 }
            r6 = 4
            r5.<init>((int) r6, (s0.a.a.e) r1)     // Catch:{ AnnotatedException -> 0x00f0 }
            r4.<init>((s0.a.a.c3.w) r5)     // Catch:{ AnnotatedException -> 0x00f0 }
            r1 = 0
            r3.<init>(r1, r4)     // Catch:{ AnnotatedException -> 0x00f0 }
            r1 = 0
            r2.<init>(r3, r1, r1)     // Catch:{ AnnotatedException -> 0x00f0 }
            r1 = r2
            r2 = r20
            r3 = r14
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r15
            r8 = r16
            r9 = r25
            r10 = r26
            checkCRL(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ AnnotatedException -> 0x00f0 }
            goto L_0x0104
        L_0x00f0:
            r0 = move-exception
            goto L_0x00fc
        L_0x00f2:
            r0 = move-exception
            r1 = r0
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x00f0 }
            java.lang.String r2 = "Issuer from certificate for CRL could not be reencoded."
            r0.<init>(r2, r1)     // Catch:{ AnnotatedException -> 0x00f0 }
            throw r0     // Catch:{ AnnotatedException -> 0x00f0 }
        L_0x00fc:
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            r1.<init>(r12, r0)
            r0 = r1
        L_0x0102:
            r17 = r18
        L_0x0104:
            if (r17 == 0) goto L_0x015a
            int r0 = r15.getCertStatus()
            r1 = 11
            if (r0 != r1) goto L_0x012e
            boolean r0 = r16.isAllReasons()
            r2 = 12
            if (r0 != 0) goto L_0x011f
            int r0 = r15.getCertStatus()
            if (r0 != r1) goto L_0x011f
            r15.setCertStatus(r2)
        L_0x011f:
            int r0 = r15.getCertStatus()
            if (r0 == r2) goto L_0x0126
            goto L_0x018d
        L_0x0126:
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r1 = "Attribute certificate status could not be determined."
            r0.<init>(r1)
            throw r0
        L_0x012e:
            java.lang.String r0 = "Attribute certificate revocation after "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.util.Date r1 = r15.getRevocationDate()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ", reason: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.S0(r0, r1)
            java.lang.String[] r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.crlReasons
            int r2 = r15.getCertStatus()
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException
            r1.<init>(r0)
            throw r1
        L_0x015a:
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r1 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r2 = "No valid CRL found."
            r1.<init>(r2, r0)
            throw r1
        L_0x0162:
            r0 = move-exception
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException
            java.lang.String r2 = "No additional CRL locations could be decoded from CRL distribution point extension."
            r1.<init>(r2, r0)
            throw r1
        L_0x016b:
            r0 = move-exception
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException
            java.lang.String r2 = "CRL distribution point extension could not be read."
            r1.<init>(r2, r0)
            throw r1
        L_0x0174:
            java.lang.String r0 = CRL_DISTRIBUTION_POINTS
            byte[] r0 = r11.getExtensionValue(r0)
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = AUTHORITY_INFO_ACCESS
            byte[] r0 = r11.getExtensionValue(r0)
            if (r0 != 0) goto L_0x0185
            goto L_0x018d
        L_0x0185:
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r1 = "No rev avail extension is set, but also an AC revocation pointer."
            r0.<init>(r1)
            throw r0
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(s0.a.h.h, s0.a.c.k, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.util.List, s0.a.c.o.c):void");
    }

    public static CertPath processAttrCert1(h hVar, k kVar) throws CertPathValidatorException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        s0.a.h.a a = hVar.a();
        a0 a0Var = a.c.c;
        int i = 0;
        if ((a0Var != null ? a.c(a0Var.c) : null) != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(hVar.a().d());
            s0.a.h.a a2 = hVar.a();
            a0 a0Var2 = a2.c.c;
            Principal[] c = a0Var2 != null ? a2.c(a0Var2.c) : null;
            int i2 = 0;
            while (i2 < c.length) {
                try {
                    if (c[i2] instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) c[i2]).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new i((CertSelector) x509CertSelector.clone(), (i.a) null), kVar.b());
                    i2++;
                } catch (AnnotatedException e) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e);
                } catch (IOException e2) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e2);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (hVar.a().b() != null) {
            s0.a.h.k kVar2 = new s0.a.h.k();
            Principal[] b = hVar.a().b();
            while (i < b.length) {
                try {
                    if (b[i] instanceof X500Principal) {
                        kVar2.setIssuer(((X500Principal) b[i]).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new i((CertSelector) kVar2.clone(), (i.a) null), kVar.b());
                    i++;
                } catch (AnnotatedException e3) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e3);
                } catch (IOException e4) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e4);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        k.b bVar = new k.b(kVar);
        Iterator it = linkedHashSet.iterator();
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResult = null;
        while (it.hasNext()) {
            s0.a.h.k kVar3 = new s0.a.h.k();
            kVar3.setCertificate((X509Certificate) it.next());
            bVar.d = new i((CertSelector) kVar3.clone(), (i.a) null);
            try {
                try {
                    certPathBuilderResult = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new j.b(bVar.a()).a());
                } catch (CertPathBuilderException e5) {
                    extCertPathValidatorException = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", e5);
                } catch (InvalidAlgorithmParameterException e6) {
                    throw new RuntimeException(e6.getMessage());
                }
            } catch (NoSuchProviderException e7) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e7);
            } catch (NoSuchAlgorithmException e8) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e8);
            }
        }
        if (extCertPathValidatorException == null) {
            return certPathBuilderResult.getCertPath();
        }
        throw extCertPathValidatorException;
    }

    public static CertPathValidatorResult processAttrCert2(CertPath certPath, k kVar) throws CertPathValidatorException {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, kVar);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", e);
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        } catch (NoSuchProviderException e3) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e4);
        }
    }

    public static void processAttrCert3(X509Certificate x509Certificate, k kVar) throws CertPathValidatorException {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && ((keyUsage.length <= 0 || !keyUsage[0]) && (keyUsage.length <= 1 || !keyUsage[1]))) {
            throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
        } else if (x509Certificate.getBasicConstraints() != -1) {
            throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
        }
    }

    public static void processAttrCert4(X509Certificate x509Certificate, Set set) throws CertPathValidatorException {
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z = true;
            }
        }
        if (!z) {
            throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
        }
    }

    public static void processAttrCert5(h hVar, Date date) throws CertPathValidatorException {
        try {
            hVar.checkValidity(date);
        } catch (CertificateExpiredException e) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e);
        } catch (CertificateNotYetValidException e2) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e2);
        }
    }

    public static void processAttrCert7(h hVar, CertPath certPath, CertPath certPath2, k kVar, Set set) throws CertPathValidatorException {
        Set<String> criticalExtensionOIDs = hVar.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                r0.s(CertPathValidatorUtilities.getExtensionValue(hVar, str));
            } catch (AnnotatedException e) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e);
            } catch (IllegalArgumentException e2) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e2);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(hVar, certPath, certPath2, criticalExtensionOIDs);
        }
        if (!criticalExtensionOIDs.isEmpty()) {
            throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
        }
    }
}
