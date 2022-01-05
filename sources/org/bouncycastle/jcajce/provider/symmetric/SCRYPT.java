package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Objects;
import javax.crypto.SecretKey;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.q2.c;
import s0.a.c.n.p;
import s0.a.e.b.b0.c.h3;

public class SCRYPT {

    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int scheme;

        public BasePBKDF2(String str, int i) {
            super(str, c.y);
            this.scheme = i;
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof p) {
                Objects.requireNonNull((p) keySpec);
                if (h3.I((byte[]) null) != null) {
                    throw new IllegalArgumentException("Cost parameter N must be > 1.");
                }
                throw new IllegalArgumentException("Salt S must be provided.");
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SCRYPT.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$ScryptWithUTF8", configurableProvider, "SecretKeyFactory.SCRYPT");
            a.q(str, "$ScryptWithUTF8", configurableProvider, "SecretKeyFactory", c.y);
        }
    }

    public static class ScryptWithUTF8 extends BasePBKDF2 {
        public ScryptWithUTF8() {
            super("SCRYPT", 5);
        }
    }

    private SCRYPT() {
    }
}
