package com.nimbusds.jose.jwk;

import java.io.Serializable;
import java.util.Objects;

public final class KeyUse implements Serializable {
    public static final KeyUse c = new KeyUse("sig");
    public static final KeyUse d = new KeyUse("enc");
    public final String q;

    public KeyUse(String str) {
        this.q = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyUse)) {
            return false;
        }
        return Objects.equals(this.q, ((KeyUse) obj).q);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.q});
    }

    public String toString() {
        return this.q;
    }
}
