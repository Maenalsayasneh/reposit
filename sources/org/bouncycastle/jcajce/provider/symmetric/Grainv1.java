package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e0.y;
import s0.a.b.h;

public final class Grainv1 {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Grainv1 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new y(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grainv1", 80, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Grainv1.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$Base", configurableProvider, "Cipher.Grainv1"), str, "$KeyGen", configurableProvider, "KeyGenerator.Grainv1"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.Grainv1");
        }
    }

    private Grainv1() {
    }
}
