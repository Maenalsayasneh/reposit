package org.bouncycastle.jcajce.provider.symmetric;

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
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e;
import s0.a.b.e0.h0;
import s0.a.b.e0.i0;
import s0.a.b.h;
import s0.a.b.h0.a;
import s0.a.b.h0.b;
import s0.a.b.i0.c;
import s0.a.b.j;

public final class RC5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("RC5");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "RC5 IV";
        }
    }

    public static class CBC32 extends BaseBlockCipher {
        public CBC32() {
            super((e) new c(new h0()), 64);
        }
    }

    public static class CFB8Mac32 extends BaseMac {
        public CFB8Mac32() {
            super(new b(new h0()));
        }
    }

    public static class ECB32 extends BaseBlockCipher {
        public ECB32() {
            super((e) new h0());
        }
    }

    public static class ECB64 extends BaseBlockCipher {
        public ECB64() {
            super((e) new i0());
        }
    }

    public static class KeyGen32 extends BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new h());
        }
    }

    public static class KeyGen64 extends BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", 256, new h());
        }
    }

    public static class Mac32 extends BaseMac {
        public Mac32() {
            super(new a(new h0()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = RC5.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$ECB32", configurableProvider, "Cipher.RC5");
            i0.d.a.a.a.u(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.f1(configurableProvider, "KeyGenerator.RC5", i0.d.a.a.a.M0(configurableProvider, "Cipher.RC5-64", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Cipher.RC5-32", "RC5", str, "$ECB64"), str, "$KeyGen32"), "Alg.Alias.KeyGenerator.RC5-32", "RC5"), str, "$KeyGen64", configurableProvider, "KeyGenerator.RC5-64"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.RC5"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.RC5-64"), str, "$Mac32", configurableProvider, "Mac.RC5MAC");
            configurableProvider.addAlgorithm("Mac.RC5MAC/CFB8", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Mac.RC5", "RC5MAC", str, "$CFB8Mac32"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }

    private RC5() {
    }
}
