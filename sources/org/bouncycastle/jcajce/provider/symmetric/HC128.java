package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e0.z;
import s0.a.b.h;

public final class HC128 {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "HC128 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new z(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("HC128", 128, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HC128.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$Base", configurableProvider, "Cipher.HC128"), str, "$KeyGen", configurableProvider, "KeyGenerator.HC128"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.HC128");
        }
    }

    private HC128() {
    }
}
