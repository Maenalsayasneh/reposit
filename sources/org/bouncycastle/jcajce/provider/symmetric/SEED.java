package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.b.e;
import s0.a.b.e0.q0;
import s0.a.b.e0.r0;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.l;
import s0.a.b.i0.c;
import s0.a.b.i0.n;
import s0.a.b.j;

public final class SEED {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("SEED");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "SEED IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new q0()), 128);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new s0.a.b.h0.c(new q0()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new q0();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new s0.a.b.h0.e(new n(new q0())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", (s0.a.a.n) null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = SEED.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$AlgParams", configurableProvider, "AlgorithmParameters.SEED");
            Y0.append("Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar = s0.a.a.p2.a.a;
            a.u(a.c1(a.b1(a.d1(a.b1(a.d1(Y0, nVar, configurableProvider, "SEED", str), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.SEED", "Alg.Alias.AlgorithmParameterGenerator."), nVar, configurableProvider, "SEED", str), "$ECB", configurableProvider, "Cipher.SEED", str), "$CBC", configurableProvider, "Cipher", nVar), str, "$Wrap", configurableProvider, "Cipher.SEEDWRAP");
            s0.a.a.n nVar2 = s0.a.a.p2.a.c;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar2, "SEEDWRAP");
            a.u(a.c1(a.g1(configurableProvider, "KeyGenerator", nVar, a.M0(configurableProvider, "KeyGenerator.SEED", a.M0(configurableProvider, "Alg.Alias.Cipher.SEEDKW", "SEEDWRAP", str, "$KeyGen"), str, "$KeyGen"), str), "$KeyGen", configurableProvider, "KeyGenerator", nVar2), str, "$KeyFactory", configurableProvider, "SecretKeyFactory.SEED");
            StringBuilder g1 = a.g1(configurableProvider, "Alg.Alias.SecretKeyFactory", nVar, "SEED", str);
            g1.append("$CMAC");
            addCMacAlgorithm(configurableProvider, "SEED", g1.toString(), a.n0(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "SEED", a.y0(new StringBuilder(), str, "$GMAC"), a.n0(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "SEED", a.y0(new StringBuilder(), str, "$Poly1305"), a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new q0()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new w());
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new r0());
        }
    }

    private SEED() {
    }
}
