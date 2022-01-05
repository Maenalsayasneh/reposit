package i0.l.a.f;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;
import i0.j.f.p.h;
import i0.l.a.a;
import i0.l.a.f.h.c;
import i0.l.a.f.h.f;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: RSAEncrypter */
public class e extends c implements i0.l.a.c {
    public static final Set<JWEAlgorithm> a;
    public final RSAPublicKey b;

    static {
        Set<EncryptionMethod> set = f.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.q);
        linkedHashSet.add(JWEAlgorithm.x);
        linkedHashSet.add(JWEAlgorithm.y);
        a = Collections.unmodifiableSet(linkedHashSet);
    }

    public e(RSAPublicKey rSAPublicKey) {
        super(a, f.a);
        this.b = rSAPublicKey;
    }

    public a encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URL;
        AlgorithmParameters algorithmParameters;
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.d;
        EncryptionMethod encryptionMethod = jWEHeader.i2;
        SecureRandom a2 = getJCAContext().a();
        Set<EncryptionMethod> set = f.a;
        if (set.contains(encryptionMethod)) {
            byte[] bArr2 = new byte[(encryptionMethod.d2 / 8)];
            a2.nextBytes(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            if (jWEAlgorithm.equals(JWEAlgorithm.q)) {
                RSAPublicKey rSAPublicKey = this.b;
                try {
                    Cipher i1 = h.i1("RSA/ECB/PKCS1Padding", getJCAContext().c());
                    i1.init(1, rSAPublicKey);
                    base64URL = Base64URL.d(i1.doFinal(secretKeySpec.getEncoded()));
                } catch (IllegalBlockSizeException e) {
                    throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
                } catch (Exception e2) {
                    throw new JOSEException(i0.d.a.a.a.a0(e2, i0.d.a.a.a.P0("Couldn't encrypt Content Encryption Key (CEK): ")), e2);
                }
            } else if (jWEAlgorithm.equals(JWEAlgorithm.x)) {
                RSAPublicKey rSAPublicKey2 = this.b;
                try {
                    Cipher i12 = h.i1("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", getJCAContext().c());
                    i12.init(1, rSAPublicKey2, new SecureRandom());
                    base64URL = Base64URL.d(i12.doFinal(secretKeySpec.getEncoded()));
                } catch (IllegalBlockSizeException e3) {
                    throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e3);
                } catch (Exception e4) {
                    throw new JOSEException(e4.getMessage(), e4);
                }
            } else if (jWEAlgorithm.equals(JWEAlgorithm.y)) {
                RSAPublicKey rSAPublicKey3 = this.b;
                Provider c = getJCAContext().c();
                if (c == null) {
                    try {
                        algorithmParameters = AlgorithmParameters.getInstance("OAEP");
                    } catch (IllegalBlockSizeException e5) {
                        throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e5);
                    } catch (Exception e6) {
                        throw new JOSEException(e6.getMessage(), e6);
                    }
                } else {
                    algorithmParameters = AlgorithmParameters.getInstance("OAEP", c);
                }
                algorithmParameters.init(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
                Cipher i13 = h.i1("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", c);
                i13.init(1, rSAPublicKey3, algorithmParameters);
                base64URL = Base64URL.d(i13.doFinal(secretKeySpec.getEncoded()));
            } else {
                throw new JOSEException(h.x4(jWEAlgorithm, a));
            }
            return f.b(jWEHeader, bArr, secretKeySpec, base64URL, getJCAContext());
        }
        throw new JOSEException(h.w4(encryptionMethod, set));
    }
}
