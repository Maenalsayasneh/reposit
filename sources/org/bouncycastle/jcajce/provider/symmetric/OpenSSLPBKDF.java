package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.b.f0.s;
import s0.a.b.k0.y0;
import s0.a.g.j;

public final class OpenSSLPBKDF {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = OpenSSLPBKDF.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            a.u(new StringBuilder(), PREFIX, "$PBKDF", configurableProvider, "SecretKeyFactory.PBKDF-OPENSSL");
        }
    }

    public static class PBKDF extends BaseSecretKeyFactory {
        public PBKDF() {
            super("PBKDF-OpenSSL", (n) null);
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    throw new InvalidKeySpecException("missing required salt");
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    StringBuilder P0 = a.P0("positive iteration count required: ");
                    P0.append(pBEKeySpec.getIterationCount());
                    throw new InvalidKeySpecException(P0.toString());
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    StringBuilder P02 = a.P0("positive key length required: ");
                    P02.append(pBEKeySpec.getKeyLength());
                    throw new InvalidKeySpecException(P02.toString());
                } else if (pBEKeySpec.getPassword().length != 0) {
                    s sVar = new s();
                    sVar.b(j.f(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
                    return new SecretKeySpec(((y0) sVar.generateDerivedParameters(pBEKeySpec.getKeyLength())).c, "OpenSSLPBKDF");
                } else {
                    throw new IllegalArgumentException("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    private OpenSSLPBKDF() {
    }
}
