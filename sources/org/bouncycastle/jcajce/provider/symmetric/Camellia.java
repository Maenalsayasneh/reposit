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
import s0.a.b.e0.k;
import s0.a.b.e0.k0;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.l;
import s0.a.b.i0.c;
import s0.a.b.i0.n;
import s0.a.b.j;

public final class Camellia {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("Camellia");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Camellia IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new s0.a.b.e0.j()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new s0.a.b.e0.j();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new s0.a.b.h0.e(new n(new s0.a.b.e0.j())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", (s0.a.a.n) null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("Camellia", i, new h());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Camellia.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$AlgParams", configurableProvider, "AlgorithmParameters.CAMELLIA");
            s0.a.a.n nVar = s0.a.a.t2.a.a;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", nVar, "CAMELLIA");
            s0.a.a.n nVar2 = s0.a.a.t2.a.b;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", nVar2, "CAMELLIA");
            s0.a.a.n nVar3 = s0.a.a.t2.a.c;
            a.v(a.g1(configurableProvider, "Alg.Alias.AlgorithmParameters", nVar3, "CAMELLIA", str), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar2, "CAMELLIA");
            a.u(a.Y0(a.c1(a.g1(configurableProvider, "Cipher", nVar2, a.y0(a.c1(a.b1(a.g1(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", nVar3, "CAMELLIA", str), "$ECB", configurableProvider, "Cipher.CAMELLIA", str), "$CBC", configurableProvider, "Cipher", nVar), str, "$CBC"), str), "$CBC", configurableProvider, "Cipher", nVar3), str, "$RFC3211Wrap", configurableProvider, "Cipher.CAMELLIARFC3211WRAP"), str, "$Wrap", configurableProvider, "Cipher.CAMELLIAWRAP");
            s0.a.a.n nVar4 = s0.a.a.t2.a.d;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar4, "CAMELLIAWRAP");
            s0.a.a.n nVar5 = s0.a.a.t2.a.e;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar5, "CAMELLIAWRAP");
            s0.a.a.n nVar6 = s0.a.a.t2.a.f;
            a.v(a.g1(configurableProvider, "Alg.Alias.Cipher", nVar6, "CAMELLIAWRAP", str), "$KeyFactory", configurableProvider, "SecretKeyFactory.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar2, "CAMELLIA");
            StringBuilder g1 = a.g1(configurableProvider, "KeyGenerator", nVar3, a.y0(a.c1(a.g1(configurableProvider, "KeyGenerator", nVar, a.y0(a.c1(a.g1(configurableProvider, "KeyGenerator", nVar5, a.y0(a.c1(a.b1(a.g1(configurableProvider, "Alg.Alias.SecretKeyFactory", nVar3, "CAMELLIA", str), "$KeyGen", configurableProvider, "KeyGenerator.CAMELLIA", str), "$KeyGen128", configurableProvider, "KeyGenerator", nVar4), str, "$KeyGen192"), str), "$KeyGen256", configurableProvider, "KeyGenerator", nVar6), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider, "KeyGenerator", nVar2), str, "$KeyGen256"), str);
            g1.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", g1.toString(), a.n0(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", a.y0(new StringBuilder(), str, "$Poly1305"), a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new s0.a.b.e0.j()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new w());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new k0(new s0.a.b.e0.j()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new k());
        }
    }

    private Camellia() {
    }
}
