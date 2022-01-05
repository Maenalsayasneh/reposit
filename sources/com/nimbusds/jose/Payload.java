package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import i0.l.a.j.c;
import java.io.Serializable;

public final class Payload implements Serializable {
    public final String c;
    public final byte[] d;
    public final Base64URL q;

    public enum Origin {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public Payload(String str) {
        if (str != null) {
            this.c = str;
            this.d = null;
            this.q = null;
            Origin origin = Origin.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    public byte[] a() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return bArr;
        }
        Base64URL base64URL = this.q;
        if (base64URL != null) {
            return base64URL.a();
        }
        String payload = toString();
        if (payload != null) {
            return payload.getBytes(c.a);
        }
        return null;
    }

    public String toString() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.d;
        if (bArr == null) {
            Base64URL base64URL = this.q;
            if (base64URL != null) {
                return base64URL.c();
            }
            return null;
        } else if (bArr != null) {
            return new String(bArr, c.a);
        } else {
            return null;
        }
    }

    public Payload(byte[] bArr) {
        if (bArr != null) {
            this.c = null;
            this.d = bArr;
            this.q = null;
            Origin origin = Origin.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public Payload(Base64URL base64URL) {
        if (base64URL != null) {
            this.c = null;
            this.d = null;
            this.q = base64URL;
            Origin origin = Origin.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
