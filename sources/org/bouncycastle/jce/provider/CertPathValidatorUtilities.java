package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.StoreException;
import s0.a.a.b3.e.d;
import s0.a.a.c3.b;
import s0.a.a.c3.i0;
import s0.a.a.c3.m0;
import s0.a.a.c3.s;
import s0.a.a.c3.t;
import s0.a.a.c3.u;
import s0.a.a.c3.w;
import s0.a.a.c3.x;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.q;
import s0.a.a.r;
import s0.a.a.x0;
import s0.a.a.y;
import s0.a.c.e;
import s0.a.c.g;
import s0.a.c.i;
import s0.a.c.j;
import s0.a.c.k;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;
import s0.a.h.h;

public class CertPathValidatorUtilities {
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

    public static void checkCRLsNotEmpty(g gVar, Set set, Object obj) throws RecoverableCertPathValidatorException {
        if (!set.isEmpty()) {
            return;
        }
        if (obj instanceof h) {
            StringBuilder P0 = a.P0("No CRLs found for issuer \"");
            P0.append(((h) obj).c().b()[0]);
            P0.append("\"");
            throw new RecoverableCertPathValidatorException(P0.toString(), (Throwable) null, gVar.c, gVar.d);
        }
        StringBuilder P02 = a.P0("No CRLs found for issuer \"");
        P02.append(d.T.d(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj)));
        P02.append("\"");
        throw new RecoverableCertPathValidatorException(P02.toString(), (Throwable) null, gVar.c, gVar.d);
    }

    public static void findCertificates(LinkedHashSet linkedHashSet, i iVar, List list) throws AnnotatedException {
        for (Object next : list) {
            if (next instanceof s0.a.g.i) {
                try {
                    linkedHashSet.addAll(((s0.a.g.i) next).getMatches(iVar));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) next).getCertificates(new i.b(iVar)));
                } catch (CertStoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<s0.a.c.h> list2) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(AUTHORITY_KEY_IDENTIFIER);
                if (extensionValue != null) {
                    o oVar = s0.a.a.c3.i.s(o.B(extensionValue).c).c;
                    byte[] bArr = oVar != null ? oVar.c : null;
                    if (bArr != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new x0(bArr).getEncoded());
                    }
                }
            } catch (Exception unused) {
            }
            i iVar = new i((CertSelector) x509CertSelector.clone(), (i.a) null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                findCertificates(linkedHashSet, iVar, list);
                findCertificates(linkedHashSet, iVar, list2);
                return linkedHashSet;
            } catch (AnnotatedException e) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e);
            }
        } catch (Exception e2) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static Collection findTargets(j jVar) throws CertPathBuilderException {
        k kVar = jVar.c;
        i iVar = kVar.d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            findCertificates(linkedHashSet, iVar, kVar.y);
            findCertificates(linkedHashSet, iVar, kVar.b());
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            CertSelector certSelector = iVar.c;
            X509Certificate certificate = certSelector instanceof X509CertSelector ? ((X509CertSelector) certSelector).getCertificate() : null;
            if (certificate != null) {
                return Collections.singleton(certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (AnnotatedException e) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e);
        }
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[SYNTHETIC, Splitter:B:24:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0015 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate r8, java.util.Set r9, java.lang.String r10) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            java.security.cert.X509CertSelector r0 = new java.security.cert.X509CertSelector
            r0.<init>()
            javax.security.auth.x500.X500Principal r1 = r8.getIssuerX500Principal()
            r0.setSubject(r1)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L_0x0015:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x007a
            if (r3 != 0) goto L_0x007a
            java.lang.Object r3 = r9.next()
            java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3
            java.security.cert.X509Certificate r7 = r3.getTrustedCert()
            if (r7 == 0) goto L_0x003c
            java.security.cert.X509Certificate r7 = r3.getTrustedCert()
            boolean r7 = r0.match(r7)
            if (r7 == 0) goto L_0x006f
            java.security.cert.X509Certificate r6 = r3.getTrustedCert()
            java.security.PublicKey r6 = r6.getPublicKey()
            goto L_0x0070
        L_0x003c:
            javax.security.auth.x500.X500Principal r7 = r3.getCA()
            if (r7 == 0) goto L_0x006f
            java.lang.String r7 = r3.getCAName()
            if (r7 == 0) goto L_0x006f
            java.security.PublicKey r7 = r3.getCAPublicKey()
            if (r7 == 0) goto L_0x006f
            if (r5 != 0) goto L_0x0058
            byte[] r5 = r1.getEncoded()
            s0.a.a.b3.c r5 = s0.a.a.b3.c.s(r5)
        L_0x0058:
            javax.security.auth.x500.X500Principal r7 = r3.getCA()     // Catch:{ IllegalArgumentException -> 0x006f }
            byte[] r7 = r7.getEncoded()     // Catch:{ IllegalArgumentException -> 0x006f }
            s0.a.a.b3.c r7 = s0.a.a.b3.c.s(r7)     // Catch:{ IllegalArgumentException -> 0x006f }
            boolean r7 = r5.equals(r7)     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r7 == 0) goto L_0x006f
            java.security.PublicKey r6 = r3.getCAPublicKey()     // Catch:{ IllegalArgumentException -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r3 = r2
        L_0x0070:
            if (r6 == 0) goto L_0x0015
            verifyX509Certificate(r8, r6, r10)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0015
        L_0x0076:
            r4 = move-exception
            r3 = r2
            r6 = r3
            goto L_0x0015
        L_0x007a:
            if (r3 != 0) goto L_0x0087
            if (r4 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            org.bouncycastle.jce.provider.AnnotatedException r8 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r9 = "TrustAnchor found but certificate validation failed."
            r8.<init>(r9, r4)
            throw r8
        L_0x0087:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    public static List<s0.a.c.h> getAdditionalStoresFromAltNames(byte[] bArr, Map<w, s0.a.c.h> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        w[] t = x.s(o.B(bArr).c).t();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != t.length; i++) {
            s0.a.c.h hVar = map.get(t[i]);
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static List<s0.a.c.d> getAdditionalStoresFromCRLDistributionPoint(s0.a.a.c3.k kVar, Map<w, s0.a.c.d> map, Date date, c cVar) throws AnnotatedException {
        if (kVar == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            s[] s = kVar.s();
            ArrayList arrayList = new ArrayList();
            for (s sVar : s) {
                t tVar = sVar.c;
                if (tVar != null && tVar.d == 0) {
                    w[] t = x.s(tVar.c).t();
                    for (w wVar : t) {
                        s0.a.c.d dVar = map.get(wVar);
                        if (dVar != null) {
                            arrayList.add(dVar);
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && s0.a.g.g.b("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    CertificateFactory e = cVar.e("X.509");
                    for (int i = 0; i < s.length; i++) {
                        t tVar2 = s[i].c;
                        if (tVar2 != null && tVar2.d == 0) {
                            w[] t2 = x.s(tVar2.c).t();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= t2.length) {
                                    break;
                                }
                                w wVar2 = t2[i];
                                if (wVar2.d == 6) {
                                    try {
                                        s0.a.c.d crl = CrlCache.getCrl(e, date, new URI(((y) wVar2.c).e()));
                                        if (crl != null) {
                                            arrayList.add(crl);
                                        }
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    throw new AnnotatedException(a.a0(e2, a.P0("cannot create certificate factory: ")), e2);
                }
            }
            return arrayList;
        } catch (Exception e3) {
            throw new AnnotatedException("Distribution points could not be read.", e3);
        }
    }

    public static b getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return m0.s(publicKey.getEncoded()).c;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    public static void getCRLIssuersFromDistributionPoint(s sVar, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        x xVar = sVar.q;
        if (xVar != null) {
            w[] t = xVar.t();
            for (int i = 0; i < t.length; i++) {
                if (t[i].d == 4) {
                    try {
                        arrayList.add(s0.a.a.b3.c.s(t[i].c.c().getEncoded()));
                    } catch (IOException e) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                    }
                }
            }
        } else if (sVar.c != null) {
            for (Object add : collection) {
                arrayList.add(add);
            }
        } else {
            throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((s0.a.a.b3.c) it.next()).getEncoded());
            } catch (IOException e2) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e2);
            }
        }
    }

    public static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        X509CRLEntry x509CRLEntry;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                x509CRLEntry = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : PrincipalUtils.getX500Name(certificateIssuer))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (x509CRLEntry = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            s0.a.a.g gVar = null;
            if (x509CRLEntry.hasExtensions()) {
                if (!x509CRLEntry.hasUnsupportedCriticalExtension()) {
                    try {
                        gVar = s0.a.a.g.C(getExtensionValue(x509CRLEntry, u.Y1.d));
                    } catch (Exception e) {
                        throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                    }
                } else {
                    throw new AnnotatedException("CRL entry has unsupported critical extensions.");
                }
            }
            int E = gVar == null ? 0 : gVar.E();
            if (date.getTime() >= x509CRLEntry.getRevocationDate().getTime() || E == 0 || E == 1 || E == 2 || E == 10) {
                certStatus.setCertStatus(E);
                certStatus.setRevocationDate(x509CRLEntry.getRevocationDate());
            }
        } catch (CRLException e2) {
            throw new AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    public static Set getCompleteCRLs(g gVar, s sVar, Object obj, k kVar, Date date) throws AnnotatedException, RecoverableCertPathValidatorException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(sVar, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            e.b bVar = new e.b(x509CRLSelector);
            bVar.b = true;
            Set findCRLs = PKIXCRLUtil.findCRLs(new e(bVar, (e.a) null), date, kVar.b(), kVar.Z1);
            checkCRLsNotEmpty(gVar, findCRLs, obj);
            return findCRLs;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e);
        }
    }

    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<s0.a.c.d> list2, c cVar) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                r extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger D = extensionValue != null ? s0.a.a.k.B(extensionValue).D() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLSelector.setMinCRLNumber(D == null ? null : D.add(BigInteger.valueOf(1)));
                    e.b bVar = new e.b(x509CRLSelector);
                    bVar.d = h3.I(extensionValue2);
                    bVar.e = true;
                    bVar.c = D;
                    e eVar = new e(bVar, (e.a) null);
                    Set<X509CRL> findCRLs = PKIXCRLUtil.findCRLs(eVar, date, list, list2);
                    if (findCRLs.isEmpty() && s0.a.g.g.b("org.bouncycastle.x509.enableCRLDP")) {
                        try {
                            CertificateFactory e = cVar.e("X.509");
                            s[] s = s0.a.a.c3.k.t(extensionValue2).s();
                            for (int i = 0; i < s.length; i++) {
                                t tVar = s[i].c;
                                if (tVar != null && tVar.d == 0) {
                                    w[] t = x.s(tVar.c).t();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= t.length) {
                                            break;
                                        }
                                        w wVar = t[i];
                                        if (wVar.d == 6) {
                                            try {
                                                s0.a.c.d crl = CrlCache.getCrl(e, date, new URI(((y) wVar.c).e()));
                                                if (crl != null) {
                                                    findCRLs = PKIXCRLUtil.findCRLs(eVar, date, Collections.EMPTY_LIST, Collections.singletonList(crl));
                                                }
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            throw new AnnotatedException(a.a0(e2, a.P0("cannot create certificate factory: ")), e2);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : findCRLs) {
                        if (isDeltaCRL(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e3) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e3);
                }
            } catch (Exception e4) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e4);
            }
        } catch (IOException e5) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e5);
        }
    }

    public static r getExtensionValue(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    public static PublicKey getNextWorkingKey(List list, int i, c cVar) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i < list.size()) {
                PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
                if (publicKey2 instanceof DSAPublicKey) {
                    dSAPublicKey = (DSAPublicKey) publicKey2;
                } else {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
            } else {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return cVar.h("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static r getObject(String str, byte[] bArr) throws AnnotatedException {
        try {
            return r.x(o.B(bArr).c);
        } catch (Exception e) {
            throw new AnnotatedException(a.n0("exception processing extension ", str), e);
        }
    }

    public static final Set getQualifierSet(s0.a.a.s sVar) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (sVar == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        q qVar = new q(byteArrayOutputStream);
        Enumeration E = sVar.E();
        while (E.hasMoreElements()) {
            try {
                qVar.j((s0.a.a.e) E.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e) {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        return ((X509Certificate) obj).getSerialNumber();
    }

    public static Date getValidCertDateFromValidityModel(Date date, int i, CertPath certPath, int i2) throws AnnotatedException {
        if (1 != i || i2 <= 0) {
            return date;
        }
        int i3 = i2 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i3);
        if (i3 == 0) {
            s0.a.a.i iVar = null;
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i3)).getExtensionValue(s0.a.a.n2.a.d.d);
                if (extensionValue != null) {
                    iVar = s0.a.a.i.E(r.x(extensionValue));
                }
                if (iVar != null) {
                    try {
                        return iVar.D();
                    } catch (ParseException e) {
                        throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e);
                    }
                }
            } catch (IOException unused) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return x509Certificate.getNotBefore();
    }

    public static Date getValidityDate(k kVar, Date date) {
        Date date2 = kVar.q == null ? null : new Date(kVar.q.getTime());
        return date2 == null ? date : date2;
    }

    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        Set criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
    }

    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        try {
            return findTrustAnchor(x509Certificate, set, str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static void prepareNextCertB1(int i, List[] listArr, String str, Map map, X509Certificate x509Certificate) throws AnnotatedException, CertPathValidatorException {
        boolean z;
        boolean z2;
        Iterator it = listArr[i].iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) it.next();
            if (pKIXPolicyNode.getValidPolicy().equals(str)) {
                z2 = true;
                pKIXPolicyNode.expectedPolicies = (Set) map.get(str);
                break;
            }
        }
        if (!z2) {
            for (PKIXPolicyNode pKIXPolicyNode2 : listArr[i]) {
                if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                    Set set = null;
                    try {
                        Enumeration E = s0.a.a.s.B(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).E();
                        while (true) {
                            if (!E.hasMoreElements()) {
                                break;
                            }
                            try {
                                i0 s = i0.s(E.nextElement());
                                if ("2.5.29.32.0".equals(s.c.d)) {
                                    try {
                                        set = getQualifierSet(s.d);
                                        break;
                                    } catch (CertPathValidatorException e) {
                                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", e);
                                    }
                                }
                            } catch (Exception e2) {
                                throw new AnnotatedException("Policy information cannot be decoded.", e2);
                            }
                        }
                        Set set2 = set;
                        if (x509Certificate.getCriticalExtensionOIDs() != null) {
                            z = x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES);
                        }
                        boolean z3 = z;
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                        if ("2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                            PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i, (Set) map.get(str), pKIXPolicyNode3, set2, str, z3);
                            pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                            listArr[i].add(pKIXPolicyNode4);
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        throw new AnnotatedException("Certificate policies cannot be decoded.", e3);
                    }
                }
            }
        }
    }

    public static PKIXPolicyNode prepareNextCertB2(int i, List[] listArr, String str, PKIXPolicyNode pKIXPolicyNode) {
        Iterator it = listArr[i].iterator();
        while (it.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) it.next();
            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                ((PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                it.remove();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    List list = listArr[i2];
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list.get(i3);
                        if (!pKIXPolicyNode3.hasChildren() && (pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3)) == null) {
                            break;
                        }
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    public static boolean processCertD1i(int i, List[] listArr, n nVar, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i2);
            if (pKIXPolicyNode.getExpectedPolicies().contains(nVar.d)) {
                HashSet hashSet = new HashSet();
                hashSet.add(nVar.d);
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNode, set, nVar.d, false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    public static void processCertD1ii(int i, List[] listArr, n nVar, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i2);
            if ("2.5.29.32.0".equals(pKIXPolicyNode.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(nVar.d);
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNode, set, nVar.d, false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 == null) {
            for (int i = 0; i < listArr.length; i++) {
                listArr[i] = new ArrayList();
            }
            return null;
        }
        pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
        removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
        return pKIXPolicyNode;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }
}
