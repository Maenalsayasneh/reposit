package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e;
import s0.a.b.e0.p0;
import s0.a.b.h;

public final class Rijndael {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Rijndael IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new p0();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Rijndael", 192, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Rijndael.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.RIJNDAEL"), str, "$KeyGen", configurableProvider, "KeyGenerator.RIJNDAEL"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.RIJNDAEL");
        }
    }

    private Rijndael() {
    }
}
