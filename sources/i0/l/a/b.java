package i0.l.a;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;

/* compiled from: JWEDecrypter */
public interface b extends d {
    byte[] a(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException;
}
