package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Requirement;
import java.io.Serializable;

public final class KeyType implements Serializable {
    public static final KeyType c = new KeyType("EC", Requirement.RECOMMENDED);
    public static final KeyType d = new KeyType("RSA", Requirement.REQUIRED);
    public static final KeyType q;
    public static final KeyType x;
    public final String y;

    static {
        Requirement requirement = Requirement.OPTIONAL;
        q = new KeyType("oct", requirement);
        x = new KeyType("OKP", requirement);
    }

    public KeyType(String str, Requirement requirement) {
        this.y = str;
    }

    public static KeyType a(String str) {
        if (str != null) {
            KeyType keyType = c;
            if (str.equals(keyType.y)) {
                return keyType;
            }
            KeyType keyType2 = d;
            if (str.equals(keyType2.y)) {
                return keyType2;
            }
            KeyType keyType3 = q;
            if (str.equals(keyType3.y)) {
                return keyType3;
            }
            KeyType keyType4 = x;
            if (str.equals(keyType4.y)) {
                return keyType4;
            }
            return new KeyType(str, (Requirement) null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }

    public boolean equals(Object obj) {
        return (obj instanceof KeyType) && this.y.equals(obj.toString());
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public String toString() {
        return this.y;
    }
}
