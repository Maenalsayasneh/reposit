package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import i0.d.a.a.a;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

public class JWSObject extends JOSEObject {
    public final AtomicReference<State> Y1;
    public final JWSHeader q;
    public final String x;
    public Base64URL y;

    public enum State {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) throws ParseException {
        String str;
        Payload payload = new Payload(base64URL2);
        AtomicReference<State> atomicReference = new AtomicReference<>();
        this.Y1 = atomicReference;
        if (base64URL != null) {
            try {
                JWSHeader d = JWSHeader.d(base64URL);
                this.q = d;
                this.c = payload;
                if (d.i2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d.b().c);
                    sb.append('.');
                    Payload payload2 = this.c;
                    Base64URL base64URL4 = payload2.q;
                    sb.append((base64URL4 == null ? Base64URL.d(payload2.a()) : base64URL4).c);
                    str = sb.toString();
                } else {
                    str = d.b().c + '.' + this.c.toString();
                }
                this.x = str;
                if (base64URL3 != null) {
                    this.y = base64URL3;
                    atomicReference.set(State.SIGNED);
                    if (d.i2) {
                        Base64URL[] base64URLArr = new Base64URL[3];
                        base64URLArr[0] = base64URL;
                        base64URLArr[1] = base64URL2 == null ? Base64URL.d(payload.a()) : base64URL2;
                        base64URLArr[2] = base64URL3;
                        this.d = base64URLArr;
                        return;
                    }
                    this.d = new Base64URL[]{base64URL, new Base64URL(""), base64URL3};
                    return;
                }
                throw new IllegalArgumentException("The third part must not be null");
            } catch (ParseException e) {
                StringBuilder P0 = a.P0("Invalid JWS header: ");
                P0.append(e.getMessage());
                throw new ParseException(P0.toString(), 0);
            }
        } else {
            throw new IllegalArgumentException("The first part must not be null");
        }
    }

    public final void b() {
        if (this.Y1.get() != State.SIGNED && this.Y1.get() != State.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }
}
