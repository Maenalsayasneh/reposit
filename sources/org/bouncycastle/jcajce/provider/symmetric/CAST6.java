package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.b.e;
import s0.a.b.e0.i;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.l;
import s0.a.b.i0.n;

public final class CAST6 {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "CAST6 IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new i();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new s0.a.b.h0.e(new n(new i())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST6", 256, new h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = CAST6.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addGMacAlgorithm(configurableProvider, "CAST6", a.y0(a.Y0(a.Y0(a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.CAST6"), str, "$KeyGen", configurableProvider, "KeyGenerator.CAST6"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.CAST6"), str, "$GMAC"), a.n0(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAST6", a.y0(new StringBuilder(), str, "$Poly1305"), a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new i()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-CAST6", 256, new w());
        }
    }

    private CAST6() {
    }
}
