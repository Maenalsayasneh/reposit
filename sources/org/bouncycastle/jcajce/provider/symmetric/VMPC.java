package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e0.c1;
import s0.a.b.h;
import s0.a.b.h0.p;

public final class VMPC {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new c1(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC", 128, new h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new p());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = VMPC.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$Base", configurableProvider, "Cipher.VMPC"), str, "$KeyGen", configurableProvider, "KeyGenerator.VMPC"), str, "$Mac", configurableProvider, "Mac.VMPCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC", "VMPCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }

    private VMPC() {
    }
}
