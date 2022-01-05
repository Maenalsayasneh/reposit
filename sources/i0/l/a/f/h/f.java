package i0.l.a.f.h;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.IntegerOverflowException;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;

/* compiled from: ContentCryptoProvider */
public class f {
    public static final Set<EncryptionMethod> a;
    public static final Map<Integer, Set<EncryptionMethod>> b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.q;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.x;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.y;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.a2;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.b2;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.c2;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.Y1;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.Z1;
        linkedHashSet.add(encryptionMethod8);
        a = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        b = Collections.unmodifiableMap(hashMap);
    }

    public static void a(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            if (encryptionMethod.d2 != h.J3(secretKey.getEncoded())) {
                throw new KeyLengthException("The Content Encryption Key (CEK) length for " + encryptionMethod + " must be " + encryptionMethod.d2 + " bits");
            }
        } catch (IntegerOverflowException e) {
            StringBuilder P0 = a.P0("The Content Encryption Key (CEK) is too long: ");
            P0.append(e.getMessage());
            throw new KeyLengthException(P0.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r8v14, types: [T] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i0.l.a.a b(com.nimbusds.jose.JWEHeader r7, byte[] r8, javax.crypto.SecretKey r9, com.nimbusds.jose.util.Base64URL r10, i0.l.a.g.b r11) throws com.nimbusds.jose.JOSEException {
        /*
            com.nimbusds.jose.EncryptionMethod r0 = r7.i2
            a(r9, r0)
            byte[] r3 = i0.j.f.p.h.n(r7, r8)
            com.nimbusds.jose.util.Base64URL r8 = r7.b()
            java.lang.String r8 = r8.c
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r4 = r8.getBytes(r0)
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r0 = com.nimbusds.jose.EncryptionMethod.q
            boolean r8 = r8.equals(r0)
            r0 = 16
            if (r8 != 0) goto L_0x0138
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.x
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0138
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.y
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0037
            goto L_0x0138
        L_0x0037:
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.a2
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x011a
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.b2
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x011a
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.c2
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0057
            goto L_0x011a
        L_0x0057:
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.Y1
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x007a
            com.nimbusds.jose.EncryptionMethod r8 = r7.i2
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.Z1
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x006c
            goto L_0x007a
        L_0x006c:
            com.nimbusds.jose.JOSEException r8 = new com.nimbusds.jose.JOSEException
            com.nimbusds.jose.EncryptionMethod r7 = r7.i2
            java.util.Set<com.nimbusds.jose.EncryptionMethod> r9 = a
            java.lang.String r7 = i0.j.f.p.h.w4(r7, r9)
            r8.<init>(r7)
            throw r8
        L_0x007a:
            java.security.SecureRandom r8 = r11.a()
            byte[] r0 = new byte[r0]
            r8.nextBytes(r0)
            java.security.Provider r8 = r11.b()
            java.security.Provider r11 = r11.d()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.Y1
            java.lang.String r2 = "epu"
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r1 instanceof java.lang.String
            r4 = 0
            if (r1 == 0) goto L_0x00aa
            com.nimbusds.jose.util.Base64URL r1 = new com.nimbusds.jose.util.Base64URL
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.Y1
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            byte[] r1 = r1.a()
            goto L_0x00ab
        L_0x00aa:
            r1 = r4
        L_0x00ab:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.Y1
            java.lang.String r5 = "epv"
            java.lang.Object r2 = r2.get(r5)
            boolean r2 = r2 instanceof java.lang.String
            if (r2 == 0) goto L_0x00c8
            com.nimbusds.jose.util.Base64URL r2 = new com.nimbusds.jose.util.Base64URL
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.Y1
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r4)
            byte[] r4 = r2.a()
        L_0x00c8:
            com.nimbusds.jose.EncryptionMethod r2 = r7.i2
            javax.crypto.SecretKey r2 = i0.l.a.f.h.i.a(r9, r2, r1, r4)
            byte[] r8 = i0.l.a.f.h.a.c(r2, r0, r3, r8)
            com.nimbusds.jose.EncryptionMethod r2 = r7.i2
            javax.crypto.SecretKey r9 = i0.l.a.f.h.i.b(r9, r2, r1, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.nimbusds.jose.util.Base64URL r2 = r7.b()
            java.lang.String r2 = r2.c
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            java.lang.String r3 = r10.c
            r1.append(r3)
            r1.append(r2)
            com.nimbusds.jose.util.Base64URL r3 = com.nimbusds.jose.util.Base64URL.d(r0)
            java.lang.String r3 = r3.c
            r1.append(r3)
            r1.append(r2)
            com.nimbusds.jose.util.Base64URL r2 = com.nimbusds.jose.util.Base64URL.d(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = i0.l.a.j.c.a
            byte[] r1 = r1.getBytes(r2)
            byte[] r9 = i0.j.f.p.h.N(r9, r1, r11)
            i0.l.a.f.h.b r11 = new i0.l.a.f.h.b
            r11.<init>(r8, r9)
            goto L_0x014f
        L_0x011a:
            i0.l.a.j.b r8 = new i0.l.a.j.b
            java.security.SecureRandom r0 = r11.a()
            r1 = 12
            byte[] r1 = new byte[r1]
            r0.nextBytes(r1)
            r8.<init>(r1)
            java.security.Provider r11 = r11.b()
            i0.l.a.f.h.b r11 = i0.j.f.p.h.y0(r9, r8, r3, r4, r11)
            T r8 = r8.a
            r0 = r8
            byte[] r0 = (byte[]) r0
            goto L_0x014f
        L_0x0138:
            java.security.SecureRandom r8 = r11.a()
            byte[] r0 = new byte[r0]
            r8.nextBytes(r0)
            java.security.Provider r5 = r11.b()
            java.security.Provider r6 = r11.d()
            r1 = r9
            r2 = r0
            i0.l.a.f.h.b r11 = i0.l.a.f.h.a.d(r1, r2, r3, r4, r5, r6)
        L_0x014f:
            i0.l.a.a r8 = new i0.l.a.a
            com.nimbusds.jose.util.Base64URL r4 = com.nimbusds.jose.util.Base64URL.d(r0)
            byte[] r9 = r11.a
            com.nimbusds.jose.util.Base64URL r5 = com.nimbusds.jose.util.Base64URL.d(r9)
            byte[] r9 = r11.b
            com.nimbusds.jose.util.Base64URL r6 = com.nimbusds.jose.util.Base64URL.d(r9)
            r1 = r8
            r2 = r7
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.a.f.h.f.b(com.nimbusds.jose.JWEHeader, byte[], javax.crypto.SecretKey, com.nimbusds.jose.util.Base64URL, i0.l.a.g.b):i0.l.a.a");
    }
}
