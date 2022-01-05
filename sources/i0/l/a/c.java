package i0.l.a;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;

/* compiled from: JWEEncrypter */
public interface c extends d {
    a encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException;
}
