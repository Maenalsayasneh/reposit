package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.h;
import s0.a.b.h0.m;

public final class SipHash128 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash128", 128, new h());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new m());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new m(4, 8));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SipHash128.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Mac24", configurableProvider, "Mac.SIPHASH128-2-4");
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH128", a.M0(configurableProvider, "Mac.SIPHASH128-4-8", a.M0(configurableProvider, "Alg.Alias.Mac.SIPHASH128", "SIPHASH128-2-4", str, "$Mac48"), str, "$KeyGen"));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH128-2-4", "SIPHASH128");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH128-4-8", "SIPHASH128");
        }
    }

    private SipHash128() {
    }
}
