package i0.l.a;

import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;

/* compiled from: JWECryptoParts */
public final class a {
    public final JWEHeader a;
    public final Base64URL b;
    public final Base64URL c;
    public final Base64URL d;
    public final Base64URL e;

    public a(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this.a = jWEHeader;
        this.b = base64URL;
        this.c = base64URL2;
        this.d = base64URL3;
        this.e = base64URL4;
    }
}
