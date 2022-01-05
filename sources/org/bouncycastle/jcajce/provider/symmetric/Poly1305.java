package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.f0.w;
import s0.a.b.h0.l;

public class Poly1305 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new w());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new l());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Poly1305.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(sb, str, "$Mac", configurableProvider, "Mac.POLY1305"), str, "$KeyGen", configurableProvider, "KeyGenerator.POLY1305");
        }
    }

    private Poly1305() {
    }
}
