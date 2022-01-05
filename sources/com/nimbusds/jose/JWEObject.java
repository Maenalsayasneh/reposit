package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import i0.l.a.a;
import i0.l.a.c;
import java.text.ParseException;

public class JWEObject extends JOSEObject {
    public Base64URL Y1;
    public Base64URL Z1;
    public State a2;
    public JWEHeader q;
    public Base64URL x;
    public Base64URL y;

    public enum State {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        if (jWEHeader != null) {
            this.q = jWEHeader;
            this.c = payload;
            this.x = null;
            this.Y1 = null;
            this.a2 = State.UNENCRYPTED;
            return;
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    public synchronized void b(c cVar) throws JOSEException {
        if (this.a2 == State.UNENCRYPTED) {
            c(cVar);
            try {
                a encrypt = cVar.encrypt(this.q, this.c.a());
                JWEHeader jWEHeader = encrypt.a;
                if (jWEHeader != null) {
                    this.q = jWEHeader;
                }
                this.x = encrypt.b;
                this.y = encrypt.c;
                this.Y1 = encrypt.d;
                this.Z1 = encrypt.e;
                this.a2 = State.ENCRYPTED;
            } catch (JOSEException e) {
                throw e;
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public final void c(c cVar) throws JOSEException {
        if (!cVar.supportedJWEAlgorithms().contains((JWEAlgorithm) this.q.d)) {
            StringBuilder P0 = i0.d.a.a.a.P0("The \"");
            P0.append((JWEAlgorithm) this.q.d);
            P0.append("\" algorithm is not supported by the JWE encrypter: Supported algorithms: ");
            P0.append(cVar.supportedJWEAlgorithms());
            throw new JOSEException(P0.toString());
        } else if (!cVar.supportedEncryptionMethods().contains(this.q.i2)) {
            StringBuilder P02 = i0.d.a.a.a.P0("The \"");
            P02.append(this.q.i2);
            P02.append("\" encryption method or key size is not supported by the JWE encrypter: Supported methods: ");
            P02.append(cVar.supportedEncryptionMethods());
            throw new JOSEException(P02.toString());
        }
    }

    public String d() {
        State state = this.a2;
        if (state == State.ENCRYPTED || state == State.DECRYPTED) {
            StringBuilder sb = new StringBuilder(this.q.b().c);
            sb.append('.');
            Base64URL base64URL = this.x;
            if (base64URL != null) {
                sb.append(base64URL.c);
            }
            sb.append('.');
            Base64URL base64URL2 = this.y;
            if (base64URL2 != null) {
                sb.append(base64URL2.c);
            }
            sb.append('.');
            sb.append(this.Y1.c);
            sb.append('.');
            Base64URL base64URL3 = this.Z1;
            if (base64URL3 != null) {
                sb.append(base64URL3.c);
            }
            return sb.toString();
        }
        throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
    }

    public JWEObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5) throws ParseException {
        if (base64URL != null) {
            try {
                this.q = JWEHeader.d(base64URL);
                if (base64URL2 == null || base64URL2.c.isEmpty()) {
                    this.x = null;
                } else {
                    this.x = base64URL2;
                }
                if (base64URL3 == null || base64URL3.c.isEmpty()) {
                    this.y = null;
                } else {
                    this.y = base64URL3;
                }
                if (base64URL4 != null) {
                    this.Y1 = base64URL4;
                    if (base64URL5 == null || base64URL5.c.isEmpty()) {
                        this.Z1 = null;
                    } else {
                        this.Z1 = base64URL5;
                    }
                    this.a2 = State.ENCRYPTED;
                    this.d = new Base64URL[]{base64URL, base64URL2, base64URL3, base64URL4, base64URL5};
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Invalid JWE header: ");
                P0.append(e.getMessage());
                throw new ParseException(P0.toString(), 0);
            }
        } else {
            throw new IllegalArgumentException("The first part must not be null");
        }
    }
}
