package org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorSpi;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import s0.a.a.c3.o0;
import s0.a.c.o.a;
import s0.a.c.o.c;

public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final c helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }

    public PKIXCertPathValidatorSpi_8(boolean z) {
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

    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.security.cert.PKIXCertPathChecker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: s0.a.c.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.CertPathValidatorResult engineValidate(java.security.cert.CertPath r36, java.security.cert.CertPathParameters r37) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException {
        /*
            r35 = this;
            r1 = r35
            r11 = r36
            r0 = r37
            boolean r2 = r0 instanceof java.security.cert.PKIXParameters
            if (r2 == 0) goto L_0x0025
            s0.a.c.k$b r2 = new s0.a.c.k$b
            r3 = r0
            java.security.cert.PKIXParameters r3 = (java.security.cert.PKIXParameters) r3
            r2.<init>((java.security.cert.PKIXParameters) r3)
            boolean r3 = r0 instanceof s0.a.h.d
            if (r3 == 0) goto L_0x0020
            s0.a.h.d r0 = (s0.a.h.d) r0
            boolean r3 = r0.c2
            r2.k = r3
            int r0 = r0.b2
            r2.j = r0
        L_0x0020:
            s0.a.c.k r0 = r2.a()
            goto L_0x0034
        L_0x0025:
            boolean r2 = r0 instanceof s0.a.c.j
            if (r2 == 0) goto L_0x002e
            s0.a.c.j r0 = (s0.a.c.j) r0
            s0.a.c.k r0 = r0.c
            goto L_0x0034
        L_0x002e:
            boolean r2 = r0 instanceof s0.a.c.k
            if (r2 == 0) goto L_0x03c7
            s0.a.c.k r0 = (s0.a.c.k) r0
        L_0x0034:
            java.util.Set<java.security.cert.TrustAnchor> r2 = r0.e2
            if (r2 == 0) goto L_0x03bf
            java.util.List r12 = r36.getCertificates()
            int r13 = r12.size()
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x03b5
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.util.Date r14 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getValidityDate(r0, r2)
            java.security.cert.PKIXParameters r2 = r0.c
            java.util.Set r15 = r2.getInitialPolicies()
            int r2 = r12.size()     // Catch:{ AnnotatedException -> 0x039e }
            int r2 = r2 + -1
            java.lang.Object r2 = r12.get(r2)     // Catch:{ AnnotatedException -> 0x039e }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ AnnotatedException -> 0x039e }
            java.util.Set<java.security.cert.TrustAnchor> r3 = r0.e2     // Catch:{ AnnotatedException -> 0x039e }
            java.lang.String r4 = r0.c()     // Catch:{ AnnotatedException -> 0x039e }
            java.security.cert.TrustAnchor r10 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(r2, r3, r4)     // Catch:{ AnnotatedException -> 0x039e }
            if (r10 == 0) goto L_0x0390
            java.security.cert.X509Certificate r2 = r10.getTrustedCert()     // Catch:{ AnnotatedException -> 0x039e }
            checkCertificate(r2)     // Catch:{ AnnotatedException -> 0x039e }
            s0.a.c.k$b r2 = new s0.a.c.k$b
            r2.<init>((s0.a.c.k) r0)
            java.util.Set r0 = java.util.Collections.singleton(r10)
            r2.l = r0
            s0.a.c.k r0 = r2.a()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.security.cert.PKIXParameters r2 = r0.c
            java.util.List r2 = r2.getCertPathCheckers()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x0093:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r2.next()
            java.security.cert.PKIXCertPathChecker r4 = (java.security.cert.PKIXCertPathChecker) r4
            r4.init(r5)
            boolean r5 = r4 instanceof java.security.cert.PKIXRevocationChecker
            if (r5 == 0) goto L_0x00bf
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r4 instanceof s0.a.c.f
            if (r3 == 0) goto L_0x00b1
            r3 = r4
            s0.a.c.f r3 = (s0.a.c.f) r3
            goto L_0x0093
        L_0x00b1:
            org.bouncycastle.jce.provider.WrappedRevocationChecker r3 = new org.bouncycastle.jce.provider.WrappedRevocationChecker
            r3.<init>(r4)
            goto L_0x0093
        L_0x00b7:
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r2 = "only one PKIXRevocationChecker allowed"
            r0.<init>(r2)
            throw r0
        L_0x00bf:
            r9.add(r4)
            goto L_0x0093
        L_0x00c3:
            boolean r2 = r0.b2
            if (r2 == 0) goto L_0x00d0
            if (r3 != 0) goto L_0x00d0
            org.bouncycastle.jce.provider.ProvRevocationChecker r3 = new org.bouncycastle.jce.provider.ProvRevocationChecker
            s0.a.c.o.c r2 = r1.helper
            r3.<init>(r2)
        L_0x00d0:
            r16 = r3
            int r2 = r13 + 1
            java.util.ArrayList[] r8 = new java.util.ArrayList[r2]
            r3 = r5
        L_0x00d7:
            if (r3 >= r2) goto L_0x00e3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8[r3] = r4
            int r3 = r3 + 1
            goto L_0x00d7
        L_0x00e3:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.String r4 = "2.5.29.32.0"
            r3.add(r4)
            org.bouncycastle.jce.provider.PKIXPolicyNode r4 = new org.bouncycastle.jce.provider.PKIXPolicyNode
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            r19 = 0
            r21 = 0
            java.util.HashSet r22 = new java.util.HashSet
            r22.<init>()
            r24 = 0
            java.lang.String r23 = "2.5.29.32.0"
            r17 = r4
            r20 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3 = r8[r5]
            r3.add(r4)
            org.bouncycastle.jce.provider.PKIXNameConstraintValidator r7 = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator
            r7.<init>()
            java.util.HashSet r17 = new java.util.HashSet
            r17.<init>()
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x011f
            r3 = r5
            goto L_0x0120
        L_0x011f:
            r3 = r2
        L_0x0120:
            java.security.cert.PKIXParameters r6 = r0.c
            boolean r6 = r6.isAnyPolicyInhibited()
            if (r6 == 0) goto L_0x012a
            r6 = r5
            goto L_0x012b
        L_0x012a:
            r6 = r2
        L_0x012b:
            java.security.cert.PKIXParameters r5 = r0.c
            boolean r5 = r5.isPolicyMappingInhibited()
            if (r5 == 0) goto L_0x0134
            r2 = 0
        L_0x0134:
            java.security.cert.X509Certificate r5 = r10.getTrustedCert()
            if (r5 == 0) goto L_0x0143
            s0.a.a.b3.c r18 = org.bouncycastle.jce.provider.PrincipalUtils.getSubjectPrincipal(r5)     // Catch:{ RuntimeException -> 0x0386 }
            java.security.PublicKey r19 = r5.getPublicKey()     // Catch:{ RuntimeException -> 0x0386 }
            goto L_0x014b
        L_0x0143:
            s0.a.a.b3.c r18 = org.bouncycastle.jce.provider.PrincipalUtils.getCA(r10)     // Catch:{ RuntimeException -> 0x0386 }
            java.security.PublicKey r19 = r10.getCAPublicKey()     // Catch:{ RuntimeException -> 0x0386 }
        L_0x014b:
            r20 = r2
            s0.a.a.c3.b r2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getAlgorithmIdentifier(r19)     // Catch:{ CertPathValidatorException -> 0x037b }
            s0.a.a.n r2 = r2.c
            s0.a.c.i r2 = r0.d
            r21 = r3
            if (r2 == 0) goto L_0x0171
            r3 = 0
            java.lang.Object r3 = r12.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r2 = r2.r0(r3)
            if (r2 == 0) goto L_0x0167
            goto L_0x0171
        L_0x0167:
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r2 = "Target certificate in certification path does not match targetConstraints."
            r3 = 0
            r4 = 0
            r0.<init>(r2, r3, r11, r4)
            throw r0
        L_0x0171:
            int r2 = r12.size()
            int r2 = r2 + -1
            r3 = 0
            r37 = r15
            r15 = r13
            r32 = r6
            r6 = r2
            r2 = r32
            r33 = r19
            r19 = r4
            r4 = r21
            r21 = r33
            r34 = r18
            r18 = r5
            r5 = r20
            r20 = r34
        L_0x0190:
            if (r6 < 0) goto L_0x02f0
            int r3 = r13 - r6
            java.lang.Object r22 = r12.get(r6)
            r23 = r15
            r15 = r22
            java.security.cert.X509Certificate r15 = (java.security.cert.X509Certificate) r15
            int r22 = r12.size()
            r24 = r2
            int r2 = r22 + -1
            if (r6 != r2) goto L_0x01aa
            r2 = 1
            goto L_0x01ab
        L_0x01aa:
            r2 = 0
        L_0x01ab:
            r22 = r2
            checkCertificate(r15)     // Catch:{ AnnotatedException -> 0x02df }
            r25 = r24
            r2 = r36
            r24 = r12
            r12 = r3
            r3 = r0
            r26 = r0
            r0 = r4
            r4 = r14
            r27 = r14
            r14 = r5
            r5 = r16
            r28 = r6
            r29 = r14
            r14 = r7
            r7 = r21
            r30 = r8
            r8 = r22
            r31 = r9
            r9 = r20
            r22 = r10
            r10 = r18
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertA(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r1.isForCRLCheck
            r9 = r28
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertBC(r11, r9, r14, r2)
            boolean r8 = r1.isForCRLCheck
            r2 = r36
            r3 = r9
            r4 = r17
            r5 = r19
            r6 = r30
            r7 = r25
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertD(r2, r3, r4, r5, r6, r7, r8)
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertE(r11, r9, r2)
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertF(r11, r9, r2, r0)
            if (r12 == r13) goto L_0x02bd
            if (r15 == 0) goto L_0x0218
            int r3 = r15.getVersion()
            r4 = 1
            if (r3 != r4) goto L_0x0218
            if (r12 != r4) goto L_0x020f
            java.security.cert.X509Certificate r3 = r22.getTrustedCert()
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x020f
            goto L_0x02bd
        L_0x020f:
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r2 = "Version 1 certificates can't be used as CA ones."
            r3 = 0
            r0.<init>(r2, r3, r11, r9)
            throw r0
        L_0x0218:
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertA(r11, r9)
            r3 = r29
            r6 = r30
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(r11, r9, r6, r2, r3)
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertG(r11, r9, r14)
            int r0 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertH1(r11, r9, r0)
            int r3 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertH2(r11, r9, r3)
            r4 = r25
            int r4 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertH3(r11, r9, r4)
            int r0 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(r11, r9, r0)
            int r3 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(r11, r9, r3)
            int r4 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertJ(r11, r9, r4)
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertK(r11, r9)
            r5 = r23
            int r5 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertL(r11, r9, r5)
            int r5 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertM(r11, r9, r5)
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertN(r11, r9)
            java.util.Set r7 = r15.getCriticalExtensionOIDs()
            java.util.HashSet r8 = new java.util.HashSet
            if (r7 == 0) goto L_0x028e
            r8.<init>(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.KEY_USAGE
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_MAPPINGS
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.INHIBIT_ANY_POLICY
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.DELTA_CRL_INDICATOR
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.BASIC_CONSTRAINTS
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME
            r8.remove(r7)
            java.lang.String r7 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.NAME_CONSTRAINTS
            r8.remove(r7)
            goto L_0x0291
        L_0x028e:
            r8.<init>()
        L_0x0291:
            r7 = r31
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertO(r11, r9, r8, r7)
            s0.a.a.b3.c r8 = org.bouncycastle.jce.provider.PrincipalUtils.getSubjectPrincipal(r15)
            java.util.List r10 = r36.getCertificates()     // Catch:{ CertPathValidatorException -> 0x02b4 }
            s0.a.c.o.c r12 = r1.helper     // Catch:{ CertPathValidatorException -> 0x02b4 }
            java.security.PublicKey r10 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getNextWorkingKey(r10, r9, r12)     // Catch:{ CertPathValidatorException -> 0x02b4 }
            s0.a.a.c3.b r12 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getAlgorithmIdentifier(r10)
            s0.a.a.n r12 = r12.c
            r19 = r2
            r2 = r4
            r20 = r8
            r21 = r10
            r18 = r15
            goto L_0x02ca
        L_0x02b4:
            r0 = move-exception
            java.security.cert.CertPathValidatorException r2 = new java.security.cert.CertPathValidatorException
            java.lang.String r3 = "Next working key could not be retrieved."
            r2.<init>(r3, r0, r11, r9)
            throw r2
        L_0x02bd:
            r5 = r23
            r4 = r25
            r3 = r29
            r6 = r30
            r7 = r31
            r19 = r2
            r2 = r4
        L_0x02ca:
            r4 = r0
            r0 = r5
            r5 = r3
            int r3 = r9 + -1
            r8 = r6
            r9 = r7
            r7 = r14
            r10 = r22
            r12 = r24
            r14 = r27
            r6 = r3
            r3 = r15
            r15 = r0
            r0 = r26
            goto L_0x0190
        L_0x02df:
            r0 = move-exception
            r9 = r6
            r2 = r0
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r3 = r2.getMessage()
            java.lang.Throwable r2 = r2.getUnderlyingException()
            r0.<init>(r3, r2, r11, r9)
            throw r0
        L_0x02f0:
            r26 = r0
            r0 = r4
            r7 = r9
            r22 = r10
            r9 = r6
            r6 = r8
            int r0 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.wrapupCertA(r0, r3)
            int r5 = r9 + 1
            int r0 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.wrapupCertB(r11, r5, r0)
            java.util.Set r2 = r3.getCriticalExtensionOIDs()
            java.util.HashSet r4 = new java.util.HashSet
            if (r2 == 0) goto L_0x034c
            r4.<init>(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.KEY_USAGE
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_MAPPINGS
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.INHIBIT_ANY_POLICY
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.DELTA_CRL_INDICATOR
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.BASIC_CONSTRAINTS
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.NAME_CONSTRAINTS
            r4.remove(r2)
            java.lang.String r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS
            r4.remove(r2)
            s0.a.a.n r2 = s0.a.a.c3.u.i2
            java.lang.String r2 = r2.d
            r4.remove(r2)
            goto L_0x034f
        L_0x034c:
            r4.<init>()
        L_0x034f:
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.wrapupCertF(r11, r5, r7, r4)
            r2 = r36
            r15 = r3
            r3 = r26
            r4 = r37
            r7 = r19
            r8 = r17
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.wrapupCertG(r2, r3, r4, r5, r6, r7, r8)
            if (r0 > 0) goto L_0x036f
            if (r2 == 0) goto L_0x0366
            goto L_0x036f
        L_0x0366:
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r2 = "Path processing failed on policy."
            r3 = 0
            r0.<init>(r2, r3, r11, r9)
            throw r0
        L_0x036f:
            java.security.cert.PKIXCertPathValidatorResult r0 = new java.security.cert.PKIXCertPathValidatorResult
            java.security.PublicKey r3 = r15.getPublicKey()
            r4 = r22
            r0.<init>(r4, r2, r3)
            return r0
        L_0x037b:
            r0 = move-exception
            r2 = r0
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r3 = "Algorithm identifier of public key of trust anchor could not be read."
            r4 = -1
            r0.<init>(r3, r2, r11, r4)
            throw r0
        L_0x0386:
            r0 = move-exception
            r2 = -1
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r3 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r4 = "Subject of trust anchor could not be (re)encoded."
            r3.<init>(r4, r0, r11, r2)
            throw r3
        L_0x0390:
            r24 = r12
            r0 = -1
            java.security.cert.CertPathValidatorException r2 = new java.security.cert.CertPathValidatorException     // Catch:{ AnnotatedException -> 0x039c }
            java.lang.String r3 = "Trust anchor for certification path not found."
            r4 = 0
            r2.<init>(r3, r4, r11, r0)     // Catch:{ AnnotatedException -> 0x039c }
            throw r2     // Catch:{ AnnotatedException -> 0x039c }
        L_0x039c:
            r0 = move-exception
            goto L_0x03a1
        L_0x039e:
            r0 = move-exception
            r24 = r12
        L_0x03a1:
            java.security.cert.CertPathValidatorException r2 = new java.security.cert.CertPathValidatorException
            java.lang.String r3 = r0.getMessage()
            java.lang.Throwable r0 = r0.getUnderlyingException()
            int r4 = r24.size()
            int r4 = r4 + -1
            r2.<init>(r3, r0, r11, r4)
            throw r2
        L_0x03b5:
            java.security.cert.CertPathValidatorException r0 = new java.security.cert.CertPathValidatorException
            java.lang.String r2 = "Certification path is empty."
            r3 = 0
            r4 = -1
            r0.<init>(r2, r3, r11, r4)
            throw r0
        L_0x03bf:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "trustAnchors is null, this is not allowed for certification path validation."
            r0.<init>(r2)
            throw r0
        L_0x03c7:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "Parameters must be a "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.Class<java.security.cert.PKIXParameters> r3 = java.security.cert.PKIXParameters.class
            java.lang.String r4 = " instance."
            java.lang.String r2 = i0.d.a.a.a.Y(r3, r2, r4)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8.engineValidate(java.security.cert.CertPath, java.security.cert.CertPathParameters):java.security.cert.CertPathValidatorResult");
    }
}
