package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class OctetSequenceKey extends JWK {
    public final Base64URL e2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.q, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, (KeyStore) null);
        Base64URL base64URL4 = base64URL;
        if (base64URL4 != null) {
            this.e2 = base64URL4;
        } else {
            throw new IllegalArgumentException("The key value must not be null");
        }
    }

    public boolean b() {
        return true;
    }

    public Map<String, Object> d() {
        Map<String, Object> d = super.d();
        ((HashMap) d).put("k", this.e2.c);
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OctetSequenceKey) && super.equals(obj)) {
            return Objects.equals(this.e2, ((OctetSequenceKey) obj).e2);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.e2});
    }
}
