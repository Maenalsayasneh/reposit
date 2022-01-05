package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.h;
import s0.a.b.h0.n;

public final class SipHash {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new h());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new n());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new n(4, 8));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SipHash.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Mac24", configurableProvider, "Mac.SIPHASH-2-4");
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH", a.M0(configurableProvider, "Mac.SIPHASH-4-8", a.M0(configurableProvider, "Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4", str, "$Mac48"), str, "$KeyGen"));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }

    private SipHash() {
    }
}
