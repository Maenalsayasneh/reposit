package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.b.e;
import s0.a.b.e0.g;
import s0.a.b.h;
import s0.a.b.i0.c;

public final class Blowfish {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Blowfish IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new g()), 64);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new s0.a.b.h0.c(new g()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new g());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Blowfish", 128, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Blowfish.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(sb, str, "$CMAC", configurableProvider, "Mac.BLOWFISHCMAC"), str, "$ECB", configurableProvider, "Cipher.BLOWFISH");
            n nVar = s0.a.a.q2.c.m;
            configurableProvider.addAlgorithm("Cipher", nVar, str + "$CBC");
            a.u(new StringBuilder(), str, "$KeyGen", configurableProvider, "KeyGenerator.BLOWFISH");
            a.v(a.g1(configurableProvider, "Alg.Alias.KeyGenerator", nVar, "BLOWFISH", str), "$AlgParams", configurableProvider, "AlgorithmParameters.BLOWFISH");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", nVar, "BLOWFISH");
        }
    }

    private Blowfish() {
    }
}
