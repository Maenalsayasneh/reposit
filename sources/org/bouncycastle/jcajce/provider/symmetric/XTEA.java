package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e;
import s0.a.b.e0.f1;
import s0.a.b.h;

public final class XTEA {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "XTEA IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new f1());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XTEA", 128, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = XTEA.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.XTEA"), str, "$KeyGen", configurableProvider, "KeyGenerator.XTEA"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.XTEA");
        }
    }

    private XTEA() {
    }
}
