package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J%\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;", "", "", "payload", "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "directoryServerId", "encrypt", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "dhKeyGenerator", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;)V", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: JweEcEncrypter.kt */
public final class JweEcEncrypter {
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    private final EphemeralKeyPairGenerator ephemeralKeyPairGenerator;

    private JweEcEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator2, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator) {
        this.ephemeralKeyPairGenerator = ephemeralKeyPairGenerator2;
        this.dhKeyGenerator = diffieHellmanKeyGenerator;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String encrypt(java.lang.String r42, java.security.interfaces.ECPublicKey r43, java.lang.String r44) throws java.text.ParseException, com.nimbusds.jose.JOSEException {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            r2 = r43
            r3 = r44
            java.lang.String r4 = "payload"
            m0.n.b.i.e(r0, r4)
            java.lang.String r4 = "acsPublicKey"
            m0.n.b.i.e(r2, r4)
            java.lang.String r4 = "directoryServerId"
            m0.n.b.i.e(r3, r4)
            int r4 = com.nimbusds.jwt.JWTClaimsSet.c
            java.util.Map r4 = i0.j.f.p.h.b3(r42)
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Set r7 = r4.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x002e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x011f
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r8.hashCode()
            int r10 = r8.hashCode()
            java.lang.String r11 = "sub"
            java.lang.String r12 = "nbf"
            java.lang.String r13 = "jti"
            java.lang.String r14 = "iss"
            java.lang.String r15 = "iat"
            java.lang.String r9 = "exp"
            r17 = r7
            java.lang.String r7 = "aud"
            switch(r10) {
                case 96944: goto L_0x008b;
                case 100893: goto L_0x0082;
                case 104028: goto L_0x0079;
                case 104585: goto L_0x0070;
                case 105567: goto L_0x0067;
                case 108850: goto L_0x005e;
                case 114240: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0094
        L_0x0055:
            boolean r10 = r8.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x0094
        L_0x005c:
            r10 = 6
            goto L_0x0095
        L_0x005e:
            boolean r10 = r8.equals(r12)
            if (r10 != 0) goto L_0x0065
            goto L_0x0094
        L_0x0065:
            r10 = 5
            goto L_0x0095
        L_0x0067:
            boolean r10 = r8.equals(r13)
            if (r10 != 0) goto L_0x006e
            goto L_0x0094
        L_0x006e:
            r10 = 4
            goto L_0x0095
        L_0x0070:
            boolean r10 = r8.equals(r14)
            if (r10 != 0) goto L_0x0077
            goto L_0x0094
        L_0x0077:
            r10 = 3
            goto L_0x0095
        L_0x0079:
            boolean r10 = r8.equals(r15)
            if (r10 != 0) goto L_0x0080
            goto L_0x0094
        L_0x0080:
            r10 = 2
            goto L_0x0095
        L_0x0082:
            boolean r10 = r8.equals(r9)
            if (r10 != 0) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            r10 = 1
            goto L_0x0095
        L_0x008b:
            boolean r10 = r8.equals(r7)
            if (r10 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r10 = 0
            goto L_0x0095
        L_0x0094:
            r10 = -1
        L_0x0095:
            r18 = 1000(0x3e8, double:4.94E-321)
            switch(r10) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a3;
                default: goto L_0x009a;
            }
        L_0x009a:
            java.lang.Object r7 = r4.get(r8)
            r6.put(r8, r7)
            goto L_0x011b
        L_0x00a3:
            java.lang.Object r7 = i0.j.f.p.h.h1(r4, r11, r5)
            java.lang.String r7 = (java.lang.String) r7
            r6.put(r11, r7)
            goto L_0x011b
        L_0x00ae:
            java.util.Date r7 = new java.util.Date
            long r8 = i0.j.f.p.h.u1(r4, r12)
            long r8 = r8 * r18
            r7.<init>(r8)
            r6.put(r12, r7)
            goto L_0x011b
        L_0x00bd:
            java.lang.Object r7 = i0.j.f.p.h.h1(r4, r13, r5)
            java.lang.String r7 = (java.lang.String) r7
            r6.put(r13, r7)
            goto L_0x011b
        L_0x00c7:
            java.lang.Object r7 = i0.j.f.p.h.h1(r4, r14, r5)
            java.lang.String r7 = (java.lang.String) r7
            r6.put(r14, r7)
            goto L_0x011b
        L_0x00d1:
            java.util.Date r7 = new java.util.Date
            long r8 = i0.j.f.p.h.u1(r4, r15)
            long r8 = r8 * r18
            r7.<init>(r8)
            r6.put(r15, r7)
            goto L_0x011b
        L_0x00e0:
            java.util.Date r7 = new java.util.Date
            long r10 = i0.j.f.p.h.u1(r4, r9)
            long r10 = r10 * r18
            r7.<init>(r10)
            r6.put(r9, r7)
            goto L_0x011b
        L_0x00ef:
            java.lang.Object r8 = r4.get(r7)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L_0x0109
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r9 = i0.j.f.p.h.h1(r4, r7, r5)
            java.lang.String r9 = (java.lang.String) r9
            r8.add(r9)
            r6.put(r7, r8)
            goto L_0x011b
        L_0x0109:
            boolean r9 = r8 instanceof java.util.List
            if (r9 == 0) goto L_0x0115
            java.util.List r8 = i0.j.f.p.h.E1(r4, r7)
            r6.put(r7, r8)
            goto L_0x011b
        L_0x0115:
            if (r8 != 0) goto L_0x011b
            r8 = 0
            r6.put(r7, r8)
        L_0x011b:
            r7 = r17
            goto L_0x002e
        L_0x011f:
            r8 = 0
            com.nimbusds.jwt.JWTClaimsSet r4 = new com.nimbusds.jwt.JWTClaimsSet
            r4.<init>(r6, r8)
            com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator r4 = r1.ephemeralKeyPairGenerator
            java.security.KeyPair r4 = r4.generate()
            com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator r5 = r1.dhKeyGenerator
            java.security.PrivateKey r6 = r4.getPrivate()
            java.lang.String r7 = "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey"
            java.util.Objects.requireNonNull(r6, r7)
            java.security.interfaces.ECPrivateKey r6 = (java.security.interfaces.ECPrivateKey) r6
            javax.crypto.SecretKey r2 = r5.generate(r2, r6, r3)
            r12 = 0
            r9 = 0
            com.nimbusds.jose.jwk.Curve r6 = com.nimbusds.jose.jwk.Curve.c
            java.security.PublicKey r3 = r4.getPublic()
            java.lang.String r4 = "null cannot be cast to non-null type java.security.interfaces.ECPublicKey"
            java.util.Objects.requireNonNull(r3, r4)
            java.security.interfaces.ECPublicKey r3 = (java.security.interfaces.ECPublicKey) r3
            java.security.spec.ECParameterSpec r4 = r3.getParams()
            java.security.spec.EllipticCurve r4 = r4.getCurve()
            java.security.spec.ECField r4 = r4.getField()
            int r4 = r4.getFieldSize()
            java.security.spec.ECPoint r5 = r3.getW()
            java.math.BigInteger r5 = r5.getAffineX()
            com.nimbusds.jose.util.Base64URL r7 = com.nimbusds.jose.jwk.ECKey.e(r4, r5)
            java.security.spec.ECParameterSpec r4 = r3.getParams()
            java.security.spec.EllipticCurve r4 = r4.getCurve()
            java.security.spec.ECField r4 = r4.getField()
            int r4 = r4.getFieldSize()
            java.security.spec.ECPoint r3 = r3.getW()
            java.math.BigInteger r3 = r3.getAffineY()
            com.nimbusds.jose.util.Base64URL r8 = com.nimbusds.jose.jwk.ECKey.e(r4, r3)
            if (r6 == 0) goto L_0x021c
            com.nimbusds.jose.jwk.ECKey r3 = new com.nimbusds.jose.jwk.ECKey     // Catch:{ IllegalArgumentException -> 0x0211 }
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0211 }
            r40 = 0
            r39 = 0
            r38 = 0
            r37 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r33 = 0
            r32 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            com.nimbusds.jose.JWEAlgorithm r4 = com.nimbusds.jose.JWEAlgorithm.b2
            com.nimbusds.jose.EncryptionMethod r20 = com.nimbusds.jose.EncryptionMethod.q
            java.lang.String r5 = r4.d
            com.nimbusds.jose.Algorithm r6 = com.nimbusds.jose.Algorithm.c
            java.lang.String r6 = r6.d
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0209
            if (r20 == 0) goto L_0x0201
            java.util.Map r3 = r3.d()
            java.lang.String r3 = i0.j.f.p.h.k4(r3)
            java.util.Map r3 = i0.j.f.p.h.b3(r3)
            com.nimbusds.jose.jwk.ECKey r31 = com.nimbusds.jose.jwk.ECKey.h(r3)
            com.nimbusds.jose.JWEHeader r3 = new com.nimbusds.jose.JWEHeader
            r18 = r3
            r19 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            com.nimbusds.jose.JWEObject r4 = new com.nimbusds.jose.JWEObject
            com.nimbusds.jose.Payload r5 = new com.nimbusds.jose.Payload
            r5.<init>((java.lang.String) r0)
            r4.<init>(r3, r5)
            i0.l.a.f.b r0 = new i0.l.a.f.b
            r0.<init>((javax.crypto.SecretKey) r2)
            r4.b(r0)
            java.lang.String r0 = r4.d()
            java.lang.String r2 = "jweObject.serialize()"
            m0.n.b.i.d(r0, r2)
            return r0
        L_0x0201:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The encryption method \"enc\" parameter must not be null"
            r0.<init>(r2)
            throw r0
        L_0x0209:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The JWE algorithm \"alg\" cannot be \"none\""
            r0.<init>(r2)
            throw r0
        L_0x0211:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x021c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The curve must not be null"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.security.JweEcEncrypter.encrypt(java.lang.String, java.security.interfaces.ECPublicKey, java.lang.String):java.lang.String");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JweEcEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator2, ErrorReporter errorReporter) {
        this(ephemeralKeyPairGenerator2, (DiffieHellmanKeyGenerator) new StripeDiffieHellmanKeyGenerator(errorReporter));
        i.e(ephemeralKeyPairGenerator2, "ephemeralKeyPairGenerator");
        i.e(errorReporter, "errorReporter");
    }
}
