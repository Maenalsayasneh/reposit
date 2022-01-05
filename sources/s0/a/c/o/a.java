package s0.a.c.o;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class a implements c {
    public static volatile Provider a;
    public final Provider b;

    public a() {
        Provider provider;
        synchronized (a.class) {
            provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
            if (!(provider instanceof BouncyCastleProvider)) {
                if (a == null) {
                    a = new BouncyCastleProvider();
                }
                provider = a;
            }
        }
        this.b = provider;
    }

    public SecureRandom a(String str) {
        return SecureRandom.getInstance(str, this.b);
    }

    public MessageDigest b(String str) {
        return MessageDigest.getInstance(str, this.b);
    }

    public Cipher c(String str) {
        return Cipher.getInstance(str, this.b);
    }

    public Signature createSignature(String str) {
        return Signature.getInstance(str, this.b);
    }

    public Mac d(String str) {
        return Mac.getInstance(str, this.b);
    }

    public CertificateFactory e(String str) {
        return CertificateFactory.getInstance(str, this.b);
    }

    public AlgorithmParameters f(String str) {
        return AlgorithmParameters.getInstance(str, this.b);
    }

    public SecretKeyFactory g(String str) {
        return SecretKeyFactory.getInstance(str, this.b);
    }

    public KeyFactory h(String str) {
        return KeyFactory.getInstance(str, this.b);
    }
}
