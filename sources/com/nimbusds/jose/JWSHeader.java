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

public final class JWSHeader extends CommonSEHeader {
    public static final Set<String> h2;
    public final boolean i2;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        a.x(hashSet, "x5t#S256", "x5c", "kid", "typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        h2 = Collections.unmodifiableSet(hashSet);
    }

    public JWSHeader(JWSAlgorithm jWSAlgorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, boolean z, Map<String, Object> map, Base64URL base64URL3) {
        super(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (!jWSAlgorithm.d.equals(Algorithm.c.d)) {
            this.i2 = z;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.nimbusds.jose.JWSHeader d(com.nimbusds.jose.util.Base64URL r20) throws java.text.ParseException {
        /*
            java.lang.String r0 = r20.c()
            java.util.Map r0 = i0.j.f.p.h.b3(r0)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.nimbusds.jose.Algorithm r2 = com.nimbusds.jose.CommonSEHeader.a(r0)
            boolean r3 = r2 instanceof com.nimbusds.jose.JWSAlgorithm
            if (r3 == 0) goto L_0x0169
            r5 = r2
            com.nimbusds.jose.JWSAlgorithm r5 = (com.nimbusds.jose.JWSAlgorithm) r5
            r2 = 1
            java.lang.String r3 = r5.d
            com.nimbusds.jose.Algorithm r4 = com.nimbusds.jose.Algorithm.c
            java.lang.String r4 = r4.d
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0161
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.util.Set r4 = r3.keySet()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r16 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
        L_0x003b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0158
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            r18 = r4
            java.lang.String r4 = "alg"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0052
            goto L_0x00ab
        L_0x0052:
            java.lang.String r4 = "typ"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0068
            java.lang.Object r2 = i0.j.f.p.h.h1(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00ab
            com.nimbusds.jose.JOSEObjectType r6 = new com.nimbusds.jose.JOSEObjectType
            r6.<init>(r2)
            goto L_0x00ab
        L_0x0068:
            java.lang.String r4 = "cty"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0078
            java.lang.Object r2 = i0.j.f.p.h.h1(r0, r2, r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00ab
        L_0x0078:
            java.lang.String r4 = "crit"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x008c
            java.util.List r2 = i0.j.f.p.h.E1(r0, r2)
            if (r2 == 0) goto L_0x00ab
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r2)
            goto L_0x00ab
        L_0x008c:
            java.lang.String r4 = "jku"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0099
            java.net.URI r9 = i0.j.f.p.h.I1(r0, r2)
            goto L_0x00ab
        L_0x0099:
            java.lang.String r4 = "jwk"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00ae
            java.util.Map r2 = i0.j.f.p.h.k1(r0, r2)
            if (r2 == 0) goto L_0x00ab
            com.nimbusds.jose.jwk.JWK r10 = com.nimbusds.jose.jwk.JWK.c(r2)
        L_0x00ab:
            r4 = r18
            goto L_0x003b
        L_0x00ae:
            java.lang.String r4 = "x5u"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00bb
            java.net.URI r11 = i0.j.f.p.h.I1(r0, r2)
            goto L_0x00ab
        L_0x00bb:
            java.lang.String r4 = "x5t"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00ce
            java.lang.Object r2 = i0.j.f.p.h.h1(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            com.nimbusds.jose.util.Base64URL r12 = com.nimbusds.jose.util.Base64URL.e(r2)
            goto L_0x00ab
        L_0x00ce:
            java.lang.String r4 = "x5t#S256"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r2 = i0.j.f.p.h.h1(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            com.nimbusds.jose.util.Base64URL r13 = com.nimbusds.jose.util.Base64URL.e(r2)
            goto L_0x00ab
        L_0x00e1:
            java.lang.String r4 = "x5c"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00f2
            java.util.List r2 = i0.j.f.p.h.j1(r0, r2)
            java.util.List r14 = i0.j.f.p.h.e4(r2)
            goto L_0x00ab
        L_0x00f2:
            java.lang.String r4 = "kid"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0102
            java.lang.Object r2 = i0.j.f.p.h.h1(r0, r2, r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            goto L_0x00ab
        L_0x0102:
            java.lang.String r4 = "b64"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0128
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            java.lang.Object r4 = i0.j.f.p.h.h1(r0, r2, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0119
            boolean r16 = r4.booleanValue()
            goto L_0x00ab
        L_0x0119:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "JSON object member with key \""
            java.lang.String r3 = "\" is missing or null"
            java.lang.String r1 = i0.d.a.a.a.o0(r1, r2, r3)
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        L_0x0128:
            java.lang.Object r4 = r3.get(r2)
            r19 = r0
            java.util.Set<java.lang.String> r0 = h2
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x014a
            if (r17 != 0) goto L_0x013d
            java.util.HashMap r17 = new java.util.HashMap
            r17.<init>()
        L_0x013d:
            r0 = r17
            r0.put(r2, r4)
            r17 = r0
            r4 = r18
            r0 = r19
            goto L_0x003b
        L_0x014a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The parameter name \""
            java.lang.String r3 = "\" matches a registered name"
            java.lang.String r1 = i0.d.a.a.a.o0(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0158:
            com.nimbusds.jose.JWSHeader r0 = new com.nimbusds.jose.JWSHeader
            r4 = r0
            r18 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0161:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The JWS algorithm \"alg\" cannot be \"none\""
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "Not a JWS header"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.JWSHeader.d(com.nimbusds.jose.util.Base64URL):com.nimbusds.jose.JWSHeader");
    }

    public Map<String, Object> c() {
        Map<String, Object> c = super.c();
        if (!this.i2) {
            ((HashMap) c).put("b64", Boolean.FALSE);
        }
        return c;
    }
}
