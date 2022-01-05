package org.bouncycastle.jcajce;

import java.security.cert.X509Certificate;
import s0.a.c.b;

public class BCFKSLoadStoreParameter extends b {

    public enum EncryptionAlgorithm {
        AES256_CCM,
        AES256_KWP
    }

    public enum MacAlgorithm {
        HmacSHA512,
        HmacSHA3_512
    }

    public enum SignatureAlgorithm {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    public interface a {
        boolean a(X509Certificate[] x509CertificateArr);
    }
}
