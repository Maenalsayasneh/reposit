package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e;
import s0.a.b.e0.x0;
import s0.a.b.h;
import s0.a.b.h0.a;
import s0.a.b.h0.b;

public final class Skipjack {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Skipjack IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new x0());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Skipjack", 80, new h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new a(new x0()));
        }
    }

    public static class MacCFB8 extends BaseMac {
        public MacCFB8() {
            super(new b(new x0()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Skipjack.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.SKIPJACK"), str, "$KeyGen", configurableProvider, "KeyGenerator.SKIPJACK"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.SKIPJACK"), str, "$Mac", configurableProvider, "Mac.SKIPJACKMAC");
            configurableProvider.addAlgorithm("Mac.SKIPJACKMAC/CFB8", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC", str, "$MacCFB8"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
        }
    }

    private Skipjack() {
    }
}
