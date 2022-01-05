package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import s0.a.a.b1;
import s0.a.a.b3.b;
import s0.a.a.c3.b0;
import s0.a.a.c3.e0;
import s0.a.a.c3.i0;
import s0.a.a.c3.j;
import s0.a.a.c3.s;
import s0.a.a.c3.t;
import s0.a.a.c3.u;
import s0.a.a.c3.w;
import s0.a.a.c3.x;
import s0.a.a.c3.y;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.z;
import s0.a.c.g;
import s0.a.c.i;
import s0.a.c.j;
import s0.a.c.k;
import s0.a.c.o.c;

public class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    public static final String AUTHORITY_KEY_IDENTIFIER = u.g2.d;
    public static final String BASIC_CONSTRAINTS = u.x.d;
    public static final String CERTIFICATE_POLICIES = u.e2.d;
    public static final String CRL_DISTRIBUTION_POINTS = u.d2.d;
    public static final String CRL_NUMBER = u.y.d;
    public static final int CRL_SIGN = 6;
    public static final String DELTA_CRL_INDICATOR = u.Z1.d;
    public static final String FRESHEST_CRL = u.j2.d;
    public static final String INHIBIT_ANY_POLICY = u.k2.d;
    public static final String ISSUING_DISTRIBUTION_POINT = u.a2.d;
    public static final int KEY_CERT_SIGN = 5;
    public static final String KEY_USAGE = u.c.d;
    public static final String NAME_CONSTRAINTS = u.c2.d;
    public static final String POLICY_CONSTRAINTS = u.h2.d;
    public static final String POLICY_MAPPINGS = u.f2.d;
    public static final String SUBJECT_ALTERNATIVE_NAME = u.d.d;
    public static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");

    private static void checkCRL(g gVar, s sVar, k kVar, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, c cVar) throws AnnotatedException, RecoverableCertPathValidatorException {
        Iterator it;
        X509CRL x509crl;
        Set criticalExtensionOIDs;
        s sVar2 = sVar;
        k kVar2 = kVar;
        Date date3 = date2;
        X509Certificate x509Certificate3 = x509Certificate;
        CertStatus certStatus2 = certStatus;
        ReasonsMask reasonsMask2 = reasonsMask;
        if (date2.getTime() <= date.getTime()) {
            Iterator it2 = CertPathValidatorUtilities.getCompleteCRLs(gVar, sVar2, x509Certificate3, kVar2, date3).iterator();
            boolean z = false;
            e = null;
            while (it2.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
                try {
                    X509CRL x509crl2 = (X509CRL) it2.next();
                    ReasonsMask processCRLD = processCRLD(x509crl2, sVar2);
                    if (!processCRLD.hasNewReasons(reasonsMask2)) {
                        continue;
                    } else {
                        ReasonsMask reasonsMask3 = processCRLD;
                        X509CRL x509crl3 = x509crl2;
                        it = it2;
                        try {
                            PublicKey processCRLG = processCRLG(x509crl3, processCRLF(x509crl2, x509Certificate, x509Certificate2, publicKey, kVar, list, cVar));
                            if (kVar2.c2) {
                                try {
                                    x509crl = processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date3, x509crl3, kVar.b(), kVar2.Z1, cVar), processCRLG);
                                } catch (AnnotatedException e) {
                                    e = e;
                                    it2 = it;
                                }
                            } else {
                                c cVar2 = cVar;
                                x509crl = null;
                            }
                            if (kVar2.d2 != 1) {
                                try {
                                    if (x509Certificate.getNotAfter().getTime() < x509crl3.getThisUpdate().getTime()) {
                                        throw new AnnotatedException("No valid CRL for current time found.");
                                    }
                                } catch (AnnotatedException e2) {
                                    e = e2;
                                    it2 = it;
                                }
                            }
                            processCRLB1(sVar2, x509Certificate3, x509crl3);
                            processCRLB2(sVar2, x509Certificate3, x509crl3);
                            processCRLC(x509crl, x509crl3, kVar2);
                            processCRLI(date3, x509crl, x509Certificate3, certStatus2, kVar2);
                            processCRLJ(date3, x509crl3, x509Certificate3, certStatus2);
                            if (certStatus.getCertStatus() == 8) {
                                certStatus2.setCertStatus(11);
                            }
                            reasonsMask2.addReasons(reasonsMask3);
                            Set criticalExtensionOIDs2 = x509crl3.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                                hashSet.remove(u.a2.d);
                                hashSet.remove(u.Z1.d);
                                if (!hashSet.isEmpty()) {
                                    throw new AnnotatedException("CRL contains unsupported critical extensions.");
                                }
                            }
                            if (!(x509crl == null || (criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs()) == null)) {
                                HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                                hashSet2.remove(u.a2.d);
                                hashSet2.remove(u.Z1.d);
                                if (!hashSet2.isEmpty()) {
                                    throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
                                }
                            }
                            it2 = it;
                            z = true;
                        } catch (AnnotatedException e3) {
                            e = e3;
                            c cVar3 = cVar;
                            it2 = it;
                        }
                    }
                } catch (AnnotatedException e4) {
                    e = e4;
                    c cVar4 = cVar;
                    it = it2;
                    it2 = it;
                }
            }
            if (!z) {
                throw e;
            }
            return;
        }
        throw new AnnotatedException("Validation time is in future.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void checkCRLs(s0.a.c.g r22, s0.a.c.k r23, java.util.Date r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.cert.X509Certificate r27, java.security.PublicKey r28, java.util.List r29, s0.a.c.o.c r30) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        /*
            r3 = r23
            java.lang.String r0 = CRL_DISTRIBUTION_POINTS     // Catch:{ Exception -> 0x018c }
            r2 = r26
            s0.a.a.r r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r2, r0)     // Catch:{ Exception -> 0x018c }
            s0.a.a.c3.k r0 = s0.a.a.c3.k.t(r0)     // Catch:{ Exception -> 0x018c }
            s0.a.c.k$b r1 = new s0.a.c.k$b
            r1.<init>((s0.a.c.k) r3)
            java.util.Map<s0.a.a.c3.w, s0.a.c.d> r4 = r3.a2     // Catch:{ AnnotatedException -> 0x0183 }
            r15 = r25
            r14 = r30
            java.util.List r4 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(r0, r4, r15, r14)     // Catch:{ AnnotatedException -> 0x0183 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ AnnotatedException -> 0x0183 }
        L_0x0021:
            boolean r5 = r4.hasNext()     // Catch:{ AnnotatedException -> 0x0183 }
            if (r5 == 0) goto L_0x0033
            java.lang.Object r5 = r4.next()     // Catch:{ AnnotatedException -> 0x0183 }
            s0.a.c.d r5 = (s0.a.c.d) r5     // Catch:{ AnnotatedException -> 0x0183 }
            java.util.List<s0.a.c.d> r6 = r1.g     // Catch:{ AnnotatedException -> 0x0183 }
            r6.add(r5)     // Catch:{ AnnotatedException -> 0x0183 }
            goto L_0x0021
        L_0x0033:
            org.bouncycastle.jce.provider.CertStatus r13 = new org.bouncycastle.jce.provider.CertStatus
            r13.<init>()
            org.bouncycastle.jce.provider.ReasonsMask r16 = new org.bouncycastle.jce.provider.ReasonsMask
            r16.<init>()
            s0.a.c.k r1 = r1.a()
            r12 = 11
            r17 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x00a9
            s0.a.a.c3.s[] r11 = r0.s()     // Catch:{ Exception -> 0x009f }
            r0 = r4
            r10 = r5
            r18 = r10
        L_0x0051:
            int r4 = r11.length
            if (r10 >= r4) goto L_0x009b
            int r4 = r13.getCertStatus()
            if (r4 != r12) goto L_0x009b
            boolean r4 = r16.isAllReasons()
            if (r4 != 0) goto L_0x009b
            r5 = r11[r10]     // Catch:{ AnnotatedException -> 0x0085 }
            r4 = r22
            r6 = r1
            r7 = r24
            r8 = r25
            r9 = r26
            r19 = r10
            r10 = r27
            r20 = r11
            r11 = r28
            r3 = r12
            r12 = r13
            r21 = r13
            r13 = r16
            r14 = r29
            r15 = r30
            checkCRL(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ AnnotatedException -> 0x0083 }
            r18 = r17
            goto L_0x008d
        L_0x0083:
            r0 = move-exception
            goto L_0x008d
        L_0x0085:
            r0 = move-exception
            r19 = r10
            r20 = r11
            r3 = r12
            r21 = r13
        L_0x008d:
            int r10 = r19 + 1
            r15 = r25
            r14 = r30
            r12 = r3
            r11 = r20
            r13 = r21
            r3 = r23
            goto L_0x0051
        L_0x009b:
            r3 = r12
            r21 = r13
            goto L_0x00af
        L_0x009f:
            r0 = move-exception
            r1 = r0
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r2 = "Distribution points could not be read."
            r0.<init>(r2, r1)
            throw r0
        L_0x00a9:
            r3 = r12
            r21 = r13
            r0 = 0
            r18 = 0
        L_0x00af:
            int r1 = r21.getCertStatus()
            if (r1 != r3) goto L_0x00f3
            boolean r1 = r16.isAllReasons()
            if (r1 != 0) goto L_0x00f3
            s0.a.a.b3.c r1 = org.bouncycastle.jce.provider.PrincipalUtils.getIssuerPrincipal((java.security.cert.X509Certificate) r26)     // Catch:{ RuntimeException -> 0x00f5 }
            s0.a.a.c3.s r4 = new s0.a.a.c3.s     // Catch:{ AnnotatedException -> 0x00f2 }
            s0.a.a.c3.t r5 = new s0.a.a.c3.t     // Catch:{ AnnotatedException -> 0x00f2 }
            s0.a.a.c3.x r6 = new s0.a.a.c3.x     // Catch:{ AnnotatedException -> 0x00f2 }
            s0.a.a.c3.w r7 = new s0.a.a.c3.w     // Catch:{ AnnotatedException -> 0x00f2 }
            r8 = 4
            r7.<init>((int) r8, (s0.a.a.e) r1)     // Catch:{ AnnotatedException -> 0x00f2 }
            r6.<init>((s0.a.a.c3.w) r7)     // Catch:{ AnnotatedException -> 0x00f2 }
            r1 = 0
            r5.<init>(r1, r6)     // Catch:{ AnnotatedException -> 0x00f2 }
            r1 = 0
            r4.<init>(r5, r1, r1)     // Catch:{ AnnotatedException -> 0x00f2 }
            r1 = r22
            r2 = r4
            r13 = r3
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r21
            r10 = r16
            r11 = r29
            r12 = r30
            checkCRL(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ AnnotatedException -> 0x0100 }
            goto L_0x0103
        L_0x00f2:
            r0 = move-exception
        L_0x00f3:
            r13 = r3
            goto L_0x0101
        L_0x00f5:
            r0 = move-exception
            r13 = r3
            r1 = r0
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0100 }
            java.lang.String r2 = "Issuer from certificate for CRL could not be reencoded."
            r0.<init>(r2, r1)     // Catch:{ AnnotatedException -> 0x0100 }
            throw r0     // Catch:{ AnnotatedException -> 0x0100 }
        L_0x0100:
            r0 = move-exception
        L_0x0101:
            r17 = r18
        L_0x0103:
            if (r17 != 0) goto L_0x0112
            boolean r1 = r0 instanceof org.bouncycastle.jce.provider.AnnotatedException
            if (r1 == 0) goto L_0x010a
            throw r0
        L_0x010a:
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r2 = "No valid CRL found."
            r1.<init>(r2, r0)
            throw r1
        L_0x0112:
            int r0 = r21.getCertStatus()
            if (r0 != r13) goto L_0x013d
            boolean r0 = r16.isAllReasons()
            r1 = 12
            if (r0 != 0) goto L_0x012c
            int r0 = r21.getCertStatus()
            if (r0 != r13) goto L_0x012c
            r2 = r21
            r2.setCertStatus(r1)
            goto L_0x012e
        L_0x012c:
            r2 = r21
        L_0x012e:
            int r0 = r2.getCertStatus()
            if (r0 == r1) goto L_0x0135
            return
        L_0x0135:
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r1 = "Certificate status could not be determined."
            r0.<init>(r1)
            throw r0
        L_0x013d:
            r2 = r21
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss Z"
            r0.<init>(r1)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = j$.util.DesugarTimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Certificate revocation after "
            r1.append(r3)
            java.util.Date r3 = r2.getRevocationDate()
            java.lang.String r0 = r0.format(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = ", reason: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.S0(r0, r1)
            java.lang.String[] r1 = crlReasons
            int r2 = r2.getCertStatus()
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            r1.<init>(r0)
            throw r1
        L_0x0183:
            r0 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r2 = "No additional CRL locations could be decoded from CRL distribution point extension."
            r1.<init>(r2, r0)
            throw r1
        L_0x018c:
            r0 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r1 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r2 = "CRL distribution point extension could not be read."
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(s0.a.c.g, s0.a.c.k, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, s0.a.c.o.c):void");
    }

    public static PKIXPolicyNode prepareCertB(CertPath certPath, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, int i2) throws CertPathValidatorException {
        boolean z;
        CertPath certPath2 = certPath;
        int i3 = i;
        List[] listArr2 = listArr;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size() - i3;
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue(x509Certificate, POLICY_MAPPINGS));
            if (B == null) {
                return pKIXPolicyNode;
            }
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            boolean z2 = false;
            for (int i4 = 0; i4 < B.size(); i4++) {
                s0.a.a.s sVar = (s0.a.a.s) B.D(i4);
                String str = ((n) sVar.D(0)).d;
                String str2 = ((n) sVar.D(1)).d;
                if (!hashMap.containsKey(str)) {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(str2);
                    hashMap.put(str, hashSet2);
                    hashSet.add(str);
                } else {
                    ((Set) hashMap.get(str)).add(str2);
                }
            }
            Iterator it = hashSet.iterator();
            PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (i2 > 0) {
                    Iterator it2 = listArr2[size].iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = z2;
                            break;
                        }
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) it2.next();
                        if (pKIXPolicyNode3.getValidPolicy().equals(str3)) {
                            pKIXPolicyNode3.expectedPolicies = (Set) hashMap.get(str3);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        Iterator it3 = listArr2[size].iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) it3.next();
                            if ("2.5.29.32.0".equals(pKIXPolicyNode4.getValidPolicy())) {
                                Set set = null;
                                try {
                                    Enumeration E = ((s0.a.a.s) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).E();
                                    while (true) {
                                        if (!E.hasMoreElements()) {
                                            break;
                                        }
                                        try {
                                            i0 s = i0.s(E.nextElement());
                                            if ("2.5.29.32.0".equals(s.c.d)) {
                                                try {
                                                    set = CertPathValidatorUtilities.getQualifierSet(s.d);
                                                    break;
                                                } catch (CertPathValidatorException e) {
                                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", e, certPath2, i3);
                                                }
                                            }
                                        } catch (Exception e2) {
                                            throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath2, i3);
                                        }
                                    }
                                    Set set2 = set;
                                    boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES) : z2;
                                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) pKIXPolicyNode4.getParent();
                                    if ("2.5.29.32.0".equals(pKIXPolicyNode5.getValidPolicy())) {
                                        PKIXPolicyNode pKIXPolicyNode6 = r5;
                                        PKIXPolicyNode pKIXPolicyNode7 = new PKIXPolicyNode(new ArrayList(), size, (Set) hashMap.get(str3), pKIXPolicyNode5, set2, str3, contains);
                                        pKIXPolicyNode5.addChild(pKIXPolicyNode6);
                                        listArr2[size].add(pKIXPolicyNode6);
                                    }
                                } catch (AnnotatedException e3) {
                                    throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", e3, certPath2, i3);
                                }
                            }
                        }
                    }
                } else if (i2 <= 0) {
                    Iterator it4 = listArr2[size].iterator();
                    while (it4.hasNext()) {
                        PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) it4.next();
                        if (pKIXPolicyNode8.getValidPolicy().equals(str3)) {
                            ((PKIXPolicyNode) pKIXPolicyNode8.getParent()).removeChild(pKIXPolicyNode8);
                            it4.remove();
                            for (int i5 = size - 1; i5 >= 0; i5--) {
                                List list = listArr2[i5];
                                PKIXPolicyNode pKIXPolicyNode9 = pKIXPolicyNode2;
                                for (int i6 = 0; i6 < list.size(); i6++) {
                                    PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) list.get(i6);
                                    if (!pKIXPolicyNode10.hasChildren() && (pKIXPolicyNode9 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode9, listArr2, pKIXPolicyNode10)) == null) {
                                        break;
                                    }
                                }
                                pKIXPolicyNode2 = pKIXPolicyNode9;
                            }
                        }
                    }
                }
                z2 = false;
            }
            return pKIXPolicyNode2;
        } catch (AnnotatedException e4) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e4, certPath2, i3);
        }
    }

    public static void prepareNextCertA(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_MAPPINGS));
            if (B != null) {
                int i2 = 0;
                while (i2 < B.size()) {
                    try {
                        s0.a.a.s B2 = s0.a.a.s.B(B.D(i2));
                        n D = n.D(B2.D(0));
                        n D2 = n.D(B2.D(1));
                        if ("2.5.29.32.0".equals(D.d)) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        } else if (!"2.5.29.32.0".equals(D2.d)) {
                            i2++;
                        } else {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    public static void prepareNextCertG(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws CertPathValidatorException {
        y[] yVarArr;
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), NAME_CONSTRAINTS));
            y[] yVarArr2 = null;
            e0 e0Var = B != null ? B instanceof e0 ? (e0) B : new e0(s0.a.a.s.B(B)) : null;
            if (e0Var != null) {
                y[] yVarArr3 = e0Var.c;
                int i2 = 0;
                if (yVarArr3 != null) {
                    int length = yVarArr3.length;
                    yVarArr = new y[length];
                    System.arraycopy(yVarArr3, 0, yVarArr, 0, length);
                } else {
                    yVarArr = null;
                }
                if (yVarArr != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(yVarArr);
                    } catch (Exception e) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e, certPath, i);
                    }
                }
                y[] yVarArr4 = e0Var.d;
                if (yVarArr4 != null) {
                    int length2 = yVarArr4.length;
                    y[] yVarArr5 = new y[length2];
                    System.arraycopy(yVarArr4, 0, yVarArr5, 0, length2);
                    yVarArr2 = yVarArr5;
                }
                if (yVarArr2 != null) {
                    while (i2 != yVarArr2.length) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(yVarArr2[i2]);
                            i2++;
                        } catch (Exception e2) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e2, certPath, i);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e3, certPath, i);
        }
    }

    public static int prepareNextCertH1(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertI1(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (B != null) {
                Enumeration E = B.E();
                while (true) {
                    if (!E.hasMoreElements()) {
                        break;
                    }
                    try {
                        z B2 = z.B(E.nextElement());
                        if (B2.c == 0) {
                            int I = s0.a.a.k.C(B2, false).I();
                            if (I < i2) {
                                return I;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int prepareNextCertI2(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (B != null) {
                Enumeration E = B.E();
                while (true) {
                    if (!E.hasMoreElements()) {
                        break;
                    }
                    try {
                        z B2 = z.B(E.nextElement());
                        if (B2.c == 1) {
                            int I = s0.a.a.k.C(B2, false).I();
                            if (I < i2) {
                                return I;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r2 = r2.I();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int prepareNextCertJ(java.security.cert.CertPath r2, int r3, int r4) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r2.getCertificates()
            java.lang.Object r0 = r0.get(r3)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = INHIBIT_ANY_POLICY     // Catch:{ Exception -> 0x001e }
            s0.a.a.r r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch:{ Exception -> 0x001e }
            s0.a.a.k r2 = s0.a.a.k.B(r0)     // Catch:{ Exception -> 0x001e }
            if (r2 == 0) goto L_0x001d
            int r2 = r2.I()
            if (r2 >= r4) goto L_0x001d
            return r2
        L_0x001d:
            return r4
        L_0x001e:
            r4 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Inhibit any-policy extension cannot be decoded."
            r0.<init>(r1, r4, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertJ(java.security.cert.CertPath, int, int):int");
    }

    public static void prepareNextCertK(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            j s = j.s(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            if (s == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", (Throwable) null, certPath, i);
            } else if (!s.u()) {
                throw new CertPathValidatorException("Not a CA certificate", (Throwable) null, certPath, i);
            }
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", (Throwable) null, certPath, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r2 = (r2 = r2.t()).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int prepareNextCertM(java.security.cert.CertPath r2, int r3, int r4) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r2.getCertificates()
            java.lang.Object r0 = r0.get(r3)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = BASIC_CONSTRAINTS     // Catch:{ Exception -> 0x0024 }
            s0.a.a.r r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch:{ Exception -> 0x0024 }
            s0.a.a.c3.j r2 = s0.a.a.c3.j.s(r0)     // Catch:{ Exception -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            java.math.BigInteger r2 = r2.t()
            if (r2 == 0) goto L_0x0023
            int r2 = r2.intValue()
            if (r2 >= r4) goto L_0x0023
            return r2
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Basic constraints extension cannot be decoded."
            r0.<init>(r1, r4, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertM(java.security.cert.CertPath, int, int):int");
    }

    public static void prepareNextCertN(CertPath certPath, int i) throws CertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage == null) {
            return;
        }
        if (keyUsage.length <= 5 || !keyUsage[5]) {
            throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", (Throwable) null, certPath, i);
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, (Throwable) null, certPath, i);
        }
    }

    public static void processCRLB1(s sVar, Object obj, X509CRL x509crl) throws AnnotatedException {
        r extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        int i = 0;
        boolean z = extensionValue != null && b0.u(extensionValue).y;
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            x xVar = sVar.q;
            if (xVar != null) {
                w[] t = xVar.t();
                int i2 = 0;
                while (i < t.length) {
                    if (t[i].d == 4) {
                        try {
                            if (Arrays.equals(t[i].c.c().getEncoded(), encoded)) {
                                i2 = 1;
                            }
                        } catch (IOException e) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                        }
                    }
                    i++;
                }
                if (i2 != 0 && !z) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                } else if (i2 != 0) {
                    i = i2;
                } else {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
            } else if (PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                i = 1;
            }
            if (i == 0) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e2) {
            throw new AnnotatedException(a.V(e2, a.P0("Exception encoding CRL issuer: ")), e2);
        }
    }

    public static void processCRLB2(s sVar, Object obj, X509CRL x509crl) throws AnnotatedException {
        w[] wVarArr;
        try {
            b0 u = b0.u(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (u != null) {
                if (u.c != null) {
                    t tVar = b0.u(u).c;
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    if (tVar.d == 0) {
                        w[] t = x.s(tVar.c).t();
                        for (w add : t) {
                            arrayList.add(add);
                        }
                    }
                    if (tVar.d == 1) {
                        f fVar = new f(10);
                        try {
                            Enumeration E = s0.a.a.s.B(PrincipalUtils.getIssuerPrincipal(x509crl)).E();
                            while (E.hasMoreElements()) {
                                fVar.a((e) E.nextElement());
                            }
                            fVar.a(tVar.c);
                            arrayList.add(new w(s0.a.a.b3.c.s(new b1(fVar))));
                        } catch (Exception e) {
                            throw new AnnotatedException("Could not read CRL issuer.", e);
                        }
                    }
                    t tVar2 = sVar.c;
                    if (tVar2 != null) {
                        w[] wVarArr2 = null;
                        if (tVar2.d == 0) {
                            wVarArr2 = x.s(tVar2.c).t();
                        }
                        if (tVar2.d == 1) {
                            x xVar = sVar.q;
                            if (xVar != null) {
                                wVarArr = xVar.t();
                            } else {
                                wVarArr = new w[1];
                                try {
                                    wVarArr[0] = new w(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                                } catch (Exception e2) {
                                    throw new AnnotatedException("Could not read certificate issuer.", e2);
                                }
                            }
                            wVarArr2 = wVarArr;
                            for (int i = 0; i < wVarArr2.length; i++) {
                                Enumeration E2 = s0.a.a.s.B(wVarArr2[i].c.c()).E();
                                f fVar2 = new f(10);
                                while (E2.hasMoreElements()) {
                                    fVar2.a((e) E2.nextElement());
                                }
                                fVar2.a(tVar2.c);
                                wVarArr2[i] = new w(s0.a.a.b3.c.s(new b1(fVar2)));
                            }
                        }
                        if (wVarArr2 != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= wVarArr2.length) {
                                    break;
                                } else if (arrayList.contains(wVarArr2[i2])) {
                                    z = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (!z) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else {
                        x xVar2 = sVar.q;
                        if (xVar2 != null) {
                            w[] t2 = xVar2.t();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= t2.length) {
                                    break;
                                } else if (arrayList.contains(t2[i3])) {
                                    z = true;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (!z) {
                                throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                            }
                        } else {
                            throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                        }
                    }
                }
                try {
                    j s = j.s(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (u.d && s != null && s.u()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        } else if (u.q && (s == null || !s.u())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (u.Y1) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e3) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, k kVar) throws AnnotatedException {
        if (x509crl != null) {
            if (!x509crl.hasUnsupportedCriticalExtension()) {
                try {
                    String str = ISSUING_DISTRIBUTION_POINT;
                    b0 u = b0.u(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
                    if (!kVar.c2) {
                        return;
                    }
                    if (PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                        try {
                            b0 u2 = b0.u(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                            boolean z = false;
                            if (u != null ? u.equals(u2) : u2 == null) {
                                z = true;
                            }
                            if (z) {
                                try {
                                    String str2 = AUTHORITY_KEY_IDENTIFIER;
                                    r extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                                    try {
                                        r extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                                        if (extensionValue == null) {
                                            throw new AnnotatedException("CRL authority key identifier is null.");
                                        } else if (extensionValue2 == null) {
                                            throw new AnnotatedException("Delta CRL authority key identifier is null.");
                                        } else if (!extensionValue.w(extensionValue2)) {
                                            throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                                        }
                                    } catch (AnnotatedException e) {
                                        throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e);
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e2);
                                }
                            } else {
                                throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                            }
                        } catch (Exception e3) {
                            throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e3);
                        }
                    } else {
                        throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                    }
                } catch (Exception e4) {
                    throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
                }
            } else {
                throw new AnnotatedException("delta CRL has unsupported critical extensions");
            }
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, s sVar) throws AnnotatedException {
        ReasonsMask reasonsMask;
        ReasonsMask reasonsMask2;
        try {
            b0 u = b0.u(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (u != null && u.x != null && sVar.d != null) {
                return new ReasonsMask(sVar.d).intersect(new ReasonsMask(u.x));
            }
            if ((u == null || u.x == null) && sVar.d == null) {
                return ReasonsMask.allReasons;
            }
            if (sVar.d == null) {
                reasonsMask = ReasonsMask.allReasons;
            } else {
                reasonsMask = new ReasonsMask(sVar.d);
            }
            if (u == null) {
                reasonsMask2 = ReasonsMask.allReasons;
            } else {
                reasonsMask2 = new ReasonsMask(u.x);
            }
            return reasonsMask.intersect(reasonsMask2);
        } catch (Exception e) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e);
        }
    }

    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, k kVar, List list, c cVar) throws AnnotatedException {
        int i;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            AnnotatedException annotatedException = null;
            i iVar = new i((CertSelector) x509CertSelector.clone(), (i.a) null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, iVar, kVar.y);
                CertPathValidatorUtilities.findCertificates(linkedHashSet, iVar, kVar.b());
                linkedHashSet.add(x509Certificate);
                Iterator it = linkedHashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            k.b bVar = new k.b(kVar);
                            bVar.d = new i((CertSelector) x509CertSelector2.clone(), (i.a) null);
                            if (list.contains(x509Certificate2)) {
                                bVar.i = false;
                            } else {
                                bVar.i = true;
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new j.b(bVar.a()).a()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, cVar));
                        } catch (CertPathBuilderException e) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e);
                        } catch (CertPathValidatorException e2) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (Exception e3) {
                            throw new AnnotatedException(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                } else if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                } else {
                    throw annotatedException;
                }
            } catch (AnnotatedException e4) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (IOException e5) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e);
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e);
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, k kVar) throws AnnotatedException {
        if (kVar.c2 && x509crl != null) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCertA(CertPath certPath, k kVar, Date date, s0.a.c.f fVar, int i, PublicKey publicKey, boolean z, s0.a.a.b3.c cVar, X509Certificate x509Certificate) throws CertPathValidatorException {
        CertPath certPath2 = certPath;
        s0.a.c.f fVar2 = fVar;
        int i2 = i;
        s0.a.a.b3.c cVar2 = cVar;
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i2);
        if (!z) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, kVar.c());
            } catch (GeneralSecurityException e) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e, certPath, i2);
            }
        } else {
            PublicKey publicKey2 = publicKey;
        }
        try {
            Date date2 = date;
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, kVar.d2, certPath, i2);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (fVar2 != null) {
                    fVar2.initialize(new g(kVar, validCertDateFromValidityModel, certPath, i, x509Certificate, publicKey));
                    fVar2.check(x509Certificate2);
                }
                s0.a.a.b3.c issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (!issuerPrincipal.equals(cVar2)) {
                    throw new ExtCertPathValidatorException("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + cVar2 + ") of signing certificate.", (Throwable) null, certPath, i2);
                }
            } catch (CertificateExpiredException e2) {
                CertificateExpiredException certificateExpiredException = e2;
                StringBuilder P0 = a.P0("Could not validate certificate: ");
                P0.append(certificateExpiredException.getMessage());
                throw new ExtCertPathValidatorException(P0.toString(), certificateExpiredException, certPath, i2);
            } catch (CertificateNotYetValidException e3) {
                CertificateNotYetValidException certificateNotYetValidException = e3;
                StringBuilder P02 = a.P0("Could not validate certificate: ");
                P02.append(certificateNotYetValidException.getMessage());
                throw new ExtCertPathValidatorException(P02.toString(), certificateNotYetValidException, certPath, i2);
            }
        } catch (AnnotatedException e4) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e4, certPath, i2);
        }
    }

    public static void processCertBC(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i2 >= size && !z)) {
            try {
                s0.a.a.s B = s0.a.a.s.B(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(B);
                    pKIXNameConstraintValidator.checkExcludedDN(B);
                    try {
                        x s = x.s(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        s0.a.a.b3.c s2 = s0.a.a.b3.c.s(B);
                        n nVar = s0.a.a.b3.e.c.F;
                        int length = s2.y.length;
                        b[] bVarArr = new b[length];
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            b[] bVarArr2 = s2.y;
                            boolean z2 = true;
                            if (i4 == bVarArr2.length) {
                                break;
                            }
                            b bVar = bVarArr2[i4];
                            int length2 = bVar.c.c.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    z2 = false;
                                    break;
                                } else if (s0.a.a.b3.a.s(bVar.c.c[i6]).c.w(nVar)) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (z2) {
                                bVarArr[i5] = bVar;
                                i5++;
                            }
                            i4++;
                        }
                        if (i5 < length) {
                            b[] bVarArr3 = new b[i5];
                            System.arraycopy(bVarArr, 0, bVarArr3, 0, i5);
                            bVarArr = bVarArr3;
                        }
                        int i7 = 0;
                        while (i7 != bVarArr.length) {
                            w wVar = new w(1, ((s0.a.a.y) bVarArr[i7].s().d).e());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(wVar);
                                pKIXNameConstraintValidator.checkExcluded(wVar);
                                i7++;
                            } catch (PKIXNameConstraintValidatorException e) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (s != null) {
                            try {
                                w[] t = s.t();
                                while (i3 < t.length) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(t[i3]);
                                        pKIXNameConstraintValidator.checkExcluded(t[i3]);
                                        i3++;
                                    } catch (PKIXNameConstraintValidatorException e2) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                    }
                                }
                            } catch (Exception e3) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                            }
                        }
                    } catch (Exception e4) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (PKIXNameConstraintValidatorException e5) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (Exception e6) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i2, boolean z) throws CertPathValidatorException {
        String str;
        CertPath certPath2 = certPath;
        int i3 = i;
        Set set2 = set;
        List[] listArr2 = listArr;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size();
        int i4 = size - i3;
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (B == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration E = B.E();
            HashSet hashSet = new HashSet();
            while (E.hasMoreElements()) {
                i0 s = i0.s(E.nextElement());
                n nVar = s.c;
                hashSet.add(nVar.d);
                if (!"2.5.29.32.0".equals(nVar.d)) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(s.d);
                        if (!CertPathValidatorUtilities.processCertD1i(i4, listArr2, nVar, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i4, listArr2, nVar, qualifierSet);
                        }
                    } catch (CertPathValidatorException e) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e, certPath2, i3);
                    }
                }
            }
            if (set.isEmpty() || set2.contains("2.5.29.32.0")) {
                set.clear();
                set2.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object next : set) {
                    if (hashSet.contains(next)) {
                        hashSet2.add(next);
                    }
                }
                set.clear();
                set2.addAll(hashSet2);
            }
            if (i2 > 0 || ((i4 < size || z) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration E2 = B.E();
                while (true) {
                    if (!E2.hasMoreElements()) {
                        break;
                    }
                    i0 s2 = i0.s(E2.nextElement());
                    if ("2.5.29.32.0".equals(s2.c.d)) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(s2.d);
                        List list = listArr2[i4 - 1];
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i5);
                            for (Object next2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (next2 instanceof String) {
                                    str = (String) next2;
                                } else if (next2 instanceof n) {
                                    str = ((n) next2).d;
                                }
                                String str2 = str;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    PKIXPolicyNode pKIXPolicyNode3 = r6;
                                    PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i4, hashSet3, pKIXPolicyNode2, qualifierSet2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr2[i4].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                List list2 = listArr2[i6];
                for (int i7 = 0; i7 < list2.size(); i7++) {
                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list2.get(i7);
                    if (!pKIXPolicyNode6.hasChildren() && (pKIXPolicyNode5 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode5, listArr2, pKIXPolicyNode6)) == null) {
                        break;
                    }
                }
            }
            Set criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr2[i4];
                for (int i8 = 0; i8 < list3.size(); i8++) {
                    ((PKIXPolicyNode) list3.get(i8)).setCritical(contains);
                }
            }
            return pKIXPolicyNode5;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath2, i3);
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode) throws CertPathValidatorException {
        try {
            if (s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    public static void processCertF(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode, int i2) throws CertPathValidatorException {
        if (i2 <= 0 && pKIXPolicyNode == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", (Throwable) null, certPath, i);
        }
    }

    public static int wrapupCertA(int i, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i == 0) ? i : i - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            s0.a.a.s B = s0.a.a.s.B(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (B != null) {
                Enumeration E = B.E();
                while (E.hasMoreElements()) {
                    z zVar = (z) E.nextElement();
                    if (zVar.c == 0) {
                        try {
                            if (s0.a.a.k.C(zVar, false).I() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    public static void wrapupCertF(CertPath certPath, int i, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, (Throwable) null, certPath, i);
        }
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, k kVar, Set set, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode != null) {
            if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
                HashSet hashSet = new HashSet();
                for (List list : listArr) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i2);
                        if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                            Iterator children = pKIXPolicyNode2.getChildren();
                            while (children.hasNext()) {
                                PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                                if (!"2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                                    hashSet.add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) it.next();
                    if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                    }
                }
                if (pKIXPolicyNode != null) {
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        List list2 = listArr[i3];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i4);
                            if (!pKIXPolicyNode5.hasChildren()) {
                                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode5);
                            }
                        }
                    }
                }
            } else if (kVar.d()) {
                if (!set2.isEmpty()) {
                    HashSet hashSet2 = new HashSet();
                    for (List list3 : listArr) {
                        for (int i5 = 0; i5 < list3.size(); i5++) {
                            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list3.get(i5);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode6.getValidPolicy())) {
                                Iterator children2 = pKIXPolicyNode6.getChildren();
                                while (children2.hasNext()) {
                                    hashSet2.add(children2.next());
                                }
                            }
                        }
                    }
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        set2.contains(((PKIXPolicyNode) it2.next()).getValidPolicy());
                    }
                    for (int i6 = size - 1; i6 >= 0; i6--) {
                        List list4 = listArr[i6];
                        for (int i7 = 0; i7 < list4.size(); i7++) {
                            PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list4.get(i7);
                            if (!pKIXPolicyNode7.hasChildren()) {
                                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                            }
                        }
                    }
                } else {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", (Throwable) null, certPath, i);
                }
            }
            return pKIXPolicyNode;
        } else if (!kVar.d()) {
            return null;
        } else {
            throw new ExtCertPathValidatorException("Explicit policy requested but none available.", (Throwable) null, certPath, i);
        }
    }
}
