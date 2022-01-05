package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class OctetKeyPair extends JWK {
    public static final Set<Curve> e2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Curve.Y1, Curve.Z1, Curve.a2, Curve.b2})));
    public final Curve f2;
    public final Base64URL g2;
    public final byte[] h2;
    public final Base64URL i2;
    public final byte[] j2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.x, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, (KeyStore) null);
        Curve curve2 = curve;
        Base64URL base64URL4 = base64URL;
        if (curve2 == null) {
            throw new IllegalArgumentException("The curve must not be null");
        } else if (e2.contains(curve)) {
            this.f2 = curve2;
            if (base64URL4 != null) {
                this.g2 = base64URL4;
                this.h2 = base64URL.a();
                this.i2 = null;
                this.j2 = null;
                return;
            }
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        } else {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
    }

    public boolean b() {
        return this.i2 != null;
    }

    public Map<String, Object> d() {
        Map<String, Object> d = super.d();
        HashMap hashMap = (HashMap) d;
        hashMap.put("crv", this.f2.c2);
        hashMap.put("x", this.g2.c);
        Base64URL base64URL = this.i2;
        if (base64URL != null) {
            hashMap.put("d", base64URL.c);
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        OctetKeyPair octetKeyPair = (OctetKeyPair) obj;
        if (!Objects.equals(this.f2, octetKeyPair.f2) || !Objects.equals(this.g2, octetKeyPair.g2) || !Arrays.equals(this.h2, octetKeyPair.h2) || !Objects.equals(this.i2, octetKeyPair.i2) || !Arrays.equals(this.j2, octetKeyPair.j2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(super.hashCode()), this.f2, this.g2, this.i2};
        int hashCode = Arrays.hashCode(this.h2);
        return Arrays.hashCode(this.j2) + ((hashCode + (Objects.hash(objArr) * 31)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.x, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, (KeyStore) null);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        if (curve2 == null) {
            throw new IllegalArgumentException("The curve must not be null");
        } else if (e2.contains(curve)) {
            this.f2 = curve2;
            if (base64URL5 != null) {
                this.g2 = base64URL5;
                this.h2 = base64URL.a();
                this.i2 = base64URL2;
                this.j2 = base64URL2.a();
                return;
            }
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        } else {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
    }
}
