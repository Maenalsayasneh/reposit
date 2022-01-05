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
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.b.e;
import s0.a.b.e0.w0;
import s0.a.b.h;
import s0.a.b.i0.c;
import s0.a.b.j;

public final class Shacal2 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[32];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("Shacal2");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Shacal2 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Shacal2 IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new w0()), 256);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new s0.a.b.h0.c(new w0()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new w0();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SHACAL-2", 128, new h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Shacal2.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$CMAC", configurableProvider, "Mac.Shacal-2CMAC"), str, "$ECB", configurableProvider, "Cipher.Shacal2"), str, "$ECB", configurableProvider, "Cipher.SHACAL-2"), str, "$KeyGen", configurableProvider, "KeyGenerator.Shacal2"), str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.Shacal2"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.Shacal2"), str, "$KeyGen", configurableProvider, "KeyGenerator.SHACAL-2"), str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.SHACAL-2"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.SHACAL-2");
        }
    }

    private Shacal2() {
    }
}
