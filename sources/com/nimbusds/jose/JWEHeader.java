package com.nimbusds.jose;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import i0.d.a.a.a;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class JWEHeader extends CommonSEHeader {
    public static final Set<String> h2;
    public final EncryptionMethod i2;
    public final JWK j2;
    public final CompressionAlgorithm k2;
    public final Base64URL l2;
    public final Base64URL m2;
    public final Base64URL n2;
    public final int o2;
    public final Base64URL p2;
    public final Base64URL q2;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        a.x(hashSet, "jwk", "x5u", "x5t", "x5t#S256");
        a.x(hashSet, "x5c", "kid", "typ", "cty");
        a.x(hashSet, "crit", "apu", "apv", "p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        h2 = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        EncryptionMethod encryptionMethod2 = encryptionMethod;
        JWK jwk3 = jwk2;
        if (algorithm.d.equals(Algorithm.c.d)) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        } else if (encryptionMethod2 == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        } else if (jwk3 == null || !jwk2.b()) {
            this.i2 = encryptionMethod2;
            this.j2 = jwk3;
            this.k2 = compressionAlgorithm;
            this.l2 = base64URL3;
            this.m2 = base64URL4;
            this.n2 = base64URL5;
            this.o2 = i;
            this.p2 = base64URL6;
            this.q2 = base64URL7;
        } else {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.nimbusds.jose.JWEHeader d(com.nimbusds.jose.util.Base64URL r30) throws java.text.ParseException {
        /*
            java.lang.String r0 = r30.c()
            java.util.Map r0 = i0.j.f.p.h.b3(r0)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.nimbusds.jose.Algorithm r2 = com.nimbusds.jose.CommonSEHeader.a(r0)
            boolean r3 = r2 instanceof com.nimbusds.jose.JWEAlgorithm
            r4 = 0
            if (r3 == 0) goto L_0x0280
            java.lang.String r3 = "enc"
            java.lang.Object r5 = i0.j.f.p.h.h1(r0, r3, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.q
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0027
        L_0x0025:
            r9 = r6
            goto L_0x007a
        L_0x0027:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.x
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0032
            goto L_0x0025
        L_0x0032:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.y
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x003d
            goto L_0x0025
        L_0x003d:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.a2
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0048
            goto L_0x0025
        L_0x0048:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.b2
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0053
            goto L_0x0025
        L_0x0053:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.c2
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x005e
            goto L_0x0025
        L_0x005e:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.Y1
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            com.nimbusds.jose.EncryptionMethod r6 = com.nimbusds.jose.EncryptionMethod.Z1
            java.lang.String r7 = r6.d
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0074
            goto L_0x0025
        L_0x0074:
            com.nimbusds.jose.EncryptionMethod r6 = new com.nimbusds.jose.EncryptionMethod
            r6.<init>(r5)
            goto L_0x0025
        L_0x007a:
            r8 = r2
            com.nimbusds.jose.JWEAlgorithm r8 = (com.nimbusds.jose.JWEAlgorithm) r8
            java.lang.String r2 = r8.d
            com.nimbusds.jose.Algorithm r5 = com.nimbusds.jose.Algorithm.c
            java.lang.String r5 = r5.d
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0278
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r25 = r4
            r10 = r6
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r27 = r26
            r28 = r27
        L_0x00b5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x026f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "alg"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00ca
            goto L_0x00b5
        L_0x00ca:
            boolean r7 = r3.equals(r6)
            if (r7 == 0) goto L_0x00d1
            goto L_0x00b5
        L_0x00d1:
            java.lang.String r7 = "typ"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00e7
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00b5
            com.nimbusds.jose.JOSEObjectType r10 = new com.nimbusds.jose.JOSEObjectType
            r10.<init>(r6)
            goto L_0x00b5
        L_0x00e7:
            java.lang.String r7 = "cty"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00f7
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x00b5
        L_0x00f7:
            java.lang.String r7 = "crit"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x010b
            java.util.List r6 = i0.j.f.p.h.E1(r0, r6)
            if (r6 == 0) goto L_0x00b5
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r6)
            goto L_0x00b5
        L_0x010b:
            java.lang.String r7 = "jku"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0118
            java.net.URI r13 = i0.j.f.p.h.I1(r0, r6)
            goto L_0x00b5
        L_0x0118:
            java.lang.String r7 = "jwk"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x012b
            java.util.Map r6 = i0.j.f.p.h.k1(r0, r6)
            if (r6 == 0) goto L_0x00b5
            com.nimbusds.jose.jwk.JWK r14 = com.nimbusds.jose.jwk.JWK.c(r6)
            goto L_0x00b5
        L_0x012b:
            java.lang.String r7 = "x5u"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0139
            java.net.URI r15 = i0.j.f.p.h.I1(r0, r6)
            goto L_0x00b5
        L_0x0139:
            java.lang.String r7 = "x5t"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x014d
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r16 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x014d:
            java.lang.String r7 = "x5t#S256"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0161
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r17 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x0161:
            java.lang.String r7 = "x5c"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0173
            java.util.List r6 = i0.j.f.p.h.j1(r0, r6)
            java.util.List r18 = i0.j.f.p.h.e4(r6)
            goto L_0x00b5
        L_0x0173:
            java.lang.String r7 = "kid"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0185
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            r19 = r6
            java.lang.String r19 = (java.lang.String) r19
            goto L_0x00b5
        L_0x0185:
            java.lang.String r7 = "epk"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0197
            java.util.Map r6 = i0.j.f.p.h.k1(r0, r6)
            com.nimbusds.jose.jwk.JWK r20 = com.nimbusds.jose.jwk.JWK.c(r6)
            goto L_0x00b5
        L_0x0197:
            java.lang.String r7 = "zip"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x01b0
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00b5
            com.nimbusds.jose.CompressionAlgorithm r7 = new com.nimbusds.jose.CompressionAlgorithm
            r7.<init>(r6)
            r21 = r7
            goto L_0x00b5
        L_0x01b0:
            java.lang.String r7 = "apu"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x01c4
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r22 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x01c4:
            java.lang.String r7 = "apv"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x01d8
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r23 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x01d8:
            java.lang.String r7 = "p2s"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x01ec
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r24 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x01ec:
            java.lang.String r7 = "p2c"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x021c
            java.lang.Class<java.lang.Number> r7 = java.lang.Number.class
            java.lang.Object r7 = i0.j.f.p.h.h1(r0, r6, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x020e
            int r25 = r7.intValue()
            if (r25 < 0) goto L_0x0206
            goto L_0x00b5
        L_0x0206:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The PBES2 count parameter must not be negative"
            r0.<init>(r1)
            throw r0
        L_0x020e:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "JSON object member with key \""
            java.lang.String r2 = "\" is missing or null"
            java.lang.String r1 = i0.d.a.a.a.o0(r1, r6, r2)
            r0.<init>(r1, r4)
            throw r0
        L_0x021c:
            java.lang.String r7 = "iv"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0230
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r26 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x0230:
            java.lang.String r7 = "tag"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0244
            java.lang.Object r6 = i0.j.f.p.h.h1(r0, r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            com.nimbusds.jose.util.Base64URL r27 = com.nimbusds.jose.util.Base64URL.e(r6)
            goto L_0x00b5
        L_0x0244:
            java.lang.Object r4 = r2.get(r6)
            java.util.Set<java.lang.String> r7 = h2
            boolean r7 = r7.contains(r6)
            if (r7 != 0) goto L_0x0261
            if (r28 != 0) goto L_0x0257
            java.util.HashMap r28 = new java.util.HashMap
            r28.<init>()
        L_0x0257:
            r7 = r28
            r7.put(r6, r4)
            r4 = 0
            r28 = r7
            goto L_0x00b5
        L_0x0261:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The parameter name \""
            java.lang.String r2 = "\" matches a registered name"
            java.lang.String r1 = i0.d.a.a.a.o0(r1, r6, r2)
            r0.<init>(r1)
            throw r0
        L_0x026f:
            com.nimbusds.jose.JWEHeader r0 = new com.nimbusds.jose.JWEHeader
            r7 = r0
            r29 = r30
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        L_0x0278:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The JWE algorithm \"alg\" cannot be \"none\""
            r0.<init>(r1)
            throw r0
        L_0x0280:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "The algorithm \"alg\" header parameter must be for encryption"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.JWEHeader.d(com.nimbusds.jose.util.Base64URL):com.nimbusds.jose.JWEHeader");
    }

    public Map<String, Object> c() {
        Map<String, Object> c = super.c();
        EncryptionMethod encryptionMethod = this.i2;
        if (encryptionMethod != null) {
            ((HashMap) c).put("enc", encryptionMethod.d);
        }
        JWK jwk = this.j2;
        if (jwk != null) {
            ((HashMap) c).put("epk", jwk.d());
        }
        CompressionAlgorithm compressionAlgorithm = this.k2;
        if (compressionAlgorithm != null) {
            ((HashMap) c).put("zip", compressionAlgorithm.d);
        }
        Base64URL base64URL = this.l2;
        if (base64URL != null) {
            ((HashMap) c).put("apu", base64URL.c);
        }
        Base64URL base64URL2 = this.m2;
        if (base64URL2 != null) {
            ((HashMap) c).put("apv", base64URL2.c);
        }
        Base64URL base64URL3 = this.n2;
        if (base64URL3 != null) {
            ((HashMap) c).put("p2s", base64URL3.c);
        }
        int i = this.o2;
        if (i > 0) {
            ((HashMap) c).put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.p2;
        if (base64URL4 != null) {
            ((HashMap) c).put("iv", base64URL4.c);
        }
        Base64URL base64URL5 = this.q2;
        if (base64URL5 != null) {
            ((HashMap) c).put("tag", base64URL5.c);
        }
        return c;
    }
}
