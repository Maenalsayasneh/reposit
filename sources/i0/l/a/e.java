package i0.l.a;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;

/* compiled from: JWSVerifier */
public interface e {
    boolean a(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException;
}
