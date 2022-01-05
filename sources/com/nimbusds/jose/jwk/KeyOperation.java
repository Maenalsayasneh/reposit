package com.nimbusds.jose.jwk;

import i0.d.a.a.a;
import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public enum KeyOperation {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");
    
    private final String identifier;

    private KeyOperation(String str) {
        if (str != null) {
            this.identifier = str;
            return;
        }
        throw new IllegalArgumentException("The key operation identifier must not be null");
    }

    public static Set<KeyOperation> parse(List<String> list) throws ParseException {
        KeyOperation keyOperation;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String next : list) {
            if (next != null) {
                KeyOperation[] values = values();
                int i = 0;
                while (true) {
                    if (i >= 8) {
                        keyOperation = null;
                        break;
                    }
                    keyOperation = values[i];
                    if (next.equals(keyOperation.identifier())) {
                        break;
                    }
                    i++;
                }
                if (keyOperation != null) {
                    linkedHashSet.add(keyOperation);
                } else {
                    throw new ParseException(a.n0("Invalid JWK operation: ", next), 0);
                }
            }
        }
        return linkedHashSet;
    }

    public String identifier() {
        return this.identifier;
    }

    public String toString() {
        return identifier();
    }
}
