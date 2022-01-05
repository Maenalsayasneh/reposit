package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.b.e;
import s0.a.b.e0.b1;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.l;
import s0.a.b.i0.c;
import s0.a.b.i0.n;

public final class Twofish {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Twofish IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new b1();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new s0.a.b.h0.e(new n(new b1())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Twofish", 256, new h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Twofish.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.Twofish"), str, "$KeyGen", configurableProvider, "KeyGenerator.Twofish"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.Twofish");
            addGMacAlgorithm(configurableProvider, "Twofish", a.y0(a.Y0(a.Y0(a.f1(configurableProvider, "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE"), str, "$PBEWithSHA", configurableProvider, "Cipher.PBEWITHSHAANDTWOFISH-CBC"), str, "$PBEWithSHAKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC"), str, "$GMAC"), a.n0(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "Twofish", a.y0(new StringBuilder(), str, "$Poly1305"), a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class PBEWithSHA extends BaseBlockCipher {
        public PBEWithSHA() {
            super(new c(new b1()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHAKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAKeyFactory() {
            super("PBEwithSHAandTwofish-CBC", (s0.a.a.n) null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new b1()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Twofish", 256, new w());
        }
    }

    private Twofish() {
    }
}
