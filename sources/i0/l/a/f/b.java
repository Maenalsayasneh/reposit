package i0.l.a.f;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import i0.l.a.a;
import i0.l.a.c;
import i0.l.a.f.h.f;
import i0.l.a.f.h.h;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: DirectEncrypter */
public class b extends h implements c {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this((SecretKey) new SecretKeySpec(octetSequenceKey.e2.a(), "AES"));
        Objects.requireNonNull(octetSequenceKey);
    }

    public a encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.d;
        if (jWEAlgorithm.equals(JWEAlgorithm.b2)) {
            EncryptionMethod encryptionMethod = jWEHeader.i2;
            if (encryptionMethod.d2 == i0.j.f.p.h.J3(getKey().getEncoded())) {
                return f.b(jWEHeader, bArr, getKey(), (Base64URL) null, getJCAContext());
            }
            throw new KeyLengthException(encryptionMethod.d2, encryptionMethod);
        }
        throw new JOSEException(i0.j.f.p.h.x4(jWEAlgorithm, h.SUPPORTED_ALGORITHMS));
    }

    public b(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
    }

    public b(byte[] bArr) throws KeyLengthException {
        this((SecretKey) new SecretKeySpec(bArr, "AES"));
    }
}
