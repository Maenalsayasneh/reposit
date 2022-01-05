package com.nimbusds.jose.jwk;

import com.nimbusds.jose.util.Base64URL;
import i0.h.a.b.h.f.n;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class RSAKey extends JWK {
    public final Base64URL e2;
    public final Base64URL f2;
    public final Base64URL g2;
    public final Base64URL h2;
    public final Base64URL i2;
    public final Base64URL j2;
    public final Base64URL k2;
    public final Base64URL l2;
    public final List<OtherPrimesInfo> m2;
    public final PrivateKey n2;

    public static class OtherPrimesInfo implements Serializable {
        public final Base64URL c;
        public final Base64URL d;
        public final Base64URL q;

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL != null) {
                this.c = base64URL;
                if (base64URL2 != null) {
                    this.d = base64URL2;
                    if (base64URL3 != null) {
                        this.q = base64URL3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RSAKey(com.nimbusds.jose.util.Base64URL r18, com.nimbusds.jose.util.Base64URL r19, com.nimbusds.jose.util.Base64URL r20, com.nimbusds.jose.util.Base64URL r21, com.nimbusds.jose.util.Base64URL r22, com.nimbusds.jose.util.Base64URL r23, com.nimbusds.jose.util.Base64URL r24, com.nimbusds.jose.util.Base64URL r25, java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> r26, java.security.PrivateKey r27, com.nimbusds.jose.jwk.KeyUse r28, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> r29, com.nimbusds.jose.Algorithm r30, java.lang.String r31, java.net.URI r32, com.nimbusds.jose.util.Base64URL r33, com.nimbusds.jose.util.Base64URL r34, java.util.List<com.nimbusds.jose.util.Base64> r35, java.security.KeyStore r36) {
        /*
            r17 = this;
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r21
            r15 = r22
            r10 = r23
            r9 = r24
            r8 = r25
            com.nimbusds.jose.jwk.KeyType r1 = com.nimbusds.jose.jwk.KeyType.d
            r16 = 0
            r0 = r17
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x0122
            r11.e2 = r12
            if (r13 == 0) goto L_0x011a
            r11.f2 = r13
            java.util.List r0 = r17.a()
            if (r0 == 0) goto L_0x007a
            java.util.List r0 = r17.a()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.util.List r0 = r17.a()     // Catch:{ ClassCastException -> 0x006f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ClassCastException -> 0x006f }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ ClassCastException -> 0x006f }
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch:{ ClassCastException -> 0x006f }
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0     // Catch:{ ClassCastException -> 0x006f }
            java.math.BigInteger r2 = r19.b()
            java.math.BigInteger r3 = r0.getPublicExponent()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0063
            goto L_0x006f
        L_0x0063:
            java.math.BigInteger r1 = r18.b()
            java.math.BigInteger r0 = r0.getModulus()
            boolean r1 = r1.equals(r0)
        L_0x006f:
            if (r1 == 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters"
            r0.<init>(r1)
            throw r0
        L_0x007a:
            r0 = r20
            r11.g2 = r0
            r0 = 0
            if (r14 == 0) goto L_0x00a9
            if (r15 == 0) goto L_0x00a9
            r1 = r23
            r2 = r24
            if (r1 == 0) goto L_0x00ad
            r3 = r25
            if (r2 == 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            r11.h2 = r14
            r11.i2 = r15
            r11.j2 = r1
            r11.k2 = r2
            r11.l2 = r3
            if (r26 == 0) goto L_0x00a2
            java.util.List r1 = java.util.Collections.unmodifiableList(r26)
            r11.m2 = r1
            goto L_0x00e7
        L_0x00a2:
            java.util.List r1 = java.util.Collections.emptyList()
            r11.m2 = r1
            goto L_0x00e7
        L_0x00a9:
            r1 = r23
            r2 = r24
        L_0x00ad:
            r3 = r25
        L_0x00af:
            if (r14 != 0) goto L_0x00cc
            if (r15 != 0) goto L_0x00cc
            if (r1 != 0) goto L_0x00cc
            if (r2 != 0) goto L_0x00cc
            if (r3 != 0) goto L_0x00cc
            if (r26 != 0) goto L_0x00cc
            r11.h2 = r0
            r11.i2 = r0
            r11.j2 = r0
            r11.k2 = r0
            r11.l2 = r0
            java.util.List r1 = java.util.Collections.emptyList()
            r11.m2 = r1
            goto L_0x00e7
        L_0x00cc:
            if (r14 != 0) goto L_0x00ea
            if (r15 != 0) goto L_0x00ea
            if (r1 != 0) goto L_0x00ea
            if (r2 != 0) goto L_0x00ea
            if (r3 == 0) goto L_0x00d7
            goto L_0x00ea
        L_0x00d7:
            r11.h2 = r0
            r11.i2 = r0
            r11.j2 = r0
            r11.k2 = r0
            r11.l2 = r0
            java.util.List r1 = java.util.Collections.emptyList()
            r11.m2 = r1
        L_0x00e7:
            r11.n2 = r0
            return
        L_0x00ea:
            if (r14 == 0) goto L_0x0112
            if (r15 == 0) goto L_0x010a
            if (r1 == 0) goto L_0x0102
            if (r2 != 0) goto L_0x00fa
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first CRT coefficient must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0102:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null"
            r0.<init>(r1)
            throw r0
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The second prime factor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0112:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first prime factor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x011a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The public exponent value must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0122:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The modulus value must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.jwk.RSAKey.<init>(com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, java.util.List, java.security.PrivateKey, com.nimbusds.jose.jwk.KeyUse, java.util.Set, com.nimbusds.jose.Algorithm, java.lang.String, java.net.URI, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.util.Base64URL, java.util.List, java.security.KeyStore):void");
    }

    public boolean b() {
        return (this.g2 == null && this.h2 == null && this.n2 == null) ? false : true;
    }

    public Map<String, Object> d() {
        Map<String, Object> d = super.d();
        HashMap hashMap = (HashMap) d;
        hashMap.put(n.a, this.e2.c);
        hashMap.put("e", this.f2.c);
        Base64URL base64URL = this.g2;
        if (base64URL != null) {
            hashMap.put("d", base64URL.c);
        }
        Base64URL base64URL2 = this.h2;
        if (base64URL2 != null) {
            hashMap.put("p", base64URL2.c);
        }
        Base64URL base64URL3 = this.i2;
        if (base64URL3 != null) {
            hashMap.put("q", base64URL3.c);
        }
        Base64URL base64URL4 = this.j2;
        if (base64URL4 != null) {
            hashMap.put("dp", base64URL4.c);
        }
        Base64URL base64URL5 = this.k2;
        if (base64URL5 != null) {
            hashMap.put("dq", base64URL5.c);
        }
        Base64URL base64URL6 = this.l2;
        if (base64URL6 != null) {
            hashMap.put("qi", base64URL6.c);
        }
        List<OtherPrimesInfo> list = this.m2;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (OtherPrimesInfo next : this.m2) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("r", next.c.c);
                hashMap2.put("d", next.d.c);
                hashMap2.put("t", next.q.c);
                arrayList.add(hashMap2);
            }
            hashMap.put("oth", arrayList);
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAKey) || !super.equals(obj)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) obj;
        if (!Objects.equals(this.e2, rSAKey.e2) || !Objects.equals(this.f2, rSAKey.f2) || !Objects.equals(this.g2, rSAKey.g2) || !Objects.equals(this.h2, rSAKey.h2) || !Objects.equals(this.i2, rSAKey.i2) || !Objects.equals(this.j2, rSAKey.j2) || !Objects.equals(this.k2, rSAKey.k2) || !Objects.equals(this.l2, rSAKey.l2) || !Objects.equals(this.m2, rSAKey.m2) || !Objects.equals(this.n2, rSAKey.n2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.e2, this.f2, this.g2, this.h2, this.i2, this.j2, this.k2, this.l2, this.m2, this.n2});
    }
}
